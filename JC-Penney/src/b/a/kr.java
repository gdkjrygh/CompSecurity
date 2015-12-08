// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            kg, ov, os, jv, 
//            ji, kq, ow, pf, 
//            ot

public final class kr extends kg
{

    private final ov a;

    public kr(ov ov1)
    {
        super(4, ov1.a() * 2 + 4);
        a = ov1;
    }

    protected final int a(kg kg1)
    {
        return os.a(a, ((kr)kg1).a);
    }

    public final jv a()
    {
        return jv.i;
    }

    public final void a(ji ji1)
    {
        ji1 = ji1.g;
        int j = a.a();
        for (int i = 0; i < j; i++)
        {
            ji1.a(a.a(i));
        }

    }

    protected final void a_(ji ji1, ow ow1)
    {
        boolean flag = false;
        ji1 = ji1.g;
        int k = a.a();
        if (ow1.a())
        {
            ow1.a(0, (new StringBuilder()).append(f()).append(" type_list").toString());
            ow1.a(4, (new StringBuilder("  size: ")).append(pf.a(k)).toString());
            for (int i = 0; i < k; i++)
            {
                ot ot1 = a.a(i);
                int l = ji1.b(ot1);
                ow1.a(2, (new StringBuilder("  ")).append(pf.b(l)).append(" // ").append(ot1.h_()).toString());
            }

        }
        ow1.d(k);
        for (int j = ((flag) ? 1 : 0); j < k; j++)
        {
            ow1.c(ji1.b(a.a(j)));
        }

    }

    public final ov c()
    {
        return a;
    }

    public final int hashCode()
    {
        return os.b(a);
    }
}
