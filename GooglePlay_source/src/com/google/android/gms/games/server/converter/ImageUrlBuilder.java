// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server.converter;

import android.content.Context;
import android.content.res.Resources;

public final class ImageUrlBuilder
{

    public boolean mAllowSilhouette;
    private boolean mBlackAndWhite;
    private final String mInputUrl;
    public int mSize;

    public ImageUrlBuilder(String s)
    {
        mAllowSilhouette = true;
        mSize = 0;
        mBlackAndWhite = false;
        mInputUrl = s;
    }

    public final String build()
    {
        Object obj1 = null;
        boolean flag1 = false;
        Object obj = new com.google.android.gms.common.images.internal.ImageUrlUtils.ProfileImageUrlBuilder(mInputUrl);
        obj.mAllowSilhouette = mAllowSilhouette;
        String s = ((com.google.android.gms.common.images.internal.ImageUrlUtils.ProfileImageUrlBuilder) (obj)).setBlackAndWhite(false).setSize(mSize).build();
        obj = s;
        if (s == null)
        {
            obj = (new com.google.android.gms.common.images.internal.ImageUrlUtils.ContentImageUrlBuilder(mInputUrl)).setBlackAndWhite(false).setSize(mSize).build();
        }
        String as[] = ((String) (obj)).split("=", 2);
        if (as.length == 1)
        {
            return ((String) (obj));
        }
        String as1[] = as[1].split("-");
        int i = 0;
        s = null;
        String s2 = null;
        obj = obj1;
        while (i < as1.length) 
        {
            String s4;
            if (as1[i].matches("s\\d+"))
            {
                s4 = as1[i];
                obj1 = s;
            } else
            if (as1[i].equals("fbw=1"))
            {
                obj1 = "fbw=1";
                s4 = s2;
            } else
            {
                obj1 = s;
                s4 = s2;
                if (as1[i].equals("ns"))
                {
                    obj = "ns";
                    obj1 = s;
                    s4 = s2;
                }
            }
            i++;
            s = ((String) (obj1));
            s2 = s4;
        }
        obj1 = new StringBuilder(as[0]);
        boolean flag;
        if (s2 != null)
        {
            ((StringBuilder) (obj1)).append("=").append(s2);
            flag = false;
        } else
        {
            flag = true;
        }
        if (s != null)
        {
            String s3;
            if (flag)
            {
                s3 = "=";
            } else
            {
                s3 = "-";
            }
            ((StringBuilder) (obj1)).append(s3).append(s);
            flag = flag1;
        }
        if (obj != null)
        {
            String s1;
            if (flag)
            {
                s1 = "=";
            } else
            {
                s1 = "-";
            }
            ((StringBuilder) (obj1)).append(s1).append(((String) (obj)));
        }
        return ((StringBuilder) (obj1)).toString();
    }

    public final ImageUrlBuilder setSize(Context context, int i)
    {
        mSize = context.getResources().getDimensionPixelSize(i);
        return this;
    }
}
