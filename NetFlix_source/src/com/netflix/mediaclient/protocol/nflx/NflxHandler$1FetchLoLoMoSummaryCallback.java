// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.protocol.nflx;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfGenreSummary;
import com.netflix.mediaclient.servicemgr.LoLoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.SimpleManagerCallback;
import com.netflix.mediaclient.ui.home.HomeActivity;

// Referenced classes of package com.netflix.mediaclient.protocol.nflx:
//            NflxHandler

class activity extends SimpleManagerCallback
{

    private final NetflixActivity activity;
    private final String genreId;
    final NflxHandler this$0;

    public void onLoLoMoSummaryFetched(LoLoMo lolomo, int i)
    {
        if (i == 0)
        {
            HomeActivity.showGenreList(activity, new ListOfGenreSummary(lolomo.getNumLoMos(), -1, -1, "", lolomo.getTitle(), genreId, false, lolomo.getType().toString()));
        }
        NflxHandler.access$200(NflxHandler.this, activity);
    }

    (NetflixActivity netflixactivity, String s)
    {
        this$0 = NflxHandler.this;
        super();
        genreId = s;
        activity = netflixactivity;
    }
}
