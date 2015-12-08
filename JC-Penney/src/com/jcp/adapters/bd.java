// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.squareup.a.bi;

// Referenced classes of package com.jcp.adapters:
//            LocalAdsCatalogAdapter

class bd
    implements bi
{

    final LocalAdsCatalogAdapter a;

    bd(LocalAdsCatalogAdapter localadscatalogadapter)
    {
        a = localadscatalogadapter;
        super();
    }

    public Bitmap a(Bitmap bitmap)
    {
        float f1 = LocalAdsCatalogAdapter.a(a, 186F, LocalAdsCatalogAdapter.a(a));
        float f = LocalAdsCatalogAdapter.a(a, 172F, LocalAdsCatalogAdapter.a(a));
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        f1 /= i;
        f /= j;
        Object obj = new Matrix();
        ((Matrix) (obj)).postScale(f1, f);
        obj = Bitmap.createBitmap(bitmap, 0, 0, i, j, ((Matrix) (obj)), false);
        if (obj != bitmap)
        {
            bitmap.recycle();
        }
        return ((Bitmap) (obj));
    }

    public String a()
    {
        return "transformation desiredWidth";
    }
}
