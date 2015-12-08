// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.Ad;

// Referenced classes of package com.adobe.mediacore:
//            AdTimeline

public static class _progress
{

    private final Ad _ad;
    private final int _progress;

    public Ad getAd()
    {
        return _ad;
    }

    public int getProgress()
    {
        return _progress;
    }

    public (Ad ad, int i)
    {
        _ad = ad;
        _progress = i;
    }
}
