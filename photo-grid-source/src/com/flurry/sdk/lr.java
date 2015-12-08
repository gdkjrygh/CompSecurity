// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;

// Referenced classes of package com.flurry.sdk:
//            kc

public abstract class lr
    implements Runnable
{

    private static final String a = com/flurry/sdk/lr.getSimpleName();
    PrintStream h;
    PrintWriter i;

    public lr()
    {
    }

    public abstract void a();

    public final void run()
    {
        try
        {
            a();
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
        kc.a(6, a, "", throwable);
    }

}
