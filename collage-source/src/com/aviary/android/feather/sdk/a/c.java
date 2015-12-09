// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import com.aviary.android.feather.sdk.utils.e;
import it.sephiroth.android.library.imagezoom.a.a;

public class c extends a
{

    private Rect e;
    private Bitmap f;
    private Bitmap g;
    private Bitmap h;
    private Bitmap i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;

    public c(Resources resources, Bitmap bitmap, int i1, int j1, int k1, int l1, int i2, 
            int j2)
    {
        super(bitmap);
        e = new Rect();
        b(i1, j1, k1, l1, i2, j2);
    }

    public static Bitmap a(Bitmap bitmap, int i1, int j1, android.graphics.PorterDuff.Mode mode, boolean flag, Paint paint)
    {
        int k1 = bitmap.getWidth();
        int l1 = bitmap.getHeight();
        Object obj1 = bitmap.getConfig();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = android.graphics.Bitmap.Config.ARGB_8888;
        }
        obj = Bitmap.createBitmap(k1, l1, ((android.graphics.Bitmap.Config) (obj)));
        obj1 = new Canvas(((Bitmap) (obj)));
        Bitmap bitmap1 = bitmap.extractAlpha();
        ((Canvas) (obj1)).drawBitmap(bitmap, 0.0F, 0.0F, paint);
        bitmap = new Paint();
        bitmap.setXfermode(new PorterDuffXfermode(mode));
        bitmap.setColor(j1);
        ((Canvas) (obj1)).drawBitmap(bitmap1, 0.0F, 0.0F, bitmap);
        if (flag)
        {
            bitmap.setMaskFilter(new BlurMaskFilter(i1, android.graphics.BlurMaskFilter.Blur.NORMAL));
            bitmap.setAlpha(100);
            ((Canvas) (obj1)).drawBitmap(bitmap1, 0.0F, 0.0F, bitmap);
        }
        return ((Bitmap) (obj));
    }

    private void b(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        n = j1;
        m = i1;
        o = k1;
        p = l1;
        q = j2;
        r = i2;
        i = a();
        c();
    }

    private void c()
    {
        if (g != null)
        {
            g.recycle();
            g = null;
        }
        if (f != null)
        {
            f.recycle();
            f = null;
        }
        if (h != null)
        {
            h.recycle();
            h = null;
        }
    }

    public void a(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        b(i1, j1, k1, l1, i2, j2);
        setState(getState());
    }

    public void a(Bitmap bitmap)
    {
        super.a(bitmap);
        i = bitmap;
        c();
    }

    public void draw(Canvas canvas)
    {
        copyBounds(e);
        canvas.drawBitmap(i, null, e, b());
    }

    public boolean isStateful()
    {
        return true;
    }

    protected boolean onStateChange(int ai[])
    {
        boolean flag = false;
        boolean flag2 = k;
        boolean flag3 = j;
        boolean flag1 = l;
        k = false;
        j = false;
        l = false;
        int i1 = 0;
        while (i1 < ai.length) 
        {
            if (ai[i1] == 0x10100a7)
            {
                j = true;
            } else
            if (ai[i1] == 0x10100a0)
            {
                k = true;
            } else
            if (ai[i1] == 0x10100a1)
            {
                l = true;
            }
            i1++;
        }
        if (j && com.aviary.android.feather.sdk.utils.e.a(r, 2))
        {
            if (f == null)
            {
                f = a(a(), p, m, android.graphics.PorterDuff.Mode.DARKEN, com.aviary.android.feather.sdk.utils.e.a(q, 2), b());
            }
            i = f;
        } else
        if (k && com.aviary.android.feather.sdk.utils.e.a(r, 4))
        {
            if (g == null)
            {
                g = a(a(), p, n, android.graphics.PorterDuff.Mode.DARKEN, com.aviary.android.feather.sdk.utils.e.a(q, 4), b());
            }
            i = g;
        } else
        if (l && com.aviary.android.feather.sdk.utils.e.a(r, 8))
        {
            if (h == null)
            {
                h = a(a(), p, o, android.graphics.PorterDuff.Mode.DARKEN, com.aviary.android.feather.sdk.utils.e.a(q, 8), b());
            }
            i = h;
        } else
        {
            i = a();
        }
        if (flag2 != k || flag3 != j || flag1 != l)
        {
            flag = true;
        }
        return flag;
    }
}
