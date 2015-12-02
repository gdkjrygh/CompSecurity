// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.o;
import com.facebook.ui.d.a;

// Referenced classes of package com.facebook.orca.threadview:
//            AddMembersActivity

class c extends h
{

    final AddMembersActivity a;

    c(AddMembersActivity addmembersactivity)
    {
        a = addmembersactivity;
        super();
    }

    public void a(OperationResult operationresult)
    {
        a.finish();
    }

    public void a(ServiceException serviceexception)
    {
        com.facebook.ui.d.a.a(a).a(o.app_error_dialog_title).a(serviceexception).a();
    }
}
