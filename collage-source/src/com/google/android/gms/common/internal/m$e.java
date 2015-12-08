// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            m, z

public final class b
    implements ServiceConnection
{

    final m a;
    private final int b;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        z.a(ibinder, "Expecting a valid IBinder");
        m.zza(a, a(ibinder));
        a.zzbA(b);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a.mHandler.sendMessage(a.mHandler.obtainMessage(4, b, 1));
    }

    public (m m1, int i)
    {
        a = m1;
        super();
        b = i;
    }
}
