// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;


public class a
{

    private boolean a;
    private String b;
    private String c;
    private long d;

    public a(boolean flag, String s, String s1)
    {
        a = flag;
        b = s;
        c = s1;
        d = System.currentTimeMillis();
    }

    public boolean a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public boolean d()
    {
        return "endSession".equals(c());
    }

    public String toString()
    {
        String s1 = c;
        long l = d;
        String s;
        if (a)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        return String.format("Event: %s, time: %d; isError = %s; guid = %s", new Object[] {
            s1, Long.valueOf(l), s, b
        });
    }
}
