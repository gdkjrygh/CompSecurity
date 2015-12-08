// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;
import com.netflix.mediaclient.servicemgr.EpisodeDetails;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.details.EpisodeListFrag;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerViews

class this._cls0
    implements android.view.MiniPlayerViews._cls8
{

    final MdxMiniPlayerViews this$0;

    public void onClick(View view)
    {
        if (MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).destroyed())
        {
            return;
        }
        view = MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).getCurrentVideo();
        if (view == null)
        {
            Log.w("MdxMiniPlayerViews", "currentVideo is null - can't show episodes");
            return;
        }
        if (!(view instanceof EpisodeDetails))
        {
            Log.w("MdxMiniPlayerViews", "currentVideo is not an episode detail");
            return;
        } else
        {
            Log.v("MdxMiniPlayerViews", "Showing episodes dialog");
            view = EpisodeListFrag.create(view.getParentId(), null, false);
            view.onManagerReady(MdxMiniPlayerViews.access$000(MdxMiniPlayerViews.this).getManager(), 0);
            view.setCancelable(true);
            MdxMiniPlayerViews.access$1100(MdxMiniPlayerViews.this).showDialog(view);
            return;
        }
    }

    ogFrag()
    {
        this$0 = MdxMiniPlayerViews.this;
        super();
    }
}
