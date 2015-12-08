// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            cp, cv, cz, gr

class ql
    implements Runnable
{

    final cv ql;
    final cp qm;

    public void run()
    {
        try
        {
            ql.qQ.destroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.d("Could not destroy mediation adapter.", remoteexception);
        }
    }

    (cp cp1, cv cv1)
    {
        qm = cp1;
        ql = cv1;
        super();
    }
}
