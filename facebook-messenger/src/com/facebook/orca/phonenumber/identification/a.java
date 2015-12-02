// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;

import android.os.Bundle;
import android.os.Handler;
import com.facebook.fbservice.service.FutureOperationResult;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.OperationType;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.http.protocol.aq;
import com.facebook.orca.protocol.methods.ag;
import com.facebook.orca.server.RequestSmsConfirmationCodeParams;
import com.google.common.d.a.ab;
import com.google.common.d.a.i;
import java.util.Random;

// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            VerifyPhoneNumberParams, f, b, c

public class a
    implements e
{

    private final android.support.v4.a.e a;
    private final javax.inject.a b;
    private final ag c;
    private final f d;

    public a(android.support.v4.a.e e1, javax.inject.a a1, ag ag, f f1)
    {
        a = e1;
        b = a1;
        c = ag;
        d = f1;
    }

    static android.support.v4.a.e a(a a1)
    {
        return a1.a;
    }

    private String a()
    {
        return Integer.toString((new Random()).nextInt(0x15f8f) + 10000);
    }

    private void a(VerifyPhoneNumberParams verifyphonenumberparams, String s, String s1, String s2)
    {
        verifyphonenumberparams = new RequestSmsConfirmationCodeParams(verifyphonenumberparams.b(), verifyphonenumberparams.a(), s, s1, s2);
        ((aq)b.b()).a(c, verifyphonenumberparams);
    }

    private OperationResult b(ad ad1)
    {
        Object obj = ad1.b();
        ad1 = (VerifyPhoneNumberParams)((Bundle) (obj)).getParcelable("verifyPhoneNumberParams");
        String s = ((Bundle) (obj)).getString("flow");
        obj = ((Bundle) (obj)).getString("reg_instance");
        String s1 = a();
        ab ab1 = ab.a();
        FutureOperationResult futureoperationresult = new FutureOperationResult(ab1);
        i.a(d.a(new Handler(), s1), new b(this, ab1));
        try
        {
            a(ad1, s1, s, ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (ad ad1)
        {
            d.a();
            throw ad1;
        }
        return futureoperationresult;
    }

    private OperationResult c(ad ad1)
    {
        Object obj = ad1.b();
        ad1 = (VerifyPhoneNumberParams)((Bundle) (obj)).getParcelable("verifyPhoneNumberParams");
        String s = ((Bundle) (obj)).getString("flow");
        obj = ((Bundle) (obj)).getString("reg_instance");
        i.a(d.a(new Handler(), null, 0x927c0L, false), new c(this));
        try
        {
            a(ad1, null, s, ((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (ad ad1)
        {
            d.a();
            throw ad1;
        }
        return OperationResult.b();
    }

    public OperationResult a(ad ad1)
    {
        OperationType operationtype = ad1.a();
        if (com.facebook.orca.server.aq.G.equals(operationtype))
        {
            return b(ad1);
        }
        if (com.facebook.orca.server.aq.H.equals(operationtype))
        {
            return c(ad1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown operation type: ").append(operationtype).toString());
        }
    }
}
