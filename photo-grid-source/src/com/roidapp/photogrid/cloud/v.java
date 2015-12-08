// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.release.rd;
import java.lang.ref.SoftReference;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            t

final class v extends Thread
{

    final String a;
    final t b;

    v(t t1, String s)
    {
        b = t1;
        a = s;
        super();
    }

    public final void run()
    {
        if (t.a(b))
        {
            break MISSING_BLOCK_LABEL_102;
        }
        Object obj;
        try
        {
            rd.a();
            obj = rd.b(a, 100, 100);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (t.b(b) != null && !t.a(b))
        {
            t.b(b).put(a, new SoftReference(obj));
        }
        obj = Message.obtain();
        obj.what = 0;
        obj.obj = a;
        t.c(b).sendMessage(((Message) (obj)));
    }
}
