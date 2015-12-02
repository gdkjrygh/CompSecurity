// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import com.facebook.fbservice.ops.h;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

// Referenced classes of package com.facebook.auth.login:
//            PasswordCredentialsFragment

class bh extends h
{

    final PasswordCredentialsFragment a;

    bh(PasswordCredentialsFragment passwordcredentialsfragment)
    {
        a = passwordcredentialsfragment;
        super();
    }

    public void a(OperationResult operationresult)
    {
        PasswordCredentialsFragment.a(a);
    }

    public void a(ServiceException serviceexception)
    {
        PasswordCredentialsFragment.a(a, serviceexception);
    }
}
