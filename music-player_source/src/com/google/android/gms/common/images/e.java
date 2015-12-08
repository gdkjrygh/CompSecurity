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
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.fk;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.fp;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.ik;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a, f

public final class e
{

    final f a;
    int b;
    private int c;
    private int d;
    private WeakReference e;
    private WeakReference f;
    private WeakReference g;
    private int h;
    private boolean i;
    private int j;

    private static fk a(Drawable drawable, Drawable drawable1)
    {
        Drawable drawable2;
        if (drawable != null)
        {
            drawable2 = drawable;
            if (drawable instanceof fk)
            {
                drawable2 = ((fk)drawable).a();
            }
        } else
        {
            drawable2 = null;
        }
        return new fk(drawable2, drawable1);
    }

    private void a(Drawable drawable, boolean flag)
    {
        int k = 1;
        b;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 33
    //                   2 55
    //                   3 215;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        if ((a)e.get() != null)
        {
            drawable = a.a;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        ImageView imageview = (ImageView)f.get();
        if (imageview == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        fp fp1;
        int i1;
        boolean flag1;
        if (flag)
        {
            k = 0;
        }
        if (k == 0 || !(imageview instanceof fp))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((fp)imageview).a();
        if (c != 0 && i1 == c) goto _L1; else goto _L5
_L5:
        flag1 = a();
        if (flag1)
        {
            drawable = a(imageview.getDrawable(), drawable);
        }
        imageview.setImageDrawable(drawable);
        if (imageview instanceof fp)
        {
            fp1 = (fp)imageview;
            android.net.Uri uri;
            if (flag)
            {
                uri = a.a;
            } else
            {
                uri = null;
            }
            fp1.a(uri);
            if (k != 0)
            {
                k = c;
            } else
            {
                k = 0;
            }
            fp1.a(k);
        }
        if (flag1)
        {
            ((fk)drawable).b();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        TextView textview = (TextView)g.get();
        if (textview != null)
        {
            int l = h;
            flag = a();
            Object obj;
            Drawable drawable1;
            Drawable drawable2;
            Drawable drawable3;
            if (ik.b())
            {
                obj = textview.getCompoundDrawablesRelative();
            } else
            {
                obj = textview.getCompoundDrawables();
            }
            drawable1 = obj[l];
            if (flag)
            {
                drawable = a(drawable1, drawable);
            }
            if (l == 0)
            {
                drawable1 = drawable;
            } else
            {
                drawable1 = obj[0];
            }
            if (l == 1)
            {
                drawable2 = drawable;
            } else
            {
                drawable2 = obj[1];
            }
            if (l == 2)
            {
                drawable3 = drawable;
            } else
            {
                drawable3 = obj[2];
            }
            if (l == 3)
            {
                obj = drawable;
            } else
            {
                obj = obj[3];
            }
            if (ik.b())
            {
                textview.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable1, drawable2, drawable3, ((Drawable) (obj)));
            } else
            {
                textview.setCompoundDrawablesWithIntrinsicBounds(drawable1, drawable2, drawable3, ((Drawable) (obj)));
            }
            if (flag)
            {
                ((fk)drawable).b();
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private boolean a()
    {
        return i;
    }

    final void a(Context context)
    {
        if (c != 0)
        {
            Resources resources = context.getResources();
            Drawable drawable = resources.getDrawable(c);
            context = drawable;
            if ((j & 1) != 0)
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
                context = new BitmapDrawable(resources, fo.a(context));
            }
        } else
        {
            context = null;
        }
        a(((Drawable) (context)), false);
    }

    final void a(Context context, Bitmap bitmap)
    {
        fq.a(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((j & 1) != 0)
        {
            bitmap1 = fo.a(bitmap);
        }
        a(((Drawable) (new BitmapDrawable(context.getResources(), bitmap1))), true);
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof e)
        {
            if (this == obj)
            {
                return true;
            }
            if (((e)obj).hashCode() == hashCode())
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return d;
    }
}
