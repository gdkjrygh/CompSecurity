// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.crashhandler;

import android.content.Context;
import android.os.Looper;
import com.qihoo.security.e.a;
import java.io.File;

// Referenced classes of package com.qihoo.security.crashhandler:
//            b, a

class a extends Thread
{

    final Throwable a;
    final b b;

    public void run()
    {
        Looper.prepare();
        b.c(com.qihoo.security.crashhandler.b.a(b));
        com.qihoo.security.crashhandler.b.a(b, a);
        com.qihoo.security.crashhandler.a.a(com.qihoo.security.crashhandler.b.a(b).getFilesDir());
        com.qihoo.security.crashhandler.a.b(com.qihoo.security.crashhandler.b.a(b).getFilesDir());
        File file = com.qihoo.security.crashhandler.b.b(b);
        if (file != null && file.exists())
        {
            try
            {
                com.qihoo.security.e.a.a(com.qihoo.security.crashhandler.b.a(b)).a(file.getAbsolutePath());
            }
            catch (Throwable throwable) { }
        }
        Looper.loop();
    }

    (b b1, Throwable throwable)
    {
        b = b1;
        a = throwable;
        super();
    }
}
