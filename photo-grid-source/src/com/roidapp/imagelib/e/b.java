// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import java.util.Calendar;

// Referenced classes of package com.roidapp.imagelib.e:
//            a

public class b
{

    private final String a = com/roidapp/imagelib/e/b.getSimpleName();
    private final Context b;
    private final a c;

    public b(Context context, a a1)
    {
        c = a1;
        b = context;
    }

    private Bitmap b(Bitmap bitmap)
    {
        Log.i(a, (new StringBuilder("load bitmap size width=")).append(bitmap.getWidth()).append(",height=").append(bitmap.getHeight()).toString());
        Bitmap bitmap2 = c.a(bitmap);
        Bitmap bitmap1 = bitmap;
        if (bitmap2 != null)
        {
            bitmap1 = bitmap;
            if (bitmap2 != bitmap)
            {
                if (bitmap != null && !bitmap.isRecycled())
                {
                    bitmap.recycle();
                }
                bitmap1 = bitmap2;
            }
        }
        return bitmap1;
    }

    public final Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1;
        try
        {
            bitmap1 = b(bitmap);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            return bitmap;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            illegalargumentexception.printStackTrace();
            return bitmap;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return bitmap;
        }
        return bitmap1;
    }

    public final Uri a(String s)
    {
        Object obj;
        Object obj3;
        Integer ainteger[];
        obj3 = null;
        ainteger = ImageLibrary.a().a(b, s);
        obj = obj3;
        if (ainteger == null) goto _L2; else goto _L1
_L1:
        obj = obj3;
        if (ainteger.length == 0) goto _L2; else goto _L3
_L3:
        Bitmap bitmap;
        int i;
        i = 0;
        bitmap = null;
_L5:
        obj = obj3;
        if (i >= ainteger.length) goto _L2; else goto _L4
_L4:
        obj = bitmap;
        Object obj1 = d.a(s, ainteger[i].intValue(), ainteger[i].intValue() * ainteger[i].intValue());
        bitmap = ((Bitmap) (obj1));
        obj = bitmap;
        obj1 = (new StringBuilder("PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis()).append(".jpg").toString();
        obj = bitmap;
        String s1 = ImageLibrary.a().b(b).concat(ImageLibrary.b());
        obj = bitmap;
        Log.i(a, "process end, start to save.");
        obj = bitmap;
        obj1 = d.a(b(bitmap), s1, ((String) (obj1)), android.graphics.Bitmap.CompressFormat.JPEG);
        obj = obj1;
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
_L2:
        return ((Uri) (obj));
        Object obj2;
        obj2;
_L11:
        i++;
        obj = bitmap;
        Log.i(a, (new StringBuilder("OutOfMemoryError:")).append(((OutOfMemoryError) (obj2)).getMessage()).toString());
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
          goto _L5
        obj2;
_L10:
        i++;
        obj = bitmap;
        ((IllegalArgumentException) (obj2)).printStackTrace();
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
          goto _L5
        s;
_L9:
        obj = bitmap;
        s.printStackTrace();
        com.roidapp.imagelib.b.c.a(bitmap);
        System.gc();
        return null;
        s;
_L7:
        com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        System.gc();
        throw s;
        s;
        if (true) goto _L7; else goto _L6
_L6:
        s;
        if (true) goto _L9; else goto _L8
_L8:
        obj2;
          goto _L10
        obj2;
          goto _L11
    }
}
