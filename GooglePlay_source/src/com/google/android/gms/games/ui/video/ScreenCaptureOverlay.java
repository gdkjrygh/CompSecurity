// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.RectF;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.os.CountDownTimer;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.recorder.util.VideoCapabilities;
import com.google.android.gms.games.util.VideoHandler;
import com.google.android.gms.games.util.VideoUtils;
import com.google.android.gms.games.utils.ServiceSharedPrefs;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            CameraPreviewController, DeviceRotationListener

public final class ScreenCaptureOverlay extends BroadcastReceiver
    implements android.view.View.OnClickListener
{
    private final class AvatarGestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        private int mAvatarGroupInitialX;
        private int mAvatarGroupInitialY;
        android.view.WindowManager.LayoutParams mAvatarGroupParams;
        private int mMaxX;
        private int mMaxY;
        private int mMinX;
        private int mMinY;
        RectF mRectAvatar;
        RectF mRectDismiss;
        private boolean mShouldHideControlsDuringScroll;
        boolean mShouldShowControlsAfterScroll;
        private boolean mShouldShowDismissDuringScroll;
        final ScreenCaptureOverlay this$0;

        public final boolean onDown(MotionEvent motionevent)
        {
            if (mCurrentState == 1 || mCurrentState == 2 || mCurrentState == 3)
            {
                mAvatarGroupParams = (android.view.WindowManager.LayoutParams)mOverlayAvatarGroup.getLayoutParams();
                if (mAvatarGroupParams != null)
                {
                    mAvatarGroupInitialX = mAvatarGroupParams.x;
                    mAvatarGroupInitialY = mAvatarGroupParams.y;
                    motionevent = mDisplayMetrics;
                    if (motionevent != null)
                    {
                        mMinX = mOverlayAvatarGroupPadding;
                        mMaxX = ((DisplayMetrics) (motionevent)).widthPixels - mOverlayAvatarGroup.getWidth() - mOverlayAvatarGroupPadding;
                        mMinY = mOverlayAvatarGroupPadding;
                        mMaxY = ((DisplayMetrics) (motionevent)).heightPixels - mOverlayAvatarGroup.getHeight() - mOverlayAvatarGroupPadding;
                        mShouldShowControlsAfterScroll = false;
                        mShouldHideControlsDuringScroll = true;
                        boolean flag;
                        if (mCurrentState == 1)
                        {
                            flag = true;
                        } else
                        {
                            flag = false;
                        }
                        mShouldShowDismissDuringScroll = flag;
                        return true;
                    }
                }
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            if (mCurrentState != 1 && mCurrentState != 2 && mCurrentState != 3)
            {
                return false;
            }
            int i;
            int j;
            int k;
            int l;
            boolean flag;
            if (mCurrentState == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mShouldShowControlsAfterScroll = flag;
            if (mShouldHideControlsDuringScroll)
            {
                hideControls(false);
                mShouldHideControlsDuringScroll = false;
            }
            if (mShouldShowDismissDuringScroll)
            {
                VideoUtils.assertThreadState(ScreenCaptureOverlay.this);
                mShouldShowDismissDuringScroll = false;
            }
            i = mAvatarGroupInitialX;
            j = (int)(motionevent1.getRawX() - motionevent.getRawX());
            k = mAvatarGroupInitialY;
            l = (int)(motionevent1.getRawY() - motionevent.getRawY());
            mAvatarGroupParams.x = Math.min(Math.max(i + j, mMinX), mMaxX);
            mAvatarGroupParams.y = Math.min(Math.max(k - l, mMinY), mMaxY);
            updateRects();
            ScreenCaptureOverlay.access$2200(ScreenCaptureOverlay.this, mRectAvatar.intersect(mRectDismiss));
            mWindowManager.updateViewLayout(mOverlayAvatarGroup, mAvatarGroupParams);
            return true;
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionevent)
        {
            if (mCurrentState != 1 && mCurrentState != 2 && mCurrentState != 3)
            {
                return false;
            }
            if (areControlsVisible())
            {
                hideControls(true);
            } else
            {
                showControls((android.view.WindowManager.LayoutParams)mOverlayAvatarGroup.getLayoutParams(), true);
                hideControlsDelayed();
            }
            return true;
        }

        final void updateRects()
        {
            mRectAvatar.left = mAvatarGroupParams.x;
            mRectAvatar.right = mAvatarGroupParams.x + mOverlayAvatarGroupSize;
            mRectAvatar.top = mAvatarGroupParams.y;
            mRectAvatar.bottom = mAvatarGroupParams.y + mOverlayAvatarGroupSize;
            int ai[] = new int[2];
            mDismissView.getLocationOnScreen(ai);
            mRectDismiss.left = ai[0];
            mRectDismiss.right = ai[0] + mDismissView.getWidth();
            mRectDismiss.top = mDisplayMetrics.heightPixels - ai[1] - mDismissView.getHeight();
            mRectDismiss.bottom = mDisplayMetrics.heightPixels - ai[1];
        }

        private AvatarGestureListener()
        {
            this$0 = ScreenCaptureOverlay.this;
            super();
            mRectDismiss = new RectF();
            mRectAvatar = new RectF();
        }

        AvatarGestureListener(byte byte0)
        {
            this();
        }
    }

    public static interface CaptureOverlayListener
    {

        public abstract void onDisableMic();

        public abstract void onDismissOverlay();

        public abstract void onEnableMic();

        public abstract void onMissingCamera();

        public abstract void onMissingMic();

        public abstract void onOverlayError$2563266();

        public abstract void onStartClicked();

        public abstract void onStopClicked();
    }

    private static final class Position
    {

        public int x;
        public int y;

        public Position(int i, int j)
        {
            x = i;
            y = j;
        }
    }


    private ImageView mAvatarView;
    private ImageView mCameraControlView;
    public CameraPreviewController mCameraController;
    public String mCameraId;
    public TextureView mCameraView;
    public final BroadcastReceiver mConfigurationChangedReceiver = new BroadcastReceiver() {

        final ScreenCaptureOverlay this$0;

        public final void onReceive(Context context, Intent intent)
        {
            mOverlayHandler.post("ScreenCaptureOverlay", "onConfigurationChanged", new Runnable() {

                final _cls2 this$1;

                public final void run()
                {
                    onConfigurationChanged();
                }

            
            {
                this$1 = _cls2.this;
                super();
            }
            });
        }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                super();
            }
    };
    public final Context mContext;
    private ArrayList mControlViewList;
    private int mCountDownSize;
    private CountDownTimer mCountDownTimer;
    private TextView mCountDownView;
    public int mCurrentState;
    private int mDismissSize;
    private ImageView mDismissView;
    public DisplayMetrics mDisplayMetrics;
    public final String mGameId;
    private final String mGamePackage;
    private final GamesClientContext mGamesContext;
    private final Runnable mHideControlsDelayedRunnable = new Runnable() {

        final ScreenCaptureOverlay this$0;

        public final void run()
        {
            if (mCurrentState == 3)
            {
                hideControls(true);
            }
        }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                super();
            }
    };
    public ArrayList mInProgressRunnableList;
    private boolean mIsCameraEnabled;
    private boolean mIsMicEnabled;
    private final CaptureOverlayListener mListener;
    private ImageView mMicControlView;
    public ViewGroup mOverlayAvatarGroup;
    private int mOverlayAvatarGroupPadding;
    private int mOverlayAvatarGroupSize;
    private int mOverlayAvatarShadowPadding;
    public int mOverlayCameraSize;
    private int mOverlayControlPadding;
    private int mOverlayControlSize;
    public final VideoHandler mOverlayHandler;
    private ImageView mRecordControlView;
    private boolean mStoppedBecauseScreenOff;
    public VideoCapabilities mVideoCapabilities;
    public WindowManager mWindowManager;

    public ScreenCaptureOverlay(GamesClientContext gamesclientcontext, final VideoHandler gestureListener, final CaptureOverlayListener gestureDetector, VideoCapabilities videocapabilities, String s, String s1)
    {
        mDisplayMetrics = new DisplayMetrics();
        mControlViewList = new ArrayList(3);
        mIsMicEnabled = true;
        mIsCameraEnabled = true;
        mStoppedBecauseScreenOff = false;
        mCurrentState = 0;
        mInProgressRunnableList = new ArrayList();
        Preconditions.checkState(PlatformVersion.checkVersion(21));
        mContext = gamesclientcontext.mContext;
        mGamesContext = gamesclientcontext;
        mOverlayHandler = gestureListener;
        mListener = gestureDetector;
        mVideoCapabilities = videocapabilities;
        mGameId = s;
        mGamePackage = s1;
        mWindowManager = (WindowManager)mContext.getSystemService("window");
        gamesclientcontext = mContext.getResources();
        int i = gamesclientcontext.getDimensionPixelSize(0x7f0c027b);
        mOverlayAvatarGroupSize = gamesclientcontext.getDimensionPixelSize(0x7f0c0275);
        mOverlayAvatarShadowPadding = gamesclientcontext.getDimensionPixelSize(0x7f0c0283);
        mOverlayAvatarGroupPadding = gamesclientcontext.getDimensionPixelSize(0x7f0c0282);
        mOverlayCameraSize = gamesclientcontext.getDimensionPixelSize(0x7f0c0274);
        mOverlayControlSize = gamesclientcontext.getDimensionPixelSize(0x7f0c0277);
        mOverlayControlPadding = gamesclientcontext.getDimensionPixelSize(0x7f0c0276);
        mDismissSize = gamesclientcontext.getDimensionPixelSize(0x7f0c027a);
        mCountDownSize = gamesclientcontext.getDimensionPixelSize(0x7f0c0278);
        gamesclientcontext = LayoutInflater.from(mContext);
        mOverlayAvatarGroup = (ViewGroup)gamesclientcontext.inflate(0x7f0400f0, null);
        clipViewToOval(mOverlayAvatarGroup.findViewById(0x7f0d02cd));
        mAvatarView = (ImageView)mOverlayAvatarGroup.findViewById(0x7f0d0069);
        clipViewToOval(mAvatarView);
        mCameraView = (TextureView)mOverlayAvatarGroup.findViewById(0x7f0d02ce);
        clipViewToOval(mCameraView);
        mOverlayAvatarGroup.setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {

            final ScreenCaptureOverlay this$0;

            public final void onSystemUiVisibilityChange(int j)
            {
                mOverlayHandler.post("ScreenCaptureOverlay", "onSystemUiVisibilityChange", j. new Runnable() {

                    final _cls3 this$1;
                    final int val$visibility;

                    public final void run()
                    {
                        onConfigurationChanged(visibility);
                    }

            
            {
                this$1 = final__pcls3;
                visibility = I.this;
                super();
            }
                });
            }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                super();
            }
        });
        gestureListener = new AvatarGestureListener((byte)0);
        gestureDetector = new GestureDetector(mContext, gestureListener);
        mOverlayAvatarGroup.setOnTouchListener(new android.view.View.OnTouchListener() {

            final ScreenCaptureOverlay this$0;
            final GestureDetector val$gestureDetector;
            final AvatarGestureListener val$gestureListener;

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                boolean flag;
                boolean flag1;
                if (mCurrentState == 0)
                {
                    return false;
                }
                flag1 = gestureDetector.onTouchEvent(motionevent);
                flag = flag1;
                if (flag1) goto _L2; else goto _L1
_L1:
                flag = flag1;
                if (motionevent.getAction() != 1) goto _L2; else goto _L3
_L3:
                view = gestureListener;
                if (((AvatarGestureListener) (view))._fld0.mCurrentState != 1 && ((AvatarGestureListener) (view))._fld0.mCurrentState != 2 && ((AvatarGestureListener) (view))._fld0.mCurrentState != 3) goto _L5; else goto _L4
_L4:
                view.updateRects();
                if (((AvatarGestureListener) (view))._fld0.mCurrentState != 1 || !((AvatarGestureListener) (view)).mRectAvatar.intersect(((AvatarGestureListener) (view)).mRectDismiss)) goto _L7; else goto _L6
_L6:
                ((AvatarGestureListener) (view))._fld0.dismissOverlay(true);
                flag = true;
_L2:
                return flag;
_L7:
                motionevent = (android.view.WindowManager.LayoutParams)((AvatarGestureListener) (view))._fld0.mOverlayAvatarGroup.getLayoutParams();
                ((AvatarGestureListener) (view))._fld0.savePosition(((AvatarGestureListener) (view))._fld0.mGameId, ((android.view.WindowManager.LayoutParams) (motionevent)).x, ((android.view.WindowManager.LayoutParams) (motionevent)).y);
                ((AvatarGestureListener) (view))._fld0.hideDismissArea();
                if (((AvatarGestureListener) (view)).mShouldShowControlsAfterScroll)
                {
                    ((AvatarGestureListener) (view))._fld0.showControls(((AvatarGestureListener) (view)).mAvatarGroupParams, true);
                    flag = true;
                    continue; /* Loop/switch isn't completed */
                }
_L5:
                flag = false;
                if (true) goto _L2; else goto _L8
_L8:
            }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                gestureDetector = gesturedetector;
                gestureListener = avatargesturelistener;
                super();
            }
        });
        mMicControlView = createControlView(mContext, i);
        mMicControlView.setOnClickListener(this);
        updateMicControlView();
        mCameraControlView = createControlView(mContext, i);
        mCameraControlView.setOnClickListener(this);
        updateCameraControlView();
        mRecordControlView = createControlView(mContext, i);
        mRecordControlView.setOnClickListener(this);
        updateRecordControlView();
        mControlViewList.add(mRecordControlView);
        mControlViewList.add(mCameraControlView);
        mControlViewList.add(mMicControlView);
        mCountDownView = (TextView)gamesclientcontext.inflate(0x7f0400f1, null);
        mDismissView = (ImageView)gamesclientcontext.inflate(0x7f0400f2, null);
    }

    private boolean areControlsVisible()
    {
        boolean flag1 = false;
        View view = (View)mControlViewList.get(0);
        boolean flag = flag1;
        if (view.getParent() != null)
        {
            flag = flag1;
            if (view.isAttachedToWindow())
            {
                flag = true;
            }
        }
        return flag;
    }

    private void cancelCountdown()
    {
        if (mCountDownTimer != null)
        {
            hideCountdown();
            mCurrentState = 1;
            updateRecordControlView();
        }
    }

    private static void clipViewToOval(View view)
    {
        view.setClipToOutline(true);
        view.setOutlineProvider(new ViewOutlineProvider() {

            public final void getOutline(View view1, Outline outline)
            {
                outline.setOval(0, 0, view1.getWidth(), view1.getHeight());
            }

        });
    }

    private static ImageView createControlView(Context context, int i)
    {
        context = new ImageView(context);
        context.setElevation(i);
        context.setBackgroundResource(0x7f020182);
        return context;
    }

    public static android.view.WindowManager.LayoutParams createWindowLayoutParams(int i)
    {
        android.view.WindowManager.LayoutParams layoutparams = new android.view.WindowManager.LayoutParams();
        layoutparams.width = -2;
        layoutparams.height = -2;
        layoutparams.type = 2002;
        layoutparams.flags = 392;
        layoutparams.format = -3;
        layoutparams.gravity = i;
        layoutparams.windowAnimations = 0x1030002;
        return layoutparams;
    }

    private void hideControls(boolean flag)
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        for (int i = mInProgressRunnableList.size() - 1; i >= 0; i--)
        {
            mOverlayHandler.removeCallbacks((Runnable)mInProgressRunnableList.get(i));
        }

        if (areControlsVisible())
        {
            mOverlayHandler.removeCallbacks(mHideControlsDelayedRunnable);
            int j = 0;
            int k = mControlViewList.size();
            while (j < k) 
            {
                final Object view = (View)mControlViewList.get(j);
                if (((View) (view)).getParent() != null && ((View) (view)).isAttachedToWindow())
                {
                    if (flag)
                    {
                        view = new Runnable() {

                            final ScreenCaptureOverlay this$0;
                            final View val$view;

                            public final void run()
                            {
                                mWindowManager.removeViewImmediate(view);
                                mInProgressRunnableList.remove(this);
                            }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                view = view1;
                super();
            }
                        };
                        mInProgressRunnableList.add(view);
                        mOverlayHandler.postDelayed("ScreenCaptureOverlay", "removeViewImmediate", ((Runnable) (view)), j * 50);
                    } else
                    {
                        mWindowManager.removeViewImmediate(((View) (view)));
                    }
                }
                j++;
            }
        }
    }

    private void hideControlsDelayed()
    {
        mOverlayHandler.removeCallbacks(mHideControlsDelayedRunnable);
        mOverlayHandler.postDelayed("ScreenCaptureOverlay", "mHideControlsDelayedRunnable", mHideControlsDelayedRunnable, 2000L);
    }

    private void hideCountdown()
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        if (mCountDownTimer != null)
        {
            mCountDownTimer.cancel();
            mCountDownTimer = null;
        }
        if (mCountDownView.getParent() != null && mCountDownView.isAttachedToWindow())
        {
            mWindowManager.removeViewImmediate(mCountDownView);
        }
    }

    private void hideDismissArea()
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        VideoUtils.logChatty("ScreenCaptureOverlay", "hideDismissArea called");
        if (mDismissView.getParent() != null)
        {
            mWindowManager.removeViewImmediate(mDismissView);
        }
    }

    private void logAction(int i)
    {
        ClientContext clientcontext = mGamesContext.mClientContext;
        GamesPlayLogger.logVideoUiAction(mGamesContext.mContext, mGamePackage, mGamesContext.mExternalTargetGameId, clientcontext.getResolvedAccountName(), i, hasFrontFacingCamera(), mIsCameraEnabled, mVideoCapabilities.mIsMicSupported, mIsMicEnabled);
    }

    private void onConfigurationChanged(int i)
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        if (mCameraView.getParent() != null && mCameraView.isAttachedToWindow())
        {
            android.view.WindowManager.LayoutParams layoutparams;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            if (i > 0)
            {
                mWindowManager.getDefaultDisplay().getRealMetrics(mDisplayMetrics);
            } else
            {
                mWindowManager.getDefaultDisplay().getMetrics(mDisplayMetrics);
            }
            i = mOverlayAvatarGroupPadding;
            j = mDisplayMetrics.widthPixels;
            k = mOverlayAvatarGroup.getWidth();
            l = mOverlayAvatarGroupPadding;
            i1 = mOverlayAvatarGroupPadding;
            j1 = mDisplayMetrics.heightPixels;
            k1 = mOverlayAvatarGroup.getHeight();
            l1 = mOverlayAvatarGroupPadding;
            layoutparams = (android.view.WindowManager.LayoutParams)mOverlayAvatarGroup.getLayoutParams();
            layoutparams.x = Math.min(Math.max(layoutparams.x, i), j - k - l);
            layoutparams.y = Math.min(Math.max(layoutparams.y, i1), j1 - k1 - l1);
            mWindowManager.updateViewLayout(mOverlayAvatarGroup, layoutparams);
            savePosition(mGameId, layoutparams.x, layoutparams.y);
            if (areControlsVisible())
            {
                hideControls(false);
                showControls(layoutparams, true);
            }
        }
    }

    private void removeOverlayView(boolean flag)
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        if (!flag || mOverlayAvatarGroup.getParent() == null || !mOverlayAvatarGroup.isAttachedToWindow()) goto _L2; else goto _L1
_L1:
        if (mCameraController == null) goto _L4; else goto _L3
_L3:
        CameraPreviewController camerapreviewcontroller;
        camerapreviewcontroller = mCameraController;
        VideoUtils.logChatty("CameraPreviewCtrl", "calling stopCapture");
        Preconditions.checkArgument(camerapreviewcontroller.mIsInitialized, "Camera preview helper must be initialized");
        if (camerapreviewcontroller.mIsCapturing) goto _L6; else goto _L5
_L5:
        GamesLog.d("CameraPreviewCtrl", "Preview capture stop requested while not active.");
_L4:
        mWindowManager.removeViewImmediate(mOverlayAvatarGroup);
_L2:
        return;
_L6:
        camerapreviewcontroller.mRotationListener.disable();
        camerapreviewcontroller.mIsCapturing = false;
        if (camerapreviewcontroller.mCameraCaptureSession == null)
        {
            GamesLog.d("CameraPreviewCtrl", "No capture session available");
        } else
        {
            try
            {
                camerapreviewcontroller.mCameraCaptureSession.stopRepeating();
            }
            catch (CameraAccessException cameraaccessexception)
            {
                GamesLog.e("CameraPreviewCtrl", "Could not disable camera preview capture session", cameraaccessexception);
                if (camerapreviewcontroller.mCallbacksHandler != null)
                {
                    camerapreviewcontroller.mCallbacksHandler.onCameraPreviewError(cameraaccessexception);
                }
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    private void showControls(android.view.WindowManager.LayoutParams layoutparams, boolean flag)
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        if (!areControlsVisible()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        double d4;
        boolean flag1;
        char c;
        int j;
        int k;
        int l;
        j = layoutparams.x + mOverlayAvatarGroupSize / 2 + mOverlayAvatarShadowPadding;
        k = layoutparams.y + mOverlayAvatarGroupSize / 2 + mOverlayAvatarShadowPadding;
        d4 = mOverlayAvatarGroupSize / 2 + mOverlayControlPadding + mOverlayControlSize / 2;
        l = mOverlayControlSize / 2;
        if (j < mDisplayMetrics.widthPixels / 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (k < mDisplayMetrics.heightPixels / 2)
        {
            c = '\001';
        } else
        {
            c = '\0';
        }
        mControlViewList.size();
        JVM INSTR tableswitch 1 4: default 152
    //                   1 175
    //                   2 371
    //                   3 383
    //                   4 393;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        throw new IllegalArgumentException("The numbers of controls must be between 1 and 4.");
_L4:
        double d;
        double d1;
        d1 = 0.78539816339744828D;
        d = 0.0D;
_L12:
        if (!flag1) goto _L9; else goto _L8
_L8:
        double d2;
        double d3;
        d2 = d1;
        d3 = d;
        if (c != 0) goto _L11; else goto _L10
_L10:
        d2 = d1 + 4.7123889803846897D;
        d3 = d;
_L11:
        int i = 0;
        int i1 = mControlViewList.size();
        while (i < i1) 
        {
            layoutparams = createWindowLayoutParams(83);
            layoutparams.width = mOverlayControlSize;
            layoutparams.height = mOverlayControlSize;
            layoutparams.x = (int)((double)j + Math.cos(d2) * d4) - l;
            layoutparams.y = (int)((double)k + Math.sin(d2) * d4) - l;
            layoutparams = new Runnable() {

                final ScreenCaptureOverlay this$0;
                final android.view.WindowManager.LayoutParams val$controlParams;
                final View val$view;

                public final void run()
                {
                    mWindowManager.addView(view, controlParams);
                    mInProgressRunnableList.remove(this);
                }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                view = view1;
                controlParams = layoutparams;
                super();
            }
            };
            mInProgressRunnableList.add(layoutparams);
            VideoHandler videohandler = mOverlayHandler;
            if (flag)
            {
                c = '2';
            } else
            {
                c = '\372';
            }
            videohandler.postDelayed("ScreenCaptureOverlay", "addView", layoutparams, c * i);
            d2 += d3;
            i++;
        }
          goto _L1
_L5:
        d1 = 0.39269908169872414D;
        d = 0.78539816339744828D;
          goto _L12
_L6:
        d1 = 0.0D;
        d = 0.78539816339744828D;
          goto _L12
_L7:
        d1 = 0.0D;
        d = 0.52359877559829882D;
          goto _L12
_L9:
        d3 = -d;
        d = d3;
        if (c == 0) goto _L10; else goto _L13
_L13:
        d2 = 3.1415926535897931D - d1;
          goto _L11
    }

    private void updateRecordControlView()
    {
        ImageView imageview;
        int i;
        if (mCurrentState == 3 || mCurrentState == 2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        imageview = mRecordControlView;
        if (i != 0)
        {
            i = 0x7f020139;
        } else
        {
            i = 0x7f020138;
        }
        imageview.setImageResource(i);
    }

    public final void dismissOverlay(boolean flag)
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        VideoUtils.logChatty("ScreenCaptureOverlay", (new StringBuilder("calling dismissOverlay isUserDismiss=")).append(flag).toString());
        for (int i = mInProgressRunnableList.size() - 1; i >= 0; i--)
        {
            mOverlayHandler.removeCallbacks((Runnable)mInProgressRunnableList.get(i));
        }

        hideControls(false);
        hideCountdown();
        hideDismissArea();
        removeOverlayView(flag);
        logAction(2);
        reset();
        if (flag)
        {
            mListener.onDismissOverlay();
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        removeOverlayView(flag);
    }

    public final Position getSavedPosition(String s)
    {
        Object obj = ServiceSharedPrefs.getScreenCaptureOverlayPos(mContext, s);
        if (obj == null)
        {
            return new Position(mOverlayAvatarGroupPadding, mOverlayAvatarGroupPadding);
        }
        String as[] = ((String) (obj)).split(",");
        try
        {
            as = new Position(Integer.parseInt(as[0]), Integer.parseInt(as[1]));
        }
        catch (NumberFormatException numberformatexception)
        {
            ServiceSharedPrefs.clearScreenCaptureOverlayPos(mContext, s);
            return new Position(mOverlayAvatarGroupPadding, mOverlayAvatarGroupPadding);
        }
        return as;
    }

    public final boolean hasFrontFacingCamera()
    {
        return mVideoCapabilities.mIsCameraSupported && mCameraId != null && mCameraController != null;
    }

    public final void onClick(View view)
    {
        boolean flag5;
        boolean flag6;
        boolean flag7;
        boolean flag8;
        flag5 = false;
        flag7 = true;
        flag8 = true;
        flag6 = true;
        if (view != mMicControlView) goto _L2; else goto _L1
_L1:
        byte byte0;
        boolean flag;
        if (mCurrentState != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        if (mIsMicEnabled)
        {
            byte0 = 8;
        } else
        {
            byte0 = 7;
        }
        logAction(byte0);
        hideControlsDelayed();
        if (mVideoCapabilities.mIsMicSupported) goto _L4; else goto _L3
_L3:
        mListener.onMissingMic();
_L6:
        return;
_L4:
        boolean flag1;
        if (mIsMicEnabled)
        {
            mListener.onDisableMic();
        } else
        {
            mListener.onEnableMic();
        }
        if (!mIsMicEnabled)
        {
            flag1 = flag6;
        } else
        {
            flag1 = false;
        }
        mIsMicEnabled = flag1;
        updateMicControlView();
        return;
_L2:
        if (view == mCameraControlView)
        {
            byte byte1;
            boolean flag2;
            if (mCurrentState != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            Preconditions.checkState(flag2);
            if (mIsMicEnabled)
            {
                byte1 = 6;
            } else
            {
                byte1 = 5;
            }
            logAction(byte1);
            hideControlsDelayed();
            if (!hasFrontFacingCamera())
            {
                mListener.onMissingCamera();
                return;
            }
            if (!mIsCameraEnabled)
            {
                flag2 = flag7;
            } else
            {
                flag2 = false;
            }
            mIsCameraEnabled = flag2;
            updateAvatarViewGroup();
            updateCameraControlView();
            return;
        }
        if (view == mRecordControlView)
        {
            boolean flag3;
            if (mCurrentState != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            Preconditions.checkState(flag3);
            if (mCurrentState == 1)
            {
                if (mCurrentState == 1)
                {
                    flag3 = flag8;
                } else
                {
                    flag3 = false;
                }
                Preconditions.checkState(flag3);
                logAction(3);
                mOverlayHandler.postDelayed(new Runnable() {

                    final ScreenCaptureOverlay this$0;

                    public final void run()
                    {
                        hideControls(true);
                    }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                super();
            }
                }, 500L);
                VideoUtils.assertThreadState(mOverlayHandler);
                view = createWindowLayoutParams(17);
                view.width = mCountDownSize;
                view.height = mCountDownSize;
                view.x = 0;
                view.y = 0;
                mWindowManager.addView(mCountDownView, view);
                mCountDownView.setText(Integer.toString(3));
                mCountDownTimer = new CountDownTimer() {

                    final ScreenCaptureOverlay this$0;

                    public final void onFinish()
                    {
                        hideCountdown();
                        if (mListener != null)
                        {
                            mListener.onStartClicked();
                        }
                        mCurrentState = 3;
                    }

                    public final void onTick(long l)
                    {
                        mCountDownView.setText(Long.toString((999L + l) / 1000L));
                    }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                super(3000L, 500L);
            }
                };
                mCountDownTimer.start();
                mCurrentState = 2;
                updateRecordControlView();
            } else
            if (mCurrentState == 2)
            {
                cancelCountdown();
            } else
            {
                boolean flag4 = flag5;
                if (mCurrentState == 3)
                {
                    flag4 = true;
                }
                Preconditions.checkState(flag4);
                logAction(4);
                mListener.onStopClicked();
                mCurrentState = 1;
                updateRecordControlView();
                hideControls(true);
            }
            hideControlsDelayed();
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onReceive(Context context, Intent intent)
    {
        byte byte0;
        context = intent.getAction();
        byte0 = -1;
        context.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   -2128145023: 61
    //                   823795052: 76;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 60
    //                   0 91
    //                   1 145;
           goto _L4 _L5 _L6
_L4:
        return;
_L2:
        if (context.equals("android.intent.action.SCREEN_OFF"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (context.equals("android.intent.action.USER_PRESENT"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        VideoUtils.logChatty("ScreenCaptureOverlay", (new StringBuilder("Screen turned off; overlay state: ")).append(mCurrentState).toString());
        mStoppedBecauseScreenOff = false;
        mOverlayHandler.post("ScreenCaptureOverlay", "cancelCountdown and stopRecording", new Runnable() {

            final ScreenCaptureOverlay this$0;

            public final void run()
            {
                VideoUtils.logChatty("ScreenCaptureOverlay", "Screen turned on");
                cancelCountdown();
                if (mCurrentState == 3)
                {
                    mStoppedBecauseScreenOff;
                    mCurrentState = 1;
                    updateRecordControlView();
                    hideControls(true);
                    mListener.onStopClicked();
                }
            }

            
            {
                this$0 = ScreenCaptureOverlay.this;
                super();
            }
        });
        return;
_L6:
        VideoUtils.logChatty("ScreenCaptureOverlay", "Screen turned on");
        if (!mStoppedBecauseScreenOff) goto _L4; else goto _L7
_L7:
        mStoppedBecauseScreenOff = false;
        mListener._mth2563266();
        return;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public final void reset()
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        if (mCameraController != null)
        {
            mCameraController.mCallbacksHandler = null;
            mCameraController.cleanup();
            mCameraController = null;
        }
        mContext.unregisterReceiver(mConfigurationChangedReceiver);
        mIsMicEnabled = true;
        mIsCameraEnabled = true;
        mCurrentState = 0;
    }

    public final void savePosition(String s, int i, int j)
    {
        ServiceSharedPrefs.setScreenCaptureOverlayPos(mContext, s, i, j);
    }

    public final void updateAvatarViewGroup()
    {
        if (hasFrontFacingCamera() && mIsCameraEnabled)
        {
            mAvatarView.setVisibility(8);
            mCameraView.setVisibility(0);
            return;
        } else
        {
            mAvatarView.setVisibility(0);
            mCameraView.setVisibility(8);
            return;
        }
    }

    public final void updateCameraControlView()
    {
        int i = 0x7f020132;
        mCameraControlView.setEnabled(true);
        if (hasFrontFacingCamera())
        {
            ImageView imageview = mCameraControlView;
            if (mIsCameraEnabled)
            {
                i = 0x7f020133;
            }
            imageview.setImageResource(i);
            return;
        } else
        {
            mCameraControlView.setImageResource(0x7f020132);
            return;
        }
    }

    public final void updateMicControlView()
    {
        int i = 0x7f020134;
        mMicControlView.setEnabled(true);
        if (mVideoCapabilities.mIsMicSupported)
        {
            ImageView imageview = mMicControlView;
            if (mIsMicEnabled)
            {
                i = 0x7f020135;
            }
            imageview.setImageResource(i);
            return;
        } else
        {
            mMicControlView.setImageResource(0x7f020134);
            return;
        }
    }



/*
    static int access$002(ScreenCaptureOverlay screencaptureoverlay, int i)
    {
        screencaptureoverlay.mCurrentState = i;
        return i;
    }

*/















/*
    static void access$2100(ScreenCaptureOverlay screencaptureoverlay)
    {
        VideoUtils.assertThreadState(screencaptureoverlay.mOverlayHandler);
        VideoUtils.logChatty("ScreenCaptureOverlay", "showDismissArea called");
        if (screencaptureoverlay.mDismissView.getParent() == null)
        {
            android.view.WindowManager.LayoutParams layoutparams = createWindowLayoutParams(17);
            layoutparams.width = screencaptureoverlay.mDismissSize;
            layoutparams.height = screencaptureoverlay.mDismissSize;
            layoutparams.x = 0;
            layoutparams.y = 0;
            screencaptureoverlay.mWindowManager.addView(screencaptureoverlay.mDismissView, layoutparams);
        }
        return;
    }

*/


/*
    static void access$2200(ScreenCaptureOverlay screencaptureoverlay, boolean flag)
    {
        if (screencaptureoverlay.mDismissView.getParent() != null && screencaptureoverlay.mDismissView.isAttachedToWindow())
        {
            ImageView imageview = screencaptureoverlay.mDismissView;
            int i;
            if (flag)
            {
                i = 0x7f020137;
            } else
            {
                i = 0x7f020136;
            }
            imageview.setImageResource(i);
            screencaptureoverlay = screencaptureoverlay.mDismissView;
            if (flag)
            {
                i = 0x7f020186;
            } else
            {
                i = 0x7f020185;
            }
            screencaptureoverlay.setBackgroundResource(i);
        }
        return;
    }

*/







/*
    static boolean access$2802$44fe56bf(ScreenCaptureOverlay screencaptureoverlay)
    {
        screencaptureoverlay.mStoppedBecauseScreenOff = true;
        return true;
    }

*/







/*
    static CameraPreviewController access$702$7d764f8b(ScreenCaptureOverlay screencaptureoverlay)
    {
        screencaptureoverlay.mCameraController = null;
        return null;
    }

*/


/*
    static boolean access$802$44fe56bf(ScreenCaptureOverlay screencaptureoverlay)
    {
        screencaptureoverlay.mIsCameraEnabled = false;
        return false;
    }

*/


    // Unreferenced inner class com/google/android/gms/games/ui/video/ScreenCaptureOverlay$5

/* anonymous class */
    public final class _cls5
        implements CameraPreviewController.CameraPreviewCallbacks
    {

        final ScreenCaptureOverlay this$0;

        public final void onCameraPreviewError(Exception exception)
        {
            GamesLog.e("ScreenCaptureOverlay", "Camera preview failed", exception);
            mListener.onMissingCamera();
            mCameraController.mCallbacksHandler = null;
            mCameraController.cleanup();
            mCameraController;
            mIsCameraEnabled;
            updateAvatarViewGroup();
            updateCameraControlView();
        }

            public 
            {
                this$0 = ScreenCaptureOverlay.this;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/ui/video/ScreenCaptureOverlay$6

/* anonymous class */
    public final class _cls6
        implements Runnable
    {

        final ScreenCaptureOverlay this$0;
        final android.view.WindowManager.LayoutParams val$params;

        public final void run()
        {
            showControls(params, false);
            mInProgressRunnableList.remove(this);
        }

            public 
            {
                this$0 = ScreenCaptureOverlay.this;
                params = layoutparams;
                super();
            }
    }

}
