// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.os.Environment;
import com.roidapp.photogrid.common.ae;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

// Referenced classes of package com.roidapp.photogrid.release:
//            ap, ml, rf, ig

public final class rm extends ap
{

    private int a;
    private int b;
    private int c;
    private int d;
    private Context e;
    private ig f[];
    private float g;
    private float h;
    private int i;
    private int j;
    private ml k;

    public rm(Context context, int l, int i1, ig aig[], int j1, int k1, int l1, 
            int i2, ml ml1)
    {
        e = context;
        a = l;
        b = i1;
        f = aig;
        i = l1;
        c = j1;
        d = k1;
        j = i2;
        k = ml1;
    }

    private void a(int l)
    {
        if (k != null)
        {
            k.a(l, 1);
        }
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
        int l = 0;
_L10:
        if (l >= f.length) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
        Bitmap bitmap1;
        Bitmap bitmap2;
        Bitmap bitmap3;
        bitmap2 = null;
        bitmap3 = null;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        rf.a();
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        bitmap2 = rf.a(f[l], d, c, Boolean.valueOf(false));
        if (bitmap2 == null)
        {
            bitmap = bitmap3;
            bitmap1 = bitmap2;
            try
            {
                throw new OutOfMemoryError("WideHighUtils b is null");
            }
            // Misplaced declaration of an exception variable
            catch (Canvas canvas) { }
            if (bitmap1 != null && !bitmap1.isRecycled())
            {
                bitmap1.recycle();
            }
            if (bitmap != null && !bitmap.isRecycled())
            {
                bitmap.recycle();
            }
            canvas.printStackTrace();
            throw new OutOfMemoryError("WideHighSaveUtils drawGrid OOM");
        }
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        rf.a();
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        bitmap3 = rf.a(c, d, az.c);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        Canvas canvas1 = new Canvas(bitmap3);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        int i1 = c;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        int j1 = d;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        ig ig1 = f[l];
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        Paint paint = new Paint();
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        paint.setAntiAlias(true);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        paint.setFilterBitmap(true);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        paint.setFlags(5);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        Matrix matrix = new Matrix();
        float f1;
        float f2;
        f1 = i1;
        f2 = j1;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        if (f1 / f2 <= (float)bitmap2.getWidth() / (float)bitmap2.getHeight()) goto _L4; else goto _L3
_L3:
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        f1 = (f1 * 1.0F) / (float)bitmap2.getWidth();
_L8:
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        matrix.postScale(ig1.r, ig1.s, (float)bitmap2.getWidth() / 2.0F, (float)bitmap2.getHeight() / 2.0F);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        matrix.postRotate(ig1.p, (float)bitmap2.getWidth() / 2.0F, (float)bitmap2.getHeight() / 2.0F);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        matrix.postScale(ig1.v * f1, ig1.v * f1);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        f2 = ig1.t;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        float f3 = (float)bitmap2.getWidth() / 2.0F;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        float f4 = ig1.v;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        float f5 = (float)i1 / 2.0F;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        float f6 = ig1.u;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        float f7 = (float)bitmap2.getHeight() / 2.0F;
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        matrix.postTranslate(f5 + (f2 - f3 * f4 * f1), (f6 - f1 * (ig1.v * f7)) + (float)j1 / 2.0F);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        canvas1.setDrawFilter(new PaintFlagsDrawFilter(0, 6));
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        canvas1.drawBitmap(bitmap2, matrix, paint);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        a(bitmap2);
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        i;
        JVM INSTR tableswitch 1 2: default 824
    //                   1 759
    //                   2 791;
           goto _L5 _L6 _L7
_L5:
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        a(bitmap3);
        a(l * 4 + 42);
        l++;
        continue; /* Loop/switch isn't completed */
_L4:
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        f1 = (1.0F * f2) / (float)bitmap2.getHeight();
          goto _L8
_L6:
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        canvas.drawBitmap(bitmap3, (c + 5) * l + 5, 5F, null);
          goto _L5
_L7:
        bitmap = bitmap3;
        bitmap1 = bitmap2;
        canvas.drawBitmap(bitmap3, 5F, (d + 5) * l + 5, null);
          goto _L5
_L2:
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private String[] a(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, String s)
    {
        Object obj;
        File file;
        Calendar calendar;
        calendar = Calendar.getInstance();
        obj = a(e);
        file = new File(((String) (obj)));
        if (file.exists() || file.mkdirs()) goto _L2; else goto _L1
_L1:
        if (android.os.Build.VERSION.SDK_INT != 19) goto _L4; else goto _L3
_L3:
        Object obj2;
        Object obj1 = new ae(e.getContentResolver(), file);
        int l;
        try
        {
            ((ae) (obj1)).a();
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.CompressFormat compressformat)
        {
            compressformat.printStackTrace();
            a(bitmap);
            return (new String[] {
                "2", obj
            });
        }
_L2:
        a(80);
        obj = new File(((String) (obj)), (new StringBuilder("PhotoGrid_")).append(calendar.getTimeInMillis()).append(s).toString());
        try
        {
            ((File) (obj)).createNewFile();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            if (android.os.Build.VERSION.SDK_INT <= 18)
            {
                a(bitmap);
                return (new String[] {
                    "1", file.getAbsolutePath()
                });
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
        obj1 = null;
        if (((File) (obj)).isFile() && ((File) (obj)).canWrite())
        {
            break MISSING_BLOCK_LABEL_541;
        }
        l = android.os.Build.VERSION.SDK_INT;
        if (l <= 18) goto _L6; else goto _L5
_L5:
        obj2 = (new ae(e.getContentResolver(), ((File) (obj)))).b();
        if (obj2 != null) goto _L8; else goto _L7
_L7:
        obj1 = obj2;
        throw new IOException("4.4 IOException");
        obj;
        ((Exception) (obj)).printStackTrace();
        obj2 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(e.getString(0x7f07002e)).toString();
        obj = new File(((String) (obj2)), (new StringBuilder("PhotoGrid_")).append(calendar.getTimeInMillis()).append(s).toString());
        ((File) (obj)).createNewFile();
        ap.a(e, ((String) (obj2)));
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        ((OutputStream) (obj1)).flush();
        ((OutputStream) (obj1)).close();
        s = new FileOutputStream(((File) (obj)));
_L9:
        bitmap.compress(compressformat, 100, s);
        a(90);
        s.flush();
        s.close();
        a(92);
        a(bitmap);
        compressformat = ((File) (obj)).getAbsolutePath();
        return (new String[] {
            "0", compressformat
        });
_L4:
        a(bitmap);
        return (new String[] {
            "2", obj
        });
_L8:
        s = ((String) (obj2));
          goto _L9
        compressformat;
        compressformat.printStackTrace();
        a(bitmap);
        compressformat = file.getAbsolutePath();
        return (new String[] {
            "1", compressformat
        });
_L6:
        a(bitmap);
        return (new String[] {
            "1", file.getAbsolutePath()
        });
        s = new FileOutputStream(((File) (obj)));
          goto _L9
    }

    public final void b()
    {
        h = 5F;
        g = 5F;
    }

    public final String[] c()
    {
        Object obj = null;
        Bitmap bitmap = ((Bitmap) (obj));
        String s;
        Bitmap bitmap1;
        Canvas canvas;
        try
        {
            rf.a();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            if (bitmap != null && !bitmap.isRecycled())
            {
                bitmap.recycle();
            }
            outofmemoryerror.printStackTrace();
            throw new OutOfMemoryError("WideHighSaveUtils doSave OOM");
        }
        bitmap = ((Bitmap) (obj));
        bitmap1 = rf.a(a, b, az.c);
        bitmap = bitmap1;
        a(25);
        bitmap = bitmap1;
        canvas = new Canvas(bitmap1);
        bitmap = bitmap1;
        if (j != 1) goto _L2; else goto _L1
_L1:
        s = ".png";
        bitmap = bitmap1;
        obj = android.graphics.Bitmap.CompressFormat.PNG;
_L4:
        bitmap = bitmap1;
        canvas.drawColor(-1);
        bitmap = bitmap1;
        a(26);
        bitmap = bitmap1;
        a(canvas);
        bitmap = bitmap1;
        obj = a(bitmap1, ((android.graphics.Bitmap.CompressFormat) (obj)), s);
        bitmap = bitmap1;
        if (!obj[0].equals("0"))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        bitmap = bitmap1;
        if (j == 1)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        s = obj[1];
        bitmap = bitmap1;
        if (android.os.Build.VERSION.SDK_INT <= 5)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        bitmap = bitmap1;
        bp.a();
        bitmap = bitmap1;
        bp.a(s);
        bitmap = bitmap1;
        a(90);
        return ((String []) (obj));
_L2:
        s = ".jpg";
        bitmap = bitmap1;
        obj = android.graphics.Bitmap.CompressFormat.JPEG;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
