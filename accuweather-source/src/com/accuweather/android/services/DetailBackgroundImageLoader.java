// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.accuweather.android.utilities.BackgroundImages;

public class DetailBackgroundImageLoader extends AsyncTask
{

    ImageView imageView;
    BackgroundImages images;
    boolean isHalfBackground;

    public DetailBackgroundImageLoader(BackgroundImages backgroundimages, ImageView imageview, boolean flag)
    {
        images = backgroundimages;
        imageView = imageview;
        isHalfBackground = flag;
    }

    protected transient Bitmap doInBackground(String as[])
    {
        as = as[0];
        if (isHalfBackground)
        {
            return images.getHalfBackgroundImageFromCode(as);
        } else
        {
            return images.getBackgroundImageFromCode(as);
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    public transient void executeSync(String as[])
    {
        onPostExecute(doInBackground(as));
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        if (imageView != null && bitmap != null)
        {
            imageView.setImageBitmap(bitmap);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }
}
