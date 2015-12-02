// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

// Referenced classes of package com.facebook.ui.images.d:
//            g, b

public class e
    implements g
{

    private final b a;
    private final int b;
    private final int c;

    public e(b b1, int i, int j)
    {
        a = b1;
        b = i;
        c = j;
    }

    public Bitmap a(Bitmap bitmap)
    {
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        a.a(rect, b, c, rect);
        Rect rect1 = new Rect(0, 0, rect.width(), rect.height());
        Object obj;
        if (bitmap.getConfig() != null)
        {
            obj = bitmap.getConfig();
        } else
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        }
        obj = Bitmap.createBitmap(rect1.width(), rect1.height(), ((android.graphics.Bitmap.Config) (obj)));
        (new Canvas(((Bitmap) (obj)))).drawBitmap(bitmap, rect, rect1, null);
        return ((Bitmap) (obj));
    }

    public void a(Rect rect, Rect rect1)
    {
        a.a(rect, b, c, rect1);
    }
}
