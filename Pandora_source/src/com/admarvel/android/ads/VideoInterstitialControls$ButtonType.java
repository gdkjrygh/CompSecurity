// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;


// Referenced classes of package com.admarvel.android.ads:
//            VideoInterstitialControls

public static final class  extends Enum
{

    private static final Image ENUM$VALUES[];
    public static final Image Image;
    public static final Image SystemItem;
    public static final Image Title;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/admarvel/android/ads/VideoInterstitialControls$ButtonType, s);
    }

    public static [] values()
    {
         a[] = ENUM$VALUES;
        int i = a.length;
         a1[] = new ENUM.VALUES[i];
        System.arraycopy(a, 0, a1, 0, i);
        return a1;
    }

    static 
    {
        SystemItem = new <init>("SystemItem", 0);
        Title = new <init>("Title", 1);
        Image = new <init>("Image", 2);
        ENUM$VALUES = (new ENUM.VALUES[] {
            SystemItem, Title, Image
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
