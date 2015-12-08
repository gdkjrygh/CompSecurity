// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fmu
    implements haq
{

    private fmo a;

    fmu(fmo fmo1)
    {
        a = fmo1;
        super();
    }

    public final har a(int i)
    {
        int j = fmo.h(a).b(fmo.g(a), i);
        ekp ekp1 = (ekp)fmo.i(a).b(fmo.c(a), j);
        ekq ekq1;
        long l;
        if (ekp1 != null)
        {
            l = ekp1.d();
        } else
        {
            l = fmo.k(a).a().a(fmo.h(a).b(fmo.j(a), i));
        }
        ekq1 = fmo.b(a);
        if (l == 0x8000000000000000L)
        {
            l = -1L;
        }
        return new har(ekq1, ekp1, l, new fnb(fmo.l(a), j));
    }

    public final boolean a(har har1)
    {
        return fmo.b(a).equals(har1.a);
    }

    public final int b(har har1)
    {
        byte byte0 = -1;
        int i;
        if (har1.c instanceof fnb)
        {
            i = fmo.h(a).a(fmo.g(a), ((fnb)har1.c).a);
        } else
        {
            i = byte0;
            if (har1.c instanceof fnc)
            {
                long l = (new ive()).a(har1.b).b();
                int j = fmo.k(a).a().a(l);
                i = byte0;
                if (j != 0x80000000)
                {
                    return fmo.h(a).a(fmo.j(a), j);
                }
            }
        }
        return i;
    }
}
