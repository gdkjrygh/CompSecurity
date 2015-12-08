// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.Ad;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineTimeline, AdHandle

private final class _replaceDuration
{

    private Ad _ad;
    private AdHandle _handle;
    private int _index;
    private long _replaceDuration;
    private  _timeMapping;
    final VideoEngineTimeline this$0;

    public Ad getAd()
    {
        return _ad;
    }

    public AdHandle getAdHandle()
    {
        return _handle;
    }

    public int getIndex()
    {
        return _index;
    }

    public long getReplaceDuration()
    {
        return _replaceDuration;
    }

    public  getTimeMapping()
    {
        return _timeMapping;
    }

    public (int i,  , AdHandle adhandle, Ad ad, long l)
    {
        this$0 = VideoEngineTimeline.this;
        super();
        _index = i;
        _timeMapping = ;
        _handle = adhandle;
        _ad = ad;
        _replaceDuration = l;
    }
}
