// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;

// Referenced classes of package com.adobe.mediacore:
//            AdTimeline

public static class _ad
{

    private final Ad _ad;
    private final AdBreak _adBreak;

    public static sing.Ad createInfo(AdBreak adbreak, Ad ad)
    {
        if (adbreak != null && ad != null)
        {
            return new <init>(adbreak, ad);
        } else
        {
            return null;
        }
    }

    public boolean equals(sing.AdBreak adbreak)
    {
        return adbreak != null && _adBreak == adbreak.getAdBreak() && _ad == adbreak.getAd();
    }

    public Ad getAd()
    {
        return _ad;
    }

    public AdBreak getAdBreak()
    {
        return _adBreak;
    }

    private sing.Ad(AdBreak adbreak, Ad ad)
    {
        _adBreak = adbreak;
        _ad = ad;
    }
}
