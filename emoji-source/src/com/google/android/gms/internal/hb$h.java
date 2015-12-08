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
//            hb, hd, hc

protected final class Gn extends Gn
{

    final hb Gi;
    public final Bundle Gn;
    public final IBinder Go;
    public final int statusCode;

    protected void b(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            hb.a(Gi, 1);
            return;
        }
        switch (statusCode)
        {
        default:
            if (Gn != null)
            {
                boolean1 = (PendingIntent)Gn.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            if (hb.d(Gi) != null)
            {
                hd.E(hb.e(Gi)).b(Gi.bu(), hb.d(Gi));
                hb.a(Gi, null);
            }
            hb.a(Gi, 1);
            hb.a(Gi, null);
            hb.a(Gi).a(new ConnectionResult(statusCode, boolean1));
            return;

        case 0: // '\0'
            try
            {
                boolean1 = Go.getInterfaceDescriptor();
                if (Gi.bv().equals(boolean1))
                {
                    hb.a(Gi, Gi.x(Go));
                    if (hb.c(Gi) != null)
                    {
                        hb.a(Gi, 3);
                        hb.a(Gi).cp();
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
            hd.E(hb.e(Gi)).b(Gi.bu(), hb.d(Gi));
            hb.a(Gi, null);
            hb.a(Gi, 1);
            hb.a(Gi, null);
            hb.a(Gi).a(new ConnectionResult(8, null));
            return;

        case 10: // '\n'
            hb.a(Gi, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }

    protected void d(Object obj)
    {
        b((Boolean)obj);
    }

    protected void fu()
    {
    }

    public ionResult(hb hb1, int i, IBinder ibinder, Bundle bundle)
    {
        Gi = hb1;
        super(hb1, Boolean.valueOf(true));
        statusCode = i;
        Go = ibinder;
        Gn = bundle;
    }
}
