// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import com.facebook.debug.log.b;
import java.io.Closeable;
import java.io.IOException;

// Referenced classes of package com.facebook.orca.camera:
//            a, ab, x

public class aa
{

    private static final Class a = com/facebook/orca/camera/aa;

    private aa()
    {
    }

    public static int a(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int k = b(options, i, j);
        if (k <= 8)
        {
            i = 1;
            do
            {
                j = i;
                if (i >= k)
                {
                    break;
                }
                i <<= 1;
            } while (true);
        } else
        {
            j = ((k + 7) / 8) * 8;
        }
        return j;
    }

    public static Bitmap a(int i, int j, Uri uri, ContentResolver contentresolver, ParcelFileDescriptor parcelfiledescriptor, android.graphics.BitmapFactory.Options options)
    {
        ParcelFileDescriptor parcelfiledescriptor1;
        ParcelFileDescriptor parcelfiledescriptor2;
        parcelfiledescriptor1 = parcelfiledescriptor;
        if (parcelfiledescriptor != null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        parcelfiledescriptor2 = parcelfiledescriptor;
        parcelfiledescriptor1 = a(uri, contentresolver);
        if (parcelfiledescriptor1 == null)
        {
            a(parcelfiledescriptor1);
            return null;
        }
        uri = options;
        if (options != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        uri = new android.graphics.BitmapFactory.Options();
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        contentresolver = parcelfiledescriptor1.getFileDescriptor();
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        uri.inJustDecodeBounds = true;
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        com.facebook.orca.camera.a.a().a(contentresolver, uri);
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        if (((android.graphics.BitmapFactory.Options) (uri)).mCancel)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        if (((android.graphics.BitmapFactory.Options) (uri)).outWidth == -1)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        int k = ((android.graphics.BitmapFactory.Options) (uri)).outHeight;
        if (k != -1)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        a(parcelfiledescriptor1);
        return null;
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        uri.inSampleSize = a(((android.graphics.BitmapFactory.Options) (uri)), i, j);
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        uri.inJustDecodeBounds = false;
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        uri.inDither = false;
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        uri.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        parcelfiledescriptor2 = parcelfiledescriptor1;
        parcelfiledescriptor = parcelfiledescriptor1;
        uri = com.facebook.orca.camera.a.a().a(contentresolver, uri);
        a(parcelfiledescriptor1);
        return uri;
        uri;
        parcelfiledescriptor = parcelfiledescriptor2;
        com.facebook.debug.log.b.e(a, "Got oom exception ", uri);
        a(parcelfiledescriptor2);
        return null;
        uri;
        a(parcelfiledescriptor);
        throw uri;
    }

    public static Bitmap a(int i, int j, Uri uri, ContentResolver contentresolver, boolean flag)
    {
        ParcelFileDescriptor parcelfiledescriptor = contentresolver.openFileDescriptor(uri, "r");
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        android.graphics.BitmapFactory.Options options = a();
_L5:
        uri = a(i, j, uri, contentresolver, parcelfiledescriptor, options);
        a(parcelfiledescriptor);
        return uri;
        uri;
        parcelfiledescriptor = null;
_L4:
        a(parcelfiledescriptor);
        return null;
        uri;
        parcelfiledescriptor = null;
_L2:
        a(parcelfiledescriptor);
        throw uri;
        uri;
        if (true) goto _L2; else goto _L1
_L1:
        uri;
        if (true) goto _L4; else goto _L3
_L3:
        options = null;
          goto _L5
    }

    public static Bitmap a(int i, int j, ParcelFileDescriptor parcelfiledescriptor, boolean flag)
    {
        android.graphics.BitmapFactory.Options options;
        if (flag)
        {
            options = a();
        } else
        {
            options = null;
        }
        return a(i, j, ((Uri) (null)), ((ContentResolver) (null)), parcelfiledescriptor, options);
    }

    public static Bitmap a(Bitmap bitmap, int i)
    {
        Object obj = bitmap;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        obj = new Matrix();
        ((Matrix) (obj)).setRotate(i, (float)bitmap.getWidth() / 2.0F, (float)bitmap.getHeight() / 2.0F);
        Bitmap bitmap1;
        try
        {
            bitmap1 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), ((Matrix) (obj)), true);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            return bitmap;
        }
        obj = bitmap;
        if (bitmap == bitmap1)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        bitmap.recycle();
        obj = bitmap1;
        return ((Bitmap) (obj));
    }

    public static Bitmap a(Matrix matrix, Bitmap bitmap, int i, int j, boolean flag, boolean flag1)
    {
        int k;
        int i1;
        i1 = bitmap.getWidth() - i;
        k = bitmap.getHeight() - j;
        if (flag || i1 >= 0 && k >= 0) goto _L2; else goto _L1
_L1:
        matrix = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(matrix);
        i1 = Math.max(0, i1 / 2);
        k = Math.max(0, k / 2);
        Rect rect = new Rect(i1, k, Math.min(i, bitmap.getWidth()) + i1, Math.min(j, bitmap.getHeight()) + k);
        k = (i - rect.width()) / 2;
        i1 = (j - rect.height()) / 2;
        canvas.drawBitmap(bitmap, rect, new Rect(k, i1, i - k, j - i1), null);
        if (flag1)
        {
            bitmap.recycle();
        }
_L4:
        return matrix;
_L2:
        float f = bitmap.getWidth();
        float f1 = bitmap.getHeight();
        Bitmap bitmap1;
        if (f / f1 > (float)i / (float)j)
        {
            f = (float)j / f1;
            Bitmap bitmap2;
            int l;
            int j1;
            if (f < 0.9F || f > 1.0F)
            {
                matrix.setScale(f, f);
            } else
            {
                matrix = null;
            }
        } else
        {
            f = (float)i / f;
            if (f < 0.9F || f > 1.0F)
            {
                matrix.setScale(f, f);
            } else
            {
                matrix = null;
            }
        }
        if (matrix != null)
        {
            bitmap1 = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } else
        {
            bitmap1 = bitmap;
        }
        if (flag1 && bitmap1 != bitmap)
        {
            bitmap.recycle();
        }
        l = Math.max(0, bitmap1.getWidth() - i);
        j1 = Math.max(0, bitmap1.getHeight() - j);
        bitmap2 = Bitmap.createBitmap(bitmap1, l / 2, j1 / 2, i, j);
        matrix = bitmap2;
        if (bitmap2 == bitmap1) goto _L4; else goto _L3
_L3:
        if (flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        matrix = bitmap2;
        if (bitmap1 == bitmap) goto _L4; else goto _L5
_L5:
        bitmap1.recycle();
        return bitmap2;
    }

    public static android.graphics.BitmapFactory.Options a()
    {
        return new android.graphics.BitmapFactory.Options();
    }

    private static ParcelFileDescriptor a(Uri uri, ContentResolver contentresolver)
    {
        try
        {
            uri = contentresolver.openFileDescriptor(uri, "r");
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return null;
        }
        return uri;
    }

    public static void a(ParcelFileDescriptor parcelfiledescriptor)
    {
        if (parcelfiledescriptor == null)
        {
            return;
        }
        try
        {
            parcelfiledescriptor.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ParcelFileDescriptor parcelfiledescriptor)
        {
            return;
        }
    }

    public static void a(x x, String s, String s1, Runnable runnable, Handler handler)
    {
        (new Thread(new ab(x, runnable, ProgressDialog.show(x, s, s1, true, false), handler))).start();
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            return;
        }
        try
        {
            closeable.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Closeable closeable)
        {
            return;
        }
    }

    public static boolean a(String s, String s1)
    {
        return s == s1 || s.equals(s1);
    }

    private static int b(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        double d = options.outWidth;
        double d1 = options.outHeight;
        int k;
        int l;
        if (j == -1)
        {
            k = 1;
        } else
        {
            k = (int)Math.ceil(Math.sqrt((d * d1) / (double)j));
        }
        if (i == -1)
        {
            l = 128;
        } else
        {
            l = (int)Math.min(Math.floor(d / (double)i), Math.floor(d1 / (double)i));
        }
        if (l >= k)
        {
            if (j == -1 && i == -1)
            {
                return 1;
            }
            if (i != -1)
            {
                return l;
            }
        }
        return k;
    }

}
