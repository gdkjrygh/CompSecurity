// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;

// Referenced classes of package com.roidapp.imagelib.a:
//            i

final class x
    implements Runnable
{

    final i a;
    private int b;
    private String c;

    public x(i j, int k)
    {
        a = j;
        super();
        b = 0;
        c = "";
        b = k;
    }

    public final void run()
    {
        Object obj;
        Object obj2;
        android.graphics.Bitmap bitmap;
        Object obj3;
        Integer ainteger[];
        ainteger = ImageLibrary.a().a(a.getActivity(), i.z(a));
        if (ainteger.length == 0)
        {
            Log.w("CameraPreivewFragment", "genMinLengths_0");
            ImageLibrary.a().a("CameraPreivewFragment/genMinLengths_0");
            i.a(a, new Exception("The load length array is 0."), c);
            return;
        }
        if (b >= ainteger.length)
        {
            Log.e("CameraPreivewFragment", "final OOM !!!");
            ImageLibrary.a().a("CameraPreivewFragment/SaveOOM");
            i.a(a, new OutOfMemoryError("Out Of Memory"), c);
            return;
        }
        obj3 = null;
        bitmap = null;
        obj = bitmap;
        obj2 = obj3;
        a.getActivity();
        obj = bitmap;
        obj2 = obj3;
        String s = i.z(a);
        obj = bitmap;
        obj2 = obj3;
        int j = ainteger[b].intValue();
        obj = bitmap;
        obj2 = obj3;
        int k = ainteger[b].intValue();
        obj = bitmap;
        obj2 = obj3;
        bitmap = d.a(s, j, ainteger[b].intValue() * k);
        obj = bitmap;
        obj2 = bitmap;
        i.s(a).obtainMessage(7, bitmap).sendToTarget();
        System.gc();
        return;
        obj2;
        com.roidapp.imagelib.b.c.a(((android.graphics.Bitmap) (obj)));
        ((OutOfMemoryError) (obj2)).printStackTrace();
        i.a(a, new OutOfMemoryError("Out Of Memory"), "");
        obj = Message.obtain(i.s(a), 6, 0, b + 1);
        i.s(a).sendMessage(((Message) (obj)));
        System.gc();
        return;
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        com.roidapp.imagelib.b.c.a(((android.graphics.Bitmap) (obj2)));
        i.a(a, ((Throwable) (obj1)), c);
        System.gc();
        return;
        obj1;
        System.gc();
        throw obj1;
    }
}
