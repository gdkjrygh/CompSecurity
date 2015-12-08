// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl;

import android.content.Context;
import android.view.View;
import com.google.wallet.wobl.intermediaterepresentation.BarcodeIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.renderer.android.AndroidBarcodeTagRenderer;
import com.google.wallet.wobl.renderer.android.AndroidRenderer;
import com.google.wallet.wobl.renderer.android.views.CombinedBarcodeView;

public final class BarcodeTagRenderer extends AndroidBarcodeTagRenderer
{

    public BarcodeTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    public final volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((CombinedBarcodeView)view, (BarcodeIr)intermediaterepresentation);
    }

    public final void applyIrToView(CombinedBarcodeView combinedbarcodeview, BarcodeIr barcodeir)
    {
        super.applyIrToView(combinedbarcodeview, barcodeir);
        combinedbarcodeview.setFocusable(true);
        combinedbarcodeview.setContentDescription(getContext().getString(com.google.android.apps.walletnfcrel.R.string.barcode));
    }
}
