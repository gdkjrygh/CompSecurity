// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;


// Referenced classes of package com.pandora.radio.util:
//            k

public static final class  extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/radio/util/k$j, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("recommendation_screen", 0);
        b = new <init>("station_list", 1);
        c = new <init>("station_list_top", 2);
        d = new <init>("station_creation", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
