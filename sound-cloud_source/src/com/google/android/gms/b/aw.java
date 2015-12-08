// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.playlog.internal.d;
import com.google.android.gms.playlog.internal.f;

// Referenced classes of package com.google.android.gms.b:
//            ax

public final class aw
    implements ax.a
{

    public final ax a;
    public boolean b;

    public aw(Context context)
    {
        this(context, (byte)0);
    }

    private aw(Context context, byte byte0)
    {
        this(context, '\0');
    }

    private aw(Context context, char c)
    {
        String s;
        if (context != context.getApplicationContext())
        {
            s = context.getClass().getName();
        } else
        {
            s = "OneTimePlayLogger";
        }
        a = new ax(context, this, s);
        b = true;
    }

    public final void a()
    {
        if (!b)
        {
            throw new IllegalStateException("Cannot reuse one-time logger after sending.");
        } else
        {
            return;
        }
    }

    public final void a(PendingIntent pendingintent)
    {
        (new StringBuilder("logger connection failed: ")).append(pendingintent);
    }

    public final void b()
    {
        f f1 = a.a;
        synchronized (f1.c)
        {
            f1.b.b = false;
            f1.disconnect();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
