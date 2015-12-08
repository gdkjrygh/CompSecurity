// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Context;
import org.chromium.content.browser.ContentViewRenderView;

// Referenced classes of package org.xwalk.core.internal:
//            XWalkContent

class positingSurfaceType extends ContentViewRenderView
{

    final XWalkContent this$0;

    protected void onReadyToRender()
    {
    }

    positingSurfaceType(Context context, org.chromium.content.browser.erView.CompositingSurfaceType compositingsurfacetype)
    {
        this$0 = XWalkContent.this;
        super(context, compositingsurfacetype);
    }
}
