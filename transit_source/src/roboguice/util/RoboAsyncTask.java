// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.util;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.Executor;
import roboguice.RoboGuice;
import roboguice.inject.RoboInjector;

// Referenced classes of package roboguice.util:
//            SafeAsyncTask

public abstract class RoboAsyncTask extends SafeAsyncTask
{

    protected Context context;

    protected RoboAsyncTask(Context context1)
    {
        context = context1;
        RoboGuice.getInjector(context1).injectMembers(this);
    }

    protected RoboAsyncTask(Context context1, Handler handler)
    {
        super(handler);
        context = context1;
        RoboGuice.getInjector(context1).injectMembers(this);
    }

    protected RoboAsyncTask(Context context1, Handler handler, Executor executor)
    {
        super(handler, executor);
        context = context1;
        RoboGuice.getInjector(context1).injectMembers(this);
    }

    protected RoboAsyncTask(Context context1, Executor executor)
    {
        super(executor);
        context = context1;
        RoboGuice.getInjector(context1).injectMembers(this);
    }

    public Context getContext()
    {
        return context;
    }
}
