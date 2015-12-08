// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.zzb;
import com.google.android.gms.internal.zzkh;
import com.google.android.gms.internal.zzkj;

public abstract class zza
{

    final zza a;
    protected int b;
    protected ImageManager.OnImageLoadedListener c;
    protected int d;

    private Drawable a(Context context, zzkj zzkj1, int i)
    {
        Resources resources = context.getResources();
        if (d > 0)
        {
            com.google.android.gms.internal.zzkj.zza zza1 = new com.google.android.gms.internal.zzkj.zza(i, d);
            Drawable drawable = (Drawable)zzkj1.a(zza1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((d & 1) != 0)
                {
                    context = a(resources, drawable1);
                }
                zzkj1.b(zza1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return zzkh.a(resources, drawable);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        zzb.a(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((d & 1) != 0)
        {
            bitmap1 = zzkh.a(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (c != null)
        {
            c.a(a.a, context, true);
        }
        a(((Drawable) (context)), flag, false, true);
    }

    void a(Context context, zzkj zzkj1, boolean flag)
    {
        Drawable drawable = null;
        if (b != 0)
        {
            drawable = a(context, zzkj1, b);
        }
        if (c != null)
        {
            c.a(a.a, drawable, false);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    private class zza
    {

        public final Uri a;

        public boolean equals(Object obj)
        {
            if (!(obj instanceof zza))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            } else
            {
                return zzt.a(((zza)obj).a, a);
            }
        }

        public int hashCode()
        {
            return zzt.a(new Object[] {
                a
            });
        }

        public zza(Uri uri)
        {
            a = uri;
        }
    }

}
