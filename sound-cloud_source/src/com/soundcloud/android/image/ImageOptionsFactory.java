// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.widget.ImageView;
import com.b.a.b.a.f;
import com.b.a.b.c;
import com.b.a.b.c.a;
import com.b.a.b.c.b;
import com.soundcloud.android.utils.images.ImageUtils;
import java.util.EnumSet;

// Referenced classes of package com.soundcloud.android.image:
//            ApiImageSize

final class ImageOptionsFactory
{
    static abstract class BitmapTransitionDisplayer
        implements a
    {

        protected abstract Drawable createBitmapDrawable(Bitmap bitmap, Resources resources);

        public void display(Bitmap bitmap, com.b.a.b.e.a a1, f f1)
        {
label0:
            {
                ImageView imageview = (ImageView)a1.d();
                if (imageview != null && bitmap != null)
                {
                    if (f1 == f.c)
                    {
                        break label0;
                    }
                    performDrawableTransition(bitmap, imageview);
                }
                return;
            }
            setBitmapImage(a1, bitmap);
        }

        protected abstract Drawable getTransitionFromDrawable(ImageView imageview);

        protected void performDrawableTransition(Bitmap bitmap, final ImageView imageView)
        {
            bitmap = ImageUtils.createTransitionDrawable(getTransitionFromDrawable(imageView), createBitmapDrawable(bitmap, imageView.getResources()));
            class _cls1
                implements android.graphics.drawable.Drawable.Callback
            {

                final BitmapTransitionDisplayer this$0;
                final ImageView val$imageView;

                public void invalidateDrawable(Drawable drawable)
                {
                    imageView.invalidate();
                }

                public void scheduleDrawable(Drawable drawable, Runnable runnable, long l)
                {
                }

                public void unscheduleDrawable(Drawable drawable, Runnable runnable)
                {
                }

                _cls1()
                {
                    this$0 = BitmapTransitionDisplayer.this;
                    imageView = imageview;
                    super();
                }
            }

            bitmap.setCallback(new _cls1());
            bitmap.startTransition(200);
            imageView.setImageDrawable(bitmap);
        }

        protected abstract void setBitmapImage(com.b.a.b.e.a a1, Bitmap bitmap);

        BitmapTransitionDisplayer()
        {
        }
    }

    static class CircularTransitionDisplayer extends PlaceholderTransitionDisplayer
    {

        protected Drawable createBitmapDrawable(Bitmap bitmap, Resources resources)
        {
            return ImageUtils.createCircularDrawable(bitmap, resources);
        }

        protected void setBitmapImage(com.b.a.b.e.a a1, Bitmap bitmap)
        {
            a1.a(createBitmapDrawable(bitmap, a1.d().getResources()));
        }

        CircularTransitionDisplayer()
        {
        }
    }

    static class PlaceholderTransitionDisplayer extends BitmapTransitionDisplayer
    {

        protected Drawable createBitmapDrawable(Bitmap bitmap, Resources resources)
        {
            return new BitmapDrawable(resources, bitmap);
        }

        protected Drawable getTransitionFromDrawable(ImageView imageview)
        {
            return imageview.getDrawable();
        }

        protected void setBitmapImage(com.b.a.b.e.a a1, Bitmap bitmap)
        {
            a1.a(bitmap);
        }

        PlaceholderTransitionDisplayer()
        {
        }
    }


    static final int DELAY_BEFORE_LOADING = 200;

    private ImageOptionsFactory()
    {
    }

    static c adapterView(Drawable drawable, ApiImageSize apiimagesize)
    {
        return adapterView(drawable, apiimagesize, new PlaceholderTransitionDisplayer());
    }

    private static c adapterView(Drawable drawable, ApiImageSize apiimagesize, PlaceholderTransitionDisplayer placeholdertransitiondisplayer)
    {
        com.b.a.b.c.a a = fullCacheBuilder();
        a.g = true;
        a.d = drawable;
        a.f = drawable;
        a.e = drawable;
        drawable = a.a(placeholdertransitiondisplayer);
        if (ApiImageSize.SMALL_SIZES.contains(apiimagesize))
        {
            apiimagesize = android.graphics.Bitmap.Config.RGB_565;
            if (apiimagesize == null)
            {
                throw new IllegalArgumentException("bitmapConfig can't be null");
            }
            ((com.b.a.b.c.a) (drawable)).k.inPreferredConfig = apiimagesize;
        }
        return drawable.b();
    }

    static c adapterViewCircular(Drawable drawable, ApiImageSize apiimagesize)
    {
        return adapterView(drawable, apiimagesize, new CircularTransitionDisplayer());
    }

    public static c cache()
    {
        return fullCacheBuilder().b();
    }

    public static com.b.a.b.c.a fullCacheBuilder()
    {
        com.b.a.b.c.a a = new com.b.a.b.c.a();
        a.h = true;
        a.i = true;
        return a;
    }

    public static c fullImageDialog()
    {
        com.b.a.b.c.a a = new com.b.a.b.c.a();
        a.i = true;
        return a.a().a(new b()).b();
    }

    public static c placeholder(Drawable drawable)
    {
        com.b.a.b.c.a a = fullCacheBuilder();
        a.d = drawable;
        a.e = drawable;
        a.f = drawable;
        return a.b();
    }

    public static c placeholderCircular(Drawable drawable)
    {
        com.b.a.b.c.a a = fullCacheBuilder();
        a.d = drawable;
        a.e = drawable;
        a.f = drawable;
        return a.a(new CircularTransitionDisplayer()).b();
    }

    public static c player(Drawable drawable, boolean flag)
    {
        com.b.a.b.c.a a = fullCacheBuilder();
        a.d = drawable;
        a.e = drawable;
        a.f = drawable;
        drawable = a.a(new PlaceholderTransitionDisplayer());
        if (!flag)
        {
            drawable.a();
        }
        return drawable.b();
    }

    public static c playerLeaveBehind()
    {
        com.b.a.b.c.a a = new com.b.a.b.c.a();
        a.h = true;
        a.i = false;
        return a.b();
    }

    public static c prefetch()
    {
        com.b.a.b.c.a a = new com.b.a.b.c.a();
        a.h = false;
        a.i = true;
        return a.b();
    }
}
