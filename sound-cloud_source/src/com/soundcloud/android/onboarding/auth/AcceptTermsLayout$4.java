// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;


// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AcceptTermsLayout

class this._cls0
    implements com.soundcloud.android.utils.n.OnClickListener
{

    final AcceptTermsLayout this$0;

    public void onClick()
    {
        getAcceptTermsHandler().onShowPrivacyPolicy();
    }

    ceptTermsHandler()
    {
        this$0 = AcceptTermsLayout.this;
        super();
    }
}
