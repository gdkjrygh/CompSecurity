// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.content.Loader;
import com.android.ex.photo.loaders.PhotoBitmapLoaderInterface;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import com.squareup.picasso.Target;

final class PicassoBitmapLoader extends Loader
    implements PhotoBitmapLoaderInterface, Target
{

    private Uri imageUri;
    private final Picasso picasso;

    PicassoBitmapLoader(Context context, Picasso picasso1, String s)
    {
        super(context);
        picasso = picasso1;
        setPhotoUri(s);
    }

    protected final void onAbandon()
    {
        picasso.cancelRequest(this);
    }

    public final void onBitmapFailed(Drawable drawable)
    {
        drawable = new com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult();
        drawable.status = 1;
        deliverResult(drawable);
    }

    public final void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        loadedfrom = new com.android.ex.photo.loaders.PhotoBitmapLoaderInterface.BitmapResult();
        loadedfrom.status = 0;
        loadedfrom.bitmap = bitmap;
        deliverResult(loadedfrom);
    }

    protected final void onStartLoading()
    {
        picasso.load(imageUri).into(this);
    }

    public final void setPhotoUri(String s)
    {
        imageUri = Uri.parse(s);
    }
}
