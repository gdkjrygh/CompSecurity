// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.sony.snei.np.android.account.oauth.hide.BrowserResponseReceiver;

public final class dbc
{

    private static dbc b = null;
    private BrowserResponseReceiver a;

    public dbc()
    {
        a = null;
    }

    public static dbc a()
    {
        dbc;
        JVM INSTR monitorenter ;
        dbc dbc1;
        if (b == null)
        {
            b = new dbc();
        }
        dbc1 = b;
        dbc;
        JVM INSTR monitorexit ;
        return dbc1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.send(0, bundle);
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        bundle;
        throw bundle;
    }

    public final void a(BrowserResponseReceiver browserresponsereceiver)
    {
        this;
        JVM INSTR monitorenter ;
        a(new Bundle());
        a = browserresponsereceiver;
        this;
        JVM INSTR monitorexit ;
        return;
        browserresponsereceiver;
        throw browserresponsereceiver;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(Bundle bundle)
    {
        this;
        JVM INSTR monitorenter ;
        if (a != null)
        {
            a.send(-1, bundle);
            a = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        bundle;
        throw bundle;
    }

    public final boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        BrowserResponseReceiver browserresponsereceiver = a;
        boolean flag;
        if (browserresponsereceiver != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

}
