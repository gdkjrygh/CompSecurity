// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.facebook.fbservice.ops:
//            r, q

class x
    implements ServiceConnection
{

    final r a;

    private x(r r1)
    {
        a = r1;
        super();
    }

    x(r r1, q q)
    {
        this(r1);
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (!a.e())
        {
            r.a(a, com.facebook.fbservice.service.x.a(ibinder));
            r.c(a);
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        r.a(a, null);
        r.a(a, false);
    }
}
