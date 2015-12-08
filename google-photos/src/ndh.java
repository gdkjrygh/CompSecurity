// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.mtp.MtpDevice;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

public final class ndh
{

    private static int a = 0;

    public static Bitmap a(MtpDevice mtpdevice, ndg ndg1)
    {
        mtpdevice = mtpdevice.getThumbnail(ndg1.a);
        if (mtpdevice != null)
        {
            ndg1 = new android.graphics.BitmapFactory.Options();
            ndg1.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(mtpdevice, 0, mtpdevice.length, ndg1);
            if (((android.graphics.BitmapFactory.Options) (ndg1)).outWidth != 0 && ((android.graphics.BitmapFactory.Options) (ndg1)).outHeight != 0)
            {
                ndg1.inBitmap = null;
                ndg1.inMutable = true;
                ndg1.inJustDecodeBounds = false;
                ndg1.inSampleSize = 1;
                try
                {
                    ndg1 = BitmapFactory.decodeByteArray(mtpdevice, 0, mtpdevice.length, ndg1);
                }
                // Misplaced declaration of an exception variable
                catch (ndg ndg1)
                {
                    return BitmapFactory.decodeByteArray(mtpdevice, 0, mtpdevice.length);
                }
                return ndg1;
            }
        }
        return null;
    }

    public static void a(Context context)
    {
        DisplayMetrics displaymetrics = new DisplayMetrics();
        ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
        a = Math.max(displaymetrics.heightPixels, displaymetrics.widthPixels);
    }

    public static void a(Bitmap bitmap)
    {
        if (bitmap != null)
        {
            bitmap.recycle();
        }
    }

    public static ndc b(MtpDevice mtpdevice, ndg ndg1)
    {
        int i = 1;
        int k = a;
        mtpdevice = mtpdevice.getObject(ndg1.a, ndg1.d);
        if (mtpdevice != null)
        {
            if (k > 0)
            {
                ndg1 = new android.graphics.BitmapFactory.Options();
                ndg1.inJustDecodeBounds = true;
                BitmapFactory.decodeByteArray(mtpdevice, 0, mtpdevice.length, ndg1);
                int j = ((android.graphics.BitmapFactory.Options) (ndg1)).outWidth;
                for (j = Math.max(((android.graphics.BitmapFactory.Options) (ndg1)).outHeight, j); j >> 1 >= k;)
                {
                    j >>= 1;
                    i++;
                }

                ndg1.inSampleSize = i;
                ndg1.inJustDecodeBounds = false;
                mtpdevice = BitmapFactory.decodeByteArray(mtpdevice, 0, mtpdevice.length, ndg1);
            } else
            {
                mtpdevice = BitmapFactory.decodeByteArray(mtpdevice, 0, mtpdevice.length);
            }
            if (mtpdevice != null)
            {
                return new ndc(mtpdevice, 0);
            }
        }
        return null;
    }

}
