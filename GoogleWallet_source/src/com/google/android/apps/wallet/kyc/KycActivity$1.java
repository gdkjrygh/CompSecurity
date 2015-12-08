// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;


// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycNavListener, KycActivity

final class this._cls0
    implements KycNavListener
{

    final KycActivity this$0;

    public final void onRequestNav(.NavState navstate)
    {
        transitionNavState(navstate);
    }

    .NavState()
    {
        this$0 = KycActivity.this;
        super();
    }
}
