// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads;


// Referenced classes of package com.facebook.ads:
//            NativeAdView

public static final class b extends Enum
{

    public static final HEIGHT_400 HEIGHT_100;
    public static final HEIGHT_400 HEIGHT_120;
    public static final HEIGHT_400 HEIGHT_300;
    public static final HEIGHT_400 HEIGHT_400;
    private static final HEIGHT_400 c[];
    private final int a;
    private final int b;

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/ads/NativeAdView$Type, s);
    }

    public static b[] values()
    {
        return (b[])c.clone();
    }

    public int getHeight()
    {
        return b;
    }

    public int getValue()
    {
        switch (b)
        {
        default:
            return -1;

        case 100: // 'd'
            return 1;

        case 120: // 'x'
            return 2;

        case 300: 
            return 3;

        case 400: 
            return 4;
        }
    }

    public int getWidth()
    {
        return a;
    }

    static 
    {
        HEIGHT_100 = new <init>("HEIGHT_100", 0, -1, 100);
        HEIGHT_120 = new <init>("HEIGHT_120", 1, -1, 120);
        HEIGHT_300 = new <init>("HEIGHT_300", 2, -1, 300);
        HEIGHT_400 = new <init>("HEIGHT_400", 3, -1, 400);
        c = (new c[] {
            HEIGHT_100, HEIGHT_120, HEIGHT_300, HEIGHT_400
        });
    }

    private (String s, int i, int j, int k)
    {
        super(s, i);
        a = j;
        b = k;
    }
}
