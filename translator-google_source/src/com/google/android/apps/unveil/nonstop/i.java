// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.nonstop;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.apps.unveil.nonstop:
//            h, j, m

public final class i extends h
    implements Runnable
{

    private Handler d;
    private final String e;
    private final int f;

    public i(String s, int k, h h1)
    {
        super(h1);
        e = s;
        f = k;
    }

    protected final void b()
    {
        super.b();
        if (d == null)
        {
            Thread thread = new Thread(this);
            thread.setName(e);
            thread.setPriority(f);
            thread.start();
            while (d == null) 
            {
                d();
            }
        }
    }

    protected final void b(m m)
    {
        a(false);
        Message message = new Message();
        message.obj = m;
        d.sendMessage(message);
    }

    protected final void c()
    {
        if (d != null)
        {
            d.sendEmptyMessage(-1);
        }
        super.c();
    }

    public final void run()
    {
        Looper.prepare();
        d = new j(this);
        a(true);
        Looper.loop();
        d = null;
        a(true);
    }
}
