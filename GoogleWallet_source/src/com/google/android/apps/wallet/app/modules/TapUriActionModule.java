// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.help.HelpUriAction;
import com.google.common.collect.ImmutableMap;

public class TapUriActionModule
{

    public TapUriActionModule()
    {
    }

    static ImmutableMap providesUriToRunnableMap(HelpUriAction helpuriaction)
    {
        return ImmutableMap.builder().put(UriRegistry.getUri(7001, new Object[0]), helpuriaction).build();
    }
}
