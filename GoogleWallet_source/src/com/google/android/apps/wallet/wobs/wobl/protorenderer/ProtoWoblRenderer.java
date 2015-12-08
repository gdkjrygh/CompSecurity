// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.wallet.wobl.renderer.android.RendererClient;
import java.util.List;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRendererFactory, ColumnLayoutWidgetRenderer

public class ProtoWoblRenderer
{

    static final String TAG = com/google/android/apps/wallet/wobs/wobl/protorenderer/ProtoWoblRenderer.getSimpleName();
    private final Context context;
    private final RendererClient rendererClient;
    private final WidgetRendererFactory widgetRendererFactory = new WidgetRendererFactory(this);

    ProtoWoblRenderer(FragmentActivity fragmentactivity, RendererClient rendererclient)
    {
        context = fragmentactivity;
        rendererClient = rendererclient;
    }

    public static List findWidgets(com.google.wallet.proto.NanoCompiledWobl.Layout layout, Predicate predicate)
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        if (layout.widget != null && layout.widget.columnLayout != null)
        {
            findWidgets(layout.widget.columnLayout, predicate, ((List) (arraylist)));
        }
        return arraylist;
    }

    private static void findWidgets(com.google.wallet.proto.NanoCompiledWobl.ColumnLayoutWidget columnlayoutwidget, Predicate predicate, List list)
    {
        if (columnlayoutwidget.child != null)
        {
            columnlayoutwidget = columnlayoutwidget.child;
            int j = columnlayoutwidget.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = columnlayoutwidget[i];
                if (predicate.apply(obj))
                {
                    list.add(obj);
                }
                if (((com.google.wallet.proto.NanoCompiledWobl.Widget) (obj)).columnLayoutWidget != null)
                {
                    findWidgets(((com.google.wallet.proto.NanoCompiledWobl.Widget) (obj)).columnLayoutWidget, predicate, list);
                }
            }

        }
    }

    public final void applyWobl(com.google.wallet.proto.NanoCompiledWobl.Layout layout, View view)
    {
        layout = new ColumnLayoutWidgetRenderer(this, layout.widget.columnLayout);
        layout.setView(view);
        layout.applyWobl();
    }

    final Context getContext()
    {
        return context;
    }

    public final RendererClient getRendererClient()
    {
        return rendererClient;
    }

    final WidgetRendererFactory getWidgetRendererFactory()
    {
        return widgetRendererFactory;
    }

    public final View render(com.google.wallet.proto.NanoCompiledWobl.Layout layout)
    {
        return (new ColumnLayoutWidgetRenderer(this, layout.widget.columnLayout)).render();
    }

}
