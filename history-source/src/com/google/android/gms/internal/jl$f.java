// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            jl

public final class MQ
    implements ServiceConnection
{

    final jl MQ;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        MQ.N(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        MQ.mHandler.sendMessage(MQ.mHandler.obtainMessage(4, Integer.valueOf(1)));
    }

    public (jl jl1)
    {
        MQ = jl1;
        super();
    }
}
