// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.imagelib.crop:
//            h, d, a, CropImageView

final class e
    implements Runnable
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void run()
    {
        Object obj = a;
        h h1 = new h(com.roidapp.imagelib.crop.a.b(((d) (obj)).c));
        int j1 = com.roidapp.imagelib.crop.a.a(((d) (obj)).c).getWidth();
        int i1 = com.roidapp.imagelib.crop.a.a(((d) (obj)).c).getHeight();
        Rect rect = new Rect(0, 0, j1, i1);
        int j = Math.min(j1, i1);
        if (com.roidapp.imagelib.crop.a.d(((d) (obj)).c))
        {
            if (com.roidapp.imagelib.crop.a.e(((d) (obj)).c))
            {
                int i = (int)((float)j1 / com.roidapp.imagelib.crop.a.f(((d) (obj)).c));
                RectF rectf;
                android.graphics.Matrix matrix;
                int k;
                int l;
                boolean flag;
                boolean flag1;
                if (i > i1)
                {
                    k = (int)((float)i1 * com.roidapp.imagelib.crop.a.f(((d) (obj)).c));
                    i = i1;
                } else
                {
                    k = j1;
                }
            } else
            {
                k = (int)((float)i1 * com.roidapp.imagelib.crop.a.f(((d) (obj)).c));
                if (k > j1)
                {
                    i = (int)((float)j1 / com.roidapp.imagelib.crop.a.f(((d) (obj)).c));
                    k = j1;
                } else
                {
                    i = i1;
                }
            }
        } else
        {
            if (com.roidapp.imagelib.crop.a.g(((d) (obj)).c) != 0 && com.roidapp.imagelib.crop.a.h(((d) (obj)).c) != 0)
            {
                if (com.roidapp.imagelib.crop.a.g(((d) (obj)).c) > com.roidapp.imagelib.crop.a.h(((d) (obj)).c))
                {
                    j = (com.roidapp.imagelib.crop.a.h(((d) (obj)).c) * j1) / com.roidapp.imagelib.crop.a.g(((d) (obj)).c);
                    if (j > i1)
                    {
                        l = (com.roidapp.imagelib.crop.a.g(((d) (obj)).c) * i1) / com.roidapp.imagelib.crop.a.h(((d) (obj)).c);
                        j = i1;
                    } else
                    {
                        l = j1;
                    }
                } else
                {
                    l = (com.roidapp.imagelib.crop.a.g(((d) (obj)).c) * i1) / com.roidapp.imagelib.crop.a.h(((d) (obj)).c);
                    if (l > j1)
                    {
                        j = (com.roidapp.imagelib.crop.a.h(((d) (obj)).c) * j1) / com.roidapp.imagelib.crop.a.g(((d) (obj)).c);
                        l = j1;
                    } else
                    {
                        j = i1;
                    }
                }
            } else
            {
                l = j;
            }
            i = j;
            k = l;
            if (com.roidapp.imagelib.crop.a.g(((d) (obj)).c) == 0)
            {
                i = j;
                k = l;
                if (com.roidapp.imagelib.crop.a.h(((d) (obj)).c) == 0)
                {
                    i = (l * 4) / 5;
                    k = i;
                }
            }
        }
        j = (j1 - k) / 2;
        l = (i1 - i) / 2;
        rectf = new RectF(j, l, k + j, i + l);
        com.roidapp.imagelib.crop.a.a(((d) (obj)).c, new Rect((int)rectf.left, (int)rectf.top, (int)rectf.right, (int)rectf.bottom));
        if (com.roidapp.imagelib.crop.a.d(((d) (obj)).c))
        {
            matrix = ((d) (obj)).b;
            flag1 = com.roidapp.imagelib.crop.a.i(((d) (obj)).c);
            if (!com.roidapp.imagelib.crop.a.j(((d) (obj)).c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h1.a(matrix, rect, rectf, flag1, flag);
        } else
        {
            matrix = ((d) (obj)).b;
            flag1 = com.roidapp.imagelib.crop.a.i(((d) (obj)).c);
            if (com.roidapp.imagelib.crop.a.g(((d) (obj)).c) != 0 && com.roidapp.imagelib.crop.a.h(((d) (obj)).c) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            h1.a(matrix, rect, rectf, flag1, flag);
        }
        obj = com.roidapp.imagelib.crop.a.b(((d) (obj)).c);
        ((CropImageView) (obj)).a.add(h1);
        ((CropImageView) (obj)).invalidate();
        com.roidapp.imagelib.crop.a.b(a.c).invalidate();
        if (com.roidapp.imagelib.crop.a.b(a.c).a.size() == 1)
        {
            a.c.d = (h)com.roidapp.imagelib.crop.a.b(a.c).a.get(0);
            a.c.d.b = true;
        }
    }
}
