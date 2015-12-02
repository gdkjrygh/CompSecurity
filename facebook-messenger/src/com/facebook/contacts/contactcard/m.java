// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.o;
import com.facebook.ui.d.a;

// Referenced classes of package com.facebook.contacts.contactcard:
//            ContactCardFragment

class m extends ac
{

    final ContactCardFragment a;

    m(ContactCardFragment contactcardfragment)
    {
        a = contactcardfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        ContactCardFragment.c(a, null);
        com.facebook.contacts.contactcard.ContactCardFragment.a(a, true);
        a.T();
    }

    protected void a(ServiceException serviceexception)
    {
        ContactCardFragment.c(a, null);
        com.facebook.ui.d.a.a(a.n()).a(o.app_error_dialog_title).b(o.audio_message_error_name).a();
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
