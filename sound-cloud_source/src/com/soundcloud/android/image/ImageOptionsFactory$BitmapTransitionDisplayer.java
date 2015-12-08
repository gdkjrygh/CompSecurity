// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.image;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.b.a.b.a.f;
import com.b.a.b.c.a;
import com.soundcloud.android.utils.images.ImageUtils;

// Referenced classes of package com.soundcloud.android.image:
//            ImageOptionsFactory

static abstract class _cls1
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

            final ImageOptionsFactory.BitmapTransitionDisplayer this$0;
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
                this$0 = ImageOptionsFactory.BitmapTransitionDisplayer.this;
                imageView = imageview;
                super();
            }
        }

        bitmap.setCallback(new _cls1());
        bitmap.startTransition(200);
        imageView.setImageDrawable(bitmap);
    }

    protected abstract void setBitmapImage(com.b.a.b.e.a a1, Bitmap bitmap);

    _cls1()
    {
    }
}
