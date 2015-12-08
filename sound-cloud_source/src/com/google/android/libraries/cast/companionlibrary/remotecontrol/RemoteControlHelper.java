// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.remotecontrol;

import android.media.AudioManager;
import android.media.RemoteControlClient;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.remotecontrol:
//            RemoteControlClientCompat

public class RemoteControlHelper
{

    private static boolean sHasRemoteControlAPIs;

    public RemoteControlHelper()
    {
    }

    public static void registerRemoteControlClient(AudioManager audiomanager, RemoteControlClientCompat remotecontrolclientcompat)
    {
        if (!sHasRemoteControlAPIs)
        {
            return;
        } else
        {
            audiomanager.registerRemoteControlClient((RemoteControlClient)remotecontrolclientcompat.getActualRemoteControlClientObject());
            return;
        }
    }

    public static void unregisterRemoteControlClient(AudioManager audiomanager, RemoteControlClientCompat remotecontrolclientcompat)
    {
        if (!sHasRemoteControlAPIs)
        {
            return;
        } else
        {
            audiomanager.unregisterRemoteControlClient((RemoteControlClient)remotecontrolclientcompat.getActualRemoteControlClientObject());
            return;
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sHasRemoteControlAPIs = flag;
    }
}
