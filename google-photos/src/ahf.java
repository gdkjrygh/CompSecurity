// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLContext;

class ahf extends ahc
{

    public ajz g;
    public SurfaceTexture h;
    final ahb i;
    private float j[];
    private HashMap k;
    private HashMap l;
    private ajl m;
    private android.graphics.SurfaceTexture.OnFrameAvailableListener n;

    private ahf(ahb ahb)
    {
        i = ahb;
        super(ahb, (byte)0);
        j = new float[16];
        g = null;
        h = null;
        k = new HashMap();
        l = new HashMap();
        m = null;
        n = new ahh(this);
    }

    ahf(ahb ahb, byte byte0)
    {
        this(ahb);
    }

    private ajl f()
    {
        if (m == null)
        {
            m = new ajl("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
        }
        return m;
    }

    private SurfaceTexture f(EGLContext eglcontext)
    {
        SurfaceTexture surfacetexture1 = (SurfaceTexture)k.get(eglcontext);
        SurfaceTexture surfacetexture = surfacetexture1;
        if (surfacetexture1 == null)
        {
            ajz ajz1 = d(eglcontext);
            surfacetexture = surfacetexture1;
            if (ajz1 != null)
            {
                surfacetexture = new SurfaceTexture(ajz1.a);
                surfacetexture.setDefaultBufferSize(c, d);
                k.put(eglcontext, surfacetexture);
            }
        }
        return surfacetexture;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        a(ahj.a(e));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(ahv ahv1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        ajl ajl1;
        Object obj1;
        obj1 = ajv.e();
        obj = d(((EGLContext) (obj1)));
        ajl1 = e(((EGLContext) (obj1)));
        obj1 = f(((EGLContext) (obj1)));
        if (obj != null && ajl1 != null && obj1 != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ahv1 = String.valueOf("Attempting to grab camera frame from unknown thread: ");
        obj = String.valueOf(Thread.currentThread());
        throw new RuntimeException((new StringBuilder(String.valueOf(ahv1).length() + 1 + String.valueOf(obj).length())).append(ahv1).append(((String) (obj))).append("!").toString());
        ahv1;
        this;
        JVM INSTR monitorexit ;
        throw ahv1;
        ((SurfaceTexture) (obj1)).updateTexImage();
        int ai[] = b.a(c, d, i1);
        ahv1.a(ai);
        ajl1.a(((ajz) (obj)), ahv1.p(), ai[0], ai[1]);
        ahv1.a(h.getTimestamp());
        ahv1.k();
        this;
        JVM INSTR monitorexit ;
    }

    protected void a(ajl ajl1)
    {
        if (ahj.b(e) == 1 && ahj.c(e))
        {
            ajl1.b(1.0F, 0.0F, -1F, 1.0F);
            return;
        } else
        {
            ajl1.b(0.0F, 0.0F, 1.0F, 1.0F);
            return;
        }
    }

    protected void a(Camera camera)
    {
        if (g == null)
        {
            g = ajz.b();
        }
        if (h == null)
        {
            h = new SurfaceTexture(g.a);
            try
            {
                camera.setPreviewTexture(h);
            }
            // Misplaced declaration of an exception variable
            catch (Camera camera)
            {
                camera = String.valueOf(camera.getMessage());
                throw new RuntimeException((new StringBuilder(String.valueOf(camera).length() + 40)).append("Could not bind camera surface texture: ").append(camera).append("!").toString());
            }
            h.setOnFrameAvailableListener(n);
        }
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator;
        h.updateTexImage();
        b(f());
        a(f());
        iterator = k.values().iterator();
_L1:
        ajv ajv2;
        SurfaceTexture surfacetexture;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_138;
        }
        surfacetexture = (SurfaceTexture)iterator.next();
        ajv2 = (ajv)l.get(surfacetexture);
        ajv ajv1;
        ajv1 = ajv2;
        if (ajv2 != null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        ajv1 = ajv.a().a(surfacetexture);
        l.put(surfacetexture, ajv1);
        ajv1.b();
        f().a(g, ajv1, c, d);
        b.b("distribute frames");
        ajv1.d();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    protected final void b(ajl ajl1)
    {
        h.getTransformMatrix(j);
        ajl1.b(j);
    }

    public void b(EGLContext eglcontext)
    {
        this;
        JVM INSTR monitorenter ;
        java.util.Set set = a(eglcontext);
        d(eglcontext);
        e(eglcontext);
        f(eglcontext).setOnFrameAvailableListener(new ahg(this, set));
        this;
        JVM INSTR monitorexit ;
        return;
        eglcontext;
        throw eglcontext;
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            g.e();
            g = null;
        }
        if (h != null)
        {
            h.release();
            h = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected final void c(EGLContext eglcontext)
    {
        super.c(eglcontext);
        SurfaceTexture surfacetexture = (SurfaceTexture)k.get(eglcontext);
        if (surfacetexture != null)
        {
            surfacetexture.release();
            k.remove(eglcontext);
        }
    }

    protected final ajl d()
    {
        return new ajl("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n");
    }

    protected final ajz e()
    {
        return ajz.b();
    }
}
