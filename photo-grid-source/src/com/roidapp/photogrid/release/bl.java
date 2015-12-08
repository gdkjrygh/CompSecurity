// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.SoftReference;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.release:
//            bj

final class bl extends Thread
{

    final String a;
    final bj b;

    bl(bj bj1, String s)
    {
        b = bj1;
        a = s;
        super();
    }

    public final void run()
    {
        if (bj.a(b))
        {
            break MISSING_BLOCK_LABEL_94;
        }
        Object obj;
        try
        {
            obj = bj.a(a);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (bj.b(b) != null && !bj.a(b))
        {
            bj.b(b).put(a, new SoftReference(obj));
        }
        obj = Message.obtain();
        obj.what = 0;
        obj.obj = a;
        bj.c(b).sendMessage(((Message) (obj)));
    }
}
