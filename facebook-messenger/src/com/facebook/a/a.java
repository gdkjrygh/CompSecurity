// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import android.net.Uri;
import com.facebook.common.e.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.a:
//            d, f, e

public class a
{

    private static final Map a;
    private static final Paint b;
    private static final Paint c;
    private static final Paint d;

    public a()
    {
    }

    private static float a(int i, int j, int k, int l, int i1, boolean flag)
    {
        int j1;
        int k1;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        j1 = i;
        k1 = j;
        if (k != 90)
        {
            if (k != 270)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            k1 = j;
            j1 = i;
        }
_L1:
        if (k1 > l || j1 > i1)
        {
            return Math.max((float)k1 / (float)l, (float)j1 / (float)i1);
        } else
        {
            return 1.0F;
        }
        j1 = j;
        k1 = i;
          goto _L1
    }

    public static void a(String s, String s1, int i, int j)
    {
        ExifInterface exifinterface;
        ExifInterface exifinterface1;
        Iterator iterator;
        exifinterface = new ExifInterface(s);
        exifinterface1 = new ExifInterface(s1);
        j = android.os.Build.VERSION.SDK_INT;
        iterator = a.keySet().iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String as[];
        int k;
        Integer integer = (Integer)iterator.next();
        if (j < integer.intValue())
        {
            continue; /* Loop/switch isn't completed */
        }
        as = (String[])a.get(integer);
        k = as.length;
        i = 0;
_L6:
        if (i >= k)
        {
            continue; /* Loop/switch isn't completed */
        }
        String s2 = as[i];
        String s3;
        try
        {
            s3 = exifinterface.getAttribute(s2);
        }
        catch (IOException ioexception)
        {
            throw new d((new StringBuilder()).append("copyExif from ").append(s).append(" to ").append(s1).toString(), ioexception);
        }
        if (s3 == null) goto _L4; else goto _L3
_L3:
        exifinterface1.setAttribute(s2, s3);
          goto _L4
_L2:
        exifinterface1.saveAttributes();
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean a(Context context, File file, File file1, int i, int j, int k, boolean flag)
    {
        Object obj = null;
        if (flag) goto _L2; else goto _L1
_L1:
        context = a(context, Uri.fromFile(file), i, j, false);
_L3:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        a(((Bitmap) (context)), android.graphics.Bitmap.CompressFormat.JPEG, k, file1);
        a(file.getAbsolutePath(), file1.getAbsolutePath(), context.getWidth(), context.getHeight());
        flag = true;
        file = obj;
_L6:
        if (context != null)
        {
            context.recycle();
        }
        if (file != null && file.exists())
        {
            file.delete();
        }
        return flag;
_L2:
        if (i <= j)
        {
            i = j;
        }
        context = a(context, file, i);
          goto _L3
        file;
        context = null;
_L5:
        if (context != null)
        {
            context.recycle();
        }
        if (file1 != null && file1.exists())
        {
            file1.delete();
        }
        throw file;
        file;
        if (true) goto _L5; else goto _L4
_L4:
        flag = false;
        file = file1;
          goto _L6
    }

    public int a(Context context, Uri uri)
    {
        if (uri.getScheme().equals("content") && uri.getHost().equals("media") && uri.getPath().startsWith(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI.getPath()))
        {
            context = context.getContentResolver().query(uri, new String[] {
                "orientation"
            }, null, null, null);
            if (context.getCount() != 1)
            {
                return -1;
            } else
            {
                context.moveToFirst();
                return context.getInt(0);
            }
        }
        if (uri.getScheme().equals("file"))
        {
            return a(uri.getPath());
        } else
        {
            return -1;
        }
    }

    public int a(String s)
    {
        try
        {
            s = new ExifInterface(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        switch (s.getAttributeInt("Orientation", 1))
        {
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return -1;

        case 1: // '\001'
            return 0;

        case 6: // '\006'
            return 90;

        case 3: // '\003'
            return 180;

        case 8: // '\b'
            return 270;
        }
    }

    public Bitmap a(Context context, Uri uri, int i, int j, boolean flag)
    {
        f f1 = new f(uri);
        try
        {
            context = a(context, f1, a(context, uri), i, j, flag);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new d(uri.toString(), context);
        }
        return context;
    }

    public Bitmap a(Context context, f f1, int i, int j, int k, boolean flag)
    {
        float f3;
        Object obj;
        float f2;
        try
        {
            obj = f1.a(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new e(context);
        }
        f3 = a(((android.graphics.BitmapFactory.Options) (obj)).outWidth, ((android.graphics.BitmapFactory.Options) (obj)).outHeight, i, j, k, flag);
        f2 = 1.0F;
        j = 0;
        obj = null;
        if (f2 >= 2.0F) goto _L2; else goto _L1
_L1:
        if ((int)f3 != j) goto _L4; else goto _L3
_L3:
        j = (int)f3;
        f3 *= 1.19F;
        f2 *= 1.19F;
        break MISSING_BLOCK_LABEL_38;
_L4:
        obj = new android.graphics.BitmapFactory.Options();
        obj.inSampleSize = (int)f3;
        obj = a(f1.a(context, ((android.graphics.BitmapFactory.Options) (obj))), i, flag);
        return ((Bitmap) (obj));
_L2:
        com.facebook.common.e.b.a("BitmapScalingUtils", "unable to resize image, even after additional subsampling");
        throw new e(((OutOfMemoryError) (obj)));
        obj;
        if (true) goto _L3; else goto _L5
_L5:
    }

    public Bitmap a(Context context, File file, int i)
    {
        context = a(context, Uri.fromFile(file), i, i, false);
        if (context == null)
        {
            return null;
        }
        if (context.getWidth() <= i && context.getHeight() <= i)
        {
            return context;
        }
        double d1 = (double)context.getWidth() / (double)context.getHeight();
        int j;
        int k;
        if (d1 > 1.0D)
        {
            k = (int)((double)i / d1);
            j = i;
        } else
        {
            j = (int)(d1 * (double)i);
            k = i;
        }
        return Bitmap.createScaledBitmap(context, j, k, true);
    }

    public Bitmap a(Bitmap bitmap, int i)
    {
        int j;
        int k;
        j = bitmap.getWidth();
        k = bitmap.getHeight();
        if (j <= k) goto _L2; else goto _L1
_L1:
        if (j <= i) goto _L4; else goto _L3
_L3:
        float f1 = (float)i / (float)j;
_L6:
        Object obj = bitmap;
        if (f1 != -1F)
        {
            obj = new Matrix();
            ((Matrix) (obj)).postScale(f1, f1);
            obj = Bitmap.createBitmap(bitmap, 0, 0, j, k, ((Matrix) (obj)), true);
        }
        return ((Bitmap) (obj));
_L2:
        if (k > i)
        {
            f1 = (float)i / (float)k;
            continue; /* Loop/switch isn't completed */
        }
_L4:
        f1 = -1F;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Bitmap a(Bitmap bitmap, int i, int j)
    {
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        float f1;
        float f2;
        if (k > i)
        {
            f1 = (float)i / (float)k;
        } else
        {
            f1 = -1F;
        }
        if (l > j)
        {
            f2 = (float)j / (float)l;
        } else
        {
            f2 = -1F;
        }
        if (f1 == -1F && f2 == -1F)
        {
            return bitmap;
        } else
        {
            f1 = Math.max(f1, f2);
            Matrix matrix = new Matrix();
            matrix.postScale(f1, f1);
            return Bitmap.createBitmap(bitmap, 0, 0, k, l, matrix, true);
        }
    }

    public Bitmap a(Bitmap bitmap, int i, boolean flag)
    {
        if (!flag || i <= 0)
        {
            return bitmap;
        }
        Object obj;
        obj = new Matrix();
        ((Matrix) (obj)).postRotate(i);
        obj = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
        bitmap.recycle();
        return ((Bitmap) (obj));
        Exception exception;
        exception;
        bitmap.recycle();
        throw exception;
    }

    public void a(Bitmap bitmap, android.graphics.Bitmap.CompressFormat compressformat, int i, File file)
    {
        FileOutputStream fileoutputstream1 = new FileOutputStream(file);
        FileOutputStream fileoutputstream = fileoutputstream1;
        if (bitmap.compress(compressformat, i, fileoutputstream1)) goto _L2; else goto _L1
_L1:
        fileoutputstream = fileoutputstream1;
        try
        {
            throw new IOException((new StringBuilder()).append("cannot compress bitmap to file: ").append(file.getPath()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            fileoutputstream = fileoutputstream1;
        }
        finally { }
_L6:
        throw new d(file.getPath(), bitmap);
_L4:
        if (fileoutputstream != null)
        {
            try
            {
                fileoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (android.graphics.Bitmap.CompressFormat compressformat) { }
        }
        if (file != null && file.exists())
        {
            file.delete();
        }
        throw bitmap;
_L2:
        fileoutputstream1.close();
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap) { }
        }
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            return;
        }
        bitmap;
        fileoutputstream = null;
        if (true) goto _L4; else goto _L3
_L3:
        bitmap;
        fileoutputstream = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean a(Context context, File file, File file1, int i, int j, int k)
    {
        return a(context, file, file1, i, j, k, false);
    }

    static 
    {
        a = new HashMap();
        a.put(Integer.valueOf(11), new String[] {
            "FNumber", "ExposureTime", "ISOSpeedRatings"
        });
        a.put(Integer.valueOf(9), new String[] {
            "GPSAltitude", "GPSAltitudeRef"
        });
        a.put(Integer.valueOf(8), new String[] {
            "FocalLength", "GPSDateStamp", "GPSTimeStamp", "GPSProcessingMethod"
        });
        a.put(Integer.valueOf(5), new String[] {
            "DateTime", "Flash", "Orientation", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "Make", "Model", "WhiteBalance"
        });
        b = new Paint();
        b.setStrokeWidth(1.0F);
        b.setStyle(android.graphics.Paint.Style.STROKE);
        b.setColor(0xffe0e0e0);
        c = new Paint();
        c.setStrokeWidth(1.0F);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setColor(0xfff0f0f0);
        d = new Paint();
        d.setStrokeWidth(3F);
        d.setStyle(android.graphics.Paint.Style.STROKE);
        d.setColor(0xfff0f0f0);
    }
}
