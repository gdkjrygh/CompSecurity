// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.auth;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.auth:
//            UpgradeScreenOrcaFragment

class e extends h
{

    final UpgradeScreenOrcaFragment a;

    e(UpgradeScreenOrcaFragment upgradescreenorcafragment)
    {
        a = upgradescreenorcafragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        UpgradeScreenOrcaFragment.a(a);
    }

    public void a(ServiceException serviceexception)
    {
    }
}
