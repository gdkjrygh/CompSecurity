// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dk;


// Referenced classes of package p.dk:
//            a

public static final class .String extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static .String valueOf(String s)
    {
        return (.String)Enum.valueOf(p/dk/a$a, s);
    }

    public static .String[] values()
    {
        return (.String[])e.clone();
    }

    static 
    {
        a = new <init>("STATION_CHANGE", 0);
        b = new <init>("PROMOTED_STATION_SHOWN", 1);
        c = new <init>("PROMOTED_STATION_DISMISSED", 2);
        d = new <init>("TIMEOUT", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private .String(String s, int i)
    {
        super(s, i);
    }
}
