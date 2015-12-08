// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.view.View;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            AcceptTermsLayout

class this._cls0
    implements android.view.
{

    final AcceptTermsLayout this$0;

    public void onClick(View view)
    {
        getAcceptTermsHandler().onAcceptTerms(AcceptTermsLayout.access$000(AcceptTermsLayout.this), AcceptTermsLayout.access$100(AcceptTermsLayout.this));
    }

    ceptTermsHandler()
    {
        this$0 = AcceptTermsLayout.this;
        super();
    }
}
