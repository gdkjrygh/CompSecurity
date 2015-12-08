// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            j

static class b extends android.graphics.drawable.able.ConstantState
{

    private static final Paint d = new Paint(6);
    final Bitmap a;
    int b;
    Paint c;

    void a()
    {
        if (d == c)
        {
            c = new Paint(6);
        }
    }

    void a(int i)
    {
        a();
        c.setAlpha(i);
    }

    void a(ColorFilter colorfilter)
    {
        a();
        c.setColorFilter(colorfilter);
    }

    public int getChangingConfigurations()
    {
        return 0;
    }

    public Drawable newDrawable()
    {
        return new j(null, this);
    }

    public Drawable newDrawable(Resources resources)
    {
        return new j(resources, this);
    }


    public tate(Bitmap bitmap)
    {
        c = d;
        a = bitmap;
    }

    a(a a1)
    {
        this(a1.a);
        b = a1.b;
    }
}
