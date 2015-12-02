// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;

import com.facebook.fbservice.service.OperationResult;
import com.google.common.d.a.ab;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            VerifyPhoneNumberResult, a

class b
    implements h
{

    final ab a;
    final a b;

    b(a a1, ab ab1)
    {
        b = a1;
        a = ab1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((String)obj);
    }

    public void a(String s)
    {
        com.facebook.debug.log.b.c("orca:PhoneNumberIdentificationServiceHandler", (new StringBuilder()).append("Phone number verification Successful Code:").append(s).toString());
        s = new VerifyPhoneNumberResult(s);
        a.a_(OperationResult.a(s));
    }

    public void a(Throwable throwable)
    {
        com.facebook.debug.log.b.c("orca:PhoneNumberIdentificationServiceHandler", (new StringBuilder()).append("Phone number confirmation failure").append(throwable.getMessage()).toString());
        a.a_(throwable);
    }
}
