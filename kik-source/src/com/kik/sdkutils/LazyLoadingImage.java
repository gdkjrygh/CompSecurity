// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.sdkutils;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.kik.cache.d;
import com.kik.cache.g;
import com.kik.cache.h;
import com.kik.g.p;
import com.kik.sdkutils.a.a;
import com.kik.sdkutils.b.b;

// Referenced classes of package com.kik.sdkutils:
//            aa, d

public class LazyLoadingImage extends ImageView
{

    boolean a;
    private String b;
    private Bitmap c;
    private a d;
    private boolean e;
    private Drawable f;
    private Bitmap g;
    private Object h;
    private final Object i;

    public LazyLoadingImage(Context context)
    {
        super(context);
        e = true;
        i = new Object();
    }

    public LazyLoadingImage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = true;
        i = new Object();
        attributeset = context.obtainStyledAttributes(attributeset, kik.android.ag.b.m);
        f = attributeset.getDrawable(0);
        if (f == null)
        {
            context = null;
        } else
        {
            context = ((BitmapDrawable)f).getBitmap();
        }
        g = context;
        a = false;
        if (getDrawable() == null)
        {
            e = false;
        }
        attributeset.recycle();
    }

    static Bitmap a(LazyLoadingImage lazyloadingimage, Bitmap bitmap)
    {
        lazyloadingimage.c = bitmap;
        return bitmap;
    }

    static Object a(LazyLoadingImage lazyloadingimage)
    {
        return lazyloadingimage.h;
    }

    private void a(Bitmap bitmap)
    {
        if (d == null)
        {
            d = new a(bitmap, b);
            d.setCallback(this);
            return;
        } else
        {
            d.a(bitmap);
            return;
        }
    }

    static void a(LazyLoadingImage lazyloadingimage, a a1)
    {
        lazyloadingimage.b(a1);
    }

    private static boolean a(a a1)
    {
        return a1 == null || a1.a();
    }

    static Bitmap b(LazyLoadingImage lazyloadingimage)
    {
        return lazyloadingimage.c;
    }

    static void b(LazyLoadingImage lazyloadingimage, Bitmap bitmap)
    {
        lazyloadingimage.a(bitmap);
    }

    private void b(a a1)
    {
        if (!e)
        {
            if (getDrawable() == a1)
            {
                setImageDrawable(null);
            }
            Object obj = a1;
            if (a(a1))
            {
                obj = f;
            }
            setImageDrawable(((Drawable) (obj)));
            return;
        }
        if (getBackground() == a1)
        {
            setBackgroundDrawable(null);
        }
        Object obj1 = a1;
        if (a(a1))
        {
            obj1 = f;
        }
        setBackgroundDrawable(((Drawable) (obj1)));
    }

    static Bitmap c(LazyLoadingImage lazyloadingimage)
    {
        return lazyloadingimage.g;
    }

    static a d(LazyLoadingImage lazyloadingimage)
    {
        return lazyloadingimage.d;
    }

    public final void a(Object obj, d d1, com.kik.sdkutils.b.a a1, b b1)
    {
        String s;
        if (obj == null)
        {
            s = null;
        } else
        {
            s = a1.b(obj);
        }
        b = s;
        if (obj == null || a1.a(obj))
        {
            d = null;
            h = null;
            b(d);
            return;
        }
        d1 = d1.c(obj);
        synchronized (i)
        {
            h = d1;
        }
        if (d1.h())
        {
            obj = (h)d1.f();
            if (obj != null && b1 != null && obj != null && ((h) (obj)).a() != null)
            {
                obj = (g)b1.a(((h) (obj)).a());
                if (obj != null)
                {
                    c = ((g) (obj)).a();
                } else
                {
                    c = null;
                }
            } else
            {
                c = null;
            }
            a(c);
            b(d);
            return;
        } else
        {
            d = null;
            b(d);
            d1.a(com.kik.sdkutils.d.a(this, new aa(this, d1, b1)));
            return;
        }
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    protected void onDetachedFromWindow()
    {
        if (d != null)
        {
            d.setCallback(null);
        }
        super.onDetachedFromWindow();
    }
}
