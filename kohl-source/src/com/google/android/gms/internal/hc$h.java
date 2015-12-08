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
//            hc, he, hd

protected final class Gk extends Gk
{

    final hc Gf;
    public final Bundle Gk;
    public final IBinder Gl;
    public final int statusCode;

    protected void b(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            hc.a(Gf, 1);
            return;
        }
        switch (statusCode)
        {
        default:
            if (Gk != null)
            {
                boolean1 = (PendingIntent)Gk.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            if (hc.d(Gf) != null)
            {
                he.B(hc.e(Gf)).b(Gf.bp(), hc.d(Gf));
                hc.a(Gf, null);
            }
            hc.a(Gf, 1);
            hc.a(Gf, null);
            hc.a(Gf).a(new ConnectionResult(statusCode, boolean1));
            return;

        case 0: // '\0'
            try
            {
                boolean1 = Gl.getInterfaceDescriptor();
                if (Gf.bq().equals(boolean1))
                {
                    hc.a(Gf, Gf.x(Gl));
                    if (hc.c(Gf) != null)
                    {
                        hc.a(Gf, 3);
                        hc.a(Gf).ck();
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
            he.B(hc.e(Gf)).b(Gf.bp(), hc.d(Gf));
            hc.a(Gf, null);
            hc.a(Gf, 1);
            hc.a(Gf, null);
            hc.a(Gf).a(new ConnectionResult(8, null));
            return;

        case 10: // '\n'
            hc.a(Gf, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }

    protected void d(Object obj)
    {
        b((Boolean)obj);
    }

    protected void fp()
    {
    }

    public ionResult(hc hc1, int i, IBinder ibinder, Bundle bundle)
    {
        Gf = hc1;
        super(hc1, Boolean.valueOf(true));
        statusCode = i;
        Gl = ibinder;
        Gk = bundle;
    }
}
