// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.spotify.mobile.android.util.Assertion;

public final class eeh
{

    public final PublisherAdView a;

    private eeh(PublisherAdView publisheradview)
    {
        Assertion.a(publisheradview);
        a = publisheradview;
    }

    eeh(PublisherAdView publisheradview, byte byte0)
    {
        this(publisheradview);
    }
}
