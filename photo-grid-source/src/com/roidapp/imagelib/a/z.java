// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import java.io.IOException;
import java.util.Calendar;

// Referenced classes of package com.roidapp.imagelib.a:
//            i, h, a

public final class z
    implements Runnable
{

    final i a;
    private int b;

    public z(i j, int k)
    {
        a = j;
        super();
        b = 0;
        b = k;
    }

    public final void run()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj12;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj7 = null;
        i.a(a, true);
        obj = ImageLibrary.a();
        a.getActivity();
        Integer ainteger[] = ((ImageLibrary) (obj)).a(i.z(a), i.p(a));
        if (ainteger.length == 0)
        {
            Log.w("CameraPreivewFragment", "genMinLengths length 0");
            ImageLibrary.a().a("genMinLengths length 0");
            i.a(a, new Exception("The save length array is 0."), a.b);
            i.a(a, false);
            return;
        }
        if (b >= ainteger.length)
        {
            Log.e("CameraPreivewFragment", "final OOM !!!");
            ImageLibrary.a().a("CameraPreivewFragment/SaveOOM");
            i.a(a, new OutOfMemoryError("Out Of Memory"), a.b);
            i.a(a, false);
            return;
        }
        Object obj6;
        Bitmap bitmap;
        Matrix matrix;
        int j;
        int k;
        if (i.A(a) == 1)
        {
            a.b = i.B(a);
            obj6 = i.C(a);
        } else
        {
            a.b = ImageLibrary.a().a(a.getActivity());
            obj2 = new StringBuilder();
            obj = a;
            obj2 = ((StringBuilder) (obj2)).append(((i) (obj)).b);
            ImageLibrary.a();
            obj.b = ((StringBuilder) (obj2)).append(ImageLibrary.b()).toString();
            obj6 = (new StringBuilder(".PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis()).append(".jpg").toString();
        }
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        a.getActivity();
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        obj12 = i.z(a);
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        j = ainteger[b].intValue();
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        k = ainteger[b].intValue();
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        obj12 = d.a(((String) (obj12)), j, ainteger[b].intValue() * k);
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        if (com.roidapp.imagelib.a.h.c != h.a) goto _L2; else goto _L1
_L1:
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        bitmap = Bitmap.createBitmap(((Bitmap) (obj12)).getWidth(), ((Bitmap) (obj12)).getHeight(), ((Bitmap) (obj12)).getConfig());
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        obj1 = new Canvas(bitmap);
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        ((Canvas) (obj1)).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        matrix = new Matrix();
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        matrix.postScale(-1F, 1.0F, ((Bitmap) (obj12)).getWidth() / 2, ((Bitmap) (obj12)).getHeight() / 2);
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        ((Canvas) (obj1)).drawBitmap(((Bitmap) (obj12)), matrix, null);
        obj1 = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        ((Bitmap) (obj12)).recycle();
        obj1 = bitmap;
_L4:
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        Log.i("CameraPreivewFragment", (new StringBuilder("load bitmap size width=")).append(((Bitmap) (obj1)).getWidth()).append(",height=").append(((Bitmap) (obj1)).getHeight()).toString());
        obj2 = obj7;
        obj3 = obj8;
        obj4 = obj9;
        obj5 = obj10;
        obj = obj11;
        obj1 = i.a(a).a(((Bitmap) (obj1)));
        obj2 = obj1;
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj = obj1;
        a.getActivity();
        obj2 = obj1;
        obj3 = obj1;
        obj4 = obj1;
        obj5 = obj1;
        obj = obj1;
        obj6 = d.a(((Bitmap) (obj1)), a.b, ((String) (obj6)), android.graphics.Bitmap.CompressFormat.JPEG);
        c.a(((Bitmap) (obj1)));
        System.gc();
        obj = Message.obtain(i.s(a), 5, obj6);
        i.s(a).sendMessage(((Message) (obj)));
        return;
        obj1;
        obj = obj2;
        c.a(((Bitmap) (obj2)));
        obj = obj2;
        System.gc();
        obj = obj2;
        i.a(a, ((Throwable) (obj1)), a.b);
        obj = obj2;
        ((OutOfMemoryError) (obj1)).printStackTrace();
        obj = obj2;
        obj1 = Message.obtain(i.s(a), 4, b + 1, 0);
        obj = obj2;
        i.s(a).sendMessage(((Message) (obj1)));
        c.a(((Bitmap) (obj2)));
        System.gc();
        return;
        obj1;
        obj = obj3;
        c.a(((Bitmap) (obj3)));
        obj = obj3;
        System.gc();
        obj = obj3;
        i.a(a, ((Throwable) (obj1)), a.b);
        obj = obj3;
        ((NullPointerException) (obj1)).printStackTrace();
        obj = obj3;
        obj1 = Message.obtain(i.s(a), 4, b + 1, 0);
        obj = obj3;
        i.s(a).sendMessage(((Message) (obj1)));
        c.a(((Bitmap) (obj3)));
        System.gc();
        return;
        obj1;
        obj = obj4;
        i.a(a, ((Throwable) (obj1)), a.b);
        obj = obj4;
        ((IOException) (obj1)).printStackTrace();
        c.a(((Bitmap) (obj4)));
        System.gc();
        return;
        obj1;
        obj = obj5;
        ((Exception) (obj1)).printStackTrace();
        obj = obj5;
        i.a(a, ((Throwable) (obj1)), a.b);
        c.a(((Bitmap) (obj5)));
        System.gc();
        return;
        obj1;
        c.a(((Bitmap) (obj)));
        System.gc();
        throw obj1;
_L2:
        obj1 = obj12;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
