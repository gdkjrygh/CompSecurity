// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.sponsorship;


// Referenced classes of package com.spotify.mobile.android.spotlets.ads.sponsorship:
//            SponsoredHeaderView

public final class a
    implements Runnable
{

    private SponsoredHeaderView a;

    public final void run()
    {
        SponsoredHeaderView.i(a);
    }

    public (SponsoredHeaderView sponsoredheaderview)
    {
        a = sponsoredheaderview;
        super();
    }
}
