// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising;


// Referenced classes of package com.adobe.mediacore.timeline.advertising:
//            AdBreak, Ad

public interface ContentTracker
{

    public abstract void onAdBreakComplete(AdBreak adbreak);

    public abstract void onAdBreakStart(AdBreak adbreak);

    public abstract void onAdClick(Ad ad);

    public abstract void onAdComplete(Ad ad);

    public abstract void onAdError(Ad ad);

    public abstract void onAdProgress(Ad ad, int i);

    public abstract void onAdStart(Ad ad);
}
