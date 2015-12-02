// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

final class chb extends cfe
{

    chb(cgh cgh1, cha cha1, cgr cgr, int i, int j, Drawable drawable, String s, 
            Object obj, int k)
    {
        super(cgh1, cha1, cgr, i, j, k, drawable, s, obj, false);
    }

    final void a()
    {
        cha cha1;
label0:
        {
            cha1 = (cha)d();
            if (cha1 != null)
            {
                if (g == 0)
                {
                    break label0;
                }
                a.c.getResources().getDrawable(g);
                cha1.a();
            }
            return;
        }
        cha1.a();
    }

    final void a(Bitmap bitmap, cgl cgl)
    {
        if (bitmap == null)
        {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[] {
                this
            }));
        }
        cgl = (cha)d();
        if (cgl != null)
        {
            cgl.a(bitmap);
            if (bitmap.isRecycled())
            {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }
}
