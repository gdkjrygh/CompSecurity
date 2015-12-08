// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            op

public class oo
    implements op.a
{

    private final op amS;
    private boolean amT;

    public oo(Context context, int i)
    {
        this(context, i, null);
    }

    public oo(Context context, int i, String s)
    {
        this(context, i, s, null, true);
    }

    public oo(Context context, int i, String s, String s1, boolean flag)
    {
        amS = new op(context, i, s, s1, this, flag);
        amT = true;
    }

    private void om()
    {
        if (!amT)
        {
            throw new IllegalStateException("Cannot reuse one-time logger after sending.");
        } else
        {
            return;
        }
    }

    public transient void a(String s, byte abyte0[], String as[])
    {
        om();
        amS.b(s, abyte0, as);
    }

    public void d(PendingIntent pendingintent)
    {
        Log.w("OneTimePlayLogger", (new StringBuilder()).append("logger connection failed: ").append(pendingintent).toString());
    }

    public void on()
    {
        amS.stop();
    }

    public void oo()
    {
        Log.w("OneTimePlayLogger", "logger connection failed");
    }

    public void send()
    {
        om();
        amS.start();
        amT = false;
    }
}
