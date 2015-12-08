// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.freecrop;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.ImageLibrary;
import com.roidapp.imagelib.b.c;
import com.roidapp.imagelib.b.d;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;

// Referenced classes of package com.roidapp.imagelib.freecrop:
//            e, l

public final class k
    implements Runnable
{

    protected String a;
    final e b;
    private boolean c;

    public k(e e1, boolean flag)
    {
        b = e1;
        super();
        a = "";
        c = flag;
    }

    public final void run()
    {
        Object obj;
        android.net.Uri uri;
        Object obj2;
        obj2 = null;
        a = com.roidapp.imagelib.b.c.a();
        obj = (new StringBuilder()).append(a);
        ImageLibrary.a();
        a = ((StringBuilder) (obj)).append(ImageLibrary.d()).toString();
        obj = new File(a);
        if (!((File) (obj)).getParentFile().exists())
        {
            ((File) (obj)).getParentFile().mkdirs();
        }
        String s = (new StringBuilder("PhotoGrid_")).append(Calendar.getInstance().getTimeInMillis()).append(".png").toString();
        android.graphics.Bitmap.CompressFormat compressformat = android.graphics.Bitmap.CompressFormat.PNG;
        if (c)
        {
            obj = e.i(b);
        } else
        {
            obj = e.m(b);
        }
        if (obj != null)
        {
            obj = ((l) (obj)).f();
        } else
        {
            obj = null;
        }
        if (obj == null || ((Bitmap) (obj)).isRecycled())
        {
            obj = e.h(b);
            compressformat = android.graphics.Bitmap.CompressFormat.PNG;
        }
        uri = obj2;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        b.getActivity();
        uri = d.a(((Bitmap) (obj)), a, s, compressformat);
        if (obj != e.h(b))
        {
            com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        }
        com.roidapp.imagelib.b.c.a(e.h(b));
        System.gc();
_L2:
        obj = Message.obtain(e.l(b), 1025, uri);
        e.l(b).sendMessage(((Message) (obj)));
        return;
        Object obj1;
        obj1;
        e.a(b, ((Throwable) (obj1)), a);
        ((IOException) (obj1)).printStackTrace();
        if (obj != e.h(b))
        {
            com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        }
        com.roidapp.imagelib.b.c.a(e.h(b));
        System.gc();
        uri = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        ((Exception) (obj1)).printStackTrace();
        e.a(b, ((Throwable) (obj1)), a);
        if (obj != e.h(b))
        {
            com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        }
        com.roidapp.imagelib.b.c.a(e.h(b));
        System.gc();
        return;
        obj1;
        if (obj != e.h(b))
        {
            com.roidapp.imagelib.b.c.a(((Bitmap) (obj)));
        }
        com.roidapp.imagelib.b.c.a(e.h(b));
        System.gc();
        throw obj1;
    }
}
