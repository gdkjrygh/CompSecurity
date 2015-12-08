// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.x;

public class g
    implements x
{

    private final ImageView a;

    public g(ImageView imageview)
    {
        a = imageview;
        a.setTag(this);
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        a.setImageBitmap(bitmap);
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }
}
