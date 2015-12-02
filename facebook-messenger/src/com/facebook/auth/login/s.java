// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.login;

import android.os.Bundle;
import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;

// Referenced classes of package com.facebook.auth.login:
//            n, o, bb, bc

public class s
    implements e
{

    private o a;
    private bc b;

    public s(o o1, bc bc1)
    {
        a = o1;
        b = bc1;
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (operationtype.equals(n.a))
        {
            return OperationResult.a(a.a(ad1.b().getString("accessToken")));
        }
        if (operationtype.equals(n.b))
        {
            ad1 = (PasswordCredentials)ad1.b().getParcelable("passwordCredentials");
            return OperationResult.a(a.a(ad1));
        }
        if (operationtype.equals(n.c))
        {
            a.a();
            return OperationResult.b();
        }
        if (operationtype.equals(n.d))
        {
            a.b();
            return OperationResult.b();
        }
        if (bb.a.equals(operationtype))
        {
            b.a();
            return OperationResult.b();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unhandled operation type: ").append(operationtype).toString());
        }
    }
}
