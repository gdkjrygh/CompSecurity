// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ers extends Enum
{

    public static final ers a;
    public static final ers b;
    public static final ers c;
    private static final ers e[];
    boolean d;

    private ers(String s, int i, boolean flag)
    {
        super(s, i);
        d = flag;
    }

    public static ers valueOf(String s)
    {
        return (ers)Enum.valueOf(ers, s);
    }

    public static ers[] values()
    {
        return (ers[])e.clone();
    }

    static 
    {
        a = new ers("HIDDEN", 0, true);
        b = new ers("VISIBLE", 1, true);
        c = new ers("MISSING", 2, false);
        e = (new ers[] {
            a, b, c
        });
    }
}
