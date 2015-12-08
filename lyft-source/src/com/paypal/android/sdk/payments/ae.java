// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;


// Referenced classes of package com.paypal.android.sdk.payments:
//            ay, aB, LoginActivity

final class ae
    implements ay
{

    private LoginActivity a;

    ae(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void a(aB ab)
    {
        if (ab.b())
        {
            LoginActivity.d(a);
            return;
        } else
        {
            LoginActivity.a(a, ab.b);
            return;
        }
    }

    public final void a(Object obj)
    {
        LoginActivity.c(a);
    }
}
