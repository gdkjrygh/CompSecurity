// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.PlayContextProvider;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            VideoDetailsViewGroup

class val.details
    implements android.view.deoDetailsViewGroup._cls2
{

    final VideoDetailsViewGroup this$0;
    final NetflixActivity val$activity;
    final VideoDetails val$details;

    public void onClick(View view)
    {
        PlaybackLauncher.startPlaybackAfterPIN(val$activity, val$details, ((PlayContextProvider)val$activity).getPlayContext());
    }

    ()
    {
        this$0 = final_videodetailsviewgroup;
        val$activity = netflixactivity;
        val$details = VideoDetails.this;
        super();
    }
}
