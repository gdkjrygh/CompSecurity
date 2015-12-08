// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.opengl.EGL14;
import android.opengl.Matrix;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            Camcorder, Component, Size, DeviceProfile, 
//            CameraControl, GLTextureViewWrapper, GLSurfaceViewWrapper, b, 
//            SurfaceWrapper, EncoderRenderer, CamcorderCallback, ShaderEffect, 
//            GLES20Renderer, ScaleMode, c, GLTextureView, 
//            AVCEncoderComponent, AudioRecordComponent, AACEncoderComponent, a, 
//            d, e, m, AudioFilter

public class ComponentCamcorder
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener, android.hardware.Camera.PreviewCallback, android.os.Handler.Callback, Camcorder, Component, Thread.UncaughtExceptionHandler
{

    protected static Logger a = Logger.getLogger("SkypeMedia");
    private int A;
    private long B;
    private long C;
    private Set D;
    private CameraControl b;
    private MediaMuxer c;
    private ConditionVariable d;
    private File e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private long p;
    private long q;
    private CamcorderCallback r;
    private int s;
    private Set t;
    private AVCEncoderComponent u;
    private AudioRecordComponent v;
    private Size w;
    private Handler x;
    private DeviceProfile y;
    private int z;

    public ComponentCamcorder(CameraControl cameracontrol, DeviceProfile deviceprofile)
    {
        b = cameracontrol;
        y = deviceprofile;
        g = -1;
        h = -1;
        k = true;
        w = Size.g;
        z = 0xf4240;
        A = 0x17700;
        j = 1;
        int i1;
        if (deviceprofile.j())
        {
            i1 = 0;
        } else
        {
            i1 = 5;
        }
        i = i1;
        d = new ConditionVariable();
        x = new Handler(Looper.getMainLooper(), this);
        D = new LinkedHashSet();
    }

    private void a(MediaFormat mediaformat)
    {
        this;
        JVM INSTR monitorenter ;
        if (c == null) goto _L2; else goto _L1
_L1:
        String s1;
        s1 = mediaformat.getString("mime");
        a.info((new StringBuilder("onFormatChange ")).append(s1).append(" ").append(mediaformat).toString());
        if (!"video/avc".equalsIgnoreCase(s1)) goto _L4; else goto _L3
_L3:
        h = c.addTrack(mediaformat);
        a.info((new StringBuilder("add video track ")).append(h).toString());
        f = f + 1;
_L9:
        if (!k) goto _L6; else goto _L5
_L5:
        if (f != 2) goto _L2; else goto _L7
_L7:
        a.info("mediaMuxer.start()");
        c.start();
        d.open();
        x.sendEmptyMessageDelayed(5, 1000L);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (!"audio/mp4a-latm".equalsIgnoreCase(s1)) goto _L9; else goto _L8
_L8:
        g = c.addTrack(mediaformat);
        a.info((new StringBuilder("add audio track ")).append(g).toString());
        f = f + 1;
          goto _L9
        mediaformat;
        throw mediaformat;
_L6:
        int i1 = f;
        if (i1 != 1) goto _L2; else goto _L7
    }

    private void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        a.info((new StringBuilder("eos ")).append(s1).toString());
        f = f - 1;
        if (c != null && f == 0)
        {
            a.info("mediaMuxer.release()");
            i();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    private void f()
    {
        Camera camera = b.getCamera();
        android.hardware.Camera.Parameters parameters = b.getCameraParameters();
        android.hardware.Camera.Size size = parameters.getPreviewSize();
        int j1 = ImageFormat.getBitsPerPixel(parameters.getPreviewFormat());
        byte abyte0[][] = new byte[3][];
        for (int i1 = 0; i1 < 3; i1++)
        {
            byte abyte1[] = new byte[(int)((double)(size.width * size.height) * ((double)j1 / 8D))];
            camera.addCallbackBuffer(abyte1);
            abyte0[i1] = abyte1;
        }

        camera.setPreviewCallbackWithBuffer(this);
    }

    private void g()
    {
        SurfaceWrapper surfacewrapper = b.getPreviewSurface();
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 18 && ((surfacewrapper instanceof GLTextureViewWrapper) || (surfacewrapper instanceof GLSurfaceViewWrapper)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        m = flag;
        if ((y instanceof b) && ((b)y).c())
        {
            m = false;
        }
    }

    private EncoderRenderer h()
    {
        if (m)
        {
            SurfaceTextureRenderer surfacetexturerenderer = b.getPreviewSurface().g();
            if (surfacetexturerenderer instanceof EncoderRenderer)
            {
                return (EncoderRenderer)surfacetexturerenderer;
            }
        }
        return null;
    }

    private void i()
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        a.info("mediaMuxer.release()");
        c.release();
_L4:
        c = null;
        d.close();
_L2:
        h = -1;
        g = -1;
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        if (r != null)
        {
            r.onException(illegalstateexception);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(AudioFilter audiofilter)
    {
        D.add(audiofilter);
    }

    public final void a(ShaderEffect shadereffect)
    {
        SurfaceWrapper surfacewrapper = b.getPreviewSurface();
        if (surfacewrapper instanceof GLTextureViewWrapper)
        {
            ((GLTextureViewWrapper)surfacewrapper).i().a(shadereffect.a());
        }
    }

    public final boolean a()
    {
        g();
        return m;
    }

    public final void b()
    {
        a.info((new StringBuilder("recording: ")).append(e.getAbsolutePath()).toString());
        f = 0;
        o = false;
        q = 0L;
        t = new HashSet();
        g();
        Object obj;
        Object obj1;
        Object obj3;
        byte byte0;
        if (m)
        {
            byte0 = 30;
        } else
        {
            byte0 = 15;
        }
        obj3 = b.getPreviewSize();
        if (m)
        {
            obj = y;
            b.getCameraFacing();
            obj = ((DeviceProfile) (obj)).i();
            if (obj == null)
            {
                obj = w;
            }
            Size size = ((Size) (obj));
            if (((Size) (obj3)).b() > ((Size) (obj3)).a())
            {
                size = ((Size) (obj)).c();
            }
            obj = h();
            if (obj != null && b.getScaleMode() == ScaleMode.a)
            {
                Size size1 = b.getPreviewSize();
                float f3 = (float)size1.a() / (float)size.a();
                float f1 = (float)size1.b() / (float)size.b();
                float af[] = ((EncoderRenderer) (obj)).b();
                float f2 = Math.min(f3, f1);
                f3 /= f2;
                f1 /= f2;
                Matrix.setIdentityM(af, 0);
                Matrix.scaleM(af, 0, f3, f1, 1.0F);
            }
            af = new c(((Size) (obj3)), size, byte0, z, n);
        } else
        {
            int i1 = z;
            Object obj2 = null;
            af = obj2;
            if (b.getScaleMode() == ScaleMode.b)
            {
                af = b.getPreviewSize();
                int j1 = af.a();
                int k1 = af.b();
                if (k1 > j1)
                {
                    j1 = (k1 - j1) / 2;
                    af = new Rect(0, j1, 0, j1);
                } else
                {
                    af = obj2;
                    if (j1 < k1)
                    {
                        j1 = (j1 - k1) / 2;
                        af = new Rect(j1, 0, j1, 0);
                    }
                }
            }
            af = new c(((Size) (obj3)), byte0, i1, af, n);
        }
        obj1 = b.a;
        obj3 = b.getPreviewSurface();
        if (y instanceof b)
        {
            obj1 = (b)y;
        }
        if (m && y.q() && (((SurfaceWrapper) (obj3)).c() instanceof GLTextureView))
        {
            ((GLTextureView)((SurfaceWrapper) (obj3)).c()).setRenderSync(((SurfaceWrapper) (obj3)).g());
        }
        obj3 = t;
        af = new AVCEncoderComponent(this, af, ((b) (obj1)), h());
        u = af;
        ((Set) (obj3)).add(af);
        u.getThread().setUncaughtExceptionHandler(this);
        if (k)
        {
            af = AudioRecordComponent.createDeviceCompatibleSettings(i, j);
            obj1 = new AACEncoderComponent(this, new a(2, af.b(), j, A));
            t.add(obj1);
            v = new AudioRecordComponent(((Component) (obj1)), af);
            if (!D.isEmpty())
            {
                v.setAudioFilters(D);
            }
            t.add(v);
        }
        try
        {
            c = new MediaMuxer(e.getAbsolutePath(), 0);
            if (!m)
            {
                c.setOrientationHint(b.getOrientationHint());
            }
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        af = b.getCamera();
        obj1 = b.getCameraParameters();
        if (!m)
        {
            af.stopPreview();
            if (obj1 != null)
            {
                af.setParameters(((android.hardware.Camera.Parameters) (obj1)));
            }
            f();
            af.startPreview();
        }
        for (af = t.iterator(); af.hasNext(); ((Component)af.next()).send(e.b)) { }
        l = true;
        if (r != null)
        {
            r.onRecording();
        }
    }

    public final void c()
    {
        x.removeMessages(4);
        SurfaceWrapper surfacewrapper = b.getPreviewSurface();
        surfacewrapper.d();
        l = false;
        if (t != null)
        {
            Component component;
            for (Iterator iterator = t.iterator(); iterator.hasNext(); component.releaseAndWait())
            {
                component = (Component)iterator.next();
                component.send(e.c);
            }

            t.clear();
            u = null;
        }
        i();
        x.sendEmptyMessage(3);
        surfacewrapper.e();
    }

    public final void d()
    {
        if (!o)
        {
            p = SystemClock.elapsedRealtime();
            o = true;
        }
    }

    public final void e()
    {
        if (o)
        {
            long l1 = SystemClock.elapsedRealtime();
            q = q + (l1 - p);
            o = false;
            x.sendEmptyMessageDelayed(5, 1000L);
        }
    }

    public boolean handleMessage(Message message)
    {
        boolean flag1 = true;
        message.what;
        JVM INSTR tableswitch 3 5: default 32
    //                   3 36
    //                   4 115
    //                   5 121;
           goto _L1 _L2 _L3 _L4
_L1:
        boolean flag = false;
_L6:
        return flag;
_L2:
        flag = flag1;
        if (e != null)
        {
            flag = flag1;
            if (e.exists())
            {
                a.info((new StringBuilder("recorded: ")).append(e.getAbsolutePath()).toString());
                flag = flag1;
                if (r != null)
                {
                    r.onFileRecorded(e);
                    e = null;
                    return true;
                }
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        c();
        return true;
_L4:
        flag = flag1;
        if (r != null)
        {
            r.onStoppable();
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        if (l && m && !o)
        {
            if (!u.hasRecordingSurface())
            {
                android.opengl.EGLContext eglcontext = EGL14.eglGetCurrentContext();
                u.send(e.e, eglcontext);
            }
            long l1 = surfacetexture.getTimestamp();
            long l2 = TimeUnit.MILLISECONDS.toNanos(q);
            u.send(e.g, Long.valueOf(l1 - l2));
        }
    }

    public void onPreviewFrame(byte abyte0[], Camera camera)
    {
        if (abyte0 != null && l && !o)
        {
            u.send(e.h, abyte0);
        }
    }

    public void releaseAndWait()
    {
        send(e.d);
    }

    public boolean send(e e1)
    {
        return send(e1, null);
    }

    public boolean send(e e1, Object obj)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.skype.android.media.e.values().length];
                try
                {
                    a[e.l.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[e.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[e.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.n.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.r.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.m.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[e1.ordinal()];
        JVM INSTR tableswitch 1 6: default 48
    //                   1 50
    //                   2 75
    //                   3 82
    //                   4 89
    //                   5 100
    //                   6 111;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return true;
_L2:
        e1 = b.getCamera();
        if (e1 != null)
        {
            e1.addCallbackBuffer((byte[])obj);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        b();
        continue; /* Loop/switch isn't completed */
_L4:
        c();
        continue; /* Loop/switch isn't completed */
_L5:
        a((MediaFormat)obj);
        continue; /* Loop/switch isn't completed */
_L6:
        a((String)obj);
        continue; /* Loop/switch isn't completed */
_L7:
        e1 = (m)obj;
        if (d.block(10000L))
        {
            int i1;
            long l1;
            long l3;
            if ("video/avc".equalsIgnoreCase(e1.c()))
            {
                i1 = h;
            } else
            if ("audio/mp4a-latm".equalsIgnoreCase(e1.c()))
            {
                i1 = g;
            } else
            {
                i1 = -1;
            }
            if (i1 < 0 || o)
            {
                continue; /* Loop/switch isn't completed */
            }
            l3 = e1.d();
            if (q > 0L)
            {
                long l2 = l3 - TimeUnit.MILLISECONDS.toMicros(q);
                if (i1 == h)
                {
                    l1 = l3;
                    if (l2 > B)
                    {
                        l1 = l2;
                    }
                } else
                {
                    l1 = l3;
                    if (i1 == g)
                    {
                        l1 = l3;
                        if (l2 > C)
                        {
                            l1 = l2;
                        }
                    }
                }
            } else
            {
                l1 = l3;
                if (i1 == h)
                {
                    l1 = l3;
                    if (l3 < B)
                    {
                        a.severe((new StringBuilder("video presentation time ")).append(l3).append(" < ").append(B).toString());
                        l1 = B;
                    }
                }
            }
            e1.a().presentationTimeUs = l1;
            try
            {
                c.writeSampleData(i1, e1.b(), e1.a());
            }
            // Misplaced declaration of an exception variable
            catch (e e1)
            {
                if (r != null)
                {
                    r.onException(e1);
                }
            }
            if (i1 == h)
            {
                B = l1;
            } else
            if (i1 == g)
            {
                C = l1;
            }
            continue; /* Loop/switch isn't completed */
        }
        a.severe("muxer failed to start");
        d.open();
        if (true) goto _L1; else goto _L8
_L8:
    }

    public void setAudioBitRate(int i1)
    {
        A = i1;
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
        r = camcordercallback;
    }

    public void setCameraFacing(int i1)
    {
        boolean flag = true;
        if (i1 != 1)
        {
            flag = false;
        }
        n = flag;
        if (u != null)
        {
            u.send(e.f, Boolean.valueOf(n));
        }
    }

    public void setMaxDuration(int i1)
    {
        s = i1;
    }

    public void setRecordingFile(File file)
    {
        if (file == null)
        {
            throw new IllegalArgumentException("null file");
        } else
        {
            e = file;
            return;
        }
    }

    public void setTargetVideoSize(Size size)
    {
        if (size == null)
        {
            throw new IllegalArgumentException("null videoSize");
        } else
        {
            w = size;
            return;
        }
    }

    public void setVideoBitRate(int i1)
    {
        z = i1;
    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        if (r != null)
        {
            r.onException(throwable);
            return;
        } else
        {
            throw new RuntimeException(throwable);
        }
    }

}
