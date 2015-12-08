// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            j, u

public final class b
    implements ServiceConnection
{

    final j a;
    private final int b;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        u.a(ibinder, "Expecting a valid IBinder");
        j.a(a, a(ibinder));
        componentname = a;
        int i = b;
        ((j) (componentname)).b.sendMessage(((j) (componentname)).b.obtainMessage(6, i, -1, new <init>(componentname)));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        a.b.sendMessage(a.b.obtainMessage(4, b, 1));
    }

    public (j j1, int i)
    {
        a = j1;
        super();
        b = i;
    }
}
