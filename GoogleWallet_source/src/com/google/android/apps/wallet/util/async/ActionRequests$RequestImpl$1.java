// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async;

import com.google.common.base.Throwables;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async:
//            ActionRequests

final class this._cls0
    implements Runnable
{

    final this._cls0 this$0;

    public final void run()
    {
label0:
        {
            synchronized (this._cls0.this)
            {
                if (ate != NCELLED)
                {
                    break label0;
                }
            }
            return;
        }
        ate = NNING;
        obj;
        JVM INSTR monitorexit ;
        Object obj1;
        obj1 = null;
        obj = null;
        Object obj2 = cess._mth000(this._cls0.this).call();
        obj1 = obj2;
_L2:
        cess._mth100(this._cls0.this, obj1, ((Exception) (obj)));
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        Throwables.propagateIfPossible(((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
