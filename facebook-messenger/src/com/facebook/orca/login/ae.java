// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.os.Bundle;
import com.facebook.f.a;
import com.facebook.f.b;
import com.facebook.f.c;
import com.facebook.f.f;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.http.protocol.i;
import com.facebook.http.protocol.l;
import com.facebook.http.protocol.m;
import com.facebook.orca.protocol.methods.ag;
import com.facebook.orca.protocol.methods.be;
import com.facebook.orca.protocol.methods.d;
import com.facebook.orca.protocol.methods.u;
import com.facebook.orca.server.ConfirmPhoneAndRegisterPartialAccountParams;
import com.facebook.orca.server.ConfirmPhoneAndRegisterPartialAccountResult;
import com.facebook.orca.server.RequestSmsConfirmationCodeParams;
import com.facebook.orca.server.UserValidateRegistrationDataParams;
import com.facebook.orca.server.aq;
import com.facebook.user.User;

public class ae
    implements e
{

    private final i a;
    private final com.facebook.auth.b.b b;
    private final f c;
    private final be d;
    private final d e;
    private final u f;
    private final ag g;
    private final a h;
    private OperationResult i;

    public ae(i j, com.facebook.auth.b.b b1, f f1, be be, d d1, u u, ag ag, 
            a a1)
    {
        a = j;
        b = b1;
        c = f1;
        d = be;
        e = d1;
        f = u;
        g = ag;
        h = a1;
    }

    private OperationResult c(ad ad1)
    {
        if (i != null)
        {
            return i;
        } else
        {
            ad1 = new b(c.a(), c.IS_SESSIONLESS);
            l l1 = new l();
            l1.a(m.BOOTSTRAP);
            i = OperationResult.a((Bundle)a.a(h, ad1, l1));
            return i;
        }
    }

    private OperationResult d(ad ad1)
    {
        ad1 = ad1.b();
        ad1 = new UserValidateRegistrationDataParams(ad1.getString("firstName"), ad1.getString("lastName"), ad1.getString("email"), ad1.getString("phone"), ad1.getString("countryCode"), ad1.getString("password"), ad1.getString("gender"), ad1.getString("birthday"));
        a.a(d, ad1);
        return OperationResult.b();
    }

    private OperationResult e(ad ad1)
    {
        ad1 = ad1.b();
        ad1 = new ConfirmPhoneAndRegisterPartialAccountParams(ad1.getString("phone"), ad1.getString("countryCode"), ad1.getString("confirmationCode"), ad1.getString("fullName"), ad1.getString("firstName"), ad1.getString("lastName"));
        return OperationResult.a((ConfirmPhoneAndRegisterPartialAccountResult)a.a(e, ad1));
    }

    private OperationResult f(ad ad1)
    {
        ad1 = ad1.b();
        return OperationResult.a((User)a.a(f, ad1.getString("uid")));
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (aq.a.equals(operationtype))
        {
            return c(ad1);
        }
        if (aq.b.equals(operationtype))
        {
            return d(ad1);
        }
        if (aq.c.equals(operationtype))
        {
            return e(ad1);
        }
        if (aq.d.equals(operationtype))
        {
            return f(ad1);
        }
        if (aq.D.equals(operationtype))
        {
            return b(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }

    protected OperationResult b(ad ad1)
    {
        ad1 = (RequestSmsConfirmationCodeParams)ad1.b().getParcelable("requestSmsConfirmationCodeParams");
        a.a(g, ad1);
        return OperationResult.b();
    }
}
