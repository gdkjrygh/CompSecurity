// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            jt, ov, iy, iw, 
//            kr, jv, ji, kq, 
//            kc, jj, ko, ow, 
//            kg, op, pf, ms, 
//            ot, oo

public final class iz extends jt
{

    final op a;
    final op b;
    kr c;
    public final iy d;
    private final int f;
    private final oo g;
    private jj h;
    private iw i;

    public iz(op op1, int j, op op2, ov ov1, oo oo1)
    {
        if (op1 == null)
        {
            throw new NullPointerException("thisClass == null");
        }
        if (ov1 == null)
        {
            throw new NullPointerException("interfaces == null");
        }
        a = op1;
        f = j;
        b = op2;
        if (ov1.a() == 0)
        {
            op2 = null;
        } else
        {
            op2 = new kr(ov1);
        }
        c = op2;
        g = oo1;
        d = new iy(op1);
        h = null;
        i = new iw();
    }

    public final jv a()
    {
        return jv.g;
    }

    public final void a(ji ji1)
    {
        kc kc2;
label0:
        {
            kq kq1 = ji1.g;
            kc kc1 = ji1.m;
            kc2 = ji1.b;
            kc kc3 = ji1.c;
            ko ko1 = ji1.f;
            kq1.a(a);
            if (!d.b())
            {
                ji1.l.a(d);
                ji1 = d.c();
                if (ji1 != null)
                {
                    h = (jj)kc1.b(new jj(ji1));
                }
            }
            if (b != null)
            {
                kq1.a(b);
            }
            if (c != null)
            {
                c = (kr)kc3.b(c);
            }
            if (g != null)
            {
                ko1.a(g);
            }
            if (!i.b())
            {
                if (!i.c())
                {
                    break label0;
                }
                i = (iw)kc2.b(i);
            }
            return;
        }
        kc2.a(i);
    }

    public final void a(ji ji1, ow ow1)
    {
        boolean flag = ow1.a();
        Object obj = ji1.g;
        int k1 = ((kq) (obj)).b(a);
        int j;
        int k;
        int l;
        int i1;
        int l1;
        int i2;
        if (b == null)
        {
            j = -1;
        } else
        {
            j = ((kq) (obj)).b(b);
        }
        l1 = kg.b(c);
        if (i.b())
        {
            k = 0;
        } else
        {
            k = i.d();
        }
        if (g == null)
        {
            l = -1;
        } else
        {
            l = ji1.f.b(g);
        }
        if (d.b())
        {
            i1 = 0;
        } else
        {
            i1 = d.d();
        }
        i2 = kg.b(h);
        if (flag)
        {
            ow1.a(0, (new StringBuilder()).append(e()).append(' ').append(a.h_()).toString());
            ow1.a(4, (new StringBuilder("  class_idx:           ")).append(pf.a(k1)).toString());
            ow1.a(4, (new StringBuilder("  access_flags:        ")).append(ms.a(f, 30257, 1)).toString());
            obj = (new StringBuilder("  superclass_idx:      ")).append(pf.a(j)).append(" // ");
            if (b == null)
            {
                ji1 = "<none>";
            } else
            {
                ji1 = b.h_();
            }
            ow1.a(4, ((StringBuilder) (obj)).append(ji1).toString());
            ow1.a(4, (new StringBuilder("  interfaces_off:      ")).append(pf.a(l1)).toString());
            if (l1 != 0)
            {
                ji1 = c.c();
                int j2 = ji1.a();
                for (int j1 = 0; j1 < j2; j1++)
                {
                    ow1.a(0, (new StringBuilder("    ")).append(ji1.a(j1).h_()).toString());
                }

            }
            obj = (new StringBuilder("  source_file_idx:     ")).append(pf.a(l)).append(" // ");
            if (g == null)
            {
                ji1 = "<none>";
            } else
            {
                ji1 = g.h_();
            }
            ow1.a(4, ((StringBuilder) (obj)).append(ji1).toString());
            ow1.a(4, (new StringBuilder("  annotations_off:     ")).append(pf.a(k)).toString());
            ow1.a(4, (new StringBuilder("  class_data_off:      ")).append(pf.a(i1)).toString());
            ow1.a(4, (new StringBuilder("  static_values_off:   ")).append(pf.a(i2)).toString());
        }
        ow1.d(k1);
        ow1.d(f);
        ow1.d(j);
        ow1.d(l1);
        ow1.d(l);
        ow1.d(k);
        ow1.d(i1);
        ow1.d(i2);
    }

    public final int i_()
    {
        return 32;
    }
}
