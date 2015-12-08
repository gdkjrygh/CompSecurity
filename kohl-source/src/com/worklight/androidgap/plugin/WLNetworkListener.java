// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.location.LocationManager;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLLocationListener, WLGeolocationPlugin

public class WLNetworkListener extends WLLocationListener
{

    public WLNetworkListener(LocationManager locationmanager, WLGeolocationPlugin wlgeolocationplugin)
    {
        super(locationmanager, wlgeolocationplugin, "network");
    }
}
