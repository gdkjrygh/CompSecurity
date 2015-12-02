// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ad

class ah extends ac
{

    final ad a;

    ah(ad ad1)
    {
        a = ad1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ad.a(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.a("orca:FriendListsLoader", "SYNC_TOP_LAST_ACTIVE error", serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
