// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.a.j;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            g

public abstract class c
{
    public class a extends Exception
    {

        final c a;

        public a(Throwable throwable)
        {
            a = c.this;
            super(throwable);
        }
    }


    protected final g a;
    private final Bitmap b = a();

    public c(g g1)
    {
        a = g1;
    }

    private Bitmap a()
    {
        float f;
        Object obj;
        if (a.j == 2)
        {
            int i;
            if (a.d == a.e)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                f = (float)a.b / 1024F;
            } else
            {
                f = (float)a.e / (float)a.d;
                f = (float)(int)((float)a.c / f) / 1024F;
            }
            obj = k.a().getResources();
            if (i != 0)
            {
                i = 0x7f0202d9;
            } else
            {
                i = 0x7f0202d8;
            }
            obj = BitmapFactory.decodeResource(((android.content.res.Resources) (obj)), i);
        } else
        {
            f = (float)a.b / 1024F;
            obj = BitmapFactory.decodeResource(k.a().getResources(), j.a());
        }
        return Bitmap.createScaledBitmap(((Bitmap) (obj)), (int)((float)((Bitmap) (obj)).getWidth() * f), (int)(f * (float)((Bitmap) (obj)).getHeight()), false);
    }

    private Bitmap b(Bitmap bitmap)
    {
        Canvas canvas = new Canvas(bitmap);
        float f = (float)a.e / (float)a.d;
        int l = a.c;
        int i = (int)((float)l / f);
        l = Math.round((l - i) / 2);
        int i1 = bitmap.getHeight();
        int j1 = b.getHeight();
        canvas.drawBitmap(b, i + l, i1 - j1, null);
        return bitmap;
    }

    protected final Bitmap a(Bitmap bitmap)
    {
        boolean flag;
        if (a.d == a.e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a.j == 2 && !flag)
        {
            return b(bitmap);
        } else
        {
            return j.a(bitmap, b);
        }
    }
}
