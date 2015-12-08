// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.g.a.d;

// Referenced classes of package com.bumptech.glide.g.b:
//            l

public abstract class e extends l
    implements com.bumptech.glide.g.a.e
{

    public e(ImageView imageview)
    {
        super(imageview);
    }

    public final void a(Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }

    public void a(Exception exception, Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }

    protected abstract void a(Object obj);

    public void a(Object obj, d d1)
    {
        if (d1 == null || !d1.a(obj, this))
        {
            a(obj);
        }
    }

    public void b(Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }

    public void c(Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }

    public final Drawable d()
    {
        return ((ImageView)a).getDrawable();
    }
}
