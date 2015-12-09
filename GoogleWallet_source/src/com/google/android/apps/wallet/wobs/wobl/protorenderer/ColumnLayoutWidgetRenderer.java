// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.res.ResourcesCompat;
import android.view.View;
import com.google.common.collect.Lists;
import com.google.wallet.wobl.renderer.android.views.ColumnLayout;
import java.util.Arrays;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, ProtoWoblRenderUtils, ProtoWoblRenderer, WidgetRendererFactory

final class ColumnLayoutWidgetRenderer extends WidgetRenderer
{

    private final com.google.wallet.proto.NanoCompiledWobl.ColumnLayoutWidget widget;

    protected ColumnLayoutWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.ColumnLayoutWidget columnlayoutwidget)
    {
        super(protowoblrenderer);
        widget = columnlayoutwidget;
    }

    private ColumnLayout createView()
    {
        ColumnLayout columnlayout = new ColumnLayout(getContext());
        columnlayout.setColumnWidths(Lists.transform(Arrays.asList(widget.columnWidth), ProtoWoblRenderUtils.TO_DISPLAY_UNIT));
        return columnlayout;
    }

    protected final volatile View createView()
    {
        return createView();
    }

    protected final com.google.wallet.proto.NanoCompiledWobl.WidgetAttributes getWidgetAttributes()
    {
        return widget.widgetAttributes;
    }

    protected final void setBackgroundAsClickable(Drawable drawable)
    {
        ((ColumnLayout)getView()).setForeground(ResourcesCompat.getDrawable(getResources(), com.google.android.apps.walletnfcrel.R.drawable.bounded_rippleable, getContext().getTheme()));
        setBackground(drawable);
    }

    protected final void setViewGravity(Integer integer, Integer integer1)
    {
        ((ColumnLayout)getView()).setVerticalGravity(ProtoWoblRenderUtils.toGravity(integer, integer1));
    }

    protected final void unsafeApplyWobl()
        throws Exception
    {
        super.unsafeApplyWobl();
        ColumnLayout columnlayout = (ColumnLayout)getView();
        int i = 0;
        while (i < widget.child.length) 
        {
            WidgetRenderer widgetrenderer = woblRenderer.getWidgetRendererFactory().createWidgetRenderer(widget.child[i]);
            if (columnlayout.getChildCount() > i)
            {
                widgetrenderer.setView(columnlayout.getChildAt(i));
                widgetrenderer.applyWobl();
            } else
            {
                View view = widgetrenderer.render();
                com.google.wallet.proto.NanoCompiledWobl.ColumnLayoutAttributes columnlayoutattributes1 = null;
                com.google.wallet.proto.NanoCompiledWobl.ColumnLayoutAttributes columnlayoutattributes = columnlayoutattributes1;
                if (widgetrenderer.getWidgetAttributes() != null)
                {
                    columnlayoutattributes = columnlayoutattributes1;
                    if (widgetrenderer.getWidgetAttributes().layoutAttributes != null)
                    {
                        columnlayoutattributes = widgetrenderer.getWidgetAttributes().layoutAttributes.columnLayoutAttributes;
                    }
                }
                columnlayoutattributes1 = columnlayoutattributes;
                if (columnlayoutattributes == null)
                {
                    columnlayoutattributes1 = new com.google.wallet.proto.NanoCompiledWobl.ColumnLayoutAttributes();
                }
                columnlayout.addView(view, ProtoWoblRenderUtils.toColumnLayoutParams(columnlayoutattributes1));
            }
            i++;
        }
    }
}
