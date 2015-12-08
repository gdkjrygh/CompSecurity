// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.java.optional.Optional;

// Referenced classes of package com.soundcloud.android.ads:
//            ApiAdWrapper

final class AutoValue_ApiAdWrapper extends ApiAdWrapper
{

    private final Optional audioAd;
    private final Optional interstitial;
    private final Optional videoAd;

    AutoValue_ApiAdWrapper(Optional optional, Optional optional1, Optional optional2)
    {
        if (optional == null)
        {
            throw new NullPointerException("Null audioAd");
        }
        audioAd = optional;
        if (optional1 == null)
        {
            throw new NullPointerException("Null videoAd");
        }
        videoAd = optional1;
        if (optional2 == null)
        {
            throw new NullPointerException("Null interstitial");
        } else
        {
            interstitial = optional2;
            return;
        }
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj instanceof ApiAdWrapper)
            {
                if (!audioAd.equals(((ApiAdWrapper) (obj = (ApiAdWrapper)obj)).getAudioAd()) || !videoAd.equals(((ApiAdWrapper) (obj)).getVideoAd()) || !interstitial.equals(((ApiAdWrapper) (obj)).getInterstitial()))
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public final Optional getAudioAd()
    {
        return audioAd;
    }

    public final Optional getInterstitial()
    {
        return interstitial;
    }

    public final Optional getVideoAd()
    {
        return videoAd;
    }

    public final int hashCode()
    {
        return ((audioAd.hashCode() ^ 0xf4243) * 0xf4243 ^ videoAd.hashCode()) * 0xf4243 ^ interstitial.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("ApiAdWrapper{audioAd=")).append(audioAd).append(", videoAd=").append(videoAd).append(", interstitial=").append(interstitial).append("}").toString();
    }
}
