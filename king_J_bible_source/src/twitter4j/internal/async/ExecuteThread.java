// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.async;

import twitter4j.internal.logging.Logger;

// Referenced classes of package twitter4j.internal.async:
//            DispatcherImpl

class ExecuteThread extends Thread
{

    static Class class$twitter4j$internal$async$ExecuteThread;
    private static Logger logger;
    private boolean alive;
    DispatcherImpl q;

    ExecuteThread(String s, DispatcherImpl dispatcherimpl, int i)
    {
        super(s + "[" + i + "]");
        alive = true;
        q = dispatcherimpl;
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
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
                    logger.error("Got an exception while running a taks:", exception);
                }
            }
        } while (true);
    }

    public void shutdown()
    {
        alive = false;
    }

    static 
    {
        Class class1;
        if (class$twitter4j$internal$async$ExecuteThread == null)
        {
            class1 = _mthclass$("twitter4j.internal.async.ExecuteThread");
            class$twitter4j$internal$async$ExecuteThread = class1;
        } else
        {
            class1 = class$twitter4j$internal$async$ExecuteThread;
        }
        logger = Logger.getLogger(class1);
    }
}
