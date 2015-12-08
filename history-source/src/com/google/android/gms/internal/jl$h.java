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
//            jl, jn, jm

protected final class MV extends MV
{

    final jl MQ;
    public final Bundle MV;
    public final IBinder MW;
    public final int statusCode;

    protected void b(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            jl.a(MQ, 1, null);
            return;
        }
        statusCode;
        JVM INSTR lookupswitch 2: default 44
    //                   0: 142
    //                   10: 269;
           goto _L1 _L2 _L3
_L1:
        if (MV != null)
        {
            boolean1 = (PendingIntent)MV.getParcelable("pendingIntent");
        } else
        {
            boolean1 = null;
        }
        if (jl.c(MQ) != null)
        {
            jn.J(jl.d(MQ)).b(MQ.bK(), jl.c(MQ));
            jl.a(MQ, null);
        }
        jl.a(MQ, 1, null);
        jl.a(MQ).b(new ConnectionResult(statusCode, boolean1));
        return;
_L2:
        boolean1 = MW.getInterfaceDescriptor();
        if (!MQ.bL().equals(boolean1)) goto _L5; else goto _L4
_L4:
        boolean1 = MQ.l(MW);
        if (boolean1 != null)
        {
            try
            {
                jl.a(MQ, 3, boolean1);
                jl.a(MQ).dU();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
        }
_L5:
        jn.J(jl.d(MQ)).b(MQ.bK(), jl.c(MQ));
        jl.a(MQ, null);
        jl.a(MQ, 1, null);
        jl.a(MQ).b(new ConnectionResult(8, null));
        return;
_L3:
        jl.a(MQ, 1, null);
        throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }

    protected void g(Object obj)
    {
        b((Boolean)obj);
    }

    protected void hx()
    {
    }

    public ionResult(jl jl1, int i, IBinder ibinder, Bundle bundle)
    {
        MQ = jl1;
        super(jl1, Boolean.valueOf(true));
        statusCode = i;
        MW = ibinder;
        MV = bundle;
    }
}
