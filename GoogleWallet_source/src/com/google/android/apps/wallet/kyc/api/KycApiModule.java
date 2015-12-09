// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc.api;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.kyc.api:
//            KycStatusPublisher, KycExperimentPublisher

public class KycApiModule
{

    public KycApiModule()
    {
    }

    static Set getInitializedEventPublishers(KycStatusPublisher kycstatuspublisher, KycExperimentPublisher kycexperimentpublisher)
    {
        return ImmutableSet.of(kycstatuspublisher, kycexperimentpublisher);
    }
}
