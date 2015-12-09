// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.payments;

import android.text.Editable;
import android.text.TextWatcher;

// Referenced classes of package com.paypal.android.sdk.payments:
//            LoginActivity

final class bn
    implements TextWatcher
{

    private LoginActivity a;

    bn(LoginActivity loginactivity)
    {
        a = loginactivity;
        super();
    }

    public final void afterTextChanged(Editable editable)
    {
        LoginActivity.b(a);
    }

    public final void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }
}
