// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import com.roidapp.imagelib.filter.aq;
import java.io.IOException;
import java.util.Calendar;

// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageShowActivity

public final class n
    implements Runnable
{

    protected String a;
    final SelfieCamImageShowActivity b;
    private boolean c;
    private int d;
    private final aq e;

    public n(SelfieCamImageShowActivity selfiecamimageshowactivity, int i, aq aq1)
    {
        b = selfiecamimageshowactivity;
        super();
        c = false;
        a = "";
        d = 0;
        e = aq1;
        c = aq1.d();
        d = i;
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Bitmap bitmap;
        Bitmap bitmap1;
        Object obj3;
        boolean flag;
        b.c = true;
        Integer ainteger[] = e.a();
        if (ainteger.length == 0)
        {
            Log.w("SelfieCamImageShowActivity", "genMinLengths length 0");
            ImageLibrary.a().a("genMinLengths length 0");
            SelfieCamImageShowActivity.a(b, new Exception("The save length array is 0."), a);
            b.c = false;
            return;
        }
        if (d >= ainteger.length)
        {
            Log.e("SelfieCamImageShowActivity", "final OOM !!!");
            ImageLibrary.a().a("SelfieCamSave/SaveOOM");
            SelfieCamImageShowActivity.a(b, new OutOfMemoryError("Out Of Memory"), a);
            b.c = false;
            return;
        }
        flag = e.b();
        a = e.c();
        if (!c)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(a);
            ImageLibrary.a();
            a = stringbuilder.append(ImageLibrary.b()).toString();
        }
        obj1 = (new StringBuilder("PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis());
        if (flag)
        {
            obj = ".png";
        } else
        {
            obj = ".jpg";
        }
        obj3 = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        Log.i("SelfieCamImageShowActivity", (new StringBuilder("Save file name ")).append(((String) (obj3))).toString());
        bitmap = null;
        bitmap1 = null;
        obj = null;
        obj2 = null;
        obj1 = e.a(ainteger[d].intValue());
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj2 = obj1;
        bitmap = ((Bitmap) (obj1));
        bitmap1 = ((Bitmap) (obj1));
        obj = obj1;
        throw new OutOfMemoryError("load src bitmap failed!");
        obj2;
        obj = obj1;
        obj1 = obj2;
_L9:
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        Log.w("SelfieCamImageShowActivity", (new StringBuilder("Meet OOM, side length=")).append(ainteger[d]).toString());
        ((OutOfMemoryError) (obj1)).printStackTrace();
        obj1 = Message.obtain(SelfieCamImageShowActivity.g(b), 1022, 0, d + 1);
        obj1.obj = e;
        SelfieCamImageShowActivity.g(b).sendMessage(((Message) (obj1)));
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        return;
_L2:
        obj2 = obj1;
        bitmap = ((Bitmap) (obj1));
        bitmap1 = ((Bitmap) (obj1));
        obj = obj1;
        Log.i("SelfieCamImageShowActivity", (new StringBuilder("load bitmap size width=")).append(((Bitmap) (obj1)).getWidth()).append(",height=").append(((Bitmap) (obj1)).getHeight()).toString());
        obj2 = obj1;
        bitmap = ((Bitmap) (obj1));
        bitmap1 = ((Bitmap) (obj1));
        obj = obj1;
        long l = System.nanoTime();
        obj2 = obj1;
        bitmap = ((Bitmap) (obj1));
        bitmap1 = ((Bitmap) (obj1));
        obj = obj1;
        Log.i("SelfieCamImageShowActivity", "process end, start to save.");
        if (!flag) goto _L4; else goto _L3
_L3:
        obj2 = obj1;
        bitmap = ((Bitmap) (obj1));
        bitmap1 = ((Bitmap) (obj1));
        obj = obj1;
        obj3 = com.roidapp.imagelib.b.d.a(((Bitmap) (obj1)), a, ((String) (obj3)), android.graphics.Bitmap.CompressFormat.PNG);
_L5:
        obj2 = obj1;
        bitmap = ((Bitmap) (obj1));
        bitmap1 = ((Bitmap) (obj1));
        obj = obj1;
        Log.i("SelfieCamImageShowActivity", (new StringBuilder("save bitmap size width=")).append(((Bitmap) (obj1)).getWidth()).append(",height=").append(((Bitmap) (obj1)).getHeight()).toString());
        obj2 = obj1;
        bitmap = ((Bitmap) (obj1));
        bitmap1 = ((Bitmap) (obj1));
        obj = obj1;
        Log.i("SelfieCamImageShowActivity", (new StringBuilder("save to ")).append(obj3).append(", save time=").append(System.nanoTime() - l).toString());
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        System.gc();
        obj = SelfieCamImageShowActivity.g(b);
        Exception exception;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = Message.obtain(((Handler) (obj)), 1023, 0, i, obj3);
        SelfieCamImageShowActivity.g(b).sendMessage(((Message) (obj)));
        return;
_L4:
        obj2 = obj1;
        bitmap = ((Bitmap) (obj1));
        bitmap1 = ((Bitmap) (obj1));
        obj = obj1;
        obj3 = com.roidapp.imagelib.b.d.a(((Bitmap) (obj1)), a, ((String) (obj3)), android.graphics.Bitmap.CompressFormat.JPEG);
          goto _L5
        obj1;
        obj = obj2;
        ((IOException) (obj1)).printStackTrace();
        obj = obj2;
        SelfieCamImageShowActivity.a(b, ((Throwable) (obj1)), a);
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj2)));
        System.gc();
        return;
        obj1;
        obj = bitmap;
        com.roidapp.imagelib.b.c.a(bitmap);
        obj = bitmap;
        System.gc();
        obj = bitmap;
        ((IllegalArgumentException) (obj1)).printStackTrace();
        obj = bitmap;
        obj1 = Message.obtain(SelfieCamImageShowActivity.g(b), 1022, 0, d + 1);
        obj = bitmap;
        obj1.obj = e;
        obj = bitmap;
        SelfieCamImageShowActivity.g(b).sendMessage(((Message) (obj1)));
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
        return;
        obj1;
        obj = bitmap1;
        ((Exception) (obj1)).printStackTrace();
        obj = bitmap1;
        SelfieCamImageShowActivity.a(b, ((Throwable) (obj1)), a);
        com.roidapp.imagelib.b.c.a(bitmap1);
        System.gc();
        return;
        exception;
        obj1 = obj;
        obj = exception;
_L7:
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        System.gc();
        throw obj;
        Exception exception1;
        exception1;
        obj1 = obj;
        obj = exception1;
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }
}
