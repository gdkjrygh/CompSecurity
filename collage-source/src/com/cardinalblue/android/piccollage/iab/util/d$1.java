// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.iab.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.a.a.a;

// Referenced classes of package com.cardinalblue.android.piccollage.iab.util:
//            d, e

class a
    implements ServiceConnection
{

    final b a;
    final d b;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (!b.d) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b.c("Billing service connected.");
        b.i = com.android.a.a.a(ibinder);
        componentname = b.h.getPackageName();
        b.n = true;
        int i;
        b.c("Checking for in-app billing 3 support.");
        i = b.i.a(3, componentname, "inapp");
        if (i != 0)
        {
            try
            {
                if (a != null)
                {
                    a.a(new e(i, "Error checking for billing v3 support."));
                }
                b.e = false;
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            if (a != null)
            {
                a.a(new e(-1001, "RemoteException while setting up in-app billing."));
            }
            componentname.printStackTrace();
            return;
        }
        b.c((new StringBuilder()).append("In-app billing version 3 supported for ").append(componentname).toString());
        i = b.i.a(3, componentname, "subs");
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        b.c("Subscriptions AVAILABLE.");
        b.e = true;
_L4:
        b.c = true;
        if (a == null) goto _L1; else goto _L3
_L3:
        a.a(new e(0, "Setup successful."));
        return;
        b.c((new StringBuilder()).append("Subscriptions NOT AVAILABLE. Response: ").append(i).toString());
          goto _L4
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        b.c("Billing service disconnected.");
        b.i = null;
        b.n = false;
    }

    (d d1,  )
    {
        b = d1;
        a = ;
        super();
    }
}
