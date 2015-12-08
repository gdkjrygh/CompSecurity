// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class boc
    implements bnr
{

    private final bnf a;
    private final bmi b = new bmi();

    public boc(bnf bnf1)
    {
        a = bnf1;
    }

    public final bnp a()
    {
        return b;
    }

    public final void a(String s, int i)
    {
        if ("ga_dispatchPeriod".equals(s))
        {
            b.d = i;
            return;
        } else
        {
            a.a().d("Int xml configuration name not recognized", s);
            return;
        }
    }

    public final void a(String s, String s1)
    {
    }

    public final void a(String s, boolean flag)
    {
        if ("ga_dryRun".equals(s))
        {
            s = b;
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            s.e = i;
            return;
        } else
        {
            a.a().d("Bool xml configuration name not recognized", s);
            return;
        }
    }

    public final void b(String s, String s1)
    {
        if ("ga_appName".equals(s))
        {
            b.a = s1;
            return;
        }
        if ("ga_appVersion".equals(s))
        {
            b.b = s1;
            return;
        }
        if ("ga_logLevel".equals(s))
        {
            b.c = s1;
            return;
        } else
        {
            a.a().d("String xml configuration name not recognized", s);
            return;
        }
    }
}
