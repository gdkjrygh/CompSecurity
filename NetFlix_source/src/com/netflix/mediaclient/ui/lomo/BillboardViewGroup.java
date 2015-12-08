// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFocusHandler;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            VideoViewGroup, BillboardView

public class BillboardViewGroup extends VideoViewGroup
{

    public BillboardViewGroup(Context context)
    {
        super(context, false);
        setId(0x7f070037);
    }

    protected volatile View createChildView(Context context)
    {
        return createChildView(context);
    }

    protected BillboardView createChildView(Context context)
    {
        return new BillboardView(context);
    }

    protected boolean shouldApplyPaddingToChildren()
    {
        return false;
    }

    protected volatile void updateViewIds(View view, int i, int j, int k)
    {
        updateViewIds((BillboardView)view, i, j, k);
    }

    protected void updateViewIds(BillboardView billboardview, int i, int j, int k)
    {
        i = LoLoMoFocusHandler.computeViewId(i, j + k);
        if (Log.isLoggable("VideoViewGroup", 2))
        {
            Log.v("VideoViewGroup", (new StringBuilder()).append("Setting view id to: ").append(i).toString());
        }
        billboardview.setId(i);
    }
}
