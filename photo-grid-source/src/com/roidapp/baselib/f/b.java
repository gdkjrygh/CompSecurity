// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import com.roidapp.baselib.c.p;
import com.roidapp.baselib.e;

// Referenced classes of package com.roidapp.baselib.f:
//            c

public final class b
{

    private static b M;
    private int A;
    private int B;
    private float C;
    private float D;
    private int E;
    private int F;
    private int G;
    private float H;
    private int I;
    private int J;
    private String K;
    private boolean L;
    private boolean N;
    PointF a[] = {
        new PointF(0.0F, 0.0F), new PointF(100F, 0.0F), new PointF(100F, 100F), new PointF(0.0F, 100F)
    };
    PointF b;
    private int c;
    private int d;
    private Context e;
    private int f;
    private int g;
    private int h;
    private int i;
    private Bitmap j;
    private Bitmap k;
    private Bitmap l;
    private Bitmap m;
    private int n;
    private int o;
    private int p;
    private final int q = 1280;
    private float r;
    private boolean s;
    private boolean t;
    private float u;
    private float v;
    private float w;
    private final float x = 0.5F;
    private int y;
    private float z;

    public b()
    {
        f = -1;
        s = false;
        t = false;
        y = 0;
        z = 0.0F;
        A = 100;
        B = 100;
        C = 0.0F;
        D = 0.0F;
        E = 1;
        F = 1;
        G = 0;
        H = 1.0F;
        I = 0;
        J = 0;
        L = false;
        b = new PointF(50F, 50F);
    }

    public static b a()
    {
        if (M == null)
        {
            M = new b();
        }
        return M;
    }

    private transient void a(int i1, int j1, int ai[])
    {
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        flag = true;
        if (e == null)
        {
            return;
        }
        try
        {
            options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = false;
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            ai.printStackTrace();
            a(l);
            a(k);
            a(j);
            a(m);
            throw new OutOfMemoryError("save create bg oom");
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_191;
        }
        com.roidapp.baselib.f.c.a();
        l = com.roidapp.baselib.f.c.a(e.getResources(), com.roidapp.baselib.c.p.a().a[i1], options, null);
        com.roidapp.baselib.f.c.a();
        j = com.roidapp.baselib.f.c.a(e.getResources(), com.roidapp.baselib.c.p.a().c[i1], options, null);
        com.roidapp.baselib.f.c.a();
        k = com.roidapp.baselib.f.c.a(e.getResources(), com.roidapp.baselib.c.p.a().b[i1], options, null);
_L1:
        if (l == null || j == null || k == null)
        {
            throw new OutOfMemoryError("mBgBase==null  throw oom");
        }
        break MISSING_BLOCK_LABEL_266;
        com.roidapp.baselib.f.c.a();
        l = com.roidapp.baselib.f.c.a(e.getResources(), e.bl, options, null);
        com.roidapp.baselib.f.c.a();
        j = com.roidapp.baselib.f.c.a(e.getResources(), e.bh, options, null);
        com.roidapp.baselib.f.c.a();
        k = com.roidapp.baselib.f.c.a(e.getResources(), e.bj, options, null);
          goto _L1
        if (j1 == -20) goto _L3; else goto _L2
_L2:
        com.roidapp.baselib.f.c.a();
        m = com.roidapp.baselib.f.c.a(l.getWidth(), l.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        if (m == null)
        {
            throw new OutOfMemoryError("mBgBase==null-1 throw oom");
        }
        ai = new Canvas(m);
        ai.drawColor(j1);
        ai.save();
_L7:
        if (m == null)
        {
            com.roidapp.baselib.f.c.a();
            m = com.roidapp.baselib.f.c.a(e.getResources(), com.roidapp.baselib.c.p.a().j[2][0], options, m);
        }
        if (m == null)
        {
            throw new OutOfMemoryError("mBgBase==null-2  throw oom");
        }
          goto _L4
_L3:
        if (ai.length != 1) goto _L6; else goto _L5
_L5:
        com.roidapp.baselib.f.c.a();
        m = com.roidapp.baselib.f.c.a(e.getResources(), com.roidapp.baselib.c.p.a().d[ai[0]], options, null);
          goto _L7
_L6:
        if (ai[0] < 2)
        {
            break MISSING_BLOCK_LABEL_780;
        }
        if (ai[0] > com.roidapp.baselib.c.p.a().j.length - 1)
        {
            break MISSING_BLOCK_LABEL_780;
        }
_L18:
        com.roidapp.baselib.f.c.a();
        m = com.roidapp.baselib.f.c.a(e.getResources(), com.roidapp.baselib.c.p.a().j[ai[0]][ai[1]], options, null);
          goto _L7
_L4:
        com.roidapp.baselib.f.c.a();
        m = com.roidapp.baselib.f.c.a(m, r);
        if (m == null)
        {
            throw new OutOfMemoryError("mBgBase==null-3  throw oom");
        }
        if (c % m.getWidth() == 0) goto _L9; else goto _L8
_L8:
        i1 = c / m.getWidth() + 1;
_L14:
        o = i1;
        if (d % m.getHeight() == 0) goto _L11; else goto _L10
_L10:
        i1 = d / m.getHeight() + 1;
_L15:
        p = i1;
        float f1 = (float)c / (float)l.getWidth();
        i1 = Math.round((float)d / f1);
        if ((i1 - l.getHeight() - j.getHeight()) % k.getHeight() == 0) goto _L13; else goto _L12
_L12:
        i1 = (i1 - l.getHeight() - j.getHeight()) / k.getHeight() + 1;
_L16:
        n = i1;
        if (n != 0)
        {
            break MISSING_BLOCK_LABEL_772;
        }
        i1 = ((flag) ? 1 : 0);
_L17:
        n = i1;
        return;
_L9:
        i1 = c / m.getWidth();
          goto _L14
_L11:
        i1 = d / m.getHeight();
          goto _L15
_L13:
        i1 = (i1 - l.getHeight() - j.getHeight()) / k.getHeight();
          goto _L16
        i1 = n;
          goto _L17
        ai[0] = 2;
        ai[1] = 0;
          goto _L18
    }

    private static void a(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    public static void b()
    {
        M = null;
        com.roidapp.baselib.f.c.b();
    }

    public final void a(float f1)
    {
        z = f1;
    }

    public final void a(float f1, float f2, float f3)
    {
        v = f1;
        u = f2;
        w = f3;
        r = (float)(int)((float)e.getResources().getDisplayMetrics().widthPixels * f3) / (1280F * e.getResources().getDisplayMetrics().density);
    }

    public final void a(int i1, int j1)
    {
        c = i1;
        d = j1;
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        f = i1;
        g = j1;
        h = k1;
        i = l1;
    }

    public final void a(Context context)
    {
        e = context;
    }

    public final void a(Canvas canvas)
    {
        boolean flag = false;
        a(f, g, new int[] {
            h, i
        });
        if (l == null || j == null || k == null)
        {
            return;
        }
        canvas.save();
        Paint paint = new Paint();
        paint.setColor(0);
        canvas.drawRect(0.0F, 0.0F, c, d, paint);
        if (f == -1)
        {
            a(1, 0, new int[0]);
            f = 1;
        }
        Object obj = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.MULTIPLY);
        paint.setColor(-1);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 6));
        for (int i1 = 0; i1 < p; i1++)
        {
            for (int k1 = 0; k1 < o; k1++)
            {
                canvas.drawBitmap(m, m.getWidth() * k1, m.getHeight() * i1, null);
            }

        }

        a(m);
        paint.setXfermode(((android.graphics.Xfermode) (obj)));
        obj = new RectF(0.0F, 0.0F, l.getWidth(), l.getHeight() + n * k.getHeight() + j.getHeight());
        RectF rectf = new RectF(0.0F, 0.0F, c, d);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(((RectF) (obj)), rectf, android.graphics.Matrix.ScaleToFit.FILL);
        canvas.concat(matrix);
        canvas.drawBitmap(l, 0.0F, 0.0F, paint);
        a(l);
        for (int j1 = ((flag) ? 1 : 0); j1 < n; j1++)
        {
            canvas.drawBitmap(k, 0.0F, l.getHeight() + k.getHeight() * j1, paint);
        }

        a(k);
        canvas.drawBitmap(j, 0.0F, l.getHeight() + n * k.getHeight(), paint);
        a(j);
        canvas.setMatrix(new Matrix());
        if (s)
        {
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DARKEN));
            canvas.drawRect(0.0F, 0.0F, c, d, paint);
        }
        paint.setXfermode(null);
        canvas.restore();
    }

    public final void a(String s1)
    {
        K = s1;
    }

    public final void a(boolean flag)
    {
        L = flag;
    }

    public final void b(boolean flag)
    {
        N = flag;
    }

    public final String c()
    {
        return K;
    }
}
