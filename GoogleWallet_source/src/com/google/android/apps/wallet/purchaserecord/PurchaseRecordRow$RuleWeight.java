// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordRow

static final class  extends Enum
{

    private static final THIN $VALUES[];
    public static final THIN NONE;
    public static final THIN THICK;
    public static final THIN THIN;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRow$RuleWeight, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NONE = new <init>("NONE", 0);
        THICK = new <init>("THICK", 1);
        THIN = new <init>("THIN", 2);
        $VALUES = (new .VALUES[] {
            NONE, THICK, THIN
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
