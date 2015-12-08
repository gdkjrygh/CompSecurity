// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.persistence.landing.SignupUser;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            SignupEnterInfoView, LandingFlow

class this._cls0
    implements Action1
{

    final SignupEnterInfoView this$0;

    public volatile void call(Object obj)
    {
        call((SignupUser)obj);
    }

    public void call(SignupUser signupuser)
    {
        landingFlow.goToNextScreenInSignupFlow();
    }

    ()
    {
        this$0 = SignupEnterInfoView.this;
        super();
    }
}
