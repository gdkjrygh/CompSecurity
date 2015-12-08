// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.spotify.mobile.android.spotlets.ads.model.SponsorshipAdData;

public final class efn
    implements android.view.View.OnClickListener
{

    private Context a;
    private SponsorshipAdData b;

    public efn(Context context, SponsorshipAdData sponsorshipaddata)
    {
        a = context;
        b = sponsorshipaddata;
    }

    public final void onClick(View view)
    {
        dmz.a(edp);
        edp.a(a, Uri.parse(b.getClick()));
        dmz.a(edr);
        view = edr.a("", "sponsored-context", b.getLineItemId(), b.getCreativeId(), "event_clicked", "");
        dmz.a(fop);
        fop.a(a, view);
    }
}
