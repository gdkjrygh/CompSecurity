// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class afo extends aez
    implements aei
{

    private final ahp c[] = {
        null, null, null
    };
    private final aha d;
    private ahb e[];

    public afo(adl adl, adm adm)
    {
        super(adl, adm);
        d = new afu(String.format("%s$%d", new Object[] {
            b, Integer.valueOf(80)
        }));
        int i = ((aem)adm).d();
        e = (ahb[])ahu.a(d, ahb, i);
        for (int j = 0; j < e.length; j++)
        {
            e[j].a((new StringBuilder("Initial value ")).append(j).toString());
            e[j].a(new byte[1]);
        }

        d.a(e);
    }

    public final ahp a(int i)
    {
        if (i < 0 && i > 2)
        {
            return null;
        }
        if (c[i] == null)
        {
            c[i] = new afp(String.format("%s$%d", new Object[] {
                b, Integer.valueOf(80)
            }), i, d);
        }
        return c[i];
    }

}
