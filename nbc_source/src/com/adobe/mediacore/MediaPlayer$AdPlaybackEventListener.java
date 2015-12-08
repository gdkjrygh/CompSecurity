// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;

// Referenced classes of package com.adobe.mediacore:
//            MediaPlayer

public static interface 
    extends 
{

    public abstract void onAdBreakComplete(AdBreak adbreak);

    public abstract void onAdBreakSkipped(AdBreak adbreak);

    public abstract void onAdBreakStart(AdBreak adbreak);

    public abstract void onAdClick(AdBreak adbreak, Ad ad, AdClick adclick);

    public abstract void onAdComplete(AdBreak adbreak, Ad ad);

    public abstract void onAdProgress(AdBreak adbreak, Ad ad, int i);

    public abstract void onAdStart(AdBreak adbreak, Ad ad);
}
