// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.paypal.android.sdk.payments.LoginActivity;

public final class cav
    implements android.view.View.OnClickListener
{

    private LoginActivity a;

    public cav(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void onClick(View view)
    {
        LoginActivity.h(a);
    }
}
