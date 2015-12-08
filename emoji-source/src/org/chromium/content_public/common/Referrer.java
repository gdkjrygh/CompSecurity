// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content_public.common;


public class Referrer
{

    private final int mPolicy;
    private final String mUrl;

    public Referrer(String s, int i)
    {
        mUrl = s;
        mPolicy = i;
    }

    public int getPolicy()
    {
        return mPolicy;
    }

    public String getUrl()
    {
        return mUrl;
    }
}
