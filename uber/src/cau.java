// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.Editable;
import android.text.TextWatcher;
import com.paypal.android.sdk.payments.LoginActivity;

public final class cau
    implements TextWatcher
{

    private LoginActivity a;

    public cau(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        LoginActivity.g(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
