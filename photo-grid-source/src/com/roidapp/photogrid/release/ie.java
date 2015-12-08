// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.util.Log;
import com.roidapp.baselib.c.p;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.photogrid.common.ae;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bp;
import com.roidapp.photogrid.filter.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.release:
//            ap, ih, lc, ml, 
//            rf, PhotoView, ao, qz, 
//            ra, ig, az, ay

public final class ie extends ap
{

    private PhotoView A;
    private com.roidapp.photogrid.release.az B;
    private String C;
    private boolean D;
    private boolean E;
    private int a;
    private int b;
    private Context c;
    private int d;
    private int e;
    private int f;
    private int g;
    private Bitmap h;
    private Bitmap i;
    private Bitmap j;
    private Bitmap k;
    private int l;
    private int m;
    private int n;
    private final int o = 1280;
    private float p;
    private boolean q;
    private boolean r;
    private List s;
    private ig t[];
    private float u;
    private float v;
    private float w;
    private final float x = 1.0F;
    private int y;
    private ml z;

    public ie(Context context, int i1, int j1, ig aig[], int k1, ml ml1, PhotoView photoview, 
            com.roidapp.photogrid.release.az az1)
    {
        d = -1;
        q = false;
        r = false;
        C = "GridActivity";
        E = false;
        c = context;
        a = i1;
        b = j1;
        t = aig;
        y = k1;
        z = ml1;
        A = photoview;
        B = az1;
        switch (az.q)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        default:
            return;

        case 0: // '\0'
            C = "GridActivity";
            return;

        case 4: // '\004'
            C = "GridActivity/Template";
            return;

        case 5: // '\005'
            if (ih.C().W() == 1)
            {
                C = "GridActivity/Single/Instagram";
                return;
            } else
            {
                C = "GridActivity/Single/Original";
                return;
            }

        case 9: // '\t'
            C = "VideoActivity/Single";
            return;

        case 10: // '\n'
            C = "CameraActivity/Single";
            return;
        }
    }

    private static Path a(lc lc1, float f1, float f2)
    {
        Path path = new Path();
        List list = lc1.b;
        int j1 = list.size();
        float f7 = lc1.e.x;
        float f8 = lc1.e.y;
        float f3 = ((PointF)list.get(0)).x;
        float f4 = ((PointF)list.get(0)).y;
        float f5;
        int i1;
        if (f3 < f7)
        {
            f3 = (f3 * f1) / 100F - 1.0F;
        } else
        {
            f3 = (f3 * f1) / 100F + 1.0F;
        }
        if (f4 < f8)
        {
            f4 = (f4 * f2) / 100F - 1.0F;
        } else
        {
            f4 = (f4 * f2) / 100F + 1.0F;
        }
        f5 = f3;
        if (f3 < 0.0F)
        {
            f5 = 0.0F;
        }
        f3 = f4;
        if (f4 < 0.0F)
        {
            f3 = 0.0F;
        }
        path.moveTo(f5, f3);
        i1 = 1;
        while (i1 < j1) 
        {
            lc1 = (PointF)list.get(i1);
            f3 = ((PointF) (lc1)).x;
            f4 = ((PointF) (lc1)).y;
            float f6;
            if (f3 < f7)
            {
                f3 = (f3 * f1) / 100F - 1.0F;
            } else
            {
                f3 = (f3 * f1) / 100F + 1.0F;
            }
            if (f4 < f8)
            {
                f4 = (f4 * f2) / 100F - 1.0F;
            } else
            {
                f4 = (f4 * f2) / 100F + 1.0F;
            }
            f6 = f3;
            if (f3 < 0.0F)
            {
                f6 = 0.0F;
            }
            f3 = f4;
            if (f4 < 0.0F)
            {
                f3 = 0.0F;
            }
            path.lineTo(f6, f3);
            i1++;
        }
        path.close();
        return path;
    }

    private void a(int i1)
    {
        z.a(i1, 1);
    }

    private transient void a(int i1, int j1, int ai[])
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        if ((double)c.getResources().getDisplayMetrics().density >= 1.0D) goto _L2; else goto _L1
_L1:
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        rf.a();
        j = rf.a(c.getResources(), com.roidapp.baselib.c.p.a().a[i1], options, null);
        rf.a();
        h = rf.a(c.getResources(), com.roidapp.baselib.c.p.a().c[i1], options, null);
        rf.a();
        i = rf.a(c.getResources(), com.roidapp.baselib.c.p.a().b[i1], options, null);
_L5:
        if (j == null || h == null || i == null)
        {
            throw new OutOfMemoryError("mBgBase==null  throw oom");
        }
        break MISSING_BLOCK_LABEL_431;
_L4:
        try
        {
            rf.a();
            j = rf.a(c.getResources(), 0x7f0200b1, options, null);
            rf.a();
            h = rf.a(c.getResources(), 0x7f0200ad, options, null);
            rf.a();
            i = rf.a(c.getResources(), 0x7f0200af, options, null);
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            ai.printStackTrace();
            a(j);
            a(i);
            a(h);
            a(k);
            throw new OutOfMemoryError("save create bg oom");
        }
          goto _L5
_L2:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_365;
        }
        rf.a();
        j = com.roidapp.photogrid.release.rf.b(c, com.roidapp.baselib.c.p.a().a[i1], a);
        rf.a();
        h = com.roidapp.photogrid.release.rf.b(c, com.roidapp.baselib.c.p.a().c[i1], a);
        rf.a();
        i = com.roidapp.photogrid.release.rf.b(c, com.roidapp.baselib.c.p.a().b[i1], a);
          goto _L5
        rf.a();
        j = com.roidapp.photogrid.release.rf.b(c, 0x7f0200b1, a);
        rf.a();
        h = com.roidapp.photogrid.release.rf.b(c, 0x7f0200ad, a);
        rf.a();
        i = com.roidapp.photogrid.release.rf.b(c, 0x7f0200af, a);
          goto _L5
        if (j1 == -20) goto _L7; else goto _L6
_L6:
        rf.a();
        k = rf.a(j.getWidth(), j.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        if (k == null)
        {
            throw new OutOfMemoryError("mBgBase==null-1 throw oom");
        }
        ai = new Canvas(k);
        ai.drawColor(j1);
        ai.save();
_L11:
        if (k == null)
        {
            rf.a();
            k = rf.a(c.getResources(), com.roidapp.baselib.c.p.a().j[4][4], options, k);
        }
        if (k == null)
        {
            throw new OutOfMemoryError("mBgBase==null-2  throw oom");
        }
          goto _L8
_L7:
        if (ai.length != 1) goto _L10; else goto _L9
_L9:
        rf.a();
        k = rf.a(c.getResources(), com.roidapp.baselib.c.p.a().d[ai[0]], options, null);
          goto _L11
_L10:
        if (ai[0] < 2)
        {
            break MISSING_BLOCK_LABEL_1269;
        }
        if (ai[0] > com.roidapp.baselib.c.p.a().j.length - 1)
        {
            break MISSING_BLOCK_LABEL_1269;
        }
_L37:
        rf.a();
        k = rf.a(c.getResources(), com.roidapp.baselib.c.p.a().j[ai[0]][ai[1]], options, null);
          goto _L11
_L8:
        rf.a();
        ai = k;
        float f1 = p;
        k = rf.a(ai, f1, f1);
        if (k == null)
        {
            throw new OutOfMemoryError("mBgBase==null-3  throw oom");
        }
        if (a <= b) goto _L13; else goto _L12
_L12:
        if (a % k.getWidth() == 0) goto _L15; else goto _L14
_L14:
        i1 = a / k.getWidth() + 1;
_L22:
        m = i1;
        if (b % k.getHeight() == 0) goto _L17; else goto _L16
_L16:
        i1 = b / k.getHeight() + 1;
_L23:
        n = i1;
        float f2 = (float)b / (float)j.getWidth();
        i1 = Math.round((float)a / f2);
        if ((i1 - j.getHeight() - h.getHeight()) % i.getHeight() == 0) goto _L19; else goto _L18
_L18:
        i1 = (i1 - j.getHeight() - h.getHeight()) / i.getHeight() + 1;
_L24:
        l = i1;
        if (l != 0) goto _L21; else goto _L20
_L20:
        i1 = ((flag) ? 1 : 0);
_L25:
        l = i1;
        rf.a();
        j = rf.a(j, -90);
        rf.a();
        i = rf.a(i, -90);
        rf.a();
        h = rf.a(h, -90);
_L32:
        a(20);
        return;
_L15:
        i1 = a / k.getWidth();
          goto _L22
_L17:
        i1 = b / k.getHeight();
          goto _L23
_L19:
        i1 = (i1 - j.getHeight() - h.getHeight()) / i.getHeight();
          goto _L24
_L21:
        i1 = l;
          goto _L25
_L13:
        if (a % k.getWidth() == 0) goto _L27; else goto _L26
_L26:
        i1 = a / k.getWidth() + 1;
_L33:
        m = i1;
        if (b % k.getHeight() == 0) goto _L29; else goto _L28
_L28:
        i1 = b / k.getHeight() + 1;
_L34:
        n = i1;
        float f3 = (float)a / (float)j.getWidth();
        i1 = Math.round((float)b / f3);
        if ((i1 - j.getHeight() - h.getHeight()) % i.getHeight() == 0) goto _L31; else goto _L30
_L30:
        i1 = (i1 - j.getHeight() - h.getHeight()) / i.getHeight() + 1;
_L35:
        l = i1;
        if (l != 0)
        {
            break MISSING_BLOCK_LABEL_1261;
        }
        i1 = ((flag1) ? 1 : 0);
_L36:
        l = i1;
          goto _L32
_L27:
        i1 = a / k.getWidth();
          goto _L33
_L29:
        i1 = b / k.getHeight();
          goto _L34
_L31:
        i1 = (i1 - j.getHeight() - h.getHeight()) / i.getHeight();
          goto _L35
        i1 = l;
          goto _L36
        ai[0] = 2;
        ai[1] = 0;
          goto _L37
    }

    private static void a(Bitmap bitmap)
    {
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    private void a(Canvas canvas)
    {
        float f1;
        List list;
        HashMap hashmap;
        int i1;
        int j1;
        int k1;
        int l1;
        boolean flag;
        int i2;
        boolean flag3;
        list = A.e();
        canvas.save();
        f1 = w;
        j1 = 0;
        i1 = 0;
        k1 = 0;
        l1 = 0;
        flag3 = false;
        flag = false;
        hashmap = new HashMap();
        i2 = list.size() - 1;
_L5:
        if (i2 < 0) goto _L2; else goto _L1
_L1:
        float f3;
        float f4;
        ao ao1;
        ao1 = ((ao)list.get(i2)).a(c);
        f3 = (float)a / (float)ao1.c;
        f4 = (float)b / (float)ao1.d;
        if (!(ao1 instanceof qz)) goto _L4; else goto _L3
_L3:
        int j2;
        int l2;
        int j3;
        int k3;
        boolean flag2;
        boolean flag4;
        qz qz1 = (qz)ao1;
        if (hashmap.containsKey(qz1.T))
        {
            i1 = ((Integer)hashmap.get(qz1.T)).intValue();
            hashmap.put(qz1.T, Integer.valueOf(i1 + 1));
        } else
        {
            hashmap.put(qz1.T, Integer.valueOf(1));
        }
        if (!"text".equals(qz1.T) && (".thanksgiving".equals(qz1.T) || ".givethanks".equals(qz1.T)))
        {
            az.F = true;
        }
        qz1.j = qz1.j * f3;
        qz1.k = qz1.k * f4;
        qz1.c = a;
        qz1.d = b;
        qz1.g();
        qz1.a(canvas);
        i1 = l1;
        j2 = k1;
        k1 = 1;
        l1 = j1;
        j1 = j2;
_L9:
        ao1.a();
        j2 = l1;
        l2 = k1;
        j3 = j1;
        k3 = i1;
        flag2 = flag;
        flag4 = flag3;
_L7:
        i2--;
        flag3 = flag4;
        flag = flag2;
        l1 = k3;
        k1 = j3;
        i1 = l2;
        j1 = j2;
          goto _L5
_L4:
        ra ra1;
        if (!(ao1 instanceof ra))
        {
            break MISSING_BLOCK_LABEL_1443;
        }
        ra1 = (ra)ao1;
        flag4 = flag3;
        flag2 = flag;
        k3 = l1;
        j3 = k1;
        l2 = i1;
        j2 = j1;
        if (ra1.q == 0) goto _L7; else goto _L6
_L6:
        flag4 = flag3;
        flag2 = flag;
        k3 = l1;
        j3 = k1;
        l2 = i1;
        j2 = j1;
        if (ra1.p == 0) goto _L7; else goto _L8
_L8:
        boolean flag1 = true;
        ra1.ad = ra1.ad * f1;
        ra1.e(ra1.ah, f1);
        ra1.Z = ra1.Z * f3;
        ra1.Y = ra1.Y * f4;
        ra1.ai = ra1.ai * f1;
        ra1.av = ra1.av * f3;
        ra1.aw = ra1.aw * f4;
        ra1.aa = ra1.aa * f1;
        ra1.j = ra1.j * f3;
        ra1.k = ra1.k * f4;
        ra1.c = a;
        ra1.d = b;
        ra1.i();
        ra1.b(a, b);
        ra1.k();
        ra1.b.postScale(ra1.h, ra1.h, ra1.o[16], ra1.o[17]);
        ra1.G.postScale(ra1.h, ra1.h, ra1.o[16], ra1.o[17]);
        ra1.H.postScale(ra1.h, ra1.h, ra1.o[16], ra1.o[17]);
        ra1.b(ra1.l);
        float af1[] = ra1.e();
        ra1.H.postTranslate(ra1.r[0] * f3 - af1[0], ra1.r[1] * f4 - af1[1]);
        ra1.G.postTranslate(ra1.r[0] * f3 - af1[0], ra1.r[1] * f4 - af1[1]);
        flag3 = ra1.ag;
        if (ra1.af != -21)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (ra1.ae != 0xff000000)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (ra1.P != 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ra1.a(canvas);
        l1 = i1;
        i1 = j1;
        j1 = k1;
        k1 = l1;
        l1 = ((flag1) ? 1 : 0);
          goto _L9
_L2:
        Object obj;
        if (D)
        {
            float f2 = (float)a * 0.2F;
            if (a > b)
            {
                f2 = (float)b * 0.2F;
            }
            rf.a();
            obj = rf.a(c, 0x7f020608, f2);
            Iterator iterator;
            String s1;
            if (((Bitmap) (obj)).getWidth() > ((Bitmap) (obj)).getHeight())
            {
                f2 /= ((Bitmap) (obj)).getWidth();
            } else
            {
                f2 /= ((Bitmap) (obj)).getHeight();
            }
            rf.a();
            obj = rf.a(((Bitmap) (obj)), f2, f2);
            if (a > b)
            {
                f2 = b;
            } else
            {
                f2 = a;
            }
            if (az.q == 4 || az.q == 5 && d == 0)
            {
                f2 *= 0.02F;
            } else
            if (d == 0)
            {
                f2 *= 0.04F;
            } else
            {
                f2 *= 0.055F;
            }
            canvas.drawBitmap(((Bitmap) (obj)), (float)(a - ((Bitmap) (obj)).getWidth()) - f2, (float)(b - ((Bitmap) (obj)).getHeight()) - f2, null);
            ((Bitmap) (obj)).recycle();
        }
        if (j1 != 0)
        {
            af.c(c, (new StringBuilder()).append(C).append("/Save/HasText").toString());
        }
        if (i1 != 0)
        {
            iterator = hashmap.keySet().iterator();
            for (obj = ""; iterator.hasNext(); obj = (new StringBuilder()).append(((String) (obj))).append("/").append(s1).append(":").append(i1).toString())
            {
                s1 = (String)iterator.next();
                i1 = ((Integer)hashmap.get(s1)).intValue();
            }

            af.c(c, (new StringBuilder()).append(C).append("/Save/HasSticker").append(((String) (obj))).toString());
        }
        if (l1 != 0)
        {
            af.c(c, (new StringBuilder()).append(C).append("/Save/HasTextBorder").toString());
        }
        if (flag3)
        {
            af.c(c, (new StringBuilder()).append(C).append("/Save/HasTextShadow").toString());
        }
        if (k1 != 0)
        {
            af.c(c, (new StringBuilder()).append(C).append("/Save/HasTextBackground").toString());
        }
        if (flag)
        {
            af.c(c, (new StringBuilder()).append(C).append("/Save/HasTextColor").toString());
        }
        canvas.restore();
        return;
        int k2 = l1;
        int i3 = k1;
        k1 = i1;
        l1 = j1;
        i1 = k2;
        j1 = i3;
          goto _L9
    }

    private void a(Canvas canvas, float f1, float f2, float f3, float f4, ig ig1, lc lc1, 
            Bitmap bitmap)
    {
        Paint paint;
        Matrix matrix;
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setFlags(5);
        matrix = new Matrix();
        matrix.postScale(ig1.r, ig1.s, (float)bitmap.getWidth() / 2.0F, (float)bitmap.getHeight() / 2.0F);
        matrix.postRotate(ig1.p, (float)bitmap.getWidth() / 2.0F, (float)bitmap.getHeight() / 2.0F);
        if (!ig1.B) goto _L2; else goto _L1
_L1:
        if (f1 / f2 > (float)bitmap.getWidth() / (float)bitmap.getHeight()) goto _L4; else goto _L3
_L3:
        float f5 = (1.0F * f1) / (float)bitmap.getWidth();
_L11:
        Object obj;
        Object obj1;
        matrix.postScale(ig1.v * f5, ig1.v * f5);
        matrix.postTranslate(((ig1.t * f1) / (float)ig1.C - ((float)bitmap.getWidth() / 2.0F) * ig1.v * f5) + f1 / 2.0F, ((ig1.u * f2) / (float)ig1.D - f5 * (((float)bitmap.getHeight() / 2.0F) * ig1.v)) + f2 / 2.0F);
        f5 = bitmap.getWidth();
        float f6 = bitmap.getHeight();
        float af1[] = new float[4];
        matrix.mapPoints(af1, new float[] {
            0.0F, 0.0F, f5, f6
        });
        float f11 = Math.min(af1[0], af1[2]);
        float f9 = Math.min(af1[1], af1[3]);
        float f10 = Math.max(af1[0], af1[2]);
        float f8 = Math.max(af1[1], af1[3]);
        f5 = 0.0F;
        f6 = 0.0F;
        if (ig1.E)
        {
            f5 = -f11;
        } else
        if (ig1.G)
        {
            f5 = f1 - f10;
        }
        if (ig1.F)
        {
            f6 = -f9;
        } else
        if (ig1.H)
        {
            f6 = f2 - f8;
        }
        matrix.postTranslate(f5, f6);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 6));
        obj1 = null;
        obj = obj1;
        if (!ig1.B) goto _L6; else goto _L5
_L5:
        obj = obj1;
        if (lc1.f) goto _L6; else goto _L7
_L7:
        obj = obj1;
        rf.a();
        obj = obj1;
        ig1 = rf.a(bitmap.getWidth(), bitmap.getHeight(), az.c);
        break MISSING_BLOCK_LABEL_452;
_L2:
        if (f1 / f2 > (float)bitmap.getWidth() / (float)bitmap.getHeight())
        {
            f5 = (1.0F * f1) / (float)bitmap.getWidth();
            continue; /* Loop/switch isn't completed */
        }
_L4:
        f5 = (1.0F * f2) / (float)bitmap.getHeight();
        continue; /* Loop/switch isn't completed */
        if (ig1 == null)
        {
            obj = ig1;
            try
            {
                throw new OutOfMemoryError((new StringBuilder("GridSaveUtils tmp==null width=")).append(f1).append("height=").append(f2).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas)
            {
                a(((Bitmap) (obj)));
            }
            canvas.printStackTrace();
            throw new OutOfMemoryError("addEffect oom");
        }
        obj = ig1;
        lc1 = new Canvas(ig1);
        obj = ig1;
        lc1.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        obj = ig1;
        obj1 = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        obj = ig1;
        Object obj2 = new Path();
        obj = ig1;
        ((Path) (obj2)).moveTo(0.0F, 0.0F);
        obj = ig1;
        ((Path) (obj2)).lineTo(bitmap.getWidth(), 0.0F);
        obj = ig1;
        ((Path) (obj2)).lineTo(bitmap.getWidth(), bitmap.getHeight());
        obj = ig1;
        ((Path) (obj2)).lineTo(0.0F, bitmap.getHeight());
        obj = ig1;
        ((Path) (obj2)).close();
        obj = ig1;
        obj2 = new ShapeDrawable(new PathShape(((Path) (obj2)), bitmap.getWidth(), bitmap.getHeight()));
        obj = ig1;
        ((ShapeDrawable) (obj2)).getPaint().setPathEffect(new CornerPathEffect(ih.C().V()));
        obj = ig1;
        ((ShapeDrawable) (obj2)).getPaint().setShader(((android.graphics.Shader) (obj1)));
        obj = ig1;
        ((ShapeDrawable) (obj2)).setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
        obj = ig1;
        ((ShapeDrawable) (obj2)).draw(lc1);
        obj = ig1;
        lc1.save();
        obj = ig1;
        canvas.drawBitmap(ig1, matrix, paint);
        obj = ig1;
        if (!aa.a().g())
        {
            break MISSING_BLOCK_LABEL_929;
        }
        obj = ig1;
        canvas = ig1;
        if (az.q == 5)
        {
            break MISSING_BLOCK_LABEL_941;
        }
        obj = ig1;
        canvas = ig1;
        if (az.q == 9)
        {
            break MISSING_BLOCK_LABEL_941;
        }
        obj = ig1;
        canvas = ig1;
        if (az.q == 10)
        {
            break MISSING_BLOCK_LABEL_941;
        }
        obj = ig1;
        a(bitmap);
        canvas = ig1;
_L9:
        obj = canvas;
        a(((Bitmap) (canvas)));
        return;
_L6:
        obj = obj1;
        rf.a();
        obj = obj1;
        ig1 = rf.a(Math.round(f1), Math.round(f2), az.c);
        if (ig1 != null)
        {
            break MISSING_BLOCK_LABEL_1021;
        }
        obj = ig1;
        throw new OutOfMemoryError((new StringBuilder("GridSaveUtils tmp==null width=")).append(f1).append("height=").append(f2).toString());
        obj = ig1;
        obj1 = new Canvas(ig1);
        obj = ig1;
        ((Canvas) (obj1)).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        obj = ig1;
        ((Canvas) (obj1)).drawBitmap(bitmap, matrix, paint);
        obj = ig1;
        ((Canvas) (obj1)).save();
        obj = ig1;
        if (!aa.a().g())
        {
            break MISSING_BLOCK_LABEL_1127;
        }
        obj = ig1;
        if (az.q == 5)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        obj = ig1;
        if (az.q == 9)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        obj = ig1;
        if (az.q == 10)
        {
            break MISSING_BLOCK_LABEL_1136;
        }
        obj = ig1;
        a(bitmap);
        obj = ig1;
        bitmap = new BitmapShader(ig1, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        obj = ig1;
        f5 = ih.C().V();
        obj = ig1;
        float f7 = w;
        obj = ig1;
        lc1 = new ShapeDrawable(new PathShape(a(lc1, f3, f4), f1, f2));
        obj = ig1;
        lc1.getPaint().setPathEffect(new CornerPathEffect(f5 * f7));
        obj = ig1;
        lc1.getPaint().setShader(bitmap);
        obj = ig1;
        lc1.setBounds(0, 0, Math.round(f1), Math.round(f2));
        obj = ig1;
        lc1.draw(canvas);
        canvas = ig1;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void a(Canvas canvas, Bitmap bitmap)
    {
        boolean flag2;
        boolean flag1 = false;
        boolean flag = false;
        if (az.q != 4)
        {
            a(d, e, new int[] {
                f, g
            });
            canvas.save();
            Paint paint = new Paint();
            paint.setColor(0);
            canvas.drawRect(0.0F, 0.0F, a, b, paint);
            if (d == -1)
            {
                a(1, 0, new int[0]);
                d = 1;
            }
            PorterDuffXfermode porterduffxfermode = new PorterDuffXfermode(android.graphics.PorterDuff.Mode.MULTIPLY);
            paint.setColor(-1);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 7));
            if (ih.C().be() && (az.q == 5 || az.q == 10 || az.q == 9))
            {
                int i1 = ih.C().bd() / 5 + 1;
                float f1;
                float f3;
                float f5;
                float f6;
                float f7;
                Object obj;
                Paint paint1;
                int j2;
                if (t[0].b != null)
                {
                    obj = t[0].b;
                } else
                {
                    obj = t[0].n;
                }
                if (bitmap != null && !bitmap.isRecycled())
                {
                    obj = com.roidapp.imagelib.b.c.a(bitmap, i1);
                } else
                {
                    obj = com.roidapp.imagelib.b.c.a(((String) (obj)), i1);
                }
                a(bitmap);
                bitmap = new Matrix();
                i1 = ((Bitmap) (obj)).getWidth();
                j2 = ((Bitmap) (obj)).getHeight();
                f1 = (float)a / (float)i1;
                f3 = (float)b / (float)j2;
                if (f1 <= f3)
                {
                    f1 = f3;
                }
                f3 = (float)a / 2.0F;
                f5 = (float)i1 / 2.0F;
                f6 = (float)b / 2.0F;
                f7 = (float)j2 / 2.0F;
                paint1 = new Paint();
                paint1.setAntiAlias(true);
                paint1.setFilterBitmap(true);
                bitmap.postTranslate(f3 - f5, f6 - f7);
                bitmap.postScale(f1, f1, (float)a / 2.0F, (float)b / 2.0F);
                canvas.drawBitmap(((Bitmap) (obj)), bitmap, paint1);
                a(((Bitmap) (obj)));
            } else
            {
                int j1 = 0;
                while (j1 < n) 
                {
                    for (int k2 = 0; k2 < m; k2++)
                    {
                        canvas.drawBitmap(k, k.getWidth() * k2, k.getHeight() * j1, null);
                    }

                    j1++;
                }
            }
            a(30);
            a(k);
            paint.setXfermode(porterduffxfermode);
            if (a > b)
            {
                bitmap = new Matrix();
                bitmap.setRectToRect(new RectF(0.0F, 0.0F, j.getWidth() + l * i.getWidth() + h.getWidth(), j.getHeight()), new RectF(0.0F, 0.0F, a, b), android.graphics.Matrix.ScaleToFit.FILL);
                canvas.concat(bitmap);
                canvas.drawBitmap(j, 0.0F, 0.0F, paint);
                a(j);
                for (i1 = ((flag) ? 1 : 0); i1 < l; i1++)
                {
                    canvas.drawBitmap(i, j.getWidth() + i.getWidth() * i1, 0.0F, paint);
                }

                a(i);
                canvas.drawBitmap(h, j.getWidth() + l * i.getWidth(), 0.0F, paint);
                a(h);
            } else
            {
                bitmap = new RectF(0.0F, 0.0F, j.getWidth(), j.getHeight() + l * i.getHeight() + h.getHeight());
                RectF rectf = new RectF(0.0F, 0.0F, a, b);
                Matrix matrix = new Matrix();
                matrix.setRectToRect(bitmap, rectf, android.graphics.Matrix.ScaleToFit.FILL);
                canvas.concat(matrix);
                canvas.drawBitmap(j, 0.0F, 0.0F, paint);
                a(j);
                for (int k1 = ((flag1) ? 1 : 0); k1 < l; k1++)
                {
                    canvas.drawBitmap(i, 0.0F, j.getHeight() + i.getHeight() * k1, paint);
                }

                a(i);
                canvas.drawBitmap(h, 0.0F, j.getHeight() + l * i.getHeight(), paint);
                a(h);
            }
            a(32);
            canvas.setMatrix(new Matrix());
            if (q)
            {
                paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DARKEN));
                canvas.drawRect(0.0F, 0.0F, a, b, paint);
            }
            paint.setXfermode(null);
            canvas.restore();
            af.c(c, (new StringBuilder()).append(C).append("/Save/Background/").append(t.length).append("/").append(ih.C().I()).append("/postion: ").append(e).append("/mPattenIndex0: ").append(f).append("/mPattenIndex1: ").append(g).append("/mShapeIndex: ").append(d).toString());
            return;
        }
        bitmap = ih.C().e();
        flag2 = ih.C().f();
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        a(d, e, new int[] {
            f, g
        });
_L4:
        canvas.save();
        a(canvas, flag2);
        canvas.restore();
        if (bitmap == null)
        {
            a(j);
            a(i);
            a(h);
        }
        a(k);
        return;
_L2:
        if (!flag2)
        {
            break; /* Loop/switch isn't completed */
        }
        if (bitmap != null)
        {
            k = BitmapFactory.decodeFile(bitmap);
            if (k == null)
            {
                throw new OutOfMemoryError("save bg create decodeBitmap null createBgRepeat");
            }
            int l1;
            if (a % k.getWidth() != 0)
            {
                l1 = a / k.getWidth() + 1;
            } else
            {
                l1 = a / k.getWidth();
            }
            m = l1;
            if (b % k.getHeight() != 0)
            {
                l1 = b / k.getHeight() + 1;
            } else
            {
                l1 = b / k.getHeight();
            }
            n = l1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (bitmap != null)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(bitmap, options);
            int l2 = options.outWidth / a;
            int i2 = l2;
            if (l2 > options.outHeight / b)
            {
                i2 = options.outHeight / b;
            }
            l2 = i2;
            if (i2 <= 0)
            {
                l2 = 1;
            }
            options.inSampleSize = l2;
            options.inJustDecodeBounds = false;
            Bitmap bitmap1 = BitmapFactory.decodeFile(bitmap, options);
            float f2 = (float)a / (float)options.outWidth;
            float f4 = (float)b / (float)options.outHeight;
            if (bitmap1 == null)
            {
                throw new OutOfMemoryError("save bg create decodeBitmap null createBgSingle1");
            }
            rf.a();
            k = rf.a(bitmap1, f2, f4);
            if (k == null)
            {
                throw new OutOfMemoryError("save bg create decodeBitmap null createBgSingle2");
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void a(Canvas canvas, boolean flag)
    {
        if (flag)
        {
            k.setDensity(canvas.getDensity());
            for (int i1 = 0; i1 < n; i1++)
            {
                for (int j1 = 0; j1 < m; j1++)
                {
                    canvas.drawBitmap(k, k.getWidth() * j1, k.getHeight() * i1, null);
                }

            }

        } else
        {
            canvas.drawBitmap(k, 0.0F, 0.0F, null);
        }
    }

    private static void a(String as[])
    {
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        if (as.length == 2)
        {
            as = new File(as[1]);
            if (as.exists())
            {
                as.delete();
            }
        }
        return;
        as;
        as.printStackTrace();
        return;
    }

    private String[] a(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, String s1, boolean flag)
    {
        Object obj;
        Object obj1;
        Object obj3;
        Calendar calendar;
        String s3;
        calendar = Calendar.getInstance();
        Object obj2;
        int i1;
        if (!flag)
        {
            if (az.q == 9)
            {
                obj = (new StringBuilder()).append(ImageLibrary.a().b(c));
                ImageLibrary.a();
                obj = ((StringBuilder) (obj)).append(ImageLibrary.e()).toString();
            } else
            if (az.q == 10)
            {
                obj = (new StringBuilder()).append(ImageLibrary.a().b(c));
                ImageLibrary.a();
                obj = ((StringBuilder) (obj)).append(ImageLibrary.b()).toString();
            } else
            {
                obj = a(c);
            }
        } else
        {
            obj = b(c);
        }
        obj1 = new File(((String) (obj)));
        if (((File) (obj1)).exists() || ((File) (obj1)).mkdirs()) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT != 19) goto _L4; else goto _L3
_L3:
        obj2 = new ae(c.getContentResolver(), ((File) (obj1)));
        try
        {
            ((ae) (obj2)).a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            obj1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(c.getString(0x7f07002e)).toString();
            obj = new File(((String) (obj1)));
            if (!((File) (obj)).exists() && !((File) (obj)).mkdirs())
            {
                a(bitmap);
                return (new String[] {
                    "2", obj1
                });
            }
            ap.a(c, ((String) (obj1)));
            continue; /* Loop/switch isn't completed */
        }
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
_L14:
        a(80);
        obj1 = new File(((String) (obj1)), (new StringBuilder("PhotoGrid_")).append(calendar.getTimeInMillis()).append(s1).toString());
        try
        {
            ((File) (obj1)).createNewFile();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3)
        {
            ((IOException) (obj3)).printStackTrace();
            if (android.os.Build.VERSION.SDK_INT <= 18)
            {
                String s2 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(c.getString(0x7f07002e)).toString();
                obj1 = new File(s2, (new StringBuilder("PhotoGrid_")).append(calendar.getTimeInMillis()).append(s1).toString());
                try
                {
                    ((File) (obj1)).createNewFile();
                }
                // Misplaced declaration of an exception variable
                catch (android.graphics.Bitmap.CompressFormat compressformat)
                {
                    compressformat.printStackTrace();
                    a(bitmap);
                    return (new String[] {
                        "1", ((File) (obj)).getAbsolutePath()
                    });
                }
                ap.a(c, s2);
            }
        }
        try
        {
            a(81);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.CompressFormat compressformat)
        {
            a(bitmap);
            compressformat.printStackTrace();
            return (new String[] {
                "2", ""
            });
        }
        obj2 = null;
        if (((File) (obj1)).isFile() && ((File) (obj1)).canWrite()) goto _L6; else goto _L5
_L5:
        i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 <= 18) goto _L8; else goto _L7
_L7:
        obj = obj2;
        obj2 = (new ae(c.getContentResolver(), ((File) (obj1)))).b();
        obj = obj2;
        if (obj2 != null) goto _L10; else goto _L9
_L9:
        obj = obj2;
        throw new IOException("4.4 IOException");
        obj1;
        ((Exception) (obj1)).printStackTrace();
        s3 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(c.getString(0x7f07002e)).toString();
        obj3 = new File(s3);
        if (((File) (obj3)).exists() || ((File) (obj3)).mkdirs()) goto _L12; else goto _L11
_L11:
        a(bitmap);
        return (new String[] {
            "2", s3
        });
_L4:
        a(bitmap);
        return (new String[] {
            "2", obj
        });
_L12:
        obj1 = new File(s3, (new StringBuilder("PhotoGrid_")).append(calendar.getTimeInMillis()).append(s1).toString());
        ((File) (obj1)).createNewFile();
        ap.a(c, s3);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_759;
        }
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
        obj = new FileOutputStream(((File) (obj1)));
_L10:
        bitmap.compress(compressformat, 100, ((OutputStream) (obj)));
        a(90);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_801;
        }
        ((OutputStream) (obj)).flush();
        ((OutputStream) (obj)).close();
        a(92);
        a(bitmap);
        compressformat = ((File) (obj1)).getAbsolutePath();
        return (new String[] {
            "0", compressformat
        });
        compressformat;
        compressformat.printStackTrace();
        a(bitmap);
        return (new String[] {
            "1", s2.getAbsolutePath()
        });
_L8:
        a(bitmap);
        return (new String[] {
            "1", ((File) (obj)).getAbsolutePath()
        });
_L6:
        obj = new FileOutputStream(((File) (obj1)));
          goto _L10
_L2:
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private String[] a(ig ig1, String s1, lc lc1, float f1, float f2, float f3, float f4, 
            float f5, float f6, boolean flag)
    {
        Bitmap bitmap;
        Object obj1 = null;
        Object obj3 = null;
        Object obj;
        Object obj2;
        Canvas canvas;
        int i1;
        int j1;
        if (s1 != null)
        {
            rf.a();
            obj2 = com.roidapp.photogrid.release.rf.b(s1, Math.round(f3), Math.round(f4));
        } else
        {
            obj2 = null;
        }
        obj = obj1;
        Log.e("drawSingle", "isOldModel");
        obj = obj1;
        i1 = Math.round(f3);
        obj = obj1;
        j1 = Math.round(f4);
        obj = obj1;
        rf.a();
        obj = obj1;
        obj1 = rf.a(ig1, j1, i1, Boolean.valueOf(flag));
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj = obj1;
        try
        {
            throw new OutOfMemoryError("GridSaveUtils b is null");
        }
        // Misplaced declaration of an exception variable
        catch (ig ig1)
        {
            s1 = ((String) (obj));
        }
        lc1 = obj3;
_L20:
        if (s1 != null && !s1.isRecycled())
        {
            s1.recycle();
        }
        if (lc1 != null && !lc1.isRecycled())
        {
            lc1.recycle();
        }
        ig1.printStackTrace();
        throw new OutOfMemoryError("save normal size oom");
_L2:
        obj = obj1;
        s1 = ((String) (obj1));
        if (az.q == 9) goto _L4; else goto _L3
_L3:
        obj = obj1;
        if (az.q != 8) goto _L6; else goto _L5
_L5:
        obj = obj1;
        obj1 = com.roidapp.photogrid.filter.b.a(com.roidapp.photogrid.filter.b.b(c), ((Bitmap) (obj1)), ig1);
_L7:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj = obj1;
        s1 = ((String) (obj1));
        if (!((Bitmap) (obj1)).isRecycled())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        throw new OutOfMemoryError("filterBitmap process failed");
_L6:
        obj = obj1;
        obj1 = com.roidapp.photogrid.filter.b.a(com.roidapp.photogrid.filter.b.a(c), ((Bitmap) (obj1)), ig1);
        if (true) goto _L7; else goto _L4
_L4:
        obj = s1;
        rf.a();
        obj = s1;
        bitmap = rf.a(Math.round(f3), Math.round(f4), az.c);
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        throw new OutOfMemoryError("GridSaveUtils bitmap is null");
        obj = new Canvas(bitmap);
        a(((Canvas) (obj)), f3, f4, f1, f2, ig1, lc1, ((Bitmap) (s1)));
        if (!aa.a().g() || az.q != 5 && az.q != 9 && az.q != 10)
        {
            a(((Bitmap) (s1)));
        }
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        obj1 = new Paint();
        ((Paint) (obj1)).setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        ((Canvas) (obj)).drawBitmap(((Bitmap) (obj2)), new Matrix(), ((Paint) (obj1)));
        a(((Bitmap) (obj2)));
        f3 = ih.C().R();
        if (d == 0 && ih.C().t() == 1.0F && ih.C().I() == 0)
        {
            f1 = ((lc1.j - f3) * f1) / 100F + f5 / 2.0F;
            f2 = ((lc1.k - f3) * f2) / 100F + f6 / 2.0F;
        } else
        {
            f1 = (lc1.j * f1) / 100F + f5 / 2.0F;
            f2 = (lc1.k * f2) / 100F + f6 / 2.0F;
        }
        obj3 = null;
        lc1 = null;
        obj = lc1;
        rf.a();
        obj = lc1;
        lc1 = rf.a(a, b, az.c);
        obj = lc1;
        a(25);
        if (lc1 != null) goto _L9; else goto _L8
_L8:
        obj = lc1;
        throw new OutOfMemoryError("GridSaveUtils bitmap is null");
        ig1;
        s1 = lc1;
        lc1 = null;
_L18:
        a(((String []) (lc1)));
        a(((Bitmap) (s1)));
        ig1.printStackTrace();
        throw new OutOfMemoryError("GridSaveUtils doSave() OOM");
_L9:
        obj = lc1;
        canvas = new Canvas(lc1);
        obj = lc1;
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 6));
        obj = lc1;
        if (y != 1) goto _L11; else goto _L10
_L10:
        obj = lc1;
        if (c()) goto _L13; else goto _L12
_L12:
        obj = lc1;
        q = true;
        obj = lc1;
        canvas.drawColor(-1);
_L14:
        obj2 = ".png";
        obj = lc1;
        obj1 = android.graphics.Bitmap.CompressFormat.PNG;
        obj = obj2;
_L15:
        obj2 = obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_732;
        }
        obj2 = ".jpg";
        obj = lc1;
        obj1 = android.graphics.Bitmap.CompressFormat.JPEG;
        obj = lc1;
        a(26);
        obj = lc1;
        if (r)
        {
            break MISSING_BLOCK_LABEL_773;
        }
        obj = lc1;
        if (!aa.a().g())
        {
            s1 = null;
        }
        obj = lc1;
        a(canvas, ((Bitmap) (s1)));
        obj = lc1;
        canvas.drawBitmap(bitmap, f1, f2, null);
        obj = lc1;
        a(bitmap);
        obj = lc1;
        a(canvas);
        obj = lc1;
        b(canvas);
        obj = lc1;
        s1 = a(((Bitmap) (lc1)), ((android.graphics.Bitmap.CompressFormat) (obj1)), ((String) (obj2)), flag);
        if (!s1[0].equals("0") || y != 2)
        {
            break MISSING_BLOCK_LABEL_876;
        }
        ig1 = ig1.n;
        obj = s1[1];
        if (android.os.Build.VERSION.SDK_INT > 5)
        {
            bp.a();
            bp.a(ig1, ((String) (obj)));
        }
        a(90);
        return s1;
_L13:
        obj = lc1;
        q = false;
          goto _L14
        ig1;
        s1 = obj3;
        lc1 = ((lc) (obj));
_L16:
        a(((String []) (s1)));
        a(((Bitmap) (lc1)));
        ig1.printStackTrace();
        throw new OutOfMemoryError("GridSaveUtils doSave() OOM");
_L11:
        obj = lc1;
        q = true;
        obj2 = ".jpg";
        obj = lc1;
        obj1 = android.graphics.Bitmap.CompressFormat.JPEG;
        obj = lc1;
        canvas.drawColor(-1);
        obj = obj2;
          goto _L15
        ig1;
          goto _L16
        ig1;
        s1 = null;
        lc1 = null;
        continue; /* Loop/switch isn't completed */
        ig1;
        obj = s1;
        s1 = lc1;
        lc1 = ((lc) (obj));
        if (true) goto _L18; else goto _L17
_L17:
        ig1;
        lc1 = bitmap;
        if (true) goto _L20; else goto _L19
_L19:
    }

    private void b(Canvas canvas)
    {
        Object obj = B.a();
        if (obj == null || ((ArrayList) (obj)).size() <= 0)
        {
            return;
        }
        af.c(c, (new StringBuilder()).append(C).append("/Save/HasDoodle").toString());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.saveLayer(null, paint, 31);
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ay)((Iterator) (obj)).next()).a(canvas, w, paint)) { }
        canvas.restore();
    }

    private void b(Canvas canvas, boolean flag)
    {
        Object obj;
        Bitmap bitmap;
        float f2 = 2.0F * u;
        float f7 = v * 2.0F;
        float f1 = (float)a - f2;
        float f4 = (float)b - f7;
        float f3;
        float f6;
        float f8;
        float f9;
        float f10;
        Object obj1;
        Bitmap bitmap1;
        Paint paint;
        HashSet hashset;
        ig ig1;
        lc lc1;
        boolean flag1;
        int i1;
        int j1;
        int k1;
        if (E)
        {
            if (f1 > f4)
            {
                float f5 = f4;
                f3 = (f1 - f4) + f2;
                f2 = f7;
                f1 = f5;
            } else
            {
                f3 = f1;
                f6 = f1;
                f8 = f7 + (f4 - f1);
                f7 = f2;
                f1 = f6;
                f4 = f3;
                f2 = f8;
                f3 = f7;
            }
        } else
        {
            f3 = f2;
            f2 = f7;
        }
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        hashset = new HashSet();
        i1 = 0;
        flag1 = false;
        if (i1 >= t.length) goto _L2; else goto _L1
_L1:
        ig1 = t[i1];
        lc1 = ig1.y;
        if (!flag1)
        {
            if (ig1.b == null)
            {
                obj = ig1.n;
            } else
            {
                obj = ig1.b;
            }
            if (!hashset.add(obj))
            {
                flag1 = true;
            }
        }
        k1 = (int)Math.floor((lc1.j * f1) / 100F);
        j1 = (int)Math.floor((lc1.k * f4) / 100F);
        f6 = (float)Math.ceil((lc1.l / 100F) * f1);
        f7 = (float)Math.ceil((lc1.m / 100F) * f4);
        k1 = (int)((float)k1 + f3 / 2.0F);
        j1 = (int)((float)j1 + f2 / 2.0F);
        Log.e("save", "*****************************************************************");
        if (s != null && !s.isEmpty())
        {
            obj = (String)s.get(i1);
        } else
        {
            obj = null;
        }
        f8 = k1;
        f9 = j1;
        obj1 = null;
        paint = null;
        if (obj != null)
        {
            rf.a();
            bitmap1 = com.roidapp.photogrid.release.rf.b(((String) (obj)), (int)f6, (int)f7);
        } else
        {
            bitmap1 = null;
        }
        obj = obj1;
        Log.e("drawGrid", "isOldModel");
        obj = obj1;
        j1 = Math.round(f6);
        obj = obj1;
        k1 = Math.round(f7);
        obj = obj1;
        rf.a();
        obj = obj1;
        obj1 = rf.a(ig1, k1, j1, Boolean.valueOf(flag));
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        obj = obj1;
        try
        {
            throw new OutOfMemoryError("GridSaveUtils b is null");
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            obj1 = obj;
        }
        obj = paint;
_L10:
        if (obj1 != null && !((Bitmap) (obj1)).isRecycled())
        {
            ((Bitmap) (obj1)).recycle();
        }
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        canvas.printStackTrace();
        throw new OutOfMemoryError("save normal size oom");
_L4:
        obj = obj1;
        j1 = ((Bitmap) (obj1)).getWidth();
        obj = obj1;
        if (az.q != 8) goto _L6; else goto _L5
_L5:
        obj = obj1;
        bitmap = com.roidapp.photogrid.filter.b.a(com.roidapp.photogrid.filter.b.b(c), ((Bitmap) (obj1)), ig1);
_L8:
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_581;
        }
        obj = bitmap;
        if (!bitmap.isRecycled())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = bitmap;
        throw new OutOfMemoryError("filterBitmap process failed");
_L6:
        obj = obj1;
        bitmap = com.roidapp.photogrid.filter.b.a(com.roidapp.photogrid.filter.b.a(c), ((Bitmap) (obj1)), ig1);
        if (true) goto _L8; else goto _L7
_L7:
        obj = bitmap;
        k1 = bitmap.getWidth();
        obj1 = bitmap;
        if (k1 >= j1)
        {
            break MISSING_BLOCK_LABEL_677;
        }
        obj = bitmap;
        f10 = (float)j1 / (float)k1;
        obj = bitmap;
        rf.a();
        obj = bitmap;
        obj1 = rf.a(bitmap, f10, f10);
        obj = obj1;
        rf.a();
        obj = obj1;
        bitmap = rf.a((int)Math.ceil(f6), (int)Math.ceil(f7), az.c);
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_727;
        }
        throw new OutOfMemoryError("bitmap is null");
        obj = new Canvas(bitmap);
        a(((Canvas) (obj)), f6, f7, f1, f4, ig1, lc1, ((Bitmap) (obj1)));
        a(((Bitmap) (obj1)));
        if (bitmap1 == null)
        {
            break MISSING_BLOCK_LABEL_813;
        }
        paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        ((Canvas) (obj)).drawBitmap(bitmap1, new Matrix(), paint);
        a(bitmap1);
        canvas.drawBitmap(bitmap, Math.round(f8), Math.round(f9), null);
        a(bitmap);
        a(i1 * 4 + 42);
        i1++;
        break MISSING_BLOCK_LABEL_97;
_L2:
        hashset.clear();
        return;
        canvas;
        obj = bitmap;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private boolean c()
    {
        return c.getSharedPreferences(c.getPackageName(), 0).getBoolean("SHARE_BORDER", false);
    }

    public final void a(float f1)
    {
        w = f1;
        p = (float)(int)((float)c.getResources().getDisplayMetrics().widthPixels * f1) / (1280F * c.getResources().getDisplayMetrics().density);
    }

    public final void a(float f1, float f2, float f3)
    {
        v = f1;
        u = f2;
        w = f3;
        p = (float)(int)((float)c.getResources().getDisplayMetrics().widthPixels * f3) / (1280F * c.getResources().getDisplayMetrics().density);
    }

    public final void a(int i1, int j1, int k1, int l1)
    {
        d = i1;
        e = j1;
        f = k1;
        g = l1;
    }

    public final void a(List list)
    {
        s = list;
    }

    public final void a(boolean flag)
    {
        r = flag;
    }

    public final void b()
    {
        E = true;
    }

    public final void b(boolean flag)
    {
        D = flag;
    }

    public final String[] c(boolean flag)
    {
        Canvas canvas;
        canvas = null;
        Object obj1 = null;
        if (az.q == 5)
        {
            if (az.q != 4 && d == 0 && e == -20 && f == 4 && g == 4 && ih.C().t() == 1.0F && ih.C().I() == 0 && !ih.C().be())
            {
                r = true;
            }
            float f3 = 2.0F * u;
            float f4 = 2.0F * v;
            float f1 = (float)a - f3;
            float f2 = (float)b - f4;
            float f5;
            float f6;
            String s1;
            lc lc1;
            if (E)
            {
                if (f1 > f2)
                {
                    f3 += f1 - f2;
                    f1 = f2;
                } else
                {
                    f4 += f2 - f1;
                    f2 = f1;
                }
            }
            lc1 = t[0].y;
            f5 = (lc1.l * f1) / 100F;
            f6 = (lc1.m * f2) / 100F;
            Log.e("save", "*****************************************************************");
            s1 = obj1;
            if (s != null)
            {
                s1 = obj1;
                if (!s.isEmpty())
                {
                    s1 = (String)s.get(0);
                }
            }
            return a(t[0], s1, lc1, f1, f2, f5, f6, f3, f4, flag);
        }
        Object obj2;
        rf.a();
        obj2 = rf.a(a, b, az.c);
        a(25);
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        throw new OutOfMemoryError("GridSaveUtils doSave create bitmap oom");
        Object obj;
        obj;
        String as[] = null;
_L10:
        a(as);
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            ((Bitmap) (obj2)).recycle();
        }
        ((OutOfMemoryError) (obj)).printStackTrace();
        throw new OutOfMemoryError("GridSaveUtils doSave() OOM");
_L2:
        canvas = new Canvas(((Bitmap) (obj2)));
        if (y != 1) goto _L4; else goto _L3
_L3:
        if (c()) goto _L6; else goto _L5
_L5:
        q = true;
        canvas.drawColor(-1);
_L7:
        obj = ".png";
        as = android.graphics.Bitmap.CompressFormat.PNG;
_L8:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        obj = ".jpg";
        as = android.graphics.Bitmap.CompressFormat.JPEG;
        a(26);
        if (!r)
        {
            a(canvas, ((Bitmap) (null)));
        }
        b(canvas, flag);
        a(canvas);
        b(canvas);
        as = a(((Bitmap) (obj2)), as, ((String) (obj)), flag);
        try
        {
            if (!as[0].equals("0") || y != 2)
            {
                break MISSING_BLOCK_LABEL_511;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = as[1];
        if (android.os.Build.VERSION.SDK_INT > 5)
        {
            bp.a();
            bp.a(((String) (obj)));
        }
        a(90);
        return as;
_L6:
        q = false;
          goto _L7
_L4:
        q = true;
        obj = ".jpg";
        as = android.graphics.Bitmap.CompressFormat.JPEG;
        canvas.drawColor(-1);
          goto _L8
        obj;
        as = null;
        obj2 = canvas;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
