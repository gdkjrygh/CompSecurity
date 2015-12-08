// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;


// Referenced classes of package com.pandora.android.ads:
//            VideoAdManager

public static final class  extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    public static final n d;
    public static final n e;
    public static final n f;
    public static final n g;
    public static final n h;
    public static final n i;
    public static final n j;
    public static final n k;
    public static final n l;
    public static final n m;
    public static final n n;
    private static final n o[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/android/ads/VideoAdManager$b, s);
    }

    public static [] values()
    {
        return ([])o.clone();
    }

    static 
    {
        a = new <init>("IMPRESSION", 0);
        b = new <init>("START", 1);
        c = new <init>("FIRST_QUARTILE", 2);
        d = new <init>("SECOND_QUARTILE", 3);
        e = new <init>("THIRD_QUARTILE", 4);
        f = new <init>("COMPLETE", 5);
        g = new <init>("RESUME", 6);
        h = new <init>("SKIP", 7);
        i = new <init>("PAUSE", 8);
        j = new <init>("UNPAUSE", 9);
        k = new <init>("MUTE", 10);
        l = new <init>("UNMUTE", 11);
        m = new <init>("MORE_INFO", 12);
        n = new <init>("ERROR", 13);
        o = (new o[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n
        });
    }

    private (String s, int i1)
    {
        super(s, i1);
    }
}
