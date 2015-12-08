// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.ride;


public class ShareRouteDTO
{

    public final String generatedAt;
    public final String shareUrl;
    public final Long timestamp;

    public ShareRouteDTO(String s, String s1, long l)
    {
        generatedAt = s;
        shareUrl = s1;
        timestamp = Long.valueOf(l);
    }

    public String getShareUrl()
    {
        return shareUrl;
    }
}
