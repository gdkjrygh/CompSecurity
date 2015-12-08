// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import android.content.Context;
import com.spotify.mobile.android.spotlets.ads.model.SponsorshipAdData;
import dmz;
import edp;
import edr;
import efm;
import fop;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit:
//            PlaylistFragment

final class a
    implements efm
{

    private Context a;
    private PlaylistFragment b;

    public final void a(SponsorshipAdData sponsorshipaddata)
    {
        if (PlaylistFragment.l(b))
        {
            return;
        } else
        {
            dmz.a(edr);
            dne dne = edr.a("", "sponsored-context", sponsorshipaddata.getLineItemId(), sponsorshipaddata.getCreativeId(), "event_viewed", "");
            dmz.a(fop);
            fop.a(a, dne);
            dmz.a(edp);
            edp.a(sponsorshipaddata.getImpression());
            dmz.a(edp);
            edp.a(sponsorshipaddata.getThirdPartyImpression());
            PlaylistFragment.m(b);
            return;
        }
    }

    public final void a(SponsorshipAdData sponsorshipaddata, String s)
    {
        if (PlaylistFragment.l(b))
        {
            return;
        } else
        {
            dmz.a(edr);
            sponsorshipaddata = edr.a("", "sponsored-context", sponsorshipaddata.getLineItemId(), sponsorshipaddata.getCreativeId(), s);
            dmz.a(fop);
            fop.a(a, sponsorshipaddata);
            PlaylistFragment.m(b);
            return;
        }
    }

    (PlaylistFragment playlistfragment, Context context)
    {
        b = playlistfragment;
        a = context;
        super();
    }
}
