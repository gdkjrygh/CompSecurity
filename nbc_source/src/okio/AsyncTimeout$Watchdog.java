// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;


// Referenced classes of package okio:
//            AsyncTimeout

private static final class setDaemon extends Thread
{

    public void run()
    {
        do
        {
            AsyncTimeout asynctimeout;
            do
            {
                asynctimeout = AsyncTimeout.access$000();
            } while (asynctimeout == null);
            try
            {
                asynctimeout.timedOut();
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }

    public ion()
    {
        super("Okio Watchdog");
        setDaemon(true);
    }
}
