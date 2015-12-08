// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.hardware.Camera;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            Camcorder, CameraControl, DeviceProfile, SurfaceWrapper, 
//            CamcorderCallback, AudioFilter, Size

public class MediaRecorderCamcorder
    implements android.media.MediaRecorder.OnErrorListener, android.media.MediaRecorder.OnInfoListener, android.os.Handler.Callback, Camcorder
{

    protected static Logger a = Logger.getLogger("SkypeMedia");
    private CameraControl b;
    private DeviceProfile c;
    private CamcorderCallback d;
    private MediaRecorder e;
    private File f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private Handler k;
    private int l;
    private int m;

    public MediaRecorderCamcorder(CameraControl cameracontrol, DeviceProfile deviceprofile)
    {
        l = -1;
        m = -1;
        b = cameracontrol;
        c = deviceprofile;
        i = 5;
        k = new Handler(Looper.getMainLooper(), this);
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        g();
        int i1 = b.getCameraId();
        CamcorderProfile camcorderprofile = c.b(i1);
        if (h > 0)
        {
            camcorderprofile.duration = h;
        }
        e = new MediaRecorder();
        e.setOnErrorListener(this);
        e.setOnInfoListener(this);
        Object obj1 = b.getCamera();
        ((Camera) (obj1)).unlock();
        e.setCamera(((Camera) (obj1)));
        e.setAudioSource(i);
        e.setVideoSource(1);
        obj1 = b.getCameraParameters();
        if (l > 0)
        {
            camcorderprofile.videoBitRate = l;
        }
        if (m > 0)
        {
            camcorderprofile.audioBitRate = m;
        }
        if (j > 0)
        {
            camcorderprofile.audioChannels = j;
        }
        c.a(camcorderprofile, ((android.hardware.Camera.Parameters) (obj1)));
        e.setProfile(camcorderprofile);
        e.setOrientationHint(b.getOrientationHint());
        if (c.e())
        {
            android.view.Surface surface = b.getPreviewSurface().a();
            e.setPreviewDisplay(surface);
        }
        flag = f.exists();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        if (!f.delete())
        {
            a.warning((new StringBuilder("delete ")).append(f.getAbsolutePath()).append(" returned false").toString());
        }
_L1:
        e.setOutputFile(f.getAbsolutePath());
        e.prepare();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        if (d != null)
        {
            d.onException(((Throwable) (obj)));
        }
          goto _L1
        obj;
        throw obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        if (d != null)
        {
            d.onException(((Throwable) (obj)));
        }
          goto _L2
    }

    private void g()
    {
        this;
        JVM INSTR monitorenter ;
        MediaRecorder mediarecorder = e;
        if (mediarecorder == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        if (g)
        {
            e.stop();
        }
        e.release();
        e = null;
        g = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ((IllegalStateException) (obj)).printStackTrace();
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        e.release();
        e = null;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final void a(AudioFilter audiofilter)
    {
    }

    public final boolean a()
    {
        return false;
    }

    public final void b()
    {
        f();
        e.start();
        g = true;
        k.sendEmptyMessageDelayed(4, 1000L);
    }

    public final void c()
    {
        g();
        k.removeMessages(3);
        k.removeMessages(4);
        k.sendEmptyMessageDelayed(3, 200L);
    }

    public final void d()
    {
        throw new UnsupportedOperationException();
    }

    public final void e()
    {
        throw new UnsupportedOperationException();
    }

    public boolean handleMessage(Message message)
    {
        boolean flag1 = true;
        message.what;
        JVM INSTR tableswitch 3 4: default 28
    //                   3 32
    //                   4 111;
           goto _L1 _L2 _L3
_L1:
        boolean flag = false;
_L5:
        return flag;
_L2:
        flag = flag1;
        if (f != null)
        {
            flag = flag1;
            if (f.exists())
            {
                a.info((new StringBuilder("recorded: ")).append(f.getAbsolutePath()).toString());
                flag = flag1;
                if (d != null)
                {
                    d.onFileRecorded(f);
                    f = null;
                    return true;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        flag = flag1;
        if (d != null)
        {
            d.onStoppable();
            return true;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void onError(MediaRecorder mediarecorder, int i1, int j1)
    {
        a.warning(String.format("onError %d %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        }));
        if (d != null)
        {
            d.onError(i1);
        }
    }

    public void onInfo(MediaRecorder mediarecorder, int i1, int j1)
    {
        a.info(String.format("onInfo %d %d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1)
        }));
    }

    public void setAudioBitRate(int i1)
    {
        m = i1;
    }

    public void setAudioChannels(int i1)
    {
        j = i1;
    }

    public void setAudioSource(int i1)
    {
        i = i1;
    }

    public void setCamcorderCallback(CamcorderCallback camcordercallback)
    {
        d = camcordercallback;
    }

    public void setCameraFacing(int i1)
    {
    }

    public void setMaxDuration(int i1)
    {
        h = i1;
    }

    public void setRecordingFile(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("null file");
        } else
        {
            f = file;
            return;
        }
    }

    public void setTargetVideoSize(Size size)
    {
    }

    public void setVideoBitRate(int i1)
    {
        l = i1;
    }

}
