// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.view.View;
import com.google.android.apps.wallet.logging.WLog;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            ActionWidgetRenderer, BarcodeWidgetRenderer, ColumnLayoutWidgetRenderer, FieldWidgetRenderer, 
//            ImageWidgetRenderer, LineWidgetRenderer, SpinnerWidgetRenderer, TextWidgetRenderer, 
//            ProtoWoblRenderer, WidgetRenderer

public final class WidgetRendererFactory
{
    static final class StubWidgetRenderer extends WidgetRenderer
    {

        protected final View createView()
        {
            View view = new View(getContext());
            view.setVisibility(4);
            return view;
        }

        protected final com.google.wallet.proto.NanoCompiledWobl.WidgetAttributes getWidgetAttributes()
        {
            return null;
        }

        protected final void setViewGravity(Integer integer, Integer integer1)
        {
        }

        protected final void unsafeApplyWobl()
            throws Exception
        {
        }

        StubWidgetRenderer(ProtoWoblRenderer protowoblrenderer)
        {
            super(protowoblrenderer);
        }
    }


    private final ProtoWoblRenderer woblRenderer;

    WidgetRendererFactory(ProtoWoblRenderer protowoblrenderer)
    {
        woblRenderer = protowoblrenderer;
    }

    public final WidgetRenderer createWidgetRenderer(com.google.wallet.proto.NanoCompiledWobl.Widget widget)
    {
        if (widget.actionWidget != null)
        {
            return new ActionWidgetRenderer(woblRenderer, widget.actionWidget);
        }
        if (widget.barcodeWidget != null)
        {
            return new BarcodeWidgetRenderer(woblRenderer, widget.barcodeWidget);
        }
        if (widget.columnLayoutWidget != null)
        {
            return new ColumnLayoutWidgetRenderer(woblRenderer, widget.columnLayoutWidget);
        }
        if (widget.fieldWidget != null)
        {
            return new FieldWidgetRenderer(woblRenderer, widget.fieldWidget);
        }
        if (widget.imageWidget != null)
        {
            return new ImageWidgetRenderer(woblRenderer, widget.imageWidget);
        }
        if (widget.lineWidget != null)
        {
            return new LineWidgetRenderer(woblRenderer, widget.lineWidget);
        }
        if (widget.spinnerWidget != null)
        {
            return new SpinnerWidgetRenderer(woblRenderer, widget.spinnerWidget);
        }
        if (widget.textWidget != null)
        {
            return new TextWidgetRenderer(woblRenderer, widget.textWidget);
        } else
        {
            WLog.i(ProtoWoblRenderer.TAG, "Couldn't identify widget");
            return new StubWidgetRenderer(woblRenderer);
        }
    }
}
