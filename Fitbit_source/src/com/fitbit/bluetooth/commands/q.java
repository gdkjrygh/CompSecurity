// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.commands;

import android.os.Bundle;
import com.fitbit.bluetooth.connection.g;
import com.fitbit.bluetooth.galileo.GalileoProfile;

// Referenced classes of package com.fitbit.bluetooth.commands:
//            d

public class q extends d
{

    private static final String n = "ReadSecureCharacteristicCommand";

    public q(g g1, Bundle bundle, d.a a)
    {
        super(g1, bundle, a);
    }

    protected void g()
    {
        if (k.a().readSecureCharacteristic(k.l()))
        {
            m.a(true, null);
            return;
        } else
        {
            m.a(false, null);
            return;
        }
    }

    protected void h()
    {
    }

    protected String k()
    {
        return "ReadSecureCharacteristicCommand";
    }
}
