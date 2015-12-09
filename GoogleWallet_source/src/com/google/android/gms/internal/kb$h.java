// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            kb, kd, kc

public final class VY extends VY
{

    final kb VT;
    public final Bundle VY;
    public final IBinder VZ;
    public final int statusCode;

    private void b(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            kb.a(VT, 1, null);
            return;
        }
        statusCode;
        JVM INSTR lookupswitch 2: default 44
    //                   0: 142
    //                   10: 269;
           goto _L1 _L2 _L3
_L1:
        if (VY != null)
        {
            boolean1 = (PendingIntent)VY.getParcelable("pendingIntent");
        } else
        {
            boolean1 = null;
        }
        if (kb.c(VT) != null)
        {
            kd.L(kb.d(VT)).b(VT.bK(), kb.c(VT));
            kb.a(VT, null);
        }
        kb.a(VT, 1, null);
        kb.a(VT).b(new ConnectionResult(statusCode, boolean1));
        return;
_L2:
        boolean1 = VZ.getInterfaceDescriptor();
        if (!VT.bL().equals(boolean1)) goto _L5; else goto _L4
_L4:
        boolean1 = VT.p(VZ);
        if (boolean1 != null)
        {
            try
            {
                kb.a(VT, 3, boolean1);
                kb.a(VT).dT();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
        }
_L5:
        kd.L(kb.d(VT)).b(VT.bK(), kb.c(VT));
        kb.a(VT, null);
        kb.a(VT, 1, null);
        kb.a(VT).b(new ConnectionResult(8, null));
        return;
_L3:
        kb.a(VT, 1, null);
        throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }

    protected final void i(Object obj)
    {
        b((Boolean)obj);
    }

    protected final void iQ()
    {
    }

    public ionResult(kb kb1, int j, IBinder ibinder, Bundle bundle)
    {
        VT = kb1;
        super(kb1, Boolean.valueOf(true));
        statusCode = j;
        VZ = ibinder;
        VY = bundle;
    }
}
