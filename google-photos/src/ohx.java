// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.opengl.GLDebugHelper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;

public final class ohx extends Thread
{

    public boolean a;
    public boolean b;
    public boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    public boolean h;
    public boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private ArrayList q;
    private boolean r;
    private ohw s;
    private WeakReference t;

    public ohx(WeakReference weakreference)
    {
        q = new ArrayList();
        r = true;
        n = 0;
        o = 0;
        h = true;
        p = 1;
        t = weakreference;
    }

    static boolean a(ohx ohx1, boolean flag)
    {
        ohx1.a = true;
        return true;
    }

    private void f()
    {
        if (m)
        {
            m = false;
            s.a();
        }
    }

    private void g()
    {
        if (l)
        {
            s.b();
            l = false;
            ohq.c().b(this);
        }
    }

    private void h()
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
        s = new ohw(t);
        l = false;
        m = false;
        i2 = 0;
        i3 = 0;
        l2 = 0;
        j2 = 0;
        j1 = 0;
        i1 = 0;
        obj = null;
        l1 = 0;
        k1 = 0;
        j3 = 0;
        k2 = 0;
_L83:
        obj3 = ohq.c();
        obj3;
        JVM INSTR monitorenter ;
        int j4;
        j4 = j3;
        j3 = i3;
_L39:
        if (!j)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        obj3;
        JVM INSTR monitorexit ;
        synchronized (ohq.c())
        {
            f();
            g();
        }
        return;
        obj3;
        obj;
        JVM INSTR monitorexit ;
        throw obj3;
        if (q.isEmpty()) goto _L2; else goto _L1
_L1:
        obj = (Runnable)q.remove(0);
        i3 = j1;
        j1 = j3;
        j3 = i2;
        i2 = k1;
        int k3 = l1;
        l1 = k2;
        k1 = j2;
        k2 = i3;
        i3 = k3;
        j2 = l1;
        l1 = j4;
_L28:
        obj3;
        JVM INSTR monitorexit ;
        if (obj == null) goto _L4; else goto _L3
_L3:
        ((Runnable) (obj)).run();
        int l3 = k2;
        j4 = j1;
        obj = null;
        int l4 = l1;
        k2 = j2;
        l1 = i3;
        j1 = i2;
        i2 = j3;
        j2 = k1;
        k1 = j1;
        j1 = l3;
        i3 = j4;
        j3 = l4;
        continue; /* Loop/switch isn't completed */
_L2:
        if (c == b) goto _L6; else goto _L5
_L5:
        boolean flag;
        flag = b;
        c = b;
        ohq.c().notifyAll();
_L77:
        i3 = j2;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_291;
        }
        f();
        g();
        g = false;
        i3 = 1;
        int i4;
        i4 = j4;
        if (j4 == 0)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        f();
        g();
        i4 = 0;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_327;
        }
        if (m)
        {
            f();
        }
        if (!flag) goto _L8; else goto _L7
_L7:
        if (!l) goto _L8; else goto _L9
_L9:
        Object obj5 = (ohq)t.get();
        if (obj5 != null) goto _L11; else goto _L10
_L10:
        boolean flag1 = false;
_L29:
        if (!flag1) goto _L13; else goto _L12
_L12:
        if (!ohq.c().a()) goto _L8; else goto _L13
_L13:
        g();
_L8:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_396;
        }
        if (ohq.c().b())
        {
            s.b();
        }
        if (!d && !e)
        {
            if (m)
            {
                f();
            }
            e = true;
            k = false;
            ohq.c().notifyAll();
        }
        if (d && e)
        {
            e = false;
            ohq.c().notifyAll();
        }
        if (l2 == 0) goto _L15; else goto _L14
_L14:
        l2 = 0;
        i = true;
        ohq.c().notifyAll();
        j2 = 0;
_L76:
        if (!i()) goto _L17; else goto _L16
_L16:
        j3 = k1;
        if (l) goto _L19; else goto _L18
_L18:
        if (i3 == 0) goto _L21; else goto _L20
_L20:
        j3 = 0;
        i3 = k1;
        k1 = j3;
_L37:
        if (!l || m) goto _L23; else goto _L22
_L22:
        m = true;
        i2 = 1;
        l1 = 1;
        k2 = 1;
_L75:
        if (!m) goto _L25; else goto _L24
_L24:
        if (!r) goto _L27; else goto _L26
_L26:
        i2 = 1;
        l2 = n;
        i1 = o;
        k2 = 1;
        j1 = 1;
        r = false;
_L74:
        h = false;
        ohq.c().notifyAll();
        int i5 = l2;
        j4 = k2;
        k2 = l1;
        l1 = i4;
        l2 = j2;
        j2 = i2;
        i2 = i3;
        i3 = k2;
        j3 = j1;
        k2 = i5;
        j1 = j4;
          goto _L28
_L11:
        flag1 = ohq.g(((ohq) (obj5)));
          goto _L29
_L21:
        obj5 = ohq.c();
        if (((ohy) (obj5)).b != this && ((ohy) (obj5)).b != null) goto _L31; else goto _L30
_L30:
        obj5.b = this;
        obj5.notifyAll();
        j4 = 1;
_L34:
        j3 = k1;
        if (j4 == 0) goto _L19; else goto _L32
_L32:
        obj5 = s;
        obj5.b = (EGL10)EGLContext.getEGL();
        obj5.c = ((ohw) (obj5)).b.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        if (((ohw) (obj5)).c == EGL10.EGL_NO_DISPLAY)
        {
            throw new RuntimeException("eglGetDisplay failed");
        }
          goto _L33
        Object obj1;
        obj1;
        ohq.c().b(this);
        throw obj1;
        obj1;
        obj3;
        JVM INSTR monitorexit ;
        throw obj1;
        Exception exception;
        exception;
        synchronized (ohq.c())
        {
            f();
            g();
        }
        throw exception;
_L31:
        ((ohy) (obj5)).c();
        if (!((ohy) (obj5)).a)
        {
            break MISSING_BLOCK_LABEL_795;
        }
        j4 = 1;
          goto _L34
        if (((ohy) (obj5)).b != null)
        {
            ((ohy) (obj5)).b.g = true;
            ohq.c().notifyAll();
        }
        j4 = 0;
          goto _L34
_L33:
        ohq ohq1;
        int ai[] = new int[2];
        if (!((ohw) (obj5)).b.eglInitialize(((ohw) (obj5)).c, ai))
        {
            throw new RuntimeException("eglInitialize failed");
        }
        ohq1 = (ohq)((ohw) (obj5)).a.get();
        if (ohq1 != null) goto _L36; else goto _L35
_L35:
        obj5.e = null;
        obj5.f = null;
_L38:
        if (((ohw) (obj5)).f == null || ((ohw) (obj5)).f == EGL10.EGL_NO_CONTEXT)
        {
            obj5.f = null;
            ohw.a("createContext", ((ohw) (obj5)).b.eglGetError());
        }
        obj5.d = null;
        l = true;
        j3 = 1;
        ohq.c().notifyAll();
_L19:
        k1 = i3;
        i3 = j3;
          goto _L37
_L36:
        obj5.e = ohq.b(ohq1).a(((ohw) (obj5)).b, ((ohw) (obj5)).c);
        obj5.f = ohq.c(ohq1).a(((ohw) (obj5)).b, ((ohw) (obj5)).c, ((ohw) (obj5)).e);
          goto _L38
_L25:
        ohq.c().wait();
        j3 = k2;
        j4 = l2;
        l2 = j2;
        j2 = k1;
        k2 = i2;
        i2 = j3;
        k1 = i3;
        j3 = j4;
        j4 = i4;
          goto _L39
_L4:
        if (j3 == 0) goto _L41; else goto _L40
_L40:
        obj4 = s;
        if (((ohw) (obj4)).b == null)
        {
            throw new RuntimeException("egl not initialized");
        }
        if (((ohw) (obj4)).c == null)
        {
            throw new RuntimeException("eglDisplay not initialized");
        }
        if (((ohw) (obj4)).e == null)
        {
            throw new RuntimeException("mEglConfig not initialized");
        }
        ((ohw) (obj4)).a();
        obj5 = (ohq)((ohw) (obj4)).a.get();
        if (obj5 == null) goto _L43; else goto _L42
_L42:
        obj4.d = ohq.d(((ohq) (obj5))).a(((ohw) (obj4)).b, ((ohw) (obj4)).c, ((ohw) (obj4)).e, ((ohq) (obj5)).getSurfaceTexture());
_L69:
        if (((ohw) (obj4)).d != null && ((ohw) (obj4)).d != EGL10.EGL_NO_SURFACE) goto _L45; else goto _L44
_L44:
        if (((ohw) (obj4)).b.eglGetError() == 12299)
        {
            Log.e("EglHelper", "createWindowSurface returned EGL_BAD_NATIVE_WINDOW.");
        }
          goto _L46
_L70:
        if (i4 == 0) goto _L48; else goto _L47
_L47:
        synchronized (ohq.c())
        {
            f = true;
            ohq.c().notifyAll();
        }
        j3 = 0;
_L41:
        i4 = i3;
        if (i3 == 0) goto _L50; else goto _L49
_L49:
        obj5 = s;
        obj4 = ((ohw) (obj5)).f.getGL();
        ohq1 = (ohq)((ohw) (obj5)).a.get();
        obj5 = obj4;
        if (ohq1 == null) goto _L52; else goto _L51
_L51:
        if (ohq.e(ohq1) != null)
        {
            obj4 = ohq.e(ohq1).C();
        }
        obj5 = obj4;
        if ((ohq.f(ohq1) & 3) == 0) goto _L52; else goto _L53
_L53:
        i3 = 0;
        if ((ohq.f(ohq1) & 1) != 0)
        {
            i3 = 1;
        }
        if ((ohq.f(ohq1) & 2) == 0) goto _L55; else goto _L54
_L54:
        obj5 = new ohz();
_L72:
        obj4 = GLDebugHelper.wrap(((javax.microedition.khronos.opengles.GL) (obj4)), i3, ((java.io.Writer) (obj5)));
_L73:
        obj4 = (GL10)obj4;
        ohq.c().a(((GL10) (obj4)));
        i4 = 0;
_L50:
        i3 = i2;
        if (i2 == 0) goto _L57; else goto _L56
_L56:
        obj4 = (ohq)t.get();
        if (obj4 == null) goto _L59; else goto _L58
_L58:
        ohq.h(((ohq) (obj4))).a();
          goto _L59
_L57:
        i2 = j2;
        if (j2 == 0) goto _L61; else goto _L60
_L60:
        obj4 = (ohq)t.get();
        if (obj4 == null) goto _L63; else goto _L62
_L62:
        ohq.h(((ohq) (obj4))).a(k2, i1);
          goto _L63
_L61:
        obj4 = (ohq)t.get();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_1450;
        }
        ohq.h(((ohq) (obj4))).b();
        obj4 = s;
        if (((ohw) (obj4)).b.eglSwapBuffers(((ohw) (obj4)).c, ((ohw) (obj4)).d)) goto _L65; else goto _L64
_L64:
        j4 = ((ohw) (obj4)).b.eglGetError();
          goto _L66
_L78:
        ohw.a("GLThread", "eglSwapBuffers", j4);
        synchronized (ohq.c())
        {
            k = true;
            ohq.c().notifyAll();
        }
        j2 = l1;
_L71:
        obj4 = (ohq)t.get();
        if (obj4 == null) goto _L68; else goto _L67
_L67:
        ohq.h(((ohq) (obj4))).c();
          goto _L68
_L43:
        obj4.d = null;
          goto _L69
_L45:
        if (((ohw) (obj4)).b.eglMakeCurrent(((ohw) (obj4)).c, ((ohw) (obj4)).d, ((ohw) (obj4)).d, ((ohw) (obj4)).f))
        {
            break MISSING_BLOCK_LABEL_1610;
        }
        ohw.a("EGLHelper", "eglMakeCurrent", ((ohw) (obj4)).b.eglGetError());
        i4 = 0;
          goto _L70
        i4 = 1;
          goto _L70
        obj2;
        obj4;
        JVM INSTR monitorexit ;
        throw obj2;
_L48:
        synchronized (ohq.c())
        {
            f = true;
            k = true;
            ohq.c().notifyAll();
        }
        i4 = k2;
        j4 = j1;
        int j5 = l1;
        k2 = j2;
        l1 = i3;
        j1 = i2;
        i2 = j3;
        j2 = k1;
        k1 = j1;
        j1 = i4;
        i3 = j4;
        j3 = j5;
        continue; /* Loop/switch isn't completed */
        obj2;
        obj4;
        JVM INSTR monitorexit ;
        throw obj2;
_L65:
        j4 = 12288;
          goto _L66
_L79:
        j2 = 1;
          goto _L71
        obj2;
        obj4;
        JVM INSTR monitorexit ;
        throw obj2;
        obj4;
        obj2;
        JVM INSTR monitorexit ;
        throw obj4;
_L81:
        l1 = l2;
        break; /* Loop/switch isn't completed */
_L55:
        obj5 = null;
          goto _L72
_L52:
        obj4 = obj5;
          goto _L73
_L27:
        j4 = l2;
        j3 = k2;
        l2 = j1;
        k2 = j4;
        j1 = j3;
          goto _L74
_L23:
        j3 = i2;
        i2 = k2;
        k2 = j3;
          goto _L75
_L17:
        j3 = i2;
        j4 = k1;
        k1 = i3;
        i2 = k2;
        k2 = j3;
        i3 = j4;
          goto _L25
_L15:
        j2 = l2;
        l2 = j3;
          goto _L76
_L6:
        flag = false;
          goto _L77
_L46:
        i4 = 0;
          goto _L70
_L59:
        i3 = 0;
          goto _L57
_L63:
        i2 = 0;
          goto _L61
_L66:
        j2 = l1;
        j4;
        JVM INSTR lookupswitch 2: default 1876
    //                   12288: 1523
    //                   12302: 1709;
           goto _L78 _L71 _L79
_L68:
        if (j1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = 1;
        break; /* Loop/switch isn't completed */
        if (true) goto _L81; else goto _L80
_L80:
        l2 = k2;
        int k4 = j2;
        int k5 = j1;
        j1 = i3;
        i3 = l1;
        j2 = k1;
        k2 = i2;
        l1 = i4;
        i2 = j3;
        k1 = j1;
        j1 = l2;
        l2 = i3;
        i3 = k5;
        j3 = k4;
        if (true) goto _L83; else goto _L82
_L82:
    }

    private boolean i()
    {
        return !c && d && !k && n > 0 && o > 0 && (h || p == 1);
    }

    public final int a()
    {
        int i1;
        synchronized (ohq.c())
        {
            i1 = p;
        }
        return i1;
        exception;
        ohy1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i1)
    {
        if (i1 < 0 || i1 > 1)
        {
            throw new IllegalArgumentException("renderMode");
        }
        synchronized (ohq.c())
        {
            p = i1;
            ohq.c().notifyAll();
        }
        return;
        exception;
        ohy1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int i1, int j1)
    {
        ohy ohy1 = ohq.c();
        ohy1;
        JVM INSTR monitorenter ;
        n = i1;
        o = j1;
        r = true;
        h = true;
        i = false;
        ohq.c().notifyAll();
_L8:
        if (a || c || i) goto _L2; else goto _L1
_L1:
        if (!l || !m) goto _L4; else goto _L3
_L3:
        boolean flag = i();
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
            ohq.c().wait();
            continue; /* Loop/switch isn't completed */
        }
        catch (InterruptedException interruptedexception) { }
        finally { }
        Thread.currentThread().interrupt();
        continue; /* Loop/switch isn't completed */
        ohy1;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        i1 = 0;
        if (true) goto _L6; else goto _L2
_L2:
        ohy1;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void b()
    {
        synchronized (ohq.c())
        {
            h = true;
            ohq.c().notifyAll();
        }
        return;
        exception;
        ohy1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        ohy ohy1 = ohq.c();
        ohy1;
        JVM INSTR monitorenter ;
        b = true;
        ohq.c().notifyAll();
_L1:
        boolean flag;
        if (a)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        flag = c;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ohq.c().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        ohy1;
        JVM INSTR monitorexit ;
        throw obj;
        ohy1;
        JVM INSTR monitorexit ;
    }

    public final void d()
    {
        ohy ohy1 = ohq.c();
        ohy1;
        JVM INSTR monitorenter ;
        b = false;
        h = true;
        i = false;
        ohq.c().notifyAll();
_L1:
        boolean flag;
        if (a || !c)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        flag = i;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        ohq.c().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        ohy1;
        JVM INSTR monitorexit ;
        throw obj;
        ohy1;
        JVM INSTR monitorexit ;
    }

    public final void e()
    {
        ohy ohy1 = ohq.c();
        ohy1;
        JVM INSTR monitorenter ;
        j = true;
        ohq.c().notifyAll();
_L1:
        boolean flag = a;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        ohq.c().wait();
          goto _L1
        Object obj;
        obj;
        Thread.currentThread().interrupt();
          goto _L1
        obj;
        ohy1;
        JVM INSTR monitorexit ;
        throw obj;
        ohy1;
        JVM INSTR monitorexit ;
    }

    public final void run()
    {
        Exception exception;
        long l1 = getId();
        setName((new StringBuilder(29)).append("GLThread ").append(l1).toString());
        try
        {
            h();
        }
        catch (InterruptedException interruptedexception)
        {
            ohq.c().a(this);
            return;
        }
        finally
        {
            ohq.c().a(this);
        }
        ohq.c().a(this);
        return;
        throw exception;
    }
}
