// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jai extends Enum
{

    public static final jai a;
    public static final jai b;
    public static final jai c;
    public static final jai d;
    private static final jai e[];

    private jai(String s, int i)
    {
        super(s, i);
    }

    public static jai valueOf(String s)
    {
        return (jai)Enum.valueOf(jai, s);
    }

    public static jai[] values()
    {
        return (jai[])e.clone();
    }

    static 
    {
        a = new jai("COMPLETE", 0);
        b = new jai("INCOMPLETE", 1);
        c = new jai("MISSING", 2);
        d = new jai("INSERTED", 3);
        e = (new jai[] {
            a, b, c, d
        });
    }
}
