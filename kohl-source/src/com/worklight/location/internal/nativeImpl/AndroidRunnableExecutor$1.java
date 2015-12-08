// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.nativeImpl;

import android.os.Handler;
import android.os.Looper;

// Referenced classes of package com.worklight.location.internal.nativeImpl:
//            AndroidRunnableExecutor

class this._cls0
    implements Runnable
{

    final AndroidRunnableExecutor this$0;

    public void run()
    {
        Looper.prepare();
        AndroidRunnableExecutor.access$002(AndroidRunnableExecutor.this, new Handler());
        Looper.loop();
    }

    ()
    {
        this$0 = AndroidRunnableExecutor.this;
        super();
    }
}
