// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.bluetooth.broadcom.b;

import com.fitbit.bluetooth.broadcom.gatt.u;
import com.fitbit.dncs.a.a;
import com.fitbit.dncs.a.i;
import com.fitbit.dncs.a.j;
import com.fitbit.dncs.a.k;
import com.fitbit.dncs.a.q;
import com.fitbit.dncs.domain.CommandID;
import com.fitbit.dncs.domain.RequestError;
import com.fitbit.util.d;
import java.util.UUID;

final class b extends u
{

    static final UUID a;

    b()
    {
        super(a, e, j | m);
    }

    static q a(byte abyte0[])
    {
        Object obj = null;
        if (d.b(abyte0))
        {
            abyte0 = new k(RequestError.b);
        } else
        {
            CommandID commandid = CommandID.a(abyte0[0]);
            Object obj1 = commandid.b();
            a a1 = ((i) (obj1)).a(abyte0);
            obj1 = ((i) (obj1)).a(a1.b());
            com.fitbit.e.a.d("Notifications", String.format("Received Command %s for %s - %s holder = %s", new Object[] {
                commandid, a1.b(), a1.a(), obj1
            }), new Object[0]);
            abyte0 = obj;
            if (obj1 != null)
            {
                com.fitbit.dncs.a.b b1 = j.a(((com.fitbit.dncs.domain.c) (obj1)), a1);
                abyte0 = b1;
                if (b1 == null)
                {
                    abyte0 = new k(RequestError.b);
                }
            }
        }
        if (abyte0 != null)
        {
            return abyte0;
        } else
        {
            return new k(RequestError.b);
        }
    }

    static 
    {
        a = com.fitbit.bluetooth.b.b.g;
    }
}
