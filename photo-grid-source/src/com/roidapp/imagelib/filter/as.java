// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;

// Referenced classes of package com.roidapp.imagelib.filter:
//            aj

final class as
    implements Runnable
{

    final aj a;
    private final String b;
    private int c;
    private String d;

    public as(aj aj1, String s, int i)
    {
        a = aj1;
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
        android.graphics.Bitmap bitmap;
        Object obj3;
        if (a.p.length == 0)
        {
            Log.w("ImageEditGLESFragment", "genMinLengths length 0");
            ImageLibrary.a().a("ImageEditCropFragment/genMinLengths length 0");
            aj.a(a, new Exception("The load length array is 0."), d);
            return;
        }
        if (c >= a.p.length)
        {
            Log.e("ImageEditGLESFragment", "final OOM !!!");
            ImageLibrary.a().a("ImageEditCropFragment/SaveOOM");
            aj.a(a, new OutOfMemoryError("Out Of Memory"), d);
            return;
        }
        obj3 = null;
        bitmap = null;
        obj = bitmap;
        obj2 = obj3;
        a.getActivity();
        obj = bitmap;
        obj2 = obj3;
        bitmap = com.roidapp.imagelib.b.d.a(b, a.p[c].intValue(), a.p[c].intValue() * a.p[c].intValue());
        obj = bitmap;
        obj2 = bitmap;
        aj.g(a).obtainMessage(1028, bitmap).sendToTarget();
        System.gc();
        return;
        obj2;
        com.roidapp.imagelib.b.c.a(((android.graphics.Bitmap) (obj)));
        ((OutOfMemoryError) (obj2)).printStackTrace();
        aj.a(a, new OutOfMemoryError("Out Of Memory"), "");
        obj = Message.obtain(aj.g(a), 1027, 0, c + 1);
        aj.g(a).sendMessage(((Message) (obj)));
        System.gc();
        return;
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        com.roidapp.imagelib.b.c.a(((android.graphics.Bitmap) (obj2)));
        aj.a(a, ((Throwable) (obj1)), d);
        System.gc();
        return;
        obj1;
        System.gc();
        throw obj1;
    }
}
