// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;

import java.util.List;

// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdPolicyMode, Ad

public final class AdPolicyInfo
{

    private Ad _ad;
    private List _adBreakPlacements;
    private long _currentTime;
    private AdPolicyMode _mode;
    private float _rate;
    private long _seekToTime;

    public AdPolicyInfo(List list, Ad ad, long l, long l1, float f, 
            AdPolicyMode adpolicymode)
    {
        _adBreakPlacements = null;
        _ad = null;
        _currentTime = 0L;
        _seekToTime = 0L;
        _rate = 1.0F;
        _mode = AdPolicyMode.PLAY;
        _adBreakPlacements = list;
        _ad = ad;
        _currentTime = l;
        _seekToTime = l1;
        _rate = f;
        _mode = adpolicymode;
    }

    public Ad getAd()
    {
        return _ad;
    }

    public List getAdBreakPlacements()
    {
        return _adBreakPlacements;
    }

    public long getCurrentTime()
    {
        return _currentTime;
    }

    public AdPolicyMode getMode()
    {
        return _mode;
    }

    public float getRate()
    {
        return _rate;
    }

    public long getSeekToTime()
    {
        return _seekToTime;
    }

    public void setAd(Ad ad)
    {
        _ad = ad;
    }

    public void setAdBreakPlacements(List list)
    {
        _adBreakPlacements = list;
    }

    public void setCurrentTime(long l)
    {
        _currentTime = l;
    }

    public void setMode(AdPolicyMode adpolicymode)
    {
        _mode = adpolicymode;
    }

    public void setRate(float f)
    {
        _rate = f;
    }

    public void setSeekToTime(long l)
    {
        _seekToTime = l;
    }
}
