// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.picasso:
//            a, e, Picasso, p, 
//            r

final class l extends a
{

    e m;

    l(Picasso picasso, ImageView imageview, r r, int i, int j, int k, Drawable drawable, 
            String s, Object obj, e e1, boolean flag)
    {
        super(picasso, imageview, r, i, j, k, drawable, s, obj, flag);
        m = e1;
    }

    public final void a()
    {
        ImageView imageview = (ImageView)c.get();
        if (imageview != null)
        {
            if (g != 0)
            {
                imageview.setImageResource(g);
            } else
            if (h != null)
            {
                imageview.setImageDrawable(h);
            }
            if (m != null)
            {
                m.b();
                return;
            }
        }
    }

    public final void a(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
    {
        if (bitmap == null)
        {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] {
                this
            }));
        }
        ImageView imageview = (ImageView)c.get();
        if (imageview != null)
        {
            android.content.Context context = a.e;
            boolean flag = a.m;
            p.a(imageview, context, bitmap, loadedfrom, d, flag);
            if (m != null)
            {
                m.a();
                return;
            }
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
