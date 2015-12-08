// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import android.os.ParcelUuid;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.f;
import com.fitbit.bluetooth.galileo.GalileoProfile;
import com.fitbit.bluetooth.galileo.b;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            w

abstract class r extends w
{

    private final ParcelUuid n;

    public r(g g1, Bundle bundle, d.a a1)
    {
        super(g1, bundle, a1);
        n = (ParcelUuid)bundle.getParcelable("com.fitbit.bluetooth.connection.BluetoothConnectionService.EXTRA_ACTION_UUID");
    }

    public void a(com.fitbit.galileo.ota.GalileoOtaMessages.f f1)
    {
        com.fitbit.e.a.e(k(), (new StringBuilder()).append("onNakCollected: ").append(f1).toString(), new Object[0]);
        r();
        m.a(false, null);
    }

    public void a(byte abyte0[], com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status)
    {
    }

    protected abstract byte[] a();

    public void b(byte abyte0[], com.fitbit.bluetooth.galileo.GalileoProfile.GalileoProfileListener.Status status)
    {
    }

    public void c(byte abyte0[])
    {
        super.c(abyte0);
        ParcelUuid parceluuid = n;
        int i;
        if (abyte0 != null)
        {
            i = abyte0.length;
        } else
        {
            i = 0;
        }
        f.b(parceluuid, i, 0x7fffffff);
    }

    public void d()
    {
        com.fitbit.e.a.e(k(), "onDumpCollectingFailed", new Object[0]);
        r();
        m.a(false, null);
    }

    protected void g()
    {
        GalileoProfile galileoprofile = k.a();
        galileoprofile.setListener(this);
        if (!galileoprofile.writeValue(k.l(), a()))
        {
            r();
            m.a(false, null);
            return;
        } else
        {
            o.g();
            return;
        }
    }

    protected void h()
    {
        k.a().setListener(null);
    }
}
