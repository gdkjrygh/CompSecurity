// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.purchaserecord;


// Referenced classes of package com.google.android.apps.wallet.purchaserecord:
//            PurchaseRecordRenderable

static final class Q extends Enum
{

    private static final DATE $VALUES[];
    public static final DATE DATE;
    public static final DATE DATE_TIME;
    public static final DATE EMPTY;
    public static final DATE IMAGE_RESOURCE_ID;
    public static final DATE IMAGE_URL;
    public static final DATE TEXT;

    public static Q valueOf(String s)
    {
        return (Q)Enum.valueOf(com/google/android/apps/wallet/purchaserecord/PurchaseRecordRenderable$Type, s);
    }

    public static Q[] values()
    {
        return (Q[])$VALUES.clone();
    }

    static 
    {
        EMPTY = new <init>("EMPTY", 0);
        TEXT = new <init>("TEXT", 1);
        IMAGE_RESOURCE_ID = new <init>("IMAGE_RESOURCE_ID", 2);
        IMAGE_URL = new <init>("IMAGE_URL", 3);
        DATE_TIME = new <init>("DATE_TIME", 4);
        DATE = new <init>("DATE", 5);
        $VALUES = (new .VALUES[] {
            EMPTY, TEXT, IMAGE_RESOURCE_ID, IMAGE_URL, DATE_TIME, DATE
        });
    }

    private Q(String s, int i)
    {
        super(s, i);
    }
}
