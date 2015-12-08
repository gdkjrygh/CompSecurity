// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.rx.AsyncCall;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupView

class this._cls0 extends AsyncCall
{

    final SignupView this$0;

    public volatile void onSuccess(Object obj)
    {
        onSuccess((me.lyft.android.providers.er.PhoneProfile)obj);
    }

    public void onSuccess(me.lyft.android.providers.er.PhoneProfile phoneprofile)
    {
        SignupView.access$000(SignupView.this, phoneprofile);
    }

    public void onUnsubscribe()
    {
        showKeyboardIfNeeded();
    }

    r.PhoneProfile()
    {
        this$0 = SignupView.this;
        super();
    }
}
