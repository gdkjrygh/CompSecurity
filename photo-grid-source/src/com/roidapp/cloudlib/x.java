// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.g.b.d;
import com.bumptech.glide.load.resource.a.b;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib:
//            t, ah

final class x extends d
{

    final t b;

    x(t t1, ImageView imageview)
    {
        b = t1;
        super(imageview);
    }

    private void g()
    {
        com.bumptech.glide.g.c c1 = e();
        if (c1 != null)
        {
            b.n.remove(c1);
        }
        if (b.k != null)
        {
            b.k.sendEmptyMessage(8481);
        }
    }

    public final void a(b b1, com.bumptech.glide.g.a.d d1)
    {
        super.a(b1, d1);
        g();
    }

    public final void a(Exception exception, Drawable drawable)
    {
        super.a(exception, drawable);
        g();
    }

    public final volatile void a(Object obj, com.bumptech.glide.g.a.d d1)
    {
        a((b)obj, d1);
    }

    public final void b(Drawable drawable)
    {
        super.b(drawable);
        g();
    }

    public final void c(Drawable drawable)
    {
        super.c(drawable);
        drawable = e();
        if (drawable != null && !b.n.contains(drawable))
        {
            b.n.add(drawable);
        }
        if (b.k != null)
        {
            b.k.sendEmptyMessage(8480);
        }
    }
}
