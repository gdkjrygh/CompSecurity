// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.details.DetailsActivity;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.MiniPlayerViews._cls4
{

    final MdxMiniPlayerViews this$0;

    public void onClick(View view)
    {
        view = MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).getCurrentVideo();
        if (view == null)
        {
            return;
        }
        if (MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this) instanceof DetailsActivity)
        {
            DetailsActivity detailsactivity = (DetailsActivity)MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this);
            if (StringUtils.safeEquals(view.getId(), detailsactivity.getVideoId()) || StringUtils.safeEquals(view.getParentId(), detailsactivity.getVideoId()))
            {
                Log.d("MdxMiniPlayerViews", "Current details are already being shown - not showing details activity");
                MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).notifyMdxShowDetailsRequest();
                return;
            }
        }
        Log.v("MdxMiniPlayerViews", "showing details actiivty");
        DetailsActivity.show(MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this), view, PlayContext.EMPTY_CONTEXT);
    }

    vity()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
