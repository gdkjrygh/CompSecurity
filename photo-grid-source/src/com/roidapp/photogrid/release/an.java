// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import com.roidapp.baselib.a.a;
import com.roidapp.baselib.c.p;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bl;

// Referenced classes of package com.roidapp.photogrid.release:
//            rf, ih

public final class an extends View
{

    private boolean A;
    private Paint B;
    private Paint C;
    public Context a;
    public String b;
    public boolean c;
    private int d;
    private int e;
    private int f;
    private Bitmap g;
    private Bitmap h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private int l;
    private int m;
    private int n;
    private final int o;
    private float p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private PorterDuffXfermode x;
    private PorterDuffXfermode y;
    private PaintFlagsDrawFilter z;

    public an(Context context, int i1, int j1)
    {
        super(context);
        d = 0;
        o = 1280;
        q = false;
        u = false;
        a = null;
        x = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DARKEN);
        y = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.MULTIPLY);
        z = new PaintFlagsDrawFilter(0, 3);
        C = new Paint();
        if (az.q != 1 && android.os.Build.VERSION.SDK_INT > 10)
        {
            bl.a(this);
        }
        p = (float)context.getResources().getDisplayMetrics().widthPixels / (1280F * context.getResources().getDisplayMetrics().density);
        e = i1;
        f = j1;
        a = context;
    }

    public an(Context context, int i1, int j1, String s1)
    {
        super(context);
        d = 0;
        o = 1280;
        q = false;
        u = false;
        a = null;
        x = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DARKEN);
        y = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.MULTIPLY);
        z = new PaintFlagsDrawFilter(0, 3);
        C = new Paint();
        p = (float)context.getResources().getDisplayMetrics().widthPixels / (1280F * context.getResources().getDisplayMetrics().density);
        e = i1;
        f = j1;
        a = context;
        com.roidapp.baselib.a.a.a();
        j = com.roidapp.baselib.a.a.a(s1, i1, j1);
    }

    private transient void a(int i1, int j1, int ai[])
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        Bitmap bitmap = null;
        this;
        JVM INSTR monitorenter ;
        android.graphics.BitmapFactory.Options options;
        a();
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (i == null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        bitmap4 = i;
        bitmap3 = h;
        bitmap2 = g;
        bitmap = j;
_L42:
        options.inJustDecodeBounds = false;
        if ((double)a.getResources().getDisplayMetrics().density >= 1.0D) goto _L4; else goto _L3
_L3:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        com.roidapp.photogrid.release.rf.a();
        i = com.roidapp.photogrid.release.rf.a(a, com.roidapp.baselib.c.p.a().a[i1], options, i);
        com.roidapp.photogrid.release.rf.a();
        g = com.roidapp.photogrid.release.rf.a(a, com.roidapp.baselib.c.p.a().c[i1], options, g);
        com.roidapp.photogrid.release.rf.a();
        h = com.roidapp.photogrid.release.rf.a(a, com.roidapp.baselib.c.p.a().b[i1], options, h);
_L8:
        if (i == null || g == null || h == null)
        {
            throw new OutOfMemoryError("bg create decodeBitmap null");
        }
          goto _L7
        ai;
        this;
        JVM INSTR monitorexit ;
        throw ai;
_L6:
        com.roidapp.photogrid.release.rf.a();
        i = com.roidapp.photogrid.release.rf.a(a, 0x7f0200b1, options, null);
        com.roidapp.photogrid.release.rf.a();
        g = com.roidapp.photogrid.release.rf.a(a, 0x7f0200ad, options, null);
        com.roidapp.photogrid.release.rf.a();
        h = com.roidapp.photogrid.release.rf.a(a, 0x7f0200af, options, null);
          goto _L8
_L4:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        com.roidapp.photogrid.release.rf.a();
        i = rf.b(a, com.roidapp.baselib.c.p.a().a[i1], e);
        com.roidapp.photogrid.release.rf.a();
        g = rf.b(a, com.roidapp.baselib.c.p.a().c[i1], e);
        com.roidapp.photogrid.release.rf.a();
        h = rf.b(a, com.roidapp.baselib.c.p.a().b[i1], e);
          goto _L8
        com.roidapp.photogrid.release.rf.a();
        i = rf.b(a, 0x7f0200b1, e);
        com.roidapp.photogrid.release.rf.a();
        g = rf.b(a, 0x7f0200ad, e);
        com.roidapp.photogrid.release.rf.a();
        h = rf.b(a, 0x7f0200af, e);
          goto _L8
_L7:
        if (j1 == -20) goto _L10; else goto _L9
_L9:
        com.roidapp.photogrid.release.rf.a();
        j = com.roidapp.photogrid.release.rf.a(i.getWidth(), i.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(j);
        canvas.drawColor(j1);
        canvas.save();
_L16:
        if (j != null) goto _L12; else goto _L11
_L11:
        System.gc();
        System.gc();
        if (j1 == -20) goto _L14; else goto _L13
_L13:
        com.roidapp.photogrid.release.rf.a();
        j = com.roidapp.photogrid.release.rf.a(i.getWidth(), i.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        ai = new Canvas(j);
        ai.drawColor(j1);
        ai.save();
_L12:
        if (j == null)
        {
            com.roidapp.photogrid.release.rf.a();
            j = com.roidapp.photogrid.release.rf.a(a, com.roidapp.baselib.c.p.a().j[4][4], options, j);
        }
        com.roidapp.photogrid.release.rf.a();
        ai = j;
        float f1 = p;
        j = com.roidapp.photogrid.release.rf.a(ai, f1, f1);
        if (i == null || g == null || h == null || j == null)
        {
            throw new OutOfMemoryError("bg create createBitmap null");
        }
          goto _L15
_L10:
        if (ai[0] < 2)
        {
            break MISSING_BLOCK_LABEL_1392;
        }
        if (ai[0] > com.roidapp.baselib.c.p.a().j.length - 1)
        {
            break MISSING_BLOCK_LABEL_1392;
        }
_L43:
        com.roidapp.photogrid.release.rf.a();
        j = com.roidapp.photogrid.release.rf.a(a, com.roidapp.baselib.c.p.a().j[ai[0]][ai[1]], options, j);
          goto _L16
_L14:
        com.roidapp.photogrid.release.rf.a();
        j = com.roidapp.photogrid.release.rf.a(a, com.roidapp.baselib.c.p.a().j[ai[0]][ai[1]], options, j);
          goto _L12
        ai;
        ai.printStackTrace();
        throw new OutOfMemoryError("bg create createBitmap null");
_L15:
        if (bitmap4 == null)
        {
            break MISSING_BLOCK_LABEL_802;
        }
        bitmap4.recycle();
        bitmap3.recycle();
        bitmap2.recycle();
        bitmap.recycle();
        if (e <= f) goto _L18; else goto _L17
_L17:
        if (e % j.getWidth() == 0) goto _L20; else goto _L19
_L19:
        i1 = e / j.getWidth() + 1;
_L27:
        m = i1;
        if (f % j.getHeight() == 0) goto _L22; else goto _L21
_L21:
        i1 = f / j.getHeight() + 1;
_L28:
        n = i1;
        float f2 = (float)f / (float)i.getWidth();
        i1 = Math.round((float)e / f2);
        if ((i1 - i.getHeight() - g.getHeight()) % h.getHeight() == 0) goto _L24; else goto _L23
_L23:
        i1 = (i1 - i.getHeight() - g.getHeight()) / h.getHeight() + 1;
_L29:
        l = i1;
        if (l != 0) goto _L26; else goto _L25
_L25:
        i1 = ((flag) ? 1 : 0);
_L30:
        l = i1;
        ai = i;
        Bitmap bitmap1 = h;
        bitmap2 = g;
        com.roidapp.photogrid.release.rf.a();
        i = com.roidapp.photogrid.release.rf.a(ai, -90);
        com.roidapp.photogrid.release.rf.a();
        h = com.roidapp.photogrid.release.rf.a(bitmap1, -90);
        com.roidapp.photogrid.release.rf.a();
        g = com.roidapp.photogrid.release.rf.a(bitmap2, -90);
        ai.recycle();
        bitmap1.recycle();
        bitmap2.recycle();
_L37:
        this;
        JVM INSTR monitorexit ;
        return;
_L20:
        i1 = e / j.getWidth();
          goto _L27
_L22:
        i1 = f / j.getHeight();
          goto _L28
_L24:
        i1 = (i1 - i.getHeight() - g.getHeight()) / h.getHeight();
          goto _L29
_L26:
        i1 = l;
          goto _L30
_L18:
        if (e % j.getWidth() == 0) goto _L32; else goto _L31
_L31:
        i1 = e / j.getWidth() + 1;
_L38:
        m = i1;
        if (f % j.getHeight() == 0) goto _L34; else goto _L33
_L33:
        i1 = f / j.getHeight() + 1;
_L39:
        n = i1;
        float f3 = (float)e / (float)i.getWidth();
        i1 = Math.round((float)f / f3);
        if ((i1 - i.getHeight() - g.getHeight()) % h.getHeight() == 0) goto _L36; else goto _L35
_L35:
        i1 = (i1 - i.getHeight() - g.getHeight()) / h.getHeight() + 1;
_L40:
        l = i1;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_1372;
        }
        i1 = ((flag1) ? 1 : 0);
_L41:
        l = i1;
          goto _L37
_L32:
        i1 = e / j.getWidth();
          goto _L38
_L34:
        i1 = f / j.getHeight();
          goto _L39
_L36:
        i1 = (i1 - i.getHeight() - g.getHeight()) / h.getHeight();
          goto _L40
        i1 = l;
          goto _L41
_L2:
        bitmap2 = null;
        bitmap3 = null;
        bitmap4 = null;
          goto _L42
        ai[0] = 2;
        ai[1] = 0;
          goto _L43
    }

    private void b(Canvas canvas)
    {
        boolean flag = false;
        if (!v) goto _L2; else goto _L1
_L1:
        if (j == null || j.isRecycled()) goto _L4; else goto _L3
_L3:
        float f1;
        float f2;
        Object obj;
        int i1;
        int j1;
        obj = new Matrix();
        i1 = j.getWidth();
        j1 = j.getHeight();
        f1 = (float)e / (float)i1;
        f2 = (float)f / (float)j1;
          goto _L5
_L2:
        C.reset();
        C.setColor(0);
        canvas.drawRect(0.0F, 0.0F, e, f, C);
        canvas.saveLayerAlpha(0.0F, 0.0F, e, f, 255, 12);
        if (d == -1)
        {
            r = 4;
            s = 4;
            d = 0;
            a(0, -20, new int[] {
                r, s
            });
        }
        C.setColor(-1);
        canvas.setDrawFilter(z);
        if (j == null)
        {
            a(d, t, new int[] {
                r, s
            });
        }
        j.setDensity(canvas.getDensity());
        if (w) goto _L7; else goto _L6
_L6:
        i1 = 0;
_L22:
        if (i1 >= n) goto _L9; else goto _L8
_L8:
        j1 = 0;
_L11:
        if (j1 >= m)
        {
            break; /* Loop/switch isn't completed */
        }
        canvas.drawBitmap(j, j.getWidth() * j1, j.getHeight() * i1, C);
        j1++;
        if (true) goto _L11; else goto _L10
_L7:
        if (k == null || k.isRecycled()) goto _L9; else goto _L12
_L12:
        obj = new Matrix();
        i1 = k.getWidth();
        j1 = k.getHeight();
        f1 = (float)e / (float)i1;
        f2 = (float)f / (float)j1;
        if (f1 <= f2)
        {
            f1 = f2;
        }
        ((Matrix) (obj)).postTranslate(e / 2 - i1 / 2, f / 2 - j1 / 2);
        ((Matrix) (obj)).postScale(f1, f1, e / 2, f / 2);
        canvas.drawBitmap(k, ((Matrix) (obj)), new Paint());
_L9:
        if (u) goto _L4; else goto _L13
_L13:
        i.setDensity(canvas.getDensity());
        h.setDensity(canvas.getDensity());
        g.setDensity(canvas.getDensity());
        C.setXfermode(y);
        canvas.save();
        if (e <= f) goto _L15; else goto _L14
_L14:
        obj = new Matrix();
        ((Matrix) (obj)).setRectToRect(new RectF(0.0F, 0.0F, i.getWidth() + l * h.getWidth() + g.getWidth(), i.getHeight()), new RectF(0.0F, 0.0F, e, f), android.graphics.Matrix.ScaleToFit.FILL);
        canvas.concat(((Matrix) (obj)));
        canvas.drawBitmap(i, 0.0F, 0.0F, C);
        i1 = ((flag) ? 1 : 0);
_L17:
        if (i1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        canvas.drawBitmap(h, i.getWidth() + h.getWidth() * i1, 0.0F, C);
        i1++;
        if (true) goto _L17; else goto _L16
_L16:
        canvas.drawBitmap(g, i.getWidth() + l * h.getWidth(), 0.0F, C);
_L20:
        canvas.restore();
        if (q)
        {
            C.setXfermode(x);
            canvas.drawRect(0.0F, 0.0F, e, f, C);
            return;
        }
          goto _L4
_L5:
        RectF rectf;
        Matrix matrix;
        if (f1 <= f2)
        {
            f1 = f2;
        }
        try
        {
            ((Matrix) (obj)).postTranslate(e / 2 - i1 / 2, f / 2 - j1 / 2);
            ((Matrix) (obj)).postScale(f1, f1, e / 2, f / 2);
            canvas.drawBitmap(j, ((Matrix) (obj)), new Paint());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            canvas.printStackTrace();
        }
        return;
_L15:
        obj = new RectF(0.0F, 0.0F, i.getWidth(), i.getHeight() + l * h.getHeight() + g.getHeight());
        rectf = new RectF(0.0F, 0.0F, e, f);
        matrix = new Matrix();
        matrix.setRectToRect(((RectF) (obj)), rectf, android.graphics.Matrix.ScaleToFit.FILL);
        canvas.concat(matrix);
        canvas.drawBitmap(i, 0.0F, 0.0F, C);
        i1 = 0;
_L19:
        if (i1 >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        canvas.drawBitmap(h, 0.0F, i.getHeight() + h.getHeight() * i1, C);
        i1++;
        if (true) goto _L19; else goto _L18
_L18:
        canvas.drawBitmap(g, 0.0F, i.getHeight() + l * h.getHeight(), C);
          goto _L20
_L4:
        return;
_L10:
        i1++;
        if (true) goto _L22; else goto _L21
_L21:
    }

    private void d()
    {
        this;
        JVM INSTR monitorenter ;
        if (k != null && !k.isRecycled())
        {
            k.recycle();
            k = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != null && !g.isRecycled())
        {
            g.recycle();
            g = null;
        }
        if (h != null && !h.isRecycled())
        {
            h.recycle();
            h = null;
        }
        if (i != null && !i.isRecycled())
        {
            i.recycle();
            i = null;
        }
        if (j != null && !j.isRecycled())
        {
            j.recycle();
            j = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        d = i1;
        r = k1;
        s = l1;
        t = j1;
        String s1 = ih.C().e();
        if (s1 != null)
        {
            ih.C().e(s1);
            ih.C().c(null);
        }
        c = ih.C().f();
        a(d, t, new int[] {
            r, s
        });
    }

    public final void a(Bitmap bitmap)
    {
        if (k != null && !k.isRecycled())
        {
            k.recycle();
        }
        k = bitmap;
    }

    public final void a(Canvas canvas)
    {
        this;
        JVM INSTR monitorenter ;
        if (j == null || j.isRecycled()) goto _L2; else goto _L1
_L1:
        if (!c) goto _L4; else goto _L3
_L3:
        j.setDensity(canvas.getDensity());
        int i1 = 0;
_L9:
        if (i1 >= n) goto _L2; else goto _L5
_L5:
        int j1 = 0;
_L7:
        if (j1 >= m)
        {
            break; /* Loop/switch isn't completed */
        }
        canvas.drawBitmap(j, j.getWidth() * j1, j.getHeight() * i1, C);
        j1++;
        if (true) goto _L7; else goto _L6
_L4:
        canvas.drawBitmap(j, 0.0F, 0.0F, null);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        canvas;
        throw canvas;
_L6:
        i1++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void a(String s1)
    {
        com.roidapp.baselib.a.a.a();
        j = com.roidapp.baselib.a.a.a(s1, e, f);
    }

    public final void a(String s1, boolean flag)
    {
        boolean flag1 = true;
        b = s1;
        if (s1 != null)
        {
            ih.C().e(s1);
        }
        c = flag;
        if (flag)
        {
            if (s1 != null)
            {
                j = BitmapFactory.decodeFile(s1);
                if (j == null)
                {
                    throw new OutOfMemoryError("bg create decodeBitmap null");
                }
                int i1;
                if (e % j.getWidth() != 0)
                {
                    i1 = e / j.getWidth() + 1;
                } else
                {
                    i1 = e / j.getWidth();
                }
                m = i1;
                if (f % j.getHeight() != 0)
                {
                    i1 = f / j.getHeight() + 1;
                } else
                {
                    i1 = f / j.getHeight();
                }
                n = i1;
            }
        } else
        if (s1 != null)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(s1, options);
            int k1 = options.outWidth / e;
            int j1 = k1;
            if (k1 > options.outHeight / f)
            {
                j1 = options.outHeight / f;
            }
            if (j1 <= 0)
            {
                j1 = ((flag1) ? 1 : 0);
            }
            options.inSampleSize = j1;
            options.inJustDecodeBounds = false;
            s1 = BitmapFactory.decodeFile(s1, options);
            float f1 = (float)e / (float)options.outWidth;
            float f2 = (float)f / (float)options.outHeight;
            if (s1 != null && !s1.isRecycled())
            {
                com.roidapp.photogrid.release.rf.a();
                j = com.roidapp.photogrid.release.rf.a(s1, f1, f2);
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        v = flag;
    }

    public final void b()
    {
        u = true;
    }

    public final void b(boolean flag)
    {
        w = flag;
    }

    public final void c(boolean flag)
    {
        A = flag;
    }

    public final boolean c()
    {
        return v;
    }

    protected final void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        a();
        d();
    }

    protected final void onDraw(Canvas canvas)
    {
        if (A)
        {
            if (B == null)
            {
                B = new Paint();
                B.setColor(a.getResources().getColor(0x7f0c00b5));
                B.setAlpha(229);
                B.setStrokeWidth(2.0F * a.getResources().getDisplayMetrics().density + 0.5F);
                B.setColor(a.getResources().getColor(0x7f0c0006));
            }
            canvas.drawLine(0.0F, 0.0F, e, 0.0F, B);
            canvas.drawLine(0.0F, 0.0F, 0.0F, f, B);
            canvas.drawLine(0.0F, f, e, f, B);
            canvas.drawLine(e, 0.0F, e, f, B);
            return;
        }
        if (az.q == 4 || az.q == 6)
        {
            a(canvas);
            return;
        } else
        {
            b(canvas);
            return;
        }
    }
}
