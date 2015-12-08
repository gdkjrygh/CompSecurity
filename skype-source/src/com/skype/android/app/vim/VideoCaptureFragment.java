// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.hardware.Camera;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.analytics.AnalyticsParameter;
import com.skype.android.analytics.AnalyticsParameterContainer;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.media.CamcorderCallback;
import com.skype.android.media.CamcorderView;
import com.skype.android.media.CameraCallback;
import com.skype.android.media.GLES20Renderer;
import com.skype.android.media.GLTextureViewWrapper;
import com.skype.android.media.Size;
import com.skype.android.media.effects.DoodleRenderer;
import com.skype.android.media.effects.FaceDecoration;
import com.skype.android.media.effects.FaceDecorationRenderer;
import com.skype.android.media.effects.RobotAudioFilter;
import com.skype.android.util.PropertyAnimationUtil;
import com.skype.android.widget.BadgeDecoratorView;
import com.skype.android.widget.SymbolView;
import java.io.File;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.vim:
//            VideoEffect, FilterRosterView

public class VideoCaptureFragment extends SkypeFragment
    implements android.view.View.OnClickListener, FilterRosterView.FilterRosterEventsListener, CamcorderCallback, CameraCallback
{
    public static interface Callback
    {

        public abstract void onFileRecorded(File file, long l, int i);

        public abstract void onMinimumRecordTimePassed();

        public abstract void onProgressUpdate(long l, long l1);

        public abstract void onRecordCapabilityChange(boolean flag);

        public abstract void onRecordingPaused();

        public abstract void onRecordingStarted();

        public abstract void onRecordingStopped(boolean flag);
    }

    private static final class a extends View
    {

        private Paint paint;
        private PointF touchPoint;

        protected final void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);
            if (touchPoint != null)
            {
                canvas.drawCircle(touchPoint.x, touchPoint.y, 48F, paint);
            }
        }

        public final void setColor(int i)
        {
            paint.setColor(i);
        }

        public final void setTouchPoint(PointF pointf)
        {
            touchPoint = pointf;
        }

        public a(Context context)
        {
            super(context);
            paint = new Paint();
            paint.setColor(-1);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            paint.setStrokeWidth(4F);
            paint.setAlpha(128);
            paint.setAntiAlias(true);
        }
    }

    static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b PAUSED;
        public static final b PRERECORD;
        public static final b RECORDING;
        public static final b REVIEW;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/vim/VideoCaptureFragment$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        static 
        {
            PRERECORD = new b("PRERECORD", 0);
            PAUSED = new b("PAUSED", 1);
            RECORDING = new b("RECORDING", 2);
            REVIEW = new b("REVIEW", 3);
            $VALUES = (new b[] {
                PRERECORD, PAUSED, RECORDING, REVIEW
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    static final String EXTRA_MAX_RECORD_TIME_SECONDS = "maxRecordTime";
    private static final int TIME_DURATION_RESOLUTION = 100;
    private static final Logger log = Logger.getLogger("VideoCaptureFragment");
    Analytics analytics;
    private PropertyAnimationUtil animationUtil;
    private CamcorderView cameraView;
    private VideoEffect currentEffect;
    private boolean deleteFileOnRecorded;
    private android.view.View.OnTouchListener doodleGestureDetector;
    private DoodleRenderer doodleOverlay;
    EcsConfiguration ecsConfiguration;
    private long elapsedTime;
    private FaceDecorationRenderer faceDecorationRenderer;
    private BadgeDecoratorView filterButton;
    private int filterCount;
    private FilterRosterView filterRoster;
    private a focusIndicatorView;
    private int maxRecordTimeSeconds;
    private com.skype.android.media.GLES20Renderer.Overlay overlay;
    private b state;
    private SymbolView switchCameraButton;
    private long tickerTime;
    private Runnable updateRecordProgress;
    UserPreferences userPreferences;
    private boolean wasCancelled;

    public VideoCaptureFragment()
    {
        updateRecordProgress = new Runnable() {

            final VideoCaptureFragment this$0;

            public final void run()
            {
                if (getCallback() != null)
                {
                    long l = SystemClock.elapsedRealtime();
                    long l1 = tickerTime;
                    tickerTime = SystemClock.elapsedRealtime();
                    elapsedTime = elapsedTime + (l - l1);
                    l = maxRecordTimeSeconds * 1000;
                    l1 = elapsedTime;
                    if (state == b.RECORDING)
                    {
                        cameraView.postDelayed(this, 100L);
                        getCallback().onProgressUpdate(elapsedTime, maxRecordTimeSeconds);
                    }
                    if (l - l1 <= 0L)
                    {
                        moveToState(b.REVIEW);
                        return;
                    }
                }
            }

            
            {
                this$0 = VideoCaptureFragment.this;
                super();
            }
        };
    }

    private void addDoodleOverlay()
    {
        doodleOverlay = new DoodleRenderer();
        doodleOverlay.a(cameraView.getWidth(), cameraView.getHeight());
        Object obj = doodleOverlay;
        cameraView.getPreviewSize();
        ((DoodleRenderer) (obj)).c();
        obj = cameraView.getPreviewSurface();
        if ((obj instanceof GLTextureViewWrapper) && doodleOverlay != null)
        {
            ((GLTextureViewWrapper)obj).i().a(doodleOverlay);
        }
    }

    private void applyEffect(VideoEffect videoeffect)
    {
        currentEffect = videoeffect;
        if (areFiltersSupported())
        {
            cameraView.setShaderEffect(videoeffect.getEffect());
            if (videoeffect == VideoEffect.PIXELATE)
            {
                cameraView.a(new RobotAudioFilter());
            }
            if (faceDecorationRenderer != null)
            {
                faceDecorationRenderer.c();
            }
            if (videoeffect.getFaceDecoration() != null)
            {
                setFaceDecoration(videoeffect.getFaceDecoration());
            }
            setOverlayRenderer(videoeffect.createOverlay((GLTextureViewWrapper)cameraView.getPreviewSurface()));
        }
    }

    private boolean areFiltersSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 18 && !TextUtils.isEmpty(ecsConfiguration.getVideoMessageFilters());
    }

    private boolean canEnableCameraButton()
    {
        return Camera.getNumberOfCameras() > 1;
    }

    private void deleteFile(File file)
    {
        if (file != null && !file.delete())
        {
            log.warning((new StringBuilder("Delete video file ")).append(file.getAbsolutePath()).append(" failed").toString());
        }
    }

    private Callback getCallback()
    {
        if (getActivity() instanceof Callback)
        {
            return (Callback)getActivity();
        } else
        {
            return null;
        }
    }

    private int getDefaultCameraFacing()
    {
        return 1;
    }

    private File getRecordingDirectory()
    {
        return getActivity().getCacheDir();
    }

    private void handleCriticalError(Exception exception)
    {
        exception.printStackTrace();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        if (TextUtils.isEmpty(exception.getMessage()))
        {
            builder.setMessage("Could not open camera");
        } else
        {
            builder.setMessage(exception.getMessage());
        }
        builder.setPositiveButton("Ok", new android.content.DialogInterface.OnClickListener() {

            final VideoCaptureFragment this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                if (getActivity() != null)
                {
                    getActivity().finish();
                }
            }

            
            {
                this$0 = VideoCaptureFragment.this;
                super();
            }
        });
        builder.show();
    }

    private boolean hasCamera(int i)
    {
        android.hardware.Camera.CameraInfo camerainfo = new android.hardware.Camera.CameraInfo();
        boolean flag = false;
        int j = 0;
        boolean flag1;
        do
        {
            flag1 = flag;
            if (j >= Camera.getNumberOfCameras())
            {
                break;
            }
            Camera.getCameraInfo(j, camerainfo);
            if (camerainfo.facing == i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (flag)
            {
                break;
            }
            j++;
        } while (true);
        return flag1;
    }

    private void hideFilterRoster()
    {
        if (areFiltersSupported())
        {
            filterRoster.hide();
        }
    }

    private void onCameraDirectionChanged(int i)
    {
        if (currentEffect == VideoEffect.COSTUME)
        {
            setFaceDecoration(currentEffect.getFaceDecoration());
        }
    }

    private void pauseRecording()
    {
        log.info("pause recording");
        cameraView.d();
        getCallback().onRecordingPaused();
        if (state == b.RECORDING && getView() != null)
        {
            getView().setSystemUiVisibility(0);
        }
    }

    private void removeDoodleOverlay()
    {
        com.skype.android.media.SurfaceWrapper surfacewrapper = cameraView.getPreviewSurface();
        if ((surfacewrapper instanceof GLTextureViewWrapper) && doodleOverlay != null)
        {
            ((GLTextureViewWrapper)surfacewrapper).i().b(doodleOverlay);
        }
        doodleOverlay = null;
    }

    private void resumeRecording()
    {
        log.info("resume recording");
        cameraView.e();
        tickerTime = SystemClock.elapsedRealtime();
        cameraView.postDelayed(updateRecordProgress, 100L);
        getCallback().onRecordingStarted();
        if (getView() != null)
        {
            getView().setSystemUiVisibility(1);
        }
    }

    private void sendVideoFilterSelectedEvent(VideoEffect videoeffect)
    {
        AnalyticsParameterContainer analyticsparametercontainer = new AnalyticsParameterContainer();
        analyticsparametercontainer.a(AnalyticsParameter.P, videoeffect.name());
        analyticsparametercontainer.a(AnalyticsParameter.R, state.name());
        analytics.a(AnalyticsEvent.D, analyticsparametercontainer);
    }

    private void startPreview()
    {
        if (state == b.RECORDING || state == b.REVIEW || state == b.PAUSED)
        {
            stopRecording();
            getCallback().onRecordCapabilityChange(true);
            updateControlButtons(true);
        }
        cameraView.setVisibility(0);
    }

    private void startRecording()
    {
        deleteFileOnRecorded = false;
        updateControlButtons(cameraView.a());
        cameraView.setMaxDuration(maxRecordTimeSeconds);
        Object obj = (new StringBuilder("scv_")).append(System.currentTimeMillis()).append(".mp4").toString();
        obj = new File(getRecordingDirectory(), ((String) (obj)));
        cameraView.setRecordingFile(((File) (obj)));
        try
        {
            cameraView.b();
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            handleCriticalError(exception);
        }
        tickerTime = SystemClock.elapsedRealtime();
        cameraView.postDelayed(updateRecordProgress, 100L);
        getCallback().onRecordingStarted();
        if (getView() != null)
        {
            getView().setSystemUiVisibility(1);
        }
        hideFilterRoster();
    }

    private void stopRecording()
    {
        if (wasCancelled)
        {
            elapsedTime = 0L;
        }
        cameraView.c();
_L2:
        if (state == b.RECORDING || state == b.PAUSED)
        {
            getCallback().onRecordingStopped(wasCancelled);
            wasCancelled = false;
            if (getView() != null)
            {
                getView().setSystemUiVisibility(0);
            }
        }
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        if (!deleteFileOnRecorded)
        {
            handleCriticalError(exception);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void switchCamera()
    {
        int i;
        if (cameraView.getCameraFacing() == 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (hasCamera(i))
        {
            cameraView.setCameraFacing(i);
            onCameraDirectionChanged(i);
            log.fine((new StringBuilder("switch camera to ")).append(i).toString());
        }
    }

    private void updateControlButtons(boolean flag)
    {
        if (flag)
        {
            if (areFiltersSupported())
            {
                PropertyAnimationUtil.c(filterButton);
            }
            if (canEnableCameraButton())
            {
                PropertyAnimationUtil.c(switchCameraButton);
                return;
            } else
            {
                switchCameraButton.setVisibility(8);
                return;
            }
        } else
        {
            animationUtil.d(filterButton);
            animationUtil.d(switchCameraButton);
            return;
        }
    }

    public void cancelRecording()
    {
        deleteFileOnRecorded = true;
        wasCancelled = true;
        elapsedTime = 0L;
        moveToState(b.PRERECORD);
    }

    public void enableDoodle(boolean flag)
    {
        if (flag)
        {
            addDoodleOverlay();
            return;
        } else
        {
            removeDoodleOverlay();
            return;
        }
    }

    int getFilterCount()
    {
        return filterCount;
    }

    public b getState()
    {
        return state;
    }

    public boolean isRecording()
    {
        return state == b.RECORDING;
    }

    void moveToState(b b1)
    {
        if (state == b1) goto _L2; else goto _L1
_L1:
        static final class _cls7
        {

            static final int $SwitchMap$com$skype$android$app$vim$VideoCaptureFragment$State[];

            static 
            {
                $SwitchMap$com$skype$android$app$vim$VideoCaptureFragment$State = new int[b.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoCaptureFragment$State[b.PRERECORD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoCaptureFragment$State[b.RECORDING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoCaptureFragment$State[b.PAUSED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoCaptureFragment$State[b.REVIEW.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7..SwitchMap.com.skype.android.app.vim.VideoCaptureFragment.State[b1.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 77
    //                   2 84
    //                   3 108
    //                   4 115;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        log.warning((new StringBuilder("Ignore state ")).append(b1).toString());
_L9:
        state = b1;
_L2:
        return;
_L4:
        startPreview();
        continue; /* Loop/switch isn't completed */
_L5:
        if (state == b.PAUSED)
        {
            resumeRecording();
        } else
        {
            startRecording();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        pauseRecording();
        continue; /* Loop/switch isn't completed */
_L7:
        stopRecording();
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void onClick(View view)
    {
        boolean flag = true;
        switch (view.getId())
        {
        case 2131756428: 
        default:
            return;

        case 2131756427: 
            showFilterRoster(true);
            userPreferences.setVimFiltersAccessed();
            filterButton.setBadgeVisible(false);
            return;

        case 2131756430: 
            switchCamera();
            return;

        case 2131756429: 
            break;
        }
        if (doodleOverlay != null)
        {
            flag = false;
        }
        enableDoodle(flag);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        maxRecordTimeSeconds = getArguments().getInt("maxRecordTime");
        currentEffect = VideoEffect.NORMAL;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030133, viewgroup, false);
    }

    public void onDestroy()
    {
        enableDoodle(false);
        setOverlayRenderer(null);
        cameraView.onDestroy();
        super.onDestroy();
    }

    public void onError(int i)
    {
    }

    public void onException(Throwable throwable)
    {
        throwable.printStackTrace();
    }

    public void onFacesDetected(android.hardware.Camera.Face aface[])
    {
        if (faceDecorationRenderer != null)
        {
            faceDecorationRenderer.a(aface);
        }
    }

    public void onFileRecorded(File file)
    {
        log.info("recording complete");
        if (!deleteFileOnRecorded) goto _L2; else goto _L1
_L1:
        deleteFileOnRecorded = false;
        deleteFile(file);
_L4:
        elapsedTime = 0L;
        return;
_L2:
        if (file != null)
        {
            Callback callback = getCallback();
            if (callback != null)
            {
                callback.onFileRecorded(file, elapsedTime, cameraView.getCameraFacing());
            }
        } else
        {
            log.warning("null file in onFileRecorded callback");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onFilterRosterVisibilityChanged(boolean flag)
    {
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        updateControlButtons(flag);
    }

    public void onFilterSelected(VideoEffect videoeffect)
    {
        if (isRecording() && currentEffect != videoeffect)
        {
            filterCount = filterCount + 1;
        }
        if (videoeffect == VideoEffect.COSTUME)
        {
            currentEffect.setFaceDecoration(null);
        }
        applyEffect(videoeffect);
        sendVideoFilterSelectedEvent(videoeffect);
    }

    public void onFocusEnd(final boolean success)
    {
        focusIndicatorView.post(new Runnable() {

            final VideoCaptureFragment this$0;
            final boolean val$success;

            public final void run()
            {
                a a1 = focusIndicatorView;
                int i;
                if (success)
                {
                    i = 0xff00ff00;
                } else
                {
                    i = 0xffff0000;
                }
                a1.setColor(i);
                focusIndicatorView.invalidate();
                animationUtil.d(focusIndicatorView);
            }

            
            {
                this$0 = VideoCaptureFragment.this;
                success = flag;
                super();
            }
        });
    }

    public void onFocusStart(final PointF point)
    {
        focusIndicatorView.post(new Runnable() {

            final VideoCaptureFragment this$0;
            final PointF val$point;

            public final void run()
            {
                focusIndicatorView.setColor(-1);
                focusIndicatorView.setTouchPoint(point);
                PropertyAnimationUtil _tmp = animationUtil;
                PropertyAnimationUtil.c(focusIndicatorView);
                focusIndicatorView.invalidate();
            }

            
            {
                this$0 = VideoCaptureFragment.this;
                point = pointf;
                super();
            }
        });
    }

    public boolean onInterceptBackButton()
    {
        return filterRoster.onInterceptBackButton();
    }

    public void onOpenFailed(Exception exception)
    {
        handleCriticalError(exception);
    }

    public void onPause()
    {
        enableDoodle(false);
        setOverlayRenderer(null);
        cameraView.onPause();
        cancelRecording();
        super.onPause();
    }

    public void onPictureTaken(com.skype.android.media.CameraCallback.PictureType picturetype, byte abyte0[])
    {
    }

    public void onPreviewStarted(int i)
    {
        applyEffect(currentEffect);
    }

    public void onRecordable()
    {
    }

    public void onRecording()
    {
    }

    public void onResume()
    {
        cameraView.onResume();
        super.onResume();
    }

    public void onShutter()
    {
    }

    public void onStart()
    {
        super.onStart();
        moveToState(b.PRERECORD);
        Object obj = getActivity().getPackageManager();
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            flag = ((PackageManager) (obj)).hasSystemFeature("android.hardware.camera.any");
        } else
        {
            flag = ((PackageManager) (obj)).hasSystemFeature("android.hardware.camera");
        }
        if (!flag)
        {
            obj = getView();
            if (obj != null)
            {
                ((View) (obj)).setVisibility(8);
            }
            updateControlButtons(false);
            return;
        } else
        {
            updateControlButtons(true);
            return;
        }
    }

    public void onStoppable()
    {
        Callback callback = getCallback();
        if (callback != null)
        {
            callback.onMinimumRecordTimePassed();
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        animationUtil = new PropertyAnimationUtil();
        filterButton = (BadgeDecoratorView)view.findViewById(0x7f10058b);
        bundle = filterButton;
        boolean flag;
        if (ecsConfiguration.isVimFiltersBadgeEnabled() && !userPreferences.vimFiltersAccessed())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundle.setBadgeVisible(flag);
        switchCameraButton = (SymbolView)view.findViewById(0x7f10058e);
        bundle = (SymbolView)view.findViewById(0x7f10058d);
        filterRoster = (FilterRosterView)view.findViewById(0x7f1003a6);
        filterRoster.setOnFilterSelectionListener(this);
        if (areFiltersSupported())
        {
            filterRoster.setFilters(ecsConfiguration.getVideoMessageFilters().split(","));
        }
        cameraView = (CamcorderView)view.findViewById(0x7f10058a);
        cameraView.setCameraCallback(this);
        cameraView.setCamcorderCallback(this);
        cameraView.setTouchFocusEnabled(true);
        cameraView.setCameraFacing(getDefaultCameraFacing());
        cameraView.setTargetVideoSize(Size.f);
        cameraView.initialize();
        filterButton.setOnClickListener(this);
        switchCameraButton.setOnClickListener(this);
        bundle.setOnClickListener(this);
        focusIndicatorView = new a(view.getContext());
        cameraView.addView(focusIndicatorView);
        doodleGestureDetector = new android.view.View.OnTouchListener() {

            final VideoCaptureFragment this$0;

            public final boolean onTouch(View view1, MotionEvent motionevent)
            {
                motionevent.getAction();
                JVM INSTR tableswitch 0 2: default 32
            //                           0 34
            //                           1 100
            //                           2 69;
                   goto _L1 _L2 _L3 _L4
_L1:
                return true;
_L2:
                if (doodleOverlay != null)
                {
                    doodleOverlay.a((float)Math.random(), (float)Math.random(), (float)Math.random());
                }
                continue; /* Loop/switch isn't completed */
_L4:
                if (doodleOverlay != null)
                {
                    doodleOverlay.b(motionevent.getX(), motionevent.getY());
                }
                continue; /* Loop/switch isn't completed */
_L3:
                if (doodleOverlay != null)
                {
                    doodleOverlay.d();
                }
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                this$0 = VideoCaptureFragment.this;
                super();
            }
        };
        cameraView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final VideoCaptureFragment this$0;

            public final boolean onTouch(View view1, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 1 && filterRoster.isShown())
                {
                    hideFilterRoster();
                    return true;
                }
                if (doodleOverlay != null)
                {
                    doodleGestureDetector.onTouch(view1, motionevent);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = VideoCaptureFragment.this;
                super();
            }
        });
    }

    public void setFaceDecoration(FaceDecoration facedecoration)
    {
        if (cameraView.getPreviewSurface() instanceof GLTextureViewWrapper)
        {
            faceDecorationRenderer = new FaceDecorationRenderer(cameraView);
            cameraView.setFaceDetectionEnabled(true);
            if (facedecoration == null)
            {
                faceDecorationRenderer.c();
            } else
            if (faceDecorationRenderer.b(facedecoration))
            {
                faceDecorationRenderer.c(facedecoration);
            } else
            {
                currentEffect.setFaceDecoration(facedecoration);
                faceDecorationRenderer.a(facedecoration);
            }
            setOverlayRenderer(faceDecorationRenderer);
        }
    }

    public void setOverlayRenderer(com.skype.android.media.GLES20Renderer.Overlay overlay1)
    {
        if (cameraView.getPreviewSurface() instanceof GLTextureViewWrapper)
        {
            GLTextureViewWrapper gltextureviewwrapper = (GLTextureViewWrapper)cameraView.getPreviewSurface();
            if (overlay != null)
            {
                gltextureviewwrapper.i().b(overlay);
            }
            if (overlay1 != null)
            {
                gltextureviewwrapper.i().a(overlay1);
                overlay = overlay1;
            }
        }
    }

    public void showFilterRoster(boolean flag)
    {
        if (areFiltersSupported())
        {
            filterRoster.show(currentEffect, flag);
        }
    }






/*
    static long access$102(VideoCaptureFragment videocapturefragment, long l)
    {
        videocapturefragment.tickerTime = l;
        return l;
    }

*/




/*
    static long access$202(VideoCaptureFragment videocapturefragment, long l)
    {
        videocapturefragment.elapsedTime = l;
        return l;
    }

*/







}
