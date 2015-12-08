// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.RemoteException;
import com.google.ads.mediation.d;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;

// Referenced classes of package com.google.android.gms.internal:
//            dj

public final class dt
{

    private final dj a;

    public dt(dj dj1)
    {
        a = dj1;
    }

    static dj a(dt dt1)
    {
        return dt1.a;
    }

    public final void onClick(d d)
    {
        b.a(3);
        n.a();
        if (!com.google.android.gms.ads.internal.util.client.a.b())
        {
            b.c("onClick must be called on the main UI thread.");
            a.a.post(new Runnable() {

                final dt a;

                public final void run()
                {
                    try
                    {
                        com.google.android.gms.internal.dt.a(a).a();
                        return;
                    }
                    catch (RemoteException remoteexception)
                    {
                        b.b("Could not call onAdClicked.", remoteexception);
                    }
                }

            
            {
                a = dt.this;
                super();
            }
            });
            return;
        }
        try
        {
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d)
        {
            b.b("Could not call onAdClicked.", d);
        }
    }
}
