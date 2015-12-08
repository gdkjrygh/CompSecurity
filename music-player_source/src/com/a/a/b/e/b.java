// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.b.e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.a.a.b.a.i;
import com.a.a.c.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package com.a.a.b.e:
//            a

public final class b
    implements a
{

    protected Reference a;
    protected boolean b;

    public b(ImageView imageview)
    {
        this(imageview, (byte)0);
    }

    private b(ImageView imageview, byte byte0)
    {
        a = new WeakReference(imageview);
        b = true;
    }

    private static int a(Object obj, String s)
    {
        int j;
        s = android/widget/ImageView.getDeclaredField(s);
        s.setAccessible(true);
        j = ((Integer)s.get(obj)).intValue();
        if (j > 0 && j < 0x7fffffff)
        {
            return j;
        }
        break MISSING_BLOCK_LABEL_41;
        obj;
        com.a.a.c.e.a(((Throwable) (obj)));
        return 0;
    }

    public final int a()
    {
        int k = 0;
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
            int j = k;
            if (b)
            {
                j = k;
                if (layoutparams != null)
                {
                    j = k;
                    if (layoutparams.width != -2)
                    {
                        j = imageview.getWidth();
                    }
                }
            }
            k = j;
            if (j <= 0)
            {
                k = j;
                if (layoutparams != null)
                {
                    k = layoutparams.width;
                }
            }
            if (k <= 0)
            {
                return a(imageview, "mMaxWidth");
            } else
            {
                return k;
            }
        } else
        {
            return 0;
        }
    }

    public final boolean a(Bitmap bitmap)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            ImageView imageview = (ImageView)a.get();
            if (imageview != null)
            {
                imageview.setImageBitmap(bitmap);
                return true;
            }
        } else
        {
            com.a.a.c.e.c("Can't set a bitmap into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        }
        return false;
    }

    public final boolean a(Drawable drawable)
    {
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            ImageView imageview = (ImageView)a.get();
            if (imageview != null)
            {
                imageview.setImageDrawable(drawable);
                return true;
            }
        } else
        {
            com.a.a.c.e.c("Can't set a drawable into view. You should call ImageLoader on UI thread for it.", new Object[0]);
        }
        return false;
    }

    public final int b()
    {
        int k = 0;
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
            int j = k;
            if (b)
            {
                j = k;
                if (layoutparams != null)
                {
                    j = k;
                    if (layoutparams.height != -2)
                    {
                        j = imageview.getHeight();
                    }
                }
            }
            k = j;
            if (j <= 0)
            {
                k = j;
                if (layoutparams != null)
                {
                    k = layoutparams.height;
                }
            }
            if (k <= 0)
            {
                return a(imageview, "mMaxHeight");
            } else
            {
                return k;
            }
        } else
        {
            return 0;
        }
    }

    public final i c()
    {
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            return i.a(imageview);
        } else
        {
            return null;
        }
    }

    public final View d()
    {
        return (ImageView)a.get();
    }

    public final boolean e()
    {
        return a.get() == null;
    }

    public final int f()
    {
        ImageView imageview = (ImageView)a.get();
        if (imageview == null)
        {
            return super.hashCode();
        } else
        {
            return imageview.hashCode();
        }
    }
}
