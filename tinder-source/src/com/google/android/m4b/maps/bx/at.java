// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.TextureView;
import com.google.android.m4b.maps.ay.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            ai

public class at extends TextureView
    implements android.view.TextureView.SurfaceTextureListener
{
    abstract class a
        implements as.d
    {

        private int a[];
        private at b;

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
            b = at.this;
            super();
            at.B();
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
        private at h;

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
            h = at.this;
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
        implements d
    {

        private int a;
        private at b;

        public final EGLContext a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig)
        {
            int i1 = a;
            at.B();
            EGLContext eglcontext = EGL10.EGL_NO_CONTEXT;
            at.B();
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
                f.a("eglDestroyContex", egl10.eglGetError());
            }
        }

        private c()
        {
            b = at.this;
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

        public abstract EGLContext a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig);

        public abstract void a(EGL10 egl10, EGLDisplay egldisplay, EGLContext eglcontext);
    }

    public static final class e
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
                if (ab.a("GLTextureView", 6))
                {
                    Log.e("GLTextureView", "eglCreateWindowSurface", egldisplay);
                    return null;
                }
            }
            return egl10;
        }

        private e()
        {
        }

        e(byte byte0)
        {
            this();
        }
    }

    static final class f
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
                at at1 = (at)a.get();
                if (at1 != null)
                {
                    at.c(at1);
                    b.eglDestroySurface(c, d);
                }
                d = null;
            }
        }

        public final void b()
        {
            if (f != null)
            {
                at at1 = (at)a.get();
                if (at1 != null)
                {
                    at.b(at1).a(b, c, f);
                }
                f = null;
            }
            if (c != null)
            {
                b.eglTerminate(c);
                c = null;
            }
        }

        public f(WeakReference weakreference)
        {
            a = weakreference;
        }
    }

    static final class g extends Thread
    {

        boolean a;
        boolean b;
        boolean c;
        boolean d;
        boolean e;
        boolean f;
        boolean g;
        boolean h;
        private boolean i;
        private boolean j;
        private boolean k;
        private boolean l;
        private int m;
        private int n;
        private int o;
        private ArrayList p;
        private boolean q;
        private f r;
        private WeakReference s;

        static boolean a(g g1)
        {
            g1.a = true;
            return true;
        }

        private void d()
        {
            if (l)
            {
                l = false;
                r.a();
            }
        }

        private void e()
        {
            if (k)
            {
                r.b();
                k = false;
                at.E().b(this);
            }
        }

        private void f()
        {
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            r = new f(s);
            k = false;
            l = false;
            j1 = 0;
            obj3 = null;
            i2 = 0;
            k2 = 0;
            i3 = 0;
            obj = null;
            k1 = 0;
            j2 = 0;
            l2 = 0;
            j3 = 0;
            i1 = 0;
            l1 = 0;
_L5:
            Object obj4 = at.E();
            obj4;
            JVM INSTR monitorenter ;
            int j4 = i2;
_L34:
            if (!i)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            obj4;
            JVM INSTR monitorexit ;
            synchronized (at.E())
            {
                d();
                e();
            }
            return;
            obj3;
            obj;
            JVM INSTR monitorexit ;
            throw obj3;
            if (p.isEmpty()) goto _L2; else goto _L1
_L1:
            obj = (Runnable)p.remove(0);
            int k3 = i3;
            i2 = j2;
            int i5 = k1;
            int k4 = l1;
            j2 = j3;
            i3 = l2;
            l2 = k2;
            k2 = i2;
            k1 = j4;
            l1 = i5;
            i2 = j1;
            j1 = k4;
            j3 = k3;
_L27:
            obj4;
            JVM INSTR monitorexit ;
            if (obj == null) goto _L4; else goto _L3
_L3:
            ((Runnable) (obj)).run();
            j4 = i2;
            i2 = k1;
            obj = null;
            k1 = l1;
            int l3 = j2;
            l1 = j1;
            j1 = j4;
            j2 = k2;
            k2 = l2;
            l2 = i3;
            i3 = j3;
            j3 = l3;
              goto _L5
_L2:
            if (c == b) goto _L7; else goto _L6
_L6:
            boolean flag;
            flag = b;
            c = b;
            at.E().notifyAll();
_L60:
            i2 = k1;
            if (!f)
            {
                break MISSING_BLOCK_LABEL_293;
            }
            d();
            e();
            f = false;
            i2 = 1;
            int i4;
            i4 = k2;
            if (k2 == 0)
            {
                break MISSING_BLOCK_LABEL_313;
            }
            d();
            e();
            i4 = 0;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_329;
            }
            if (l)
            {
                d();
            }
            if (!flag) goto _L9; else goto _L8
_L8:
            if (!k) goto _L9; else goto _L10
_L10:
            Object obj6 = (at)s.get();
            if (obj6 != null) goto _L12; else goto _L11
_L11:
            boolean flag1 = false;
_L28:
            if (!flag1) goto _L14; else goto _L13
_L13:
            if (!at.E().a()) goto _L9; else goto _L14
_L14:
            e();
_L9:
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_400;
            }
            if (at.E().b())
            {
                r.b();
            }
            if (!d && !e)
            {
                if (l)
                {
                    d();
                }
                e = true;
                j = false;
                at.E().notifyAll();
            }
            if (d && e)
            {
                e = false;
                at.E().notifyAll();
            }
            k2 = l1;
            if (l1 == 0)
            {
                break MISSING_BLOCK_LABEL_492;
            }
            j4 = 0;
            k2 = 0;
            h = true;
            at.E().notifyAll();
            int l4;
            int j5;
            int k5;
            int l5;
            k1 = i2;
            l5 = j2;
            k5 = l2;
            j5 = i3;
            l4 = j3;
            if (!g()) goto _L16; else goto _L15
_L15:
            k1 = i2;
            l1 = j3;
            if (k) goto _L18; else goto _L17
_L17:
            if (i2 == 0) goto _L20; else goto _L19
_L19:
            k1 = 0;
            l1 = j3;
_L18:
            if (!k || l) goto _L22; else goto _L21
_L21:
            l = true;
            i3 = 1;
            j2 = 1;
            i2 = 1;
_L59:
            if (!l) goto _L24; else goto _L23
_L23:
            if (!q) goto _L26; else goto _L25
_L25:
            j2 = 1;
            j1 = m;
            i1 = n;
            i3 = 1;
            l2 = 1;
            q = false;
_L58:
            g = false;
            at.E().notifyAll();
            j4 = i4;
            i4 = l1;
            l4 = i3;
            i3 = i2;
            i2 = j1;
            j1 = k2;
            j3 = l2;
            l1 = k1;
            k1 = l4;
            k2 = j2;
            l2 = j4;
            j2 = i4;
              goto _L27
_L12:
            flag1 = at.d(((at) (obj6)));
              goto _L28
_L20:
            obj6 = at.E();
            if (((h) (obj6)).b != this && ((h) (obj6)).b != null) goto _L30; else goto _L29
_L29:
            obj6.b = this;
            obj6.notifyAll();
            l4 = 1;
_L32:
            k1 = i2;
            l1 = j3;
            if (l4 == 0) goto _L18; else goto _L31
_L31:
            obj6 = r;
            com.google.android.m4b.maps.av.a.a();
            obj6.b = (EGL10)EGLContext.getEGL();
            obj6.c = ((f) (obj6)).b.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (((f) (obj6)).c == EGL10.EGL_NO_DISPLAY)
            {
                throw new RuntimeException("eglGetDisplay failed");
            }
            break MISSING_BLOCK_LABEL_876;
            Object obj1;
            obj1;
            at.E().b(this);
            throw obj1;
            obj1;
            obj4;
            JVM INSTR monitorexit ;
            throw obj1;
            obj3;
            synchronized (at.E())
            {
                d();
                e();
            }
            throw obj3;
_L30:
            ((h) (obj6)).c();
            if (!((h) (obj6)).a)
            {
                break MISSING_BLOCK_LABEL_847;
            }
            l4 = 1;
              goto _L32
            if (((h) (obj6)).b != null)
            {
                ((h) (obj6)).b.f = true;
                at.E().notifyAll();
            }
            l4 = 0;
              goto _L32
            at at1;
            int ai1[] = new int[2];
            if (!((f) (obj6)).b.eglInitialize(((f) (obj6)).c, ai1))
            {
                throw new RuntimeException("eglInitialize failed");
            }
            at1 = (at)((f) (obj6)).a.get();
            if (at1 != null)
            {
                break MISSING_BLOCK_LABEL_1011;
            }
            obj6.e = null;
            obj6.f = null;
_L33:
            if (((f) (obj6)).f == null || ((f) (obj6)).f == EGL10.EGL_NO_CONTEXT)
            {
                obj6.f = null;
                f.a("createContext", ((f) (obj6)).b.eglGetError());
            }
            obj6.d = null;
            com.google.android.m4b.maps.av.a.b();
            k = true;
            l1 = 1;
            at.E().notifyAll();
            k1 = i2;
              goto _L18
            obj6.e = at.a(at1).a(((f) (obj6)).b, ((f) (obj6)).c);
            obj6.f = at.b(at1).a(((f) (obj6)).b, ((f) (obj6)).c, ((f) (obj6)).e);
              goto _L33
_L24:
            l4 = l1;
            j5 = i3;
            k5 = i2;
            l5 = j2;
_L16:
            at.E().wait();
            l1 = k2;
            j2 = l5;
            k2 = i4;
            l2 = k5;
            i3 = j5;
            j3 = l4;
              goto _L34
_L4:
            if (j3 == 0) goto _L36; else goto _L35
_L35:
            obj5 = r;
            if (((f) (obj5)).b == null)
            {
                throw new RuntimeException("egl not initialized");
            }
            if (((f) (obj5)).c == null)
            {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (((f) (obj5)).e == null)
            {
                throw new RuntimeException("mEglConfig not initialized");
            }
            ((f) (obj5)).a();
            obj6 = (at)((f) (obj5)).a.get();
            if (obj6 == null) goto _L38; else goto _L37
_L37:
            at.c(((at) (obj6)));
            obj5.d = e.a(((f) (obj5)).b, ((f) (obj5)).c, ((f) (obj5)).e, ((at) (obj6)).getSurfaceTexture());
_L44:
            if (((f) (obj5)).d != null && ((f) (obj5)).d != EGL10.EGL_NO_SURFACE) goto _L40; else goto _L39
_L39:
            if (((f) (obj5)).b.eglGetError() == 12299 && ab.a("EglHelper", 6))
            {
                Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
            }
              goto _L41
_L45:
            if (i4 != 0) goto _L43; else goto _L42
_L42:
            synchronized (at.E())
            {
                j = true;
                at.E().notifyAll();
            }
            j4 = i2;
            i2 = k1;
            k1 = l1;
            i4 = j2;
            l1 = j1;
            j1 = j4;
            j2 = k2;
            k2 = l2;
            l2 = i3;
            i3 = j3;
            j3 = i4;
              goto _L5
_L38:
            obj5.d = null;
              goto _L44
_L40:
            if (((f) (obj5)).b.eglMakeCurrent(((f) (obj5)).c, ((f) (obj5)).d, ((f) (obj5)).d, ((f) (obj5)).f))
            {
                break MISSING_BLOCK_LABEL_1415;
            }
            f.a("EGLHelper", "eglMakeCurrent", ((f) (obj5)).b.eglGetError());
            i4 = 0;
              goto _L45
            i4 = 1;
              goto _L45
            obj2;
            obj5;
            JVM INSTR monitorexit ;
            throw obj2;
_L36:
            if (i3 == 0)
            {
                break MISSING_BLOCK_LABEL_1480;
            }
            obj3 = r;
            obj5 = ((f) (obj3)).f.getGL();
            if ((at)((f) (obj3)).a.get() != null)
            {
                at.C();
                at.D();
            }
            obj3 = (GL10)obj5;
            at.E().a(((GL10) (obj3)));
            i3 = 0;
            i4 = j2;
            if (j2 == 0) goto _L47; else goto _L46
_L46:
            obj5 = (at)s.get();
            if (obj5 == null) goto _L49; else goto _L48
_L48:
            at.e(((at) (obj5))).a(((GL10) (obj3)));
              goto _L49
_L47:
            j2 = k2;
            if (k2 == 0) goto _L51; else goto _L50
_L50:
            obj5 = (at)s.get();
            if (obj5 == null) goto _L53; else goto _L52
_L52:
            at.e(((at) (obj5))).a(((GL10) (obj3)), i2, i1);
              goto _L53
_L51:
            obj5 = (at)s.get();
            if (obj5 == null)
            {
                break MISSING_BLOCK_LABEL_1577;
            }
            at.e(((at) (obj5))).b(((GL10) (obj3)));
            System.nanoTime();
            obj5 = r;
            if (((f) (obj5)).b.eglSwapBuffers(((f) (obj5)).c, ((f) (obj5)).d)) goto _L55; else goto _L54
_L54:
            j4 = ((f) (obj5)).b.eglGetError();
              goto _L56
_L61:
            f.a("GLThread", "eglSwapBuffers", j4);
            synchronized (at.E())
            {
                j = true;
                at.E().notifyAll();
            }
            k2 = l2;
              goto _L57
            obj2;
            h1;
            JVM INSTR monitorexit ;
            throw obj2;
            exception;
            obj2;
            JVM INSTR monitorexit ;
            throw exception;
_L26:
            l2 = i3;
            i3 = j4;
              goto _L58
_L22:
            i2 = l2;
              goto _L59
_L7:
            flag = false;
              goto _L60
_L41:
            i4 = 0;
              goto _L45
_L43:
            j3 = 0;
              goto _L36
_L49:
            i4 = 0;
              goto _L47
_L53:
            j2 = 0;
              goto _L51
_L56:
            k2 = l2;
            j4;
            JVM INSTR lookupswitch 2: default 1756
        //                       12288: 1759
        //                       12302: 1810;
               goto _L61 _L62 _L63
_L62:
            break; /* Loop/switch isn't completed */
_L63:
            break MISSING_BLOCK_LABEL_1810;
_L57:
            if (k1 != 0)
            {
                j1 = 1;
            }
            j4 = j1;
            l2 = i3;
            i3 = j3;
            j1 = i2;
            i2 = k1;
            k1 = l1;
            l1 = j4;
            j3 = i4;
              goto _L5
_L55:
            j4 = 12288;
              goto _L56
            k2 = 1;
              goto _L57
        }

        private boolean g()
        {
            return !c && d && !j && m > 0 && n > 0 && (g || o == 1);
        }

        public final int a()
        {
            int i1;
            synchronized (at.E())
            {
                i1 = o;
            }
            return i1;
            exception;
            h1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(int i1)
        {
            if (i1 < 0 || i1 > 1)
            {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (at.E())
            {
                o = i1;
                at.E().notifyAll();
            }
            return;
            exception;
            h1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void a(int i1, int j1)
        {
            h h1 = at.E();
            h1;
            JVM INSTR monitorenter ;
            m = i1;
            n = j1;
            q = true;
            g = true;
            h = false;
            at.E().notifyAll();
_L8:
            if (a || c || h) goto _L2; else goto _L1
_L1:
            if (!k || !l) goto _L4; else goto _L3
_L3:
            boolean flag = g();
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
                at.E().wait();
                continue; /* Loop/switch isn't completed */
            }
            catch (InterruptedException interruptedexception) { }
            finally { }
            Thread.currentThread().interrupt();
            continue; /* Loop/switch isn't completed */
            h1;
            JVM INSTR monitorexit ;
            throw exception;
_L4:
            i1 = 0;
            if (true) goto _L6; else goto _L2
_L2:
            h1;
            JVM INSTR monitorexit ;
            return;
            if (true) goto _L8; else goto _L7
_L7:
        }

        public final void b()
        {
            h h1 = at.E();
            h1;
            JVM INSTR monitorenter ;
            i = true;
            at.E().notifyAll();
_L1:
            boolean flag = a;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            at.E().wait();
              goto _L1
            Object obj;
            obj;
            Thread.currentThread().interrupt();
              goto _L1
            obj;
            h1;
            JVM INSTR monitorexit ;
            throw obj;
            h1;
            JVM INSTR monitorexit ;
        }

        public final boolean c()
        {
            boolean flag;
            synchronized (at.E())
            {
                flag = a;
            }
            return flag;
            exception;
            h1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void run()
        {
            long l1 = getId();
            setName((new StringBuilder(29)).append("GLThread ").append(l1).toString());
            f();
            at.E().a(this);
            return;
            Object obj;
            obj;
            at.E().a(this);
            return;
            obj;
            throw obj;
            obj;
            at.E().a(this);
            throw obj;
            obj;
            ((Exception) (obj)).printStackTrace();
            at.E().a(this);
            return;
        }

        g(WeakReference weakreference)
        {
            p = new ArrayList();
            q = true;
            m = 0;
            n = 0;
            g = true;
            o = 1;
            s = weakreference;
        }
    }

    static final class h
    {

        private static String c = "GLThreadManager";
        boolean a;
        g b;
        private boolean d;
        private int e;
        private boolean f;
        private boolean g;

        public final void a(g g1)
        {
            this;
            JVM INSTR monitorenter ;
            g.a(g1);
            if (b == g1)
            {
                b = null;
            }
            notifyAll();
            this;
            JVM INSTR monitorexit ;
            return;
            g1;
            throw g1;
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

        public final void b(g g1)
        {
            if (b == g1)
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


        private h()
        {
        }

        h(byte byte0)
        {
            this();
        }
    }

    final class i extends b
    {

        private at a;

        public i()
        {
            a = at.this;
            super();
        }
    }


    private static final h a = new h((byte)0);
    private boolean b;
    private boolean c;
    final WeakReference g = new WeakReference(this);
    g h;
    ai i;
    as.d j;
    d k;
    e l;
    public boolean m;

    public at(Context context)
    {
        super(context);
        setSurfaceTextureListener(this);
    }

    static int B()
    {
        return 0;
    }

    static as.j C()
    {
        return null;
    }

    static int D()
    {
        return 0;
    }

    static h E()
    {
        return a;
    }

    static as.d a(at at1)
    {
        return at1.j;
    }

    static d b(at at1)
    {
        return at1.k;
    }

    static e c(at at1)
    {
        return at1.l;
    }

    static boolean d(at at1)
    {
        return at1.m;
    }

    static ai e(at at1)
    {
        return at1.i;
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
            h.b();
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
        if (!flag && b && h != null && !h.c())
        {
            h.b();
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (b && i != null && (h == null || h.c()))
        {
            int i1;
            if (h != null)
            {
                i1 = h.a();
            } else
            {
                i1 = 1;
            }
            h = new g(g);
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
            h.b();
        }
        b = true;
        super.onDetachedFromWindow();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        g g1 = h;
        surfacetexture = a;
        surfacetexture;
        JVM INSTR monitorenter ;
        g1.d = true;
        a.notifyAll();
_L1:
        boolean flag;
        if (!g1.e)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        flag = g1.a;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        a.wait();
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
          goto _L1
        Exception exception;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        h.a(i1, j1);
        return;
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        g g1 = h;
        surfacetexture = a;
        surfacetexture;
        JVM INSTR monitorenter ;
        g1.d = false;
        a.notifyAll();
_L1:
        boolean flag;
        if (g1.e)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = g1.a;
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
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
        h.a(i1, j1);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public void s()
    {
        g g1 = h;
        synchronized (a)
        {
            g1.g = true;
            a.notifyAll();
        }
        return;
        exception;
        h1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void u()
    {
        g g1 = h;
        h h1 = a;
        h1;
        JVM INSTR monitorenter ;
        g1.b = true;
        a.notifyAll();
_L1:
        boolean flag;
        if (g1.a)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        flag = g1.c;
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
        h1;
        JVM INSTR monitorexit ;
        throw exception;
        h1;
        JVM INSTR monitorexit ;
    }

    public void v()
    {
        g g1 = h;
        h h1 = a;
        h1;
        JVM INSTR monitorenter ;
        g1.b = false;
        g1.g = true;
        g1.h = false;
        a.notifyAll();
_L1:
        boolean flag;
        if (g1.a || !g1.c)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        flag = g1.h;
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
        h1;
        JVM INSTR monitorexit ;
        throw exception;
        h1;
        JVM INSTR monitorexit ;
    }

}
