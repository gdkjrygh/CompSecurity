// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.mutators;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.mutators:
//            DeleteMessagesDialogFragment

class a extends h
{

    final DeleteMessagesDialogFragment a;

    a(DeleteMessagesDialogFragment deletemessagesdialogfragment)
    {
        a = deletemessagesdialogfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        DeleteMessagesDialogFragment.a(a, operationresult);
    }

    public void a(ServiceException serviceexception)
    {
        DeleteMessagesDialogFragment.a(a, serviceexception);
    }
}
