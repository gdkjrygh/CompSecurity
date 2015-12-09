// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;


// Referenced classes of package c:
//            a

final class d extends Thread
{

    public d()
    {
        super("Okio Watchdog");
        setDaemon(true);
    }

    public void run()
    {
        do
        {
            a a1;
            do
            {
                a1 = a.access$000();
            } while (a1 == null);
            try
            {
                a1.timedOut();
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }
}
