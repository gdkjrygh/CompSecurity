// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            m, y

public final class b
    implements ServiceConnection
{

    final m a;
    private final int b;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        y.a(ibinder, "Expecting a valid IBinder");
        m.a(a, a(ibinder));
        componentname = a;
        int i = b;
        ((m) (componentname)).b.sendMessage(((m) (componentname)).b.obtainMessage(6, i, -1, new <init>(componentname)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        a.b.sendMessage(a.b.obtainMessage(4, b, 1));
    }

    public (m m1, int i)
    {
        a = m1;
        super();
        b = i;
    }
}
