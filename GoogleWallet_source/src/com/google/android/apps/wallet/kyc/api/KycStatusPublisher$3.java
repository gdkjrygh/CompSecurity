// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.android.apps.wallet.eventbus.RegistrationCallback;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycStatusPublisher

final class this._cls0
    implements RegistrationCallback
{

    final KycStatusPublisher this$0;

    public final void handleRegistration(Object obj)
    {
        KycStatusPublisher.access$100(KycStatusPublisher.this, obj);
    }

    ()
    {
        this$0 = KycStatusPublisher.this;
        super();
    }
}
