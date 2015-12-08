// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.wobs.list.WoblListAdapter;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import dagger.Lazy;

public class WobsModule
{

    public WobsModule()
    {
    }

    static WoblHolder getWoblHolder(FeatureManager featuremanager, Lazy lazy, Lazy lazy1)
    {
        if (featuremanager.isFeatureEnabled(Feature.FAST_WOBL))
        {
            return (WoblHolder)lazy1.get();
        } else
        {
            return (WoblHolder)lazy.get();
        }
    }

    static WoblListAdapter getWoblListAdapter(FeatureManager featuremanager, Lazy lazy, Lazy lazy1)
    {
        if (featuremanager.isFeatureEnabled(Feature.FAST_WOBL))
        {
            return (WoblListAdapter)lazy1.get();
        } else
        {
            return (WoblListAdapter)lazy.get();
        }
    }
}
