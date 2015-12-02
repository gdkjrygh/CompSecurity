// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.contacts.upload:
//            c, ContactsUploadState

class e
    implements h
{

    final c a;

    e(c c1)
    {
        a = c1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        b.b(c.f(), "Contacts upload succeeded");
        c.a(a, null);
        com.facebook.contacts.upload.c.b(a).a((new cb("contacts_upload_succeeded")).e(c.a(a)));
        operationresult = ContactsUploadState.a(a.b(), operationresult);
        c.a(a, operationresult);
    }

    public volatile void a(Object obj)
    {
        a((OperationResult)obj);
    }

    public void a(Throwable throwable)
    {
        b.d(c.f(), "Contacts upload failed: ", throwable);
        c.a(a, null);
        com.facebook.contacts.upload.c.b(a).a((new cb("contacts_upload_failed")).e(c.a(a)));
        if (throwable instanceof ServiceException)
        {
            c.a(a, ContactsUploadState.a(a.b(), (ServiceException)throwable));
            return;
        } else
        {
            c.a(a, ContactsUploadState.g());
            return;
        }
    }
}
