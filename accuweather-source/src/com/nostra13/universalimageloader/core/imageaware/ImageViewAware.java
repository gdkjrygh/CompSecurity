// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.imageaware;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.utils.L;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package com.nostra13.universalimageloader.core.imageaware:
//            ImageAware

public class ImageViewAware
    implements ImageAware
{

    protected boolean checkActualViewSize;
    protected Reference imageViewRef;

    public ImageViewAware(ImageView imageview)
    {
        this(imageview, true);
    }

    public ImageViewAware(ImageView imageview, boolean flag)
    {
        imageViewRef = new WeakReference(imageview);
        checkActualViewSize = flag;
    }

    private static int getImageViewFieldValue(Object obj, String s)
    {
        boolean flag = false;
        int i;
        int j;
        try
        {
            s = android/widget/ImageView.getDeclaredField(s);
            s.setAccessible(true);
            j = ((Integer)s.get(obj)).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            L.e(((Throwable) (obj)));
            return 0;
        }
        i = ((flag) ? 1 : 0);
        if (j > 0)
        {
            i = ((flag) ? 1 : 0);
            if (j < 0x7fffffff)
            {
                i = j;
            }
        }
        return i;
    }

    public int getHeight()
    {
        ImageView imageview = (ImageView)imageViewRef.get();
        if (imageview != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
            int j = 0;
            int i = j;
            if (checkActualViewSize)
            {
                i = j;
                if (layoutparams != null)
                {
                    i = j;
                    if (layoutparams.height != -2)
                    {
                        i = imageview.getHeight();
                    }
                }
            }
            j = i;
            if (i <= 0)
            {
                j = i;
                if (layoutparams != null)
                {
                    j = layoutparams.height;
                }
            }
            i = j;
            if (j <= 0)
            {
                i = getImageViewFieldValue(imageview, "mMaxHeight");
            }
            return i;
        } else
        {
            return 0;
        }
    }

    public int getId()
    {
        ImageView imageview = (ImageView)imageViewRef.get();
        if (imageview == null)
        {
            return super.hashCode();
        } else
        {
            return imageview.hashCode();
        }
    }

    public ViewScaleType getScaleType()
    {
        ImageView imageview = (ImageView)imageViewRef.get();
        if (imageview != null)
        {
            return ViewScaleType.fromImageView(imageview);
        } else
        {
            return null;
        }
    }

    public int getWidth()
    {
        ImageView imageview = (ImageView)imageViewRef.get();
        if (imageview != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
            int j = 0;
            int i = j;
            if (checkActualViewSize)
            {
                i = j;
                if (layoutparams != null)
                {
                    i = j;
                    if (layoutparams.width != -2)
                    {
                        i = imageview.getWidth();
                    }
                }
            }
            j = i;
            if (i <= 0)
            {
                j = i;
                if (layoutparams != null)
                {
                    j = layoutparams.width;
                }
            }
            i = j;
            if (j <= 0)
            {
                i = getImageViewFieldValue(imageview, "mMaxWidth");
            }
            return i;
        } else
        {
            return 0;
        }
    }

    public volatile View getWrappedView()
    {
        return getWrappedView();
    }

    public ImageView getWrappedView()
    {
        return (ImageView)imageViewRef.get();
    }

    public boolean isCollected()
    {
        return imageViewRef.get() == null;
    }

    public boolean setImageBitmap(Bitmap bitmap)
    {
        ImageView imageview = (ImageView)imageViewRef.get();
        if (imageview != null)
        {
            imageview.setImageBitmap(bitmap);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean setImageDrawable(Drawable drawable)
    {
        ImageView imageview = (ImageView)imageViewRef.get();
        if (imageview != null)
        {
            imageview.setImageDrawable(drawable);
            return true;
        } else
        {
            return false;
        }
    }
}
