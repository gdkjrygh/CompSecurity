// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;

// Referenced classes of package com.google.android.gms.internal:
//            dj, dm

final class nit> extends nit>
{

    final dj a;
    final ConnectionResult b;
    final nResult c;

    public final void a()
    {
        dj dj1;
        ConnectionResult connectionresult;
label0:
        {
            dj1 = a;
            connectionresult = b;
            if (dj1.b(2))
            {
                if (!connectionresult.b())
                {
                    break label0;
                }
                dj1.h();
            }
            return;
        }
        if (dj1.a(connectionresult))
        {
            dj1.i();
            dj1.h();
            return;
        } else
        {
            dj1.b(connectionresult);
            return;
        }
    }

    nResult(nResult nresult, dm dm, dj dj1, ConnectionResult connectionresult)
    {
        c = nresult;
        a = dj1;
        b = connectionresult;
        super(dm);
    }
}
