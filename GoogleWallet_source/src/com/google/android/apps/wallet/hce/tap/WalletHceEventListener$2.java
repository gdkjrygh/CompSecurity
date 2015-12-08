// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.tap;

import com.google.android.apps.wallet.hce.emv.HcePaymentApplet;
import com.google.android.apps.wallet.hce.emv.RotatingAtc;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.hce.tap:
//            WalletHceEventListener, WalletHceServiceWorker

final class this._cls0
    implements com.google.android.apps.wallet.hce.emv.
{

    final WalletHceEventListener this$0;

    public final void onAtcReachedLimit(HcePaymentApplet hcepaymentapplet)
    {
        WLog.d(WalletHceEventListener.access$000(), "onAtcReachedLimit()");
        WalletHceEventListener.access$400(WalletHceEventListener.this, false, hcepaymentapplet.getAtc().getLimitDescription());
    }

    public final void onComputeCryptographicChecksum(HcePaymentApplet hcepaymentapplet)
    {
        WLog.d(WalletHceEventListener.access$000(), "onComputeCryptographicChecksum()");
        if (WalletHceEventListener.access$700(WalletHceEventListener.this))
        {
            WalletHceEventListener.access$400(WalletHceEventListener.this, false, null);
        }
    }

    public final void onComputeCryptographicChecksumData(HcePaymentApplet hcepaymentapplet)
    {
        WLog.d(WalletHceEventListener.access$000(), "onComputeCryptographicChecksumData()");
        WalletHceEventListener.access$400(WalletHceEventListener.this, true, null);
    }

    public final void onGetProcessingOptions(HcePaymentApplet hcepaymentapplet)
    {
        WLog.d(WalletHceEventListener.access$000(), "onGetProcessingOptions()");
    }

    public final void onGetProcessingOptionsResponse(HcePaymentApplet hcepaymentapplet)
    {
        WLog.d(WalletHceEventListener.access$000(), "onGetProcessingOptionsResponse()");
        WalletHceEventListener.access$600(WalletHceEventListener.this).incrementAtc(WalletHceEventListener.access$500(WalletHceEventListener.this));
    }

    public final void onReadRecord(HcePaymentApplet hcepaymentapplet)
    {
        WLog.d(WalletHceEventListener.access$000(), "onReadRecord()");
    }

    public final void onSelect(HcePaymentApplet hcepaymentapplet)
    {
        WLog.dfmt(WalletHceEventListener.access$000(), "%s selected", new Object[] {
            hcepaymentapplet.getApplicationLabel()
        });
        WalletHceEventListener.access$100(WalletHceEventListener.this);
    }

    ()
    {
        this$0 = WalletHceEventListener.this;
        super();
    }
}
