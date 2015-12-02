// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.qihoo.security.app:
//            c

class a
    implements ServiceConnection
{

    final c a;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        c.a(a, com.qihoo.security.floatview.a.a(ibinder));
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        c.a(a, null);
    }

    me(c c1)
    {
        a = c1;
        super();
    }
}
