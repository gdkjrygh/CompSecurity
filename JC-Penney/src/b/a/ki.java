// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            jt, or, pe, kr, 
//            ot, os, oo, jv, 
//            ji, kq, ko, kc, 
//            kg, ow, pf

public final class ki extends jt
{

    private final or a;
    private final oo b;
    private kr c;

    public ki(or or1)
    {
        if (or1 == null)
        {
            throw new NullPointerException("prototype == null");
        }
        a = or1;
        b = a(or1);
        or1 = or1.b();
        if (((pe) (or1)).K.length == 0)
        {
            or1 = null;
        } else
        {
            or1 = new kr(or1);
        }
        c = or1;
    }

    private static char a(ot ot1)
    {
        char c2 = ot1.e().charAt(0);
        char c1 = c2;
        if (c2 == '[')
        {
            c1 = 'L';
        }
        return c1;
    }

    private static oo a(or or1)
    {
        os os1 = or1.b();
        int j = ((pe) (os1)).K.length;
        StringBuilder stringbuilder = new StringBuilder(j + 1);
        stringbuilder.append(a(or1.a()));
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append(a(os1.a(i)));
        }

        return new oo(stringbuilder.toString());
    }

    public final jv a()
    {
        return jv.d;
    }

    public final void a(ji ji1)
    {
        ko ko1 = ji1.f;
        kq kq1 = ji1.g;
        ji1 = ji1.c;
        kq1.a(a.a());
        ko1.a(b);
        if (c != null)
        {
            c = (kr)ji1.b(c);
        }
    }

    public final void a(ji ji1, ow ow1)
    {
        int j = ji1.f.b(b);
        int k = ji1.g.b(a.a());
        int l = kg.b(c);
        if (ow1.a())
        {
            ji1 = new StringBuilder();
            ji1.append(a.a().h_());
            ji1.append(" proto(");
            os os1 = a.b();
            int i1 = ((pe) (os1)).K.length;
            for (int i = 0; i < i1; i++)
            {
                if (i != 0)
                {
                    ji1.append(", ");
                }
                ji1.append(os1.a(i).h_());
            }

            ji1.append(")");
            ow1.a(0, (new StringBuilder()).append(e()).append(' ').append(ji1.toString()).toString());
            ow1.a(4, (new StringBuilder("  shorty_idx:      ")).append(pf.a(j)).append(" // ").append(b.f()).toString());
            ow1.a(4, (new StringBuilder("  return_type_idx: ")).append(pf.a(k)).append(" // ").append(a.a().h_()).toString());
            ow1.a(4, (new StringBuilder("  parameters_off:  ")).append(pf.a(l)).toString());
        }
        ow1.d(j);
        ow1.d(k);
        ow1.d(l);
    }

    public final int i_()
    {
        return 12;
    }
}
