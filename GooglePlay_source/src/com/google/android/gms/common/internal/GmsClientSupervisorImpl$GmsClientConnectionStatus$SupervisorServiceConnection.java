// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            GmsClientSupervisorImpl

public final class this._cls1
    implements ServiceConnection
{

    final this._cls1 this$1;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = GmsClientSupervisorImpl.access$200(_fld1);
        hashmap;
        JVM INSTR monitorenter ;
        _fld1 = ibinder;
        _fld1 = componentname;
        for (Iterator iterator = _fld1.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_78;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        _fld1 = 1;
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = GmsClientSupervisorImpl.access$200(_fld1);
        hashmap;
        JVM INSTR monitorenter ;
        _fld1 = null;
        _fld1 = componentname;
        for (Iterator iterator = _fld1.iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_74;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        _fld1 = 2;
        hashmap;
        JVM INSTR monitorexit ;
    }

    public ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
