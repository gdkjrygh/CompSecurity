// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            hb

final class Gi
    implements ServiceConnection
{

    final hb Gi;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Gi.I(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Gi.mHandler.sendMessage(Gi.mHandler.obtainMessage(4, Integer.valueOf(1)));
    }

    (hb hb1)
    {
        Gi = hb1;
        super();
    }
}
