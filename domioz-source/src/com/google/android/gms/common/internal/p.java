// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            ap, ai, k, r

public final class p
    implements ServiceConnection
{

    final k a;

    public p(k k1)
    {
        a = k1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        ap.a(ibinder, "Expecting a valid IBinder");
        k.a(a, ai.a(ibinder));
        a.a.sendMessage(a.a.obtainMessage(6, new r(a)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        a.a.sendMessage(a.a.obtainMessage(4, Integer.valueOf(1)));
    }
}
