// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;

import android.content.Intent;
import android.support.v4.a.e;
import com.facebook.debug.log.b;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            a

class c
    implements h
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((String)obj);
    }

    public void a(String s)
    {
        b.c("orca:PhoneNumberIdentificationServiceHandler", (new StringBuilder()).append("Manual SMS confirmation succeeded: ").append(s).toString());
        Intent intent = new Intent();
        intent.setAction("com.facebook.orca.phonenumber.CONFIRMATION_CODE_RECEIVED");
        intent.putExtra("confirmation_code", s);
        com.facebook.orca.phonenumber.identification.a.a(a).a(intent);
    }

    public void a(Throwable throwable)
    {
        b.c("orca:PhoneNumberIdentificationServiceHandler", (new StringBuilder()).append("Manual SMS confirmation failed: ").append(throwable.getMessage()).toString());
    }
}
