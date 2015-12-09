// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.sponsorship;

import android.database.DataSetObserver;
import com.spotify.android.paste.widget.ViewPagerIndicator;
import efl;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.sponsorship:
//            SponsoredHeaderView

final class a extends DataSetObserver
{

    private SponsoredHeaderView a;

    private void a()
    {
        SponsoredHeaderView.e(a).requestLayout();
        SponsoredHeaderView.e(a).invalidate();
        SponsoredHeaderView.f(a).c();
    }

    public final void onChanged()
    {
        a();
    }

    public final void onInvalidated()
    {
        a();
    }

    (SponsoredHeaderView sponsoredheaderview)
    {
        a = sponsoredheaderview;
        super();
    }
}
