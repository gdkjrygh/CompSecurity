// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.d;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;

// Referenced classes of package com.facebook.ui.images.d:
//            g, n

public class m
    implements g
{

    private final int a;
    private final int b;
    private final n c;

    public m(int i, int j)
    {
        this(i, j, n.DOWNSCALE);
    }

    public m(int i, int j, n n1)
    {
        a = i;
        b = j;
        c = n1;
    }

    private float a(int i, int j)
    {
        float f;
        boolean flag;
        if (c == n.DOWNSCALE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = -1F;
        if (i > j && a != -1)
        {
            if (flag ? i > a : i < a)
            {
                f = (float)a / (float)i;
            }
        } else
        if (flag ? j > b : j < b)
        {
            return (float)b / (float)j;
        }
        return f;
    }

    public Bitmap a(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        float f = a(i, j);
        Object obj = bitmap;
        if (f != -1F)
        {
            obj = new Matrix();
            ((Matrix) (obj)).postScale(f, f);
            obj = Bitmap.createBitmap(bitmap, 0, 0, i, j, ((Matrix) (obj)), true);
        }
        return ((Bitmap) (obj));
    }

    public void a(Rect rect, Rect rect1)
    {
        float f = a(rect.width(), rect.height());
        if (f != -1F)
        {
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            RectF rectf = new RectF();
            matrix.mapRect(rectf, new RectF(rect.left, rect.top, rect.right, rect.bottom));
            rect1.set(Math.round(rectf.left), Math.round(rectf.top), Math.round(rectf.right), Math.round(rectf.bottom));
            return;
        } else
        {
            rect1.set(rect);
            return;
        }
    }
}
