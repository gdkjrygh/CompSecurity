// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.accuweather.android.utilities:
//            PreferenceUtils, Utilities

public class ImageUtils
{

    private static final String LAST_CAPTURED_GALLERY_IMAGE_DISPLAYNAME = "last_captured_gallery_image_description";

    public ImageUtils()
    {
    }

    private static Bitmap captureScreenshot(Activity activity)
    {
        activity = activity.findViewById(0x1020002).getRootView();
        activity.setDrawingCacheEnabled(true);
        Bitmap bitmap = activity.getDrawingCache();
        if (bitmap == null)
        {
            bitmap = Bitmap.createBitmap(activity.getWidth(), activity.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            activity.draw(new Canvas(bitmap));
            activity.setDrawingCacheEnabled(false);
            return bitmap;
        } else
        {
            bitmap = Bitmap.createBitmap(bitmap);
            activity.setDrawingCacheEnabled(false);
            return bitmap;
        }
    }

    public static String captureScreenshotToStorageUri(Activity activity)
        throws IOException
    {
        return insertImageIntoGallery(activity, captureScreenshot(activity));
    }

    public static Intent createActionBarShareIntent(Activity activity)
    {
        activity = new Intent("android.intent.action.SEND");
        activity.addFlags(1);
        activity.putExtra("android.intent.extra.TITLE", "AccuWeather.com");
        activity.putExtra("android.intent.extra.SUBJECT", "AccuWeather.com");
        activity.putExtra("android.intent.extra.TEXT", "");
        activity.setType("image/png");
        return activity;
    }

    public static Intent createOptionsMenuShareIntent(Activity activity, String s)
        throws IOException
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(getRealPathFromURI(activity, s))));
        intent.putExtra("android.intent.extra.TITLE", "AccuWeather.com");
        intent.putExtra("android.intent.extra.SUBJECT", "AccuWeather.com");
        intent.setType("image/png");
        return Intent.createChooser(intent, activity.getString(com.accuweather.android.R.string.Share));
    }

    public static void deleteLastCapturedGalleryImage(Context context)
    {
        String s;
        try
        {
            s = PreferenceUtils.get(context, "last_captured_gallery_image_description", null);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        context.getContentResolver().delete(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_display_name = ?", new String[] {
            s
        });
    }

    public static Bitmap getCroppedBitmap(ImageView imageview, Bitmap bitmap)
    {
        float f1 = bitmap.getWidth();
        float f = bitmap.getHeight();
        float f2 = imageview.getWidth();
        float f3 = imageview.getHeight();
        if (f2 == 0.0F || f3 == 0.0F || f1 == 0.0F || f == 0.0F)
        {
            imageview = bitmap;
        } else
        {
            f3 = f2 / f3;
            if ((float)(int)(f1 / f3) <= f1)
            {
                f = (int)(f1 / f3);
            }
            f2 /= f1;
            imageview = new Matrix();
            imageview.preScale(f2, f2);
            if (f1 > 0.0F && f > 0.0F && (float)bitmap.getWidth() < f1 && (float)bitmap.getHeight() < f)
            {
                Bitmap bitmap1 = Bitmap.createBitmap(bitmap, 0, 0, (int)f1, (int)f, imageview, false);
                imageview = bitmap1;
                if (bitmap1 != bitmap)
                {
                    imageview = bitmap1;
                    if (!bitmap.isRecycled())
                    {
                        bitmap.recycle();
                        return bitmap1;
                    }
                }
            } else
            {
                return bitmap;
            }
        }
        return imageview;
    }

    public static String getRealPathFromURI(Context context, Uri uri)
    {
        context = context.getContentResolver().query(uri, new String[] {
            "_data"
        }, null, null, null);
        int i = context.getColumnIndexOrThrow("_data");
        context.moveToFirst();
        return context.getString(i);
    }

    public static String getRealPathFromURI(Context context, String s)
    {
        return getRealPathFromURI(context, Uri.parse(s));
    }

    private static String insertImageIntoGallery(Context context, Bitmap bitmap)
        throws IOException
    {
        bitmap = android.provider.MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "AccuWeather", null);
        if (bitmap != null)
        {
            Cursor cursor = android.provider.MediaStore.Images.Media.query(context.getContentResolver(), Uri.parse(bitmap), new String[] {
                "_display_name"
            });
            if (cursor.moveToFirst())
            {
                PreferenceUtils.save(context, "last_captured_gallery_image_description", cursor.getString(cursor.getColumnIndex("_display_name")));
            }
            cursor.close();
        }
        return bitmap;
    }

    public static void updateIntentForScreenshotShare(Activity activity, Intent intent)
        throws IOException
    {
        Bitmap bitmap = captureScreenshot(activity);
        String s = insertImageIntoGallery(activity, bitmap);
        if (s != null)
        {
            intent.putExtra("android.intent.extra.STREAM", Uri.parse(s));
        } else
        {
            intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(new File(writeBitmapToExternalStorage(bitmap, "AccuWeather_ImageShare.png", activity, 90))));
        }
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
    }

    public static String writeBitmapToExternalStorage(Bitmap bitmap, String s, Context context)
        throws IOException
    {
        return writeBitmapToExternalStorage(bitmap, s, context, 100);
    }

    public static String writeBitmapToExternalStorage(Bitmap bitmap, String s, Context context, int i)
        throws IOException
    {
        Object obj = null;
        context = Utilities.getOutputFilePath(context, s);
        if (context != null) goto _L2; else goto _L1
_L1:
        throw new IOException("External storage is not available and the image could not be written.");
        s;
        bitmap = obj;
_L4:
        if (bitmap != null)
        {
            bitmap.close();
        }
        throw s;
_L2:
        s = new FileOutputStream(new File(context));
        writeCompressedImage(s, bitmap, i);
        if (s != null)
        {
            s.close();
        }
        return context;
        context;
        bitmap = s;
        s = context;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static void writeCompressedImage(OutputStream outputstream, Bitmap bitmap, int i)
        throws IOException
    {
        bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, i, outputstream);
        outputstream.flush();
    }
}
