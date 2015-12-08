// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            m

final class n extends android.graphics.drawable.Drawable.ConstantState
{

    private static final Paint d = new Paint(6);
    final Bitmap a;
    int b;
    Paint c;

    public n(Bitmap bitmap)
    {
        c = d;
        a = bitmap;
    }

    n(n n1)
    {
        this(n1.a);
        b = n1.b;
    }

    final void a()
    {
        if (d == c)
        {
            c = new Paint(6);
        }
    }

    public final int getChangingConfigurations()
    {
        return 0;
    }

    public final Drawable newDrawable()
    {
        return new m(null, this);
    }

    public final Drawable newDrawable(Resources resources)
    {
        return new m(resources, this);
    }

}
