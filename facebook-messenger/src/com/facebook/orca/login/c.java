// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.orca.login:
//            WildfireRegNameFragment

class c extends h
{

    final WildfireRegNameFragment a;

    c(WildfireRegNameFragment wildfireregnamefragment)
    {
        a = wildfireregnamefragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        WildfireRegNameFragment.a(a);
    }

    public void a(ServiceException serviceexception)
    {
        WildfireRegNameFragment.a(a, serviceexception);
    }
}
