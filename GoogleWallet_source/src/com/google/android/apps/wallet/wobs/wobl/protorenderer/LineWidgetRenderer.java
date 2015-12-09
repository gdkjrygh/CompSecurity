// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.view.View;
import com.google.common.base.Optional;
import com.google.wallet.wobl.renderer.android.views.LineView;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, ProtoWoblRenderUtils, ProtoWoblRenderer

public final class LineWidgetRenderer extends WidgetRenderer
{

    private final com.google.wallet.proto.NanoCompiledWobl.LineWidget widget;

    protected LineWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.LineWidget linewidget)
    {
        super(protowoblrenderer);
        widget = linewidget;
    }

    private LineView createView()
    {
        return new LineView(getContext());
    }

    private com.google.wallet.wobl.renderer.android.views.LineView.Orientation getOrientation()
    {
        if (widget.orientation.intValue() == 2)
        {
            return com.google.wallet.wobl.renderer.android.views.LineView.Orientation.VERTICAL;
        } else
        {
            return com.google.wallet.wobl.renderer.android.views.LineView.Orientation.HORIZONTAL;
        }
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
        ((LineView)getView()).setGravity(ProtoWoblRenderUtils.toGravity(integer, integer1));
    }

    protected final void unsafeApplyWobl()
        throws Exception
    {
        super.unsafeApplyWobl();
        LineView lineview = (LineView)getView();
        if (widget.color != null)
        {
            lineview.setColor(ProtoWoblRenderUtils.toAndroidColor(widget.color));
        }
        if (widget.orientation != null)
        {
            lineview.setOrientation(getOrientation());
        }
        Optional optional;
        if (widget.length == null)
        {
            optional = Optional.absent();
        } else
        {
            optional = Optional.of(Integer.valueOf(ProtoWoblRenderUtils.toPx(getContext(), widget.length)));
        }
        lineview.setLength(optional);
        if (widget.thickness == null)
        {
            optional = Optional.absent();
        } else
        {
            optional = Optional.of(Integer.valueOf(ProtoWoblRenderUtils.toPx(getContext(), widget.thickness)));
        }
        lineview.setThickness(optional);
    }
}
