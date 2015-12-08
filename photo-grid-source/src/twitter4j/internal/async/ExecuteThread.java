// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.async;

import twitter4j.internal.logging.Logger;

// Referenced classes of package twitter4j.internal.async:
//            DispatcherImpl

class ExecuteThread extends Thread
{

    private static Logger logger = Logger.getLogger(twitter4j/internal/async/ExecuteThread);
    private boolean alive;
    DispatcherImpl q;

    ExecuteThread(String s, DispatcherImpl dispatcherimpl, int i)
    {
        super((new StringBuilder()).append(s).append("[").append(i).append("]").toString());
        alive = true;
        q = dispatcherimpl;
    }

    public void run()
    {
        do
        {
            if (!alive)
            {
                break;
            }
            Runnable runnable = q.poll();
            if (runnable != null)
            {
                try
                {
                    runnable.run();
                }
                catch (Exception exception)
                {
                    logger.error("Got an exception while running a task:", exception);
                }
            }
        } while (true);
    }

    public void shutdown()
    {
        alive = false;
    }

}
