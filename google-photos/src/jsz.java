// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class jsz
{

    final jrk a;
    final jte b = new jte();

    public jsz(jrk jrk1)
    {
        a = jrk1;
    }

    public ds a()
    {
        return b();
    }

    public void a(String s, int i)
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

    public void a(String s, String s1)
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

    public void a(String s, boolean flag)
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

    public jte b()
    {
        return b;
    }
}
