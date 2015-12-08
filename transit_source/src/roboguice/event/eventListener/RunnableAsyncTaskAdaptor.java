// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event.eventListener;

import android.os.Handler;
import roboguice.util.SafeAsyncTask;

public class RunnableAsyncTaskAdaptor extends SafeAsyncTask
{

    protected Runnable runnable;

    public RunnableAsyncTaskAdaptor(Handler handler, Runnable runnable1)
    {
        super(handler);
        runnable = runnable1;
    }

    public RunnableAsyncTaskAdaptor(Runnable runnable1)
    {
        runnable = runnable1;
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public Void call()
        throws Exception
    {
        runnable.run();
        return null;
    }
}
