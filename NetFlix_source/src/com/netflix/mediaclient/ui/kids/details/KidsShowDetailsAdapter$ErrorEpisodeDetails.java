// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.ui.details.DummyEpisodeDetails;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsShowDetailsAdapter

private static class activity extends DummyEpisodeDetails
{

    private NetflixActivity activity;

    public String getTitle()
    {
        return activity.getString(0x7f0c0072);
    }

    public (NetflixActivity netflixactivity)
    {
        super(-1);
        activity = netflixactivity;
    }
}
