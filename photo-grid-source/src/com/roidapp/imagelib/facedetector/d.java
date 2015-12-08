// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.facedetector;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;

// Referenced classes of package com.roidapp.imagelib.facedetector:
//            a

final class d
    implements Runnable
{

    final a a;
    private final String b;
    private int c;
    private String d;

    public d(a a1, String s, int i)
    {
        a = a1;
        super();
        c = 0;
        d = "";
        b = s;
        c = i;
    }

    public final void run()
    {
        Object obj;
        Object obj2;
        Object obj3;
        Bitmap bitmap;
        Object obj4;
        Object obj5;
        obj3 = null;
        obj4 = null;
        obj5 = null;
        bitmap = null;
        obj2 = null;
        com.roidapp.imagelib.facedetector.a.a(a, true);
        if (com.roidapp.imagelib.facedetector.a.f(a).length == 0)
        {
            Log.w("ImagePreviewFragment", "genMinLengths length 0");
            ImageLibrary.a().a("ImageEditCropFragment/genMinLengths length 0");
            com.roidapp.imagelib.facedetector.a.a(a, new Exception("The load length array is 0."), d);
            return;
        }
        if (c >= com.roidapp.imagelib.facedetector.a.f(a).length)
        {
            Log.e("ImagePreviewFragment", "final OOM !!!");
            ImageLibrary.a().a("ImageEditCropFragment/SaveOOM");
            com.roidapp.imagelib.facedetector.a.a(a, new OutOfMemoryError("Out Of Memory"), d);
            return;
        }
        obj = obj4;
        a.getActivity();
        obj = obj4;
        Object obj1 = com.roidapp.imagelib.b.d.a(b, com.roidapp.imagelib.facedetector.a.f(a)[c].intValue(), com.roidapp.imagelib.facedetector.a.f(a)[c].intValue() * com.roidapp.imagelib.facedetector.a.f(a)[c].intValue());
        obj = obj4;
        obj2 = obj5;
        obj3 = bitmap;
        bitmap = Bitmap.createBitmap(((Bitmap) (obj1)).getWidth(), ((Bitmap) (obj1)).getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        obj = bitmap;
        obj2 = bitmap;
        obj3 = bitmap;
        com.roidapp.imagelib.facedetector.a.g(a).obtainMessage(1, obj1).sendToTarget();
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        System.gc();
_L1:
        com.roidapp.imagelib.facedetector.a.a(a, false);
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        obj1 = null;
_L4:
        obj = obj2;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        obj = obj2;
        System.gc();
        obj = obj2;
        Log.w("ImagePreviewFragment", (new StringBuilder("Meet OOM, side length=")).append(com.roidapp.imagelib.facedetector.a.f(a)[c]).toString());
        obj = obj2;
        outofmemoryerror.printStackTrace();
        obj = obj2;
        obj1 = Message.obtain(com.roidapp.imagelib.facedetector.a.g(a), 0, 0, c + 1);
        obj = obj2;
        com.roidapp.imagelib.facedetector.a.g(a).sendMessage(((Message) (obj1)));
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            ((Bitmap) (obj2)).recycle();
        }
        System.gc();
          goto _L1
        obj;
        obj1 = null;
        obj2 = obj3;
        obj3 = obj;
_L3:
        obj = obj2;
        ((Exception) (obj3)).printStackTrace();
        obj = obj2;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        obj = obj2;
        com.roidapp.imagelib.facedetector.a.a(a, ((Throwable) (obj3)), d);
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            ((Bitmap) (obj2)).recycle();
        }
        System.gc();
        return;
        Exception exception;
        exception;
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        System.gc();
        throw exception;
        obj3;
        if (true) goto _L3; else goto _L2
_L2:
        outofmemoryerror;
        obj2 = obj3;
          goto _L4
    }
}
