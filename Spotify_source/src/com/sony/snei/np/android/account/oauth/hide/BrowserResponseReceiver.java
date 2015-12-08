// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sony.snei.np.android.account.oauth.hide;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

public final class BrowserResponseReceiver extends ResultReceiver
{

    public Integer a;
    public Bundle b;
    private final Object c;

    public BrowserResponseReceiver(Handler handler, Object obj)
    {
        super(handler);
        a = null;
        b = null;
        c = obj;
    }

    protected final void onReceiveResult(int i, Bundle bundle)
    {
        super.onReceiveResult(i, bundle);
        a = Integer.valueOf(i);
        b = bundle;
        synchronized (c)
        {
            c.notifyAll();
        }
        return;
        exception;
        bundle;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
