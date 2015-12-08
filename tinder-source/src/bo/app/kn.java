// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

// Referenced classes of package bo.app:
//            km, kt, jo

public final class kn
    implements km
{

    protected Reference a;
    protected boolean b;

    public kn(ImageView imageview)
    {
        this(imageview, (byte)0);
    }

    private kn(ImageView imageview, byte byte0)
    {
        a = new WeakReference(imageview);
        b = true;
    }

    private static int a(Object obj, String s)
    {
        int i;
        s = android/widget/ImageView.getDeclaredField(s);
        s.setAccessible(true);
        i = ((Integer)s.get(obj)).intValue();
        if (i > 0 && i < 0x7fffffff)
        {
            return i;
        }
        break MISSING_BLOCK_LABEL_41;
        obj;
        kt.a(((Throwable) (obj)));
        return 0;
    }

    public final int a()
    {
        int j = 0;
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
            int i = j;
            if (b)
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
            if (j <= 0)
            {
                return a(imageview, "mMaxWidth");
            } else
            {
                return j;
            }
        } else
        {
            return 0;
        }
    }

    public final boolean a(Bitmap bitmap)
    {
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            imageview.setImageBitmap(bitmap);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean a(Drawable drawable)
    {
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            imageview.setImageDrawable(drawable);
            return true;
        } else
        {
            return false;
        }
    }

    public final int b()
    {
        int j = 0;
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
            int i = j;
            if (b)
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
            if (j <= 0)
            {
                return a(imageview, "mMaxHeight");
            } else
            {
                return j;
            }
        } else
        {
            return 0;
        }
    }

    public final int c()
    {
        ImageView imageview = (ImageView)a.get();
        if (imageview != null)
        {
            return jo.a(imageview);
        } else
        {
            return 0;
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
