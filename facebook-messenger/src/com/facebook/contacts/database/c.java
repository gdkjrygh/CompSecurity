// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.database;

import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.contacts.database:
//            AddressBookPeriodicRunner

class c extends ac
{

    final AddressBookPeriodicRunner a;

    c(AddressBookPeriodicRunner addressbookperiodicrunner)
    {
        a = addressbookperiodicrunner;
        super();
    }

    public void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.b(AddressBookPeriodicRunner.g(), "startFavoritesSync onSuccess");
        AddressBookPeriodicRunner.a(a);
    }

    protected void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.b(AddressBookPeriodicRunner.g(), (new StringBuilder()).append("startFavoritesSync onServiceException: ").append(serviceexception.toString()).toString());
        com.facebook.contacts.database.AddressBookPeriodicRunner.b(a);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
