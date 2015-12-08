// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.ic;
import com.google.android.gms.internal.id;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public abstract class com.google.android.gms.common.images.a
{
    static final class a
    {

        public final Uri a;

        public final boolean equals(Object obj)
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
                return x.a(((a)obj).a, a);
            }
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
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

        private WeakReference d;

        protected final void a()
        {
            d.get();
        }

        public final boolean equals(Object obj)
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
            ImageManager.a a1 = (ImageManager.a)d.get();
            ImageManager.a a2 = (ImageManager.a)((b) (obj)).d.get();
            return a2 != null && a1 != null && x.a(a2, a1) && x.a(((b) (obj)).a, a);
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                a
            });
        }
    }


    final a a;
    protected int b;
    protected int c;

    protected abstract void a();

    final void a(Context context, Bitmap bitmap)
    {
        e.a(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((c & 1) != 0)
        {
            bitmap1 = ic.a(bitmap);
        }
        new BitmapDrawable(context.getResources(), bitmap1);
        a();
    }

    final void a(Context context, id id1)
    {
        if (b != 0)
        {
            int i = b;
            Resources resources = context.getResources();
            if (c > 0)
            {
                com.google.android.gms.internal.id.a a1 = new com.google.android.gms.internal.id.a(i, c);
                if ((Drawable)id1.b(a1) == null)
                {
                    Drawable drawable = resources.getDrawable(i);
                    context = drawable;
                    if ((c & 1) != 0)
                    {
                        if (drawable == null)
                        {
                            context = null;
                        } else
                        if (drawable instanceof BitmapDrawable)
                        {
                            context = ((BitmapDrawable)drawable).getBitmap();
                        } else
                        {
                            context = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
                            Canvas canvas = new Canvas(context);
                            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                            drawable.draw(canvas);
                        }
                        context = new BitmapDrawable(resources, ic.a(context));
                    }
                    id1.a(a1, context);
                }
            } else
            {
                resources.getDrawable(i);
            }
        }
        a();
    }
}
