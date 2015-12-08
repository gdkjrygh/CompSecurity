// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content_public.browser;

import android.graphics.Bitmap;

public class NavigationEntry
{

    private Bitmap mFavicon;
    private final int mIndex;
    private final String mOriginalUrl;
    private final String mTitle;
    private final String mUrl;
    private final String mVirtualUrl;

    public NavigationEntry(int i, String s, String s1, String s2, String s3, Bitmap bitmap)
    {
        mIndex = i;
        mUrl = s;
        mVirtualUrl = s1;
        mOriginalUrl = s2;
        mTitle = s3;
        mFavicon = bitmap;
    }

    public Bitmap getFavicon()
    {
        return mFavicon;
    }

    public int getIndex()
    {
        return mIndex;
    }

    public String getOriginalUrl()
    {
        return mOriginalUrl;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public String getUrl()
    {
        return mUrl;
    }

    public String getVirtualUrl()
    {
        return mVirtualUrl;
    }

    public void updateFavicon(Bitmap bitmap)
    {
        mFavicon = bitmap;
    }
}
