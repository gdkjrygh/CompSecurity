// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;

final class gwj extends guz
{

    gwj(Picasso picasso, gwi gwi1, gvz gvz, Drawable drawable, String s, Object obj, int i)
    {
        super(picasso, gwi1, gvz, i, drawable, s, obj, false);
    }

    final void a()
    {
        gwi gwi1;
label0:
        {
            gwi1 = (gwi)c();
            if (gwi1 != null)
            {
                if (e == 0)
                {
                    break label0;
                }
                gwi1.a(a.d.getResources().getDrawable(e));
            }
            return;
        }
        gwi1.a(f);
    }

    final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        if (bitmap == null)
        {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] {
                this
            }));
        }
        gwi gwi1 = (gwi)c();
        if (gwi1 != null)
        {
            gwi1.a(bitmap, loadedfrom);
            if (bitmap.isRecycled())
            {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }
}
