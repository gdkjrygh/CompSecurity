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
        return ()Enum.valueOf(com/pandora/radio/util/k$i, s);
    }

    public static [] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("promo_shown", 0);
        b = new <init>("rec_shown", 1);
        c = new <init>("promo_response_timing", 2);
        d = new <init>("rec_added", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int j)
    {
        super(s, j);
    }
}
