// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;


// Referenced classes of package p.dd:
//            ab

public static final class String extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static String valueOf(String s)
    {
        return (String)Enum.valueOf(p/dd/ab$a, s);
    }

    public static String[] values()
    {
        return (String[])d.clone();
    }

    static 
    {
        a = new <init>("STATION_TOKEN", 0);
        b = new <init>("BOOKMARK_TYPE", 1);
        c = new <init>("SONG_RATING", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private String(String s, int i)
    {
        super(s, i);
    }
}
