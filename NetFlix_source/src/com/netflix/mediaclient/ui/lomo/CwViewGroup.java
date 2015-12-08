// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFocusHandler;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            VideoViewGroup, CwView

public class CwViewGroup extends VideoViewGroup
{

    public CwViewGroup(Context context)
    {
        super(context, true);
    }

    protected volatile View createChildView(Context context)
    {
        return createChildView(context);
    }

    protected CwView createChildView(Context context)
    {
        return new CwView(context);
    }

    protected boolean shouldApplyPaddingToChildren()
    {
        return true;
    }

    protected volatile void updateViewIds(View view, int i, int j, int k)
    {
        updateViewIds((CwView)view, i, j, k);
    }

    protected void updateViewIds(CwView cwview, int i, int j, int k)
    {
        i = LoLoMoFocusHandler.computeViewId(i, (j + k) * 2);
        if (Log.isLoggable("VideoViewGroup", 2))
        {
            Log.v("VideoViewGroup", (new StringBuilder()).append("Setting base view id to: ").append(i).toString());
        }
        cwview.setId(i);
        cwview.setInfoViewId(i + 1);
    }
}
