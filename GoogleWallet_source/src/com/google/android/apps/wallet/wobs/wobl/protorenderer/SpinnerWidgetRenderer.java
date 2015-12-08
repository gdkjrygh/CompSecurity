// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.view.View;
import com.google.wallet.wobl.renderer.android.views.SpinnerView;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, ProtoWoblRenderer

public final class SpinnerWidgetRenderer extends WidgetRenderer
{

    private final com.google.wallet.proto.NanoCompiledWobl.SpinnerWidget widget;

    protected SpinnerWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.SpinnerWidget spinnerwidget)
    {
        super(protowoblrenderer);
        widget = spinnerwidget;
    }

    private SpinnerView createView()
    {
        SpinnerView spinnerview = new SpinnerView(getContext());
        spinnerview.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.wobl_ic_refresh);
        return spinnerview;
    }

    protected final volatile View createView()
    {
        return createView();
    }

    protected final com.google.wallet.proto.NanoCompiledWobl.WidgetAttributes getWidgetAttributes()
    {
        return widget.widgetAttributes;
    }

    protected final void setViewGravity(Integer integer, Integer integer1)
    {
    }

    protected final void unsafeApplyWobl()
        throws Exception
    {
        super.unsafeApplyWobl();
        if (widget.altText != null)
        {
            ((SpinnerView)getView()).setContentDescription(widget.altText);
        }
    }
}
