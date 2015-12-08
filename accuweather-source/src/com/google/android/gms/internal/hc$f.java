// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            hc

final class Gf
    implements ServiceConnection
{

    final hc Gf;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Gf.I(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Gf.mHandler.sendMessage(Gf.mHandler.obtainMessage(4, Integer.valueOf(1)));
    }

    (hc hc1)
    {
        Gf = hc1;
        super();
    }
}
