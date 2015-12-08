// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.picasso:
//            Action, Picasso, PicassoDrawable, Callback, 
//            Request

class ImageViewAction extends Action
{

    Callback callback;

    ImageViewAction(Picasso picasso, ImageView imageview, Request request, int i, int j, int k, Drawable drawable, 
            String s, Object obj, Callback callback1, boolean flag)
    {
        super(picasso, imageview, request, i, j, k, drawable, s, obj, flag);
        callback = callback1;
    }

    void cancel()
    {
        super.cancel();
        if (callback != null)
        {
            callback = null;
        }
    }

    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
    {
        if (bitmap == null)
        {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] {
                this
            }));
        }
        ImageView imageview = (ImageView)target.get();
        if (imageview != null)
        {
            android.content.Context context = picasso.context;
            boolean flag = picasso.indicatorsEnabled;
            PicassoDrawable.setBitmap(imageview, context, bitmap, loadedfrom, noFade, flag);
            if (callback != null)
            {
                callback.onSuccess();
                return;
            }
        }
    }

    public void error()
    {
        ImageView imageview = (ImageView)target.get();
        if (imageview != null)
        {
            if (errorResId != 0)
            {
                imageview.setImageResource(errorResId);
            } else
            if (errorDrawable != null)
            {
                imageview.setImageDrawable(errorDrawable);
            }
            if (callback != null)
            {
                callback.onError();
                return;
            }
        }
    }
}
