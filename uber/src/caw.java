// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.paypal.android.sdk.payments.LoginActivity;

public final class caw
    implements bzt
{

    private LoginActivity a;

    public caw(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void a(bzw bzw1)
    {
        if (bzw1.b())
        {
            LoginActivity.j(a);
            return;
        } else
        {
            LoginActivity.a(a, bzw1.b);
            return;
        }
    }

    public final void a(Object obj)
    {
        LoginActivity.i(a);
    }
}
