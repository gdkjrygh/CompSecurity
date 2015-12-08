// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;


// Referenced classes of package com.paypal.android.sdk.payments:
//            aE, aH, LoginActivity

final class ai
    implements aE
{

    private LoginActivity a;

    ai(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void a(aH ah)
    {
        if (ah.b())
        {
            LoginActivity.j(a);
            return;
        } else
        {
            LoginActivity.a(a, ah.b);
            return;
        }
    }

    public final void a(Object obj)
    {
        LoginActivity.i(a);
    }
}
