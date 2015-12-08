// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.cosmos.android;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.spotify.cosmos.android:
//            Resolver, RemoteNativeRouter

class <init>
    implements ServiceConnection
{

    final Resolver this$0;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        componentname = ((ComponentName) (Resolver.access$000(Resolver.this)));
        componentname;
        JVM INSTR monitorenter ;
        if (ibinder == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (Resolver.access$100(Resolver.this) != this._fld0)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        Resolver.access$200(Resolver.this);
        componentname;
        JVM INSTR monitorexit ;
        return;
        Resolver.access$302(Resolver.this, (RemoteNativeRouter)ibinder);
        Resolver.access$102(Resolver.this, this._fld0);
        notifyOnConnected();
        componentname;
        JVM INSTR monitorexit ;
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        synchronized (Resolver.access$000(Resolver.this))
        {
            Resolver.access$400(Resolver.this);
            Resolver.access$302(Resolver.this, null);
            Resolver.access$102(Resolver.this, this._fld0);
            Resolver.access$500(Resolver.this);
        }
        return;
        exception;
        componentname;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private ()
    {
        this$0 = Resolver.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
