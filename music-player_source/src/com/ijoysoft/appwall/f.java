// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.ijoysoft.appwall:
//            d, h, u, i

final class f extends Thread
{

    final d a;

    f(d d1)
    {
        a = d1;
        super();
    }

    public final void run()
    {
_L7:
        if (d.a(a)) goto _L2; else goto _L1
_L1:
        return;
_L5:
        Object obj;
        Object obj2;
        obj2 = (h)d.b(a).remove(0);
        h.a(((h) (obj2)), i.a(u.b(h.b(((h) (obj2))))));
        obj = Message.obtain();
        obj.what = 0;
        obj.obj = obj2;
        d.c(a).sendMessage(((Message) (obj)));
        d.d(a).put(h.b(((h) (obj2))), new SoftReference(h.c(((h) (obj2)))));
        obj = h.c(((h) (obj2)));
        obj2 = h.d(((h) (obj2)));
        boolean flag;
        obj2 = new File(((String) (obj2)));
        flag = ((File) (obj2)).exists();
        if (!flag) goto _L3; else goto _L2
_L2:
        if (d.b(a).size() > 0 && d.a(a)) goto _L5; else goto _L4
_L4:
        if (!d.a(a)) goto _L1; else goto _L6
_L6:
        this;
        JVM INSTR monitorenter ;
        wait();
_L8:
        this;
        JVM INSTR monitorexit ;
          goto _L7
        obj;
        throw obj;
_L3:
        if (!((File) (obj2)).getParentFile().exists())
        {
            ((File) (obj2)).getParentFile().mkdirs();
        }
        if (!((File) (obj2)).exists())
        {
            ((File) (obj2)).createNewFile();
        }
        obj2 = new FileOutputStream(((File) (obj2)));
        ((Bitmap) (obj)).compress(android.graphics.Bitmap.CompressFormat.PNG, 100, ((java.io.OutputStream) (obj2)));
        ((FileOutputStream) (obj2)).close();
          goto _L2
        Object obj1;
        obj1;
        try
        {
            ((FileNotFoundException) (obj1)).printStackTrace();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            ((Exception) (obj1)).printStackTrace();
        }
          goto _L2
        obj1;
        ((IOException) (obj1)).printStackTrace();
          goto _L2
        obj1;
        ((InterruptedException) (obj1)).printStackTrace();
          goto _L8
    }
}
