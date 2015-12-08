// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;


public class BannerItemDTO
{

    public final String deeplink;
    public final String text;
    public final String url;

    public BannerItemDTO(String s, String s1, String s2)
    {
        text = s;
        url = s1;
        deeplink = s2;
    }

    public String getDeeplink()
    {
        return deeplink;
    }

    public String getText()
    {
        return text;
    }

    public String getUrl()
    {
        return url;
    }
}
