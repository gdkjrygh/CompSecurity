// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.content.Context;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.SocialVideoView;
import com.netflix.mediaclient.android.widget.VideoView;
import com.netflix.mediaclient.ui.lolomo.LoLoMoFocusHandler;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            VideoViewGroup

public class LoMoViewGroup extends VideoViewGroup
{

    public LoMoViewGroup(Context context)
    {
        super(context, true);
    }

    protected volatile View createChildView(Context context)
    {
        return createChildView(context);
    }

    protected VideoView createChildView(Context context)
    {
        return new SocialVideoView(context);
    }

    protected boolean shouldApplyPaddingToChildren()
    {
        return true;
    }

    protected volatile void updateViewIds(View view, int i, int j, int k)
    {
        updateViewIds((VideoView)view, i, j, k);
    }

    protected void updateViewIds(VideoView videoview, int i, int j, int k)
    {
        i = LoLoMoFocusHandler.computeViewId(i, j + k);
        if (Log.isLoggable("VideoViewGroup", 2))
        {
            Log.v("VideoViewGroup", (new StringBuilder()).append("Setting view id to: ").append(i).toString());
        }
        videoview.setId(i);
    }
}
