// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            kb

public final class VT
    implements ServiceConnection
{

    final kb VT;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        VT.aX(ibinder);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        VT.mHandler.sendMessage(VT.mHandler.obtainMessage(4, Integer.valueOf(1)));
    }

    public (kb kb1)
    {
        VT = kb1;
        super();
    }
}
