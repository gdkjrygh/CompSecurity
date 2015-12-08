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
//            de, df

protected final class kS extends kS
{

    final de kP;
    public final Bundle kS;
    public final IBinder kT;
    public final int statusCode;

    protected void a(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return;
        }
        switch (statusCode)
        {
        default:
            if (kS != null)
            {
                boolean1 = (PendingIntent)kS.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            if (de.e(kP) != null)
            {
                df.s(de.f(kP)).b(kP.ag(), de.e(kP));
                de.a(kP, null);
            }
            de.a(kP, null);
            kP.a(new ConnectionResult(statusCode, boolean1));
            return;

        case 0: // '\0'
            try
            {
                boolean1 = kT.getInterfaceDescriptor();
                if (kP.ah().equals(boolean1))
                {
                    de.a(kP, kP.p(kT));
                    if (de.d(kP) != null)
                    {
                        kP.aZ();
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1) { }
            df.s(de.f(kP)).b(kP.ag(), de.e(kP));
            de.a(kP, null);
            de.a(kP, null);
            kP.a(new ConnectionResult(8, null));
            return;

        case 10: // '\n'
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }

    protected volatile void a(Object obj)
    {
        a((Boolean)obj);
    }

    protected void aF()
    {
    }

    public ionResult(de de1, int i, IBinder ibinder, Bundle bundle)
    {
        kP = de1;
        super(de1, Boolean.valueOf(true));
        statusCode = i;
        kT = ibinder;
        kS = bundle;
    }
}
