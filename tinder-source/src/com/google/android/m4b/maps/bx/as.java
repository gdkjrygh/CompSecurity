// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.m4b.maps.ay.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public class as extends SurfaceView
    implements android.view.SurfaceHolder.Callback
{
    abstract class a
        implements d
    {

        private int a[];
        private as b;

        public final EGLConfig a(EGL10 egl10, EGLDisplay egldisplay)
        {
            int ai[] = new int[1];
            if (!egl10.eglChooseConfig(egldisplay, a, null, 0, ai))
            {
                throw new IllegalArgumentException("eglChooseConfig failed");
            }
            int i1 = ai[0];
            if (i1 <= 0)
            {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig aeglconfig[] = new EGLConfig[i1];
            if (!egl10.eglChooseConfig(egldisplay, a, aeglconfig, i1, ai))
            {
                throw new IllegalArgumentException("eglChooseConfig#2 failed");
            }
            egl10 = a(egl10, egldisplay, aeglconfig);
            if (egl10 == null)
            {
                throw new IllegalArgumentException("No config chosen");
            } else
            {
                return egl10;
            }
        }

        abstract EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[]);

        public a(int ai[])
        {
            b = as.this;
            super();
            as.B();
            a = ai;
        }
    }

    class b extends a
    {

        private int a[];
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private as h;

        private int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i1)
        {
            int j1 = 0;
            if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, i1, a))
            {
                j1 = a[0];
            }
            return j1;
        }

        public final EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[])
        {
            int j1 = aeglconfig.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                EGLConfig eglconfig = aeglconfig[i1];
                int k1 = a(egl10, egldisplay, eglconfig, 12325);
                int l1 = a(egl10, egldisplay, eglconfig, 12326);
                if (k1 < f || l1 < g)
                {
                    continue;
                }
                k1 = a(egl10, egldisplay, eglconfig, 12324);
                l1 = a(egl10, egldisplay, eglconfig, 12323);
                int i2 = a(egl10, egldisplay, eglconfig, 12322);
                int j2 = a(egl10, egldisplay, eglconfig, 12321);
                if (k1 == b && l1 == c && i2 == d && j2 == e)
                {
                    return eglconfig;
                }
            }

            return null;
        }

        public b()
        {
            h = as.this;
            super(new int[] {
                12324, 5, 12323, 6, 12322, 5, 12321, 0, 12325, 16, 
                12326, 0, 12344
            });
            a = new int[1];
            b = 5;
            c = 6;
            d = 5;
            e = 0;
            f = 16;
            g = 0;
        }
    }

    final class c
        implements e
    {

        private int a;
        private as b;

        public final EGLContext a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
        {
            int i1 = a;
            as.B();
            EGLContext eglcontext = EGL10.EGL_NO_CONTEXT;
            as.B();
            return egl10.eglCreateContext(egldisplay, eglconfig, eglcontext, null);
        }

        public final void a(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext)
        {
            if (!egl10.eglDestroyContext(egldisplay, eglcontext))
            {
                if (ab.a("DefaultContextFactory", 6))
                {
                    egldisplay = String.valueOf(egldisplay);
                    eglcontext = String.valueOf(eglcontext);
                    Log.e("DefaultContextFactory", (new StringBuilder(String.valueOf(egldisplay).length() + 18 + String.valueOf(eglcontext).length())).append("display:").append(egldisplay).append(" context: ").append(eglcontext).toString());
                }
                g.a("eglDestroyContex", egl10.eglGetError());
            }
        }

        private c()
        {
            b = as.this;
            super();
            a = 12440;
        }

        c(byte byte0)
        {
            this();
        }
    }

    public static interface d
    {

        public abstract EGLConfig a(EGL10 egl10, EGLDisplay egldisplay);
    }

    public static interface e
    {

        public abstract EGLContext a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig);

        public abstract void a(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext);
    }

    public static final class f
    {

        public static EGLSurface a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, Object obj)
        {
            Object obj1 = null;
            try
            {
                egl10 = egl10.eglCreateWindowSurface(egldisplay, eglconfig, obj, null);
            }
            // Misplaced declaration of an exception variable
            catch (EGLDisplay egldisplay)
            {
                egl10 = obj1;
                if (ab.a("GLSurfaceView", 6))
                {
                    Log.e("GLSurfaceView", "eglCreateWindowSurface", egldisplay);
                    return null;
                }
            }
            return egl10;
        }

        private f()
        {
        }

        f(byte byte0)
        {
            this();
        }
    }

    static final class g
    {

        WeakReference a;
        EGL10 b;
        EGLDisplay c;
        EGLSurface d;
        EGLConfig e;
        EGLContext f;

        public static void a(String s1, int i1)
        {
            throw new RuntimeException(b(s1, i1));
        }

        public static void a(String s1, String s2, int i1)
        {
            if (ab.a(s1, 5))
            {
                Log.w(s1, b(s2, i1));
            }
        }

        private static String b(String s1, int i1)
        {
            return (new StringBuilder(String.valueOf(s1).length() + 20)).append(s1).append(" failed: ").append(i1).toString();
        }

        final void a()
        {
            if (d != null && d != EGL10.EGL_NO_SURFACE)
            {
                b.eglMakeCurrent(c, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                as as1 = (as)a.get();
                if (as1 != null)
                {
                    as.c(as1);
                    b.eglDestroySurface(c, d);
                }
                d = null;
            }
        }

        public final void b()
        {
            if (f != null)
            {
                as as1 = (as)a.get();
                if (as1 != null)
                {
                    as.b(as1).a(b, c, f);
                }
                f = null;
            }
            if (c != null)
            {
                b.eglTerminate(c);
                c = null;
            }
        }

        public g(WeakReference weakreference)
        {
            a = weakreference;
        }
    }

    static final class h extends Thread
    {

        boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        int i;
        int j;
        boolean k;
        boolean l;
        boolean m;
        private boolean n;
        private boolean o;
        private int p;
        private ArrayList q;
        private g r;
        private WeakReference s;

        static boolean a(h h1)
        {
            h1.a = true;
            return true;
        }

        private void e()
        {
            if (g)
            {
                g = false;
                r.a();
            }
        }

        private void f()
        {
            if (f)
            {
                r.b();
                f = false;
                as.E().b(this);
            }
        }

        private void g()
        {
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            int k3;
            r = new g(s);
            f = false;
            g = false;
            k1 = 0;
            obj3 = null;
            j2 = 0;
            l2 = 0;
            j3 = 0;
            obj = null;
            l1 = 0;
            k2 = 0;
            i3 = 0;
            k3 = 0;
            j1 = 0;
            i2 = 0;
_L5:
            Object obj4 = as.E();
            obj4;
            JVM INSTR monitorenter ;
            int k4 = j2;
_L34:
            if (!n)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            obj4;
            JVM INSTR monitorexit ;
            synchronized (as.E())
            {
                e();
                f();
            }
            return;
            obj3;
            obj;
            JVM INSTR monitorexit ;
            throw obj3;
            if (q.isEmpty()) goto _L2; else goto _L1
_L1:
            obj = (Runnable)q.remove(0);
            int l3 = j3;
            j2 = k2;
            int j5 = l1;
            int l4 = i2;
            k2 = k3;
            j3 = i3;
            i3 = l2;
            l2 = j2;
            l1 = k4;
            i2 = j5;
            j2 = k1;
            k1 = l4;
            k3 = l3;
_L27:
            obj4;
            JVM INSTR monitorexit ;
            if (obj == null) goto _L4; else goto _L3
_L3:
            ((Runnable) (obj)).run();
            k4 = j2;
            j2 = l1;
            obj = null;
            l1 = i2;
            int i4 = k2;
            i2 = k1;
            k1 = k4;
            k2 = l2;
            l2 = i3;
            i3 = j3;
            j3 = k3;
            k3 = i4;
              goto _L5
_L2:
            if (c == b) goto _L7; else goto _L6
_L6:
            boolean flag;
            flag = b;
            c = b;
            as.E().notifyAll();
_L60:
            j2 = l1;
            if (!h)
            {
                break MISSING_BLOCK_LABEL_293;
            }
            e();
            f();
            h = false;
            j2 = 1;
            int j4;
            j4 = l2;
            if (l2 == 0)
            {
                break MISSING_BLOCK_LABEL_313;
            }
            e();
            f();
            j4 = 0;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_329;
            }
            if (g)
            {
                e();
            }
            if (!flag) goto _L9; else goto _L8
_L8:
            if (!f) goto _L9; else goto _L10
_L10:
            Object obj6 = (as)s.get();
            if (obj6 != null) goto _L12; else goto _L11
_L11:
            boolean flag1 = false;
_L28:
            if (!flag1) goto _L14; else goto _L13
_L13:
            if (!as.E().a()) goto _L9; else goto _L14
_L14:
            f();
_L9:
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_400;
            }
            if (as.E().b())
            {
                r.b();
            }
            if (!d && !e)
            {
                if (g)
                {
                    e();
                }
                e = true;
                o = false;
                as.E().notifyAll();
            }
            if (d && e)
            {
                e = false;
                as.E().notifyAll();
            }
            l2 = i2;
            if (i2 == 0)
            {
                break MISSING_BLOCK_LABEL_492;
            }
            k4 = 0;
            l2 = 0;
            l = true;
            as.E().notifyAll();
            int i5;
            int k5;
            int l5;
            int i6;
            l1 = j2;
            i6 = k2;
            l5 = i3;
            k5 = j3;
            i5 = k3;
            if (!a()) goto _L16; else goto _L15
_L15:
            l1 = j2;
            i2 = k3;
            if (f) goto _L18; else goto _L17
_L17:
            if (j2 == 0) goto _L20; else goto _L19
_L19:
            l1 = 0;
            i2 = k3;
_L18:
            if (!f || g) goto _L22; else goto _L21
_L21:
            g = true;
            j3 = 1;
            k2 = 1;
            j2 = 1;
_L59:
            if (!g) goto _L24; else goto _L23
_L23:
            if (!m) goto _L26; else goto _L25
_L25:
            k2 = 1;
            k1 = i;
            j1 = j;
            j3 = 1;
            i3 = 1;
            m = false;
_L58:
            k = false;
            as.E().notifyAll();
            k4 = j4;
            j4 = i2;
            i5 = j3;
            j3 = j2;
            j2 = k1;
            k1 = l2;
            k3 = i3;
            i2 = l1;
            l1 = i5;
            l2 = k2;
            i3 = k4;
            k2 = j4;
              goto _L27
_L12:
            flag1 = as.d(((as) (obj6)));
              goto _L28
_L20:
            obj6 = as.E();
            if (((i) (obj6)).b != this && ((i) (obj6)).b != null) goto _L30; else goto _L29
_L29:
            obj6.b = this;
            obj6.notifyAll();
            i5 = 1;
_L32:
            l1 = j2;
            i2 = k3;
            if (i5 == 0) goto _L18; else goto _L31
_L31:
            obj6 = r;
            com.google.android.m4b.maps.av.a.a();
            obj6.b = (EGL10)EGLContext.getEGL();
            obj6.c = ((g) (obj6)).b.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (((g) (obj6)).c == EGL10.EGL_NO_DISPLAY)
            {
                throw new RuntimeException("eglGetDisplay failed");
            }
            break MISSING_BLOCK_LABEL_876;
            Object obj1;
            obj1;
            as.E().b(this);
            throw obj1;
            obj1;
            obj4;
            JVM INSTR monitorexit ;
            throw obj1;
            obj3;
            synchronized (as.E())
            {
                e();
                f();
            }
            throw obj3;
_L30:
            ((i) (obj6)).c();
            if (!((i) (obj6)).a)
            {
                break MISSING_BLOCK_LABEL_847;
            }
            i5 = 1;
              goto _L32
            if (((i) (obj6)).b != null)
            {
                ((i) (obj6)).b.h = true;
                as.E().notifyAll();
            }
            i5 = 0;
              goto _L32
            as as1;
            int ai[] = new int[2];
            if (!((g) (obj6)).b.eglInitialize(((g) (obj6)).c, ai))
            {
                throw new RuntimeException("eglInitialize failed");
            }
            as1 = (as)((g) (obj6)).a.get();
            if (as1 != null)
            {
                break MISSING_BLOCK_LABEL_1011;
            }
            obj6.e = null;
            obj6.f = null;
_L33:
            if (((g) (obj6)).f == null || ((g) (obj6)).f == EGL10.EGL_NO_CONTEXT)
            {
                obj6.f = null;
                g.a("createContext", ((g) (obj6)).b.eglGetError());
            }
            obj6.d = null;
            com.google.android.m4b.maps.av.a.b();
            f = true;
            i2 = 1;
            as.E().notifyAll();
            l1 = j2;
              goto _L18
            obj6.e = as.a(as1).a(((g) (obj6)).b, ((g) (obj6)).c);
            obj6.f = as.b(as1).a(((g) (obj6)).b, ((g) (obj6)).c, ((g) (obj6)).e);
              goto _L33
_L24:
            i5 = i2;
            k5 = j3;
            l5 = j2;
            i6 = k2;
_L16:
            as.E().wait();
            i2 = l2;
            k2 = i6;
            l2 = j4;
            i3 = l5;
            j3 = k5;
            k3 = i5;
              goto _L34
_L4:
            if (k3 == 0) goto _L36; else goto _L35
_L35:
            obj5 = r;
            if (((g) (obj5)).b == null)
            {
                throw new RuntimeException("egl not initialized");
            }
            if (((g) (obj5)).c == null)
            {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (((g) (obj5)).e == null)
            {
                throw new RuntimeException("mEglConfig not initialized");
            }
            ((g) (obj5)).a();
            obj6 = (as)((g) (obj5)).a.get();
            if (obj6 == null) goto _L38; else goto _L37
_L37:
            as.c(((as) (obj6)));
            obj5.d = f.a(((g) (obj5)).b, ((g) (obj5)).c, ((g) (obj5)).e, ((as) (obj6)).getHolder());
_L44:
            if (((g) (obj5)).d != null && ((g) (obj5)).d != EGL10.EGL_NO_SURFACE) goto _L40; else goto _L39
_L39:
            if (((g) (obj5)).b.eglGetError() == 12299 && ab.a("EglHelper", 6))
            {
                Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
              goto _L41
_L45:
            if (j4 != 0) goto _L43; else goto _L42
_L42:
            synchronized (as.E())
            {
                o = true;
                as.E().notifyAll();
            }
            k4 = j2;
            j2 = l1;
            l1 = i2;
            j4 = k2;
            i2 = k1;
            k1 = k4;
            k2 = l2;
            l2 = i3;
            i3 = j3;
            j3 = k3;
            k3 = j4;
              goto _L5
_L38:
            obj5.d = null;
              goto _L44
_L40:
            if (((g) (obj5)).b.eglMakeCurrent(((g) (obj5)).c, ((g) (obj5)).d, ((g) (obj5)).d, ((g) (obj5)).f))
            {
                break MISSING_BLOCK_LABEL_1414;
            }
            g.a("EGLHelper", "eglMakeCurrent", ((g) (obj5)).b.eglGetError());
            j4 = 0;
              goto _L45
            j4 = 1;
              goto _L45
            obj2;
            obj5;
            JVM INSTR monitorexit ;
            throw obj2;
_L36:
            if (j3 == 0)
            {
                break MISSING_BLOCK_LABEL_1479;
            }
            obj3 = r;
            obj5 = ((g) (obj3)).f.getGL();
            if ((as)((g) (obj3)).a.get() != null)
            {
                as.C();
                as.D();
            }
            obj3 = (GL10)obj5;
            as.E().a(((GL10) (obj3)));
            j3 = 0;
            j4 = k2;
            if (k2 == 0) goto _L47; else goto _L46
_L46:
            obj5 = (as)s.get();
            if (obj5 == null) goto _L49; else goto _L48
_L48:
            as.e(((as) (obj5))).a(((GL10) (obj3)));
              goto _L49
_L47:
            k2 = l2;
            if (l2 == 0) goto _L51; else goto _L50
_L50:
            obj5 = (as)s.get();
            if (obj5 == null) goto _L53; else goto _L52
_L52:
            as.e(((as) (obj5))).a(((GL10) (obj3)), j2, j1);
              goto _L53
_L51:
            obj5 = (as)s.get();
            if (obj5 == null)
            {
                break MISSING_BLOCK_LABEL_1582;
            }
            as.e(((as) (obj5))).b(((GL10) (obj3)));
            System.nanoTime();
            obj5 = r;
            if (((g) (obj5)).b.eglSwapBuffers(((g) (obj5)).c, ((g) (obj5)).d)) goto _L55; else goto _L54
_L54:
            k4 = ((g) (obj5)).b.eglGetError();
              goto _L56
_L61:
            g.a("GLThread", "eglSwapBuffers", k4);
            synchronized (as.E())
            {
                o = true;
                as.E().notifyAll();
            }
            l2 = i3;
              goto _L57
            obj2;
            i1;
            JVM INSTR monitorexit ;
            throw obj2;
            exception;
            obj2;
            JVM INSTR monitorexit ;
            throw exception;
_L26:
            i3 = j3;
            j3 = k4;
              goto _L58
_L22:
            j2 = i3;
              goto _L59
_L7:
            flag = false;
              goto _L60
_L41:
            j4 = 0;
              goto _L45
_L43:
            k3 = 0;
              goto _L36
_L49:
            j4 = 0;
              goto _L47
_L53:
            k2 = 0;
              goto _L51
_L56:
            l2 = i3;
            k4;
            JVM INSTR lookupswitch 2: default 1760
        //                       12288: 1763
        //                       12302: 1814;
               goto _L61 _L62 _L63
_L62:
            break; /* Loop/switch isn't completed */
_L63:
            break MISSING_BLOCK_LABEL_1814;
_L57:
            if (l1 != 0)
            {
                k1 = 1;
            }
            k4 = k1;
            i3 = j3;
            j3 = k3;
            k1 = j2;
            j2 = l1;
            l1 = i2;
            i2 = k4;
            k3 = j4;
              goto _L5
_L55:
            k4 = 12288;
              goto _L56
            l2 = 1;
              goto _L57
        }

        public final void a(int i1)
        {
            if (i1 < 0 || i1 > 1)
            {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (as.E())
            {
                p = i1;
                as.E().notifyAll();
            }
            return;
            exception;
            j1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        final boolean a()
        {
            return !c && d && !o && i > 0 && j > 0 && (k || p == 1);
        }

        public final int b()
        {
            int j1;
            synchronized (as.E())
            {
                j1 = p;
            }
            return j1;
            exception;
            i1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void c()
        {
            i i1 = as.E();
            i1;
            JVM INSTR monitorenter ;
            n = true;
            as.E().notifyAll();
_L1:
            boolean flag = a;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            as.E().wait();
              goto _L1
            Object obj;
            obj;
            Thread.currentThread().interrupt();
              goto _L1
            obj;
            i1;
            JVM INSTR monitorexit ;
            throw obj;
            i1;
            JVM INSTR monitorexit ;
        }

        public final boolean d()
        {
            boolean flag;
            synchronized (as.E())
            {
                flag = a;
            }
            return flag;
            exception;
            i1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void run()
        {
            long l1 = getId();
            setName((new StringBuilder(29)).append("GLThread ").append(l1).toString());
            g();
            as.E().a(this);
            return;
            Object obj;
            obj;
            as.E().a(this);
            return;
            obj;
            throw obj;
            obj;
            as.E().a(this);
            throw obj;
            obj;
            ((Exception) (obj)).printStackTrace();
            as.E().a(this);
            return;
        }

        h(WeakReference weakreference)
        {
            q = new ArrayList();
            m = true;
            i = 0;
            j = 0;
            k = true;
            p = 1;
            s = weakreference;
        }
    }

    static final class i
    {

        private static String c = "GLThreadManager";
        boolean a;
        h b;
        private boolean d;
        private int e;
        private boolean f;
        private boolean g;

        public final void a(h h1)
        {
            this;
            JVM INSTR monitorenter ;
            h.a(h1);
            if (b == h1)
            {
                b = null;
            }
            notifyAll();
            this;
            JVM INSTR monitorexit ;
            return;
            h1;
            throw h1;
        }

        public final void a(GL10 gl10)
        {
            boolean flag1 = false;
            this;
            JVM INSTR monitorenter ;
            if (f) goto _L2; else goto _L1
_L1:
            c();
            gl10 = gl10.glGetString(7937);
            if (e >= 0x20000)
            {
                break MISSING_BLOCK_LABEL_54;
            }
            boolean flag;
            if (!gl10.startsWith("Q3Dimension MSM7500 "))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
            notifyAll();
            if (!a) goto _L4; else goto _L3
_L3:
            flag = flag1;
            if (!gl10.startsWith("Adreno")) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (android.os.Build.VERSION.SDK_INT >= 11) goto _L6; else goto _L4
_L6:
            g = flag;
            f = true;
_L2:
            this;
            JVM INSTR monitorexit ;
            return;
            gl10;
            throw gl10;
_L4:
            flag = true;
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final boolean a()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = g;
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        public final void b(h h1)
        {
            if (b == h1)
            {
                b = null;
            }
            notifyAll();
        }

        public final boolean b()
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag;
            c();
            flag = a;
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        final void c()
        {
            if (!d)
            {
                e = 0x20000;
                if (e >= 0x20000)
                {
                    a = true;
                }
                d = true;
            }
        }


        private i()
        {
        }

        i(byte byte0)
        {
            this();
        }
    }

    public static interface j
    {
    }

    public static interface k
    {

        public abstract void a(GL10 gl10);

        public abstract void a(GL10 gl10, int i1, int j1);

        public abstract void b(GL10 gl10);
    }

    final class l extends b
    {

        private as a;

        public l()
        {
            a = as.this;
            super();
        }
    }


    private static final i a = new i((byte)0);
    private boolean b;
    private boolean c;
    final WeakReference g = new WeakReference(this);
    h h;
    k i;
    d j;
    e k;
    f l;
    public boolean m;

    public as(Context context)
    {
        super(context);
        context = getHolder();
        context.addCallback(this);
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            context.setFormat(4);
        }
    }

    static int B()
    {
        return 0;
    }

    static j C()
    {
        return null;
    }

    static int D()
    {
        return 0;
    }

    static i E()
    {
        return a;
    }

    static d a(as as1)
    {
        return as1.j;
    }

    static e b(as as1)
    {
        return as1.k;
    }

    static f c(as as1)
    {
        return as1.l;
    }

    static boolean d(as as1)
    {
        return as1.m;
    }

    static k e(as as1)
    {
        return as1.i;
    }

    public void a()
    {
        if (h != null)
        {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        } else
        {
            return;
        }
    }

    protected void finalize()
    {
        if (h != null)
        {
            h.c();
        }
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final void h(boolean flag)
    {
        c = flag;
        if (!flag && b && h != null && !h.d())
        {
            h.c();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (b && i != null && (h == null || h.d()))
        {
            int i1;
            if (h != null)
            {
                i1 = h.b();
            } else
            {
                i1 = 1;
            }
            h = new h(g);
            if (i1 != 1)
            {
                h.a(i1);
            }
            h.start();
        }
        b = false;
    }

    protected void onDetachedFromWindow()
    {
        if (!c && h != null)
        {
            h.c();
        }
        b = true;
        super.onDetachedFromWindow();
    }

    public void s()
    {
        h h1 = h;
        synchronized (a)
        {
            h1.k = true;
            a.notifyAll();
        }
        return;
        exception;
        i1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
        h h1 = h;
        surfaceholder = a;
        surfaceholder;
        JVM INSTR monitorenter ;
        h1.i = j1;
        h1.j = k1;
        h1.m = true;
        h1.k = true;
        h1.l = false;
        a.notifyAll();
_L8:
        if (h1.a || h1.c || h1.l) goto _L2; else goto _L1
_L1:
        if (!h1.f || !h1.g) goto _L4; else goto _L3
_L3:
        boolean flag = h1.a();
        if (!flag) goto _L4; else goto _L5
_L5:
        i1 = 1;
_L6:
        Exception exception;
        if (i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            a.wait();
            continue; /* Loop/switch isn't completed */
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        Thread.currentThread().interrupt();
        continue; /* Loop/switch isn't completed */
        surfaceholder;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        i1 = 0;
        if (true) goto _L6; else goto _L2
_L2:
        surfaceholder;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        h h1 = h;
        surfaceholder = a;
        surfaceholder;
        JVM INSTR monitorenter ;
        h1.d = true;
        a.notifyAll();
_L1:
        boolean flag;
        if (!h1.e)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = h1.a;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        a.wait();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        Exception exception;
        exception;
        surfaceholder;
        JVM INSTR monitorexit ;
        throw exception;
        surfaceholder;
        JVM INSTR monitorexit ;
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        h h1 = h;
        surfaceholder = a;
        surfaceholder;
        JVM INSTR monitorenter ;
        h1.d = false;
        a.notifyAll();
_L1:
        boolean flag;
        if (h1.e)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = h1.a;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        a.wait();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        Exception exception;
        exception;
        surfaceholder;
        JVM INSTR monitorexit ;
        throw exception;
        surfaceholder;
        JVM INSTR monitorexit ;
    }

    public void u()
    {
        h h1 = h;
        i i1 = a;
        i1;
        JVM INSTR monitorenter ;
        h1.b = true;
        a.notifyAll();
_L1:
        boolean flag;
        if (h1.a)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = h1.c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        a.wait();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        Exception exception;
        exception;
        i1;
        JVM INSTR monitorexit ;
        throw exception;
        i1;
        JVM INSTR monitorexit ;
    }

    public void v()
    {
        h h1 = h;
        i i1 = a;
        i1;
        JVM INSTR monitorenter ;
        h1.b = false;
        h1.k = true;
        h1.l = false;
        a.notifyAll();
_L1:
        boolean flag;
        if (h1.a || !h1.c)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        flag = h1.l;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        a.wait();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        Exception exception;
        exception;
        i1;
        JVM INSTR monitorexit ;
        throw exception;
        i1;
        JVM INSTR monitorexit ;
    }

}
