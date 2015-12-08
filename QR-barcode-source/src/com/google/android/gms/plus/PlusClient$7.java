// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.plus:
//            PlusClient

class alh
    implements com.google.android.gms.common.api.ation.b
{

    final PlusClient alf;
    final AccessRevokedListener alh;

    public void aA(Status status)
    {
        alh.onAccessRevoked(status.getStatus().gt());
    }

    public void b(Object obj)
    {
        aA((Status)obj);
    }

    AccessRevokedListener(PlusClient plusclient, AccessRevokedListener accessrevokedlistener)
    {
        alf = plusclient;
        alh = accessrevokedlistener;
        super();
    }
}
