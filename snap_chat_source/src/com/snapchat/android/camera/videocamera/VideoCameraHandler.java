// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera.videocamera;

import Ic;
import LB;
import Ll;
import PG;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.net.Uri;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.analytics.handledexceptions.IncompatibleVideoRecordedException;
import com.snapchat.android.camera.model.CameraModel;
import com.snapchat.android.camera.transcoding.TranscodingPreferencesWrapper;
import com.snapchat.android.util.WaitDoneHandler;
import fQ;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import lh;
import qZ;
import rS;
import rW;
import rX;
import rY;

public final class VideoCameraHandler extends WaitDoneHandler
{
    public static final class VideoFailureType extends Enum
    {

        private static final VideoFailureType $VALUES[];
        public static final VideoFailureType CAMERA_UNLOCK_EXCEPTION;
        public static final VideoFailureType EXCEPTION_ON_START;
        public static final VideoFailureType EXCEPTION_ON_STOP;
        public static final VideoFailureType INITIALIZATION_ERROR;
        public static final VideoFailureType NO_SURFACE_PROVIDED;
        public static final VideoFailureType RECORDING_TOO_SHORT;
        public static final VideoFailureType VIDEO_STORAGE_EXCEPTION;
        private int a;

        public static VideoFailureType valueOf(String s)
        {
            return (VideoFailureType)Enum.valueOf(com/snapchat/android/camera/videocamera/VideoCameraHandler$VideoFailureType, s);
        }

        public static VideoFailureType[] values()
        {
            return (VideoFailureType[])$VALUES.clone();
        }

        public final int getValue()
        {
            return a;
        }

        static 
        {
            VIDEO_STORAGE_EXCEPTION = new VideoFailureType("VIDEO_STORAGE_EXCEPTION", 0, 0);
            CAMERA_UNLOCK_EXCEPTION = new VideoFailureType("CAMERA_UNLOCK_EXCEPTION", 1, 1);
            EXCEPTION_ON_START = new VideoFailureType("EXCEPTION_ON_START", 2, 2);
            EXCEPTION_ON_STOP = new VideoFailureType("EXCEPTION_ON_STOP", 3, 3);
            INITIALIZATION_ERROR = new VideoFailureType("INITIALIZATION_ERROR", 4, 4);
            NO_SURFACE_PROVIDED = new VideoFailureType("NO_SURFACE_PROVIDED", 5, 5);
            RECORDING_TOO_SHORT = new VideoFailureType("RECORDING_TOO_SHORT", 6, 6);
            $VALUES = (new VideoFailureType[] {
                VIDEO_STORAGE_EXCEPTION, CAMERA_UNLOCK_EXCEPTION, EXCEPTION_ON_START, EXCEPTION_ON_STOP, INITIALIZATION_ERROR, NO_SURFACE_PROVIDED, RECORDING_TOO_SHORT
            });
        }

        private VideoFailureType(String s, int i, int j)
        {
            super(s, i);
            a = j;
        }
    }

    final class a
        implements android.media.MediaRecorder.OnInfoListener
    {

        b a;

        public final void onInfo(MediaRecorder mediarecorder, int i, int j)
        {
            Timber.c("VideoCameraHandler", "Video InfoListener: Info event #[%d, %d] has occured", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            switch (i)
            {
            default:
                return;

            case 800: 
            case 801: 
                PG.a(new Runnable(this) {

                    private a a;

                    public final void run()
                    {
                        a.a.C();
                    }

            
            {
                a = a1;
                super();
            }
                });
                break;
            }
        }

        public a(b b1)
        {
            a = b1;
        }
    }

    public static interface b
    {

        public abstract void B();

        public abstract void C();

        public abstract void a(Uri uri);

        public abstract void a(VideoFailureType videofailuretype);
    }


    public File a;
    public MediaRecorder b;
    public Surface c;
    public CameraModel d;
    public LB e;
    private long f;
    private final qZ g;

    public VideoCameraHandler(Looper looper)
    {
        MediaRecorder mediarecorder = new MediaRecorder();
        new lh();
        TranscodingPreferencesWrapper transcodingpreferenceswrapper = TranscodingPreferencesWrapper.a();
        CameraEventAnalytics.a();
        this(looper, mediarecorder, transcodingpreferenceswrapper, qZ.e());
    }

    private VideoCameraHandler(Looper looper, MediaRecorder mediarecorder, TranscodingPreferencesWrapper transcodingpreferenceswrapper, qZ qz)
    {
        super(looper);
        SnapchatApplication.getDIComponent().a(this);
        b = mediarecorder;
        g = qz;
    }

    private int a()
    {
        try
        {
            Timber.c("VideoCameraHandler", "Video Recorder: Starting...", new Object[0]);
            b.start();
            Timber.c("VideoCameraHandler", "Video Recorder: Started successfully!", new Object[0]);
            f = SystemClock.elapsedRealtime();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Timber.c("VideoCameraHandler", (new StringBuilder("Video Recorder: IllegalStateException when calling start(): ")).append(illegalstateexception).toString(), new Object[0]);
            return 2;
        }
        catch (RuntimeException runtimeexception)
        {
            Timber.c("VideoCameraHandler", (new StringBuilder("Video Recorder: RuntimeException when calling start(): ")).append(runtimeexception).toString(), new Object[0]);
            return 2;
        }
        return 1;
    }

    private static void a(b b1, VideoFailureType videofailuretype)
    {
        if (b1 == null)
        {
            return;
        } else
        {
            PG.a(new Runnable(b1, videofailuretype) {

                private b a;
                private VideoFailureType b;

                public final void run()
                {
                    try
                    {
                        a.a(b);
                        return;
                    }
                    catch (IllegalStateException illegalstateexception)
                    {
                        Timber.e("VideoCameraHandler", (new StringBuilder("Callback attempted illegally: ")).append(illegalstateexception.getMessage()).toString(), new Object[0]);
                    }
                }

            
            {
                a = b1;
                b = videofailuretype;
                super();
            }
            });
            return;
        }
    }

    private boolean a(MediaRecorder mediarecorder, int i, int j, rY ry, boolean flag)
    {
        qP.b b1 = d.i;
        android.hardware.Camera.CameraInfo camerainfo = d.c();
        int k = d.d;
        CamcorderProfile camcorderprofile;
        ArrayList arraylist;
        if (CamcorderProfile.hasProfile(k, 1))
        {
            camcorderprofile = CamcorderProfile.get(k, 1);
        } else
        {
            camcorderprofile = null;
        }
        arraylist = new ArrayList();
        if (camcorderprofile.audioCodec == 1)
        {
            arraylist.add(com.snapchat.android.analytics.handledexceptions.IncompatibleVideoRecordedException.IncompatibleVideoType.AMR_NB);
        }
        if (camcorderprofile.videoCodec == 1)
        {
            arraylist.add(com.snapchat.android.analytics.handledexceptions.IncompatibleVideoRecordedException.IncompatibleVideoType.H263);
        }
        if (!arraylist.isEmpty())
        {
            e.a(new IncompatibleVideoRecordedException(arraylist));
        }
        if (b1 == null || camerainfo == null || camcorderprofile == null)
        {
            return false;
        }
        mediarecorder.setCamera(b1.b());
        mediarecorder.setAudioSource(5);
        int l;
        if (flag)
        {
            mediarecorder.setVideoSource(2);
        } else
        {
            mediarecorder.setVideoSource(1);
        }
        mediarecorder.setProfile(camcorderprofile);
        mediarecorder.setVideoSize(i, j);
        mediarecorder.setMaxFileSize(ry.a());
        mediarecorder.setVideoEncodingBitRate(ry.a(camcorderprofile));
        Timber.c("VideoCameraHandler", "Video Recorder: video size [%d x %d], filesize: %d, bitrate: %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Long.valueOf(ry.a()), Integer.valueOf(ry.a(camcorderprofile))
        });
        CameraEventAnalytics.a(i, j, ry.a(), ry.a(camcorderprofile), TranscodingPreferencesWrapper.b());
        l = camerainfo.orientation;
        if (l == 0)
        {
            k = 90;
        } else
        {
            k = l;
            if (camerainfo.facing == 1)
            {
                rS.a();
                k = (l + rS.c()) % 360;
            }
        }
        mediarecorder.setOrientationHint(k);
        mediarecorder.setMaxDuration(10000);
        mediarecorder.setOutputFile(a.toString());
        if (c != null)
        {
            mediarecorder.setPreviewDisplay(c);
        }
        Timber.c("VideoCameraHandler", "Video Recorder: Preparing", new Object[0]);
        mediarecorder.prepare();
        Timber.c("VideoCameraHandler", "Video Recorder: Prepared!", new Object[0]);
        if (!flag) goto _L2; else goto _L1
_L1:
        g.i = new fQ(j, i);
        ry = g;
        if (!Ic.SUPPORTS_RECORDING_SURFACE)
        {
            break MISSING_BLOCK_LABEL_447;
        }
        mediarecorder = b.getSurface();
_L3:
        ry.a(mediarecorder);
_L2:
        Timber.c("VideoCameraHandler", "Video Recorder: mVideoRecorder.getSurface()!", new Object[0]);
        return true;
        mediarecorder = null;
          goto _L3
        mediarecorder;
_L5:
        Timber.c("VideoCameraHandler", (new StringBuilder("Video Recorder: exception preparing: ")).append(mediarecorder.getClass().getName()).append("::").append(mediarecorder.getMessage()).toString(), new Object[0]);
        return false;
        mediarecorder;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private int b()
    {
        try
        {
            Timber.c("VideoCameraHandler", "Video Recorder: Stopping...", new Object[0]);
            b.stop();
            Timber.c("VideoCameraHandler", "Video Recorder: Stop Successful", new Object[0]);
        }
        catch (IllegalStateException illegalstateexception)
        {
            Timber.e("VideoCameraHandler", (new StringBuilder("Video Recorder: Problem while stopping! Error:")).append(illegalstateexception.getMessage()).toString(), new Object[0]);
            return 2;
        }
        catch (RuntimeException runtimeexception)
        {
            Timber.e("VideoCameraHandler", (new StringBuilder("Video Recorder: Problem while stopping! Error:")).append(runtimeexception.getMessage()).toString(), new Object[0]);
            return 3;
        }
        return 1;
    }

    private void c()
    {
        b.reset();
        qP.b b1 = d.i;
        if (b1 != null)
        {
            b1.f();
            b1.e();
        }
    }

    public final void handleMessage(Message message)
    {
        int j;
        boolean flag2;
        j = 1;
        flag2 = false;
        message.what;
        JVM INSTR tableswitch 100 101: default 32
    //                   100 200
    //                   101 33;
           goto _L1 _L2 _L3
_L1:
        return;
_L3:
        Timber.c("VideoCameraHandler", "Video Recorder: START_RECORDING message received on handler", new Object[0]);
        b b1 = (b)message.obj;
        int i = message.arg1;
        j = message.arg2;
        message = new a(b1);
        b.setOnInfoListener(message);
        MediaRecorder mediarecorder;
        boolean flag1;
        if (TranscodingPreferencesWrapper.c())
        {
            message = new rX();
        } else
        {
            message = new rW();
        }
        mediarecorder = b;
        flag1 = flag2;
        if (Ic.SUPPORTS_RECORDING_SURFACE)
        {
            flag1 = flag2;
            if (g.e)
            {
                flag1 = true;
            }
        }
        if (a(mediarecorder, i, j, message, flag1))
        {
            if (a() == 1)
            {
                PG.a(new Runnable(b1) {

                    private b a;

                    public final void run()
                    {
                        try
                        {
                            a.B();
                            return;
                        }
                        catch (IllegalStateException illegalstateexception)
                        {
                            Timber.e("VideoCameraHandler", (new StringBuilder("Callback attempted illegally: ")).append(illegalstateexception.getMessage()).toString(), new Object[0]);
                        }
                    }

            
            {
                a = b1;
                super();
            }
                });
                return;
            } else
            {
                c();
                a(b1, VideoFailureType.EXCEPTION_ON_START);
                return;
            }
        } else
        {
            c();
            a(b1, VideoFailureType.INITIALIZATION_ERROR);
            return;
        }
_L2:
        Timber.c("VideoCameraHandler", "Video Recorder: STOP_RECORDING message received on handler", new Object[0]);
        message = (b)message.obj;
        int k = b();
        boolean flag;
        if (k == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k != 3)
        {
            j = 0;
        }
        c();
        g.a(null);
        if (flag)
        {
            Object obj = a;
            float f1 = f;
            if (obj != null)
            {
                Timber.c("VideoCameraUtils", (new StringBuilder("Video File Size = ")).append(((File) (obj)).length() / 1024L).append(", length = ").append(f1).toString(), new Object[0]);
            }
            obj = Uri.fromFile(a);
            if (message != null)
            {
                PG.a(new Runnable(message, ((Uri) (obj))) {

                    private b a;
                    private Uri b;

                    public final void run()
                    {
                        try
                        {
                            a.a(b);
                            return;
                        }
                        catch (IllegalStateException illegalstateexception)
                        {
                            Timber.e("VideoCameraHandler", (new StringBuilder("Callback attempted illegally: ")).append(illegalstateexception.getMessage()).toString(), new Object[0]);
                        }
                    }

            
            {
                a = b1;
                b = uri;
                super();
            }
                });
                return;
            }
        } else
        if (j != 0)
        {
            a(message, VideoFailureType.RECORDING_TOO_SHORT);
            return;
        } else
        {
            a(message, VideoFailureType.EXCEPTION_ON_STOP);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
