// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl.protorenderer;

import android.view.View;

// Referenced classes of package com.google.android.apps.wallet.wobs.wobl.protorenderer:
//            WidgetRenderer, WidgetRendererFactory, ProtoWoblRenderer

static final class  extends WidgetRenderer
{

    protected final View createView()
    {
        View view = new View(getContext());
        view.setVisibility(4);
        return view;
    }

    protected final com.google.wallet.proto.ererFactory.StubWidgetRenderer getWidgetAttributes()
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

    (ProtoWoblRenderer protowoblrenderer)
    {
        super(protowoblrenderer);
    }
}
