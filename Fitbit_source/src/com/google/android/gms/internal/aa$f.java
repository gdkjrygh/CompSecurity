// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            aa

public final class a
    implements ServiceConnection
{

    final aa a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        a.b(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        a.a.sendMessage(a.a.obtainMessage(4, Integer.valueOf(1)));
    }

    public (aa aa1)
    {
        a = aa1;
        super();
    }
}
