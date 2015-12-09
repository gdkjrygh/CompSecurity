// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;


// Referenced classes of package com.paypal.android.sdk.payments:
//            ah, al, LoginActivity

final class bp
    implements ah
{

    private LoginActivity a;

    bp(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void a(al al1)
    {
        if (al1.b())
        {
            LoginActivity.d(a);
            return;
        } else
        {
            LoginActivity.a(a, al1.b);
            return;
        }
    }

    public final void a(Object obj)
    {
        LoginActivity.c(a);
    }
}
