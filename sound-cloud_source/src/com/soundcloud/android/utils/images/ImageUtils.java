// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils.images;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.soundcloud.android.crop.Crop;
import com.soundcloud.android.image.ImageListener;
import com.soundcloud.android.image.OneShotTransitionDrawable;
import com.soundcloud.android.utils.AndroidUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public final class ImageUtils
{
    public static abstract class ViewlessLoadingListener
        implements ImageListener
    {

        View hardViewRef;

        public void onLoadingStarted(String s, View view)
        {
            hardViewRef = view;
        }

        public ViewlessLoadingListener()
        {
        }
    }


    public static final int DEFAULT_TRANSITION_DURATION = 200;
    private static final String ERROR = "error";
    public static final int RECOMMENDED_IMAGE_SIZE = 2048;
    private static final String TAG = com/soundcloud/android/utils/images/ImageUtils.getSimpleName();

    private ImageUtils()
    {
    }

    public static int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int i1;
label0:
        {
            int l = options.outHeight;
            i1 = options.outWidth;
            int k = 1;
            if (l > j || i1 > i)
            {
                if (i1 <= l)
                {
                    break label0;
                }
                k = Math.round((float)l / (float)j);
            }
            return k;
        }
        return Math.round((float)i1 / (float)i);
    }

    public static boolean checkIconShouldLoad(String s)
    {
        return !TextUtils.isEmpty(s) && !s.toLowerCase(Locale.US).equals("null") && !s.contains("default_avatar");
    }

    public static void clearBitmap(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap.recycle();
        }
    }

    public static RoundedBitmapDrawable createCircularDrawable(Bitmap bitmap, Resources resources)
    {
        resources = RoundedBitmapDrawableFactory.create(resources, bitmap);
        resources.setCornerRadius((float)Math.max(bitmap.getHeight(), bitmap.getWidth()) / 2.0F);
        return resources;
    }

    public static File createTempAvatarFile()
    {
        File file;
        try
        {
            file = File.createTempFile(Long.toString(System.currentTimeMillis()), ".bmp");
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return file;
    }

    public static TransitionDrawable createTransitionDrawable(Drawable drawable, Drawable drawable1)
    {
        Object obj = drawable;
        if (drawable == null)
        {
            obj = new ColorDrawable(0);
        }
        return new OneShotTransitionDrawable(new Drawable[] {
            obj, drawable1
        });
    }

    public static android.graphics.BitmapFactory.Options decode(File file)
        throws IOException
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        file = new FileInputStream(file);
        BitmapFactory.decodeStream(file, null, options);
        file.close();
        return options;
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources resources, int i, int j, int k)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(resources, i, options);
        options.inSampleSize = calculateInSampleSize(options, j, k);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(resources, i, options);
    }

    public static android.graphics.BitmapFactory.Options determineResizeOptions(File file, int i, int j, boolean flag)
        throws IOException
    {
        if (i != 0 && j != 0) goto _L2; else goto _L1
_L1:
        file = new android.graphics.BitmapFactory.Options();
_L4:
        return file;
_L2:
        android.graphics.BitmapFactory.Options options;
        int k;
        int l;
        options = decode(file);
        k = options.outHeight;
        l = options.outWidth;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (k > j)
        {
            break; /* Loop/switch isn't completed */
        }
        file = options;
        if (l <= i) goto _L4; else goto _L3
_L3:
        if (j / k < i / l)
        {
            options.inSampleSize = Math.round((float)k / (float)j);
            return options;
        } else
        {
            options.inSampleSize = Math.round((float)l / (float)i);
            return options;
        }
        if (j / k > i / l)
        {
            options.inSampleSize = Math.round((float)k / (float)j);
            return options;
        } else
        {
            options.inSampleSize = Math.round((float)l / (float)i);
            return options;
        }
    }

    public static Bitmap getConfiguredBitmap(File file, int i, int j)
    {
        float f = 0.0F;
        Object obj;
        Object obj1;
        obj = determineResizeOptions(file, i, j, false);
        obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inSampleSize = ((android.graphics.BitmapFactory.Options) (obj)).inSampleSize;
        obj = BitmapFactory.decodeFile(file.getAbsolutePath(), ((android.graphics.BitmapFactory.Options) (obj1)));
        obj1 = new Matrix();
        if (((Bitmap) (obj)).getWidth() <= ((Bitmap) (obj)).getHeight()) goto _L2; else goto _L1
_L1:
        float f1;
        float f2;
        f2 = (float)j / (float)((Bitmap) (obj)).getHeight();
        f1 = ((float)i - (float)((Bitmap) (obj)).getWidth() * f2) * 0.5F;
_L3:
        int k;
        ((Matrix) (obj1)).setScale(f2, f2);
        ((Matrix) (obj1)).postTranslate((int)(f1 + 0.5F), (int)(f + 0.5F));
        k = getExifRotation(file);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        ((Matrix) (obj1)).postRotate(k, i / 2, j / 2);
        if (((Matrix) (obj1)).isIdentity())
        {
            return ((Bitmap) (obj));
        }
        break MISSING_BLOCK_LABEL_197;
_L2:
        f2 = (float)i / (float)((Bitmap) (obj)).getWidth();
        f = j;
        float f3 = ((Bitmap) (obj)).getHeight();
        f1 = 0.0F;
        f = (f - f3 * f2) * 0.5F;
          goto _L3
        file = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), ((Matrix) (obj1)), true);
        return file;
        file;
_L5:
        return null;
        file;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static int getExifRotation(File file)
    {
        if (file == null)
        {
            return -1;
        }
        int i;
        try
        {
            i = (new ExifInterface(file.getAbsolutePath())).getAttributeInt("Orientation", 0);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return -1;
        }
        switch (i)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 6: // '\006'
            return 90;

        case 3: // '\003'
            return 180;

        case 8: // '\b'
            return 270;
        }
    }

    public static boolean isScreenXL(Resources resources)
    {
        return (resources.getConfiguration().screenLayout & 0xf) == 4;
    }

    public static void recycleImageViewBitmap(ImageView imageview)
    {
        if (imageview.getDrawable() instanceof BitmapDrawable)
        {
            Bitmap bitmap = ((BitmapDrawable)imageview.getDrawable()).getBitmap();
            if (bitmap != null && !bitmap.isRecycled())
            {
                clearBitmap(bitmap);
                imageview.setImageDrawable(null);
            }
        }
    }

    public static boolean resizeImageFile(File file, File file1, int i, int j)
        throws IOException
    {
        i = determineResizeOptions(file, i, j, false).inSampleSize;
        j = getExifRotation(file);
        if (i > 1 || j > 0)
        {
            file = new FileInputStream(file);
            Object obj = new android.graphics.BitmapFactory.Options();
            obj.inSampleSize = i;
            obj = BitmapFactory.decodeStream(file, null, ((android.graphics.BitmapFactory.Options) (obj)));
            file.close();
            file = ((File) (obj));
            if (j != 0)
            {
                file = new Matrix();
                file.postRotate(j);
                file = Bitmap.createBitmap(((Bitmap) (obj)), 0, 0, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight(), file, true);
                ((Bitmap) (obj)).recycle();
            }
            if (file == null)
            {
                throw new IOException("error decoding bitmap (bitmap == null)");
            } else
            {
                file1 = new FileOutputStream(file1);
                boolean flag = file.compress(android.graphics.Bitmap.CompressFormat.JPEG, 90, file1);
                file1.close();
                clearBitmap(file);
                return flag;
            }
        } else
        {
            String.format("not resizing: sampleSize %d, degree %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            });
            return false;
        }
    }

    public static void sendCropIntent(Activity activity, Uri uri)
    {
        sendCropIntent(activity, uri, uri, 2048, 2048);
    }

    public static void sendCropIntent(Activity activity, Uri uri, Uri uri1)
    {
        sendCropIntent(activity, uri, uri1, 2048, 2048);
    }

    public static void sendCropIntent(Activity activity, Uri uri, Uri uri1, int i, int j)
    {
        Crop.of(uri, uri1).asSquare().withMaxSize(i, j).start(activity);
    }

    public static void setImage(Bitmap bitmap, ImageView imageview, int i, int j, int k)
    {
        float f = 0.0F;
        Matrix matrix = new Matrix();
        float f1;
        float f2;
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            f2 = (float)j / (float)bitmap.getHeight();
            f1 = ((float)i - (float)bitmap.getWidth() * f2) * 0.5F;
        } else
        {
            f2 = (float)i / (float)bitmap.getWidth();
            f = j;
            float f3 = bitmap.getHeight();
            f1 = 0.0F;
            f = (f - f3 * f2) * 0.5F;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((int)(f1 + 0.5F), (int)(f + 0.5F));
        if (k != 0)
        {
            matrix.postRotate(k, i / 2, j / 2);
        }
        imageview.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        imageview.setImageMatrix(matrix);
        imageview.setImageBitmap(bitmap);
        imageview.setVisibility(0);
    }

    public static boolean setImage(File file, ImageView imageview, int i, int j)
    {
        Object obj;
        try
        {
            obj = determineResizeOptions(file, i, j, false);
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inSampleSize = ((android.graphics.BitmapFactory.Options) (obj)).inSampleSize;
            obj = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        (new StringBuilder("error decoding ")).append(file);
        return false;
        setImage(((Bitmap) (obj)), imageview, i, j, getExifRotation(file));
        return true;
    }

    public static void showImagePickerDialog(final Activity activity, final File newImageLocation)
    {
        (new android.support.v7.app.AlertDialog.Builder(activity)).setMessage(0x7f070148).setPositiveButton(0x7f0701fd, new _cls2()).setNegativeButton(0x7f07021e, new _cls1()).show();
    }

    public static void startPickImageIntent(Activity activity, int i)
    {
        Intent intent = (new Intent("android.intent.action.GET_CONTENT")).setType("image/*");
        try
        {
            activity.startActivityForResult(intent, i);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            AndroidUtils.showToast(activity, 0x7f07021f, new Object[0]);
        }
    }

    public static void startTakeNewPictureIntent(Activity activity, File file, int i)
    {
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        file = (new Intent("android.media.action.IMAGE_CAPTURE")).putExtra("output", Uri.fromFile(file));
        activity.startActivityForResult(file, i);
        return;
        file;
        AndroidUtils.showToast(activity, 0x7f0701fe, new Object[0]);
        return;
    }

    public static Bitmap toBitmap(Drawable drawable, int i, int j)
    {
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        } else
        {
            Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        }
    }


    private class _cls2
        implements android.content.DialogInterface.OnClickListener
    {

        final Activity val$activity;
        final File val$newImageLocation;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            ImageUtils.startTakeNewPictureIntent(activity, newImageLocation, 9001);
        }

        _cls2()
        {
            activity = activity1;
            newImageLocation = file;
            super();
        }
    }


    private class _cls1
        implements android.content.DialogInterface.OnClickListener
    {

        final Activity val$activity;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            ImageUtils.startPickImageIntent(activity, 9000);
        }

        _cls1()
        {
            activity = activity1;
            super();
        }
    }

}
