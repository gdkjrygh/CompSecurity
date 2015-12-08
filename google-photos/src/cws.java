// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class cws
    implements ServiceConnection
{

    private cwr a;

    cws(cwr cwr1)
    {
        a = cwr1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (a.a)
        {
            if (a.c)
            {
                a.b = ibinder;
                a.c = false;
                a.a.notifyAll();
            }
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        synchronized (a.a)
        {
            a.b = null;
            if (a.c)
            {
                a.c = false;
                a.a.notifyAll();
            }
        }
        return;
        exception;
        componentname;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
