// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.graphics.Bitmap;
import android.view.View;
import rx.X;

public class FallbackBitmapLoadingAdapter extends com.soundcloud.android.utils.images.ImageUtils.ViewlessLoadingListener
{
    public static class Factory
    {

        public FallbackBitmapLoadingAdapter create(X x, Bitmap bitmap)
        {
            return new FallbackBitmapLoadingAdapter(x, bitmap);
        }

        public Factory()
        {
        }
    }


    private final Bitmap fallbackImage;
    private final X subscriber;

    public FallbackBitmapLoadingAdapter(X x, Bitmap bitmap)
    {
        subscriber = x;
        fallbackImage = bitmap;
    }

    private void emitAndComplete(Bitmap bitmap)
    {
        if (!subscriber.isUnsubscribed())
        {
            subscriber.onNext(bitmap);
            subscriber.onCompleted();
        }
    }

    private void emitLoadedOrFallbackImage(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            emitAndComplete(fallbackImage);
            return;
        } else
        {
            emitAndComplete(bitmap);
            fallbackImage.recycle();
            return;
        }
    }

    public void onLoadingComplete(String s, View view, Bitmap bitmap)
    {
        if (subscriber.isUnsubscribed())
        {
            fallbackImage.recycle();
            return;
        } else
        {
            emitLoadedOrFallbackImage(bitmap);
            return;
        }
    }

    public void onLoadingFailed(String s, View view, String s1)
    {
        if (!subscriber.isUnsubscribed())
        {
            emitAndComplete(fallbackImage);
        }
    }
}
