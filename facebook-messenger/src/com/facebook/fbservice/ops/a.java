// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.fbservice.ops:
//            h, BlueServiceFragment

class a extends h
{

    final BlueServiceFragment a;

    a(BlueServiceFragment blueservicefragment)
    {
        a = blueservicefragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        if (BlueServiceFragment.a(a) != null)
        {
            BlueServiceFragment.a(a).a(operationresult);
        }
    }

    public void a(ServiceException serviceexception)
    {
        if (BlueServiceFragment.a(a) != null)
        {
            BlueServiceFragment.a(a).a(serviceexception);
        }
    }
}
