// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            ff

final class Dh
    implements ServiceConnection
{

    final ff Dh;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Dh.z(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Dh.mHandler.sendMessage(Dh.mHandler.obtainMessage(4, Integer.valueOf(1)));
    }

    (ff ff1)
    {
        Dh = ff1;
        super();
    }
}
