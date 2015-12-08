// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.al;


// Referenced classes of package p.al:
//            b

private static final class .String extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/al/b$a, s);
    }

    public static .String[] values()
    {
        return (.String[])i.clone();
    }

    static 
    {
        a = new <init>("PENDING", 0);
        b = new <init>("RUNNING", 1);
        c = new <init>("WAITING_FOR_SIZE", 2);
        d = new <init>("COMPLETE", 3);
        e = new <init>("FAILED", 4);
        f = new <init>("CANCELLED", 5);
        g = new <init>("CLEARED", 6);
        h = new <init>("PAUSED", 7);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private .String(String s, int j)
    {
        super(s, j);
    }
}
