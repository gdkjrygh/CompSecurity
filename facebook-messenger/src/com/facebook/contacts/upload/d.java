// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.upload;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.l;
import com.facebook.fbservice.service.OperationResult;

// Referenced classes of package com.facebook.contacts.upload:
//            ContactsUploadState, c

class d extends l
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void a(OperationResult operationresult)
    {
        operationresult = (ContactsUploadState)operationresult.i();
        com.facebook.contacts.upload.c.b(a).a((new cb("contacts_upload_running")).e(c.a(a)).a("num_processed", operationresult.b()).a("num_matched", operationresult.c()).a("total", operationresult.d()));
        b.b(c.f(), (new StringBuilder()).append("Contacts upload state (").append(operationresult).append(")").toString());
        c.a(a, operationresult);
    }
}
