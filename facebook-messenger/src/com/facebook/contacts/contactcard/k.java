// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class k extends ac
{

    final ContactCardFragment a;

    k(ContactCardFragment contactcardfragment)
    {
        a = contactcardfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ContactCardFragment.a(a, null);
        ContactCardFragment.a(a, operationresult);
    }

    protected void a(ServiceException serviceexception)
    {
        ContactCardFragment.a(a, null);
        ContactCardFragment.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
