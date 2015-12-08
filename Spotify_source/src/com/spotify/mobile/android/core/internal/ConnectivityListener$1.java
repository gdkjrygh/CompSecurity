// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.spotify.mobile.android.core.internal:
//            ConnectivityListener, ConnectivitySetter

class this._cls0 extends BroadcastReceiver
{

    final ConnectivityListener this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (ConnectivityListener.access$000(ConnectivityListener.this) != null)
        {
            ConnectivityListener.access$000(ConnectivityListener.this).setConnectivityType(getConnectionType(), isRoaming());
        }
    }

    ()
    {
        this$0 = ConnectivityListener.this;
        super();
    }
}
