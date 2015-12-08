// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PointF;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.support.v4.app.l;
import android.support.v4.app.o;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.InfoDialogFragment;
import com.skype.android.audio.VoiceStreamControlWrapper;
import com.skype.android.media.CamcorderCallback;
import com.skype.android.media.CameraCallback;
import com.skype.android.util.CheckedBroadcastReceiver;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.TimeAnomalyException;
import com.skype.android.util.TimeAnomalyTelemetry;
import com.skype.android.util.TimeUtil;
import com.skype.android.util.VideoMessageEntitlementPropMap;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.SymbolView;
import java.io.File;
import java.util.List;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment, VideoMessageReviewActivity

public class VideoMessageRecorderActivity extends SkypeActivity
    implements android.media.AudioManager.OnAudioFocusChangeListener, VideoCaptureFragment.Callback, CamcorderCallback, CameraCallback
{
    public class ExternalStorageBroadcastReceiver extends CheckedBroadcastReceiver
    {

        final VideoMessageRecorderActivity this$0;

        public void onReceiveFiltered(Context context, Intent intent, int i)
        {
            checkMediaMounted();
        }

        ExternalStorageBroadcastReceiver()
        {
            this$0 = VideoMessageRecorderActivity.this;
            super(VideoMessageRecorderActivity.STORAGE_ACTIONS);
        }
    }

    private static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a CANCELED;
        public static final a INTERRUPTED;
        public static final a PRERECORD;
        public static final a RECORDING;
        public static final a REVIEW;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/vim/VideoMessageRecorderActivity$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        static 
        {
            PRERECORD = new a("PRERECORD", 0);
            RECORDING = new a("RECORDING", 1);
            REVIEW = new a("REVIEW", 2);
            CANCELED = new a("CANCELED", 3);
            INTERRUPTED = new a("INTERRUPTED", 4);
            $VALUES = (new a[] {
                PRERECORD, RECORDING, REVIEW, CANCELED, INTERRUPTED
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String EXTRA_RECORD_VIDEO_FIRST = "EXTRA_RECORD_VIDEO_FIRST";
    private static final int MAX_RECORD_TIME_SECONDS_DEFAULT = 300;
    private static final int MIN_RECORD_TIME = 2000;
    public static final String STORAGE_ACTIONS[] = {
        "android.intent.action.MEDIA_MOUNTED", "android.intent.action.MEDIA_REMOVED"
    };
    private static final int TIME_DURATION_RESOLUTION = 1000;
    private static final String TIME_START_TEXT = "03:00";
    public static final String VIDEO_URI = "video_uri";
    AccessibilityUtil accessibility;
    Analytics analytics;
    AudioManager audioManager;
    RelativeLayout buttonHolder;
    SymbolView cancelButton;
    ConversationUtil conversationUtil;
    private boolean deleteFileOnRecorded;
    private long duration;
    private ExternalStorageBroadcastReceiver externalStorageReceiver;
    private boolean isVideoMessageRecordFirst;
    SkyLib lib;
    private int maxRecordTimeResolution;
    private int maxRecordTimeSeconds;
    private final PhoneStateListener phoneStateListener = new PhoneStateListener() {

        final VideoMessageRecorderActivity this$0;

        public final void onCallStateChanged(int i, String s)
        {
            if (i != 0)
            {
                moveToState(a.REVIEW);
            }
        }

            
            {
                this$0 = VideoMessageRecorderActivity.this;
                super();
            }
    };
    ImageButton recordButton;
    private long recordStart;
    TextView recordTimeText;
    private a state;
    TelephonyManager telephonyManager;
    TimeAnomalyTelemetry timeAnomalyTelemetry;
    TimeUtil timeUtil;
    private Runnable updateRecordTime;
    private File videoFile;
    private VoiceStreamControlWrapper voiceStreamControlWrapper;

    public VideoMessageRecorderActivity()
    {
        maxRecordTimeSeconds = 300;
        maxRecordTimeResolution = maxRecordTimeSeconds * 1000;
        updateRecordTime = new Runnable() {

            final VideoMessageRecorderActivity this$0;

            public final void run()
            {
                Object obj;
                long l1;
                long l2;
                l1 = SystemClock.elapsedRealtime() - recordStart;
                l2 = (long)maxRecordTimeResolution - l1;
                duration = l1;
                obj = TimeUtil.c(l2);
                recordTimeText.setText(((CharSequence) (obj)));
                if (l2 < 0L) goto _L2; else goto _L1
_L1:
                CharSequence charsequence = timeUtil.a(0x7f0800fd, (int)(l2 / 1000L), false);
                obj = charsequence;
_L4:
                recordTimeText.setContentDescription(((CharSequence) (obj)));
_L2:
                ((View)recordTimeText.getParent()).invalidate();
                if (state == a.RECORDING)
                {
                    recordTimeText.postDelayed(this, l2 % 1000L);
                }
                if (l1 > 2000L)
                {
                    setButtonEnabled(recordButton, true);
                }
                if (l2 <= 0L)
                {
                    moveToState(a.REVIEW);
                }
                return;
                TimeAnomalyException timeanomalyexception;
                timeanomalyexception;
                timeAnomalyTelemetry.a(timeanomalyexception, Long.valueOf(l2), "VideoMessageRecorderActivity#updateRecordTime");
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = VideoMessageRecorderActivity.this;
                super();
            }
        };
        externalStorageReceiver = new ExternalStorageBroadcastReceiver();
    }

    private int adjustOrientationDeviceSpecific(int i)
    {
label0:
        {
            int j = i;
            if ("saturn".equalsIgnoreCase(Build.DEVICE))
            {
                j = i;
                if (getResources().getConfiguration().orientation == 2)
                {
                    i = getWindowManager().getDefaultDisplay().getRotation();
                    if (i != 0 && i != 1)
                    {
                        break label0;
                    }
                    j = 8;
                }
            }
            return j;
        }
        return 0;
    }

    private void cancelRecording()
    {
        log.info("cancel recording");
        if (state == a.RECORDING)
        {
            voiceStreamControlWrapper.releaseOnce();
            telephonyManager.listen(phoneStateListener, 0);
            log.info("released audio focus");
        }
        state = a.CANCELED;
        deleteFileOnRecorded = true;
        finish();
    }

    private void checkMediaMounted()
    {
        String s = Environment.getExternalStorageState();
        if (!"mounted".equals(s) || "mounted_ro".equals(s))
        {
            log.warning("storage is unmounted or is read only");
            setButtonEnabled(recordButton, false);
            InfoDialogFragment infodialogfragment = InfoDialogFragment.create("", getString(0x7f0804b4), getString(0x7f0802f6));
            infodialogfragment.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final VideoMessageRecorderActivity this$0;

                public final void onDismiss(DialogInterface dialoginterface)
                {
                    finish();
                }

            
            {
                this$0 = VideoMessageRecorderActivity.this;
                super();
            }
            });
            infodialogfragment.show(getSupportFragmentManager());
            return;
        } else
        {
            setButtonEnabled(recordButton, true);
            return;
        }
    }

    private void deleteFile(File file)
    {
        if (file != null && !file.delete())
        {
            log.warning((new StringBuilder("Delete video file ")).append(file.getAbsolutePath()).append(" failed").toString());
        }
    }

    private VideoCaptureFragment getCaptureFragment()
    {
        return (VideoCaptureFragment)getSupportFragmentManager().a("capture");
    }

    private File getInterruptedRecording(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle = bundle.getString("video_uri");
            if (bundle != null)
            {
                bundle = new File(Uri.parse(bundle).getPath());
                if (bundle.exists())
                {
                    return bundle;
                }
            }
        }
        return null;
    }

    private void moveToState(a a1)
    {
        if (state == a1) goto _L2; else goto _L1
_L1:
        static final class _cls8
        {

            static final int $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[];

            static 
            {
                $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State = new int[a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[a.PRERECORD.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[a.RECORDING.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[a.REVIEW.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[a.CANCELED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$vim$VideoMessageRecorderActivity$State[a.INTERRUPTED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls8..SwitchMap.com.skype.android.app.vim.VideoMessageRecorderActivity.State[a1.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 81
    //                   2 88
    //                   3 95
    //                   4 102
    //                   5 109;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        log.warning((new StringBuilder("Ignore state ")).append(a1).toString());
_L10:
        state = a1;
_L2:
        return;
_L4:
        startPreview();
        continue; /* Loop/switch isn't completed */
_L5:
        startRecording();
        continue; /* Loop/switch isn't completed */
_L6:
        stopRecording();
        continue; /* Loop/switch isn't completed */
_L7:
        cancelRecording();
        continue; /* Loop/switch isn't completed */
_L8:
        retrievePreview();
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void retrievePreview()
    {
        duration = MediaPlayer.create(this, Uri.fromFile(videoFile)).getDuration();
        reviewRecording();
    }

    private void reviewRecording()
    {
        if (videoFile != null && conversationUtil.a(false).size() == 0)
        {
            Intent intent = new Intent(this, com/skype/android/app/vim/VideoMessageReviewActivity);
            intent.setData(Uri.fromFile(videoFile));
            intent.putExtra("com.skype.vim.duration", duration);
            intent.putExtra("com.skype.vim.filters", getCaptureFragment().getFilterCount());
            if (isVideoMessageRecordFirst)
            {
                setResult(-1, intent);
            } else
            {
                intent.putExtra("com.skype.objId", getIntent().getIntExtra("com.skype.objId", 0));
                startActivity(intent);
            }
            finish();
        }
    }

    private void setButtonEnabled(ImageButton imagebutton, boolean flag)
    {
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        imagebutton.setAlpha(f);
        imagebutton.setEnabled(flag);
    }

    private void showCameraErrorDialog(final String message)
    {
        runOnUiThread(new Runnable() {

            final VideoMessageRecorderActivity this$0;
            final String val$message;

            public final void run()
            {
                InfoDialogFragment infodialogfragment = InfoDialogFragment.create(getString(0x7f0803be), message, getString(0x7f0802f6));
                infodialogfragment.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                    final _cls4 this$1;

                    public final void onDismiss(DialogInterface dialoginterface)
                    {
                        finish();
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
                infodialogfragment.show(getSupportFragmentManager());
            }

            
            {
                this$0 = VideoMessageRecorderActivity.this;
                message = s;
                super();
            }
        });
    }

    private void showCancelDialog()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(0x7f080234);
        builder.setItems(ViewUtil.a(this, new int[] {
            0x7f080169, 0x7f080121
        }), new android.content.DialogInterface.OnClickListener() {

            final VideoMessageRecorderActivity this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    moveToState(a.PRERECORD);
                    return;

                case 1: // '\001'
                    moveToState(a.CANCELED);
                    break;
                }
            }

            
            {
                this$0 = VideoMessageRecorderActivity.this;
                super();
            }
        });
        builder.create().show();
    }

    private void startPreview()
    {
        if (state == a.RECORDING)
        {
            deleteFileOnRecorded = true;
            stopRecording();
            setButtonEnabled(recordButton, true);
            recordTimeText.removeCallbacks(updateRecordTime);
            recordTimeText.setText("03:00");
            recordButton.setBackgroundResource(0x7f020096);
            recordButton.setImageResource(0x7f020241);
        }
    }

    private void startRecording()
    {
        log.info("start recording -requesting audiofocus");
        telephonyManager.listen(phoneStateListener, 32);
        voiceStreamControlWrapper.acquireOnce();
        setButtonEnabled(recordButton, false);
        recordButton.setBackgroundResource(0x7f020099);
        recordButton.setImageResource(0x7f020242);
        recordStart = SystemClock.elapsedRealtime();
        recordTimeText.setVisibility(0);
        recordTimeText.postDelayed(updateRecordTime, 0L);
        getCaptureFragment().moveToState(VideoCaptureFragment.b.RECORDING);
    }

    private void stopRecording()
    {
        log.info("stop recording -releasing audio focus");
        voiceStreamControlWrapper.releaseOnce();
        telephonyManager.listen(phoneStateListener, 0);
        getCaptureFragment().moveToState(VideoCaptureFragment.b.REVIEW);
    }

    public int getRequestedOrientation()
    {
        int j = super.getRequestedOrientation();
        int i = j;
        if (j == -1)
        {
            i = adjustOrientationDeviceSpecific(j);
        }
        return i;
    }

    public void onAudioFocusChange(int i)
    {
        log.finer((new StringBuilder("Ignore audiofocus state:")).append(i).toString());
    }

    public void onBackPressed()
    {
        switch (_cls8..SwitchMap.com.skype.android.app.vim.VideoMessageRecorderActivity.State[state.ordinal()])
        {
        default:
            if (getCaptureFragment() == null || !getCaptureFragment().onInterceptBackButton())
            {
                super.onBackPressed();
            }
            return;

        case 2: // '\002'
            showCancelDialog();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        getComponent().inject(this);
        maxRecordTimeSeconds = (new VideoMessageEntitlementPropMap(lib.getVideoMessagingEntitlement())).b();
        Object obj;
        int i;
        boolean flag;
        if (maxRecordTimeSeconds > 0)
        {
            i = maxRecordTimeSeconds;
        } else
        {
            i = 300;
        }
        maxRecordTimeSeconds = i;
        maxRecordTimeResolution = maxRecordTimeSeconds * 1000;
        voiceStreamControlWrapper = new VoiceStreamControlWrapper(audioManager, this);
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final VideoMessageRecorderActivity this$0;

            public final void onClick(View view)
            {
                onBackPressed();
            }

            
            {
                this$0 = VideoMessageRecorderActivity.this;
                super();
            }
        });
        recordButton.setOnClickListener(new android.view.View.OnClickListener() {

            final VideoMessageRecorderActivity this$0;

            public final void onClick(View view)
            {
                _cls8..SwitchMap.com.skype.android.app.vim.VideoMessageRecorderActivity.State[state.ordinal()];
                JVM INSTR tableswitch 1 2: default 36
            //                           1 37
            //                           2 61;
                   goto _L1 _L2 _L3
_L1:
                return;
_L2:
                if (telephonyManager.getCallState() == 0)
                {
                    moveToState(a.RECORDING);
                    return;
                }
                  goto _L1
_L3:
                moveToState(a.REVIEW);
                return;
            }

            
            {
                this$0 = VideoMessageRecorderActivity.this;
                super();
            }
        });
        moveToState(a.PRERECORD);
        if (accessibility.a() && buttonHolder != null)
        {
            buttonHolder.post(accessibility.a(buttonHolder, false));
            accessibility.a(buttonHolder);
        }
        videoFile = getInterruptedRecording(bundle);
        if (getIntent().getExtras() != null && getIntent().getExtras().getBoolean("EXTRA_RECORD_VIDEO_FIRST", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isVideoMessageRecordFirst = flag;
        bundle = new VideoCaptureFragment();
        obj = new Bundle();
        ((Bundle) (obj)).putInt("maxRecordTime", maxRecordTimeSeconds);
        bundle.setArguments(((Bundle) (obj)));
        obj = getSupportFragmentManager().a();
        ((o) (obj)).a(0x7f10058a, bundle, "capture");
        ((o) (obj)).a();
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onError(int i)
    {
        analytics.c(AnalyticsEvent.v);
        deleteFileOnRecorded = true;
        showCameraErrorDialog(getString(0x7f080389));
    }

    public void onException(Throwable throwable)
    {
        throwable.printStackTrace();
        finish();
    }

    public void onFacesDetected(android.hardware.Camera.Face aface[])
    {
    }

    public void onFileRecorded(File file)
    {
        log.info("recording complete");
        if (deleteFileOnRecorded)
        {
            deleteFileOnRecorded = false;
            deleteFile(file);
        } else
        if (file != null)
        {
            videoFile = file;
            if (state != a.CANCELED)
            {
                reviewRecording();
                return;
            }
        } else
        {
            log.warning("Null file in onRecorded callback");
            return;
        }
    }

    public void onFileRecorded(File file, long l1, int i)
    {
        log.info("recording complete");
        if (deleteFileOnRecorded)
        {
            deleteFileOnRecorded = false;
            deleteFile(file);
        } else
        if (file != null)
        {
            videoFile = file;
            if (state != a.CANCELED)
            {
                reviewRecording();
                return;
            }
        } else
        {
            log.warning("Null file in onRecorded callback");
            return;
        }
    }

    public void onFocusEnd(boolean flag)
    {
    }

    public void onFocusStart(PointF pointf)
    {
    }

    public void onMinimumRecordTimePassed()
    {
    }

    public void onOpenFailed(Exception exception)
    {
        showCameraErrorDialog(exception.getMessage());
    }

    public void onPause()
    {
        if (!Build.MANUFACTURER.contains("Amazon")) goto _L2; else goto _L1
_L1:
        moveToState(a.CANCELED);
_L4:
        super.onPause();
        return;
_L2:
        accessibility.a(false);
        if (state == a.RECORDING)
        {
            moveToState(a.REVIEW);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPictureTaken(com.skype.android.media.CameraCallback.PictureType picturetype, byte abyte0[])
    {
    }

    public void onPreviewStarted(int i)
    {
    }

    public void onProgressUpdate(long l1, long l2)
    {
    }

    public void onRecordCapabilityChange(boolean flag)
    {
    }

    public void onRecordable()
    {
    }

    public void onRecording()
    {
    }

    public void onRecordingPaused()
    {
    }

    public void onRecordingStarted()
    {
        recordButton.setImageResource(0x7f020242);
        recordStart = SystemClock.elapsedRealtime();
        recordTimeText.setVisibility(0);
    }

    public void onRecordingStopped(boolean flag)
    {
        log.info("stop recording -releasing audio focus");
        voiceStreamControlWrapper.releaseOnce();
        telephonyManager.listen(phoneStateListener, 0);
    }

    public void onResume()
    {
        super.onResume();
        accessibility.a(true);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (videoFile != null)
        {
            bundle.putString("video_uri", Uri.fromFile(videoFile).toString());
        }
    }

    public void onShutter()
    {
    }

    public void onStart()
    {
        super.onStart();
        externalStorageReceiver.register(this);
        checkMediaMounted();
        if (videoFile != null)
        {
            moveToState(a.INTERRUPTED);
            return;
        } else
        {
            state = a.PRERECORD;
            recordTimeText.setText("03:00");
            recordTimeText.setContentDescription(getString(0x7f0800fe));
            recordButton.setBackgroundResource(0x7f020096);
            recordButton.setImageResource(0x7f020241);
            return;
        }
    }

    protected void onStop()
    {
        super.onStop();
        unregisterReceiver(externalStorageReceiver);
    }

    public void onStoppable()
    {
    }

    public void setRequestedOrientation(int i)
    {
        super.setRequestedOrientation(i);
    }





/*
    static long access$202(VideoMessageRecorderActivity videomessagerecorderactivity, long l1)
    {
        videomessagerecorderactivity.duration = l1;
        return l1;
    }

*/




}
