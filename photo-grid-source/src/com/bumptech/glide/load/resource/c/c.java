// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b.b;
import com.bumptech.glide.b.d;
import com.bumptech.glide.load.b.a.e;
import com.bumptech.glide.load.g;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            b

final class c extends android.graphics.drawable.Drawable.ConstantState
{

    d a;
    byte b[];
    Context c;
    g d;
    int e;
    int f;
    b g;
    e h;
    Bitmap i;

    public c(d d1, byte abyte0[], Context context, g g1, int j, int k, b b1, 
            e e1, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            throw new NullPointerException("The first frame of the GIF must not be null");
        } else
        {
            a = d1;
            b = abyte0;
            h = e1;
            i = bitmap;
            c = context.getApplicationContext();
            d = g1;
            e = j;
            f = k;
            g = b1;
            return;
        }
    }

    public final int getChangingConfigurations()
    {
        return 0;
    }

    public final Drawable newDrawable()
    {
        return new com.bumptech.glide.load.resource.c.b(this);
    }

    public final Drawable newDrawable(Resources resources)
    {
        return newDrawable();
    }
}
