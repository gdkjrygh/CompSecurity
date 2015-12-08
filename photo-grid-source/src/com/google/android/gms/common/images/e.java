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
import com.google.android.gms.common.internal.g;
import com.google.android.gms.internal.vl;
import com.google.android.gms.internal.vm;
import com.google.android.gms.internal.vn;

// Referenced classes of package com.google.android.gms.common.images:
//            f

public abstract class e
{

    final f a;
    protected int b;
    protected int c;

    protected abstract void a();

    final void a(Context context, Bitmap bitmap)
    {
        g.a(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((c & 1) != 0)
        {
            bitmap1 = vl.a(bitmap);
        }
        new BitmapDrawable(context.getResources(), bitmap1);
        a();
    }

    final void a(Context context, vm vm1)
    {
        if (b != 0)
        {
            int i = b;
            Resources resources = context.getResources();
            if (c > 0)
            {
                vn vn1 = new vn(i, c);
                if ((Drawable)vm1.b(vn1) == null)
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
                        context = new BitmapDrawable(resources, vl.a(context));
                    }
                    vm1.a(vn1, context);
                }
            } else
            {
                resources.getDrawable(i);
            }
        }
        a();
    }
}
