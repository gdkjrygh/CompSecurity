// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.Log;
import android.view.SurfaceHolder;
import java.util.HashMap;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

public final class ajv
{

    public static boolean a;
    public static HashMap e = new HashMap();
    private static HashMap f = new HashMap();
    private static HashMap g = new HashMap();
    private static ThreadLocal h = new ThreadLocal();
    private static EGLConfig j = null;
    private static EGLDisplay k;
    private static HashMap p = new HashMap();
    private static int q = 8;
    private static int r = 8;
    private static int s = 8;
    private static int t = 8;
    private static int u = 0;
    private static int v = 0;
    EGLDisplay b;
    public EGLContext c;
    public EGLSurface d;
    private Object i;
    private EGL10 l;
    private int m;
    private boolean n;
    private boolean o;

    ajv(EGLDisplay egldisplay, EGLContext eglcontext, EGLSurface eglsurface, int i1, boolean flag, boolean flag1)
    {
        i = null;
        l = (EGL10)EGLContext.getEGL();
        b = egldisplay;
        c = eglcontext;
        d = eglsurface;
        m = i1;
        n = flag;
        o = flag1;
    }

    public static ajv a()
    {
        return (ajv)h.get();
    }

    public static ajv a(int i1, int j1)
    {
        Object obj1 = (EGL10)EGLContext.getEGL();
        Object obj = ((EGL10) (obj1)).eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (obj == EGL10.EGL_NO_DISPLAY)
        {
            obj = String.valueOf(a(((EGL10) (obj1))));
            if (((String) (obj)).length() != 0)
            {
                obj = "EGL Error: Bad display: ".concat(((String) (obj)));
            } else
            {
                obj = new String("EGL Error: Bad display: ");
            }
            throw new RuntimeException(((String) (obj)));
        }
        if (!((EGL10) (obj1)).eglInitialize(((EGLDisplay) (obj)), new int[2]))
        {
            obj = String.valueOf(a(((EGL10) (obj1))));
            if (((String) (obj)).length() != 0)
            {
                obj = "EGL Error: eglInitialize failed ".concat(((String) (obj)));
            } else
            {
                obj = new String("EGL Error: eglInitialize failed ");
            }
            throw new RuntimeException(((String) (obj)));
        }
        EGLContext eglcontext = ((EGL10) (obj1)).eglCreateContext(((EGLDisplay) (obj)), a(((EGL10) (obj1)), ((EGLDisplay) (obj))), EGL10.EGL_NO_CONTEXT, new int[] {
            12440, 2, 12344
        });
        if (eglcontext == EGL10.EGL_NO_CONTEXT)
        {
            obj = String.valueOf(a(((EGL10) (obj1))));
            if (((String) (obj)).length() != 0)
            {
                obj = "EGL Error: Bad context: ".concat(((String) (obj)));
            } else
            {
                obj = new String("EGL Error: Bad context: ");
            }
            throw new RuntimeException(((String) (obj)));
        } else
        {
            obj1 = ((EGL10) (obj1)).eglCreatePbufferSurface(((EGLDisplay) (obj)), a(((EGL10) (obj1)), ((EGLDisplay) (obj))), new int[] {
                12375, 1, 12374, 1, 12344
            });
            obj = new ajv(((EGLDisplay) (obj)), eglcontext, ((EGLSurface) (obj1)), 0, true, true);
            a(obj1);
            return ((ajv) (obj));
        }
    }

    private static String a(EGL10 egl10)
    {
        int i1 = egl10.eglGetError();
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            return GLUtils.getEGLErrorString(i1);
        }
        egl10 = String.valueOf(Integer.toHexString(i1));
        if (egl10.length() != 0)
        {
            return "EGL Error 0x".concat(egl10);
        } else
        {
            return new String("EGL Error 0x");
        }
    }

    private static EGLConfig a(EGL10 egl10, EGLDisplay egldisplay)
    {
        if (j == null || !egldisplay.equals(k))
        {
            int ai[] = new int[1];
            EGLConfig aeglconfig[] = new EGLConfig[1];
            if (!egl10.eglChooseConfig(egldisplay, new int[] {
    12352, 4, 12324, q, 12323, r, 12322, s, 12321, t, 
    12325, 0, 12326, 0, 12344
}, aeglconfig, 1, ai))
            {
                egl10 = String.valueOf(a(egl10));
                if (egl10.length() != 0)
                {
                    egl10 = "EGL Error: eglChooseConfig failed ".concat(egl10);
                } else
                {
                    egl10 = new String("EGL Error: eglChooseConfig failed ");
                }
                throw new IllegalArgumentException(egl10);
            }
            if (ai[0] > 0)
            {
                j = aeglconfig[0];
                k = egldisplay;
            }
        }
        return j;
    }

    private static void a(Object obj)
    {
        Integer integer = (Integer)g.get(obj);
        if (integer != null)
        {
            g.put(obj, Integer.valueOf(integer.intValue() + 1));
            return;
        } else
        {
            g.put(obj, Integer.valueOf(1));
            return;
        }
    }

    private static void a(EGL10 egl10, String s1)
    {
        int i1 = egl10.eglGetError();
        if (i1 != 12288)
        {
            egl10 = String.valueOf(Integer.toHexString(i1));
            throw new RuntimeException((new StringBuilder(String.valueOf(s1).length() + 32 + String.valueOf(egl10).length())).append("Error executing ").append(s1).append("! EGL error = 0x").append(egl10).toString());
        } else
        {
            return;
        }
    }

    private static void a(EGL10 egl10, EGLSurface eglsurface)
    {
        if (eglsurface == EGL10.EGL_NO_SURFACE)
        {
            egl10 = String.valueOf(a(egl10));
            if (egl10.length() != 0)
            {
                egl10 = "EGL Error: Bad surface: ".concat(egl10);
            } else
            {
                egl10 = new String("EGL Error: Bad surface: ");
            }
            throw new RuntimeException(egl10);
        } else
        {
            return;
        }
    }

    public static void c()
    {
        EGL10 egl10 = (EGL10)EGLContext.getEGL();
        egl10.eglMakeCurrent(egl10.eglGetCurrentDisplay(), EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
        h.set(null);
        a(egl10, "eglMakeCurrent");
    }

    public static EGLContext e()
    {
        ajv ajv1 = a();
        if (ajv1 != null)
        {
            return ajv1.c;
        } else
        {
            return EGL10.EGL_NO_CONTEXT;
        }
    }

    public final ajv a(SurfaceTexture surfacetexture)
    {
        EGLConfig eglconfig = a(l, b);
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        EGLSurface eglsurface = (EGLSurface)f.get(surfacetexture);
        if (eglsurface != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        eglsurface = l.eglCreateWindowSurface(b, eglconfig, surfacetexture, null);
        f.put(surfacetexture, eglsurface);
        obj;
        JVM INSTR monitorexit ;
        a(l, "eglCreateWindowSurface");
        a(l, eglsurface);
        obj = new ajv(b, c, eglsurface, 0, false, true);
        obj.i = surfacetexture;
        a(eglsurface);
        return ((ajv) (obj));
        surfacetexture;
        obj;
        JVM INSTR monitorexit ;
        throw surfacetexture;
    }

    public final ajv a(SurfaceHolder surfaceholder)
    {
        EGLConfig eglconfig = a(l, b);
        Object obj = f;
        obj;
        JVM INSTR monitorenter ;
        EGLSurface eglsurface = (EGLSurface)f.get(surfaceholder);
        if (eglsurface != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        eglsurface = l.eglCreateWindowSurface(b, eglconfig, surfaceholder, null);
        f.put(surfaceholder, eglsurface);
        obj;
        JVM INSTR monitorexit ;
        a(l, "eglCreateWindowSurface");
        a(l, eglsurface);
        obj = new ajv(b, c, eglsurface, 0, false, true);
        a(eglsurface);
        obj.i = surfaceholder;
        return ((ajv) (obj));
        surfaceholder;
        obj;
        JVM INSTR monitorexit ;
        throw surfaceholder;
    }

    public final void b()
    {
        if ((ajv)h.get() != this)
        {
            l.eglMakeCurrent(b, h(), h(), c);
            h.set(this);
        }
        int ai[] = new int[1];
        GLES20.glGetIntegerv(36006, ai, 0);
        if (ai[0] != m)
        {
            GLES20.glBindFramebuffer(36160, m);
            b.b("glBindFramebuffer");
        }
    }

    public final void d()
    {
        l.eglSwapBuffers(b, h());
    }

    public final void f()
    {
        if (n)
        {
            l.eglDestroyContext(b, c);
            c = EGL10.EGL_NO_CONTEXT;
        }
        if (!o) goto _L2; else goto _L1
_L1:
        HashMap hashmap = f;
        hashmap;
        JVM INSTR monitorenter ;
        Object obj;
        Integer integer;
        obj = d;
        integer = (Integer)g.get(obj);
        if (integer == null) goto _L4; else goto _L3
_L3:
        if (integer.intValue() <= 0) goto _L4; else goto _L5
_L5:
        integer = Integer.valueOf(integer.intValue() - 1);
        g.put(obj, integer);
        boolean flag;
        if (integer.intValue() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L7:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        l.eglDestroySurface(b, d);
        d = EGL10.EGL_NO_SURFACE;
        f.remove(i);
        hashmap;
        JVM INSTR monitorexit ;
_L2:
        if (m != 0)
        {
            b.d(m);
        }
        return;
_L4:
        obj = String.valueOf(obj);
        Log.e("RenderTarget", (new StringBuilder(String.valueOf(obj).length() + 41)).append("Removing reference of already released: ").append(((String) (obj))).append("!").toString());
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ajl g()
    {
        ajl ajl2 = (ajl)p.get(c);
        ajl ajl1 = ajl2;
        if (ajl2 == null)
        {
            ajl1 = ajl.a();
            p.put(c, ajl1);
        }
        return ajl1;
    }

    EGLSurface h()
    {
        EGLSurface eglsurface;
        if (a)
        {
            eglsurface = d;
        } else
        {
            EGLSurface eglsurface1 = (EGLSurface)e.get(c);
            eglsurface = eglsurface1;
            if (eglsurface1 == null)
            {
                return d;
            }
        }
        return eglsurface;
    }

    public final String toString()
    {
        String s1 = String.valueOf(b);
        String s2 = String.valueOf(c);
        String s3 = String.valueOf(d);
        int i1 = m;
        return (new StringBuilder(String.valueOf(s1).length() + 31 + String.valueOf(s2).length() + String.valueOf(s3).length())).append("RenderTarget(").append(s1).append(", ").append(s2).append(", ").append(s3).append(", ").append(i1).append(")").toString();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        new HashMap();
    }
}
