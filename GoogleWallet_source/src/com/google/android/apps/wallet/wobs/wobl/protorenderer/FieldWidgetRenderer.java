// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, ProtoWoblRenderUtils, ProtoWoblRenderer, TextRenderingHelper

public final class FieldWidgetRenderer extends WidgetRenderer
{
    final class FieldChildRenderer extends WidgetRenderer
    {

        private final TextRenderingHelper textRenderingHelper;
        final FieldWidgetRenderer this$0;

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
            return null;
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

        protected FieldChildRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.FieldWidget.FieldChild fieldchild)
        {
            this$0 = FieldWidgetRenderer.this;
            super(protowoblrenderer);
            textRenderingHelper = new TextRenderingHelper(android.os.Build.VERSION.SDK_INT, getContext(), fieldchild.textBoxAttributes, fieldchild.textStyleAttributes, fieldchild.inlineTextContent, getRendererClient());
        }
    }


    private final com.google.wallet.proto.NanoCompiledWobl.FieldWidget widget;

    public FieldWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.FieldWidget fieldwidget)
    {
        super(protowoblrenderer);
        widget = fieldwidget;
    }

    private LinearLayout createView()
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        linearlayout.setOrientation(1);
        return linearlayout;
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
        ((LinearLayout)getView()).setGravity(ProtoWoblRenderUtils.toGravity(integer, integer1));
    }

    protected final void unsafeApplyWobl()
        throws Exception
    {
        super.unsafeApplyWobl();
        LinearLayout linearlayout = (LinearLayout)getView();
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        com.google.wallet.proto.NanoCompiledWobl.FieldWidget.FieldChild fieldchild = widget.name;
        com.google.wallet.proto.NanoCompiledWobl.FieldWidget.FieldChild fieldchild1 = widget.value;
        int i = 0;
        while (i < 2) 
        {
            Object obj = (new com.google.wallet.proto.NanoCompiledWobl.FieldWidget.FieldChild[] {
                fieldchild, fieldchild1
            })[i];
            obj = new FieldChildRenderer(woblRenderer, ((com.google.wallet.proto.NanoCompiledWobl.FieldWidget.FieldChild) (obj)));
            if (linearlayout.getChildCount() > i)
            {
                ((FieldChildRenderer) (obj)).setView(linearlayout.getChildAt(i));
                ((FieldChildRenderer) (obj)).applyWobl();
            } else
            {
                linearlayout.addView(((FieldChildRenderer) (obj)).render(), layoutparams);
            }
            i++;
        }
    }
}
