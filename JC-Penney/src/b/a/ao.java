// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


final class ao extends Enum
{

    public static final ao a;
    public static final ao b;
    public static final ao c;
    public static final ao d;
    public static final ao e;
    public static final ao f;
    public static final ao g;
    public static final ao h;
    public static final ao i;
    private static final ao j[];

    private ao(String s, int k)
    {
        super(s, k);
    }

    public static ao valueOf(String s)
    {
        return (ao)Enum.valueOf(b/a/ao, s);
    }

    public static ao[] values()
    {
        return (ao[])j.clone();
    }

    static 
    {
        a = new ao("CREATED", 0);
        b = new ao("STARTED", 1);
        c = new ao("SUCCESS", 2);
        d = new ao("SLOW", 3);
        e = new ao("FAILED", 4);
        f = new ao("TIMEOUT", 5);
        g = new ao("CRASHED", 6);
        h = new ao("ABORTED", 7);
        i = new ao("INTERRUPTED", 8);
        j = (new ao[] {
            a, b, c, d, e, f, g, h, i
        });
    }
}
