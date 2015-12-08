// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.baselib.a.a;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            a

final class e
    implements Runnable
{

    final com.roidapp.imagelib.retouch.a a;
    private final String b;
    private int c;
    private String d;
    private int e;
    private int f;

    public e(com.roidapp.imagelib.retouch.a a1, String s, int i, int j, int k)
    {
        a = a1;
        super();
        c = 0;
        d = "";
        b = s;
        c = i;
        e = j;
        f = k;
    }

    public final void run()
    {
        Object obj;
        Object obj2;
        Bitmap bitmap;
        Bitmap bitmap1;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        bitmap2 = null;
        bitmap1 = null;
        bitmap = null;
        obj6 = null;
        obj7 = null;
        obj5 = null;
        obj4 = null;
        bitmap3 = null;
        obj2 = null;
        if (com.roidapp.imagelib.retouch.a.f(a).length == 0)
        {
            Log.w("BlemishFragment", "genMinLengths length 0");
            ImageLibrary.a().a("genMinLengths length 0");
            com.roidapp.imagelib.retouch.a.a(a, new Exception("The save length array is 0."), d);
            com.roidapp.imagelib.retouch.a.g(a);
            return;
        }
        if (c >= com.roidapp.imagelib.retouch.a.f(a).length)
        {
            Log.e("BlemishFragment", "final OOM !!!");
            ImageLibrary.a().a("BlemishFragment/LoadOOM");
            com.roidapp.imagelib.retouch.a.a(a, new OutOfMemoryError("Out Of Memory"), d);
            return;
        }
        obj = obj6;
        e = e / (c + 1);
        obj = obj6;
        f = f / (c + 1);
        obj = obj6;
        com.roidapp.baselib.a.a.a();
        obj = obj6;
        Object obj1 = com.roidapp.baselib.a.a.b(b, e, f);
        obj = obj6;
        bitmap = obj7;
        bitmap1 = obj5;
        bitmap2 = obj4;
        obj2 = Bitmap.createBitmap((int)((double)((Bitmap) (obj1)).getWidth() * 1.5D), (int)((double)((Bitmap) (obj1)).getHeight() * 1.5D), android.graphics.Bitmap.Config.ARGB_8888);
        obj = obj2;
        bitmap = ((Bitmap) (obj2));
        bitmap1 = ((Bitmap) (obj2));
        bitmap2 = ((Bitmap) (obj2));
        bitmap3 = ((Bitmap) (obj2));
        com.roidapp.imagelib.retouch.a.h(a).obtainMessage(1, obj1).sendToTarget();
        if (obj2 != null && !((Bitmap) (obj2)).isRecycled())
        {
            ((Bitmap) (obj2)).recycle();
        }
        System.gc();
        return;
        obj;
        obj1 = null;
        bitmap3 = ((Bitmap) (obj2));
        obj2 = obj;
_L8:
        obj = bitmap3;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        obj = bitmap3;
        System.gc();
        obj = bitmap3;
        Log.w("BlemishFragment", (new StringBuilder("Meet OOM, side length=")).append(com.roidapp.imagelib.retouch.a.f(a)[c]).toString());
        obj = bitmap3;
        ((OutOfMemoryError) (obj2)).printStackTrace();
        obj = bitmap3;
        obj1 = Message.obtain(com.roidapp.imagelib.retouch.a.h(a), 0, 0, c + 1);
        obj = bitmap3;
        com.roidapp.imagelib.retouch.a.h(a).sendMessage(((Message) (obj1)));
        if (bitmap3 != null && !bitmap3.isRecycled())
        {
            bitmap3.recycle();
        }
        System.gc();
        return;
        Object obj3;
        obj3;
        obj1 = null;
_L6:
        obj = bitmap2;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        obj = bitmap2;
        System.gc();
        obj = bitmap2;
        ((IllegalArgumentException) (obj3)).printStackTrace();
        obj = bitmap2;
        obj1 = Message.obtain(com.roidapp.imagelib.retouch.a.h(a), 0, 0, c + 1);
        obj = bitmap2;
        com.roidapp.imagelib.retouch.a.h(a).sendMessage(((Message) (obj1)));
        if (bitmap2 != null && !bitmap2.isRecycled())
        {
            bitmap2.recycle();
        }
        System.gc();
        return;
        obj3;
        obj1 = null;
_L4:
        obj = bitmap1;
        ((NullPointerException) (obj3)).printStackTrace();
        obj = bitmap1;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        obj = bitmap1;
        System.gc();
        obj = bitmap1;
        obj1 = Message.obtain(com.roidapp.imagelib.retouch.a.h(a), 0, 0, c + 1);
        obj = bitmap1;
        com.roidapp.imagelib.retouch.a.h(a).sendMessage(((Message) (obj1)));
        if (bitmap1 != null && !bitmap1.isRecycled())
        {
            bitmap1.recycle();
        }
        System.gc();
        return;
        obj3;
        obj1 = null;
_L2:
        obj = bitmap;
        ((Exception) (obj3)).printStackTrace();
        obj = bitmap;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        obj = bitmap;
        com.roidapp.imagelib.retouch.a.a(a, ((Throwable) (obj3)), d);
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
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
        if (true) goto _L2; else goto _L1
_L1:
        obj3;
        if (true) goto _L4; else goto _L3
_L3:
        obj3;
        if (true) goto _L6; else goto _L5
_L5:
        obj3;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
