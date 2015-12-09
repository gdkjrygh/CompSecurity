// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.app.Activity;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.spotlets.ads.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.sponsorship.SponsoredHeaderView;
import efj;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements efj
{

    private SponsoredHeaderView a;

    public final void a(Response response, Object obj)
    {
        response = (SponsorshipAdData)obj;
        obj = a;
        obj.c = response;
        if (((SponsoredHeaderView) (obj)).c != null)
        {
            ((Activity)((SponsoredHeaderView) (obj)).getContext()).runOnUiThread(new com.spotify.mobile.android.spotlets.ads.sponsorship.._cls5(((SponsoredHeaderView) (obj))));
        }
    }

    public final void a(com.spotify.mobile.android.cosmos.iver.ErrorCause errorcause)
    {
        SponsoredHeaderView sponsoredheaderview = a;
        ((Activity)sponsoredheaderview.getContext()).runOnUiThread(new com.spotify.mobile.android.spotlets.ads.sponsorship.._cls6(sponsoredheaderview));
        errorcause.toString();
    }

    (SponsoredHeaderView sponsoredheaderview)
    {
        a = sponsoredheaderview;
        super();
    }
}
