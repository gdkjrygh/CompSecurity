// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.RatingDialogFrag;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.MdxUtils;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.iniPlayerViews._cls10
{

    final MdxMiniPlayerViews this$0;

    public void onClick(View view)
    {
        if (MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).destroyed())
        {
            MdxMiniPlayerViews.access$1000(MdxMiniPlayerViews.this, "Activity destroyed, can't show rating");
            return;
        }
        VideoDetails videodetails = MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).getCurrentVideo();
        if (videodetails == null)
        {
            Log.e("MdxMiniPlayerViews", "Video is NULL. This should NOT happen!");
            return;
        }
        float f = MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).getCurrentRating();
        if (Log.isLoggable("MdxMiniPlayerViews", 2))
        {
            MdxMiniPlayerViews.access$1000(MdxMiniPlayerViews.this, (new StringBuilder()).append("User set rating ").append(f).toString());
            MdxMiniPlayerViews.access$1000(MdxMiniPlayerViews.this, (new StringBuilder()).append("User rating from VideoDetails ").append(videodetails.getUserRating()).toString());
        }
        Log.d("MdxMiniPlayerViews", "Report rate action started");
        LogUtils.reportRateActionStarted(MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this), null, MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).getUiScreen());
        String s = videodetails.getParentTitle();
        view = s;
        if (StringUtils.isEmpty(s))
        {
            view = videodetails.getTitle();
        }
        view = RatingDialogFrag.newInstance(MdxUtils.getRating(videodetails, f), MdxUtils.getVideoId(videodetails), view);
        view.setCancelable(true);
        MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).showDialog(view);
    }

    gFrag()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
