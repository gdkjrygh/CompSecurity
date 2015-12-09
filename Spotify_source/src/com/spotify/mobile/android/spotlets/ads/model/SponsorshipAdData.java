// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;

public class SponsorshipAdData
    implements JacksonModel
{

    private String mAdvertiserName;
    private String mClick;
    private String mCreativeId;
    private String mImpression;
    private String mLineItemId;
    private String mLogoUrl;
    private String mThirdPartyImpression;

    public SponsorshipAdData()
    {
    }

    public SponsorshipAdData(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        mThirdPartyImpression = s;
        mCreativeId = s1;
        mLineItemId = s2;
        mImpression = s3;
        mLogoUrl = s4;
        mClick = s5;
        mAdvertiserName = s6;
    }

    public String getAdvertiserName()
    {
        return mAdvertiserName;
    }

    public String getClick()
    {
        return mClick;
    }

    public String getCreativeId()
    {
        return mCreativeId;
    }

    public String getImpression()
    {
        return mImpression;
    }

    public String getLineItemId()
    {
        return mLineItemId;
    }

    public String getLogoUrl()
    {
        return mLogoUrl;
    }

    public String getThirdPartyImpression()
    {
        return mThirdPartyImpression;
    }

    public void setAdvertiserName(String s)
    {
        mAdvertiserName = s;
    }

    public void setClick(String s)
    {
        mClick = s;
    }

    public void setCreativeId(String s)
    {
        mCreativeId = s;
    }

    public void setImpression(String s)
    {
        mImpression = s;
    }

    public void setLineItemId(String s)
    {
        mLineItemId = s;
    }

    public void setLogoUrl(String s)
    {
        mLogoUrl = s;
    }

    public void setThirdPartyImpression(String s)
    {
        mThirdPartyImpression = s;
    }

    public String toString()
    {
        return (new StringBuilder("SponsorshipAdData{mImpression='")).append(mImpression).append('\'').append(", mThirdPartyImpression='").append(mThirdPartyImpression).append('\'').append(", mCreativeId='").append(mCreativeId).append('\'').append(", mLineItemId='").append(mLineItemId).append('\'').append(", mLogoUrl='").append(mLogoUrl).append('\'').append(", mClick='").append(mClick).append('\'').append(", mAdvertiserName='").append(mAdvertiserName).append('\'').append('}').toString();
    }
}
