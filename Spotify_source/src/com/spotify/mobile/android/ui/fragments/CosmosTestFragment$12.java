// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.fragments;

import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.ui.fragments:
//            CosmosTestFragment

final class 
    implements com.spotify.cosmos.android.lback
{

    public final void onServiceConnected(Resolver resolver)
    {
        Logger.a("Connected to service", new Object[0]);
    }

    public final void onServiceConnectionFailed(Resolver resolver, com.spotify.cosmos.android.or or)
    {
        Logger.c("Connection to service failed: %s", new Object[] {
            or.name()
        });
    }

    public final void onServiceDisconnected(Resolver resolver)
    {
        Logger.a("Service disconnected", new Object[0]);
    }

    ()
    {
    }
}
