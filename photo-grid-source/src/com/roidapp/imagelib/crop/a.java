// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import com.roidapp.imagelib.ImageLibrary;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.imagelib.crop:
//            d, CropImageView, h, f, 
//            b

public final class a
{

    public boolean a;
    public boolean b;
    public boolean c;
    public h d;
    Runnable e;
    private final String f = "CropImage";
    private Context g;
    private Handler h;
    private CropImageView i;
    private Bitmap j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private float p;
    private boolean q;
    private Rect r;
    private boolean s;

    public a(Context context, CropImageView cropimageview)
    {
        h = new Handler();
        m = false;
        n = false;
        o = false;
        q = false;
        s = false;
        e = new d(this);
        g = context;
        i = cropimageview;
        i.a(this);
    }

    static Bitmap a(a a1)
    {
        return a1.j;
    }

    static Bitmap a(a a1, Bitmap bitmap)
    {
        a1.j = bitmap;
        return bitmap;
    }

    static Rect a(a a1, Rect rect)
    {
        a1.r = rect;
        return rect;
    }

    static CropImageView b(a a1)
    {
        return a1.i;
    }

    static Handler c(a a1)
    {
        return a1.h;
    }

    static boolean d(a a1)
    {
        return a1.q;
    }

    static boolean e(a a1)
    {
        return a1.n;
    }

    static float f(a a1)
    {
        return a1.p;
    }

    static int g(a a1)
    {
        return a1.k;
    }

    static int h(a a1)
    {
        return a1.l;
    }

    static boolean i(a a1)
    {
        return a1.s;
    }

    static boolean j(a a1)
    {
        return a1.o;
    }

    static boolean k(a a1)
    {
        a1.m = false;
        return false;
    }

    public final void a()
    {
        s = true;
    }

    public final void a(float f1)
    {
        boolean flag = false;
        ImageLibrary.a().a("CropImage/changeAspect");
        if (d == null || j == null || j.isRecycled())
        {
            return;
        }
        p = f1;
        int l1 = j.getWidth();
        int k1 = j.getHeight();
        Rect rect = new Rect(0, 0, l1, k1);
        Math.min(l1, k1);
        if (n)
        {
            int i1 = (int)((float)l1 / p);
            RectF rectf;
            android.graphics.Matrix matrix;
            h h1;
            int j1;
            boolean flag1;
            if (i1 > k1)
            {
                j1 = (int)((float)k1 * p);
                i1 = k1;
            } else
            {
                j1 = l1;
            }
        } else
        {
            j1 = (int)((float)k1 * p);
            if (j1 > l1)
            {
                i1 = (int)((float)l1 / p);
                j1 = l1;
            } else
            {
                i1 = k1;
            }
        }
        l1 = (l1 - j1) / 2;
        k1 = (k1 - i1) / 2;
        rectf = new RectF(l1, k1, j1 + l1, i1 + k1);
        r = new Rect((int)rectf.left, (int)rectf.top, (int)rectf.right, (int)rectf.bottom);
        matrix = i.getImageMatrix();
        i.a(j);
        h1 = d;
        flag1 = s;
        if (!o)
        {
            flag = true;
        }
        h1.a(matrix, rect, rectf, flag1, flag);
        i.invalidate();
        d.b();
        d.b = true;
    }

    public final void a(int i1, int j1)
    {
        ImageLibrary.a().a("CropImage/changeAspect");
        if (d == null || j == null || j.isRecycled())
        {
            return;
        }
        k = i1;
        l = j1;
        int l1 = j.getWidth();
        int k1 = j.getHeight();
        Rect rect = new Rect(0, 0, l1, k1);
        i1 = Math.min(l1, k1);
        if (k != 0 && l != 0)
        {
            if (k > l)
            {
                i1 = (l * l1) / k;
                RectF rectf;
                android.graphics.Matrix matrix;
                h h1;
                int i2;
                int j2;
                boolean flag;
                boolean flag1;
                if (i1 > k1)
                {
                    j1 = (k * k1) / l;
                    i1 = k1;
                } else
                {
                    j1 = l1;
                }
            } else
            {
                j1 = (k * k1) / l;
                if (j1 > l1)
                {
                    i1 = (l * l1) / k;
                    j1 = l1;
                } else
                {
                    i1 = k1;
                }
            }
        } else
        {
            j1 = i1;
        }
        i2 = i1;
        j2 = j1;
        if (k == 0)
        {
            i2 = i1;
            j2 = j1;
            if (l == 0)
            {
                i2 = (j1 * 4) / 5;
                j2 = i2;
            }
        }
        if (k == -1 && l == -1)
        {
            i2 = k1;
            i1 = l1;
        } else
        {
            i1 = j2;
        }
        j1 = (l1 - i1) / 2;
        k1 = (k1 - i2) / 2;
        rectf = new RectF(j1, k1, j1 + i1, i2 + k1);
        r = new Rect((int)rectf.left, (int)rectf.top, (int)rectf.right, (int)rectf.bottom);
        matrix = i.getImageMatrix();
        i.a(j);
        h1 = d;
        flag1 = s;
        if (k != 0 && l != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h1.a(matrix, rect, rectf, flag1, flag);
        i.invalidate();
        d.b();
        d.b = true;
    }

    public final void a(Bitmap bitmap)
    {
        if (j != null)
        {
            j.recycle();
            j = null;
        }
        j = bitmap;
    }

    public final void a(boolean flag, float f1, boolean flag1)
    {
        n = flag;
        p = f1;
        o = flag1;
        q = true;
    }

    public final void b()
    {
        i.a.clear();
        d = null;
        i.invalidate();
        b = false;
    }

    public final void b(int i1, int j1)
    {
        k = i1;
        l = j1;
    }

    public final void b(Bitmap bitmap)
    {
        ImageLibrary.a().a("CropImage/crop");
        if (!m && bitmap != null)
        {
            m = true;
            j = bitmap;
            if (!((Activity)g).isFinishing())
            {
                (new Thread(new f(this, new b(this), h))).start();
                return;
            }
        }
    }

    public final Bitmap c(Bitmap bitmap)
    {
        ImageLibrary.a().a("CropImage/cropAndSave");
        ImageLibrary.a().a("CropImage/onSaveClicked");
        if (!b) goto _L2; else goto _L1
_L1:
        Bitmap bitmap1 = bitmap;
_L4:
        i.a.clear();
        return bitmap1;
_L2:
        bitmap1 = bitmap;
        if (d == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        long l1 = System.currentTimeMillis();
        b = true;
        Rect rect = d.a();
        int i1 = rect.width();
        int j1 = rect.height();
        if (i1 <= 0)
        {
            bitmap1 = bitmap;
            if (j1 <= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        bitmap1 = Bitmap.createBitmap(i1, j1, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, rect, new Rect(0, 0, i1, j1), null);
        bitmap.recycle();
        long l2 = System.currentTimeMillis();
        (new StringBuilder("=============resized crop time:")).append(l2 - l1).append("=============");
        if (j != null && !j.isRecycled())
        {
            j.recycle();
            j = null;
        }
        System.gc();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean c()
    {
        return d.a().equals(r);
    }
}
