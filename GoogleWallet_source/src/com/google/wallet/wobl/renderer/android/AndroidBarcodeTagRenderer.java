// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.view.View;
import com.google.common.base.Optional;
import com.google.wallet.wobl.intermediaterepresentation.BarcodeIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.renderer.android.views.CombinedBarcodeView;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTagRenderer, AndroidRenderUtils, AndroidRenderer

public class AndroidBarcodeTagRenderer extends AndroidTagRenderer
{

    public AndroidBarcodeTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    public volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((CombinedBarcodeView)view, (BarcodeIr)intermediaterepresentation);
    }

    public void applyIrToView(CombinedBarcodeView combinedbarcodeview, BarcodeIr barcodeir)
    {
        super.applyIrToView(combinedbarcodeview, barcodeir);
        combinedbarcodeview.setData(barcodeir.getData(), barcodeir.getBarcodeType(), barcodeir.getReadableCode());
        combinedbarcodeview.setGravity(AndroidRenderUtils.calculateGravity(barcodeir));
        if (barcodeir.getAlpha().isPresent())
        {
            combinedbarcodeview.setBarcodeAlpha(((Float)barcodeir.getAlpha().get()).floatValue());
        }
    }

    public volatile View getViewInstance()
    {
        return getViewInstance();
    }

    public CombinedBarcodeView getViewInstance()
    {
        return new CombinedBarcodeView(getContext());
    }
}
