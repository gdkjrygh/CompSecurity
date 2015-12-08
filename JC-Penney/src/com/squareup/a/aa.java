// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.a:
//            a, m, ak, au, 
//            ax, aq

class aa extends a
{

    m m;

    aa(ak ak1, ImageView imageview, ax ax, int i, int j, int k, Drawable drawable, 
            String s, Object obj, m m1, boolean flag)
    {
        super(ak1, imageview, ax, i, j, k, drawable, s, obj, flag);
        m = m1;
    }

    public void a()
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

    public void a(Bitmap bitmap, aq aq)
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
            android.content.Context context = a.c;
            boolean flag = a.k;
            au.a(imageview, context, bitmap, aq, d, flag);
            if (m != null)
            {
                m.a();
                return;
            }
        }
    }

    void b()
    {
        super.b();
        if (m != null)
        {
            m = null;
        }
    }
}
