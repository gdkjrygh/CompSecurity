// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.core;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Build;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import com.roidapp.baselib.c.c;
import com.roidapp.videolib.b.i;
import com.roidapp.videolib.b.m;
import com.roidapp.videolib.b.u;
import com.roidapp.videolib.core.a.a;
import com.roidapp.videolib.e;
import com.roidapp.videolib.gl.f;
import com.roidapp.videolib.gl.h;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.roidapp.videolib.core:
//            h, l, c, e, 
//            i

final class b extends c
    implements com.roidapp.videolib.core.a.c, com.roidapp.videolib.core.h
{

    protected String a;
    protected int b;
    protected int c;
    protected Throwable d;
    protected String e;
    protected boolean f;
    protected boolean g;
    public f h;
    protected a i;
    private com.roidapp.videolib.core.a.b j;
    private String k;
    private Context l;
    private String m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private long s;
    private long t;
    private Bitmap u;
    private Bitmap v;
    private final float w;
    private com.roidapp.videolib.core.i x;
    private com.roidapp.videolib.core.e y;

    b(Context context)
    {
        b = 60933;
        c = 0;
        g = false;
        n = true;
        o = false;
        p = 1;
        q = 0x80000000;
        r = 0;
        s = 0L;
        x = null;
        y = null;
        l = context;
        com.roidapp.videolib.core.l.a().a(context);
        com.roidapp.videolib.core.l.a();
        com.roidapp.videolib.core.l.c();
        if (android.os.Build.VERSION.SDK_INT == 15)
        {
            if (Build.MODEL.startsWith("GT-S53"))
            {
                t = 5000L;
            } else
            {
                t = 2000L;
            }
        } else
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            t = 1000L;
        } else
        {
            t = 100L;
        }
        w = context.getResources().getDisplayMetrics().scaledDensity;
        h = new com.roidapp.videolib.core.c(this);
    }

    static float a(TextPaint textpaint, String s1)
    {
        s1 = s1.split(System.getProperty("line.separator", "\n"));
        float f1 = 0.0F;
        for (int i1 = 0; i1 < s1.length;)
        {
            String s2 = s1[i1];
            float f2 = f1;
            if (s2 != null)
            {
                Rect rect = new Rect();
                textpaint.getTextBounds(s2, 0, s2.length(), rect);
                float f3 = rect.width();
                f2 = f1;
                if (f3 > f1)
                {
                    f2 = f3;
                }
            }
            i1++;
            f1 = f2;
        }

        return f1;
    }

    static int a(float f1, float f2)
    {
        return (int)(f1 * f2 + 0.5F);
    }

    private Bitmap a(Bitmap bitmap)
    {
        int j1 = i.d();
        com.roidapp.baselib.a.a.a();
        Bitmap bitmap1 = com.roidapp.baselib.a.a.a(i.d(), i.e(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        float f1;
        Matrix matrix;
        int i1;
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            i1 = bitmap.getWidth();
        } else
        {
            i1 = bitmap.getHeight();
        }
        f1 = (float)j1 / (float)i1;
        matrix = new Matrix();
        matrix.postTranslate((float)j1 / 2.0F - (float)bitmap.getWidth() / 2.0F, (float)j1 / 2.0F - (float)bitmap.getHeight() / 2.0F);
        matrix.postScale(f1, f1, (float)j1 / 2.0F, (float)j1 / 2.0F);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawARGB(0, 255, 255, 255);
        canvas.drawBitmap(bitmap, matrix, new Paint());
        bitmap.recycle();
        return bitmap1;
    }

    static Bitmap a(b b1, Bitmap bitmap)
    {
        b1.v = bitmap;
        return bitmap;
    }

    static com.roidapp.videolib.core.i a(b b1, com.roidapp.videolib.core.i i1)
    {
        b1.x = i1;
        return i1;
    }

    private Boolean a(a a1)
    {
        Object obj;
        if (l == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = l.getFileStreamPath("tmp_video.mp4").getAbsolutePath();
        a = ((String) (obj));
        m = ((String) (obj));
        int i1;
        try
        {
            obj = new com.a.a.a();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            a1.printStackTrace();
            d = a1;
            b = 60935;
            return Boolean.valueOf(false);
        }
        ((com.a.a.a) (obj)).a(a, a1.b(), 0L, a1.d(), a1.e(), 15D, 100, 0xf4240L);
        a1 = Bitmap.createBitmap(640, 640, android.graphics.Bitmap.Config.ARGB_8888);
        i1 = 0;
_L2:
        if (i1 >= 15)
        {
            break; /* Loop/switch isn't completed */
        }
        ((com.a.a.a) (obj)).a(a1);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        a1.recycle();
        a1 = Boolean.valueOf(true);
        try
        {
            ((com.a.a.a) (obj)).b(true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d = ((Throwable) (obj));
            return a1;
        }
        return a1;
        a1;
        a1.printStackTrace();
        d = a1;
        try
        {
            ((com.a.a.a) (obj)).b(true);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            d = a1;
        }
        return Boolean.valueOf(false);
        a1;
        try
        {
            ((com.a.a.a) (obj)).b(true);
        }
        catch (Exception exception)
        {
            d = exception;
        }
        throw a1;
    }

    private transient Boolean a(a aa[])
    {
        if (aa == null || aa.length <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj2;
        com.a.a.a a1;
        int l2;
        i = aa[0];
        if ("test".equals(i.a()))
        {
            return a(i);
        }
        aa = i.c();
        if (aa == null || aa.length == 0)
        {
            return Boolean.valueOf(false);
        }
        if (isCancelled())
        {
            return Boolean.valueOf(true);
        }
        l2 = (int)((double)(((float)i.g() / 1000000F) * 20F) + 0.5D);
        a(0, 3);
        e = i.b();
        if (e != null)
        {
            int j1 = e.lastIndexOf('/') + 1;
            if (j1 < e.length())
            {
                e = e.substring(j1);
            }
        }
        a = i.a();
        obj2 = null;
        obj = null;
        try
        {
            a1 = new com.a.a.a();
            a1.a(false);
        }
        // Misplaced declaration of an exception variable
        catch (a aa[])
        {
            aa.printStackTrace();
            d = aa;
            b = 60935;
            return Boolean.valueOf(false);
        }
        if (c())
        {
            if (y != null)
            {
                y.e();
                y = null;
            }
            y = new com.roidapp.videolib.core.e();
            aa = com.roidapp.videolib.core.e.b(i.l());
            for (int k1 = 0; k1 < aa.length; k1++)
            {
                aa[k1] = (new StringBuilder()).append(com.roidapp.imagelib.b.c.a()).append("/.video/").append(aa[k1]).toString();
            }

            y.a(aa);
            y.b();
        }
        int l1 = i.h();
        if (l1 != 4)
        {
            break MISSING_BLOCK_LABEL_629;
        }
        if (!com.a.a.a.b()) goto _L4; else goto _L3
_L3:
        a1.a(true);
_L5:
        c = a1.a(a, i.b(), i.f() * 1000L, i.d(), i.e(), 20D, l1, i.g());
        if (c == 0)
        {
            break MISSING_BLOCK_LABEL_668;
        }
        d = new Exception((new StringBuilder()).append(c).append(",").append(i.b()).append(",").append(a).append("s:").append(i.f()).append(",").append(i.f() * 1000L).append(",").append(i.d()).append(",").append(i.e()).append(",20.0,").append(l1).append(",").append(i.g()).toString());
        b = 60935;
        aa = Boolean.valueOf(false);
        float f2;
        float f3;
        int j2;
        int k2;
        boolean flag3;
        double d1;
        float f1;
        Object obj1;
        i i1;
        Exception exception;
        File file;
        boolean flag;
        int i2;
        boolean flag1;
        byte byte0;
        boolean flag2;
        int i3;
        long l3;
        long l4;
        long l5;
        if (d == null && !isCancelled())
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        try
        {
            a1.b(flag3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d = ((Throwable) (obj));
            return aa;
        }
        return aa;
_L4:
        l1 = 34;
          goto _L5
        if (l1 == 1)
        {
            l1 = 28;
        } else
        if (l1 == 3)
        {
            l1 = 40;
        } else
        {
            l1 = 34;
        }
          goto _L5
        f1 = 90F / (float)l2;
        if (f1 >= 1.0F) goto _L7; else goto _L6
_L6:
        d1 = 1.0F / f1;
        j2 = (int)Math.ceil(d1);
        f2 = j2;
        f1 *= f2;
_L17:
        l1 = -1;
        if (h.g() == u.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(0, 5);
        aa = new m(l);
        aa.a(h);
        i1 = new i(aa);
        i1.a(true);
        obj1 = new h(i.d(), i.e());
        ((h) (obj1)).a(i1);
        aa.a(p, o);
        if (!c() && !f)
        {
            i1.a(1.0F - i.l / 100F);
        }
        if (h.e() == null)
        {
            f2 = l2;
        } else
        {
            f2 = (float)l2 - 20F;
        }
        i3 = (int)f2;
        if (c())
        {
            byte0 = 66;
        } else
        {
            byte0 = 0;
        }
        l5 = h.c() / i.c().length;
        l3 = 0L;
        k2 = 0;
        obj = null;
        f2 = 5F;
_L21:
        if (k2 > l2) goto _L9; else goto _L8
_L8:
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_1007;
        }
        if (d == null && !isCancelled())
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        try
        {
            a1.b(flag3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d = ((Throwable) (obj));
        }
        ((h) (obj1)).b();
        aa.c();
        return Boolean.valueOf(true);
        i1.a(l3);
        i2 = i1.d(l3);
        if (i2 != l1 && k2 <= i3)
        {
            flag3 = true;
            flag2 = false;
            l1 = i2;
            flag1 = flag2;
        } else
        {
            flag3 = false;
            if (k2 > i3)
            {
                flag1 = false;
            } else
            {
                flag1 = flag;
            }
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_1063;
        }
        obj = ((h) (obj1)).a();
        if (k2 != byte0)
        {
            break MISSING_BLOCK_LABEL_1178;
        }
        obj2 = com.roidapp.baselib.f.b.a().c();
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_1178;
        }
        file = new File(((String) (obj2)));
        if (!file.exists() && !file.mkdirs())
        {
            break MISSING_BLOCK_LABEL_1178;
        }
        obj2 = new File(((String) (obj2)), "coverTemp.jpg");
        if (((File) (obj2)).exists())
        {
            ((File) (obj2)).delete();
        }
        ((File) (obj2)).createNewFile();
        obj2 = new FileOutputStream(((File) (obj2)));
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.JPEG, 50, ((OutputStream) (obj2)));
        ((OutputStream) (obj2)).flush();
        ((OutputStream) (obj2)).close();
_L12:
        c = a1.a(((Bitmap) (obj)), flag3);
        if (c == 0) goto _L11; else goto _L10
_L10:
        b = 60933;
        if (d == null && !isCancelled())
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        try
        {
            a1.b(flag3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d = ((Throwable) (obj));
        }
        ((h) (obj1)).b();
        aa.c();
        return Boolean.valueOf(false);
        obj2;
        ((IOException) (obj2)).printStackTrace();
          goto _L12
_L15:
        ((Throwable) (obj1)).printStackTrace();
        d = ((Throwable) (obj1));
        if (d == null && !isCancelled())
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        try
        {
            a1.b(flag3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            d = ((Throwable) (obj1));
        }
        if (obj != null)
        {
            ((h) (obj)).b();
        }
        if (aa != null)
        {
            aa.c();
        }
_L2:
        a(-1, 100);
        return Boolean.valueOf(false);
        obj2;
        ((IOException) (obj2)).printStackTrace();
          goto _L12
_L16:
        if (d == null && !isCancelled())
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        try
        {
            a1.b(flag3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            d = ((Throwable) (obj2));
        }
        if (obj1 != null)
        {
            ((h) (obj1)).b();
        }
        if (obj != null)
        {
            ((m) (obj)).c();
        }
        throw aa;
_L11:
        if (!isCancelled())
        {
            break MISSING_BLOCK_LABEL_1498;
        }
        ((Bitmap) (obj)).recycle();
        if (d == null && !isCancelled())
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        try
        {
            a1.b(flag3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d = ((Throwable) (obj));
        }
        ((h) (obj1)).b();
        aa.c();
        return Boolean.valueOf(true);
        l4 = 50L + l3;
        l3 = l4;
        if (k2 <= i3)
        {
            break MISSING_BLOCK_LABEL_1557;
        }
        l3 = l4;
        if (l4 < (long)(h.c() - 1000))
        {
            l3 = h.c() - 1000;
        }
        if (k2 != l2 - 1) goto _L14; else goto _L13
_L13:
        l3 = h.c();
          goto _L14
_L19:
        flag1 = (int)(l3 / l5 + 1L);
        f3 = f2 + f1;
        try
        {
            a(flag1, (int)f3);
            break; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            obj = obj1;
            obj1 = obj2;
        }
        finally
        {
            obj = aa;
            aa = ((a []) (obj2));
        }
          goto _L15
_L9:
        if (d == null && !isCancelled())
        {
            flag3 = false;
        } else
        {
            flag3 = true;
        }
        try
        {
            a1.b(flag3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            d = ((Throwable) (obj));
        }
        ((h) (obj1)).b();
        aa.c();
        return Boolean.valueOf(true);
        aa;
        obj1 = obj2;
          goto _L16
        obj1;
        obj = aa;
        aa = ((a []) (obj1));
        obj1 = obj2;
          goto _L16
        exception;
        obj1 = aa;
        obj2 = obj;
        aa = exception;
        obj = obj1;
        obj1 = obj2;
          goto _L16
        obj1;
        aa = null;
        obj = null;
          goto _L15
        obj1;
        obj = null;
          goto _L15
_L7:
        j2 = 1;
          goto _L17
_L14:
        if (j2 <= 1) goto _L19; else goto _L18
_L18:
        f3 = f2;
        if (k2 % j2 != 0) goto _L20; else goto _L19
_L20:
        k2++;
        f2 = f3;
          goto _L21
    }

    private void a(int i1, int j1)
    {
        long l1;
        if (q != i1 || j1 != r)
        {
            if ((l1 = System.currentTimeMillis()) - s > t)
            {
                publishProgress(new Integer[] {
                    Integer.valueOf(i1), Integer.valueOf(j1)
                });
                s = l1;
                return;
            }
        }
    }

    static boolean a(b b1)
    {
        return b1.c();
    }

    static Bitmap b(b b1, Bitmap bitmap)
    {
        b1.u = bitmap;
        return bitmap;
    }

    static com.roidapp.videolib.core.i b(b b1)
    {
        return b1.x;
    }

    static com.roidapp.videolib.core.e c(b b1)
    {
        return b1.y;
    }

    private boolean c()
    {
        if (i == null)
        {
            return false;
        } else
        {
            return com.roidapp.videolib.core.e.a(i.l());
        }
    }

    static Bitmap d(b b1)
    {
        return b1.v;
    }

    private void d()
    {
        if (a != null)
        {
            File file = new File(a);
            if (file.exists())
            {
                file.delete();
            }
        }
        if (m != null)
        {
            (new File(m)).delete();
        }
    }

    static Bitmap e(b b1)
    {
        return b1.u;
    }

    static float f(b b1)
    {
        return b1.w;
    }

    public final void a()
    {
        cancel(true);
    }

    public final void a(boolean flag, a a1, com.roidapp.videolib.core.a.b b1)
    {
        f = flag;
        j = b1;
        g = a1.n;
        n = a1.j();
        o = a1.p;
        p = a1.q;
        com.roidapp.baselib.f.b.a().a(a1.m);
        com.roidapp.baselib.f.b.a().b(a1.j());
        com.roidapp.baselib.f.b.a().a(l);
        com.roidapp.baselib.f.b.a().a(a1.a, a1.b);
        com.roidapp.baselib.f.b.a().a(a1.e, a1.f, a1.g, a1.h);
        com.roidapp.baselib.f.b.a().a(a1.i, a1.j, a1.c);
        com.roidapp.baselib.f.b.a().a(a1.k);
        com.roidapp.baselib.f.b.a().a(g);
        executeOnExecutor(c.SINGLE_EXECUTOR, new a[] {
            a1
        });
    }

    public final void b()
    {
        j = null;
        com.roidapp.baselib.a.a.b();
        com.roidapp.baselib.f.b.b();
        com.roidapp.videolib.core.l.b();
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((a[])aobj);
    }

    public final com.roidapp.videolib.gl.a f(int i1)
    {
        int j1 = i1;
        if (c())
        {
            j1 = i1;
            if (i != null)
            {
                j1 = i1;
                if (i.c() != null)
                {
                    j1 = i1;
                    if (i.c().length != 0)
                    {
                        j1 = i1 % i.c().length;
                    }
                }
            }
        }
        String as[] = i.c();
        com.roidapp.videolib.gl.a a1 = new com.roidapp.videolib.gl.a();
        Bitmap bitmap = com.roidapp.baselib.a.a.a(as[j1], i.d(), i.e(), false, n);
        if (bitmap == null)
        {
            a1.b = null;
            return a1;
        }
        float f3 = i.k;
        j1 = bitmap.getWidth();
        int k1 = bitmap.getHeight();
        float f1;
        float f2;
        float f4;
        float f5;
        if (j1 > k1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            f1 = (float)j1 / (float)i.d();
        } else
        {
            f1 = (float)k1 / (float)i.d();
        }
        f2 = (float)k1 / f1;
        f1 = (float)j1 / f1 / (float)i.d();
        f2 /= i.d();
        if (f1 > f2)
        {
            f1 = f2;
        }
        f2 = 0.5F - f1 / 2.0F;
        f4 = f2 + f1;
        f5 = 0.5F - f1 / 2.0F;
        f1 += f5;
        if (f3 > 0.0F)
        {
            float f6 = Math.min(j1, k1);
            f3 = ((f3 / 100F) * ((0.96F * f6) / 2.0F) * 0.414F) / (f6 * 1.414F);
            a1.c = (new float[] {
                f2 + f3 + 0.01F, f1 - f3 - 0.01F, f4 - f3 - 0.01F, f1 - f3 - 0.01F, f2 + f3 + 0.01F, f5 + f3 + 0.01F, f4 - f3 - 0.01F, f5 + f3 + 0.01F
            });
        } else
        {
            a1.c = (new float[] {
                0.01F + f2, f1 - 0.01F, f4 - 0.01F, f1 - 0.01F, f2 + 0.01F, 0.01F + f5, f4 - 0.01F, 0.01F + f5
            });
        }
        if (!c() && !f)
        {
            BitmapShader bitmapshader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            com.roidapp.baselib.a.a.a();
            Bitmap bitmap1 = com.roidapp.baselib.a.a.a(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Object obj = new Path();
            ((Path) (obj)).moveTo(0.0F, 0.0F);
            ((Path) (obj)).lineTo(bitmap.getWidth(), 0.0F);
            ((Path) (obj)).lineTo(bitmap.getWidth(), bitmap.getHeight());
            ((Path) (obj)).lineTo(0.0F, bitmap.getHeight());
            ((Path) (obj)).close();
            obj = new ShapeDrawable(new PathShape(((Path) (obj)), bitmap.getWidth(), bitmap.getHeight()));
            f1 = i.k / 100F;
            f2 = (0.96F * (float)Math.min(bitmap.getWidth(), bitmap.getHeight())) / 2.0F;
            ((ShapeDrawable) (obj)).getPaint().setPathEffect(new CornerPathEffect(f1 * f2 * i.d));
            ((ShapeDrawable) (obj)).getPaint().setShader(bitmapshader);
            ((ShapeDrawable) (obj)).setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            ((ShapeDrawable) (obj)).draw(canvas);
            if (!n)
            {
                a1.b = a(bitmap1);
            } else
            {
                a1.b = bitmap1;
            }
            a1.d = false;
            return a1;
        }
        if (!n)
        {
            a1.b = a(bitmap);
        } else
        {
            a1.b = bitmap;
        }
        a1.d = false;
        return a1;
    }

    protected final void onCancelled()
    {
        super.onCancelled();
        d();
        if (j != null)
        {
            j.b();
        }
    }

    protected final void onPostExecute(Object obj)
    {
        String s1;
label0:
        {
            s1 = null;
            obj = (Boolean)obj;
            super.onPostExecute(obj);
            if (x != null)
            {
                x.b();
            }
            if (v != null)
            {
                v.recycle();
                v = null;
            }
            if (y != null)
            {
                y.e();
                y = null;
            }
            if (m != null)
            {
                (new File(m)).delete();
            }
            if (!isCancelled() && j != null)
            {
                if (!((Boolean) (obj)).booleanValue())
                {
                    break label0;
                }
                j.a(a);
            }
            return;
        }
        d();
        if (d == null && c != 0)
        {
            d = new Exception((new StringBuilder("native error code : ")).append(c).append(",audio=").append(e).toString());
        }
        if (d != null && l != null)
        {
            com.roidapp.videolib.e.a();
            (new StringBuilder("Video/Encode/Error:")).append(Build.MODEL);
        }
        com.roidapp.videolib.core.a.b b1 = j;
        int i1 = b;
        int j1 = c;
        if (d == null)
        {
            obj = null;
        } else
        {
            obj = d.getClass().getName();
        }
        if (d != null)
        {
            s1 = d.getMessage();
        }
        b1.a(i1, j1, ((String) (obj)), s1, k);
    }

    protected final void onPreExecute()
    {
        super.onPreExecute();
        if (j != null)
        {
            j.a();
        }
        a(0, 2);
    }

    protected final void onProgressUpdate(Object aobj[])
    {
        aobj = (Integer[])aobj;
        super.onProgressUpdate(aobj);
        if (j != null && aobj != null && aobj.length > 1)
        {
            j.a(((Integer) (aobj[0])).intValue(), ((Integer) (aobj[1])).intValue());
        }
    }
}
