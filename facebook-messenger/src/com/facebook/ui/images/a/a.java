// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.images.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.facebook.ui.images.cache.e;
import com.facebook.ui.images.cache.f;
import com.facebook.ui.media.attachments.MediaResource;
import com.google.common.b.c;
import com.google.common.base.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// Referenced classes of package com.facebook.ui.images.a:
//            c, b

public class a
{

    private final Context a;

    public a(Context context)
    {
        a = context;
    }

    private int a(int i, int j, int k, int l, f f1)
    {
        if (j != -2) goto _L2; else goto _L1
_L1:
        int i1 = a.getResources().getDisplayMetrics().heightPixels;
_L11:
        boolean flag;
        if (i == -2)
        {
            j = a.getResources().getDisplayMetrics().widthPixels;
        } else
        {
            j = i;
            if (i == -1)
            {
                j = k;
            }
        }
        i = 1;
        flag = true;
        c.a[f1.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 112
    //                   2 154
    //                   3 177;
           goto _L3 _L4 _L5 _L6
_L3:
        k = ((flag) ? 1 : 0);
_L8:
        return k;
_L2:
        i1 = j;
        if (j == -1)
        {
            i1 = l;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        k = l * k * 4;
        l = (i1 * 17 * j * 4) / 10;
        j = k;
_L9:
        k = i;
        if (j <= l) goto _L8; else goto _L7
_L7:
        j /= 4;
        i *= 2;
          goto _L9
          goto _L8
_L5:
        return (int)Math.max(Math.floor((double)k / (double)j), Math.floor((double)l / (double)i1));
_L6:
        return (int)Math.min(Math.floor((double)k / (double)j), Math.floor((double)l / (double)i1));
        if (true) goto _L11; else goto _L10
_L10:
    }

    private int a(com.facebook.ui.media.attachments.a a1)
    {
        Object obj;
        obj = a1.a().d();
        if (Objects.equal("file", ((Uri) (obj)).getScheme()))
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj = (new StringBuilder()).append("temp-rotate_").append(System.currentTimeMillis()).toString();
        obj = a.getFileStreamPath(((String) (obj)));
        int i;
        com.google.common.b.a.a(a1.c(), new b(this, ((File) (obj))));
        i = (new ExifInterface(((File) (obj)).getAbsolutePath())).getAttributeInt("Orientation", 1);
        ((File) (obj)).delete();
        return i;
        a1;
        ((File) (obj)).delete();
        throw a1;
        return (new ExifInterface(((Uri) (obj)).getPath())).getAttributeInt("Orientation", 1);
    }

    static Context a(a a1)
    {
        return a1.a;
    }

    private Bitmap a(Bitmap bitmap, int i)
    {
        if (i == 0 || i == 1)
        {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int j;
        if (i == 2)
        {
            matrix.postScale(1.0F, -1F);
            j = 1;
        } else
        if (i == 4)
        {
            matrix.postScale(1.0F, -1F);
            j = 3;
        } else
        if (i == 7)
        {
            matrix.postScale(1.0F, -1F);
            j = 6;
        } else
        {
            j = i;
            if (i == 5)
            {
                matrix.postScale(1.0F, -1F);
                j = 8;
            }
        }
        if (j == 3)
        {
            matrix.postRotate(180F);
        } else
        if (j == 6)
        {
            matrix.postRotate(90F);
        } else
        if (j == 8)
        {
            matrix.postRotate(270F);
        }
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public Bitmap a(com.facebook.ui.media.attachments.a a1, int i)
    {
        return a(a1, i, i);
    }

    public Bitmap a(com.facebook.ui.media.attachments.a a1, int i, int j)
    {
        return a(a1, i, j, false, e.a);
    }

    public Bitmap a(com.facebook.ui.media.attachments.a a1, int i, int j, boolean flag, f f1)
    {
        java.io.InputStream inputstream;
        Object obj;
        try
        {
            obj = new android.graphics.BitmapFactory.Options();
            obj.inJustDecodeBounds = true;
            inputstream = a1.b();
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.ui.media.attachments.a a1)
        {
            return null;
        }
        if (!(inputstream instanceof FileInputStream)) goto _L2; else goto _L1
_L1:
        BitmapFactory.decodeFileDescriptor(((FileInputStream)inputstream).getFD(), null, ((android.graphics.BitmapFactory.Options) (obj)));
_L12:
        c.a(inputstream);
        if (i != -1 || j != -1) goto _L4; else goto _L3
_L3:
        i = 1;
_L9:
        f1 = new android.graphics.BitmapFactory.Options();
        f1.inSampleSize = i;
        inputstream = a1.b();
        if (!flag) goto _L6; else goto _L5
_L5:
        if (!(inputstream instanceof FileInputStream)) goto _L6; else goto _L7
_L7:
        obj = ((FileInputStream)inputstream).getFD();
        f1.inPurgeable = true;
        f1.inInputShareable = true;
        f1 = BitmapFactory.decodeFileDescriptor(((java.io.FileDescriptor) (obj)), null, f1);
_L10:
        c.a(inputstream);
        if (f1 == null)
        {
            return null;
        }
          goto _L8
_L2:
        BitmapFactory.decodeStream(inputstream, null, ((android.graphics.BitmapFactory.Options) (obj)));
        continue; /* Loop/switch isn't completed */
        a1;
        c.a(inputstream);
        throw a1;
_L4:
        i = a(i, j, ((android.graphics.BitmapFactory.Options) (obj)).outWidth, ((android.graphics.BitmapFactory.Options) (obj)).outHeight, f1);
          goto _L9
_L6:
        f1 = BitmapFactory.decodeStream(inputstream, null, f1);
          goto _L10
        a1;
        c.a(inputstream);
        throw a1;
_L8:
        a1 = a(((Bitmap) (f1)), a(a1));
        return a1;
        a1;
        return f1;
        if (true) goto _L12; else goto _L11
_L11:
    }
}
