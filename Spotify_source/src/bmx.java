// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class bmx extends bnc
    implements bnr
{

    private final bmy a = new bmy();

    public bmx(bnf bnf)
    {
        super(bnf);
    }

    public final bnp a()
    {
        return a;
    }

    public final void a(String s, int i)
    {
        if ("ga_sessionTimeout".equals(s))
        {
            a.c = i;
            return;
        } else
        {
            d("int configuration name not recognized", s);
            return;
        }
    }

    public final void a(String s, String s1)
    {
        a.g.put(s, s1);
    }

    public final void a(String s, boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = true;
        int i = 1;
        if ("ga_autoActivityTracking".equals(s))
        {
            s = a;
            if (!flag)
            {
                i = 0;
            }
            s.d = i;
            return;
        }
        if ("ga_anonymizeIp".equals(s))
        {
            s = a;
            int j;
            if (flag)
            {
                j = ((flag1) ? 1 : 0);
            } else
            {
                j = 0;
            }
            s.e = j;
            return;
        }
        if ("ga_reportUncaughtExceptions".equals(s))
        {
            s = a;
            int k;
            if (flag)
            {
                k = ((flag2) ? 1 : 0);
            } else
            {
                k = 0;
            }
            s.f = k;
            return;
        } else
        {
            d("bool configuration name not recognized", s);
            return;
        }
    }

    public final void b(String s, String s1)
    {
        if ("ga_trackingId".equals(s))
        {
            a.a = s1;
            return;
        }
        if ("ga_sampleFrequency".equals(s))
        {
            try
            {
                a.b = Double.parseDouble(s1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                c("Error parsing ga_sampleFrequency value", s1, s);
            }
            return;
        } else
        {
            d("string configuration name not recognized", s);
            return;
        }
    }
}
