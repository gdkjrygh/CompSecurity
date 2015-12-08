// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bm;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLUtils;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.bw.e;
import com.google.android.m4b.maps.cf.k;
import com.google.android.m4b.maps.cf.s;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bm:
//            d, g

public final class j extends s
{
    public static final class a extends e
    {

        public final void a(Object obj, Object obj1)
        {
            ((j)obj1).c();
        }

        public a(int l)
        {
            super(l);
        }
    }


    public int a;
    boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;
    public float g;
    public int h;
    boolean i;
    private int n;
    private final int o[];
    private final long p;

    public j(d d1)
    {
        super((byte)0);
        o = new int[1];
        b = false;
        c = false;
        d = false;
        e = true;
        h = 0;
        i = false;
        p = com.google.android.m4b.maps.bm.d.a(d1);
        o[0] = 0;
        l = 1;
    }

    public j(d d1, byte byte0)
    {
        this(d1);
        i = false;
    }

    public static int a(int l, int i1)
    {
        for (; i1 < l; i1 <<= 1) { }
        return i1;
    }

    static Bitmap a(Bitmap bitmap, android.graphics.Bitmap.Config config, g g1)
    {
        int l = bitmap.getWidth();
        int i1 = bitmap.getHeight();
        int j1 = a(l, 1);
        int k1 = a(i1, 1);
        config = g1.a(j1, k1, config);
        config.eraseColor(0);
        g1 = new Canvas(config);
        Paint paint = new Paint();
        g1.drawBitmap(bitmap, 0.0F, 0.0F, paint);
        if (j1 > l)
        {
            g1.drawBitmap(bitmap, new Rect(l - 1, 0, l, i1), new Rect(l, 0, l + 1, i1), paint);
        }
        if (k1 > i1)
        {
            g1.drawBitmap(bitmap, new Rect(0, i1 - 1, l, i1), new Rect(0, i1, l, i1 + 1), paint);
        }
        if (j1 > l && k1 > i1)
        {
            g1.drawBitmap(bitmap, new Rect(l - 1, i1 - 1, l, i1), new Rect(l, i1, l + 1, i1 + 1), paint);
        }
        return config;
    }

    static Bitmap b(Resources resources, int l)
    {
        DisplayMetrics displaymetrics = resources.getDisplayMetrics();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inDensity = displaymetrics.densityDpi;
        options.inTargetDensity = displaymetrics.densityDpi;
        return BitmapFactory.decodeResource(resources, l, options);
    }

    static boolean c(Bitmap bitmap)
    {
        int l = bitmap.getWidth();
        int i1 = bitmap.getHeight();
        return (l & l - 1) == 0 && (i1 - 1 & i1) == 0;
    }

    final d a()
    {
        d d1 = com.google.android.m4b.maps.bm.d.a(p);
        if (d1 == null)
        {
            throw new IllegalStateException("Texture is out of date.");
        } else
        {
            return d1;
        }
    }

    public final void a(Resources resources, int l)
    {
        resources = b(resources, l);
        a(((Bitmap) (resources)), resources.getWidth(), resources.getHeight());
        if (!i)
        {
            resources.recycle();
        }
    }

    public final void a(Bitmap bitmap)
    {
        int l = bitmap.getWidth();
        int i1 = bitmap.getHeight();
        boolean flag;
        if (!c(bitmap))
        {
            bitmap = a(bitmap, android.graphics.Bitmap.Config.ARGB_8888, a().c);
            flag = true;
        } else
        {
            flag = false;
        }
        a(bitmap, l, i1, false, false, true);
        if (flag && !i)
        {
            bitmap.recycle();
        }
    }

    public final void a(Bitmap bitmap, int l, int i1)
    {
        boolean flag;
        if (!c(bitmap))
        {
            bitmap = a(bitmap, android.graphics.Bitmap.Config.ARGB_8888, a().c);
            flag = true;
        } else
        {
            flag = false;
        }
        a(bitmap, l, i1, false, false, false);
        if (flag && !i)
        {
            bitmap.recycle();
        }
    }

    final void a(Bitmap bitmap, int l, int i1, boolean flag, boolean flag1, boolean flag2)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag1 || !flag2)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        throw new IllegalArgumentException("Cannot have both isMipMap and autoGenerateMipMap be true.");
        bitmap;
        this;
        JVM INSTR monitorexit ;
        throw bitmap;
        d d1;
        GL10 gl10;
        d1 = a();
        gl10 = d1.a;
        if (!flag2) goto _L2; else goto _L1
_L1:
        if (!d1.g) goto _L2; else goto _L3
_L3:
        int l1 = 1;
_L49:
        if (bitmap != null) goto _L5; else goto _L4
_L4:
        int j1;
        int k1;
        n = l;
        a = i1;
        j1 = a(l, 1);
        k1 = a(i1, 1);
_L10:
        int i2;
        if (d1.e == null)
        {
            int ai[] = new int[1];
            d1.a.glGetIntegerv(3379, ai, 0);
            d1.e = Integer.valueOf(ai[0]);
        }
        i2 = d1.e.intValue();
        if (j1 <= i2 && k1 <= i2) goto _L7; else goto _L6
_L6:
        throw new IllegalArgumentException((new StringBuilder(115)).append("Textures with dimensions").append(j1).append("x").append(k1).append(" are larger than  the maximum supported size ").append(i2).append("x").append(i2).toString());
_L5:
        n = l;
        if (!flag1) goto _L9; else goto _L8
_L8:
        j1 = i1 / 2;
_L50:
        a = j1;
        j1 = bitmap.getWidth();
        k1 = bitmap.getHeight();
          goto _L10
_L7:
        f = (float)l / (float)j1;
        g = (float)i1 / (float)k1;
        if (!i) goto _L12; else goto _L11
_L11:
        Bitmap bitmap1;
        Canvas canvas;
        Rect rect;
        Rect rect1;
        if (b)
        {
            l = 10497;
        } else
        {
            l = 33071;
        }
        if (c)
        {
            i1 = 10497;
        } else
        {
            i1 = 33071;
        }
        b(l, i1);
        if (!d) goto _L14; else goto _L13
_L13:
        if (!flag1 && l1 == 0) goto _L16; else goto _L15
_L15:
        if (!e) goto _L18; else goto _L17
_L17:
        c(9987, 9729);
_L30:
        if (bitmap == null) goto _L20; else goto _L19
_L19:
        if (!flag1) goto _L22; else goto _L21
_L21:
        l1 = 0;
        i1 = 0;
        l = bitmap.getWidth();
_L29:
        if (l <= 0) goto _L24; else goto _L23
_L23:
        canvas = new Canvas();
        rect = new Rect(0, i1, l, l + i1);
        rect1 = new Rect(0, 0, l, l);
        if (!flag) goto _L26; else goto _L25
_L25:
        bitmap1 = d1.c.a(l, l, android.graphics.Bitmap.Config.ALPHA_8);
_L40:
        canvas.setBitmap(bitmap1);
        canvas.drawBitmap(bitmap, rect, rect1, null);
        if (!i) goto _L28; else goto _L27
_L27:
        a(new k(bitmap1), true);
        l = 0;
_L41:
        i1 += l;
        l /= 2;
          goto _L29
_L18:
        c(9985, 9729);
          goto _L30
_L16:
        c(9729, 9729);
          goto _L30
_L14:
        c(9728, 9728);
          goto _L30
_L12:
        if (o[0] == 0)
        {
            gl10.glGenTextures(1, o, 0);
        }
        gl10.glBindTexture(3553, o[0]);
        if (!b) goto _L32; else goto _L31
_L31:
        gl10.glTexParameterf(3553, 10242, 10497F);
_L37:
        if (!c) goto _L34; else goto _L33
_L33:
        gl10.glTexParameterf(3553, 10243, 10497F);
_L38:
        if (!d)
        {
            break MISSING_BLOCK_LABEL_717;
        }
        if (!flag1 && l1 == 0)
        {
            break MISSING_BLOCK_LABEL_699;
        }
        if (!e) goto _L36; else goto _L35
_L35:
        gl10.glTexParameterf(3553, 10241, 9987F);
_L39:
        gl10.glTexParameterf(3553, 10240, 9729F);
          goto _L30
_L32:
        gl10.glTexParameterf(3553, 10242, 33071F);
          goto _L37
_L34:
        gl10.glTexParameterf(3553, 10243, 33071F);
          goto _L38
_L36:
        gl10.glTexParameterf(3553, 10241, 9985F);
          goto _L39
        gl10.glTexParameterf(3553, 10241, 9729F);
          goto _L39
        gl10.glTexParameterf(3553, 10241, 9728F);
        gl10.glTexParameterf(3553, 10240, 9728F);
          goto _L30
_L26:
        bitmap1 = d1.c.a(l, l, android.graphics.Bitmap.Config.ARGB_8888);
          goto _L40
_L28:
        gl10.glTexParameterf(3553, 33169, 0.0F);
        GLUtils.texImage2D(3553, l1, bitmap1, 0);
        bitmap1.recycle();
        l1++;
          goto _L41
_L22:
        if (l1 == 0) goto _L43; else goto _L42
_L42:
        if (!i) goto _L45; else goto _L44
_L44:
        a(new k(bitmap), true);
          goto _L24
_L48:
        h = l;
        this;
        JVM INSTR monitorexit ;
        return;
_L45:
        gl10.glTexParameterx(3553, 33169, 1);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
          goto _L24
_L43:
        if (!i) goto _L47; else goto _L46
_L46:
        a(new k(bitmap), false);
          goto _L24
_L47:
        gl10.glTexParameterf(3553, 33169, 0.0F);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
          goto _L24
_L20:
        gl10.glFinish();
        gl10.glTexParameterf(3553, 33169, 0.0F);
        gl10.glCopyTexImage2D(3553, 0, 6407, 0, 0, j1, k1, 0);
          goto _L24
_L52:
        l = bitmap.getRowBytes();
        i1 = bitmap.getHeight();
        l *= i1;
          goto _L48
_L2:
        l1 = 0;
          goto _L49
_L9:
        j1 = i1;
          goto _L50
_L24:
        if (bitmap != null) goto _L52; else goto _L51
_L51:
        l = j1 * k1 * 3;
          goto _L48
    }

    public final void a(GL10 gl10)
    {
        if (gl10 != a().a)
        {
            throw new IllegalStateException("Attempted to bind texture into an OpenGL context other than the one it was created from.");
        }
        if (o[0] != 0)
        {
            gl10.glBindTexture(3553, o[0]);
        }
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        l = l + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(Bitmap bitmap)
    {
        a(bitmap, bitmap.getWidth(), bitmap.getHeight());
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        int l = this.l;
        if (l > 0) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d d1;
        d1 = com.google.android.m4b.maps.bm.d.a(p);
        l = this.l - 1;
        this.l = l;
        if (l != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o[0] == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        d1.b(o[0]);
        h = 0;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }
}
