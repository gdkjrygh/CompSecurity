// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv;


// Referenced classes of package com.google.android.apps.wallet.hce.emv:
//            Applet, RotatingAtc

public interface HcePaymentApplet
    extends Applet
{
    public static interface Listener
    {

        public abstract void onAtcReachedLimit(HcePaymentApplet hcepaymentapplet);

        public abstract void onComputeCryptographicChecksum(HcePaymentApplet hcepaymentapplet);

        public abstract void onComputeCryptographicChecksumData(HcePaymentApplet hcepaymentapplet);

        public abstract void onGetProcessingOptions(HcePaymentApplet hcepaymentapplet);

        public abstract void onGetProcessingOptionsResponse(HcePaymentApplet hcepaymentapplet);

        public abstract void onReadRecord(HcePaymentApplet hcepaymentapplet);

        public abstract void onSelect(HcePaymentApplet hcepaymentapplet);
    }


    public abstract void activate();

    public abstract String getApplicationLabel();

    public abstract RotatingAtc getAtc();

    public abstract void setListener(Listener listener);

    public abstract void setPinExpired(boolean flag);
}
