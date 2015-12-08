// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.pinterest.kit.application.CommonApplication;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;

public class ImageUtils
{

    private static final int IMAGE_HEIGHT_MAX_DELTA = 256;
    private static final int IMAGE_WIDTH_MAX_DELTA = 256;
    public static final int MAX_BITMAP_HEIGHT = 2048;
    public static final int MAX_BITMAP_WIDTH = 2048;
    public static final FilenameFilter PICTURE_FILE_FILTER = new _cls1();
    public static final int SELECT_PICTURE = 5678;

    public ImageUtils()
    {
    }

    public static Bitmap bitmapFromView(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            Bitmap bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmap));
            return bitmap;
        }
    }

    public static Bitmap bitmapSafeCrop(Bitmap bitmap)
    {
        if (bitmap == null || !isBigImage(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight())))
        {
            return bitmap;
        }
        int i = Math.min(bitmap.getWidth(), 2048);
        int j = Math.min(bitmap.getHeight(), 2048);
        Bitmap bitmap1;
        try
        {
            bitmap1 = Bitmap.createBitmap(bitmap, 0, 0, i, j);
        }
        catch (NullPointerException nullpointerexception)
        {
            nullpointerexception = bitmap;
        }
        if (bitmap != bitmap1)
        {
            bitmap.recycle();
        }
        return bitmap1;
    }

    public static Bitmap bitmapToExactFit(Bitmap bitmap, int i, int j)
    {
        int i1 = 0;
        int k = bitmap.getWidth();
        int j1 = bitmap.getHeight();
        float f = (float)i / (float)k;
        float f1 = (float)j / (float)j1;
        Bitmap bitmap2;
        if (f > f1)
        {
            f1 = f;
        } else
        {
            f = f1;
        }
        bitmap2 = Bitmap.createScaledBitmap(bitmap, (int)Math.ceil(f1 * (float)k), (int)Math.ceil(f * (float)j1), true);
        if (bitmap2 != bitmap)
        {
            bitmap.recycle();
        }
        if (bitmap2 == null)
        {
            bitmap = null;
        } else
        {
            int l = bitmap2.getWidth();
            int k1 = bitmap2.getHeight();
            l = (int)(Math.floor(l - i) / 2D);
            Bitmap bitmap1;
            if (l < 0)
            {
                l = 0;
            }
            k1 = (int)(Math.floor(k1 - j) / 2D);
            if (k1 >= 0)
            {
                i1 = k1;
            }
            try
            {
                bitmap1 = Bitmap.createBitmap(bitmap2, l, i1, i, j);
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                return null;
            }
            bitmap = bitmap1;
            if (bitmap2 != bitmap1)
            {
                bitmap2.recycle();
                return bitmap1;
            }
        }
        return bitmap;
    }

    public static Bitmap bitmapToScale(Bitmap bitmap, int i, int j)
    {
        int k = bitmap.getWidth();
        int l = bitmap.getHeight();
        float f = (float)i / (float)k;
        float f1 = (float)j / (float)l;
        Bitmap bitmap1;
        if (f < f1)
        {
            f1 = f;
        } else
        {
            f = f1;
        }
        bitmap1 = Bitmap.createScaledBitmap(bitmap, (int)Math.ceil(f1 * (float)k), (int)Math.ceil(f * (float)l), true);
        if (bitmap1 != bitmap)
        {
            bitmap.recycle();
        }
        return bitmap1;
    }

    public static void cleanScratch(Context context, String s)
    {
        context = new File(context.getCacheDir(), String.format("%s.png", new Object[] {
            s
        }));
        if (context.exists())
        {
            context.delete();
        }
    }

    public static Bitmap combineBitmaps(Bitmap bitmap, Bitmap bitmap1)
    {
        return combineBitmaps(bitmap, bitmap1, true);
    }

    public static Bitmap combineBitmaps(Bitmap bitmap, Bitmap bitmap1, boolean flag)
    {
        Bitmap bitmap2 = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        bitmap.recycle();
        (new Canvas(bitmap2)).drawBitmap(bitmap1, 0.0F, 0.0F, null);
        if (flag)
        {
            bitmap1.recycle();
        }
        return bitmap2;
    }

    private static int computeSampleSize(int i, int j, int k, int l, int i1, int j1)
    {
        if (k > 0 && l > 0) goto _L2; else goto _L1
_L1:
        int l1 = 1;
_L4:
        return l1;
_L2:
        int k1;
        if (l > j || k > i)
        {
            k1 = Math.round((float)l / (float)j);
            l1 = Math.round((float)k / (float)i);
            if (k1 >= l1)
            {
                k1 = l1;
            }
            if (!isPowerOfTwo(k1))
            {
                k1 = nextPowerOfTwo(k1);
            }
        } else
        {
            k1 = 1;
        }
        if (k1 <= 0)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        k /= k1;
        l /= k1;
        l1 = k1;
        k1 = k;
        k = l1;
        if (k1 > i + i1)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = k;
        if (l <= j + j1) goto _L4; else goto _L3
_L3:
        k1 /= 2;
        l /= 2;
        k *= 2;
        break MISSING_BLOCK_LABEL_84;
        if (true) goto _L4; else goto _L5
_L5:
        return 1;
    }

    private static float exifOrientationToDegrees(int i)
    {
        if (i == 6)
        {
            return 90F;
        }
        if (i == 3)
        {
            return 180F;
        }
        return i != 8 ? 0.0F : 270F;
    }

    public static int getBitmapBytes(Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return bitmap.getAllocationByteCount();
        } else
        {
            return bitmap.getByteCount();
        }
    }

    public static String getMediaPath(Activity activity, Uri uri)
    {
        Object obj = null;
        uri = activity.managedQuery(uri, new String[] {
            "_data"
        }, null, null, null);
        activity = obj;
        if (uri != null)
        {
            int i = uri.getColumnIndexOrThrow("_data");
            uri.moveToFirst();
            activity = uri.getString(i);
        }
        return activity;
    }

    public static Bitmap getMutableBitamp(int i)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inMutable = true;
        Bitmap bitmap = Resources.bitmap(i, ((android.graphics.BitmapFactory.Options) (obj)));
        obj = bitmap;
        if (bitmap != null)
        {
            obj = bitmap;
            if (!bitmap.isMutable())
            {
                obj = bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
            }
        }
        return ((Bitmap) (obj));
    }

    public static int getPowerOfTwoForSampleRatio(double d)
    {
        int j = Integer.highestOneBit((int)Math.floor(d));
        int i = j;
        if (j == 0)
        {
            i = 1;
        }
        return i;
    }

    public static android.graphics.BitmapFactory.Options getResourceDimensions(int i)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(CommonApplication.context().getResources(), i, options);
        return options;
    }

    public static boolean getScratchExists(Context context, String s)
    {
        return (new File(context.getCacheDir(), String.format("%s.png", new Object[] {
            s
        }))).exists();
    }

    public static Bitmap getScratchImage(Context context, String s)
    {
        return BitmapFactory.decodeFile((new File(context.getCacheDir(), String.format("%s.png", new Object[] {
            s
        }))).getPath());
    }

    public static Bitmap imageFromUri(Context context, Uri uri, int i, int j)
    {
        try
        {
            context = imageFromUri(context, uri, 0, 0, i, j, false, null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        return context;
    }

    public static Bitmap imageFromUri(Context context, Uri uri, int i, int j, int k, int l, boolean flag, Matrix matrix)
    {
        Object obj;
        Object obj1;
        obj = context.getContentResolver().openInputStream(uri);
        obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        obj1.inDensity = 0;
        obj1.inPurgeable = true;
        obj1.inInputShareable = true;
        if (obj == null) goto _L2; else goto _L1
_L1:
        BitmapFactory.decodeStream(((InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj1)));
        IOUtils.closeQuietly(((InputStream) (obj)));
        int i1 = computeSampleSize(k, l, ((android.graphics.BitmapFactory.Options) (obj1)).outWidth, ((android.graphics.BitmapFactory.Options) (obj1)).outHeight, 256, 256);
        obj = new android.graphics.BitmapFactory.Options();
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj.inDensity = 0;
        obj.inPurgeable = true;
        obj.inInputShareable = true;
        obj.inSampleSize = i1;
        obj1 = context.getContentResolver().openInputStream(uri);
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        obj = BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.BitmapFactory.Options) (obj)));
        IOUtils.closeQuietly(((InputStream) (obj1)));
        if (obj != null) goto _L6; else goto _L5
_L5:
        context = null;
_L8:
        return context;
_L2:
        return null;
_L4:
        return null;
_L6:
        int j1 = 0;
        int k1 = rotationForImage(context, uri);
        j1 = k1;
_L10:
        if (j1 != 0)
        {
            context = matrix;
            if (matrix == null)
            {
                context = new Matrix();
            }
            context.preRotate(j1);
        } else
        {
            context = matrix;
        }
        if (context != null)
        {
            if (i + k > ((Bitmap) (obj)).getWidth())
            {
                k = ((Bitmap) (obj)).getWidth() - i;
            }
            if (j + l > ((Bitmap) (obj)).getHeight())
            {
                l = ((Bitmap) (obj)).getHeight() - j;
            }
            try
            {
                context = Bitmap.createBitmap(((Bitmap) (obj)), i, j, k, l, context, true);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            if (context != obj)
            {
                ((Bitmap) (obj)).recycle();
            }
            if (flag && (context.getWidth() != k || context.getHeight() != l))
            {
                return bitmapToExactFit(context, k, l);
            } else
            {
                return context;
            }
        }
        context = ((Context) (obj));
        if (!flag) goto _L8; else goto _L7
_L7:
        if (((Bitmap) (obj)).getWidth() != k)
        {
            break; /* Loop/switch isn't completed */
        }
        context = ((Context) (obj));
        if (((Bitmap) (obj)).getHeight() == l) goto _L8; else goto _L9
_L9:
        return bitmapToExactFit(((Bitmap) (obj)), k, l);
        context;
          goto _L10
    }

    public static boolean isBigImage(Integer integer, Integer integer1)
    {
        return integer == null || integer1 == null || integer.intValue() > 2048 || integer1.intValue() > 2048;
    }

    public static boolean isPowerOfTwo(int i)
    {
        return i != 0 && (i - 1 & i) == 0;
    }

    public static int nextPowerOfTwo(int i)
    {
        i--;
        i |= i >> 1;
        i |= i >> 2;
        i |= i >> 4;
        i |= i >> 8;
        return (i | i >> 16) + 1;
    }

    public static boolean recycleBitmap(ImageView imageview)
    {
        if (imageview == null)
        {
            return false;
        }
        android.graphics.drawable.Drawable drawable = imageview.getDrawable();
        if (drawable instanceof BitmapDrawable)
        {
            ((BitmapDrawable)drawable).getBitmap().recycle();
            imageview.setImageDrawable(null);
            return true;
        } else
        {
            return false;
        }
    }

    public static int rotationForImage(Context context, Uri uri)
    {
        if (uri.getScheme().equals("content"))
        {
            context = context.getContentResolver().query(uri, new String[] {
                "orientation"
            }, null, null, null);
            if (context.moveToFirst())
            {
                return context.getInt(0);
            }
            break MISSING_BLOCK_LABEL_102;
        }
        if (!uri.getScheme().equals("file"))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        float f = exifOrientationToDegrees((new ExifInterface(uri.getPath())).getAttributeInt("Orientation", 1));
        return (int)f;
        context;
        PLog.error(context, "Error checking exif", new Object[0]);
        return 0;
    }

    public static Bitmap scaleImageFromUri(Context context, Uri uri, int i, int j)
    {
        Object obj = context.getContentResolver().openInputStream(uri);
        Object obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        obj1.inDensity = 0;
        obj1.inPurgeable = true;
        obj1.inInputShareable = true;
        BitmapFactory.decodeStream(((InputStream) (obj)), null, ((android.graphics.BitmapFactory.Options) (obj1)));
        ((InputStream) (obj)).close();
        i = computeSampleSize(i, j, ((android.graphics.BitmapFactory.Options) (obj1)).outWidth, ((android.graphics.BitmapFactory.Options) (obj1)).outHeight, 256, 256);
        obj = new android.graphics.BitmapFactory.Options();
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        obj.inDensity = 0;
        obj.inPurgeable = true;
        obj.inInputShareable = true;
        obj.inSampleSize = i;
        obj1 = context.getContentResolver().openInputStream(uri);
        obj = BitmapFactory.decodeStream(((InputStream) (obj1)), null, ((android.graphics.BitmapFactory.Options) (obj)));
        ((InputStream) (obj1)).close();
        i = rotationForImage(context, uri);
        if (i == 0)
        {
            return ((Bitmap) (obj));
        }
        context = new Matrix();
        context.preRotate(i);
        try
        {
            context = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), context, true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return null;
        }
        if (obj != context)
        {
            ((Bitmap) (obj)).recycle();
        }
        return context;
    }

    public static void storeScratchImage(Context context, Bitmap bitmap, String s)
    {
        storeScratchImage(context, bitmap, s, true);
    }

    public static void storeScratchImage(Context context, Bitmap bitmap, String s, boolean flag)
    {
        try
        {
            context = new BufferedOutputStream(new FileOutputStream(new File(context.getCacheDir(), String.format("%s.png", new Object[] {
                s
            }))));
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, context);
            context.flush();
            context.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            PLog.error(context, "exception occurred", new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            PLog.error(context, "exception occurred", new Object[0]);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        bitmap.recycle();
    }

    public static Bitmap toPotBmp(Bitmap bitmap)
    {
        Bitmap bitmap1;
label0:
        {
            int i = nextPowerOfTwo(bitmap.getWidth());
            int j = nextPowerOfTwo(bitmap.getHeight());
            if (i == bitmap.getWidth())
            {
                bitmap1 = bitmap;
                if (j == bitmap.getHeight())
                {
                    break label0;
                }
            }
            bitmap1 = Bitmap.createScaledBitmap(bitmap, i, j, true);
            if (bitmap1 != bitmap)
            {
                bitmap.recycle();
            }
        }
        return bitmap1;
    }


    /* member class not found */
    class _cls1 {}

}
