// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import com.soundcloud.android.utils.NetworkConnectivityListener;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.collections:
//            ScListFragment

private static final class <init> extends Handler
{

    private final WeakReference fragmentRef;
    private final WeakReference listenerRef;

    public final void handleMessage(Message message)
    {
        ScListFragment sclistfragment = (ScListFragment)fragmentRef.get();
        NetworkConnectivityListener networkconnectivitylistener = (NetworkConnectivityListener)listenerRef.get();
        switch (message.what)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown msg.what: ")).append(message.what).toString());

        case 0: // '\0'
            break;
        }
        if (sclistfragment != null && networkconnectivitylistener != null)
        {
            message = networkconnectivitylistener.getNetworkInfo();
            if (message != null)
            {
                ScListFragment.access$300(sclistfragment, message.isConnectedOrConnecting());
            }
        }
    }

    private (ScListFragment sclistfragment, NetworkConnectivityListener networkconnectivitylistener)
    {
        fragmentRef = new WeakReference(sclistfragment);
        listenerRef = new WeakReference(networkconnectivitylistener);
    }

    listenerRef(ScListFragment sclistfragment, NetworkConnectivityListener networkconnectivitylistener, listenerRef listenerref)
    {
        this(sclistfragment, networkconnectivitylistener);
    }
}
