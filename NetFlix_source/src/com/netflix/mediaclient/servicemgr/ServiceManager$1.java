// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.servicemgr;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.servicemgr:
//            ServiceManager, AddToMyListWrapper, INetflixService, ManagerStatusListener

class this._cls0
    implements ServiceConnection
{

    final ServiceManager this$0;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Log.d("ServiceManager", (new StringBuilder()).append("ServiceConnected with IBinder: ").append(ibinder).toString());
        componentname = (com.netflix.mediaclient.service.calBinder)ibinder;
        ServiceManager.access$602(ServiceManager.this, componentname.getService());
        ServiceManager.access$702(ServiceManager.this, new AddToMyListWrapper(ServiceManager.this));
        ServiceManager.access$802(ServiceManager.this, componentname.getService());
        if (ServiceManager.access$900(ServiceManager.this) == null)
        {
            ServiceManager.access$902(ServiceManager.this, new rviceListener(ServiceManager.this, null));
        }
        ServiceManager.access$600(ServiceManager.this).registerCallback(ServiceManager.access$900(ServiceManager.this));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        Log.d("ServiceManager", "onServiceDisconnected");
        if (ServiceManager.access$200(ServiceManager.this) != null)
        {
            ServiceManager.access$200(ServiceManager.this).onManagerUnavailable(ServiceManager.this, -2);
            ServiceManager.access$202(ServiceManager.this, null);
        }
        ServiceManager.access$802(ServiceManager.this, null);
        ServiceManager.access$602(ServiceManager.this, null);
    }

    ener()
    {
        this$0 = ServiceManager.this;
        super();
    }
}
