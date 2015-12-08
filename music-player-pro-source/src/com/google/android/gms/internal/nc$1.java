// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.DeadObjectException;
import android.os.IInterface;

// Referenced classes of package com.google.android.gms.internal:
//            np, nc, ni

class agE
    implements np
{

    final nc agE;

    public void dS()
    {
        nc.a(agE);
    }

    public IInterface hw()
        throws DeadObjectException
    {
        return nh();
    }

    public ni nh()
        throws DeadObjectException
    {
        return (ni)agE.hw();
    }

    (nc nc1)
    {
        agE = nc1;
        super();
    }
}
