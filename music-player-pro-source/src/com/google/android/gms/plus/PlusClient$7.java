// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.plus:
//            PlusClient

class anx
    implements com.google.android.gms.common.api.ation.b
{

    final PlusClient anv;
    final AccessRevokedListener anx;

    public void az(Status status)
    {
        anx.onAccessRevoked(status.getStatus().gQ());
    }

    public void b(Object obj)
    {
        az((Status)obj);
    }

    AccessRevokedListener(PlusClient plusclient, AccessRevokedListener accessrevokedlistener)
    {
        anv = plusclient;
        anx = accessrevokedlistener;
        super();
    }
}
