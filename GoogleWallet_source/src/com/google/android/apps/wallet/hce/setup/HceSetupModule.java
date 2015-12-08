// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;

// Referenced classes of package com.google.android.apps.wallet.hce.setup:
//            NfcFeatureDisabledListener

public class HceSetupModule
{

    public HceSetupModule()
    {
    }

    static InitializedEventPublisher getInitializedEventPublishers(NfcFeatureDisabledListener nfcfeaturedisabledlistener)
    {
        return nfcfeaturedisabledlistener;
    }
}
