// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.comm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.apptentive.android.sdk.comm:
//            NetworkStateListener

public class NetworkStateReceiver extends BroadcastReceiver
{

    private static Set listeners = new HashSet();

    public NetworkStateReceiver()
    {
    }

    public static void addListener(NetworkStateListener networkstatelistener)
    {
        listeners.add(networkstatelistener);
    }

    public static void clearListeners()
    {
        listeners.clear();
    }

    public void onReceive(Context context, Intent intent)
    {
    }

}
