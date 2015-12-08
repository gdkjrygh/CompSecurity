// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nyz
{

    public owp a;

    public nyz(byte abyte0[])
    {
        a = ((owo)qlw.a(new owo(), abyte0)).a;
    }

    public final String a()
    {
        if (a != null && a.c != null)
        {
            for (int i = 0; i < a.c.length; i++)
            {
                owq owq1 = a.c[i];
                if (owq1.c != null)
                {
                    return owq1.c;
                }
            }

        }
        return null;
    }

    public final String b()
    {
        if (a != null && a.c != null)
        {
            for (int i = 0; i < a.c.length; i++)
            {
                owq owq1 = a.c[i];
                if (owq1.b != null)
                {
                    return owq1.b;
                }
            }

        }
        return null;
    }

    public final String c()
    {
        if (a != null)
        {
            if (a.b != null)
            {
                return a.b;
            }
            if (a.c != null)
            {
                for (int i = 0; i < a.c.length; i++)
                {
                    owq owq1 = a.c[i];
                    if (owq1.a != null)
                    {
                        return owq1.a;
                    }
                }

            }
        }
        return null;
    }

    public final String d()
    {
        if (a != null && a.c != null)
        {
            for (int i = 0; i < a.c.length; i++)
            {
                owq owq1 = a.c[i];
                if (owq1.d != null)
                {
                    return owq1.d;
                }
            }

        }
        return null;
    }
}
