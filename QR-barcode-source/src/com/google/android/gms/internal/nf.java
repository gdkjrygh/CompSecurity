// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            ng

public class nf
    implements ng.a
{

    private final ng akD;
    private boolean akE;

    public nf(Context context, int i)
    {
        this(context, i, null);
    }

    public nf(Context context, int i, String s)
    {
        this(context, i, s, null, true);
    }

    public nf(Context context, int i, String s, String s1, boolean flag)
    {
        akD = new ng(context, i, s, s1, this, flag);
        akE = true;
    }

    private void mT()
    {
        if (!akE)
        {
            throw new IllegalStateException("Cannot reuse one-time logger after sending.");
        } else
        {
            return;
        }
    }

    public transient void a(String s, byte abyte0[], String as[])
    {
        mT();
        akD.b(s, abyte0, as);
    }

    public void b(PendingIntent pendingintent)
    {
        Log.w("OneTimePlayLogger", (new StringBuilder()).append("logger connection failed: ").append(pendingintent).toString());
    }

    public void mU()
    {
        akD.stop();
    }

    public void mV()
    {
        Log.w("OneTimePlayLogger", "logger connection failed");
    }

    public void send()
    {
        mT();
        akD.start();
        akE = false;
    }
}
