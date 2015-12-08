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

final class ImageViewAction extends Action
{

    Callback callback;

    ImageViewAction(Picasso picasso, ImageView imageview, Request request, boolean flag, boolean flag1, int i, Drawable drawable, 
            String s, Object obj, Callback callback1)
    {
        super(picasso, imageview, request, flag, flag1, i, drawable, s, obj);
        callback = callback1;
    }

    final void cancel()
    {
        super.cancel();
        if (callback != null)
        {
            callback = null;
        }
    }

    public final void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
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
                bitmap = callback;
                return;
            }
        }
    }

    public final void error()
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
