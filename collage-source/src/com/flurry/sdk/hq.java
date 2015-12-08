// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;

// Referenced classes of package com.flurry.sdk:
//            gd

public abstract class hq
    implements Runnable
{

    private static final String a = com/flurry/sdk/hq.getSimpleName();
    PrintStream h;
    PrintWriter i;

    public hq()
    {
    }

    public final void run()
    {
        try
        {
            safeRun();
            return;
        }
        catch (Throwable throwable)
        {
            if (h != null)
            {
                throwable.printStackTrace(h);
            } else
            if (i != null)
            {
                throwable.printStackTrace(i);
            } else
            {
                throwable.printStackTrace();
            }
        }
        gd.a(6, a, "", throwable);
    }

    public abstract void safeRun();

}
