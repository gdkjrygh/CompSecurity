// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import java.util.Iterator;
import java.util.Vector;
import javax.microedition.khronos.egl.EGLContext;

final class ahi extends ahf
{

    private ahb j;

    ahi(ahb ahb)
    {
        j = ahb;
        super(ahb, (byte)0);
    }

    public final void a()
    {
        a(ahj.a(e));
    }

    public final void a(ahv ahv1, int i)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        ajl ajl1;
        obj = ajz.b();
        ajl1 = e(ajv.e());
        if (ajl1 != null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        ahv1 = String.valueOf("Attempting to grab camera frame from unknown thread: ");
        obj = String.valueOf(Thread.currentThread());
        throw new RuntimeException((new StringBuilder(String.valueOf(ahv1).length() + 1 + String.valueOf(obj).length())).append(ahv1).append(((String) (obj))).append("!").toString());
        ahv1;
        this;
        JVM INSTR monitorexit ;
        throw ahv1;
        h.attachToGLContext(((ajz) (obj)).a);
        b(ajl1);
        a(ajl1);
        int ai[] = b.a(c, d, i);
        ahv1.a(ai);
        ajl1.a(((ajz) (obj)), ahv1.p(), ai[0], ai[1]);
        ahv1.a(h.getTimestamp());
        ahv1.k();
        h.detachFromGLContext();
        ((ajz) (obj)).e();
        this;
        JVM INSTR monitorexit ;
    }

    protected final void a(ajl ajl1)
    {
        if (ahj.b(e) == 1 && ahj.c(e))
        {
            ajl1.b(1.0F, 1.0F, -1F, -1F);
            return;
        } else
        {
            ajl1.b(0.0F, 1.0F, 1.0F, -1F);
            return;
        }
    }

    protected final void a(Camera camera)
    {
        super.a(camera);
        h.detachFromGLContext();
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        h.attachToGLContext(g.a);
        h.updateTexImage();
        h.detachFromGLContext();
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        long l = h.getTimestamp();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((aka)iterator.next()).a(j, l)) { }
        break MISSING_BLOCK_LABEL_94;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
    }

    public final void b(EGLContext eglcontext)
    {
    }
}
