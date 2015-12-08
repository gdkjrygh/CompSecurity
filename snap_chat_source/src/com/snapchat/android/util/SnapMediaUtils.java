// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import Bm;
import Jo;
import Jw;
import Jy;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.EasyMetric;
import com.snapchat.android.database.SharedPreferenceKey;
import com.snapchat.android.util.debug.ReleaseManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import ln;
import org.apache.commons.io.FileUtils;

public class SnapMediaUtils
{

    private static final int IGNORED_COMPRESSION_VALUE = 90;
    private static final int IPHONE_5S_HEIGHT = 1136;
    private static final int IPHONE_5S_WIDTH = 640;
    private static final int RAW_THUMBNAIL_ENCODING_QUALITY = 60;
    private static final int RAW_THUMBNAIL_SIZE = 256;
    private static final int STORY_THUMBNAIL_SIZE = 102;
    private static final String STUDY_NAME = "IMAGE_TRANSCODING";
    private static final boolean STUDY_VARIABLE_DEFAULT_VALUE = false;
    private static final String STUDY_VARIABLE_NAME = "ImageTranscodingEnabled";
    private static final String TAG = "SnapMediaUtils";
    private static final Bm mStudySettings = Bm.a();
    private static final ln sMemoryAnalytics = new ln();
    private static final boolean sSnapMediaUtilsLoaded = a();

    public static Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        if (i <= 0 || j <= 0)
        {
            return null;
        }
        try
        {
            config = Bitmap.createBitmap(i, j, config);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            ln.a("safeCreateBitmap(int, int, Bitmap.Config)", config);
            return null;
        }
        return config;
    }

    public static Bitmap a(Context context, int i)
    {
        return b(context, i);
    }

    public static Bitmap a(Context context, byte abyte0[])
    {
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        return b(context, abyte0).mBitmap;
    }

    public static Bitmap a(Bitmap bitmap, int i)
    {
        Object obj = bitmap;
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            obj = new Matrix();
            i = Jo.a(i);
            ((Matrix) (obj)).postRotate(i);
            obj = a(bitmap, ((Matrix) (obj)));
            bitmap.recycle();
            if (ReleaseManager.f() && ((Bitmap) (obj)).getWidth() > bitmap.getHeight())
            {
                throw new RuntimeException((new StringBuilder("bitmapToPortrait failed. degrees = ")).append(i).append(". input = ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString());
            }
        }
        return ((Bitmap) (obj));
    }

    public static Bitmap a(Bitmap bitmap, int i, int j, int k)
    {
        if (j <= 0 || k <= 0)
        {
            return null;
        }
        try
        {
            bitmap = Bitmap.createBitmap(bitmap, 0, i, j, k);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            ln.a("safeCreateBitmap(Bitmap, int, int, int, int)", bitmap);
            return null;
        }
        return bitmap;
    }

    private static Bitmap a(Bitmap bitmap, Matrix matrix)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        try
        {
            matrix = Bitmap.createBitmap(bitmap, 0, 0, i, j, matrix, true);
        }
        // Misplaced declaration of an exception variable
        catch (Matrix matrix)
        {
            ln.a("safeTransformBitmap(Bitmap, Matrix)", matrix);
            return bitmap;
        }
        return matrix;
    }

    public static Bitmap a(Uri uri, Context context)
    {
        if (uri != null)
        {
            try
            {
                uri = android.provider.MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri);
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                Timber.a("SnapMediaUtils", uri);
                uri = null;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                Timber.a("SnapMediaUtils", uri);
                uri = null;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                Timber.a("SnapMediaUtils", uri);
                uri = null;
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                ln.a("scaledPortraitBitmapFromUri(Uri, Context)", uri);
                uri = null;
            }
            if (uri != null)
            {
                if (uri.getWidth() > uri.getHeight())
                {
                    Object obj = new Matrix();
                    ((Matrix) (obj)).postRotate(90F);
                    obj = a(((Bitmap) (uri)), ((Matrix) (obj)));
                    if (obj != uri)
                    {
                        uri.recycle();
                    }
                    return d(((Bitmap) (obj)), context);
                } else
                {
                    return d(uri, context);
                }
            }
        }
        return null;
    }

    public static android.graphics.BitmapFactory.Options a(DisplayMetrics displaymetrics, int i, int j)
    {
        return a(displaymetrics, i, j, android.graphics.Bitmap.Config.ARGB_8888);
    }

    public static android.graphics.BitmapFactory.Options a(DisplayMetrics displaymetrics, int i, int j, android.graphics.Bitmap.Config config)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = false;
        options.inSampleSize = b(displaymetrics, i, j);
        options.inMutable = true;
        options.inPreferredConfig = config;
        options.outHeight = j;
        options.outWidth = i;
        return options;
    }

    public static Matrix a(Bitmap bitmap, Context context)
    {
        bitmap = e(bitmap, context);
        int i = ((Integer)((Pair) (bitmap)).first).intValue();
        int j = ((Integer)((Pair) (bitmap)).second).intValue();
        bitmap = new Matrix();
        bitmap.setTranslate(i * -1, j * -1);
        return bitmap;
    }

    private static boolean a()
    {
        boolean flag = false;
        com/snapchat/android/util/SnapMediaUtils;
        JVM INSTR monitorenter ;
        System.loadLibrary("SnapMediaUtils");
        flag = true;
_L2:
        com/snapchat/android/util/SnapMediaUtils;
        JVM INSTR monitorexit ;
        return flag;
        Object obj;
        obj;
        EasyMetric easymetric = new EasyMetric();
        Timber.e("SnapMediaUtils", "Failed to load the SnapMediaUtils library!", new Object[0]);
        easymetric.a("NATIVE_LIBRARY_LOAD_FAILED");
        easymetric.a("reason", ((Throwable) (obj)).getMessage());
        easymetric.a("type", obj.getClass().getSimpleName());
        easymetric.b(false);
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    public static byte[] a(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 90, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] a(Bitmap bitmap, Bitmap bitmap1)
    {
        bitmap = g(bitmap);
        if (bitmap1 != null)
        {
            bitmap1 = g(bitmap1);
            (new Canvas(bitmap)).drawBitmap(bitmap1, 0.0F, 0.0F, null);
            bitmap1.recycle();
        }
        bitmap1 = a(bitmap);
        bitmap.recycle();
        return bitmap1;
    }

    public static byte[] a(String s)
    {
        s = Uri.parse(s).getPath();
        if (s == null)
        {
            return null;
        }
        s = new File(s);
        try
        {
            s = FileUtils.readFileToByteArray(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Timber.a("SnapMediaUtils", s);
            return null;
        }
        return s;
    }

    private static int b(DisplayMetrics displaymetrics, int i, int j)
    {
        int i1 = Math.min(displaymetrics.widthPixels, 3379);
        int j1 = Math.min(displaymetrics.heightPixels, 3379);
        boolean flag1 = true;
        boolean flag = true;
        int k = ((flag1) ? 1 : 0);
        if (i > i1)
        {
            k = ((flag1) ? 1 : 0);
            if (j > j1)
            {
                j /= 2;
                int l = i / 2;
                for (i = ((flag) ? 1 : 0); j / i > j1 && l / i > i1; i <<= 1) { }
                k = i;
                if (j / i == j1)
                {
                    k = i;
                    if (l / i == i1)
                    {
                        k = i << 1;
                    }
                }
            }
        }
        return k;
    }

    public static Jw b(Context context, byte abyte0[])
    {
        Object obj;
        int i;
        int j;
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, ((android.graphics.BitmapFactory.Options) (obj)));
        i = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        j = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        if (i <= 0 || j <= 0)
        {
            return new Jw(true);
        }
        obj = a(context.getResources().getDisplayMetrics(), i, j);
        obj.inBitmap = Jy.a().a(((android.graphics.BitmapFactory.Options) (obj)), true);
        Object obj1 = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, ((android.graphics.BitmapFactory.Options) (obj)));
        boolean flag;
        if (((android.graphics.BitmapFactory.Options) (obj)).inBitmap != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = new Jw(((Bitmap) (obj1)), flag);
        return ((Jw) (obj1));
        context;
        ln.a("safeDecodeByteArray(Context, byte[], Bitmap.Config)", context);
_L2:
        return new Jw(false);
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        Bitmap bitmap = ((android.graphics.BitmapFactory.Options) (obj)).inBitmap;
        Timber.a("SnapMediaUtils", illegalargumentexception);
        Timber.e("SnapMediaUtils", "input width: %d height: %d exactDimensions: %b", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Boolean.valueOf(true)
        });
        int k = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        int i1 = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        if (((android.graphics.BitmapFactory.Options) (obj)).inPreferredConfig == null)
        {
            obj = "null";
        } else
        {
            obj = ((android.graphics.BitmapFactory.Options) (obj)).inPreferredConfig.name();
        }
        Timber.e("SnapMediaUtils", "options width: %d height: %d config: %s", new Object[] {
            Integer.valueOf(k), Integer.valueOf(i1), obj
        });
        if (bitmap != null)
        {
            int l = bitmap.getWidth();
            int j1 = bitmap.getHeight();
            boolean flag1 = bitmap.isMutable();
            boolean flag2 = bitmap.isRecycled();
            if (bitmap.getConfig() == null)
            {
                obj = "null";
            } else
            {
                obj = bitmap.getConfig().name();
            }
            Timber.e("SnapMediaUtils", "reused bitmap width: %d height: %d mutable: %b, recycled: %b config: %s", new Object[] {
                Integer.valueOf(l), Integer.valueOf(j1), Boolean.valueOf(flag1), Boolean.valueOf(flag2), obj
            });
        }
        context = a(context.getResources().getDisplayMetrics(), i, j);
        context.inBitmap = null;
        context = BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length, context);
        if (context != null)
        {
            return new Jw(context, false);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Bitmap b(Context context, int i)
    {
        if (context == null)
        {
            throw new NullPointerException();
        }
        context = context.getResources();
        if (context != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inScaled = true;
        context = BitmapFactory.decodeResource(context, i, options);
        return context;
        context;
        ln.a("safeDecodeResource(Context, int, boolean)", context);
        return null;
        context;
        if (ReleaseManager.e())
        {
            throw new RuntimeException("Could not get drawable! Bad resource perchance?", context);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static Bitmap b(Bitmap bitmap, Context context)
    {
        int i = Jo.a(PreferenceManager.getDefaultSharedPreferences(context).getInt(SharedPreferenceKey.SNAP_CAPTURE_ROTATION.getKey(), 0)) - Jo.a(Jo.e(context));
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        float f1 = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f2 = Math.max(bitmap.getWidth(), bitmap.getHeight());
        int j = Jo.i(context);
        float f3 = Math.min(displaymetrics.widthPixels, j);
        float f4 = Math.max(displaymetrics.widthPixels, j);
        if (f2 / f1 > f4 / f3)
        {
            f1 = f3 / f1;
        } else
        {
            f1 = f4 / f2;
        }
        context = new Matrix();
        if (i != 0)
        {
            context.postRotate(i);
        }
        if (f1 != 1.0F)
        {
            context.postScale(f1, f1);
        }
        if (context.isIdentity())
        {
            return bitmap;
        } else
        {
            return a(bitmap, context);
        }
    }

    public static byte[] b(Bitmap bitmap)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 60, bytearrayoutputstream);
        boolean flag = mStudySettings.a("IMAGE_TRANSCODING", "ImageTranscodingEnabled", false);
        Timber.c("SnapMediaUtils", (new StringBuilder("Image transcoding enabled ")).append(flag).append(", input image size ").append(bytearrayoutputstream.size()).toString(), new Object[0]);
        if (flag && sSnapMediaUtilsLoaded)
        {
            bitmap = transcodeImage(bytearrayoutputstream.toByteArray(), bytearrayoutputstream.size());
            Timber.c("SnapMediaUtils", "Image transcoding completed.", new Object[0]);
            return bitmap;
        } else
        {
            Timber.e("SnapMediaUtils", "Image cannot be transcoded, and fall back to original image.", new Object[0]);
            return bytearrayoutputstream.toByteArray();
        }
    }

    public static Bitmap c(Bitmap bitmap, Context context)
    {
        int i = Jo.a(PreferenceManager.getDefaultSharedPreferences(context).getInt(SharedPreferenceKey.SNAP_CAPTURE_ROTATION.getKey(), 0));
        int j = Jo.a(Jo.e(context));
        if (i == j)
        {
            return bitmap;
        } else
        {
            context = new Matrix();
            context.postRotate(i - j);
            return a(bitmap, context);
        }
    }

    public static byte[] c(Bitmap bitmap)
    {
        return a(bitmap, ((Bitmap) (null)));
    }

    private static Bitmap d(Bitmap bitmap, Context context)
    {
        Object obj = context.getResources().getDisplayMetrics();
        float f1 = ((DisplayMetrics) (obj)).widthPixels;
        float f2 = ((DisplayMetrics) (obj)).heightPixels;
        float f3 = bitmap.getWidth();
        float f4 = bitmap.getHeight();
        int i;
        int j;
        int k;
        if (f4 / f3 > f2 / f1)
        {
            f1 /= f3;
        } else
        {
            f1 = f2 / f4;
        }
        if (f1 != 1.0F)
        {
            obj = new Matrix();
            ((Matrix) (obj)).postScale(f1, f1);
            obj = a(bitmap, ((Matrix) (obj)));
            if (bitmap != obj)
            {
                Jy.a().a(bitmap);
            }
            bitmap = ((Bitmap) (obj));
        }
        obj = e(bitmap, context);
        i = ((Integer)((Pair) (obj)).first).intValue();
        j = ((Integer)((Pair) (obj)).second).intValue();
        k = Jo.i(context);
        obj = context.getResources().getDisplayMetrics();
        if (((DisplayMetrics) (obj)).widthPixels < bitmap.getWidth() && i > 0)
        {
            j = Math.min(bitmap.getHeight(), k);
            context = Bitmap.createBitmap(bitmap, i, 0, ((DisplayMetrics) (obj)).widthPixels, j);
        } else
        {
            context = bitmap;
            if (k < bitmap.getHeight())
            {
                context = bitmap;
                if (j > 0)
                {
                    return Bitmap.createBitmap(bitmap, 0, j, Math.min(bitmap.getWidth(), ((DisplayMetrics) (obj)).widthPixels), k);
                }
            }
        }
        return context;
    }

    public static byte[] d(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        double d1 = Math.min(j / 256, i / 256);
        bitmap = Bitmap.createScaledBitmap(bitmap, (int)((double)i / d1), (int)((double)j / d1), true);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 60, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static Bitmap e(Bitmap bitmap)
    {
        float f1;
        if ((float)bitmap.getWidth() / (float)bitmap.getHeight() > 0.5633803F)
        {
            f1 = 1136F / (float)bitmap.getHeight();
        } else
        {
            f1 = 640F / (float)bitmap.getWidth();
        }
        if (f1 <= 1.0F)
        {
            return bitmap;
        } else
        {
            Matrix matrix = new Matrix();
            matrix.postScale(f1, f1);
            return a(bitmap, matrix);
        }
    }

    private static Pair e(Bitmap bitmap, Context context)
    {
        boolean flag = false;
        boolean flag1 = Jo.f(SnapchatApplication.get());
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        int k = displaymetrics.widthPixels;
        int l = Jo.i(context);
        int j = l;
        int i = k;
        if (!flag1)
        {
            j = l;
            i = k;
            if (k < l)
            {
                i = Jo.i(context);
                j = displaymetrics.widthPixels;
            }
        }
        if (i < bitmap.getWidth())
        {
            j = (bitmap.getWidth() - i) / 2;
            i = 0;
        } else
        if (j < bitmap.getHeight())
        {
            i = (bitmap.getHeight() - j) / 2;
            j = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
            j = ((flag) ? 1 : 0);
        }
        return Pair.create(Integer.valueOf(j), Integer.valueOf(i));
    }

    public static int f(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return 0;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return bitmap.getAllocationByteCount();
        } else
        {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }
    }

    private static Bitmap g(Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap, 102, (int)(((float)bitmap.getHeight() / (float)bitmap.getWidth()) * 102F), true);
        int i = bitmap1.getHeight() / 2 - bitmap1.getWidth() / 2;
        if (i >= 0)
        {
            bitmap = Bitmap.createBitmap(bitmap1, 0, i, bitmap1.getWidth(), bitmap1.getWidth());
        } else
        {
            bitmap = Bitmap.createBitmap(bitmap1, -i, 0, bitmap1.getHeight(), bitmap1.getHeight());
        }
        bitmap1.recycle();
        return bitmap;
    }

    public static native byte[] transcodeImage(byte abyte0[], int i);

}
