// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.c.b:
//            a, aj, at, m, 
//            aw, ap

final class z extends a
{

    m m;

    z(aj aj1, ImageView imageview, aw aw, int i, int j, int k, Drawable drawable, 
            String s, Object obj, m m1, boolean flag)
    {
        super(aj1, imageview, aw, i, j, k, drawable, s, obj, flag);
        m = m1;
    }

    public final void a()
    {
        ImageView imageview = (ImageView)c.get();
        if (imageview != null)
        {
            if (g != 0)
            {
                imageview.setImageResource(g);
                return;
            }
            if (h != null)
            {
                imageview.setImageDrawable(h);
                return;
            }
        }
    }

    public final void a(Bitmap bitmap, ap ap)
    {
        if (bitmap == null)
        {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] {
                this
            }));
        }
        ImageView imageview = (ImageView)c.get();
        if (imageview == null)
        {
            return;
        } else
        {
            android.content.Context context = a.c;
            boolean flag = a.k;
            at.a(imageview, context, bitmap, ap, d, flag);
            return;
        }
    }

    final void b()
    {
        super.b();
        if (m != null)
        {
            m = null;
        }
    }
}
