// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class aa extends Enum
{

    public static final aa a;
    public static final aa b;
    public static final aa c;
    public static final aa d;
    public static final aa e;
    private static final aa f[];

    private aa(String s, int i)
    {
        super(s, i);
    }

    public static aa a(String s)
    {
        return valueOf(s);
    }

    public static aa valueOf(String s)
    {
        return (aa)Enum.valueOf(p/bh/aa, s);
    }

    public static aa[] values()
    {
        return (aa[])f.clone();
    }

    static 
    {
        a = new aa("COUNTUP", 0);
        b = new aa("COUNTDOWN", 1);
        c = new aa("PAUSE", 2);
        d = new aa("RESUME", 3);
        e = new aa("CLEAR", 4);
        f = (new aa[] {
            a, b, c, d, e
        });
    }
}
