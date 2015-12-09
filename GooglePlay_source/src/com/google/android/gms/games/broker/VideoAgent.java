// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.Display;
import android.view.TextureView;
import android.view.WindowManager;
import android.widget.Toast;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.recorder.captors.ScreenCaptureController;
import com.google.android.gms.games.recorder.instrumentation.Counter;
import com.google.android.gms.games.recorder.instrumentation.Profiler;
import com.google.android.gms.games.recorder.util.VideoCapabilities;
import com.google.android.gms.games.ui.popup.VideoCapturedPopup;
import com.google.android.gms.games.ui.video.CameraPreviewController;
import com.google.android.gms.games.ui.video.CameraUtils;
import com.google.android.gms.games.ui.video.DeviceRotationListener;
import com.google.android.gms.games.ui.video.ScreenCaptureOverlay;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.gms.games.util.ExperimentUtils;
import com.google.android.gms.games.util.VideoEncodingProfiles;
import com.google.android.gms.games.util.VideoHandler;
import com.google.android.gms.games.util.VideoUtils;
import com.google.android.gms.games.video.VideoConfiguration;
import java.io.File;
import java.io.FileFilter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, GamesClientContext, GamesExperiments

public final class VideoAgent extends Lockable
    implements android.os.Handler.Callback, com.google.android.gms.games.recorder.captors.ScreenCaptureController.CaptureStateCallback, com.google.android.gms.games.ui.video.ScreenCaptureOverlay.CaptureOverlayListener
{
    private final class RecordingSession
    {

        boolean keepRecordingAlive;
        VideoConfiguration mConfiguration;
        final Game mGame;
        public final String mPackageName;
        long mStoppingInitiatedMillis;
        boolean mWarnedAboutTimeRemaining;
        Uri mediaStoreUri;
        Uri outputUri;
        boolean reachedActiveState;
        long startClickInMillis;
        final VideoAgent this$0;
        public boolean wasThirdPartyLaunch;

        final boolean isStopTimeout()
        {
            if (mStoppingInitiatedMillis == 0L)
            {
                mStoppingInitiatedMillis = VideoAgent.getClock().currentTimeMillis();
                return false;
            }
            return VideoAgent.getClock().currentTimeMillis() - mStoppingInitiatedMillis > ((Long)G.videoStoppingTimeoutMillis.get()).longValue();
        }

        final void reset()
        {
            mStoppingInitiatedMillis = 0L;
            keepRecordingAlive = false;
            reachedActiveState = false;
            mWarnedAboutTimeRemaining = false;
            mediaStoreUri = null;
            outputUri = null;
        }

        RecordingSession(String s, Game game, VideoConfiguration videoconfiguration, boolean flag)
        {
            this$0 = VideoAgent.this;
            super();
            mStoppingInitiatedMillis = 0L;
            keepRecordingAlive = false;
            reachedActiveState = false;
            wasThirdPartyLaunch = true;
            startClickInMillis = 0L;
            mPackageName = s;
            mGame = game;
            wasThirdPartyLaunch = flag;
            mConfiguration = videoconfiguration;
            reset();
        }
    }


    private static final IntentFilter BROADCAST_INTENT_FILTER;
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private static final HashSet VALID_STATE_TRANSITIONS;
    private static final Pattern VIDEO_FILENAME_PATTERN = Pattern.compile("\\d*-\\d*-\\d*_\\d*-\\d*-\\d*_[a-zA-Z\\.]+\\.mp4");
    private static int sSessionId = 1;
    private static boolean sShownErrorToast;
    private boolean mCanStopProcessingThread;
    private VideoCapabilities mCapabilities;
    private ScreenCaptureController mCaptureController;
    private GamesClientContext mCurrentContext;
    private VideoHandler mOverlayHandler;
    private HandlerThread mOverlayThread;
    public VideoHandler mProcessingHandler;
    private HandlerThread mProcessingThread;
    public RecordingSession mRecordingSession;
    private boolean mReleaseTimedOut;
    public ScreenCaptureOverlay mVideoRecordingOverlay;
    private int mVideoState;

    public VideoAgent(Lockable lockable)
    {
        super("VideoAgent", LOCK, lockable);
        mVideoState = 1;
        mCurrentContext = null;
        mReleaseTimedOut = false;
        mCanStopProcessingThread = true;
    }

    private static void doDisplayError(GamesClientContext gamesclientcontext, String s, int i, int j, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        if (!sShownErrorToast) goto _L4; else goto _L3
_L3:
        GamesLog.w("VideoAgent", String.format("Not displaying toast for error: %d.", new Object[] {
            Integer.valueOf(j)
        }));
_L23:
        return;
_L4:
        sShownErrorToast = true;
_L2:
        j;
        JVM INSTR lookupswitch 18: default 192
    //                   0: 364
    //                   9000: 280
    //                   9001: 308
    //                   9002: 287
    //                   9003: 294
    //                   9004: 266
    //                   9005: 350
    //                   9006: 259
    //                   9007: 301
    //                   9008: 273
    //                   9009: 315
    //                   9010: 322
    //                   9011: 329
    //                   9012: 336
    //                   9013: 343
    //                   9014: 350
    //                   9015: 350
    //                   9016: 357;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L12 _L12 _L21
_L6:
        break MISSING_BLOCK_LABEL_364;
_L13:
        break; /* Loop/switch isn't completed */
_L5:
        int k = 0x7f1002dc;
_L24:
        if (k >= 0)
        {
            Context context = gamesclientcontext.mContext;
            Resources resources = context.getResources();
            GamesLog.e("VideoAgent", (new StringBuilder("Displaying error for ")).append(j).toString());
            logVideoAction(gamesclientcontext, s, i, j);
            Toast.makeText(context, resources.getString(k), 0).show();
            return;
        }
        if (true) goto _L23; else goto _L22
_L22:
        k = 0x7f1002da;
          goto _L24
_L11:
        k = 0x7f1002e6;
          goto _L24
_L15:
        k = 0x7f1002df;
          goto _L24
_L7:
        k = 0x7f1002e5;
          goto _L24
_L9:
        k = 0x7f1002e0;
          goto _L24
_L10:
        k = 0x7f1002e2;
          goto _L24
_L14:
        k = 0x7f1002e3;
          goto _L24
_L8:
        k = 0x7f1002e4;
          goto _L24
_L16:
        k = 0x7f100303;
          goto _L24
_L17:
        k = 0x7f1002de;
          goto _L24
_L18:
        k = 0x7f1002dd;
          goto _L24
_L19:
        k = 0x7f100304;
          goto _L24
_L20:
        k = 0x7f1002dc;
          goto _L24
_L12:
        k = 0x7f1002db;
          goto _L24
_L21:
        k = 0x7f1002e1;
          goto _L24
        k = -1;
          goto _L24
    }

    private void doRemoveOverlay(boolean flag)
    {
        boolean flag1 = true;
        if (mVideoRecordingOverlay == null)
        {
            flag1 = false;
        }
        VideoUtils.logChatty("VideoAgent", String.format("dismissing ScreenCaptureOverlay - %s", new Object[] {
            Boolean.valueOf(flag1)
        }));
        VideoUtils.assertThreadState(mOverlayHandler);
        if (mVideoRecordingOverlay != null)
        {
            VideoUtils.logChatty("VideoAgent", "Unregistering mScreenEventReceiver");
            mCurrentContext.mContext.unregisterReceiver(mVideoRecordingOverlay);
            if (flag)
            {
                mVideoRecordingOverlay.dismissOverlay(false);
            }
            mVideoRecordingOverlay = null;
        }
    }

    private void doStopScreenCapture(boolean flag)
    {
        VideoUtils.logChatty("VideoAgent", "calling doStopScreenCapture");
        VideoUtils.assertThreadState(mProcessingHandler);
        mProcessingHandler.removeMessages(6);
        if (mVideoState != 3)
        {
            GamesLog.w("VideoAgent", (new StringBuilder("Video stop requested when not active - ")).append(mVideoState).toString());
        }
        if (mVideoState >= 4)
        {
            return;
        }
        setVideoState(4);
        if (mCaptureController != null)
        {
            if (mCaptureController.isReleased())
            {
                setVideoState(5);
            } else
            {
                ScreenCaptureController screencapturecontroller = mCaptureController;
                VideoUtils.logChatty("ScreenCaptureController", "calling stopCapture - posting  doStopCapture on codec handler");
                screencapturecontroller.mCodecHandler.post("ScreenCaptureController", "doStopCapture", new com.google.android.gms.games.recorder.captors.ScreenCaptureController._cls8(screencapturecontroller));
            }
        }
        if (flag)
        {
            removeOverlay();
        }
        sendMessage(mProcessingHandler, 7, 1);
    }

    protected static Clock getClock()
    {
        return DefaultClock.getInstance();
    }

    private static String getMessageIdString(int i)
    {
        switch (i)
        {
        default:
            return "UNDEFINED!";

        case 0: // '\0'
            return "TERMINAL_ERROR";

        case 1: // '\001'
            return "NON_TERMINAL_ERROR";

        case 2: // '\002'
            return "START_CAPTURE";

        case 3: // '\003'
            return "STOP_CAPTURE";

        case 4: // '\004'
            return "UPDATE_OVERLAY_STATE";

        case 5: // '\005'
            return "UPDATE_MIC_STATE";

        case 6: // '\006'
            return "MONITOR_DISK_SPACE";

        case 7: // '\007'
            return "TERMINATING";

        case 8: // '\b'
            return "CAPABILITIES_CHANGED";
        }
    }

    private static int getValidVideoState(int i)
    {
        int j = i;
        switch (i)
        {
        default:
            j = 0;
            // fall through

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return j;
        }
    }

    private static File getVideoDirectory()
    {
        Object obj = Environment.DIRECTORY_MOVIES;
        String s = (String)G.videoOutputDirectory.get();
        obj = new File(Environment.getExternalStoragePublicDirectory(((String) (obj))), s);
        boolean flag;
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            GamesLog.e("VideoAgent", "Could not write to external storage.");
            return null;
        }
        if (!((File) (obj)).exists() && !((File) (obj)).mkdirs())
        {
            GamesLog.e("VideoAgent", "Directory not created");
            return null;
        } else
        {
            return ((File) (obj));
        }
    }

    private static HashMap getVideoMetadata(File file, String s, MediaMetadataRetriever mediametadataretriever)
    {
        String s2 = file.getName();
        String s3 = file.getPath();
        int i = s2.lastIndexOf('_');
        int j = s2.lastIndexOf('.');
        if (i == -1 || j == -1 || i > j)
        {
            GamesLog.e("VideoAgent", (new StringBuilder("Unable to extract package name from filename ")).append(s2).toString());
            return null;
        }
        String s1 = s2.substring(i + 1, j);
        if (s != null && !s1.equals(s))
        {
            GamesLog.d("VideoAgent", (new StringBuilder("Skipping file for different game: ")).append(s1).toString());
            return null;
        }
        long l = file.length();
        long l1 = file.lastModified();
        try
        {
            mediametadataretriever.setDataSource(s3);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            GamesLog.e("VideoAgent", (new StringBuilder("IllegalArgumentException while processing ")).append(s3).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            GamesLog.e("VideoAgent", (new StringBuilder("RuntimeException while processing ")).append(s3).toString());
        }
        s = mediametadataretriever.extractMetadata(9);
        if (s == null)
        {
            GamesLog.e("VideoAgent", (new StringBuilder("Unable to extract duration from ")).append(s2).toString());
            return null;
        } else
        {
            s = Integer.valueOf(Integer.parseInt(s));
            long l2 = s.intValue();
            mediametadataretriever = new HashMap();
            mediametadataretriever.put("duration", s);
            mediametadataretriever.put("filepath", file.getAbsolutePath());
            mediametadataretriever.put("filesize", Long.valueOf(l));
            mediametadataretriever.put("start_time", Long.valueOf(l1 - l2));
            mediametadataretriever.put("package", s1);
            return mediametadataretriever;
        }
    }

    private static boolean hasEnoughDiskSpace(Context context, int i)
    {
        return VideoUtils.getEstimatedTimeRemainingSeconds(context, i) > 0;
    }

    private static void logVideoAction(GamesClientContext gamesclientcontext, String s, int i, int j)
    {
        com.google.android.gms.common.internal.ClientContext clientcontext = gamesclientcontext.mClientContext;
        GamesPlayLogger.logVideoServiceAction(gamesclientcontext.mContext, s, gamesclientcontext.mExternalTargetGameId, AccountUtils.getResolvedAccountName(clientcontext), i, j);
    }

    private void removeOverlay()
    {
        if (mOverlayThread != null && mOverlayThread.isAlive())
        {
            sendMessage(mOverlayHandler, 4, 0);
            return;
        } else
        {
            GamesLog.w("VideoAgent", "Calling removeOverlay after it's already removed");
            return;
        }
    }

    public static void sendMessage(VideoHandler videohandler, int i, int j)
    {
        Message message = Message.obtain();
        message.what = i;
        message.arg2 = j;
        String s = getMessageIdString(i);
        VideoUtils.logChatty("VideoAgent", String.format("Sending message to %s: %s; status/bool: %d", new Object[] {
            videohandler.mName, s, Integer.valueOf(j)
        }));
        videohandler.sendMessage(message);
    }

    private static void sendMessageDelayed(VideoHandler videohandler, int i, int j, long l)
    {
        Message message = Message.obtain();
        message.what = i;
        message.arg2 = j;
        String s = getMessageIdString(i);
        VideoUtils.logChatty("VideoAgent", String.format("Sending message to %s delayed by %d ms: %s; status/bool: %d", new Object[] {
            videohandler.mName, Long.valueOf(l), s, Integer.valueOf(j)
        }));
        videohandler.sendMessageDelayed(message, l);
    }

    private void setVideoState(int i)
    {
        Preconditions.checkNotNull(mCurrentContext);
        Preconditions.checkNotNull(mRecordingSession);
        setVideoState(i, mRecordingSession.mPackageName, mCurrentContext);
    }

    private void setVideoState(int i, String s, GamesClientContext gamesclientcontext)
    {
        int j = getValidVideoState(mVideoState);
        int k = getValidVideoState(i);
        logVideoAction(gamesclientcontext, s, k, 0);
        s = String.format("%d-%d", new Object[] {
            Integer.valueOf(mVideoState), Integer.valueOf(i)
        });
        if (!VALID_STATE_TRANSITIONS.contains(s))
        {
            GamesLog.e("VideoAgent", String.format("Invalid video transition from %d to %d, terminating", new Object[] {
                Integer.valueOf(j), Integer.valueOf(k)
            }));
            if (!isStopping())
            {
                if (mProcessingHandler != null)
                {
                    sendMessage(mProcessingHandler, 0, 9013);
                }
                return;
            }
        }
        VideoUtils.logChatty("VideoAgent", String.format("Transition from state %d to state %d", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k)
        }));
        mVideoState = k;
    }

    public final volatile void acquireLockOnAllChildren()
    {
        super.acquireLockOnAllChildren();
    }

    public final volatile void assertAllChildrenLockedByCurrentThread()
    {
        super.assertAllChildrenLockedByCurrentThread();
    }

    public final volatile void assertLockedByCurrentThread()
    {
        super.assertLockedByCurrentThread();
    }

    public final volatile void assertNoChildrenLockedByCurrentThread()
    {
        super.assertNoChildrenLockedByCurrentThread();
    }

    public final volatile int compareTo(Lockable lockable)
    {
        return super.compareTo(lockable);
    }

    public final volatile void dumpLockInfo(PrintWriter printwriter, String s)
    {
        super.dumpLockInfo(printwriter, s);
    }

    public final boolean handleMessage(Message message)
    {
        Profiler profiler;
        com.google.android.gms.games.recorder.instrumentation.ProfileScope profilescope;
        int i;
        int j;
        i = message.arg2;
        j = message.what;
        message = getMessageIdString(j);
        profiler = Profiler.getInstance();
        profilescope = profiler.startTiming(message);
        VideoUtils.logChatty("VideoAgent", String.format("Receiving message %s(%d) with statusOrBool %d", new Object[] {
            message, Integer.valueOf(j), Integer.valueOf(i)
        }));
        j;
        JVM INSTR tableswitch 0 8: default 3148
    //                   0 152
    //                   1 187
    //                   2 1584
    //                   3 3351
    //                   4 2488
    //                   5 3380
    //                   6 2315
    //                   7 221
    //                   8 2258;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        GamesLog.d("VideoAgent", String.format("Unhandled message %s", new Object[] {
            Integer.valueOf(j)
        }));
        profiler.stopTiming(profilescope);
        return false;
_L2:
        doStopScreenCapture(true);
        doDisplayError(mCurrentContext, mRecordingSession.mPackageName, mVideoState, i, true);
_L11:
        profiler.stopTiming(profilescope);
        return true;
_L3:
        doDisplayError(mCurrentContext, mRecordingSession.mPackageName, mVideoState, i, false);
          goto _L11
        message;
        profiler.stopTiming(profilescope);
        throw message;
_L9:
        Object obj4;
        final int recordingSessionId;
        VideoUtils.logChatty("VideoAgent", "doTerminate");
        VideoUtils.assertThreadState(mProcessingHandler);
        obj4 = mCurrentContext;
        recordingSessionId = sSessionId;
        boolean flag;
        message = null;
        flag = false;
        if (mRecordingSession == null) goto _L13; else goto _L12
_L12:
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        j = mRecordingSession.mConfiguration.mCaptureMode;
        obj3 = mRecordingSession.mGame;
        obj2 = mRecordingSession.mediaStoreUri;
        obj1 = mRecordingSession.outputUri;
        message = mRecordingSession.mPackageName;
        flag = mRecordingSession.reachedActiveState;
        obj = mRecordingSession.mConfiguration;
_L72:
        if (mRecordingSession == null) goto _L15; else goto _L14
_L14:
        boolean flag2;
        flag2 = mRecordingSession.keepRecordingAlive;
        VideoUtils.logChatty("VideoAgent", (new StringBuilder("calling attemptToRelease, mKeepRecordingAlive=")).append(flag2).toString());
        if (mVideoState <= 1 || mVideoState >= 4) goto _L17; else goto _L16
_L16:
        GamesLog.e("VideoAgent", (new StringBuilder("attemptToRelease - in an invalid state: ")).append(mVideoState).toString());
        sendMessage(mProcessingHandler, 3, 1);
        i = 1;
          goto _L18
_L73:
        GamesLog.e("VideoAgent", (new StringBuilder("Unknown ReleasingState: ")).append(i).toString());
          goto _L11
_L17:
        if (flag2) goto _L20; else goto _L19
_L19:
        if (mVideoRecordingOverlay == null) goto _L22; else goto _L21
_L21:
        VideoUtils.logChatty("VideoAgent", "attemptToRelease - overlay is not finished");
        i = 2;
          goto _L18
_L22:
        if (mOverlayThread != null && mOverlayThread.isAlive())
        {
            mOverlayHandler.removeCallbacksAndMessages(null);
            mOverlayThread.quitSafely();
            mOverlayThread = null;
            mOverlayHandler = null;
        }
_L20:
        if (mVideoState >= 5 || !isRecording()) goto _L24; else goto _L23
_L23:
        VideoUtils.logChatty("VideoAgent", "attemptToRelease - waiting for capture to stop");
        i = 3;
          goto _L18
_L24:
        if (mCaptureController == null) goto _L26; else goto _L25
_L25:
        if (mCaptureController.isReleased()) goto _L28; else goto _L27
_L27:
        if (mVideoState != 6)
        {
            setVideoState(6);
            ScreenCaptureController screencapturecontroller = mCaptureController;
            VideoUtils.logChatty("ScreenCaptureController", "calling reset - posting resetAll on codec handler");
            screencapturecontroller.mCodecHandler.post("ScreenCaptureController", "resetAll", new com.google.android.gms.games.recorder.captors.ScreenCaptureController._cls10(screencapturecontroller));
        }
        VideoUtils.logChatty("VideoAgent", "attemptToRelease - capture controller is not finished");
        i = 4;
          goto _L18
_L28:
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_750;
        }
        Object obj5;
        Object obj6;
        obj5 = mCaptureController;
        obj6 = Thread.currentThread().getName();
        float f;
        float f1;
        float f2;
        float f3;
        float f4;
        float f5;
        Counter counter;
        int k;
        int l;
        int i1;
        long l1;
        boolean flag1;
        if (!"CodecThread".equals(obj6))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "Running on the wrong thread");
        if (!"MicThread".equals(obj6))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkState(flag1, "Running on the wrong thread");
        VideoUtils.logChatty("ScreenCaptureController", "Quiting mic thread");
        ((ScreenCaptureController) (obj5)).mMicHandler.removeCallbacksAndMessages(null);
        ((ScreenCaptureController) (obj5)).mMicThread.quit();
        VideoUtils.logChatty("ScreenCaptureController", "Quiting codec thread");
        ((ScreenCaptureController) (obj5)).mCodecHandler.removeCallbacksAndMessages(null);
        ((ScreenCaptureController) (obj5)).mCodecThread.quit();
        mCaptureController = null;
        if (mVideoState < 6 && isRecording())
        {
            setVideoState(6);
        }
_L26:
        mRecordingSession.reset();
        mReleaseTimedOut = false;
        if (flag2) goto _L15; else goto _L29
_L29:
        (new Handler()).postDelayed(new Runnable() {

            final VideoAgent this$0;

            public final void run()
            {
                if (mCanStopProcessingThread && mProcessingHandler != null)
                {
                    VideoUtils.logChatty("VideoAgent", "Stopping mProcessingThread");
                    mProcessingHandler.removeCallbacksAndMessages(null);
                    mProcessingThread.getLooper().quitSafely();
                    mProcessingThread;
                    mProcessingHandler;
                }
            }

            
            {
                this$0 = VideoAgent.this;
                super();
            }
        }, ((Long)G.videoProcessingThreadDelayMillis.get()).longValue());
        mRecordingSession = null;
        mCapabilities = null;
        mCurrentContext = null;
          goto _L15
_L74:
        if (!isRecording()) goto _L11; else goto _L30
_L30:
        obj5 = new com.google.android.gms.games.ui.popup.VideoCapturedPopup.VideoCapturedPopupClickListener() {

            final VideoAgent this$0;
            final int val$recordingSessionId;

            public final void onVideoCapturedPopupClicked()
            {
                if (mProcessingHandler == null)
                {
                    GamesLog.w("VideoAgent", "Not stopping capture - processing handler null on video capture popup click");
                } else
                {
                    if (recordingSessionId != VideoAgent.sSessionId)
                    {
                        GamesLog.w("VideoAgent", String.format("Not stopping capture - sSessionId(%d)  doesn't match recordingSessionId(%d)", new Object[] {
                            Integer.valueOf(VideoAgent.sSessionId), Integer.valueOf(recordingSessionId)
                        }));
                        return;
                    }
                    if (mOverlayHandler != null)
                    {
                        removeOverlay();
                    }
                    if (mVideoState == 1 || !isStopping())
                    {
                        VideoAgent.sendMessage(mProcessingHandler, 7);
                        return;
                    }
                }
            }

            
            {
                this$0 = VideoAgent.this;
                recordingSessionId = i;
                super();
            }
        };
        if (!flag) goto _L32; else goto _L31
_L31:
        i = mVideoState;
        j;
        JVM INSTR tableswitch 0 0: default 3209
    //                   0 948;
           goto _L32 _L33
_L32:
        setVideoState(1, message, ((GamesClientContext) (obj4)));
        obj6 = Profiler.getInstance();
        if (!((Profiler) (obj6)).mIsEnabled) goto _L11; else goto _L34
_L34:
        ((Profiler) (obj6)).stopTiming(((Profiler) (obj6)).mGlobalProfileScope);
        ((Profiler) (obj6)).printResults();
        if (!((Profiler) (obj6)).mLogToPlayLogEnabled) goto _L11; else goto _L35
_L35:
        if (obj4 != null)
        {
            break MISSING_BLOCK_LABEL_1078;
        }
        GamesLog.e("VideoAgent", "endProfiling gamesContext is null");
          goto _L11
_L33:
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_968;
        }
        doDisplayError(((GamesClientContext) (obj4)), message, i, 9003, true);
          goto _L32
        ((GamesClientContext) (obj4)).mContext.grantUriPermission("com.google.android.play.games", ((Uri) (obj2)), 1);
        VideoUtils.logChatty("VideoAgent", "showCompletionPopup");
        obj6 = new Bundle();
        ((Bundle) (obj6)).putInt("popupLocationInfo.gravity", 0);
        ((Bundle) (obj6)).putInt("popupLocationInfo.displayId", -1);
        obj6 = new com.google.android.gms.games.internal.PopupManager.PopupLocationInfo(((Bundle) (obj6)), new Binder());
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.games.GAME", ((android.os.Parcelable) (obj3)));
        bundle.putParcelable("com.google.android.gms.games.VIDEO_URI", ((android.os.Parcelable) (obj2)));
        VideoCapturedPopup.show(((GamesClientContext) (obj4)), ((com.google.android.gms.games.internal.PopupManager.PopupLocationInfo) (obj6)), bundle, ((com.google.android.gms.games.ui.popup.VideoCapturedPopup.VideoCapturedPopupClickListener) (obj5)));
          goto _L32
        obj2 = ((GamesClientContext) (obj4)).mContext;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_1101;
        }
        GamesLog.e("VideoAgent", "endProfiling videoConfiguration is null");
          goto _L11
        i = ((VideoConfiguration) (obj)).mQualityLevel;
        obj5 = VideoEncodingProfiles.getInstance(((Context) (obj2)));
        obj3 = ((VideoEncodingProfiles) (obj5)).getVideoFormat(i, true);
        obj5 = ((VideoEncodingProfiles) (obj5)).getAudioFormat$11e6a031();
        counter = ((Profiler) (obj6)).getCounter("handled_input_capture_frames");
        obj6 = ((Profiler) (obj6)).getCounter("copied_output_video_frames");
        f = 0.0F;
        f5 = 0.0F;
        f3 = 0.0F;
        f1 = f5;
        f2 = f3;
        if (counter == null)
        {
            break MISSING_BLOCK_LABEL_1259;
        }
        l1 = counter.getElapsedTime();
        f4 = (float)l1 / 1000F;
        f = f4;
        f1 = f5;
        f2 = f3;
        if ((float)l1 <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_1259;
        }
        f5 = ((float)counter.getCount() * 1000F) / (float)l1;
        f = f4;
        f1 = f5;
        f2 = f3;
        if (obj6 == null)
        {
            break MISSING_BLOCK_LABEL_1259;
        }
        f2 = ((float)((Counter) (obj6)).getCount() * 1000F) / (float)l1;
        f1 = f5;
        f = f4;
        obj6 = ((GamesClientContext) (obj4)).mClientContext;
        obj4 = ((GamesClientContext) (obj4)).mExternalTargetGameId;
        obj6 = AccountUtils.getResolvedAccountName(((com.google.android.gms.common.internal.ClientContext) (obj6)));
        i = ((MediaFormat) (obj3)).getInteger("width");
        j = ((MediaFormat) (obj3)).getInteger("height");
        recordingSessionId = ((MediaFormat) (obj3)).getInteger("bitrate");
        k = ((MediaFormat) (obj5)).getInteger("channel-count");
        l = ((MediaFormat) (obj5)).getInteger("sample-rate");
        i1 = ((MediaFormat) (obj5)).getInteger("bitrate");
        if (((VideoConfiguration) (obj)).mCaptureMode != 0 || obj1 == null) goto _L37; else goto _L36
_L36:
        l1 = (new File(((Uri) (obj1)).getPath())).length();
_L76:
        GamesPlayLogger.logVideoProfilingStats(((Context) (obj2)), message, ((String) (obj4)), ((String) (obj6)), f, f1, f2, i, j, recordingSessionId, k, l, i1, l1);
        if (VideoUtils.DBG)
        {
            GamesLog.v("VideoAgent", String.format("GamesPlayLogger.logVideoProfilingStats(%s, %s, %s, %f, %f, %f, %d, %d, %d, %d, %d, %d, %d)", new Object[] {
                message, obj4, obj6, Float.valueOf(f), Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(recordingSessionId), Integer.valueOf(k), 
                Integer.valueOf(l), Integer.valueOf(i1), Long.valueOf(l1)
            }));
        }
          goto _L11
_L75:
label0:
        {
            if (!mRecordingSession.isStopTimeout())
            {
                break label0;
            }
            GamesLog.e("VideoAgent", "Failed to release video resources");
            sendMessage(mProcessingHandler, 1, 9016);
            setVideoState(1);
        }
          goto _L11
        sendMessageDelayed(mProcessingHandler, 7, 1, ((Long)G.videoStoppingIntervalMillis.get()).longValue());
          goto _L11
_L4:
        VideoUtils.logChatty("VideoAgent", "calling doStartScreenCapture");
        VideoUtils.assertThreadState(mProcessingHandler);
        mReleaseTimedOut = false;
        mCanStopProcessingThread = false;
        obj1 = mRecordingSession;
        obj1.reachedActiveState = false;
        obj1.mWarnedAboutTimeRemaining = false;
        obj1.mStoppingInitiatedMillis = 0L;
        obj1.mediaStoreUri = null;
        obj1.outputUri = null;
        obj = ((RecordingSession) (obj1)).mPackageName;
        message = getVideoDirectory();
        if (message != null) goto _L39; else goto _L38
_L38:
        message = null;
_L45:
        i = ((RecordingSession) (obj1)).mConfiguration.mCaptureMode;
        obj2 = ((RecordingSession) (obj1)).mConfiguration.mStreamKey;
        flag = ((RecordingSession) (obj1))._fld0.mCapabilities.mIsMicSupported;
        flag1 = ((RecordingSession) (obj1))._fld0.mCapabilities.mIsCameraSupported;
        obj = ((RecordingSession) (obj1)).mConfiguration;
        if (((VideoConfiguration) (obj)).mCaptureMode == 1 && ((VideoConfiguration) (obj)).mStreamKey != null && ((VideoConfiguration) (obj)).mStreamUrl != null) goto _L41; else goto _L40
_L46:
        if (!((RecordingSession) (obj1))._fld0.isRecording()) goto _L43; else goto _L42
_L42:
        GamesLog.e("VideoAgent", "Start screen capture requested when already active");
        i = 9006;
          goto _L44
_L82:
        sendMessage(mProcessingHandler, j, i);
          goto _L11
_L39:
        obj = String.format("%s_%s.mp4", new Object[] {
            DATE_FORMAT.format(Calendar.getInstance().getTime()), obj
        });
        GamesLog.d("VideoAgent", String.format("Using output directory '%s' and filename '%s'", new Object[] {
            message, obj
        }));
        message = new File(message, ((String) (obj)));
          goto _L45
_L41:
        obj = (new StringBuilder()).append(((VideoConfiguration) (obj)).mStreamUrl).append("/").append(((VideoConfiguration) (obj)).mStreamKey).toString();
          goto _L46
_L43:
        ((RecordingSession) (obj1))._fld0.mCapabilities.refresh();
        j = ((RecordingSession) (obj1)).mConfiguration.mQualityLevel;
        obj3 = ((RecordingSession) (obj1))._fld0.mCapabilities;
        Preconditions.checkState(VideoConfiguration.isValidQualityLevel(j));
        if (!((VideoCapabilities) (obj3)).mQualityLevels[j]) goto _L48; else goto _L47
_L47:
        obj3 = ((RecordingSession) (obj1))._fld0.mCapabilities;
        Preconditions.checkState(VideoConfiguration.isValidCaptureMode(i));
        if (((VideoCapabilities) (obj3)).mCaptureModes[i]) goto _L49; else goto _L48
_L49:
        if (flag != ((RecordingSession) (obj1))._fld0.mCapabilities.mIsMicSupported || flag1 != ((RecordingSession) (obj1))._fld0.mCapabilities.mIsCameraSupported)
        {
            sendMessage(((RecordingSession) (obj1))._fld0.mProcessingHandler, 8, 0);
        }
          goto _L50
_L191:
        GamesLog.e("VideoAgent", "Unknown capture mode");
        i = 9001;
          goto _L44
_L192:
        if (message == null) goto _L52; else goto _L51
_L51:
        if (((RecordingSession) (obj1))._fld0.mCapabilities.mIsWriteSupported) goto _L53; else goto _L52
_L193:
        if (!TextUtils.isEmpty(((CharSequence) (obj2))) && !TextUtils.isEmpty(((CharSequence) (obj)))) goto _L53; else goto _L54
_L53:
        if (hasEnoughDiskSpace(((RecordingSession) (obj1))._fld0.mCurrentContext.mContext, ((RecordingSession) (obj1)).mConfiguration.mQualityLevel)) goto _L56; else goto _L55
_L55:
        i = 9009;
          goto _L44
_L194:
        Assert.fail("Unknown capture mode was not caught.");
          goto _L57
_L195:
        obj1.outputUri = Uri.fromFile(message);
          goto _L57
_L196:
        obj1.outputUri = Uri.parse(((String) (obj)));
          goto _L57
_L78:
        setVideoState(2);
        sSessionId++;
        obj1 = mRecordingSession.mConfiguration;
        message = mCaptureController;
        i = ((VideoConfiguration) (obj1)).mQualityLevel;
        obj = mRecordingSession.outputUri;
        obj1 = ((VideoConfiguration) (obj1)).mStreamKey;
        ((ScreenCaptureController) (message)).mCodecHandler.post("ScreenCaptureController", "doStartCapture", new com.google.android.gms.games.recorder.captors.ScreenCaptureController._cls7(message, i, ((Uri) (obj)), ((String) (obj1))));
        sendMessageDelayed(mProcessingHandler, 6, 0, ((Integer)G.videoCheckTimeRemainingIntervalMillis.get()).intValue());
          goto _L11
_L197:
        doStopScreenCapture(flag);
          goto _L11
_L10:
        VideoUtils.logChatty("VideoAgent", "calling doUpdateCapabilities");
        VideoUtils.assertThreadState(mOverlayHandler);
        Preconditions.checkNotNull(mVideoRecordingOverlay);
        message = mVideoRecordingOverlay;
        message.mVideoCapabilities = (VideoCapabilities)Preconditions.checkNotNull(mCapabilities);
        message.updateAvatarViewGroup();
        message.updateCameraControlView();
        message.updateMicControlView();
          goto _L11
_L8:
        VideoUtils.logChatty("VideoAgent", "Running disk space check");
        VideoUtils.assertThreadState(mProcessingHandler);
        Preconditions.checkNotNull(mRecordingSession, "Video context must be defined");
        message = mCurrentContext.mContext;
        j = VideoUtils.getEstimatedTimeRemainingSeconds(message, mRecordingSession.mConfiguration.mQualityLevel);
        obj = mRecordingSession;
        if ((long)j >= (long)((Integer)G.videoWarnAtTimeRemainingSeconds.get()).intValue() || ((RecordingSession) (obj)).mWarnedAboutTimeRemaining) goto _L59; else goto _L58
_L58:
        obj.mWarnedAboutTimeRemaining = true;
        i = 1;
_L198:
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_2443;
        }
        Toast.makeText(message, message.getResources().getString(0x7f1002e7, new Object[] {
            Integer.valueOf(j)
        }), 1).show();
        if (j > 0)
        {
            break MISSING_BLOCK_LABEL_2462;
        }
        sendMessage(mProcessingHandler, 0, 9009);
          goto _L11
        sendMessageDelayed(mProcessingHandler, 6, 0, ((Integer)G.videoCheckTimeRemainingIntervalMillis.get()).intValue());
          goto _L11
_L6:
        if (i != 1) goto _L61; else goto _L60
_L60:
        VideoUtils.logChatty("VideoAgent", "initializing ScreenCaptureOverlay");
        VideoUtils.assertThreadState(mOverlayHandler);
        if (mVideoRecordingOverlay == null)
        {
            mVideoRecordingOverlay = new ScreenCaptureOverlay(mCurrentContext, mOverlayHandler, this, mCapabilities, mRecordingSession.mGame.getApplicationId(), mRecordingSession.mPackageName);
            VideoUtils.logChatty("VideoAgent", "Registering mScreenEventReceiver");
            mCurrentContext.mContext.registerReceiver(mVideoRecordingOverlay, BROADCAST_INTENT_FILTER);
        }
        obj = mVideoRecordingOverlay;
        VideoUtils.assertThreadState(((ScreenCaptureOverlay) (obj)).mOverlayHandler);
        if (((ScreenCaptureOverlay) (obj)).mCurrentState != 0)
        {
            ((ScreenCaptureOverlay) (obj)).reset();
        }
        if (!((ScreenCaptureOverlay) (obj)).mVideoCapabilities.mIsCameraSupported) goto _L63; else goto _L62
_L62:
        message = CameraUtils.getFrontFacingCameraId(((ScreenCaptureOverlay) (obj)).mContext);
_L199:
        obj.mCameraId = message;
        if (((ScreenCaptureOverlay) (obj)).mCameraId == null) goto _L65; else goto _L64
_L64:
        obj.mCameraController = new CameraPreviewController(((ScreenCaptureOverlay) (obj)).mContext, ((ScreenCaptureOverlay) (obj)).mCameraId, ((ScreenCaptureOverlay) (obj)).mOverlayCameraSize, ((ScreenCaptureOverlay) (obj)).mCameraView, ((ScreenCaptureOverlay) (obj)).mOverlayHandler);
        if (!((ScreenCaptureOverlay) (obj)).mCameraController.initialize()) goto _L67; else goto _L66
_L66:
        ((ScreenCaptureOverlay) (obj)).mCameraController.mCallbacksHandler = new com.google.android.gms.games.ui.video.ScreenCaptureOverlay._cls5(((ScreenCaptureOverlay) (obj)));
_L65:
        ((ScreenCaptureOverlay) (obj)).mContext.registerReceiver(((ScreenCaptureOverlay) (obj)).mConfigurationChangedReceiver, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
        ((ScreenCaptureOverlay) (obj)).mWindowManager.getDefaultDisplay().getMetrics(((ScreenCaptureOverlay) (obj)).mDisplayMetrics);
        ((ScreenCaptureOverlay) (obj)).updateAvatarViewGroup();
        ((ScreenCaptureOverlay) (obj)).updateCameraControlView();
        if (!((ScreenCaptureOverlay) (obj)).hasFrontFacingCamera()) goto _L69; else goto _L68
_L68:
        message = ((ScreenCaptureOverlay) (obj)).mCameraController;
        VideoUtils.logChatty("CameraPreviewCtrl", "calling startCapture`");
        Preconditions.checkArgument(((CameraPreviewController) (message)).mIsInitialized, "Camera preview helper must be initialized");
        if (!((CameraPreviewController) (message)).mIsCapturing) goto _L71; else goto _L70
_L70:
        GamesLog.d("CameraPreviewCtrl", "Preview capture requested while already active.");
_L69:
        obj.mCurrentState = 1;
        message = ScreenCaptureOverlay.createWindowLayoutParams(83);
        obj1 = ((ScreenCaptureOverlay) (obj)).getSavedPosition(((ScreenCaptureOverlay) (obj)).mGameId);
        message.x = ((com.google.android.gms.games.ui.video.ScreenCaptureOverlay.Position) (obj1)).x;
        message.y = ((com.google.android.gms.games.ui.video.ScreenCaptureOverlay.Position) (obj1)).y;
        ((ScreenCaptureOverlay) (obj)).mWindowManager.addView(((ScreenCaptureOverlay) (obj)).mOverlayAvatarGroup, message);
        message = new com.google.android.gms.games.ui.video.ScreenCaptureOverlay._cls6(((ScreenCaptureOverlay) (obj)), message);
        ((ScreenCaptureOverlay) (obj)).mInProgressRunnableList.add(message);
        ((ScreenCaptureOverlay) (obj)).mOverlayHandler.postDelayed("ScreenCaptureOverlay", "showControls", message, 250L);
          goto _L11
_L67:
        obj.mCameraController = null;
          goto _L65
_L71:
        if (((CameraPreviewController) (message)).mCameraTexture.getSurfaceTextureListener() == null)
        {
            ((CameraPreviewController) (message)).mCameraTexture.setSurfaceTextureListener(((CameraPreviewController) (message)).surfaceTextureListener);
            if (((CameraPreviewController) (message)).mCameraTexture.isAvailable())
            {
                message.openCamera(((CameraPreviewController) (message)).mCameraTexture.getWidth(), ((CameraPreviewController) (message)).mCameraTexture.getHeight());
            }
        }
        message.configureTransform(((CameraPreviewController) (message)).mCameraTexture.getWidth(), ((CameraPreviewController) (message)).mCameraTexture.getHeight());
        ((CameraPreviewController) (message)).mRotationListener.enable();
        message.mIsCapturing = true;
        message.tryStartPreviewSession();
          goto _L69
_L61:
        doRemoveOverlay(true);
          goto _L11
_L200:
label1:
        {
            VideoUtils.logChatty("VideoAgent", String.format("calling doUpdateMicForScreenCapture - %s", new Object[] {
                Boolean.valueOf(flag)
            }));
            VideoUtils.assertThreadState(mProcessingHandler);
            Preconditions.checkNotNull(mCaptureController);
            Preconditions.checkNotNull(mCapabilities);
            if (mVideoState == 3)
            {
                break label1;
            }
            mCaptureController.setMicEnabled(false);
        }
          goto _L11
        if (mCapabilities.mIsMicSupported || !flag)
        {
            break MISSING_BLOCK_LABEL_3118;
        }
        GamesLog.e("VideoAgent", "Trying to enable mic, but it's not supported");
        sendMessage(mProcessingHandler, 1, 9001);
          goto _L11
        mCaptureController.setMicEnabled(flag);
          goto _L11
_L13:
        obj = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        j = 0;
          goto _L72
_L18:
        i;
        JVM INSTR tableswitch 0 4: default 3188
    //                   0 838
    //                   1 1522
    //                   2 1522
    //                   3 1522
    //                   4 1522;
           goto _L73 _L74 _L75 _L75 _L75 _L75
_L15:
        i = 0;
          goto _L18
_L37:
        l1 = -1L;
          goto _L76
_L40:
        obj = null;
          goto _L46
_L44:
        if (i == 0) goto _L78; else goto _L77
_L77:
        i;
        JVM INSTR tableswitch 9006 9006: default 3252
    //                   9006 3345;
           goto _L79 _L80
_L84:
        if (true) goto _L82; else goto _L81
_L81:
_L86:
        if (true) goto _L84; else goto _L83
_L83:
_L88:
        if (true) goto _L86; else goto _L85
_L85:
_L90:
        if (true) goto _L88; else goto _L87
_L87:
_L92:
        if (true) goto _L90; else goto _L89
_L89:
_L94:
        if (true) goto _L92; else goto _L91
_L91:
_L96:
        if (true) goto _L94; else goto _L93
_L93:
_L98:
        if (true) goto _L96; else goto _L95
_L95:
_L100:
        if (true) goto _L98; else goto _L97
_L97:
_L102:
        if (true) goto _L100; else goto _L99
_L99:
_L104:
        if (true) goto _L102; else goto _L101
_L101:
_L106:
        if (true) goto _L104; else goto _L103
_L103:
_L108:
        if (true) goto _L106; else goto _L105
_L105:
_L110:
        if (true) goto _L108; else goto _L107
_L107:
_L112:
        if (true) goto _L110; else goto _L109
_L109:
_L114:
        if (true) goto _L112; else goto _L111
_L111:
_L116:
        if (true) goto _L114; else goto _L113
_L113:
_L118:
        if (true) goto _L116; else goto _L115
_L115:
_L120:
        if (true) goto _L118; else goto _L117
_L117:
_L122:
        if (true) goto _L120; else goto _L119
_L119:
_L124:
        if (true) goto _L122; else goto _L121
_L121:
_L126:
        if (true) goto _L124; else goto _L123
_L123:
_L128:
        if (true) goto _L126; else goto _L125
_L125:
_L130:
        if (true) goto _L128; else goto _L127
_L127:
_L132:
        if (true) goto _L130; else goto _L129
_L129:
_L134:
        if (true) goto _L132; else goto _L131
_L131:
_L136:
        if (true) goto _L134; else goto _L133
_L133:
_L138:
        if (true) goto _L136; else goto _L135
_L135:
_L140:
        if (true) goto _L138; else goto _L137
_L137:
_L142:
        if (true) goto _L140; else goto _L139
_L139:
_L144:
        if (true) goto _L142; else goto _L141
_L141:
_L146:
        if (true) goto _L144; else goto _L143
_L143:
_L148:
        if (true) goto _L146; else goto _L145
_L145:
_L150:
        if (true) goto _L148; else goto _L147
_L147:
_L152:
        if (true) goto _L150; else goto _L149
_L149:
_L154:
        if (true) goto _L152; else goto _L151
_L151:
_L156:
        if (true) goto _L154; else goto _L153
_L153:
_L158:
        if (true) goto _L156; else goto _L155
_L155:
_L160:
        if (true) goto _L158; else goto _L157
_L157:
_L162:
        if (true) goto _L160; else goto _L159
_L159:
_L164:
        if (true) goto _L162; else goto _L161
_L161:
_L166:
        if (true) goto _L164; else goto _L163
_L163:
_L168:
        if (true) goto _L166; else goto _L165
_L165:
_L170:
        if (true) goto _L168; else goto _L167
_L167:
_L172:
        if (true) goto _L170; else goto _L169
_L169:
_L174:
        if (true) goto _L172; else goto _L171
_L171:
_L176:
        if (true) goto _L174; else goto _L173
_L173:
_L178:
        if (true) goto _L176; else goto _L175
_L175:
_L180:
        if (true) goto _L178; else goto _L177
_L177:
_L182:
        if (true) goto _L180; else goto _L179
_L179:
_L184:
        if (true) goto _L182; else goto _L181
_L181:
_L186:
        if (true) goto _L184; else goto _L183
_L183:
_L188:
        if (true) goto _L186; else goto _L185
_L185:
_L190:
        if (true) goto _L188; else goto _L187
_L187:
        if (true) goto _L190; else goto _L189
_L189:
_L79:
        j = 0;
          goto _L82
_L48:
        i = 9001;
          goto _L44
_L50:
        i;
        JVM INSTR tableswitch 0 1: default 3292
    //                   0 2038
    //                   1 2059;
           goto _L191 _L192 _L193
_L52:
        i = 9003;
          goto _L44
_L54:
        i = 9008;
          goto _L44
_L56:
        i;
        JVM INSTR tableswitch 0 1: default 3336
    //                   0 2120
    //                   1 2132;
           goto _L194 _L195 _L196
_L57:
        i = 0;
          goto _L44
_L80:
        j = 1;
          goto _L82
_L5:
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L197
_L59:
        i = 0;
          goto _L198
_L63:
        message = null;
          goto _L199
_L7:
        if (i == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L200
    }

    public final volatile boolean isLockedByCurrentThread()
    {
        return super.isLockedByCurrentThread();
    }

    public final boolean isRecording()
    {
        return mVideoState > 1;
    }

    public final boolean isStopping()
    {
        return mVideoState >= 4;
    }

    public final int launchGameForRecording(GamesClientContext gamesclientcontext, String s, VideoConfiguration videoconfiguration, Game game, boolean flag)
        throws GoogleAuthException
    {
        Object obj;
        Object obj1;
        obj = gamesclientcontext.mClientContext;
        obj1 = ExperimentUtils.ENABLE_VIDEO_RECORDING_PROFILING;
        AndroidUtils.assertMainGmsProcess();
        boolean flag2 = ((com.google.android.gms.games.util.ExperimentUtils.Experiment) (obj1)).isEnabled(GamesExperiments.getInstance().getExperimentIds(((com.google.android.gms.common.internal.ClientContext) (obj))));
        obj = Profiler.getInstance();
        ((Profiler) (obj)).clearProfiler();
        obj.mLogToPlayLogEnabled = flag2;
        if (((Profiler) (obj)).mIsEnabled || flag2)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        obj.mIsEnabled = flag2;
        obj.mGlobalProfileScope = ((Profiler) (obj)).startTiming("_global");
        obj = Profiler.getInstance();
        obj1 = ((Profiler) (obj)).startTiming("launchGameForRecording");
        VideoUtils.logChatty("VideoAgent", "calling launchGameForRecording");
        if (mVideoRecordingOverlay == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        boolean flag1;
        if (mVideoRecordingOverlay.mCurrentState != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        GamesLog.w("VideoAgent", "Not recording because overlay is already visible");
        sendMessage(mProcessingHandler, 1, 9006);
        ((Profiler) (obj)).stopTiming(((com.google.android.gms.games.recorder.instrumentation.ProfileScope) (obj1)));
        return 9006;
        mRecordingSession = new RecordingSession(s, game, videoconfiguration, flag);
        sShownErrorToast = false;
        if (mProcessingThread == null || mProcessingHandler == null)
        {
            mProcessingThread = new HandlerThread("ProcessingThread", 0);
            mProcessingThread.start();
            mProcessingHandler = new VideoHandler(mProcessingThread.getLooper(), this, "mProcessingHandler");
        }
        mCurrentContext = gamesclientcontext;
        mCanStopProcessingThread = false;
        if (hasEnoughDiskSpace(gamesclientcontext.mContext, videoconfiguration.mQualityLevel))
        {
            break MISSING_BLOCK_LABEL_308;
        }
        sendMessage(mProcessingHandler, 1, 9009);
        sendMessage(mProcessingHandler, 7, 1);
        ((Profiler) (obj)).stopTiming(((com.google.android.gms.games.recorder.instrumentation.ProfileScope) (obj1)));
        return 9009;
        if (mCapabilities != null)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        mCapabilities = new VideoCapabilities(gamesclientcontext.mContext);
_L1:
        if (videoconfiguration.mCaptureMode != 0 || mCapabilities.mIsWriteSupported)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        sendMessage(mProcessingHandler, 1, 9003);
        ((Profiler) (obj)).stopTiming(((com.google.android.gms.games.recorder.instrumentation.ProfileScope) (obj1)));
        return 9003;
        mCapabilities.refresh();
          goto _L1
        gamesclientcontext;
        ((Profiler) (obj)).stopTiming(((com.google.android.gms.games.recorder.instrumentation.ProfileScope) (obj1)));
        throw gamesclientcontext;
        mOverlayThread = new HandlerThread("OverlayThread", 0);
        mOverlayThread.start();
        mOverlayHandler = new VideoHandler(mOverlayThread.getLooper(), this, "mOverlayHandler");
        mCaptureController = new ScreenCaptureController(gamesclientcontext.mContext, this, mCapabilities);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_563;
        }
        videoconfiguration = gamesclientcontext.mContext;
        game = gamesclientcontext.mExternalTargetGameId;
        if (!TextUtils.isEmpty(game))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        gamesclientcontext = new Bundle();
        gamesclientcontext.putString("com.google.android.gms.games.GAME_ID", game);
        gamesclientcontext.putString("com.google.android.gms.games.GAME_PACKAGE_NAME", s);
        s = new Intent("com.google.android.gms.games.LAUNCH_GAME");
        s.putExtras(gamesclientcontext);
        s.setData(Uri.fromParts("package", videoconfiguration.getPackageName(), null));
        videoconfiguration.sendBroadcast(s);
        sendMessage(mOverlayHandler, 4, 1);
        ((Profiler) (obj)).stopTiming(((com.google.android.gms.games.recorder.instrumentation.ProfileScope) (obj1)));
        return 0;
    }

    public final DataHolder listVideos(GamesClientContext gamesclientcontext)
    {
        com.google.android.gms.common.data.DataHolder.Builder builder;
        Object obj;
        boolean flag;
        gamesclientcontext = gamesclientcontext.mExternalTargetGameId;
        VideoUtils.logChatty("VideoAgent", String.format("Listing videos for %s", new Object[] {
            gamesclientcontext
        }));
        builder = DataHolder.builder(com.google.android.gms.games.internal.GamesContract.VideoColumns.ALL_COLUMNS);
        flag = false;
        obj = getVideoDirectory();
        if (obj != null) goto _L2; else goto _L1
_L1:
        int i = 9003;
_L7:
        return builder.build(i);
_L2:
        File afile[];
        afile = ((File) (obj)).listFiles(new FileFilter() {

            final VideoAgent this$0;

            public final boolean accept(File file)
            {
                boolean flag1 = VideoAgent.VIDEO_FILENAME_PATTERN.matcher(file.getName()).matches();
                if (!flag1)
                {
                    GamesLog.e("VideoAgent", (new StringBuilder("Invalid video filename: ")).append(file.getName()).toString());
                }
                return flag1;
            }

            
            {
                this$0 = VideoAgent.this;
                super();
            }
        });
        obj = new MediaMetadataRetriever();
        int j = afile.length;
        i = 0;
_L5:
        if (i >= j) goto _L4; else goto _L3
_L3:
        HashMap hashmap = getVideoMetadata(afile[i], gamesclientcontext, ((MediaMetadataRetriever) (obj)));
        if (hashmap == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        builder.withRow(hashmap);
        i++;
          goto _L5
_L4:
        ((MediaMetadataRetriever) (obj)).release();
        i = ((flag) ? 1 : 0);
        if (true) goto _L7; else goto _L6
_L6:
        gamesclientcontext;
        ((MediaMetadataRetriever) (obj)).release();
        throw gamesclientcontext;
    }

    public final void onCaptureError(int i)
    {
        sendMessage(mProcessingHandler, 0, i);
    }

    public final void onCaptureStarted()
    {
        Preconditions.checkNotNull(mRecordingSession);
        mRecordingSession.reachedActiveState = true;
        setVideoState(3);
    }

    public final void onCaptureStopped(Uri uri)
    {
        if (uri == null)
        {
            sendMessage(mProcessingHandler, 0, 1);
            return;
        }
        if (mRecordingSession != null)
        {
            mRecordingSession.mediaStoreUri = uri;
            setVideoState(5);
            return;
        } else
        {
            GamesLog.e("VideoAgent", "Video context was null when onCaptureStopped was called");
            return;
        }
    }

    public final void onDisableMic()
    {
        sendMessage(mProcessingHandler, 5, 0);
    }

    public final void onDismissOverlay()
    {
        VideoUtils.assertThreadState(mOverlayHandler);
        VideoUtils.logChatty("VideoAgent", "calling onDismissOverlay");
        doRemoveOverlay(false);
        if (mVideoState == 1)
        {
            sendMessage(mProcessingHandler, 7, 1);
        } else
        if (!isStopping())
        {
            sendMessage(mProcessingHandler, 3, 0);
            return;
        }
    }

    public final void onEnableMic()
    {
        sendMessage(mProcessingHandler, 5, 1);
    }

    public final void onMissingCamera()
    {
        sendMessage(mProcessingHandler, 1, 9011);
    }

    public final void onMissingMic()
    {
        sendMessage(mProcessingHandler, 1, 9010);
    }

    public final void onOverlayError$2563266()
    {
        sendMessage(mProcessingHandler, 1, 9012);
    }

    public final void onStartClicked()
    {
        Preconditions.checkNotNull(mRecordingSession);
        sendMessage(mProcessingHandler, 2, 0);
        mRecordingSession.startClickInMillis = DefaultClock.getInstance().elapsedRealtime();
    }

    public final void onStopClicked()
    {
        Preconditions.checkNotNull(mRecordingSession);
        if (isRecording())
        {
            mRecordingSession.keepRecordingAlive = true;
            long l1 = 500L - (DefaultClock.getInstance().elapsedRealtime() - mRecordingSession.startClickInMillis);
            long l = l1;
            if (l1 < 0L)
            {
                l = 0L;
            }
            sendMessageDelayed(mProcessingHandler, 3, 0, l);
        }
    }

    public final volatile void releaseLockOnAllChildren()
    {
        super.releaseLockOnAllChildren();
    }

    static 
    {
        VALID_STATE_TRANSITIONS = new HashSet();
        BROADCAST_INTENT_FILTER = new IntentFilter();
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(1), Integer.valueOf(2)
        }));
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(1), Integer.valueOf(4)
        }));
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(2), Integer.valueOf(3)
        }));
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(2), Integer.valueOf(4)
        }));
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(3), Integer.valueOf(4)
        }));
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(4), Integer.valueOf(5)
        }));
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(4), Integer.valueOf(1)
        }));
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(5), Integer.valueOf(6)
        }));
        VALID_STATE_TRANSITIONS.add(String.format("%d-%d", new Object[] {
            Integer.valueOf(6), Integer.valueOf(1)
        }));
        BROADCAST_INTENT_FILTER.addAction("android.intent.action.USER_PRESENT");
        BROADCAST_INTENT_FILTER.addAction("android.intent.action.SCREEN_OFF");
    }




/*
    static VideoHandler access$102$af3d786(VideoAgent videoagent)
    {
        videoagent.mProcessingHandler = null;
        return null;
    }

*/










/*
    static HandlerThread access$902$7489539a(VideoAgent videoagent)
    {
        videoagent.mProcessingThread = null;
        return null;
    }

*/
}
