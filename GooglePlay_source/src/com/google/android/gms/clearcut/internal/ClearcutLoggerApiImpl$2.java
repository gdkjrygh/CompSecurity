// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut.internal;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.google.android.gms.clearcut.internal:
//            ClearcutLoggerApiImpl

final class this._cls0
    implements ThreadFactory
{

    final ClearcutLoggerApiImpl this$0;

    public final Thread newThread(final Runnable r)
    {
        return new Thread(new Runnable() {

            final ClearcutLoggerApiImpl._cls2 this$1;
            final Runnable val$r;

            public final void run()
            {
                Process.setThreadPriority(10);
                r.run();
            }

            
            {
                this$1 = ClearcutLoggerApiImpl._cls2.this;
                r = runnable;
                super();
            }
        });
    }

    _cls1.val.r()
    {
        this$0 = ClearcutLoggerApiImpl.this;
        super();
    }
}
