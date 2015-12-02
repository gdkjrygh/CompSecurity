// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.facebook.push.mqtt:
//            bx, by

class bz
    implements ServiceConnection
{

    final bx a;

    private bz(bx bx1)
    {
        a = bx1;
        super();
    }

    bz(bx bx1, by by)
    {
        this(bx1);
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        bx.a(a, ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        bx.a(a);
    }
}
