// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.tasks.subtasks;

import android.content.IntentFilter;
import android.os.Bundle;
import com.fitbit.bluetooth.commands.CommandName;
import com.fitbit.bluetooth.galileo.c;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.livedata.auth.TrackerAuthCredentials;
import com.fitbit.livedata.auth.a;
import com.fitbit.serverinteraction.PublicAPI;
import com.fitbit.serverinteraction.ServerGateway;

// Referenced classes of package com.fitbit.galileo.tasks.subtasks:
//            GalileoSubTask

public class y extends GalileoSubTask
{

    private static final String a = "TrackerAuthSubTask";
    private boolean b;
    private com.fitbit.util.threading.c c;
    private final com.fitbit.livedata.auth.TrackerAuthCredentials.Cipher d;
    private TrackerAuthCredentials e;
    private boolean f;

    public y(com.fitbit.livedata.auth.TrackerAuthCredentials.Cipher cipher)
    {
        b = false;
        c = new _cls1(com.fitbit.util.threading.FitbitHandlerThread.ThreadName.d);
        d = cipher;
    }

    private void a(CommandName commandname, boolean flag, Bundle bundle)
    {
    /* anonymous class not found */
    class _anm2 {}

        switch (com.fitbit.galileo.tasks.subtasks._cls2.a[commandname.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            b(flag, bundle);
            return;

        case 2: // '\002'
            a(flag, bundle);
            break;
        }
    }

    static void a(y y1, CommandName commandname, boolean flag, Bundle bundle)
    {
        y1.a(commandname, flag, bundle);
    }

    private void a(String s)
    {
        PublicAPI publicapi = new PublicAPI(ServerGateway.a());
        s = publicapi.a(s);
        e = com.fitbit.livedata.auth.a.b(d, s);
        if (!b.a.a())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        com.fitbit.e.a.a("TrackerAuthSubTask", "Credentials arrived: %s", new Object[] {
            e
        });
_L2:
        if (e == null || !e.a())
        {
            com.fitbit.e.a.a("TrackerAuthSubTask", "Failed to create valid credentials from json", new Object[0]);
            a(false);
            return;
        }
        break MISSING_BLOCK_LABEL_122;
        com.fitbit.e.a.a("TrackerAuthSubTask", "Received Credentials from Server", new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            com.fitbit.livedata.auth.a.a(d, s);
            f();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.fitbit.e.a.a("TrackerAuthSubTask", "Error occured while retrieving credentials. ", new Object[0]);
            a(false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a(false);
        }
        com.fitbit.e.a.a("TrackerAuthSubTask", "Unable to generate BTLE Auth credentials", s, new Object[0]);
        return;
    }

    private void a(boolean flag, Bundle bundle)
    {
        byte abyte0[] = null;
        if (bundle != null)
        {
            byte abyte1[] = bundle.getByteArray("com.fitbit.bluetooth.commands.Command.EXTRA_DATA");
            bundle = abyte0;
            abyte0 = abyte1;
            if (abyte1 != null)
            {
                bundle = com.fitbit.bluetooth.galileo.c.a(abyte1);
                abyte0 = abyte1;
            }
        } else
        {
            Object obj = null;
            bundle = abyte0;
            abyte0 = obj;
        }
        if (bundle == null || abyte0 == null)
        {
            a(false);
            return;
        } else
        {
            a(((String) (bundle)));
            return;
        }
    }

    private void b(boolean flag, Bundle bundle)
    {
        if (flag)
        {
            a(true);
            return;
        }
        if (bundle != null)
        {
            bundle = (com.fitbit.livedata.auth.TrackerAuthUtils.TrackerAuthError)bundle.getSerializable("com.fitbit.livedata.auth.TrackerAuthUtils.EXTRA_TRACKER_AUTH_ERROR");
            if (bundle != null && bundle == com.fitbit.livedata.auth.TrackerAuthUtils.TrackerAuthError.b && f)
            {
                f = false;
                com.fitbit.livedata.auth.a.a();
                g();
                return;
            }
        }
        a(false);
    }

    private void f()
    {
        if (!b)
        {
            if (!a(com.fitbit.bluetooth.connection.c.a(e)))
            {
                a(false);
            }
            return;
        } else
        {
            p();
            return;
        }
    }

    private void g()
    {
        if (!b)
        {
            if (!a(com.fitbit.bluetooth.connection.c.k()))
            {
                a(false);
            }
            return;
        } else
        {
            p();
            return;
        }
    }

    protected void b()
    {
        c.a(new IntentFilter("com.fitbit.bluetooth.connection.BluetoothConnectionService.ACTION_COMMAND_FINISHED"));
        e = com.fitbit.livedata.auth.a.a(d);
        if (e != null && e.a())
        {
            f = true;
            f();
            return;
        } else
        {
            g();
            return;
        }
    }

    protected void c()
    {
        c.d();
    }

    protected void d()
    {
        b = true;
    }

    public String e()
    {
        return "TrackerAuthSubTask";
    }

    /* member class not found */
    class _cls1 {}

}
