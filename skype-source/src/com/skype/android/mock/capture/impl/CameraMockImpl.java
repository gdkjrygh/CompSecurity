// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mock.capture.impl;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.skype.android.mock.capture.CameraMock;
import com.skype.android.platform.capture.Camera;
import com.skype.android.platform.capture.CameraCallback;
import com.skype.android.platform.capture.CameraCapabilities;
import com.skype.android.platform.capture.CameraManager;
import com.skype.android.platform.capture.CameraManagerFactory;
import com.skype.android.platform.capture.CameraParameters;
import com.skype.android.platform.capture.CaptureException;
import com.skype.android.video.hw.format.Resolution;
import java.io.IOException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.skype.android.mock.capture.impl:
//            CameraManagerMockImpl

public class CameraMockImpl
    implements CameraMock, Camera
{
    public static class Factory
        implements CameraManagerFactory
    {

        public CameraManager createCameraManager()
        {
            return new CameraManagerMockImpl();
        }

        public Factory()
        {
        }
    }


    private final BlockingQueue a = new LinkedBlockingQueue();
    private final int b;
    private final CameraCapabilities c;
    private final CameraManagerMockImpl.CloseCallback d;
    private final Handler e;
    private CameraParameters f;
    private Object g;
    private int h;
    private CameraCallback i;
    private boolean j;
    private boolean k;

    public CameraMockImpl(int l, CameraCapabilities cameracapabilities, CameraParameters cameraparameters, CameraManagerMockImpl.CloseCallback closecallback)
    {
        j = true;
        b = l;
        c = cameracapabilities.f();
        f = cameraparameters.d();
        d = closecallback;
        cameraparameters = Looper.myLooper();
        cameracapabilities = cameraparameters;
        if (cameraparameters == null)
        {
            cameracapabilities = Looper.getMainLooper();
        }
        if (cameracapabilities != null)
        {
            cameracapabilities = new Handler(cameracapabilities) {

                final CameraMockImpl a;

                public final void handleMessage(Message message)
                {
                    CameraMockImpl.a(a).onFrame((byte[])message.obj, a);
                }

            
            {
                a = CameraMockImpl.this;
                super(looper);
            }
            };
        } else
        {
            cameracapabilities = null;
        }
        e = cameracapabilities;
    }

    static CameraCallback a(CameraMockImpl cameramockimpl)
    {
        return cameramockimpl.i;
    }

    private static String a(Iterable iterable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[");
        byte abyte0[];
        for (iterable = iterable.iterator(); iterable.hasNext(); stringbuilder.append((new StringBuilder("byte[")).append(abyte0.length).append("]@").append(Integer.toHexString(System.identityHashCode(abyte0))).toString()))
        {
            abyte0 = (byte[])iterable.next();
        }

        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public final CameraCapabilities a()
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Camera is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        CameraCapabilities cameracapabilities = c.f();
        this;
        JVM INSTR monitorexit ;
        return cameracapabilities;
    }

    public final void a(int l)
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Camera is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (l >= 0 && l < 360 && l % 90 == 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        throw new IllegalArgumentException("degrees is out of range [0, 360) or not divisible by 90");
        h = l;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(CameraCallback cameracallback)
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Camera is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        cameracallback;
        this;
        JVM INSTR monitorexit ;
        throw cameracallback;
        if (k)
        {
            throw new IllegalStateException("Camera is started");
        }
        i = cameracallback;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(CameraParameters cameraparameters)
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Camera is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        cameraparameters;
        this;
        JVM INSTR monitorexit ;
        throw cameraparameters;
        if (k)
        {
            throw new IllegalStateException("Camera is started");
        }
        if (!c.c().contains(cameraparameters.a()))
        {
            throw new CaptureException((new StringBuilder("Resolution ")).append(cameraparameters.a()).append(" is not supported").toString());
        }
        if (!c.d().contains(cameraparameters.c()))
        {
            throw new CaptureException((new StringBuilder("FPS range ")).append(cameraparameters.c()).append(" is not supported").toString());
        }
        if (!c.b().contains(cameraparameters.b()))
        {
            throw new CaptureException((new StringBuilder("Image format ")).append(cameraparameters.b()).append(" is not supported").toString());
        }
        f = cameraparameters.d();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(Object obj)
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Camera is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (k)
        {
            throw new IllegalStateException("Camera is started");
        }
        g = obj;
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(byte abyte0[])
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = j;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (abyte0 != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        throw new IllegalArgumentException("callbackBuffer is null");
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        if (!k && abyte0.length < b().a().getWidth() * b().a().getHeight())
        {
            throw new IllegalArgumentException("callbackBuffer is too small");
        }
        a.add(abyte0);
          goto _L1
    }

    public final CameraParameters b()
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Camera is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        CameraParameters cameraparameters = f.d();
        this;
        JVM INSTR monitorexit ;
        return cameraparameters;
    }

    public final void c()
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Camera is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (k)
        {
            throw new IllegalStateException("Camera is already started");
        }
        k = true;
        this;
        JVM INSTR monitorexit ;
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        j = false;
        d.a(b);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void d()
        throws CaptureException
    {
        this;
        JVM INSTR monitorenter ;
        if (!j)
        {
            throw new IllegalStateException("Camera is closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!k)
        {
            throw new IllegalStateException("Camera is not started");
        }
        k = false;
        this;
        JVM INSTR monitorexit ;
    }

    public String toString()
    {
        this;
        JVM INSTR monitorenter ;
        String s = (new StringBuilder()).append(getClass().getSimpleName()).append(" [id=").append(b).append(", capabilities=").append(c).append(", parameters=").append(f).append(", surfaceHolder=").append(g).append(", displayOrientation=").append(h).append(", callbackBuffers=").append(a(a)).append(", cb=").append(i).append(", isOpen=").append(j).append(", isStarted=").append(k).append("]").toString();
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
