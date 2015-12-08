// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.template.b;

import android.os.Handler;
import android.os.Message;
import com.roidapp.baselib.c.c;
import com.roidapp.baselib.d.a;
import java.io.File;

// Referenced classes of package com.roidapp.cloudlib.template.b:
//            l

public abstract class j extends c
{

    public static final String a = (new StringBuilder()).append(com.roidapp.baselib.d.a.b()).append("/.Template").toString();

    public j()
    {
    }

    public static void a(Handler handler, int i, Object obj)
    {
        if (handler != null)
        {
            Message message = Message.obtain();
            message.what = i;
            message.obj = obj;
            handler.sendMessage(message);
        }
    }

    public static boolean b()
    {
        File file = new File(a);
        if (!file.exists())
        {
            file.mkdirs();
        }
        return file.canWrite();
    }

    abstract void a();

    abstract void a(l l);

}
