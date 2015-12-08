// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.b.c;
import com.bumptech.glide.load.g;

// Referenced classes of package com.bumptech.glide.load.resource.c:
//            b

static class g extends android.graphics.drawable.able.ConstantState
{

    c a;
    byte b[];
    Context c;
    g d;
    int e;
    int f;
    com.bumptech.glide.b. g;
    com.bumptech.glide.load.engine.a.c h;
    Bitmap i;

    public int getChangingConfigurations()
    {
        return 0;
    }

    public Drawable newDrawable()
    {
        return new b(this);
    }

    public Drawable newDrawable(Resources resources)
    {
        return newDrawable();
    }

    public tantState(c c1, byte abyte0[], Context context, g g1, int j, int k, com.bumptech.glide.b. , 
            com.bumptech.glide.load.engine.a.c c2, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            throw new NullPointerException("The first frame of the GIF must not be null");
        } else
        {
            a = c1;
            b = abyte0;
            h = c2;
            i = bitmap;
            c = context.getApplicationContext();
            d = g1;
            e = j;
            f = k;
            g = ;
            return;
        }
    }
}
