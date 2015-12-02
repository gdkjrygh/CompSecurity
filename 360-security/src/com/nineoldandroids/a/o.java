// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.nineoldandroids.a:
//            a, g, e, m, 
//            n

public class o extends com.nineoldandroids.a.a
{
    private static class a extends Handler
    {

        public void handleMessage(Message message)
        {
            ArrayList arraylist;
            ArrayList arraylist1;
            arraylist = (ArrayList)o.q().get();
            arraylist1 = (ArrayList)o.r().get();
            message.what;
            JVM INSTR tableswitch 0 1: default 48
        //                       0 49
        //                       1 473;
               goto _L1 _L2 _L3
_L1:
            return;
_L2:
            boolean flag;
            message = (ArrayList)o.s().get();
            Object obj;
            o o1;
            int i1;
            int j1;
            long l1;
            if (arraylist.size() > 0 || arraylist1.size() > 0)
            {
                flag = false;
            } else
            {
                flag = true;
            }
_L17:
            if (message.size() > 0) goto _L5; else goto _L4
_L4:
            l1 = AnimationUtils.currentAnimationTimeMillis();
            obj = (ArrayList)o.t().get();
            message = (ArrayList)o.u().get();
            j1 = arraylist1.size();
            i1 = 0;
_L18:
            if (i1 < j1) goto _L7; else goto _L6
_L6:
            j1 = ((ArrayList) (obj)).size();
            if (j1 <= 0) goto _L9; else goto _L8
_L8:
            i1 = 0;
_L19:
            if (i1 < j1) goto _L11; else goto _L10
_L10:
            ((ArrayList) (obj)).clear();
_L9:
            i1 = arraylist.size();
            j1 = 0;
_L20:
            if (j1 < i1) goto _L13; else goto _L12
_L12:
            if (message.size() <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            i1 = 0;
_L21:
            if (i1 < message.size()) goto _L15; else goto _L14
_L14:
            message.clear();
            if (!flag || arraylist.isEmpty() && arraylist1.isEmpty()) goto _L1; else goto _L16
_L16:
            sendEmptyMessageDelayed(1, Math.max(0L, o.v() - (AnimationUtils.currentAnimationTimeMillis() - l1)));
            return;
_L5:
            obj = (ArrayList)message.clone();
            message.clear();
            j1 = ((ArrayList) (obj)).size();
            i1 = 0;
            while (i1 < j1) 
            {
                o1 = (o)((ArrayList) (obj)).get(i1);
                if (o.a(o1) == 0L)
                {
                    o.b(o1);
                } else
                {
                    arraylist1.add(o1);
                }
                i1++;
            }
              goto _L17
_L7:
            o1 = (o)arraylist1.get(i1);
            if (o.a(o1, l1))
            {
                ((ArrayList) (obj)).add(o1);
            }
            i1++;
              goto _L18
_L11:
            o1 = (o)((ArrayList) (obj)).get(i1);
            o.b(o1);
            o.a(o1, true);
            arraylist1.remove(o1);
            i1++;
              goto _L19
_L13:
            obj = (o)arraylist.get(j1);
            if (((o) (obj)).f(l1))
            {
                message.add(obj);
            }
            if (arraylist.size() == i1)
            {
                j1++;
            } else
            {
                i1--;
                message.remove(obj);
            }
              goto _L20
_L15:
            o.c((o)message.get(i1));
            i1++;
              goto _L21
_L3:
            flag = true;
              goto _L4
        }

        private a()
        {
        }

        a(a a1)
        {
            this();
        }
    }

    public static interface b
    {

        public abstract void a(o o1);
    }


    private static ThreadLocal h = new ThreadLocal();
    private static final ThreadLocal i = new ThreadLocal() {

        protected ArrayList a()
        {
            return new ArrayList();
        }

        protected Object initialValue()
        {
            return a();
        }

    };
    private static final ThreadLocal j = new ThreadLocal() {

        protected ArrayList a()
        {
            return new ArrayList();
        }

        protected Object initialValue()
        {
            return a();
        }

    };
    private static final ThreadLocal k = new ThreadLocal() {

        protected ArrayList a()
        {
            return new ArrayList();
        }

        protected Object initialValue()
        {
            return a();
        }

    };
    private static final ThreadLocal l = new ThreadLocal() {

        protected ArrayList a()
        {
            return new ArrayList();
        }

        protected Object initialValue()
        {
            return a();
        }

    };
    private static final ThreadLocal m = new ThreadLocal() {

        protected ArrayList a()
        {
            return new ArrayList();
        }

        protected Object initialValue()
        {
            return a();
        }

    };
    private static final Interpolator n = new AccelerateDecelerateInterpolator();
    private static final n o = new g();
    private static final n p = new e();
    private static long z = 10L;
    private int A;
    private int B;
    private Interpolator C;
    private ArrayList D;
    long b;
    long c;
    int d;
    boolean e;
    m f[];
    HashMap g;
    private boolean q;
    private int r;
    private float s;
    private boolean t;
    private long u;
    private boolean v;
    private boolean w;
    private long x;
    private long y;

    public o()
    {
        c = -1L;
        q = false;
        r = 0;
        s = 0.0F;
        t = false;
        d = 0;
        v = false;
        w = false;
        e = false;
        x = 300L;
        y = 0L;
        A = 0;
        B = 1;
        C = n;
        D = null;
    }

    static long a(o o1)
    {
        return o1.y;
    }

    public static transient o a(m am[])
    {
        o o1 = new o();
        o1.b(am);
        return o1;
    }

    static void a(o o1, boolean flag)
    {
        o1.v = flag;
    }

    private void a(boolean flag)
    {
        if (Looper.myLooper() == null)
        {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        q = flag;
        r = 0;
        d = 0;
        w = true;
        t = false;
        ((ArrayList)j.get()).add(this);
        if (y != 0L) goto _L2; else goto _L1
_L1:
        e(n());
        d = 0;
        v = true;
        if (a == null) goto _L2; else goto _L3
_L3:
        Object obj;
        int i1;
        int j1;
        obj = (ArrayList)a.clone();
        j1 = ((ArrayList) (obj)).size();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L2
_L2:
        a a1 = (a)h.get();
        obj = a1;
        if (a1 == null)
        {
            obj = new a(null);
            h.set(obj);
        }
        ((a) (obj)).sendEmptyMessage(0);
        return;
_L4:
        ((a.a)((ArrayList) (obj)).get(i1)).a(this);
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean a(o o1, long l1)
    {
        return o1.c(l1);
    }

    public static transient o b(float af[])
    {
        o o1 = new o();
        o1.a(af);
        return o1;
    }

    public static transient o b(int ai[])
    {
        o o1 = new o();
        o1.a(ai);
        return o1;
    }

    static void b(o o1)
    {
        o1.k();
    }

    static void c(o o1)
    {
        o1.j();
    }

    private boolean c(long l1)
    {
        if (!t)
        {
            t = true;
            u = l1;
        } else
        {
            long l2 = l1 - u;
            if (l2 > y)
            {
                b = l1 - (l2 - y);
                d = 1;
                return true;
            }
        }
        return false;
    }

    private void j()
    {
        ((ArrayList)i.get()).remove(this);
        ((ArrayList)j.get()).remove(this);
        ((ArrayList)k.get()).remove(this);
        d = 0;
        if (!v || a == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int i1;
        int j1;
        arraylist = (ArrayList)a.clone();
        j1 = arraylist.size();
        i1 = 0;
_L5:
        if (i1 < j1) goto _L3; else goto _L2
_L2:
        v = false;
        w = false;
        return;
_L3:
        ((a.a)arraylist.get(i1)).b(this);
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void k()
    {
        i();
        ((ArrayList)i.get()).add(this);
        if (y <= 0L || a == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int i1;
        int j1;
        arraylist = (ArrayList)a.clone();
        j1 = arraylist.size();
        i1 = 0;
_L5:
        if (i1 < j1) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((a.a)arraylist.get(i1)).a(this);
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static ThreadLocal q()
    {
        return i;
    }

    static ThreadLocal r()
    {
        return k;
    }

    static ThreadLocal s()
    {
        return j;
    }

    static ThreadLocal t()
    {
        return m;
    }

    static ThreadLocal u()
    {
        return l;
    }

    static long v()
    {
        return z;
    }

    public void a()
    {
        a(false);
    }

    void a(float f1)
    {
        int i1;
        int j1;
        f1 = C.getInterpolation(f1);
        s = f1;
        j1 = f.length;
        i1 = 0;
_L5:
        if (i1 < j1) goto _L2; else goto _L1
_L1:
        if (D == null) goto _L4; else goto _L3
_L3:
        j1 = D.size();
        i1 = 0;
_L6:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_69;
        }
_L4:
        return;
_L2:
        f[i1].a(f1);
        i1++;
          goto _L5
        ((b)D.get(i1)).a(this);
        i1++;
          goto _L6
    }

    public void a(int i1)
    {
        A = i1;
    }

    public void a(long l1)
    {
        y = l1;
    }

    public void a(Interpolator interpolator)
    {
        if (interpolator != null)
        {
            C = interpolator;
            return;
        } else
        {
            C = new LinearInterpolator();
            return;
        }
    }

    public void a(n n1)
    {
        if (n1 != null && f != null && f.length > 0)
        {
            f[0].a(n1);
        }
    }

    public void a(b b1)
    {
        if (D == null)
        {
            D = new ArrayList();
        }
        D.add(b1);
    }

    public transient void a(float af[])
    {
        if (af == null || af.length == 0)
        {
            return;
        }
        if (f == null || f.length == 0)
        {
            b(new m[] {
                com.nineoldandroids.a.m.a("", af)
            });
        } else
        {
            f[0].a(af);
        }
        e = false;
    }

    public transient void a(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            return;
        }
        if (f == null || f.length == 0)
        {
            b(new m[] {
                com.nineoldandroids.a.m.a("", ai)
            });
        } else
        {
            f[0].a(ai);
        }
        e = false;
    }

    public com.nineoldandroids.a.a b(long l1)
    {
        return d(l1);
    }

    public Object b(String s1)
    {
        s1 = (m)g.get(s1);
        if (s1 != null)
        {
            return s1.d();
        } else
        {
            return null;
        }
    }

    public void b()
    {
        if (d == 0 && !((ArrayList)j.get()).contains(this) && !((ArrayList)k.get()).contains(this)) goto _L2; else goto _L1
_L1:
        if (!v || a == null) goto _L4; else goto _L3
_L3:
        Iterator iterator = ((ArrayList)a.clone()).iterator();
_L7:
        if (iterator.hasNext()) goto _L5; else goto _L4
_L4:
        j();
_L2:
        return;
_L5:
        ((a.a)iterator.next()).c(this);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b(int i1)
    {
        B = i1;
    }

    public transient void b(m am[])
    {
        int j1 = am.length;
        f = am;
        g = new HashMap(j1);
        int i1 = 0;
        do
        {
            if (i1 >= j1)
            {
                e = false;
                return;
            }
            m m1 = am[i1];
            g.put(m1.c(), m1);
            i1++;
        } while (true);
    }

    public void c()
    {
        if (!((ArrayList)i.get()).contains(this) && !((ArrayList)j.get()).contains(this))
        {
            t = false;
            k();
        } else
        if (!e)
        {
            i();
        }
        if (A > 0 && (A & 1) == 1)
        {
            a(0.0F);
        } else
        {
            a(1.0F);
        }
        j();
    }

    public o d(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Animators cannot have negative duration: ")).append(l1).toString());
        } else
        {
            x = l1;
            return this;
        }
    }

    public boolean d()
    {
        boolean flag1 = true;
        boolean flag = flag1;
        if (d != 1)
        {
            flag = flag1;
            if (!v)
            {
                flag = false;
            }
        }
        return flag;
    }

    public void e(long l1)
    {
        i();
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        if (d != 1)
        {
            c = l1;
            d = 2;
        }
        b = l2 - l1;
        f(l2);
    }

    public boolean e()
    {
        return w;
    }

    boolean f(long l1)
    {
        float f1;
        int i1;
        boolean flag;
        boolean flag1;
        flag1 = false;
        if (d == 0)
        {
            d = 1;
            if (c < 0L)
            {
                b = l1;
            } else
            {
                b = l1 - c;
                c = -1L;
            }
        }
        switch (d)
        {
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
            break;
        }
        float f2;
        int j1;
        if (x > 0L)
        {
            f1 = (float)(l1 - b) / (float)x;
        } else
        {
            f1 = 1.0F;
        }
        if (f1 < 1.0F)
        {
            break MISSING_BLOCK_LABEL_282;
        }
        if (r >= A && A != -1) goto _L2; else goto _L1
_L1:
        if (a == null) goto _L4; else goto _L3
_L3:
        j1 = a.size();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L5; else goto _L4
_L4:
        if (B == 2)
        {
            if (q)
            {
                flag = false;
            } else
            {
                flag = true;
            }
            q = flag;
        }
        r = r + (int)f1;
        f1 %= 1.0F;
        b = b + x;
        flag = flag1;
_L7:
        f2 = f1;
        if (q)
        {
            f2 = 1.0F - f1;
        }
        a(f2);
        return flag;
_L5:
        ((a.a)a.get(i1)).d(this);
        i1++;
          goto _L6
_L2:
        f1 = Math.min(f1, 1.0F);
        flag = true;
          goto _L7
        flag = flag1;
          goto _L7
    }

    public com.nineoldandroids.a.a h()
    {
        return l();
    }

    void i()
    {
        if (e) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = f.length;
        i1 = 0;
_L6:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        e = true;
_L2:
        return;
_L4:
        f[i1].b();
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public o l()
    {
        o o1 = (o)super.h();
        if (D == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int i1;
        int j1;
        obj = D;
        o1.D = new ArrayList();
        j1 = ((ArrayList) (obj)).size();
        i1 = 0;
_L6:
        if (i1 < j1) goto _L3; else goto _L2
_L2:
        o1.c = -1L;
        o1.q = false;
        o1.r = 0;
        o1.e = false;
        o1.d = 0;
        o1.t = false;
        obj = f;
        if (obj == null) goto _L5; else goto _L4
_L4:
        j1 = obj.length;
        o1.f = new m[j1];
        o1.g = new HashMap(j1);
        i1 = 0;
_L7:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_152;
        }
_L5:
        return o1;
_L3:
        o1.D.add((b)((ArrayList) (obj)).get(i1));
        i1++;
          goto _L6
        m m1 = obj[i1].a();
        o1.f[i1] = m1;
        o1.g.put(m1.c(), m1);
        i1++;
          goto _L7
    }

    public long m()
    {
        return x;
    }

    public long n()
    {
        if (!e || d == 0)
        {
            return 0L;
        } else
        {
            return AnimationUtils.currentAnimationTimeMillis() - b;
        }
    }

    public Object o()
    {
        if (f != null && f.length > 0)
        {
            return f[0].d();
        } else
        {
            return null;
        }
    }

    public float p()
    {
        return s;
    }

    public String toString()
    {
        String s1;
        String s2;
        s1 = (new StringBuilder("ValueAnimator@")).append(Integer.toHexString(hashCode())).toString();
        s2 = s1;
        if (f == null) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L6:
        if (i1 < f.length) goto _L4; else goto _L3
_L3:
        s2 = s1;
_L2:
        return s2;
_L4:
        s1 = (new StringBuilder(String.valueOf(s1))).append("\n    ").append(f[i1].toString()).toString();
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
