// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.a.d.a.b;

// Referenced classes of package com.roidapp.photogrid.a:
//            d, f, j

final class e
    implements ServiceConnection
{

    final j a;
    final d b;

    e(d d1, j j)
    {
        b = d1;
        a = j;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        b.a("Billing service connected.");
        b.h = com.a.d.a.b.a(ibinder);
        (new Thread(new f(this))).start();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        b.a("Billing service disconnected.");
        b.h = null;
    }
}
