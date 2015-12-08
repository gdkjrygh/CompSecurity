// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import java.io.IOException;
import java.util.Calendar;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            a

final class g
    implements Runnable
{

    final a a;
    private Bitmap b;
    private String c;

    public g(a a1, Bitmap bitmap)
    {
        a = a1;
        super();
        c = "";
        b = bitmap;
    }

    public final void run()
    {
        if (a.getActivity() != null) goto _L2; else goto _L1
_L1:
        com.roidapp.imagelib.retouch.a.a(a, new Exception("activity is finish"), "");
_L4:
        return;
_L2:
        if (b == null || b.isRecycled()) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj2;
        obj = null;
        obj2 = (new StringBuilder("PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis()).append(".jpg").toString();
        c = ImageLibrary.a().b(a.getActivity());
        StringBuilder stringbuilder = (new StringBuilder()).append(c);
        ImageLibrary.a();
        c = stringbuilder.append(ImageLibrary.b()).toString();
        a.getActivity();
        obj2 = d.a(b, c, ((String) (obj2)), android.graphics.Bitmap.CompressFormat.PNG);
        obj = obj2;
        com.roidapp.imagelib.b.c.a(com.roidapp.imagelib.retouch.a.d(a));
        com.roidapp.imagelib.b.c.a(b);
        System.gc();
_L6:
        obj = Message.obtain(com.roidapp.imagelib.retouch.a.h(a), 3, obj);
        com.roidapp.imagelib.retouch.a.h(a).sendMessage(((Message) (obj)));
        return;
        IOException ioexception;
        ioexception;
        com.roidapp.imagelib.retouch.a.a(a, ioexception, c);
        ioexception.printStackTrace();
        com.roidapp.imagelib.b.c.a(com.roidapp.imagelib.retouch.a.d(a));
        com.roidapp.imagelib.b.c.a(b);
        System.gc();
        if (true) goto _L6; else goto _L5
_L5:
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        com.roidapp.imagelib.retouch.a.a(a, ((Throwable) (obj1)), c);
        com.roidapp.imagelib.b.c.a(com.roidapp.imagelib.retouch.a.d(a));
        com.roidapp.imagelib.b.c.a(b);
        System.gc();
        return;
        obj1;
        com.roidapp.imagelib.b.c.a(com.roidapp.imagelib.retouch.a.d(a));
        com.roidapp.imagelib.b.c.a(b);
        System.gc();
        throw obj1;
    }
}
