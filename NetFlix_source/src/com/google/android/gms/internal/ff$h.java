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
//            ff, fh, fg

protected final class Dm extends Dm
{

    final ff Dh;
    public final Bundle Dm;
    public final IBinder Dn;
    public final int statusCode;

    protected void a(Object obj)
    {
        b((Boolean)obj);
    }

    protected void b(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            ff.a(Dh, 1);
            return;
        }
        switch (statusCode)
        {
        default:
            if (Dm != null)
            {
                boolean1 = (PendingIntent)Dm.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            if (ff.d(Dh) != null)
            {
                fh.x(ff.e(Dh)).b(Dh.bg(), ff.d(Dh));
                ff.a(Dh, null);
            }
            ff.a(Dh, 1);
            ff.a(Dh, null);
            ff.a(Dh).a(new ConnectionResult(statusCode, boolean1));
            return;

        case 0: // '\0'
            try
            {
                boolean1 = Dn.getInterfaceDescriptor();
                if (Dh.bh().equals(boolean1))
                {
                    ff.a(Dh, Dh.r(Dn));
                    if (ff.c(Dh) != null)
                    {
                        ff.a(Dh, 3);
                        ff.a(Dh).bV();
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
            fh.x(ff.e(Dh)).b(Dh.bg(), ff.d(Dh));
            ff.a(Dh, null);
            ff.a(Dh, 1);
            ff.a(Dh, null);
            ff.a(Dh).a(new ConnectionResult(8, null));
            return;

        case 10: // '\n'
            ff.a(Dh, 1);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }

    protected void dx()
    {
    }

    public ionResult(ff ff1, int i, IBinder ibinder, Bundle bundle)
    {
        Dh = ff1;
        super(ff1, Boolean.valueOf(true));
        statusCode = i;
        Dn = ibinder;
        Dm = bundle;
    }
}
