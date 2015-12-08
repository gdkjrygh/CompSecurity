// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs;

import android.content.Intent;
import com.fitbit.data.domain.device.Device;
import com.fitbit.dncs.domain.TrackerBondState;
import com.fitbit.savedstate.g;
import com.fitbit.util.p;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.dncs:
//            DncsPairingManager

class a extends c
{

    final DncsPairingManager a;

    protected void a(Intent intent)
    {
        if (g.b.equals(intent.getAction()))
        {
            Object obj = intent.getStringExtra(g.c);
            TrackerBondState trackerbondstate = (TrackerBondState)intent.getParcelableExtra(g.d);
            intent = (TrackerBondState)intent.getParcelableExtra(g.e);
            if (obj != null && trackerbondstate == null && intent != null)
            {
                obj = p.c(((String) (obj)));
                if (obj != null)
                {
                    synchronized (DncsPairingManager.a(a))
                    {
                        if (a.a(((Device) (obj)).c()) != null)
                        {
                            DncsPairingManager.a(a, false);
                        }
                    }
                    return;
                }
            }
        }
        break MISSING_BLOCK_LABEL_104;
        exception;
        intent;
        JVM INSTR monitorexit ;
        throw exception;
    }

    te(DncsPairingManager dncspairingmanager)
    {
        a = dncspairingmanager;
        super();
    }
}
