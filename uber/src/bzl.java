// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import com.paypal.android.sdk.payments.LoginActivity;

public final class bzl
    implements android.content.DialogInterface.OnClickListener
{

    private LoginActivity a;

    public bzl(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        LoginActivity.n(a);
    }
}
