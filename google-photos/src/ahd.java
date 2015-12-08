// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Camera;
import android.view.SurfaceView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Vector;

final class ahd extends ahc
{

    private SurfaceView g;
    private byte h[];
    private byte i[];
    private boolean j;
    private float k[] = {
        0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F
    };
    private Object l;
    private String m;
    private String n;
    private android.hardware.Camera.PreviewCallback o;
    private ahb p;

    ahd(ahb ahb)
    {
        p = ahb;
        super(ahb, (byte)0);
        j = true;
        l = new Object();
        m = "precision mediump float;\n\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_y_texcoord;\nvarying vec2 v_vu_texcoord;\nvarying vec2 v_pixcoord;\n\nvec3 select(vec4 yyyy, vec4 vuvu, int s) {\n  if (s == 0) {\n    return vec3(yyyy.r, vuvu.g, vuvu.r);\n  } else if (s == 1) {\n    return vec3(yyyy.g, vuvu.g, vuvu.r);\n } else if (s == 2) {\n    return vec3(yyyy.b, vuvu.a, vuvu.b);\n  } else  {\n    return vec3(yyyy.a, vuvu.a, vuvu.b);\n  }\n}\n\nvec3 yuv2rgb(vec3 yuv) {\n  mat4 conversion = mat4(1.0,  0.0,    1.402, -0.701,\n                         1.0, -0.344, -0.714,  0.529,\n                         1.0,  1.772,  0.0,   -0.886,\n                         0, 0, 0, 0);  return (vec4(yuv, 1.0) * conversion).rgb;\n}\n\nvoid main() {\n  vec4 yyyy = texture2D(tex_sampler_0, v_y_texcoord);\n  vec4 vuvu = texture2D(tex_sampler_0, v_vu_texcoord);\n  int s = int(mod(floor(v_pixcoord.x), 4.0));\n  vec3 yuv = select(yyyy, vuvu, s);\n  vec3 rgb = yuv2rgb(yuv);\n  gl_FragColor = vec4(rgb, 1.0);\n}";
        n = "attribute vec4 a_position;\nattribute vec2 a_y_texcoord;\nattribute vec2 a_vu_texcoord;\nattribute vec2 a_pixcoord;\nvarying vec2 v_y_texcoord;\nvarying vec2 v_vu_texcoord;\nvarying vec2 v_pixcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_y_texcoord = a_y_texcoord;\n  v_vu_texcoord = a_vu_texcoord;\n  v_pixcoord = a_pixcoord;\n}\n";
        o = new ahe(this);
    }

    private byte[] h()
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        byte abyte0[];
        if (!j)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        abyte0 = h;
_L2:
        return abyte0;
        abyte0 = i;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        Camera camera;
        SurfaceView surfaceview;
        if (a % 4 != 0)
        {
            throw new RuntimeException("Camera width must be a multiple of 4!");
        }
        if (b % 2 != 0)
        {
            throw new RuntimeException("Camera height must be a multiple of 2!");
        }
        camera = ahj.a(e);
        int i1 = a * (b + b / 2);
        h = new byte[i1];
        i = new byte[i1];
        camera.addCallbackBuffer(f());
        camera.setPreviewCallbackWithBuffer(o);
        if (g == null)
        {
            g = e.b.f;
        }
        surfaceview = g;
        if (surfaceview == null)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        camera.setPreviewDisplay(surfaceview.getHolder());
        return;
        IOException ioexception;
        ioexception;
        throw new RuntimeException("Could not start camera with given preview display!");
    }

    public final void a(ahv ahv1, int i1)
    {
        javax.microedition.khronos.egl.EGLContext eglcontext = ajv.e();
        ajz ajz1 = d(eglcontext);
        i1 = a / 4;
        int j1 = b;
        int k1 = b / 2;
        synchronized (l)
        {
            ajz1.a(ByteBuffer.wrap(h()), i1, j1 + k1);
        }
        ajz1.b(10240, 9728);
        ajz1.b(10241, 9728);
        obj = e(eglcontext);
        ((ajl) (obj)).c(k);
        ((ajl) (obj)).a("a_pixcoord", new float[] {
            0.0F, 0.0F, (float)a, 0.0F, 0.0F, (float)b, (float)a, (float)b
        }, 2);
        ahv1.a(new int[] {
            c, d
        });
        ((ajl) (obj)).a(ajz1, ahv1.p(), c, d);
        ahv1.k();
        return;
        ahv1;
        obj;
        JVM INSTR monitorexit ;
        throw ahv1;
    }

    public final void b()
    {
        Vector vector = f;
        vector;
        JVM INSTR monitorenter ;
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((aka)iterator.next()).a(p, 0L)) { }
        break MISSING_BLOCK_LABEL_51;
        Exception exception;
        exception;
        vector;
        JVM INSTR monitorexit ;
        throw exception;
        vector;
        JVM INSTR monitorexit ;
    }

    public final void c()
    {
        i = null;
        h = null;
    }

    protected final ajl d()
    {
        ajl ajl1 = new ajl(n, m);
        ajl1.a("a_y_texcoord", new float[] {
            0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.6666667F, 1.0F, 0.6666667F
        }, 2);
        ajl1.a("a_vu_texcoord", new float[] {
            0.0F, 0.6666667F, 1.0F, 0.6666667F, 0.0F, 1.0F, 1.0F, 1.0F
        }, 2);
        return ajl1;
    }

    protected final ajz e()
    {
        ajz ajz1 = ajz.a();
        ajz1.b(10240, 9728);
        ajz1.b(10241, 9728);
        return ajz1;
    }

    byte[] f()
    {
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        byte abyte0[];
        if (!j)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        abyte0 = i;
_L2:
        return abyte0;
        abyte0 = h;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void g()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = l;
        obj;
        JVM INSTR monitorenter ;
        boolean flag;
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        obj;
        JVM INSTR monitorexit ;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception1;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
