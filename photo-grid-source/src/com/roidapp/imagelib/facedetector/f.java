// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.facedetector;

import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

// Referenced classes of package com.roidapp.imagelib.facedetector:
//            a, LoadImageView

public final class f
    implements Runnable
{

    protected String a;
    final a b;

    public f(a a1)
    {
        b = a1;
        super();
        a = "";
    }

    public final void run()
    {
        Object obj;
        android.graphics.Bitmap bitmap1;
        android.graphics.Bitmap bitmap2;
        android.graphics.Bitmap bitmap3;
        Object obj2;
        com.roidapp.imagelib.facedetector.a.a(b, true);
        a = Environment.getExternalStorageDirectory().getAbsolutePath();
        a = (new StringBuilder()).append(a).append("/Face").toString();
        obj2 = (new StringBuilder("face_")).append(Calendar.getInstance().getTimeInMillis()).append(".jpg").toString();
        bitmap2 = null;
        bitmap3 = null;
        obj = null;
        bitmap1 = null;
        android.graphics.Bitmap bitmap = com.roidapp.imagelib.facedetector.a.c(b).c();
        bitmap1 = bitmap;
        bitmap2 = bitmap;
        bitmap3 = bitmap;
        obj = bitmap;
        b.getActivity();
        bitmap1 = bitmap;
        bitmap2 = bitmap;
        bitmap3 = bitmap;
        obj = bitmap;
        obj2 = d.a(bitmap, a, ((String) (obj2)), android.graphics.Bitmap.CompressFormat.JPEG);
        c.a(bitmap);
        System.gc();
        obj = Message.obtain(com.roidapp.imagelib.facedetector.a.g(b), 3, obj2);
        com.roidapp.imagelib.facedetector.a.g(b).sendMessage(((Message) (obj)));
        com.roidapp.imagelib.facedetector.a.a(b, false);
        return;
        Object obj1;
        obj1;
        obj = bitmap1;
        c.a(bitmap1);
        obj = bitmap1;
        System.gc();
        obj = bitmap1;
        com.roidapp.imagelib.facedetector.a.a(b, ((Throwable) (obj1)), a);
        obj = bitmap1;
        ((OutOfMemoryError) (obj1)).printStackTrace();
        c.a(bitmap1);
        System.gc();
        return;
        obj1;
        obj = bitmap2;
        com.roidapp.imagelib.facedetector.a.a(b, ((Throwable) (obj1)), a);
        obj = bitmap2;
        ((IOException) (obj1)).printStackTrace();
        c.a(bitmap2);
        System.gc();
        return;
        obj1;
        obj = bitmap3;
        ((Exception) (obj1)).printStackTrace();
        obj = bitmap3;
        com.roidapp.imagelib.facedetector.a.a(b, ((Throwable) (obj1)), a);
        c.a(bitmap3);
        System.gc();
        return;
        obj1;
        c.a(((android.graphics.Bitmap) (obj)));
        System.gc();
        throw obj1;
    }
}
