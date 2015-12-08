// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ShowDetails;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            EpisodeListFrag, SeasonsSpinner

class this._cls0
    implements Runnable
{

    final EpisodeListFrag this$0;

    public void run()
    {
        int j = EpisodeListFrag.access$400(EpisodeListFrag.this);
        int i = j;
        if (j == -1)
        {
            i = EpisodeListFrag.access$000(EpisodeListFrag.this).getSeasonIndexBySeasonNumber(EpisodeListFrag.access$500(EpisodeListFrag.this).getCurrentSeasonNumber());
        }
        if (i < 0)
        {
            Log.v("EpisodeListFrag", "No valid season index found");
            return;
        } else
        {
            Log.v("EpisodeListFrag", (new StringBuilder()).append("Setting current season to: ").append(i).toString());
            EpisodeListFrag.access$000(EpisodeListFrag.this).setSelection(i);
            return;
        }
    }

    ()
    {
        this$0 = EpisodeListFrag.this;
        super();
    }
}
