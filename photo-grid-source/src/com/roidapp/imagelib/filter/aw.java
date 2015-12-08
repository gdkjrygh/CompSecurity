// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import jp.co.cyberagent.android.gpuimage.GPUImageView;

// Referenced classes of package com.roidapp.imagelib.filter:
//            aq, aj, bi

public final class aw
    implements Runnable
{

    protected String a;
    final aj b;
    private boolean c;
    private int d;
    private final aq e;

    public aw(aj aj1, int i, aq aq1)
    {
        b = aj1;
        super();
        c = false;
        a = "";
        d = 0;
        e = aq1;
        c = aq1.d();
        d = i;
        if (aj.h(aj1) != null)
        {
            aj.h(aj1).deleteImage();
        }
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj4;
        Object obj5;
        Object obj6;
        String s;
        Object obj7;
        boolean flag;
        aj.a(b, true);
        if (b.getActivity() == null)
        {
            aj.a(b, new Exception("activity is finish"), "");
            return;
        }
        Integer ainteger[] = e.a();
        if (ainteger.length == 0)
        {
            Log.w("ImageEditGLESFragment", "genMinLengths length 0");
            ImageLibrary.a().a("genMinLengths length 0");
            aj.a(b, new Exception("The save length array is 0."), a);
            aj.a(b, false);
            return;
        }
        if (d >= ainteger.length)
        {
            Log.e("ImageEditGLESFragment", "final OOM !!!");
            ImageLibrary.a().a("ImageEditGLSFragment/SaveOOM");
            aj.a(b, new OutOfMemoryError("Out Of Memory"), a);
            aj.a(b, false);
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
        (new File(b.a)).getName();
        if (b.i != null && !c)
        {
            s = (new File(b.i)).getName();
        } else
        if (c)
        {
            obj1 = (new StringBuilder("PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis());
            if (flag)
            {
                obj = ".png";
            } else
            {
                obj = ".jpg";
            }
            s = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        } else
        {
            obj1 = (new StringBuilder(".PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis());
            if (flag)
            {
                obj = ".png";
            } else
            {
                obj = ".jpg";
            }
            s = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        }
        Log.i("ImageEditGLESFragment", (new StringBuilder("Save file name ")).append(s).toString());
        obj5 = null;
        obj6 = null;
        obj = null;
        obj4 = null;
        obj2 = e.a(ainteger[d].intValue());
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        obj7 = obj2;
        obj4 = obj2;
        obj5 = obj2;
        obj6 = obj2;
        obj = obj2;
        throw new OutOfMemoryError("load src bitmap failed!");
        obj1;
        obj = obj7;
_L15:
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        Log.w("ImageEditGLESFragment", (new StringBuilder("Meet OOM, side length=")).append(ainteger[d]).toString());
        ((OutOfMemoryError) (obj1)).printStackTrace();
        obj1 = Message.obtain(aj.g(b), 1024, 0, d + 1);
        obj1.obj = e;
        aj.g(b).sendMessage(((Message) (obj1)));
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        return;
_L2:
        obj7 = obj2;
        obj4 = obj2;
        obj5 = obj2;
        obj6 = obj2;
        obj = obj2;
        Log.i("ImageEditGLESFragment", (new StringBuilder("load bitmap size width=")).append(((Bitmap) (obj2)).getWidth()).append(",height=").append(((Bitmap) (obj2)).getHeight()).toString());
        obj7 = obj2;
        obj4 = obj2;
        obj5 = obj2;
        obj6 = obj2;
        obj = obj2;
        obj1 = ((Bitmap) (obj2)).copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        obj7 = obj2;
        obj4 = obj2;
        obj5 = obj2;
        obj6 = obj2;
        obj = obj2;
        ((Bitmap) (obj2)).recycle();
        if (!aj.i(b))
        {
            break MISSING_BLOCK_LABEL_664;
        }
        obj = aj.e(b).a(((Bitmap) (obj1)));
        obj1 = obj;
        obj7 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj = obj1;
        long l = System.nanoTime();
        obj7 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj = obj1;
        Log.i("ImageEditGLESFragment", "process end, start to save.");
        if (!flag) goto _L4; else goto _L3
_L3:
        obj7 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj = obj1;
        b.getActivity();
        obj7 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj = obj1;
        obj2 = com.roidapp.imagelib.b.d.a(((Bitmap) (obj1)), a, s, android.graphics.Bitmap.CompressFormat.PNG);
_L5:
        obj7 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj = obj1;
        Log.i("ImageEditGLESFragment", (new StringBuilder("save bitmap size width=")).append(((Bitmap) (obj1)).getWidth()).append(",height=").append(((Bitmap) (obj1)).getHeight()).toString());
        obj7 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj = obj1;
        Log.i("ImageEditGLESFragment", (new StringBuilder("save to ")).append(obj2).append(", save time=").append(System.nanoTime() - l).toString());
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        System.gc();
        obj = aj.g(b);
        Exception exception;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        obj = Message.obtain(((Handler) (obj)), 1025, 0, i, obj2);
        aj.g(b).sendMessage(((Message) (obj)));
        return;
_L4:
        obj7 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj = obj1;
        b.getActivity();
        obj7 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj6 = obj1;
        obj = obj1;
        obj2 = com.roidapp.imagelib.b.d.a(((Bitmap) (obj1)), a, s, android.graphics.Bitmap.CompressFormat.JPEG);
          goto _L5
        obj1;
_L13:
        obj = obj4;
        ((IOException) (obj1)).printStackTrace();
        obj = obj4;
        aj.a(b, ((Throwable) (obj1)), a);
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj4)));
        System.gc();
        return;
        obj1;
_L11:
        obj = obj5;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj5)));
        obj = obj5;
        System.gc();
        obj = obj5;
        ((IllegalArgumentException) (obj1)).printStackTrace();
        obj = obj5;
        obj1 = Message.obtain(aj.g(b), 1024, 0, d + 1);
        obj = obj5;
        obj1.obj = e;
        obj = obj5;
        aj.g(b).sendMessage(((Message) (obj1)));
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj5)));
        System.gc();
        return;
        obj1;
_L9:
        obj = obj6;
        ((Exception) (obj1)).printStackTrace();
        obj = obj6;
        aj.a(b, ((Throwable) (obj1)), a);
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj6)));
        System.gc();
        return;
        exception;
        obj1 = obj;
        obj = exception;
_L7:
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        System.gc();
        throw obj;
        obj;
        continue; /* Loop/switch isn't completed */
        Object obj3;
        obj3;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        obj6 = obj1;
        obj1 = obj;
        if (true) goto _L9; else goto _L8
_L8:
        obj;
        obj5 = obj1;
        obj1 = obj;
        if (true) goto _L11; else goto _L10
_L10:
        obj;
        obj4 = obj1;
        obj1 = obj;
        if (true) goto _L13; else goto _L12
_L12:
        obj1;
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj3;
        obj = obj1;
        obj1 = obj3;
        if (true) goto _L15; else goto _L14
_L14:
    }
}
