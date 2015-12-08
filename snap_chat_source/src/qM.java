// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaRecorder;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.camera.model.CameraModel;
import com.snapchat.android.camera.videocamera.VideoCameraHandler;
import com.snapchat.android.util.debug.ReleaseManager;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.squareup.otto.Bus;
import java.util.List;

public final class qM
{

    protected rk a;
    protected CameraModel b;
    protected rj c;
    private final Kn d;
    private final lr e;

    protected qM()
    {
        this(Kn.a(), new lr());
    }

    private qM(Kn kn, lr lr1)
    {
        SnapchatApplication.getDIComponent().a(this);
        d = kn;
        e = lr1;
    }

    public final void a()
    {
        if (b.i == null)
        {
            if (ReleaseManager.e())
            {
                Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, "Null camera when initializing VideoCameraHandler"));
                return;
            } else
            {
                Timber.e("VideoRecordingController", "Null camera when initializing VideoCameraHandler", new Object[0]);
                return;
            }
        } else
        {
            b();
            HandlerThread handlerthread = new HandlerThread("Video Recording Handler Thread");
            handlerthread.start();
            a.c = new VideoCameraHandler(handlerthread.getLooper());
            return;
        }
    }

    public final void a(com.snapchat.android.camera.videocamera.VideoCameraHandler.b b1, qI qi, boolean flag)
    {
        VideoCameraHandler videocamerahandler = a.c;
        if (videocamerahandler != null)
        {
            videocamerahandler.obtainMessage(100, b1).sendToTarget();
            if (flag)
            {
                videocamerahandler.waitDone();
            }
        }
        if (b.a())
        {
            qi.a(false);
        }
    }

    public final boolean a(com.snapchat.android.camera.videocamera.VideoCameraHandler.b b1, qI qi, IK ik, Surface surface)
    {
        java.io.File file = d.b();
        qP.b b2 = b.i;
        VideoCameraHandler videocamerahandler = a.c;
        if (b2 == null || videocamerahandler == null || file == null)
        {
            if (file == null)
            {
                b1.a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.VIDEO_STORAGE_EXCEPTION);
            } else
            {
                b1.a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.INITIALIZATION_ERROR);
            }
            return false;
        }
        a.a = true;
        android.hardware.Camera.Parameters parameters = b2.c();
        if (parameters != null)
        {
            if (!b.a())
            {
                List list = parameters.getSupportedFocusModes();
                if (list != null && list.contains("continuous-video"))
                {
                    parameters.setFocusMode("continuous-video");
                }
            }
            if (Bm.a().a("USE_VIDEO_STABILIZATION", "option", "on").equals("on") && Ic.SUPPORTS_VIDEO_STABILIZATION && parameters.isVideoStabilizationSupported())
            {
                parameters.setVideoStabilization(true);
            }
            b2.a(parameters);
        }
        if (c.a)
        {
            if (b.a())
            {
                qi.a(true);
            } else
            {
                qi.b(true);
            }
        }
        b2.a(null);
        try
        {
            b2.d();
        }
        // Misplaced declaration of an exception variable
        catch (qI qi)
        {
            b1.a(com.snapchat.android.camera.videocamera.VideoCameraHandler.VideoFailureType.CAMERA_UNLOCK_EXCEPTION);
            return false;
        }
        if (surface != null)
        {
            videocamerahandler.c = surface;
        }
        videocamerahandler.a = file;
        videocamerahandler.obtainMessage(101, ik.a(), ik.b(), b1).sendToTarget();
        qi = e;
        if (Ic.HAS_SURFACE_TEXTURE_RECORDING)
        {
            double d1 = ik.c() - ((lr) (qi)).mScreenParameterProvider.mResolution.c();
            b1 = ((lr) (qi)).mScreenParameterProvider.mResolution;
            b1 = b1.a((double)ik.a() / (double)b1.a());
            double d2 = 100D * (double)(Math.abs(b1.d() - ik.d()) / Math.max(b1.d(), ik.d()));
            if (d1 > 0.0D)
            {
                b1 = new lJ(d2);
            } else
            if (d1 < 0.0D)
            {
                b1 = new lI(d2);
            } else
            {
                b1 = null;
            }
            if (b1 != null)
            {
                ((lr) (qi)).mExceptionReporter.a(b1);
            }
        }
        return true;
    }

    public final void b()
    {
        VideoCameraHandler videocamerahandler = a.c;
        if (videocamerahandler != null)
        {
            videocamerahandler.b.release();
            videocamerahandler.getLooper().quit();
        }
        a.c = null;
    }
}
