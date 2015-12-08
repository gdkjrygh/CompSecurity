// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.a.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.a.a.a.a:
//            c

final class 
    implements ServiceConnection
{

    final c a;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        c.a(a, com.android.a.a.a(ibinder));
        if (!c.a(a) && a.f())
        {
            a.g();
            if (c.b(a) != null)
            {
                c.b(a).a();
            }
        }
        if (c.b(a) != null)
        {
            c.b(a).b();
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        c.a(a, null);
    }

    ComponentName(c c1)
    {
        a = c1;
        super();
    }
}
