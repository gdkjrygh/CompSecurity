// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.squareup.picasso:
//            a, x, Picasso, r

final class y extends a
{

    y(Picasso picasso, x x1, r r, int i, int j, Drawable drawable, String s, 
            Object obj, int k)
    {
        super(picasso, x1, r, i, j, k, drawable, s, obj, false);
    }

    final void a()
    {
        x x1;
label0:
        {
            x1 = (x)c();
            if (x1 != null)
            {
                if (g == 0)
                {
                    break label0;
                }
                x1.onBitmapFailed(a.e.getResources().getDrawable(g));
            }
            return;
        }
        x1.onBitmapFailed(h);
    }

    final void a(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
    {
        if (bitmap == null)
        {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] {
                this
            }));
        }
        x x1 = (x)c();
        if (x1 != null)
        {
            x1.onBitmapLoaded(bitmap, loadedfrom);
            if (bitmap.isRecycled())
            {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }
}
