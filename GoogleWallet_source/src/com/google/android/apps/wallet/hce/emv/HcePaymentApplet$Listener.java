// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv;


// Referenced classes of package com.google.android.apps.wallet.hce.emv:
//            HcePaymentApplet

public static interface 
{

    public abstract void onAtcReachedLimit(HcePaymentApplet hcepaymentapplet);

    public abstract void onComputeCryptographicChecksum(HcePaymentApplet hcepaymentapplet);

    public abstract void onComputeCryptographicChecksumData(HcePaymentApplet hcepaymentapplet);

    public abstract void onGetProcessingOptions(HcePaymentApplet hcepaymentapplet);

    public abstract void onGetProcessingOptionsResponse(HcePaymentApplet hcepaymentapplet);

    public abstract void onReadRecord(HcePaymentApplet hcepaymentapplet);

    public abstract void onSelect(HcePaymentApplet hcepaymentapplet);
}
