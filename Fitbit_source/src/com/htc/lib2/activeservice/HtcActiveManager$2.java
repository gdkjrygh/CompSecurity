// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.htc.lib2.activeservice:
//            HtcActiveManager, Log, ServiceConnectionListener

class this._cls0
    implements ServiceConnection
{

    final HtcActiveManager this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.d("HtcActiveManager", (new StringBuilder()).append(componentname).append(" connected time = ").append(System.currentTimeMillis()).toString());
        HtcActiveManager.access$102(HtcActiveManager.this, true);
        HtcActiveManager.access$202(HtcActiveManager.this, .asInterface(ibinder));
        if (HtcActiveManager.access$300(HtcActiveManager.this) != null)
        {
            HtcActiveManager.access$300(HtcActiveManager.this).onConnected();
        }
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        Log.d("HtcActiveManager", (new StringBuilder()).append(componentname).append(" disconnected").toString());
        HtcActiveManager.access$102(HtcActiveManager.this, false);
        if (HtcActiveManager.access$300(HtcActiveManager.this) != null)
        {
            HtcActiveManager.access$300(HtcActiveManager.this).onDisconnected();
        }
    }

    stener()
    {
        this$0 = HtcActiveManager.this;
        super();
    }
}
