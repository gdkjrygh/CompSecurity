// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.umeng.common.Log;

// Referenced classes of package com.umeng.common.net:
//            a, k

class b
    implements ServiceConnection
{

    final a a;

    b(a a1)
    {
        a = a1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.c(com.umeng.common.net.a.b(), "ServiceConnection.onServiceConnected");
        com.umeng.common.net.a.a(a, new Messenger(ibinder));
        if (com.umeng.common.net.a.a(a) != null)
        {
            com.umeng.common.net.a.a(a).a();
        }
        try
        {
            componentname = Message.obtain(null, 4);
            ibinder = new a.a(com.umeng.common.net.a.b(a), com.umeng.common.net.a.c(a), com.umeng.common.net.a.d(a));
            ibinder.d = com.umeng.common.net.a.e(a);
            ibinder.e = com.umeng.common.net.a.f(a);
            componentname.setData(ibinder.a());
            componentname.replyTo = a.a;
            com.umeng.common.net.a.g(a).send(componentname);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ComponentName componentname)
        {
            return;
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Log.c(com.umeng.common.net.a.b(), "ServiceConnection.onServiceDisconnected");
        com.umeng.common.net.a.a(a, null);
    }
}
