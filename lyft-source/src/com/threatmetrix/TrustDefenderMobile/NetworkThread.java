// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            HttpRunner

class NetworkThread extends Thread
{

    private Runnable a;

    public NetworkThread(Runnable runnable)
    {
        a = null;
        a = runnable;
    }

    public HttpRunner a()
    {
        if (a instanceof HttpRunner)
        {
            return (HttpRunner)a;
        } else
        {
            return null;
        }
    }

    public void interrupt()
    {
        if (a instanceof HttpRunner)
        {
            ((HttpRunner)a).c();
        }
        super.interrupt();
    }

    public void run()
    {
        a.run();
    }
}
