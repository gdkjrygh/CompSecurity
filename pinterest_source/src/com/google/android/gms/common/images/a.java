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
import com.google.android.gms.internal.iz;
import com.google.android.gms.internal.ja;
import com.google.android.gms.internal.jc;
import com.google.android.gms.internal.je;

public abstract class a
{

    final a LJ;
    protected int LK;
    protected int LL;
    protected boolean LM;
    protected ImageManager.OnImageLoadedListener LN;
    private boolean LO;
    private boolean LP;
    private boolean LQ;
    protected int LR;

    public com.google.android.gms.common.images.a(Uri uri, int i)
    {
        LK = 0;
        LL = 0;
        LM = false;
        LO = true;
        LP = false;
        LQ = true;
        LJ = new a(uri);
        LL = i;
    }

    private Drawable a(Context context, jc jc1, int i)
    {
        Resources resources = context.getResources();
        if (LR > 0)
        {
            com.google.android.gms.internal.jc.a a1 = new com.google.android.gms.internal.jc.a(i, LR);
            Drawable drawable = (Drawable)jc1.get(a1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((LR & 1) != 0)
                {
                    context = a(resources, drawable1);
                }
                jc1.put(a1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return ja.a(resources, drawable);
    }

    protected iz a(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof iz)
            {
                drawable2 = ((iz)drawable).hh();
            }
        } else
        {
            drawable2 = null;
        }
        return new iz(drawable2, drawable1);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        je.f(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((LR & 1) != 0)
        {
            bitmap1 = ja.a(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (LN != null)
        {
            LN.onImageLoaded(LJ.uri, context, true);
        }
        a(((Drawable) (context)), flag, false, true);
    }

    void a(Context context, jc jc1)
    {
        if (LQ)
        {
            Drawable drawable = null;
            if (LK != 0)
            {
                drawable = a(context, jc1, LK);
            }
            a(drawable, false, true, false);
        }
    }

    void a(Context context, jc jc1, boolean flag)
    {
        Drawable drawable = null;
        if (LL != 0)
        {
            drawable = a(context, jc1, LL);
        }
        if (LN != null)
        {
            LN.onImageLoaded(LJ.uri, drawable, false);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);

    public void az(int i)
    {
        LL = i;
    }

    protected boolean b(boolean flag, boolean flag1)
    {
        return LO && !flag1 && (!flag || LP);
    }

    private class a
    {

        public final Uri uri;

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
                return jv.equal(((a)obj).uri, uri);
            }
        }

        public final int hashCode()
        {
            return jv.hashCode(new Object[] {
                uri
            });
        }

        public a(Uri uri1)
        {
            uri = uri1;
        }
    }

}
