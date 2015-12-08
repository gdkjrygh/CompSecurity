// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android.views;

import android.widget.TextView;

// Referenced classes of package com.google.wallet.wobl.renderer.android.views:
//            CombinedBarcodeView

class val.humanReadableText
    implements derListener
{

    final CombinedBarcodeView this$0;
    final TextView val$humanReadableText;

    public void onErrorRenderingBarcode()
    {
        CombinedBarcodeView.access$200(CombinedBarcodeView.this, CombinedBarcodeView.access$100(CombinedBarcodeView.this), CombinedBarcodeView.access$100(CombinedBarcodeView.this));
        val$humanReadableText.setTextSize(0, CombinedBarcodeView.access$300(CombinedBarcodeView.this));
    }

    public void onReset()
    {
        val$humanReadableText.setTextSize(0, CombinedBarcodeView.access$000(CombinedBarcodeView.this));
    }

    derListener()
    {
        this$0 = final_combinedbarcodeview;
        val$humanReadableText = TextView.this;
        super();
    }
}
