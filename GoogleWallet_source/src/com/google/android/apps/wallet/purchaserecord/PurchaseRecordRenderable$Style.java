// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordRenderable

static final class  extends Enum
{

    private static final STRIKETHROUGH $VALUES[];
    public static final STRIKETHROUGH BOLD;
    public static final STRIKETHROUGH NORMAL;
    public static final STRIKETHROUGH STRIKETHROUGH;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRenderable$Style, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        BOLD = new <init>("BOLD", 1);
        STRIKETHROUGH = new <init>("STRIKETHROUGH", 2);
        $VALUES = (new .VALUES[] {
            NORMAL, BOLD, STRIKETHROUGH
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
