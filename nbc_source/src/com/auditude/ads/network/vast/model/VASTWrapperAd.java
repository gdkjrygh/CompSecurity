// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;


// Referenced classes of package com.auditude.ads.network.vast.model:
//            VASTInlineAd

public class VASTWrapperAd extends VASTInlineAd
{

    public String allowMultipleAds;
    public String fallbackOnNoAd;
    public Boolean followAdditionalWrappers;
    public String source;

    public VASTWrapperAd()
    {
        followAdditionalWrappers = Boolean.valueOf(true);
        fallbackOnNoAd = null;
    }
}
