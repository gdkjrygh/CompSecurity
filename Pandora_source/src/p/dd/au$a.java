// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;


// Referenced classes of package p.dd:
//            au

public static final class String extends Enum
{

    public static final g a;
    public static final g b;
    public static final g c;
    public static final g d;
    public static final g e;
    public static final g f;
    public static final g g;
    private static final g h[];

    public static String valueOf(String s)
    {
        return (String)Enum.valueOf(p/dd/au$a, s);
    }

    public static String[] values()
    {
        return (String[])h.clone();
    }

    static 
    {
        a = new <init>("DATA_FETCH", 0);
        b = new <init>("THUMB_UP", 1);
        c = new <init>("THUMB_DOWN", 2);
        d = new <init>("UN_THUMB", 3);
        e = new <init>("RENAME", 4);
        f = new <init>("ADD_VARIETY", 5);
        g = new <init>("REMOVE_VARIETY", 6);
        h = (new h[] {
            a, b, c, d, e, f, g
        });
    }

    private String(String s, int i)
    {
        super(s, i);
    }
}
