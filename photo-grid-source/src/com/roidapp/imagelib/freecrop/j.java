// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            e

final class j
    implements Runnable
{

    final e a;
    private final String b;
    private int c;
    private String d;

    public j(e e1, String s, int i)
    {
        a = e1;
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
        Bitmap bitmap;
        Bitmap bitmap1;
        Message message;
        Object obj3;
        obj2 = null;
        bitmap1 = null;
        message = null;
        obj3 = null;
        bitmap = null;
        if (e.k(a).length == 0)
        {
            Log.w("ImageEditFreeCropFragment", "genMinLengths length 0");
            ImageLibrary.a().a("FreeCropFrag/length 0");
            e.a(a, new Exception("The load length array is 0."), d);
            return;
        }
        if (c >= e.k(a).length)
        {
            Log.e("ImageEditFreeCropFragment", "final OOM !!!");
            ImageLibrary.a().a("FreeCropFrag/SaveOOM");
            e.a(a, new OutOfMemoryError("Out Of Memory"), d);
            return;
        }
        obj = bitmap1;
        a.getActivity();
        obj = bitmap1;
        Object obj1 = com.roidapp.imagelib.b.d.a(b, e.k(a)[c].intValue(), e.k(a)[c].intValue() * e.k(a)[c].intValue());
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        obj = bitmap1;
        obj2 = message;
        bitmap = obj3;
        Message message1 = Message.obtain(e.l(a), 0, 0, c + 1);
        obj = bitmap1;
        obj2 = message;
        bitmap = obj3;
        e.l(a).sendMessage(message1);
        System.gc();
        return;
        obj = bitmap1;
        obj2 = message;
        bitmap = obj3;
        bitmap1 = com.roidapp.imagelib.b.c.a((int)((double)((Bitmap) (obj1)).getWidth() * 2.2000000000000002D), ((Bitmap) (obj1)).getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        if (bitmap1 != null)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        obj = bitmap1;
        obj2 = bitmap1;
        bitmap = bitmap1;
        message = Message.obtain(e.l(a), 0, 0, c + 1);
        obj = bitmap1;
        obj2 = bitmap1;
        bitmap = bitmap1;
        e.l(a).sendMessage(message);
        if (bitmap1 != null && !bitmap1.isRecycled())
        {
            bitmap1.recycle();
        }
        System.gc();
        return;
        obj = bitmap1;
        obj2 = bitmap1;
        bitmap = bitmap1;
        e.l(a).obtainMessage(1, obj1).sendToTarget();
        if (bitmap1 != null && !bitmap1.isRecycled())
        {
            bitmap1.recycle();
        }
        System.gc();
        return;
        obj2;
        obj1 = null;
_L4:
        obj = bitmap;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        obj = bitmap;
        System.gc();
        obj = bitmap;
        Log.w("ImageEditFreeCropFragment", (new StringBuilder("Meet OOM, side length=")).append(e.k(a)[c]).toString());
        obj = bitmap;
        ((OutOfMemoryError) (obj2)).printStackTrace();
        obj = bitmap;
        obj1 = Message.obtain(e.l(a), 0, 0, c + 1);
        obj = bitmap;
        e.l(a).sendMessage(((Message) (obj1)));
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        System.gc();
        return;
        Exception exception1;
        exception1;
        obj1 = null;
_L2:
        obj = obj2;
        exception1.printStackTrace();
        obj = obj2;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        obj = obj2;
        e.a(a, exception1, d);
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
        exception1;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
