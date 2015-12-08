// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.caching;

import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.wobs.api.WobsColdStartSyncer;

// Referenced classes of package com.google.android.apps.wallet.wobs.caching:
//            WobsManager

public class WobsCachingModule
{

    public WobsCachingModule()
    {
    }

    static InitializedEventPublisher getInitializedEventPublishers(WobsManager wobsmanager)
    {
        return wobsmanager;
    }

    static WobsColdStartSyncer getWobsColdStartSyncer(WobsManager wobsmanager)
    {
        return wobsmanager;
    }
}
