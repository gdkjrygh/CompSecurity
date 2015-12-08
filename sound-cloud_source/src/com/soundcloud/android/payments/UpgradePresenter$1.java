// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;


// Referenced classes of package com.soundcloud.android.payments:
//            PurchaseStatus

class 
{

    static final int $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[];

    static 
    {
        $SwitchMap$com$soundcloud$android$payments$PurchaseStatus = new int[PurchaseStatus.values().length];
        try
        {
            $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[PurchaseStatus.SUCCESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[PurchaseStatus.VERIFY_FAIL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[PurchaseStatus.VERIFY_TIMEOUT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$soundcloud$android$payments$PurchaseStatus[PurchaseStatus.NONE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
