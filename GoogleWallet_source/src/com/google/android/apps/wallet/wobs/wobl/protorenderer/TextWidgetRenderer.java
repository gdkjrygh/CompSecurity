// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, TextRenderingHelper, ProtoWoblRenderUtils, ProtoWoblRenderer

final class TextWidgetRenderer extends WidgetRenderer
{

    private final TextRenderingHelper textRenderingHelper;
    private final com.google.wallet.proto.NanoCompiledWobl.TextWidget textWidget;

    protected TextWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.TextWidget textwidget)
    {
        this(protowoblrenderer, textwidget, android.os.Build.VERSION.SDK_INT);
    }

    private TextWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.TextWidget textwidget, int i)
    {
        super(protowoblrenderer);
        textWidget = textwidget;
        textRenderingHelper = new TextRenderingHelper(i, getContext(), textwidget.textBoxAttributes, textwidget.textStyleAttributes, textwidget.inlineTextContent, getRendererClient());
    }

    private TextView createView()
    {
        return new TextView(getContext());
    }

    protected final volatile View createView()
    {
        return createView();
    }

    protected final com.google.wallet.proto.NanoCompiledWobl.WidgetAttributes getWidgetAttributes()
    {
        return textWidget.widgetAttributes;
    }

    protected final void setViewGravity(Integer integer, Integer integer1)
    {
        ((TextView)getView()).setGravity(ProtoWoblRenderUtils.toGravity(integer, integer1));
    }

    protected final void unsafeApplyWobl()
        throws Exception
    {
        super.unsafeApplyWobl();
        textRenderingHelper.applyWoblToView((TextView)getView());
    }
}
