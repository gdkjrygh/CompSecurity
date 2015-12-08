// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.auditude;


public final class AdInfo
{

    private Object data;
    private final long duration;
    private final String id;
    private final String url;

    public AdInfo(String s, String s1, long l, Object obj)
    {
        id = s;
        url = s1;
        duration = l;
        data = obj;
    }

    public final Object getData()
    {
        return data;
    }

    public final long getDuration()
    {
        return duration;
    }

    public final String getId()
    {
        return id;
    }

    public final String getUrl()
    {
        return url;
    }
}
