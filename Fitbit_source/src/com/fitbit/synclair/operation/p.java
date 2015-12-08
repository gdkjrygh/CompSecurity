// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;

import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import com.fitbit.FitBitApplication;
import com.fitbit.bluetooth.BluetoothErrorsHandler;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.galileo.bluetooth.BluetoothWorker;
import com.fitbit.galileo.protocol.commands.AirlinkCommand;
import com.fitbit.mixpanel.f;
import com.fitbit.synclair.SynclairError;
import java.util.Date;

// Referenced classes of package com.fitbit.synclair.operation:
//            r

public class p extends r
{

    private static final String e = "SyncTrackerSynclairOperation";
    private static final long f = 0x2bf20L;
    private static final long g = 0x57e40L;
    private final BluetoothWorker h;
    private final BluetoothDevice i;
    private final GalileoTrackerType j;
    private boolean k;
    private Handler l;
    private Date m;
    private boolean n;

    public p(BluetoothWorker bluetoothworker, BluetoothDevice bluetoothdevice, GalileoTrackerType galileotrackertype, boolean flag)
    {
        super(com.fitbit.synclair.operation.info.SynclairOperationInfo.SynclairOperationType.j);
        n = false;
        h = bluetoothworker;
        i = bluetoothdevice;
        j = galileotrackertype;
        k = flag;
        l = new Handler();
        if (flag)
        {
            m = new Date();
        }
    }

    static boolean a(p p1)
    {
        return p1.k;
    }

    static GalileoTrackerType b(p p1)
    {
        return p1.j;
    }

    static Handler c(p p1)
    {
        return p1.l;
    }

    private void t()
    {
        m = null;
        l.removeCallbacksAndMessages(null);
    }

    protected void a(Bundle bundle)
    {
        com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType failuretype = com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.b(AirlinkCommand.b, bundle);
        if (failuretype == com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.a)
        {
            t();
            k();
            return;
        }
        if (failuretype == com.fitbit.galileo.protocol.commands.AirlinkCommand.FailureType.k)
        {
            t();
            a(null);
            return;
        }
        if (BluetoothErrorsHandler.a().b())
        {
            t();
            a(SynclairError.j);
            return;
        }
        if (!h() && m != null && (new Date()).getTime() - m.getTime() < 0x57e40L)
        {
            k = false;
            n = true;
            i();
            return;
        } else
        {
            t();
            super.a(bundle);
            return;
        }
    }

    protected String p()
    {
        return "SyncTrackerSynclairOperation";
    }

    protected AirlinkCommand q()
    {
        return new _cls1(FitBitApplication.a(), h, i, j, com.fitbit.serverinteraction.SynclairApi.SyncTrigger.a);
    }

    protected void r()
    {
        if (!n)
        {
            com.fitbit.mixpanel.f.e("Sync Attempts");
            com.fitbit.mixpanel.f.e("Unfinished Syncs");
        }
    }

    protected void s()
    {
        com.fitbit.mixpanel.f.e("Successful Syncs");
        com.fitbit.mixpanel.f.f("Unfinished Syncs");
    }

    /* member class not found */
    class _cls1 {}

}
