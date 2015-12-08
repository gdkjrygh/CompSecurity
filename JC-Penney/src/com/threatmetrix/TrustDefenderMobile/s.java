// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;


// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            l

final class s extends Thread
{

    private Runnable a;

    public s(Runnable runnable)
    {
        a = null;
        a = runnable;
    }

    public final l a()
    {
        if (a instanceof l)
        {
            return (l)a;
        } else
        {
            return null;
        }
    }

    public final void interrupt()
    {
        if (a instanceof l)
        {
            ((l)a).c();
        }
        super.interrupt();
    }

    public final void run()
    {
        a.run();
    }
}
