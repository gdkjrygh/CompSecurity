// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request.b;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.request.a.c;

// Referenced classes of package com.bumptech.glide.request.b:
//            k

public abstract class e extends k
    implements com.bumptech.glide.request.a.c.a
{

    public e(ImageView imageview)
    {
        super(imageview);
    }

    public void a(Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }

    public void a(Exception exception, Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }

    protected abstract void a(Object obj);

    public void a(Object obj, c c1)
    {
        if (c1 == null || !c1.a(obj, this))
        {
            a(obj);
        }
    }

    public Drawable b()
    {
        return ((ImageView)a).getDrawable();
    }

    public void b(Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }

    public void c(Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }
}
