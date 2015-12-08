// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class q extends Enum
{

    public static final q a;
    public static final q b;
    public static final q c;
    public static final q d;
    public static final q e;
    private static final q f[];

    private q(String s, int i)
    {
        super(s, i);
    }

    public static q a(String s)
    {
        return valueOf(s);
    }

    public static q valueOf(String s)
    {
        return (q)Enum.valueOf(p/bh/q, s);
    }

    public static q[] values()
    {
        return (q[])f.clone();
    }

    static 
    {
        a = new q("HELP_JINGLE", 0);
        b = new q("INITIAL_JINGLE", 1);
        c = new q("LISTEN_JINGLE", 2);
        d = new q("POSITIVE_JINGLE", 3);
        e = new q("NEGATIVE_JINGLE", 4);
        f = (new q[] {
            a, b, c, d, e
        });
    }
}
