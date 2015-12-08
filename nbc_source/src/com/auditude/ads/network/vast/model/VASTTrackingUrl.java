// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;


public class VASTTrackingUrl
{

    private int offset;
    private Boolean offsetIsPercent;
    private String type;
    private String url;

    public VASTTrackingUrl(String s, String s1)
    {
        offset = 0;
        offsetIsPercent = Boolean.valueOf(false);
        type = s1;
        url = s;
    }

    public final int getOffset()
    {
        return offset;
    }

    public final Boolean getOffsetIsPercent()
    {
        return offsetIsPercent;
    }

    public final String getType()
    {
        return type;
    }

    public final String getUrl()
    {
        return url;
    }

    public final void setOffset(int i)
    {
        offset = i;
    }

    public final void setOffsetIsPercent(Boolean boolean1)
    {
        offsetIsPercent = boolean1;
    }

    public final void setType(String s)
    {
        type = s;
    }

    public final void setUrl(String s)
    {
        url = s;
    }
}
