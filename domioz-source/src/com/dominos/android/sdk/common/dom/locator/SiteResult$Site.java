// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.dom.locator;


public class siteName
{

    private int siteId;
    private String siteName;

    public int getSiteId()
    {
        return siteId;
    }

    public String getSiteName()
    {
        return siteName;
    }

    public String toString()
    {
        return siteName;
    }

    public (int i, String s)
    {
        siteId = i;
        siteName = s;
    }
}
