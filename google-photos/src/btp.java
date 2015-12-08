// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;

public final class btp extends Enum
{

    private static btp c;
    private static btp d;
    private static btp e;
    private static btp f;
    private static btp g;
    private static btp h;
    private static btp i;
    private static btp j;
    private static btp k;
    private static btp l;
    private static btp m;
    private static final btp n[];
    public String a;
    public String b;

    private btp(String s, int i1, String s1)
    {
        super(s, i1);
        a = s1;
        b = Integer.toString(s1.hashCode());
    }

    public static final List a()
    {
        return Arrays.asList(values());
    }

    public static btp valueOf(String s)
    {
        return (btp)Enum.valueOf(btp, s);
    }

    public static btp[] values()
    {
        return (btp[])n.clone();
    }

    static 
    {
        c = new btp("FESTIVAL", 0, "07-festival.png");
        d = new btp("GLAMOUR", 1, "08-glamour.png");
        e = new btp("LOMOKINO", 2, "09-lofi.png");
        f = new btp("MEMORY_LANE", 3, "10-memories.png");
        g = new btp("MODERNPOP", 4, "11-modernpop.png");
        h = new btp("GREAT_OUTDOORS", 5, "15-outdoors.png");
        i = new btp("PUNK", 6, "12-punk.png");
        j = new btp("SHOWTIME", 7, "13-showtime.png");
        k = new btp("SILVER_SCREEN", 8, "14-silverscreen.png");
        l = new btp("URBAN_LANDSCAPE", 9, "16-urban.png");
        m = new btp("VINTAGE", 10, "17-vintage.png");
        n = (new btp[] {
            c, d, e, f, g, h, i, j, k, l, 
            m
        });
    }
}
