// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicBoolean;
import jp.co.cyberagent.android.gpuimage.GPUImage;
import jp.co.cyberagent.android.gpuimage.GPUImageGuideFilter;
import jp.co.cyberagent.android.gpuimage.GPUImageView;
import jp.co.cyberagent.android.gpuimage.util.FileType;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            m

public final class u
    implements Runnable
{

    protected String a;
    final m b;
    private int c;
    private int d;
    private Context e;
    private int f;
    private int g;

    public u(m m1, Context context, int i, int j, int k)
    {
        b = m1;
        super();
        c = 0;
        a = "";
        d = 0;
        e = context;
        d = k;
        f = i;
        g = j;
        if (m.k(m1) != null)
        {
            m.k(m1).deleteImage();
        }
    }

    public final void run()
    {
        Object obj1;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Integer ainteger[];
        String s;
        obj5 = null;
        obj6 = null;
        obj7 = null;
        obj1 = null;
        obj4 = null;
        android.support.v4.app.FragmentActivity fragmentactivity = b.getActivity();
        if (fragmentactivity == null)
        {
            m.a(b, new Exception("activity is finish"), "");
            return;
        }
        ainteger = ImageLibrary.a().a(fragmentactivity, b.b);
        if (ainteger.length == 0)
        {
            Log.w("SkinFragment", "genMinLengths length 0");
            ImageLibrary.a().a("genMinLengths length 0");
            m.a(b, new Exception("The save length array is 0."), a);
            m.b(b).set(false);
            return;
        }
        if (d >= ainteger.length)
        {
            Log.e("SkinFragment", "final OOM !!!");
            ImageLibrary.a().a("ImageEditGLSFragment/SaveOOM");
            m.a(b, new OutOfMemoryError("Out Of Memory"), a);
            m.b(b).set(false);
            return;
        }
        a = ImageLibrary.a().b(fragmentactivity);
        if (c == 0)
        {
            StringBuilder stringbuilder = (new StringBuilder()).append(a);
            ImageLibrary.a();
            a = stringbuilder.append(ImageLibrary.b()).toString();
        }
        new File(b.b);
        s = (new StringBuilder("PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis()).append(".jpg").toString();
        Log.i("SkinFragment", (new StringBuilder("Save file name ")).append(s).toString());
        Object obj = com.roidapp.imagelib.b.d.a(b.b, ainteger[d].intValue(), ainteger[d].intValue() * ainteger[d].intValue());
        Log.i("SkinFragment", (new StringBuilder("load bitmap size width=")).append(((Bitmap) (obj)).getWidth()).append(",height=").append(((Bitmap) (obj)).getHeight()).toString());
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_438;
        }
        Object obj3 = new FileInputStream(b.b);
        obj1 = obj3;
        if (!FileType.getTypeByStream(((FileInputStream) (obj3))).equals("gif"))
        {
            break MISSING_BLOCK_LABEL_423;
        }
        obj1 = obj3;
        obj4 = ((Bitmap) (obj)).copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        obj1 = obj3;
        ((Bitmap) (obj)).recycle();
        obj = obj4;
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj1 = obj;
        ((FileInputStream) (obj3)).close();
_L4:
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        ImageLibrary.a().a("processImage");
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        obj3 = new GPUImage(e);
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        ((GPUImage) (obj3)).setImage(((Bitmap) (obj)));
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        m.a(b, new GPUImageGuideFilter(10F, 0.0F, ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight()));
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        m.n(b).setEps(((float)g * 0.004F) / 100F);
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        m.n(b).setAlpha((float)f / 100F);
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        ((GPUImage) (obj3)).setFilter(m.n(b));
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        obj3 = ((GPUImage) (obj3)).getBitmapWithFilterApplied();
        if (obj3 != null) goto _L2; else goto _L1
_L1:
        obj4 = obj;
        obj5 = obj;
        obj6 = obj;
        obj7 = obj;
        obj1 = obj;
        throw new IllegalArgumentException("create PBuffer failed");
        obj;
_L6:
        obj1 = obj4;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj4)));
        obj1 = obj4;
        System.gc();
        obj1 = obj4;
        Log.w("SkinFragment", (new StringBuilder("Meet OOM, side length=")).append(ainteger[d]).toString());
        obj1 = obj4;
        ((OutOfMemoryError) (obj)).printStackTrace();
        obj1 = obj4;
        obj = Message.obtain(m.e(b), 1027, Integer.valueOf(d + 1));
        obj1 = obj4;
        m.e(b).sendMessage(((Message) (obj)));
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj4)));
        System.gc();
        return;
        obj4;
        obj3 = null;
_L11:
        obj1 = obj3;
        ((FileNotFoundException) (obj4)).printStackTrace();
        if (obj3 == null) goto _L4; else goto _L3
_L3:
        ((FileInputStream) (obj3)).close();
          goto _L4
        obj1;
          goto _L4
        obj3;
        obj1 = null;
_L10:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_826;
        }
        try
        {
            ((FileInputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
        try
        {
            throw obj3;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj3) { }
          goto _L5
        obj1;
        obj4 = obj;
        obj = obj1;
          goto _L6
_L2:
        long l = System.nanoTime();
        Log.i("SkinFragment", "process end, start to save.");
        obj = com.roidapp.imagelib.b.d.a(((Bitmap) (obj3)), a, s, android.graphics.Bitmap.CompressFormat.PNG);
        Log.i("SkinFragment", (new StringBuilder("save bitmap size width=")).append(((Bitmap) (obj3)).getWidth()).append(",height=").append(((Bitmap) (obj3)).getHeight()).toString());
        Log.i("SkinFragment", (new StringBuilder("save to ")).append(obj).append(", save time=").append(System.nanoTime() - l).toString());
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj3)));
        System.gc();
        obj = Message.obtain(m.e(b), 1028, obj);
        m.e(b).sendMessage(((Message) (obj)));
        return;
        obj;
_L9:
        obj1 = obj5;
        ((IOException) (obj)).printStackTrace();
        obj1 = obj5;
        m.a(b, ((Throwable) (obj)), a);
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj5)));
        System.gc();
        return;
        obj;
_L8:
        obj1 = obj6;
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj6)));
        obj1 = obj6;
        System.gc();
        obj1 = obj6;
        ((IllegalArgumentException) (obj)).printStackTrace();
        obj1 = obj6;
        obj = Message.obtain(m.e(b), 1027, Integer.valueOf(d + 1));
        obj1 = obj6;
        m.e(b).sendMessage(((Message) (obj)));
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj6)));
        System.gc();
        return;
        obj3;
        obj = obj7;
_L5:
        obj1 = obj;
        ((Exception) (obj3)).printStackTrace();
        obj1 = obj;
        m.a(b, ((Throwable) (obj3)), a);
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        return;
        obj;
_L7:
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj1)));
        System.gc();
        throw obj;
        obj1;
          goto _L4
        obj3;
        obj1 = obj;
        obj = obj3;
          goto _L7
        obj;
        obj1 = obj3;
          goto _L7
        Object obj2;
        obj2;
        obj = obj3;
        obj3 = obj2;
          goto _L5
        obj2;
        obj6 = obj;
        obj = obj2;
          goto _L8
        obj;
        obj6 = obj3;
          goto _L8
        obj2;
        obj5 = obj;
        obj = obj2;
          goto _L9
        obj;
        obj5 = obj3;
          goto _L9
        obj;
        obj4 = obj3;
          goto _L6
        obj3;
          goto _L10
        obj4;
          goto _L11
    }
}
