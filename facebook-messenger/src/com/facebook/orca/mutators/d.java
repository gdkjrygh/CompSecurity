// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.mutators;

import com.facebook.fbservice.ops.ac;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.mutators:
//            DeleteThreadDialogFragment

class d extends ac
{

    final DeleteThreadDialogFragment a;

    d(DeleteThreadDialogFragment deletethreaddialogfragment)
    {
        a = deletethreaddialogfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        DeleteThreadDialogFragment.a(a, DeleteThreadDialogFragment.b(a));
        a.a();
    }

    protected void a(ServiceException serviceexception)
    {
        DeleteThreadDialogFragment.a(a, null);
        DeleteThreadDialogFragment.a(a, serviceexception);
    }

    public void b(Object obj)
    {
        a((OperationResult)obj);
    }
}
