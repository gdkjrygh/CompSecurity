// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class n extends ac
{

    final ContactCardFragment a;

    n(ContactCardFragment contactcardfragment)
    {
        a = contactcardfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ContactCardFragment.d(a, null);
    }

    protected void a(ServiceException serviceexception)
    {
        ContactCardFragment.d(a, null);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
