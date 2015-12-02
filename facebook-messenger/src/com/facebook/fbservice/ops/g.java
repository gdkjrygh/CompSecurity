// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fbservice.ops;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.fbservice.service.x;

// Referenced classes of package com.facebook.fbservice.ops:
//            c, d

class g
    implements ServiceConnection
{

    final c a;

    private g(c c1)
    {
        a = c1;
        super();
    }

    g(c c1, d d)
    {
        this(c1);
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (!c.a(a))
        {
            c.a(a, x.a(ibinder));
            c.b(a);
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        c.a(a, null);
        c.a(a, false);
    }
}
