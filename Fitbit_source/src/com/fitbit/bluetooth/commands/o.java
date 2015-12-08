// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.e.a;
import com.fitbit.util.threading.FitbitHandlerThread;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            e

public class o extends e
    implements com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener
{

    private static final String n = "ReadActivityStatusCommand";

    public o(g g1, Bundle bundle, d.a a1)
    {
        super(g1, bundle, a1);
    }

    private void a()
    {
        if (!q())
        {
            r();
            m.a(false, null);
        }
    }

    static void a(o o1)
    {
        o1.a();
    }

    static void a(o o1, com.fitbit.galileo.ota.GalileoOtaMessages.FBActivityStatus fbactivitystatus)
    {
        o1.a(fbactivitystatus);
    }

    private void a(com.fitbit.galileo.ota.GalileoOtaMessages.FBActivityStatus fbactivitystatus)
    {
        if (!q())
        {
            Bundle bundle = null;
            if (fbactivitystatus != null)
            {
                com.fitbit.e.a.a("ReadActivityStatusCommand", "FBActivityStatus received: %s", new Object[] {
                    fbactivitystatus
                });
                bundle = new Bundle();
                bundle.putSerializable("com.fitbit.bluetooth.commands.Command.EXTRA_DATA", fbactivitystatus);
            }
            r();
            m.a(true, bundle);
        }
    }

    public void a(byte abyte0[], com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status)
    {
        abyte0 = (byte[])abyte0.clone();
        FitbitHandlerThread.a(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.a, new Runnable(status, abyte0) {

            final com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status a;
            final byte b[];
            final o c;

            public void run()
            {
                if (a == com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status.a)
                {
                    com.fitbit.galileo.ota.GalileoOtaMessages.FBActivityStatus fbactivitystatus = com.fitbit.galileo.ota.GalileoOtaMessages.FBActivityStatus.a(b);
                    if (fbactivitystatus != null)
                    {
                        com.fitbit.bluetooth.commands.o.a(c, fbactivitystatus);
                        return;
                    } else
                    {
                        com.fitbit.bluetooth.commands.o.a(c);
                        return;
                    }
                } else
                {
                    com.fitbit.bluetooth.commands.o.a(c);
                    return;
                }
            }

            
            {
                c = o.this;
                a = status;
                b = abyte0;
                super();
            }
        });
    }

    public void b(byte abyte0[])
    {
    }

    public void b(byte abyte0[], com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status)
    {
    }

    public void c(byte abyte0[])
    {
    }

    protected void g()
    {
        GalileoProfile galileoprofile = k.a();
        if (galileoprofile.hasStatusCharacteristic(k.l()))
        {
            galileoprofile.setListener(this);
            if (galileoprofile.readStatusCharacteristic(k.l()))
            {
                s();
                return;
            } else
            {
                a();
                return;
            }
        } else
        {
            a(((com.fitbit.galileo.ota.GalileoOtaMessages.FBActivityStatus) (null)));
            return;
        }
    }

    protected void h()
    {
        t();
        k.a().setListener(null);
    }

    protected void i()
    {
        a();
    }

    protected String k()
    {
        return "ReadActivityStatusCommand";
    }

    protected long u()
    {
        return 10000L;
    }
}
