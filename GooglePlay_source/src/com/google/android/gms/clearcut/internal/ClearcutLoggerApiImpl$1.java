// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.clearcut.internal:
//            ClearcutLoggerApiImpl

final class this._cls0
    implements Runnable
{

    final ClearcutLoggerApiImpl this$0;

    public final void run()
    {
        synchronized (ClearcutLoggerApiImpl.access$100(ClearcutLoggerApiImpl.this))
        {
            if (ClearcutLoggerApiImpl.access$200(ClearcutLoggerApiImpl.this) <= ClearcutLoggerApiImpl.access$300(ClearcutLoggerApiImpl.this).elapsedRealtime() && ClearcutLoggerApiImpl.access$400(ClearcutLoggerApiImpl.this) != null)
            {
                Log.i("ClearcutLoggerApiImpl", "disconnect managed GoogleApiClient");
                ClearcutLoggerApiImpl.access$400(ClearcutLoggerApiImpl.this).disconnect();
                ClearcutLoggerApiImpl.access$402$795ae0f9(ClearcutLoggerApiImpl.this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    ()
    {
        this$0 = ClearcutLoggerApiImpl.this;
        super();
    }
}
