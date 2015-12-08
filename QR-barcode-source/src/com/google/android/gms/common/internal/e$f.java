// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            e

final class LF
    implements ServiceConnection
{

    final e LF;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        LF.N(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        LF.mHandler.sendMessage(LF.mHandler.obtainMessage(4, Integer.valueOf(1)));
    }

    (e e1)
    {
        LF = e1;
        super();
    }
}
