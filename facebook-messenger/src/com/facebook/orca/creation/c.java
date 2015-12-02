// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.creation;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.creation:
//            CreateThreadActivity

class c extends h
{

    final CreateThreadActivity a;

    c(CreateThreadActivity createthreadactivity)
    {
        a = createthreadactivity;
        super();
    }

    public void a(OperationResult operationresult)
    {
        CreateThreadActivity.b(a, operationresult);
    }

    public void a(ServiceException serviceexception)
    {
        CreateThreadActivity.b(a, serviceexception);
    }
}
