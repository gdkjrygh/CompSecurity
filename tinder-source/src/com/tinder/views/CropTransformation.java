// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.squareup.picasso.z;

public class CropTransformation
    implements z
{

    private int mHeight;
    private int mWidth;

    public CropTransformation(int i, int j)
    {
        mWidth = i;
        mHeight = j;
    }

    public String key()
    {
        return "CropTransformation";
    }

    public Bitmap transform(Bitmap bitmap)
    {
        return ThumbnailUtils.extractThumbnail(bitmap, mWidth, mHeight, 2);
    }
}
