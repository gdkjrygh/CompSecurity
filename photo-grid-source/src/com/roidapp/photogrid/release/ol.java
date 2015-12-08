// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Environment;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.roidapp.baselib.c.p;
import com.roidapp.imagelib.filter.aa;
import com.roidapp.photogrid.common.ae;
import com.roidapp.photogrid.common.af;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bp;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.filter.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.release:
//            oi, ih, PhotoView, ao, 
//            qz, ps, rf, ra, 
//            PhotoGridActivity, az, ay, ap, 
//            mm, ml, om, on, 
//            ig

public final class ol extends oi
{

    private int A;
    private float B;
    private final int C = 1280;
    private mm r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private Bitmap y;
    private int z;

    public ol(Activity activity, ig aig[], ml ml1, PhotoView photoview, mm mm1, com.roidapp.photogrid.release.az az1)
    {
        u = -1;
        b = activity;
        c = aig;
        d = ml1;
        g = photoview;
        r = mm1;
        h = az1;
    }

    private void a(float f, int i, int j, Bitmap bitmap)
    {
        Canvas canvas;
        HashMap hashmap;
        List list;
        NinePatchDrawable ninepatchdrawable;
        int k;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        boolean flag1;
        j1 = 0;
        k = 0;
        i1 = 0;
        k1 = 0;
        flag1 = false;
        i2 = 0;
        canvas = new Canvas(bitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 7));
        bitmap = ih.C();
        s = i;
        t = j;
        B = (float)(int)((float)b.getResources().getDisplayMetrics().widthPixels * f) / (1280F * b.getResources().getDisplayMetrics().density);
        u = bitmap.A();
        v = bitmap.x();
        w = bitmap.y();
        x = bitmap.z();
        a(canvas);
        c(35);
        list = g.e();
        ninepatchdrawable = (NinePatchDrawable)b.getResources().getDrawable(0x7f0205c8);
        hashmap = new HashMap();
        l1 = list.size() - 1;
_L5:
        if (l1 < 0) goto _L2; else goto _L1
_L1:
        ao ao1 = ((ao)list.get(l1)).a(b);
        if (!(ao1 instanceof qz)) goto _L4; else goto _L3
_L3:
        bitmap = (qz)ao1;
        int j2;
        if (hashmap.containsKey(((qz) (bitmap)).T))
        {
            k = ((Integer)hashmap.get(((qz) (bitmap)).T)).intValue();
            hashmap.put(((qz) (bitmap)).T, Integer.valueOf(k + 1));
        } else
        {
            hashmap.put(((qz) (bitmap)).T, Integer.valueOf(1));
        }
        if (!"text".equals(((qz) (bitmap)).T) && (".thanksgiving".equals(((qz) (bitmap)).T) || ".givethanks".equals(((qz) (bitmap)).T)))
        {
            az.F = true;
        }
        bitmap.j = ((qz) (bitmap)).j * f;
        bitmap.k = ((qz) (bitmap)).k * f;
        bitmap.c = i;
        bitmap.d = j;
        bitmap.g();
        bitmap.a(canvas);
        k = k1;
        j2 = 1;
        k1 = j1;
        j1 = j2;
_L12:
        ao1.a();
        j2 = l1 - 1;
        l1 = k1;
        k1 = k;
        k = j1;
        j1 = l1;
        l1 = j2;
          goto _L5
_L4:
        if (!(ao1 instanceof ps)) goto _L7; else goto _L6
_L6:
        rf.a();
        bitmap = rf.a(ao1.g, (int)(((double)ao1.q - 4D * (double)ao1.h * (double)ao1.i) * (double)f));
        if (bitmap != null) goto _L9; else goto _L8
_L8:
        return;
_L9:
        if (aa.a().g())
        {
            Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth() * 2, bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            if (bitmap1 != null)
            {
                bitmap1.recycle();
            }
        }
        int k2 = bitmap.getWidth();
        float f1;
        Bitmap bitmap2;
        int i3;
        if (az.q == 8)
        {
            bitmap = b.a(b.b(b), bitmap, ((ps)ao1).H);
        } else
        {
            bitmap = b.a(b.a(b), bitmap, ((ps)ao1).H);
        }
        if (bitmap == null || bitmap.isRecycled()) goto _L8; else goto _L10
_L10:
        i3 = bitmap.getWidth();
        bitmap2 = bitmap;
        if (i3 >= k2)
        {
            break; /* Loop/switch isn't completed */
        }
        f1 = (float)k2 / (float)i3;
        rf.a();
        bitmap2 = rf.a(bitmap, f1, f1);
        if (bitmap2 == null || bitmap2.isRecycled()) goto _L8; else goto _L11
_L11:
        f1 = ao1.i;
        ((ps)ao1).J = true;
        ao1.i = f1 * f * ao1.h;
        ((ps)ao1).P = f1 * f;
        ((ps)ao1).N = ((ps)ao1).N * f;
        ((ps)ao1).O = ((ps)ao1).O * f;
        f1 = (float)bitmap2.getWidth() / ((ps)ao1).N;
        float f2 = (float)bitmap2.getHeight() / ((ps)ao1).O;
        if (f1 > f2)
        {
            ((ps)ao1).Q = f1;
        } else
        {
            ((ps)ao1).Q = f2;
        }
        ao1.d = j;
        ao1.c = i;
        ao1.j = ao1.j * f;
        ao1.k = ao1.k * f;
        ((ps)ao1).a(ninepatchdrawable);
        ((ps)ao1).a(b.getResources().getDisplayMetrics().densityDpi, true);
        ((ps)ao1).c(ao1.i);
        ((ps)ao1).a(bitmap2, true);
        ((ps)ao1).a(canvas);
        i3 = k1;
        k1 = k;
        k2 = j1;
        k = i3;
        j1 = k1;
        k1 = k2;
          goto _L12
_L7:
        boolean flag = true;
        bitmap = (ra)ao1;
        bitmap.ad = ((ra) (bitmap)).ad * f;
        bitmap.e(((ra) (bitmap)).ah, f);
        bitmap.Y = ((ra) (bitmap)).Y * f;
        bitmap.Z = ((ra) (bitmap)).Z * f;
        bitmap.ai = ((ra) (bitmap)).ai * f;
        bitmap.av = ((ra) (bitmap)).av * f;
        bitmap.aw = ((ra) (bitmap)).aw * f;
        bitmap.aa = ((ra) (bitmap)).aa * f;
        bitmap.d = (int)((float)((ra) (bitmap)).d * f);
        bitmap.c = (int)((float)((ra) (bitmap)).c * f);
        bitmap.i();
        float af1[];
        int l2;
        if (i > j)
        {
            bitmap.e((float)i / (1280F * b.getResources().getDisplayMetrics().density));
        } else
        {
            bitmap.e((float)j / (1280F * b.getResources().getDisplayMetrics().density));
        }
        bitmap.k();
        ((ra) (bitmap)).b.postScale(((ra) (bitmap)).h, ((ra) (bitmap)).h, ((ra) (bitmap)).o[16], ((ra) (bitmap)).o[17]);
        ((ra) (bitmap)).G.postScale(((ra) (bitmap)).h, ((ra) (bitmap)).h, ((ra) (bitmap)).o[16], ((ra) (bitmap)).o[17]);
        ((ra) (bitmap)).H.postScale(((ra) (bitmap)).h, ((ra) (bitmap)).h, ((ra) (bitmap)).o[16], ((ra) (bitmap)).o[17]);
        bitmap.b(ao1.l);
        af1 = bitmap.e();
        ((ra) (bitmap)).H.postTranslate(((ra) (bitmap)).r[0] * f - af1[0], ((ra) (bitmap)).r[1] * f - af1[1]);
        ((ra) (bitmap)).G.postTranslate(((ra) (bitmap)).r[0] * f - af1[0], ((ra) (bitmap)).r[1] * f - af1[1]);
        flag1 = ((ra) (bitmap)).ag;
        if (((ra) (bitmap)).af != -21)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (((ra) (bitmap)).ae != 0xff000000)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (((ra) (bitmap)).P != 2)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        bitmap.a(canvas);
        l2 = k;
        k = i1;
        i1 = j1;
        i2 = k1;
        j1 = l2;
        k1 = ((flag) ? 1 : 0);
          goto _L12
_L2:
        a(canvas, f);
        if (j1 != 0)
        {
            af.c(b, "FreeActivity/Save/HasText");
        }
        if (k != 0)
        {
            Iterator iterator = hashmap.keySet().iterator();
            String s1;
            int l;
            for (bitmap = ""; iterator.hasNext(); bitmap = (new StringBuilder()).append(bitmap).append("/").append(s1).append(":").append(l).toString())
            {
                s1 = (String)iterator.next();
                l = ((Integer)hashmap.get(s1)).intValue();
            }

            af.c(b, (new StringBuilder("FreeActivity/Save/HasSticker")).append(bitmap).toString());
        }
        if (k1 != 0)
        {
            af.c(b, "FreeActivity/Save/HasTextBorder");
        }
        if (flag1)
        {
            af.c(b, "FreeActivity/Save/HasTextShadow");
        }
        if (i1 != 0)
        {
            af.c(b, "FreeActivity/Save/HasTextBackground");
        }
        if (i2 != 0)
        {
            af.c(b, "FreeActivity/Save/HasTextColor");
        }
        if (az.C)
        {
            af.c(b, "FreeActivity/Save/Background/Image");
        } else
        {
            af.c(b, (new StringBuilder("FreeActivity/Save/Background/position: ")).append(ih.C().x()).append("/PattenIndex0: ").append(ih.C().y()).append("/PattenIndex1: ").append(ih.C().z()).toString());
        }
        if (((PhotoGridActivity)b).R() || !d()) goto _L8; else goto _L13
_L13:
        f = (float)i * 0.2F;
        if (i > j)
        {
            f = (float)j * 0.2F;
        }
        rf.a();
        bitmap = rf.a(b, 0x7f020608, f);
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            f /= bitmap.getWidth();
        } else
        {
            f /= bitmap.getHeight();
        }
        rf.a();
        bitmap = rf.a(bitmap, f, f);
        if (i > j)
        {
            f = j;
        } else
        {
            f = i;
        }
        canvas.drawBitmap(bitmap, (float)(i - bitmap.getWidth()) - 0.02F * f, (float)(j - bitmap.getHeight()) - f * 0.02F, null);
        bitmap.recycle();
        return;
          goto _L12
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
        if (!az.C)
        {
            if (v != -20)
            {
                canvas.drawColor(v);
                return;
            }
            a(new int[] {
                w, x
            });
            canvas.save();
            Paint paint = new Paint();
            paint.setColor(0);
            canvas.drawRect(0.0F, 0.0F, s, t, paint);
            if (u == -1)
            {
                a(new int[0]);
                u = 1;
            }
            paint.setColor(-1);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 6));
            for (int i = 0; i < A; i++)
            {
                for (int l = 0; l < z; l++)
                {
                    canvas.drawBitmap(y, y.getWidth() * l, y.getHeight() * i, null);
                }

            }

            canvas.restore();
            a(y);
            return;
        }
        Object obj = ih.C().aB();
        float f;
        int j;
        int i1;
        if (obj == null)
        {
            a(new int[] {
                w, x
            });
        } else
        if (obj != null)
        {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(((String) (obj)), options);
            int k = options.outWidth;
            i1 = options.outHeight;
            if (k <= 0 || i1 <= 0)
            {
                throw new OutOfMemoryError("save bg create decodeBitmap null createBgSingle");
            }
            f = (float)s / (float)t;
            if ((float)k / (float)i1 > f)
            {
                k = i1 / t;
            } else
            {
                k /= s;
            }
            i1 = k;
            if (k <= 0)
            {
                i1 = 1;
            }
            options.inSampleSize = i1;
            options.inJustDecodeBounds = false;
            y = BitmapFactory.decodeFile(((String) (obj)), options);
            if (y == null)
            {
                throw new OutOfMemoryError("save bg create decodeBitmap null createBgSingle1");
            }
        }
        canvas.save();
        obj = new Matrix();
        j = y.getWidth();
        i1 = y.getHeight();
        if ((float)s / (float)t > (float)j / (float)i1)
        {
            f = ((float)s * 1.0F) / (float)j;
        } else
        {
            f = ((float)t * 1.0F) / (float)i1;
        }
        ((Matrix) (obj)).postScale(f, f);
        ((Matrix) (obj)).postTranslate(((float)(-j) / 2.0F) * f + (float)s / 2.0F, f * ((float)(-i1) / 2.0F) + (float)t / 2.0F);
        canvas.drawBitmap(y, ((Matrix) (obj)), new Paint());
        canvas.restore();
        a(y);
    }

    private void a(Canvas canvas, float f)
    {
        Object obj = h.a();
        if (obj == null || ((ArrayList) (obj)).size() <= 0)
        {
            return;
        }
        af.c(b, "FreeActivity/Save/HasDoodle");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        canvas.saveLayer(null, paint, 31);
        for (obj = ((ArrayList) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((ay)((Iterator) (obj)).next()).a(canvas, f, paint)) { }
        canvas.restore();
    }

    static void a(ol ol1)
    {
        ol1.c(15);
    }

    private transient void a(int ai[])
    {
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        if (ai.length != 1) goto _L2; else goto _L1
_L1:
        rf.a();
        y = rf.a(b.getResources(), p.a().d[ai[0]], options, null);
_L4:
        if (y == null)
        {
            rf.a();
            y = rf.a(b.getResources(), p.a().j[4][4], options, y);
        }
        if (y == null)
        {
            throw new OutOfMemoryError("mBgBase==null-2  throw oom");
        }
          goto _L3
_L2:
        if (ai[0] < 2)
        {
            break MISSING_BLOCK_LABEL_471;
        }
        if (ai[0] > p.a().j.length - 1)
        {
            break MISSING_BLOCK_LABEL_471;
        }
_L18:
        try
        {
            rf.a();
            y = rf.a(b.getResources(), p.a().j[ai[0]][ai[1]], options, null);
        }
        // Misplaced declaration of an exception variable
        catch (int ai[])
        {
            ai.printStackTrace();
            a(y);
            throw new OutOfMemoryError("save create bg oom");
        }
          goto _L4
_L3:
        rf.a();
        ai = y;
        float f = B;
        y = rf.a(ai, f, f);
        if (y == null)
        {
            throw new OutOfMemoryError("mBgBase==null-3  throw oom");
        }
        if (s <= t) goto _L6; else goto _L5
_L5:
        if (s % y.getWidth() == 0) goto _L8; else goto _L7
_L7:
        int i = s / y.getWidth() + 1;
_L11:
        z = i;
        if (t % y.getHeight() == 0) goto _L10; else goto _L9
_L9:
        i = t / y.getHeight() + 1;
_L12:
        A = i;
_L15:
        c(20);
        return;
_L8:
        i = s / y.getWidth();
          goto _L11
_L10:
        i = t / y.getHeight();
          goto _L12
_L6:
        if (s % y.getWidth() == 0) goto _L14; else goto _L13
_L13:
        i = s / y.getWidth() + 1;
_L16:
        z = i;
        if (t % y.getHeight() == 0)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        i = t / y.getHeight() + 1;
_L17:
        A = i;
          goto _L15
_L14:
        i = s / y.getWidth();
          goto _L16
        i = t / y.getHeight();
          goto _L17
        ai[0] = 2;
        ai[1] = 0;
          goto _L18
    }

    private String[] a(int i, int j, boolean flag)
    {
        Object obj2 = null;
        Object obj;
        Object obj3;
        obj3 = Calendar.getInstance();
        obj = ap.a(b);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        obj = com.roidapp.photogrid.release.ap.b(b);
        File file = new File(((String) (obj)));
        if (file.exists() || file.mkdirs()) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT != 19) goto _L4; else goto _L3
_L3:
        Object obj1 = new ae(b.getContentResolver(), file);
        ((ae) (obj1)).a();
_L2:
        c(20);
        if (j != 1) goto _L6; else goto _L5
_L5:
        obj1 = ".png";
        android.graphics.Bitmap.CompressFormat compressformat = android.graphics.Bitmap.CompressFormat.PNG;
_L15:
        c(25);
        obj = new File(((String) (obj)), (new StringBuilder("PhotoGrid_")).append(((Calendar) (obj3)).getTimeInMillis()).append(((String) (obj1))).toString());
        ((File) (obj)).createNewFile();
_L17:
        String s1 = ((File) (obj)).getAbsolutePath();
        c(30);
        obj1 = null;
        if (((File) (obj)).isFile() && ((File) (obj)).canWrite()) goto _L8; else goto _L7
_L7:
        int k = android.os.Build.VERSION.SDK_INT;
        if (k <= 18) goto _L10; else goto _L9
_L9:
        obj2 = (new ae(b.getContentResolver(), ((File) (obj)))).b();
        if (obj2 != null) goto _L12; else goto _L11
_L11:
        obj1 = obj2;
        throw new IOException("4.4 IOException");
        obj;
        ((Exception) (obj)).printStackTrace();
        obj2 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(b.getString(0x7f07002e)).toString();
        obj = new File(((String) (obj2)), (new StringBuilder("PhotoGrid_")).append(((Calendar) (obj3)).getTimeInMillis()).append(j).toString());
        ((File) (obj)).createNewFile();
        ap.a(b, ((String) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_357;
        }
        ((OutputStream) (obj1)).flush();
        ((OutputStream) (obj1)).close();
        obj1 = new FileOutputStream(((File) (obj)));
_L18:
        float f;
        obj2 = r.j.getLayoutParams();
        f = (float)i / (float)((android.view.ViewGroup.LayoutParams) (obj2)).width;
        k = (int)((float)((android.view.ViewGroup.LayoutParams) (obj2)).height * f);
        rf.a();
        obj3 = rf.a(i, k, az.c);
        if (obj3 != null) goto _L14; else goto _L13
_L13:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        obj2 = obj3;
        ((OutputStream) (obj1)).close();
        obj2 = obj3;
        a(s1);
        obj2 = obj3;
        throw new OutOfMemoryError((new StringBuilder("save createBitmap oom width:")).append(i).append(" height:").append(k).toString());
        obj;
_L19:
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            ((Bitmap) (obj2)).recycle();
        }
        d.sendEmptyMessage(15);
        ((Exception) (obj)).printStackTrace();
        if ((new StringBuilder()).append(((Exception) (obj)).getMessage()).toString().contains("No space"))
        {
            return (new String[] {
                "3", ""
            });
        } else
        {
            com.roidapp.photogrid.common.c.a(q, ((Throwable) (obj)));
            return (new String[] {
                "-1", ""
            });
        }
        obj1;
        ((Exception) (obj1)).printStackTrace();
        return (new String[] {
            "2", obj
        });
_L4:
        return (new String[] {
            "2", obj
        });
        obj;
        obj1 = obj2;
_L20:
        a(((String) (obj1)));
        ((OutOfMemoryError) (obj)).printStackTrace();
        throw new OutOfMemoryError("do save oom");
_L6:
        obj1 = ".jpg";
        compressformat = android.graphics.Bitmap.CompressFormat.JPEG;
          goto _L15
        obj1;
        ((IOException) (obj1)).printStackTrace();
        if (android.os.Build.VERSION.SDK_INT > 18) goto _L17; else goto _L16
_L16:
        obj1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(b.getString(0x7f07002e)).toString();
        obj = new File(((String) (obj1)), (new StringBuilder("PhotoGrid_")).append(((Calendar) (obj3)).getTimeInMillis()).append(j).toString());
        ((File) (obj)).createNewFile();
        ap.a(b, ((String) (obj1)));
          goto _L17
        obj;
        ((IOException) (obj)).printStackTrace();
        obj = file.getAbsolutePath();
        return (new String[] {
            "1", obj
        });
_L12:
        obj1 = obj2;
          goto _L18
        obj;
        ((IOException) (obj)).printStackTrace();
        return (new String[] {
            "1", file.getAbsolutePath()
        });
_L10:
        return (new String[] {
            "1", file.getAbsolutePath()
        });
_L8:
        obj1 = new FileOutputStream(((File) (obj)));
          goto _L18
_L14:
        obj2 = obj3;
        c(32);
        obj2 = obj3;
        a(f, i, k, ((Bitmap) (obj3)));
        obj2 = obj3;
        c(40);
        obj2 = obj3;
        ((Bitmap) (obj3)).compress(compressformat, 100, ((OutputStream) (obj1)));
        obj2 = obj3;
        c(80);
        obj2 = obj3;
        ((OutputStream) (obj1)).flush();
        obj2 = obj3;
        ((OutputStream) (obj1)).close();
        obj2 = obj3;
        c(85);
        obj1 = obj3;
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_975;
        }
        obj2 = obj3;
        obj1 = obj3;
        if (((Bitmap) (obj3)).isRecycled())
        {
            break MISSING_BLOCK_LABEL_975;
        }
        obj2 = obj3;
        ((Bitmap) (obj3)).recycle();
        obj1 = null;
        obj2 = obj1;
        c(90);
        if (j != 2)
        {
            break MISSING_BLOCK_LABEL_1029;
        }
        obj2 = obj1;
        obj3 = ((File) (obj)).getAbsolutePath();
        obj2 = obj1;
        if (android.os.Build.VERSION.SDK_INT <= 5)
        {
            break MISSING_BLOCK_LABEL_1029;
        }
        obj2 = obj1;
        bp.a();
        obj2 = obj1;
        bp.a(((String) (obj3)));
        obj2 = obj1;
        obj = ((File) (obj)).getAbsolutePath();
        return (new String[] {
            "0", obj
        });
        obj;
        obj2 = null;
          goto _L19
        obj;
        obj1 = s1;
          goto _L20
    }

    static String[] a(ol ol1, int i)
    {
        return ol1.a(i, 2, true);
    }

    static String[] a(ol ol1, int i, int j)
    {
        return ol1.a(i, j, false);
    }

    private void c(int i)
    {
        d.a(i, 1);
    }

    public final void a()
    {
        c(10);
        (new Thread(new om(this))).start();
    }

    public final void a(int i)
    {
        o = i;
        if (g != null)
        {
            g.a();
        }
        b(5);
        r.f();
        ((PhotoGridActivity)b).q();
        b(10);
        (new Thread(new on(this, i))).start();
    }
}
