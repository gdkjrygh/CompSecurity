// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.init.ui;

import com.google.android.apps.wallet.init.InitializerTaskManager;
import com.google.android.apps.wallet.logging.WLog;
import dagger.Lazy;
import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.init.ui:
//            InitializerActivity

final class <init>
    implements Callable
{

    final InitializerActivity this$0;

    private Void call()
        throws Exception
    {
        InitializerTaskManager initializertaskmanager = (InitializerTaskManager)taskManager.get();
        WLog.d(InitializerActivity.access$100(), "Running initialization tasks.");
        initializertaskmanager.runTasks();
        WLog.d(InitializerActivity.access$100(), "Done running initialization tasks.");
        return null;
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    private ()
    {
        this$0 = InitializerActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
