// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.wallet.wobs.wobl.view.WoblFetchedImageView;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, ProtoWoblRenderer

final class ImageWidgetRenderer extends WidgetRenderer
{

    private final com.google.wallet.proto.NanoCompiledWobl.ImageWidget widget;

    protected ImageWidgetRenderer(ProtoWoblRenderer protowoblrenderer, com.google.wallet.proto.NanoCompiledWobl.ImageWidget imagewidget)
    {
        super(protowoblrenderer);
        widget = imagewidget;
    }

    private WoblFetchedImageView createView()
    {
        return new WoblFetchedImageView(getContext());
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
        WoblFetchedImageView woblfetchedimageview;
        super.unsafeApplyWobl();
        woblfetchedimageview = (WoblFetchedImageView)getView();
        woblfetchedimageview.setImageUri(Uri.parse(widget.sourceUrl));
        woblfetchedimageview.setAspectRatio(widget.aspectRatio.doubleValue());
        if (widget.widgetAttributes.verticalAlign == null) goto _L2; else goto _L1
_L1:
        widget.widgetAttributes.verticalAlign.intValue();
        JVM INSTR tableswitch 1 3: default 92
    //                   1 138
    //                   2 148
    //                   3 158;
           goto _L2 _L3 _L4 _L5
_L2:
        if (widget.altText != null)
        {
            woblfetchedimageview.setContentDescription(widget.altText);
        }
        if (widget.alpha != null)
        {
            woblfetchedimageview.setAlpha(widget.alpha.floatValue());
        }
        return;
_L3:
        woblfetchedimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_START);
        continue; /* Loop/switch isn't completed */
_L4:
        woblfetchedimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        continue; /* Loop/switch isn't completed */
_L5:
        woblfetchedimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_END);
        if (true) goto _L2; else goto _L6
_L6:
    }
}
