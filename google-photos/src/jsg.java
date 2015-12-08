// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsg extends Enum
{

    public static final jsg a;
    private static jsg b;
    private static final jsg c[];

    private jsg(String s, int i)
    {
        super(s, i);
    }

    public static jsg a(String s)
    {
        if ("GZIP".equalsIgnoreCase(s))
        {
            return a;
        } else
        {
            return b;
        }
    }

    public static jsg valueOf(String s)
    {
        return (jsg)Enum.valueOf(jsg, s);
    }

    public static jsg[] values()
    {
        return (jsg[])c.clone();
    }

    static 
    {
        b = new jsg("NONE", 0);
        a = new jsg("GZIP", 1);
        c = (new jsg[] {
            b, a
        });
    }
}
