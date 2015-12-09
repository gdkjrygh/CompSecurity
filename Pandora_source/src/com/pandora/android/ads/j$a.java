// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;


// Referenced classes of package com.pandora.android.ads:
//            j

private static final class  extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/android/ads/j$a, s);
    }

    public static [] values()
    {
        return ([])g.clone();
    }

    static 
    {
        a = new <init>("DISPLAYING_AD", 0);
        b = new <init>("ASKING_PERMISSION", 1);
        c = new <init>("LOADING", 2);
        d = new <init>("CONFIRMATION", 3);
        e = new <init>("ERROR", 4);
        f = new <init>("CLOSE", 5);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
