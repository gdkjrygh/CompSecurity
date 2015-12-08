// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cp;


// Referenced classes of package p.cp:
//            d

protected static final class .String extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static .String a(String s)
    {
        if (a.toString().equalsIgnoreCase(s))
        {
            return a;
        }
        if (b.toString().equalsIgnoreCase(s))
        {
            return b;
        } else
        {
            return c;
        }
    }

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/cp/d$e, s);
    }

    public static .String[] values()
    {
        return (.String[])d.clone();
    }

    static 
    {
        a = new <init>("TRACK", 0);
        b = new <init>("STATION", 1);
        c = new <init>("NONE", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
