// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.Bitmap;
import android.view.View;
import rx.X;

public class BitmapLoadingAdapter extends com.soundcloud.android.utils.images.ImageUtils.ViewlessLoadingListener
{
    public static class Factory
    {

        public BitmapLoadingAdapter create(X x)
        {
            return new BitmapLoadingAdapter(x);
        }

        public Factory()
        {
        }
    }


    private final X subscriber;

    public BitmapLoadingAdapter(X x)
    {
        subscriber = x;
    }

    public void onLoadingComplete(String s, View view, Bitmap bitmap)
    {
        if (subscriber.isUnsubscribed())
        {
            bitmap.recycle();
        } else
        if (bitmap != null)
        {
            subscriber.onNext(bitmap);
            subscriber.onCompleted();
            return;
        }
    }

    public void onLoadingFailed(String s, View view, String s1)
    {
    }
}
