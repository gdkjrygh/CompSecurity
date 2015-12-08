// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.b.a:
//            a, ac, ad, ae, 
//            af, ag, d, c, 
//            ah, y, aa

public class ab extends a
{

    private static ThreadLocal h = new ThreadLocal();
    private static final ThreadLocal i = new ac();
    private static final ThreadLocal j = new ad();
    private static final ThreadLocal k = new ae();
    private static final ThreadLocal l = new af();
    private static final ThreadLocal m = new ag();
    private static final Interpolator n = new AccelerateDecelerateInterpolator();
    private static final aa o = new d();
    private static final aa p = new c();
    private static long z = 10L;
    private int A;
    private int B;
    private Interpolator C;
    private ArrayList D;
    long b;
    long c;
    int d;
    boolean e;
    y f[];
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

    public ab()
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

    static long a(ab ab1)
    {
        return ab1.y;
    }

    static boolean a(ab ab1, long l1)
    {
        if (!ab1.t)
        {
            ab1.t = true;
            ab1.u = l1;
        } else
        {
            long l2 = l1 - ab1.u;
            if (l2 > ab1.y)
            {
                ab1.b = l1 - (l2 - ab1.y);
                ab1.d = 1;
                return true;
            }
        }
        return false;
    }

    static void b(ab ab1)
    {
        ab1.c();
        ((ArrayList)i.get()).add(ab1);
        if (ab1.y > 0L && ab1.a != null)
        {
            ab1 = (ArrayList)ab1.a.clone();
            int j1 = ab1.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ab1.get(i1);
            }

        }
    }

    private void c(long l1)
    {
        c();
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        if (d != 1)
        {
            c = l1;
            d = 2;
        }
        b = l2 - l1;
        b(l2);
    }

    static boolean c(ab ab1)
    {
        ab1.v = true;
        return true;
    }

    static void d(ab ab1)
    {
        ((ArrayList)i.get()).remove(ab1);
        ((ArrayList)j.get()).remove(ab1);
        ((ArrayList)k.get()).remove(ab1);
        ab1.d = 0;
        if (ab1.v && ab1.a != null)
        {
            ArrayList arraylist = (ArrayList)ab1.a.clone();
            int j1 = arraylist.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                arraylist.get(i1);
            }

        }
        ab1.v = false;
        ab1.w = false;
    }

    static ThreadLocal e()
    {
        return i;
    }

    static ThreadLocal f()
    {
        return k;
    }

    static ThreadLocal g()
    {
        return j;
    }

    static ThreadLocal h()
    {
        return m;
    }

    static ThreadLocal i()
    {
        return l;
    }

    static long j()
    {
        return z;
    }

    public ab a(long l1)
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

    public void a()
    {
        if (Looper.myLooper() == null)
        {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        q = false;
        r = 0;
        d = 0;
        w = true;
        t = false;
        ((ArrayList)j.get()).add(this);
        if (y == 0L)
        {
            long l1;
            if (!e || d == 0)
            {
                l1 = 0L;
            } else
            {
                l1 = AnimationUtils.currentAnimationTimeMillis() - b;
            }
            c(l1);
            d = 0;
            v = true;
            if (a != null)
            {
                ArrayList arraylist = (ArrayList)a.clone();
                int j1 = arraylist.size();
                for (int i1 = 0; i1 < j1; i1++)
                {
                    arraylist.get(i1);
                }

            }
        }
        ah ah2 = (ah)h.get();
        ah ah1 = ah2;
        if (ah2 == null)
        {
            ah1 = new ah((byte)0);
            h.set(ah1);
        }
        ah1.sendEmptyMessage(0);
    }

    void a(float f1)
    {
        boolean flag = false;
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
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                D.get(j1);
            }

        }
    }

    public final void a(Interpolator interpolator)
    {
        C = interpolator;
    }

    public final void a(aa aa)
    {
        if (f != null && f.length > 0)
        {
            f[0].a(aa);
        }
    }

    public transient void a(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            return;
        }
        if (f == null || f.length == 0)
        {
            a(new y[] {
                com.b.a.y.a("", ai)
            });
        } else
        {
            f[0].a(ai);
        }
        e = false;
    }

    public final transient void a(y ay[])
    {
        f = ay;
        g = new HashMap(1);
        for (int i1 = 0; i1 <= 0; i1++)
        {
            y y1 = ay[0];
            g.put(y1.a, y1);
        }

        e = false;
    }

    public a b()
    {
        return d();
    }

    final boolean b(long l1)
    {
        boolean flag = true;
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
        float f2;
        if (f1 >= 1.0F)
        {
            if (r < A || A == -1)
            {
                if (a != null)
                {
                    int j1 = a.size();
                    for (int i1 = 0; i1 < j1; i1++)
                    {
                        a.get(i1);
                    }

                }
                if (B == 2)
                {
                    if (q)
                    {
                        flag = false;
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

    void c()
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

    public Object clone()
    {
        return d();
    }

    public ab d()
    {
        boolean flag = false;
        ab ab1 = (ab)super.b();
        if (D != null)
        {
            ArrayList arraylist = D;
            ab1.D = new ArrayList();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                ab1.D.add(arraylist.get(i1));
            }

        }
        ab1.c = -1L;
        ab1.q = false;
        ab1.r = 0;
        ab1.e = false;
        ab1.d = 0;
        ab1.t = false;
        y ay[] = f;
        if (ay != null)
        {
            int l1 = ay.length;
            ab1.f = new y[l1];
            ab1.g = new HashMap(l1);
            for (int j1 = ((flag) ? 1 : 0); j1 < l1; j1++)
            {
                y y1 = ay[j1].a();
                ab1.f[j1] = y1;
                ab1.g.put(y1.a, y1);
            }

        }
        return ab1;
    }

    public String toString()
    {
        String s1 = (new StringBuilder("ValueAnimator@")).append(Integer.toHexString(hashCode())).toString();
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
