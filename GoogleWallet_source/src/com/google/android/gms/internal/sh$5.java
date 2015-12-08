// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            sh, rn

final class gleApiClient extends gleApiClient
{

    final String aEH;
    final String aEN;
    final sh aFu;
    final int aFw;
    final int aFz;

    private void b(rn rn1)
    {
        a(rn1.b(this, aEH, aEN, aFw, aFz));
    }

    protected final void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        b((rn));
    }

    gleApiClient(sh sh1, GoogleApiClient googleapiclient, String s, String s1, int i, int j)
    {
        aFu = sh1;
        aEH = s;
        aEN = s1;
        aFw = i;
        aFz = j;
        super(googleapiclient, null);
    }
}
