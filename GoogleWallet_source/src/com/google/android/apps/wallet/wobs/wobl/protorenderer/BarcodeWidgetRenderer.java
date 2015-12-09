// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.Context;
import android.view.View;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.barcode.BarcodeTypeConverter;
import com.google.common.base.Optional;
import com.google.wallet.wobl.renderer.android.views.CombinedBarcodeView;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, ProtoWoblRenderUtils, ProtoWoblRenderer

public final class BarcodeWidgetRenderer extends WidgetRenderer
{

    private final com.google.wallet.proto.NanoCompiledWobl.BarcodeWidget barcodeWidget;

    protected BarcodeWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.BarcodeWidget barcodewidget)
    {
        super(protowoblrenderer);
        barcodeWidget = barcodewidget;
    }

    private CombinedBarcodeView createView()
    {
        return new CombinedBarcodeView(getContext());
    }

    protected final volatile View createView()
    {
        return createView();
    }

    protected final com.google.wallet.proto.NanoCompiledWobl.WidgetAttributes getWidgetAttributes()
    {
        return barcodeWidget.widgetAttributes;
    }

    protected final void setViewGravity(Integer integer, Integer integer1)
    {
        ((CombinedBarcodeView)getView()).setGravity(ProtoWoblRenderUtils.toGravity(integer, integer1));
    }

    protected final void unsafeApplyWobl()
        throws Exception
    {
        super.unsafeApplyWobl();
        CombinedBarcodeView combinedbarcodeview = (CombinedBarcodeView)getView();
        com.google.android.apps.wallet.util.barcode.BarcodeTypeConverter.TableItem tableitem = BarcodeTypeConverter.lookupByProtoWoblBarcodeType(barcodeWidget.type.intValue());
        if (tableitem != null)
        {
            combinedbarcodeview.setData(barcodeWidget.code, tableitem.irType, Optional.fromNullable(barcodeWidget.readableCode));
        } else
        {
            String s = ProtoWoblRenderer.TAG;
            String s1 = String.valueOf(barcodeWidget.type);
            WLog.i(s, (new StringBuilder(String.valueOf(s1).length() + 26)).append("Unrecognized barcode type ").append(s1).toString());
        }
        if (barcodeWidget.alpha != null)
        {
            combinedbarcodeview.setBarcodeAlpha(barcodeWidget.alpha.floatValue());
        }
        combinedbarcodeview.setFocusable(true);
        combinedbarcodeview.setContentDescription(getContext().getString(com.google.android.apps.walletnfcrel.R.string.barcode));
    }
}
