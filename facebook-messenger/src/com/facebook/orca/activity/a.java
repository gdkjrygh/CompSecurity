// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import com.facebook.analytics.cb;
import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.user.User;

// Referenced classes of package com.facebook.orca.activity:
//            AddContactsActivity

class a extends ac
{

    final ProgressDialog a;
    final AddContactsActivity b;

    a(AddContactsActivity addcontactsactivity, ProgressDialog progressdialog)
    {
        b = addcontactsactivity;
        a = progressdialog;
        super();
    }

    public void a(OperationResult operationresult)
    {
        AddContactsActivity.a(b, a);
        AddContactsActivity.a(b, null);
        Object obj = (User)operationresult.g().getParcelable("result");
        if (obj != null)
        {
            operationresult = ((User) (obj)).g();
            obj = ((User) (obj)).b();
            AddContactsActivity.a(b, (new cb("phone_number_search_success")).b("uid", ((String) (obj))));
            AddContactsActivity.a(b, operationresult, ((String) (obj)));
            return;
        } else
        {
            AddContactsActivity.a(b, new cb("phone_number_search_no_match"));
            AddContactsActivity.a(b);
            return;
        }
    }

    protected void a(ServiceException serviceexception)
    {
        AddContactsActivity.a(b, new cb("phone_number_search_server_error"));
        AddContactsActivity.a(b, a);
        AddContactsActivity.a(b);
        AddContactsActivity.a(b, null);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
