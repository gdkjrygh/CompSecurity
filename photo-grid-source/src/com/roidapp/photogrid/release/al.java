// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            BackgroundImageCrop, rf

final class al
    implements Runnable
{

    final BackgroundImageCrop a;
    private final String b;
    private int c;
    private String d;

    public al(BackgroundImageCrop backgroundimagecrop, String s, int i)
    {
        a = backgroundimagecrop;
        super();
        c = 0;
        d = "";
        b = s;
        c = i;
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Bitmap bitmap;
        Bitmap bitmap1;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap5;
        Bitmap bitmap7;
        bitmap5 = null;
        bitmap3 = null;
        bitmap1 = null;
        bitmap2 = null;
        bitmap = null;
        bitmap7 = null;
        obj1 = null;
        if (a.a.length == 0)
        {
            Log.w("BackgroundImageCrop", "genMinLengths length 0");
            ImageLibrary.a().a("BackgroundImageCrop/genMinLengths length 0");
            BackgroundImageCrop.g(a).obtainMessage(5, new Exception("The load length array is 0.")).sendToTarget();
            return;
        }
        if (c >= a.a.length)
        {
            Log.e("BackgroundImageCrop", "final OOM !!!");
            ImageLibrary.a().a("BackgroundImageCrop/SaveOOM");
            BackgroundImageCrop.g(a).obtainMessage(5, new OutOfMemoryError("Out Of Memory")).sendToTarget();
            return;
        }
        obj = bitmap1;
        Bitmap bitmap4 = com.roidapp.imagelib.b.d.a(b, a.a[c].intValue(), a.a[c].intValue() * a.a[c].intValue());
        Bitmap bitmap6;
        obj1 = bitmap4;
        obj = bitmap1;
        bitmap3 = bitmap2;
        bitmap2 = ((Bitmap) (obj1));
        bitmap5 = bitmap;
        bitmap4 = ((Bitmap) (obj1));
        bitmap6 = ((Bitmap) (obj1));
        bitmap1 = Bitmap.createBitmap((int)((double)((Bitmap) (obj1)).getWidth() * 1.2D), (int)((double)((Bitmap) (obj1)).getHeight() * 1.2D), android.graphics.Bitmap.Config.ARGB_8888);
        bitmap = ((Bitmap) (obj1));
        obj = bitmap1;
        bitmap3 = bitmap1;
        bitmap2 = ((Bitmap) (obj1));
        bitmap5 = bitmap1;
        bitmap4 = ((Bitmap) (obj1));
        bitmap7 = bitmap1;
        bitmap6 = ((Bitmap) (obj1));
        if (az.G == 0)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        bitmap = ((Bitmap) (obj1));
        obj = bitmap1;
        bitmap3 = bitmap1;
        bitmap2 = ((Bitmap) (obj1));
        bitmap5 = bitmap1;
        bitmap4 = ((Bitmap) (obj1));
        bitmap7 = bitmap1;
        bitmap6 = ((Bitmap) (obj1));
        if (az.G == 360)
        {
            break MISSING_BLOCK_LABEL_360;
        }
        obj = bitmap1;
        bitmap3 = bitmap1;
        bitmap2 = ((Bitmap) (obj1));
        bitmap5 = bitmap1;
        bitmap4 = ((Bitmap) (obj1));
        bitmap7 = bitmap1;
        bitmap6 = ((Bitmap) (obj1));
        rf.a();
        obj = bitmap1;
        bitmap3 = bitmap1;
        bitmap2 = ((Bitmap) (obj1));
        bitmap5 = bitmap1;
        bitmap4 = ((Bitmap) (obj1));
        bitmap7 = bitmap1;
        bitmap6 = ((Bitmap) (obj1));
        bitmap = rf.a(((Bitmap) (obj1)), az.G);
        obj = bitmap1;
        bitmap3 = bitmap1;
        bitmap2 = bitmap;
        bitmap5 = bitmap1;
        bitmap4 = bitmap;
        bitmap7 = bitmap1;
        bitmap6 = bitmap;
        BackgroundImageCrop.g(a).obtainMessage(1, bitmap).sendToTarget();
        if (bitmap1 != null && !bitmap1.isRecycled())
        {
            bitmap1.recycle();
        }
        System.gc();
        return;
        obj;
        bitmap6 = null;
        bitmap7 = ((Bitmap) (obj1));
        obj1 = obj;
_L6:
        obj = bitmap7;
        com.roidapp.imagelib.b.c.a(bitmap6);
        obj = bitmap7;
        System.gc();
        obj = bitmap7;
        Log.w("BackgroundImageCrop", (new StringBuilder("Meet OOM, side length=")).append(a.a[c]).toString());
        obj = bitmap7;
        ((OutOfMemoryError) (obj1)).printStackTrace();
        obj = bitmap7;
        obj1 = Message.obtain(BackgroundImageCrop.g(a), 0, 0, c + 1);
        obj = bitmap7;
        BackgroundImageCrop.g(a).sendMessage(((Message) (obj1)));
        if (bitmap7 != null && !bitmap7.isRecycled())
        {
            bitmap7.recycle();
        }
        System.gc();
        return;
        Object obj2;
        obj2;
        bitmap4 = null;
_L4:
        obj = bitmap5;
        com.roidapp.imagelib.b.c.a(bitmap4);
        obj = bitmap5;
        System.gc();
        obj = bitmap5;
        ((IllegalArgumentException) (obj2)).printStackTrace();
        obj = bitmap5;
        obj2 = Message.obtain(BackgroundImageCrop.g(a), 0, 0, c + 1);
        obj = bitmap5;
        BackgroundImageCrop.g(a).sendMessage(((Message) (obj2)));
        if (bitmap5 != null && !bitmap5.isRecycled())
        {
            bitmap5.recycle();
        }
        System.gc();
        return;
        obj2;
        bitmap2 = null;
_L2:
        obj = bitmap3;
        ((Exception) (obj2)).printStackTrace();
        obj = bitmap3;
        com.roidapp.imagelib.b.c.a(bitmap2);
        obj = bitmap3;
        BackgroundImageCrop.g(a).obtainMessage(5, new Exception("")).sendToTarget();
        if (bitmap3 != null && !bitmap3.isRecycled())
        {
            bitmap3.recycle();
        }
        System.gc();
        return;
        obj2;
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        System.gc();
        throw obj2;
        obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
