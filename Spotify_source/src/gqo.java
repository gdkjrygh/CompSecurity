// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gqo extends grv
{

    private final gsd a;
    private final hcj b;
    private final String c;
    private final String d;

    public gqo(gsd gsd1, String s, String s1)
    {
        a = gsd1;
        c = s;
        d = s1;
        b = hcq.a(new hcm(gsd1.c[1], gsd1) {

            private gsd a;

            public final void close()
            {
                a.close();
                super.close();
            }

            
            {
                a = gsd1;
                super(hcw);
            }
        });
    }

    static gsd a(gqo gqo1)
    {
        return gqo1.a;
    }

    public final grn a()
    {
        if (c != null)
        {
            return grn.a(c);
        } else
        {
            return null;
        }
    }

    public final long b()
    {
        long l = -1L;
        try
        {
            if (d != null)
            {
                l = Long.parseLong(d);
            }
        }
        catch (NumberFormatException numberformatexception)
        {
            return -1L;
        }
        return l;
    }

    public final hcj c()
    {
        return b;
    }
}
