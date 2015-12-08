// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.gms.gcm;

import android.app.Application;
import com.google.android.gms.gcm.GcmNetworkManager;

public class GcmModule
{

    public GcmModule()
    {
    }

    static GcmNetworkManager getGcmNetworkManager(Application application)
    {
        return GcmNetworkManager.getInstance(application);
    }
}
