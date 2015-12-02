// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

// Referenced classes of package com.facebook.ui.images.d:
//            g, f

public class a
    implements g
{

    private final f a;

    public a(f f1)
    {
        a = f1;
    }

    public Bitmap a(Bitmap bitmap)
    {
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        a.a(rect, rect);
        int i = rect.width();
        int j = rect.height();
        if (j <= 0 || i <= 0)
        {
            return bitmap;
        }
        Object obj;
        if (bitmap.getConfig() != null)
        {
            obj = bitmap.getConfig();
        } else
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        }
        obj = Bitmap.createBitmap(i, j, ((android.graphics.Bitmap.Config) (obj)));
        (new Canvas(((Bitmap) (obj)))).drawBitmap(bitmap, rect, new Rect(0, 0, i, j), null);
        return ((Bitmap) (obj));
    }

    public void a(Rect rect, Rect rect1)
    {
        a.a(rect, rect1);
    }
}
