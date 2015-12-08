// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayerClient

class this._cls0
    implements ckEventListener
{

    final MediaPlayerClient this$0;

    public void onAdBreakComplete(AdBreak adbreak)
    {
    }

    public void onAdBreakSkipped(AdBreak adbreak)
    {
    }

    public void onAdBreakStart(AdBreak adbreak)
    {
    }

    public void onAdClick(AdBreak adbreak, Ad ad, AdClick adclick)
    {
    }

    public void onAdComplete(AdBreak adbreak, Ad ad)
    {
    }

    public void onAdProgress(AdBreak adbreak, Ad ad, int i)
    {
    }

    public void onAdStart(AdBreak adbreak, Ad ad)
    {
    }

    .Ad()
    {
        this$0 = MediaPlayerClient.this;
        super();
    }
}
