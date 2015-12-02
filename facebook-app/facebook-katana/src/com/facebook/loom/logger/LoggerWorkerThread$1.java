// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import android.util.Log;
import com.facebook.acra.ErrorReporter;

// Referenced classes of package com.facebook.loom.logger:
//            LoggerWorkerThread

class a
    implements ionHandler
{

    final LoggerWorkerThread a;

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        Log.e("Dextr", "Unhandled exception -- Dextr disabled", throwable);
        ErrorReporter.getInstance().handleException(throwable);
        a.a();
    }

    (LoggerWorkerThread loggerworkerthread)
    {
        a = loggerworkerthread;
        super();
    }
}
