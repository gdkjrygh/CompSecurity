// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import jp.co.cyberagent.android.gpuimage.PixelBuffer;

// Referenced classes of package com.roidapp.imagelib.crop:
//            j

final class n
    implements Runnable
{

    final j a;
    private final String b;
    private int c;
    private String d;

    public n(j j1, String s, int i)
    {
        a = j1;
        super();
        c = 0;
        d = "";
        b = s;
        c = i;
    }

    public final void run()
    {
        Object obj;
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        Bitmap bitmap5;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        bitmap4 = null;
        bitmap3 = null;
        bitmap2 = null;
        obj = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        bitmap5 = null;
        if (a.i.length == 0)
        {
            Log.w("ImageEditCropFragment", "genMinLengths length 0");
            ImageLibrary.a().a("ImageEditCropFragment/genMinLengths length 0");
            j.a(a, new Exception("The load length array is 0."), d);
            return;
        }
        if (c >= a.i.length)
        {
            Log.e("ImageEditCropFragment", "final OOM !!!");
            ImageLibrary.a().a("ImageEditCropFragment/SaveOOM");
            j.a(a, new OutOfMemoryError("Out Of Memory"), d);
            return;
        }
        bitmap = ((Bitmap) (obj));
        a.getActivity();
        bitmap = ((Bitmap) (obj));
        Bitmap bitmap1 = com.roidapp.imagelib.b.d.a(b, a.i[c].intValue(), a.i[c].intValue() * a.i[c].intValue());
        bitmap = ((Bitmap) (obj));
        bitmap2 = obj2;
        bitmap3 = obj3;
        bitmap4 = obj4;
        bitmap5 = obj5;
        if (!j.i(a)) goto _L2; else goto _L1
_L1:
        bitmap = ((Bitmap) (obj));
        bitmap2 = obj2;
        bitmap3 = obj3;
        bitmap4 = obj4;
        bitmap5 = obj5;
        if (j.j(a) == null) goto _L2; else goto _L3
_L3:
        bitmap = ((Bitmap) (obj));
        bitmap2 = obj2;
        bitmap3 = obj3;
        bitmap4 = obj4;
        bitmap5 = obj5;
        (new PixelBuffer(bitmap1.getWidth(), bitmap1.getHeight())).destroyEGL();
        bitmap = ((Bitmap) (obj));
        bitmap2 = obj2;
        bitmap3 = obj3;
        bitmap4 = obj4;
        bitmap5 = obj5;
        obj = Bitmap.createBitmap(bitmap1.getWidth() * 2, bitmap1.getHeight() * 2, android.graphics.Bitmap.Config.ARGB_8888);
_L5:
        bitmap = ((Bitmap) (obj));
        bitmap2 = ((Bitmap) (obj));
        bitmap3 = ((Bitmap) (obj));
        bitmap4 = ((Bitmap) (obj));
        bitmap5 = ((Bitmap) (obj));
        j.h(a).obtainMessage(1, bitmap1).sendToTarget();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        System.gc();
        return;
_L2:
        bitmap = ((Bitmap) (obj));
        bitmap2 = obj2;
        bitmap3 = obj3;
        bitmap4 = obj4;
        bitmap5 = obj5;
        obj = Bitmap.createBitmap((int)((double)bitmap1.getWidth() * 1.2D), (int)((double)bitmap1.getHeight() * 1.2D), android.graphics.Bitmap.Config.ARGB_8888);
        if (true) goto _L5; else goto _L4
_L4:
        Object obj1;
        obj1;
        bitmap1 = null;
_L13:
        bitmap = bitmap5;
        com.roidapp.imagelib.b.c.a(bitmap1);
        bitmap = bitmap5;
        System.gc();
        bitmap = bitmap5;
        Log.w("ImageEditCropFragment", (new StringBuilder("Meet OOM, side length=")).append(a.i[c]).toString());
        bitmap = bitmap5;
        ((OutOfMemoryError) (obj1)).printStackTrace();
        bitmap = bitmap5;
        obj1 = Message.obtain(j.h(a), 0, 0, c + 1);
        bitmap = bitmap5;
        j.h(a).sendMessage(((Message) (obj1)));
        if (bitmap5 != null && !bitmap5.isRecycled())
        {
            bitmap5.recycle();
        }
        System.gc();
        return;
        obj1;
        bitmap1 = null;
_L11:
        bitmap = bitmap4;
        com.roidapp.imagelib.b.c.a(bitmap1);
        bitmap = bitmap4;
        System.gc();
        bitmap = bitmap4;
        ((IllegalArgumentException) (obj1)).printStackTrace();
        bitmap = bitmap4;
        obj1 = Message.obtain(j.h(a), 0, 0, c + 1);
        bitmap = bitmap4;
        j.h(a).sendMessage(((Message) (obj1)));
        if (bitmap4 != null && !bitmap4.isRecycled())
        {
            bitmap4.recycle();
        }
        System.gc();
        return;
        obj1;
        bitmap1 = null;
_L9:
        bitmap = bitmap3;
        ((NullPointerException) (obj1)).printStackTrace();
        bitmap = bitmap3;
        com.roidapp.imagelib.b.c.a(bitmap1);
        bitmap = bitmap3;
        System.gc();
        bitmap = bitmap3;
        obj1 = Message.obtain(j.h(a), 0, 0, c + 1);
        bitmap = bitmap3;
        j.h(a).sendMessage(((Message) (obj1)));
        if (bitmap3 != null && !bitmap3.isRecycled())
        {
            bitmap3.recycle();
        }
        System.gc();
        return;
        obj1;
        bitmap1 = null;
_L7:
        bitmap = bitmap2;
        ((Exception) (obj1)).printStackTrace();
        bitmap = bitmap2;
        com.roidapp.imagelib.b.c.a(bitmap1);
        bitmap = bitmap2;
        j.a(a, ((Throwable) (obj1)), d);
        if (bitmap2 != null && !bitmap2.isRecycled())
        {
            bitmap2.recycle();
        }
        System.gc();
        return;
        obj1;
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        System.gc();
        throw obj1;
        obj1;
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        if (true) goto _L9; else goto _L8
_L8:
        obj1;
        if (true) goto _L11; else goto _L10
_L10:
        obj1;
        if (true) goto _L13; else goto _L12
_L12:
    }
}
