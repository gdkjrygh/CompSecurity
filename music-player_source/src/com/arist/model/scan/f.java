// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.scan;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.arist.model.a.a;

public final class f extends Thread
{

    private Handler a;
    private Context b;

    private f(Context context, Handler handler)
    {
        a = handler;
        b = context.getApplicationContext();
    }

    public static final void a(Context context, Handler handler)
    {
        (new f(context, handler)).start();
    }

    public final void run()
    {
        new a();
        int i;
        if (b != null)
        {
            i = com.arist.model.a.a.a(b);
        } else
        {
            i = 0;
        }
        if (a != null)
        {
            a.obtainMessage(4, i, 0).sendToTarget();
        }
        b = null;
        a = null;
    }
}
