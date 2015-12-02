// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.a;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.analytics.ce;
import com.facebook.debug.log.b;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.analytics.a:
//            a

class e
    implements ServiceConnection
{

    private final ab a = ab.a();

    public e()
    {
    }

    public s a()
    {
        return a;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        b.a(com.facebook.analytics.a.a.e(), "onServiceConnected()");
        a.a_(ce.a(ibinder));
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        b.a(com.facebook.analytics.a.a.e(), "onServiceDisconnected()");
    }
}
