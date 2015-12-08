// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.data.http.power.DelegatingCallback;
import com.dominos.android.sdk.data.http.power.PowerCallback;

// Referenced classes of package com.dominos.activities:
//            UserChangePassword

class rCallback extends DelegatingCallback
{

    final UserChangePassword this$0;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    public void onSuccess(String s)
    {
        handleSavedCreditCardsFetch(s);
    }

    rCallback(PowerCallback powercallback)
    {
        this$0 = UserChangePassword.this;
        super(powercallback);
    }
}
