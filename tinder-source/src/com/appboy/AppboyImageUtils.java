// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PermissionUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

// Referenced classes of package com.appboy:
//            Constants

public class AppboyImageUtils
{

    public static final int BASELINE_SCREEN_DPI = 160;
    private static final String TAG;

    public AppboyImageUtils()
    {
    }

    public static Bitmap downloadImageBitmap(String s)
    {
        Bitmap bitmap;
        Bitmap bitmap1;
        Object obj;
        Object obj1;
        Object obj2;
        bitmap = null;
        obj = null;
        obj1 = null;
        obj2 = null;
        bitmap1 = null;
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        AppboyLogger.i(TAG, "Null or empty Url string passed to image bitmap download. Not attempting download.");
_L4:
        return bitmap1;
_L2:
        bitmap1 = bitmap;
        Bitmap bitmap2 = obj;
        Bitmap bitmap3 = obj1;
        Bitmap bitmap4 = obj2;
        InputStream inputstream;
        try
        {
            inputstream = (new URL(s)).openStream();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            AppboyLogger.e(TAG, String.format("Out of Memory Error in image bitmap download for Url: %s.", new Object[] {
                s
            }), outofmemoryerror);
            return bitmap1;
        }
        catch (UnknownHostException unknownhostexception)
        {
            AppboyLogger.e(TAG, String.format("Unknown Host Exception in image bitmap download for Url: %s. Device may be offline.", new Object[] {
                s
            }), unknownhostexception);
            return bitmap2;
        }
        catch (MalformedURLException malformedurlexception)
        {
            AppboyLogger.e(TAG, String.format("Malformed URL Exception in image bitmap download for Url: %s. Image Url may be corrupted.", new Object[] {
                s
            }), malformedurlexception);
            return bitmap3;
        }
        catch (Exception exception)
        {
            AppboyLogger.e(TAG, String.format("Exception in image bitmap download for Url: %s", new Object[] {
                s
            }), exception);
            return bitmap4;
        }
        bitmap1 = bitmap;
        bitmap2 = obj;
        bitmap3 = obj1;
        bitmap4 = obj2;
        bitmap = BitmapFactory.decodeStream(inputstream);
        bitmap1 = bitmap;
        if (inputstream == null) goto _L4; else goto _L3
_L3:
        bitmap1 = bitmap;
        bitmap2 = bitmap;
        bitmap3 = bitmap;
        bitmap4 = bitmap;
        inputstream.close();
        return bitmap;
    }

    public static int getPixelsFromDensityAndDp(int i, int j)
    {
        return (i * j) / 160;
    }

    public static boolean isWriteExternalPermissionGranted(Context context)
    {
        return context != null && PermissionUtils.hasPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static Uri storeBitmapLocally(Context context, Bitmap bitmap, String s, String s1)
    {
        if (context == null)
        {
            AppboyLogger.w(TAG, "Received null context. Doing nothing.");
            return null;
        }
        if (bitmap == null)
        {
            AppboyLogger.w(TAG, "Received null bitmap. Doing nothing.");
            return null;
        }
        if (s == null)
        {
            AppboyLogger.w(TAG, "Received null image filename base. Doing nothing.");
            return null;
        }
        if (s1 == null)
        {
            AppboyLogger.w(TAG, "Received null image folder name. Doing nothing.");
            return null;
        }
        try
        {
            s1 = new File((new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").append(s1).toString());
            if (!s1.exists())
            {
                s1.mkdirs();
            }
            s = new File(s1, (new StringBuilder()).append(s).append(".png").toString());
            AppboyLogger.d(TAG, (new StringBuilder("Storing image locally at ")).append(s.getAbsolutePath()).toString());
            s1 = new FileOutputStream(s);
            bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 0, s1);
            s1.flush();
            s1.close();
            MediaScannerConnection.scanFile(context, new String[] {
                s.getAbsolutePath()
            }, null, null);
            context = Uri.fromFile(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            AppboyLogger.e(TAG, "Exception occurred when attempting to store image locally.", context);
            return null;
        }
        return context;
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/AppboyImageUtils.getName()
        });
    }
}
