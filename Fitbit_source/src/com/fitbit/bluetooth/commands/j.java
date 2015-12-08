// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.galileo.ota.c;
import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            e

abstract class j extends e
    implements com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener, com.fitbit.galileo.ota.c.a
{

    private final c n = new c();

    public j(g g, Bundle bundle, d.a a1)
    {
        super(g, bundle, a1);
    }

    static c a(j j1)
    {
        return j1.n;
    }

    public void a()
    {
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.f f1)
    {
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.i i)
    {
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.l l)
    {
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.n n1)
    {
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.u u1)
    {
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.v v)
    {
    }

    public void a(byte abyte0[])
    {
    }

    public void a(byte abyte0[], com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status)
    {
    }

    public void b()
    {
    }

    public void b(byte abyte0[])
    {
    }

    public void b(byte abyte0[], com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status)
    {
    }

    public void c()
    {
    }

    public void c(byte abyte0[])
    {
        abyte0 = (byte[])abyte0.clone();
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a, new Runnable(abyte0) {

            final byte a[];
            final j b;

            public void run()
            {
                j.a(b).a(a, b);
            }

            
            {
                b = j.this;
                a = abyte0;
                super();
            }
        });
    }

    public void d()
    {
    }

    public void e()
    {
    }

    public void f()
    {
    }

    protected long u()
    {
        return 10000L;
    }
}
