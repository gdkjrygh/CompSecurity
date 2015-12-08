// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.io;
import java.lang.ref.WeakReference;

public abstract class com.google.android.gms.common.images.a
{
    static final class a
    {

        public final Uri a;

        public boolean equals(Object obj)
        {
            if (!(obj instanceof a))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            } else
            {
                return y.a(((a)obj).a, a);
            }
        }

        public int hashCode()
        {
            return y.a(new Object[] {
                a
            });
        }

        public a(Uri uri)
        {
            a = uri;
        }
    }

    public static final class b extends com.google.android.gms.common.images.a
    {

        private WeakReference f;

        protected void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
        {
            if (!flag1)
            {
                ImageManager.a a1 = (ImageManager.a)f.get();
                if (a1 != null)
                {
                    a1.a(a.a, drawable, flag2);
                }
            }
        }

        public boolean equals(Object obj)
        {
            if (!(obj instanceof b))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            obj = (b)obj;
            ImageManager.a a1 = (ImageManager.a)f.get();
            ImageManager.a a2 = (ImageManager.a)((b) (obj)).f.get();
            boolean flag;
            if (a2 != null && a1 != null && y.a(a2, a1) && y.a(((b) (obj)).a, a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }

        public int hashCode()
        {
            return y.a(new Object[] {
                a
            });
        }
    }


    final a a;
    protected int b;
    protected int c;
    protected ImageManager.a d;
    protected int e;
    private boolean f;

    private Drawable a(Context context, io io1, int i)
    {
        Resources resources = context.getResources();
        if (e > 0)
        {
            com.google.android.gms.internal.io.a a1 = new com.google.android.gms.internal.io.a(i, e);
            Drawable drawable = (Drawable)io1.a(a1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((e & 1) != 0)
                {
                    context = a(resources, drawable1);
                }
                io1.b(a1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return in.a(resources, drawable);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        com.google.android.gms.common.internal.e.a(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((e & 1) != 0)
        {
            bitmap1 = in.a(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (d != null)
        {
            d.a(a.a, context, true);
        }
        a(((Drawable) (context)), flag, false, true);
    }

    void a(Context context, io io1)
    {
        if (f)
        {
            Drawable drawable = null;
            if (b != 0)
            {
                drawable = a(context, io1, b);
            }
            a(drawable, false, true, false);
        }
    }

    void a(Context context, io io1, boolean flag)
    {
        Drawable drawable = null;
        if (c != 0)
        {
            drawable = a(context, io1, c);
        }
        if (d != null)
        {
            d.a(a.a, drawable, false);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);
}
