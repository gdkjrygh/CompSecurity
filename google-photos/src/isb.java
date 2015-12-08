// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.RectF;
import android.util.SparseIntArray;
import android.view.View;

public final class isb
{

    private static final SparseIntArray f;
    final pfp a;
    public int b;
    public int c;
    String d;
    isb e;
    private final int g;

    public isb(pfp pfp1, int i1, isb isb1)
    {
        pfp pfp2;
        if (pfp1 == null)
        {
            pfp2 = new pfp();
        } else
        {
            pfp2 = pfp1;
        }
        a = pfp2;
        g = i1;
        if (a.f != null)
        {
            pfp1 = new String(pfp1.f);
        } else
        {
            pfp1 = null;
        }
        d = pfp1;
        e = isb1;
    }

    private static ise I()
    {
        return new ise(new RectF(0.0F, 0.0F, 1.0F, 1.0F), new RectF(0.0F, 0.0F, 1.0F, 1.0F));
    }

    public static isb a(View view)
    {
        view = ((View) (view.getTag(s.bz)));
        if (view instanceof isb)
        {
            return (isb)view;
        } else
        {
            return null;
        }
    }

    public final isg A()
    {
        if (!o())
        {
            return isg.a;
        }
        int k1 = p();
        int i1;
        int j1;
        if (o() && a.b.p == null)
        {
            i1 = 0;
        } else
        {
            i1 = a(b.a(a.b.p.a, 0.0F));
        }
        if (o() && a.b.p == null)
        {
            j1 = 0;
        } else
        {
            j1 = a(b.a(a.b.p.b, 0.0F));
        }
        return new isg(Math.max(0, k1 - i1), Math.max(0, k1 - j1), Math.max(0, i1 + k1), Math.max(0, j1 + k1));
    }

    public final msx[] B()
    {
        int i1 = 0;
        if (a.c != null && a.c.f != null) goto _L2; else goto _L1
_L1:
        msx amsx[] = new msx[0];
_L4:
        return amsx;
_L2:
        msx amsx1[] = ite.a(a.c.f.a);
        int j1 = amsx1.length;
        do
        {
            amsx = amsx1;
            if (i1 >= j1)
            {
                continue;
            }
            amsx1[i1].e(g);
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean C()
    {
        return a.b != null && a.b.s != null && a.b.s.a != null;
    }

    public final int D()
    {
        if (!C())
        {
            return 0;
        } else
        {
            return a.b.s.a.a.intValue();
        }
    }

    public final boolean E()
    {
        return a.b != null && a.b.A != null && a.b.A.a != null && a.b.A.a.a != null;
    }

    public final boolean F()
    {
        return a.b != null && a.b.s != null && a.b.s.b != null;
    }

    public final isf G()
    {
        if (!F())
        {
            return null;
        } else
        {
            return new isf(a(a.b.s.b.a, false), a.b.s.b.b.a.intValue(), a.b.s.b.c.a.intValue());
        }
    }

    public final boolean H()
    {
        return a.b != null && a.b.D != null;
    }

    int a(float f1)
    {
        return Math.round((float)g * f1);
    }

    ish a(pgh pgh1, boolean flag)
    {
        if (pgh1 != null)
        {
            float f1;
            float f2;
            float f3;
            float f4;
            if (flag)
            {
                f1 = a(pgh1.a.a.floatValue());
            } else
            {
                f1 = pgh1.a.a.floatValue();
            }
            if (flag)
            {
                f2 = a(pgh1.a.b.floatValue());
            } else
            {
                f2 = pgh1.a.b.floatValue();
            }
            if (flag)
            {
                f3 = a(pgh1.b.a.floatValue());
            } else
            {
                f3 = pgh1.b.a.floatValue();
            }
            if (flag)
            {
                f4 = a(pgh1.b.b.floatValue());
            } else
            {
                f4 = pgh1.b.b.floatValue();
            }
            return new ish(f1, f2, f3, f4);
        } else
        {
            return null;
        }
    }

    public final String a()
    {
        isb isb1 = this;
        do
        {
            if (isb1.d != null)
            {
                return isb1.d;
            }
            isb1 = isb1.e;
        } while (true);
    }

    public final void a(int i1, int j1)
    {
        c = i1;
        b = j1;
    }

    public final ise[] a(int i1)
    {
        boolean flag1 = false;
        boolean flag = false;
        ise aise[] = new ise[i1];
        int j1;
        if (a.b != null && a.b.E != null && a.b.E.a != null && a.b.E.a.length > 0)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0)
        {
            for (j1 = ((flag) ? 1 : 0); j1 < i1; j1++)
            {
                aise[j1] = I();
            }

        } else
        {
            pfn apfn[] = a.b.E.a;
            int k1 = ((flag1) ? 1 : 0);
            while (k1 < i1) 
            {
                if (k1 < apfn.length)
                {
                    pfn pfn1 = apfn[k1];
                    aise[k1] = new ise(ite.a(pfn1.a), ite.a(pfn1.b));
                } else
                {
                    aise[k1] = I();
                }
                k1++;
            }
        }
        return aise;
    }

    public final int b()
    {
        return a(ite.a(a));
    }

    public final int c()
    {
        return a(ite.b(a));
    }

    public final boolean d()
    {
        return a.b != null && a.b.b != null && a.b.b.a != null;
    }

    public final int e()
    {
        return a(ite.c(a));
    }

    public final boolean f()
    {
        return a.b != null && a.b.b != null && a.b.b.b != null;
    }

    public final int g()
    {
        return a(ite.d(a));
    }

    public final float h()
    {
        float f2 = 0.0F;
        pgk pgk1 = a.b;
        float f1 = f2;
        if (pgk1 != null)
        {
            f1 = f2;
            if (pgk1.d != null)
            {
                f1 = f2;
                if (pgk1.d.a != null)
                {
                    f1 = b.a(pgk1.d.a.a, 0.0F);
                }
            }
        }
        return f1;
    }

    public final float i()
    {
        float f2 = 0.0F;
        pgk pgk1 = a.b;
        float f1 = f2;
        if (pgk1 != null)
        {
            f1 = f2;
            if (pgk1.d != null)
            {
                f1 = f2;
                if (pgk1.d.a != null)
                {
                    f1 = b.a(pgk1.d.a.b, 0.0F);
                }
            }
        }
        return f1;
    }

    public final int j()
    {
        isb isb1 = this;
        do
        {
            if (isb1.a.b.w != null)
            {
                return isb1.a.b.w.intValue();
            }
            if (isb1.e != null)
            {
                isb1 = isb1.e;
            } else
            {
                return -1;
            }
        } while (true);
    }

    public final int k()
    {
        if (a.b != null && a.b.f != null)
        {
            return a(b.a(a.b.f.a, 0.0F));
        } else
        {
            return 0;
        }
    }

    public final int l()
    {
        if (a.b != null && a.b.f != null)
        {
            return a(b.a(a.b.f.b, 0.0F));
        } else
        {
            return 0;
        }
    }

    public final int m()
    {
        if (a.b != null && a.b.f != null)
        {
            return a(b.a(a.b.f.d, 0.0F));
        } else
        {
            return 0;
        }
    }

    public final int n()
    {
        int i1;
        int k1;
        i1 = 0;
        k1 = 0;
        if (a.b != null) goto _L2; else goto _L1
_L1:
        return k1;
_L2:
        int ai[] = a.b.y;
        int l1 = ai.length;
        int j1 = 0;
        do
        {
            k1 = i1;
            if (j1 >= l1)
            {
                continue;
            }
            k1 = ai[j1];
            k1 = f.get(k1);
            j1++;
            i1 = k1 | i1;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final boolean o()
    {
        return a.a == 1 && a.b != null && a.b.r != null && b.a(a.b.q, 0.0F) > 0.0F;
    }

    public final int p()
    {
        if (o())
        {
            return Math.round(b.a(a.b.q, 0.0F) * (float)g);
        } else
        {
            return 0;
        }
    }

    public final float q()
    {
        float f1 = 0.04F;
        if (a.b != null)
        {
            f1 = b.a(a.b.i, 0.04F);
        }
        return f1 * (float)g;
    }

    public final int r()
    {
        if (a.b != null)
        {
            return a(b.a(a.b.u, 0.0F));
        } else
        {
            return 0;
        }
    }

    public final boolean s()
    {
        return a.b != null && a.b.o != null;
    }

    public final int t()
    {
        if (s() && a.b.o.a != 0x80000000)
        {
            return a.b.o.a;
        } else
        {
            return 0;
        }
    }

    public final boolean u()
    {
        return s() && a.b.o.b != null && a.b.o.b.a != null && b.a(a.b.o.b.b, 0.0F) > 0.0F;
    }

    public final int v()
    {
        if (u())
        {
            return a.b.o.b.a.a.intValue();
        } else
        {
            return 0;
        }
    }

    public final int w()
    {
        if (u())
        {
            return a(a.b.o.b.b.floatValue());
        } else
        {
            return 0;
        }
    }

    public final boolean x()
    {
        return a.b != null && a.b.z != null && a.b.z.a != null && a.b.z.a.b != null && a.b.z.a.a != null;
    }

    public final isc y()
    {
        if (!x())
        {
            return null;
        }
        pfg pfg1 = a.b.z;
        int j1 = a(pfg1.a.b.floatValue());
        int k1 = pfg1.a.a.a.intValue();
        int i1;
        if (pfg1.b != null)
        {
            i1 = a(pfg1.b.floatValue());
        } else
        {
            i1 = 0;
        }
        return new isc(j1, k1, i1);
    }

    public final int z()
    {
        isb isb1 = this;
        do
        {
            if (isb1.a.e != null)
            {
                return isb1.a.e.intValue();
            }
            if (isb1.e != null)
            {
                isb1 = isb1.e;
            } else
            {
                return -1;
            }
        } while (true);
    }

    static 
    {
        SparseIntArray sparseintarray = new SparseIntArray();
        f = sparseintarray;
        sparseintarray.put(1, 48);
        f.put(2, 80);
        f.put(3, 1);
    }
}
