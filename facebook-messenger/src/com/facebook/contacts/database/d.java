// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.database;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.contacts.database:
//            AddressBookPeriodicRunner

class d extends ac
{

    final AddressBookPeriodicRunner a;

    d(AddressBookPeriodicRunner addressbookperiodicrunner)
    {
        a = addressbookperiodicrunner;
        super();
    }

    public void a(OperationResult operationresult)
    {
        AddressBookPeriodicRunner.c(a);
    }

    protected void a(ServiceException serviceexception)
    {
        AddressBookPeriodicRunner.b(a);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
