// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.widget.FrameLayout;
import com.spotify.mobile.android.spotlets.ads.model.Ad;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;

public final class efb
    implements eey
{

    public Flags a;
    private rf b;
    private int c;
    private final FrameLayout d;

    public efb(rf rf1)
    {
        ctz.a(rf1);
        b = rf1;
        c = 0x7f11040d;
        d = (FrameLayout)b.findViewById(c);
    }

    public final void a(Ad ad)
    {
        Assertion.a(ad, "Need an ad to open screensaver ad fragment");
        int i;
        if ((b instanceof fpe) && ((fpe)b).Q_())
        {
            i = Math.round(b.getResources().getDimension(0x7f0c002d));
        } else
        {
            i = 0;
        }
        d.setPadding(0, 0, 0, i);
        d.bringToFront();
        ad = eex.a(this, ad, a);
        if (b instanceof fpe)
        {
            ((fpe)b).a(((eex) (ad)).Y);
        }
        b.a_().a().a().a(c, ad, eex.a).c();
    }

    public final void a(String s)
    {
        android.support.v4.app.Fragment fragment = b.a_().a(eex.a);
        if (fragment == null)
        {
            return;
        }
        if (b instanceof fpe)
        {
            ((fpe)b).a(null);
        }
        b.a_().a().a().a(fragment).c();
        dmz.a(edr);
        s = edr.a(AdSlot.MOBILE_SCREENSAVER, Format.BANNER, s);
        dmz.a(fop);
        fop.a(b, s);
    }
}
