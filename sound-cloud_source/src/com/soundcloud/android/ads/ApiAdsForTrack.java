// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.api.model.ModelCollection;
import com.soundcloud.java.optional.Optional;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.ads:
//            ApiAdWrapper, ApiAudioAd

class ApiAdsForTrack extends ModelCollection
{

    public ApiAdsForTrack()
    {
    }

    public ApiAdsForTrack(List list)
    {
        super(list);
    }

    public Optional audioAd()
    {
        for (Iterator iterator = iterator(); iterator.hasNext();)
        {
            ApiAdWrapper apiadwrapper = (ApiAdWrapper)iterator.next();
            if (apiadwrapper.getAudioAd().isPresent())
            {
                return apiadwrapper.getAudioAd();
            }
        }

        return Optional.absent();
    }

    public String contentString()
    {
        StringBuilder stringbuilder = new StringBuilder(100);
        Optional optional = audioAd();
        Optional optional1 = videoAd();
        Optional optional2 = interstitialAd();
        if (optional.isPresent())
        {
            stringbuilder.append("audio ad, ");
            if (((ApiAudioAd)optional.get()).hasApiLeaveBehind())
            {
                stringbuilder.append("leave behind, ");
            }
        }
        if (optional1.isPresent())
        {
            stringbuilder.append("video ad, ");
        }
        if (optional2.isPresent())
        {
            stringbuilder.append("interstitial");
        }
        return stringbuilder.toString();
    }

    public Optional interstitialAd()
    {
        for (Iterator iterator = iterator(); iterator.hasNext();)
        {
            ApiAdWrapper apiadwrapper = (ApiAdWrapper)iterator.next();
            if (apiadwrapper.getInterstitial().isPresent())
            {
                return apiadwrapper.getInterstitial();
            }
        }

        return Optional.absent();
    }

    public Optional videoAd()
    {
        for (Iterator iterator = iterator(); iterator.hasNext();)
        {
            ApiAdWrapper apiadwrapper = (ApiAdWrapper)iterator.next();
            if (apiadwrapper.getVideoAd().isPresent())
            {
                return apiadwrapper.getVideoAd();
            }
        }

        return Optional.absent();
    }
}
