// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hcf extends Thread
{

    public hcf()
    {
        super("Okio Watchdog");
        setDaemon(true);
    }

    public final void run()
    {
        do
        {
            hce hce1;
            do
            {
                hce1 = hce.e();
            } while (hce1 == null);
            try
            {
                hce1.a();
            }
            catch (InterruptedException interruptedexception) { }
        } while (true);
    }
}
