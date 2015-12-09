// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.paymentcard.widgets;


// Referenced classes of package com.google.android.apps.wallet.paymentcard.widgets:
//            CardDrawable

static final class  extends Enum
{

    private static final RESOURCE_ID $VALUES[];
    public static final RESOURCE_ID CARD_COLOR;
    public static final RESOURCE_ID RESOURCE_ID;
    public static final RESOURCE_ID URI;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/paymentcard/widgets/CardDrawable$BackgroundSource, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        CARD_COLOR = new <init>("CARD_COLOR", 0);
        URI = new <init>("URI", 1);
        RESOURCE_ID = new <init>("RESOURCE_ID", 2);
        $VALUES = (new .VALUES[] {
            CARD_COLOR, URI, RESOURCE_ID
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
