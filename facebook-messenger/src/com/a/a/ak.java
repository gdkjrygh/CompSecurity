// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.a.a:
//            a, al, am, an, 
//            ao, ap, m, k, 
//            b, aq, ag, ar, 
//            aj

public class ak extends a
{

    private static ThreadLocal h = new ThreadLocal();
    private static final ThreadLocal i = new al();
    private static final ThreadLocal j = new am();
    private static final ThreadLocal k = new an();
    private static final ThreadLocal l = new ao();
    private static final ThreadLocal m = new ap();
    private static final Interpolator n = new AccelerateDecelerateInterpolator();
    private static final aj o = new m();
    private static final aj p = new k();
    private static long z = 10L;
    private int A;
    private int B;
    private Interpolator C;
    private ArrayList D;
    long b;
    long c;
    int d;
    boolean e;
    ag f[];
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

    public ak()
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

    static long a(ak ak1)
    {
        return ak1.y;
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
        if (y == 0L)
        {
            d(k());
            d = 0;
            v = true;
            if (a != null)
            {
                ArrayList arraylist = (ArrayList)a.clone();
                int j1 = arraylist.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    ((b)arraylist.get(i1)).a(this);
                }

            }
        }
        aq aq2 = (aq)h.get();
        aq aq1 = aq2;
        if (aq2 == null)
        {
            aq1 = new aq(null);
            h.set(aq1);
        }
        aq1.sendEmptyMessage(0);
    }

    static boolean a(ak ak1, long l1)
    {
        return ak1.b(l1);
    }

    static boolean a(ak ak1, boolean flag)
    {
        ak1.v = flag;
        return flag;
    }

    public static transient ak b(float af[])
    {
        ak ak1 = new ak();
        ak1.a(af);
        return ak1;
    }

    static void b(ak ak1)
    {
        ak1.s();
    }

    private boolean b(long l1)
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

    static void c(ak ak1)
    {
        ak1.i();
    }

    private void i()
    {
        ((ArrayList)i.get()).remove(this);
        ((ArrayList)j.get()).remove(this);
        ((ArrayList)k.get()).remove(this);
        d = 0;
        if (v && a != null)
        {
            ArrayList arraylist = (ArrayList)a.clone();
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((b)arraylist.get(i1)).b(this);
            }

        }
        v = false;
        w = false;
    }

    static ThreadLocal m()
    {
        return i;
    }

    static ThreadLocal n()
    {
        return k;
    }

    static ThreadLocal o()
    {
        return j;
    }

    static ThreadLocal p()
    {
        return m;
    }

    static ThreadLocal q()
    {
        return l;
    }

    static long r()
    {
        return z;
    }

    private void s()
    {
        h();
        ((ArrayList)i.get()).add(this);
        if (y > 0L && a != null)
        {
            ArrayList arraylist = (ArrayList)a.clone();
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((b)arraylist.get(i1)).a(this);
            }

        }
    }

    public a a(long l1)
    {
        return c(l1);
    }

    public void a()
    {
        a(false);
    }

    void a(float f1)
    {
        f1 = C.getInterpolation(f1);
        s = f1;
        int k1 = f.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            f[i1].a(f1);
        }

        if (D != null)
        {
            int l1 = D.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                ((ar)D.get(j1)).a(this);
            }

        }
    }

    public void a(int i1)
    {
        A = i1;
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

    public void a(ar ar1)
    {
        if (D == null)
        {
            D = new ArrayList();
        }
        D.add(ar1);
    }

    public transient void a(float af[])
    {
        if (af == null || af.length == 0)
        {
            return;
        }
        if (f == null || f.length == 0)
        {
            a(new ag[] {
                ag.a("", af)
            });
        } else
        {
            f[0].a(af);
        }
        e = false;
    }

    public transient void a(ag aag[])
    {
        int j1 = aag.length;
        f = aag;
        g = new HashMap(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            ag ag1 = aag[i1];
            g.put(ag1.c(), ag1);
        }

        e = false;
    }

    public void b()
    {
        if (d != 0 || ((ArrayList)j.get()).contains(this) || ((ArrayList)k.get()).contains(this))
        {
            if (v && a != null)
            {
                for (Iterator iterator = ((ArrayList)a.clone()).iterator(); iterator.hasNext(); ((b)iterator.next()).c(this)) { }
            }
            i();
        }
    }

    public ak c(long l1)
    {
        if (l1 < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Animators cannot have negative duration: ").append(l1).toString());
        } else
        {
            x = l1;
            return this;
        }
    }

    public void c()
    {
        if (!((ArrayList)i.get()).contains(this) && !((ArrayList)j.get()).contains(this))
        {
            t = false;
            s();
        } else
        if (!e)
        {
            h();
        }
        if (A > 0 && (A & 1) == 1)
        {
            a(0.0F);
        } else
        {
            a(1.0F);
        }
        i();
    }

    public Object clone()
    {
        return j();
    }

    public void d(long l1)
    {
        h();
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        if (d != 1)
        {
            c = l1;
            d = 2;
        }
        b = l2 - l1;
        e(l2);
    }

    public boolean d()
    {
        return d == 1 || v;
    }

    public boolean e()
    {
        return w;
    }

    boolean e(long l1)
    {
        boolean flag1 = false;
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
        float f1;
        if (x > 0L)
        {
            f1 = (float)(l1 - b) / (float)x;
        } else
        {
            f1 = 1.0F;
        }
        boolean flag;
        if (f1 >= 1.0F)
        {
            if (r < A || A == -1)
            {
                if (a != null)
                {
                    int j1 = a.size();
                    for (int i1 = 0; i1 < j1; i1++)
                    {
                        ((b)a.get(i1)).d(this);
                    }

                }
                if (B == 2)
                {
                    float f2;
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
            } else
            {
                f1 = Math.min(f1, 1.0F);
                flag = true;
            }
        } else
        {
            flag = flag1;
        }
        f2 = f1;
        if (q)
        {
            f2 = 1.0F - f1;
        }
        a(f2);
        return flag;
    }

    public a g()
    {
        return j();
    }

    void h()
    {
        if (!e)
        {
            int j1 = f.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                f[i1].b();
            }

            e = true;
        }
    }

    public ak j()
    {
        boolean flag = false;
        ak ak1 = (ak)super.g();
        if (D != null)
        {
            ArrayList arraylist = D;
            ak1.D = new ArrayList();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                ak1.D.add(arraylist.get(i1));
            }

        }
        ak1.c = -1L;
        ak1.q = false;
        ak1.r = 0;
        ak1.e = false;
        ak1.d = 0;
        ak1.t = false;
        ag aag[] = f;
        if (aag != null)
        {
            int l1 = aag.length;
            ak1.f = new ag[l1];
            ak1.g = new HashMap(l1);
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                ag ag1 = aag[j1].a();
                ak1.f[j1] = ag1;
                ak1.g.put(ag1.c(), ag1);
            }

        }
        return ak1;
    }

    public long k()
    {
        if (!e || d == 0)
        {
            return 0L;
        } else
        {
            return AnimationUtils.currentAnimationTimeMillis() - b;
        }
    }

    public Object l()
    {
        if (f != null && f.length > 0)
        {
            return f[0].d();
        } else
        {
            return null;
        }
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("ValueAnimator@").append(Integer.toHexString(hashCode())).toString();
        String s2 = s1;
        if (f != null)
        {
            int i1 = 0;
            do
            {
                s2 = s1;
                if (i1 >= f.length)
                {
                    break;
                }
                s1 = (new StringBuilder()).append(s1).append("\n    ").append(f[i1].toString()).toString();
                i1++;
            } while (true);
        }
        return s2;
    }

}
