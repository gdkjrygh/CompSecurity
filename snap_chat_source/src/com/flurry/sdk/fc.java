// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;

// Referenced classes of package com.flurry.sdk:
//            el

public abstract class fc
    implements Runnable
{

    private static final String a = com/flurry/sdk/fc.getSimpleName();
    PrintStream g;
    PrintWriter h;

    public fc()
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
            if (g != null)
            {
                throwable.printStackTrace(g);
            } else
            if (h != null)
            {
                throwable.printStackTrace(h);
            } else
            {
                throwable.printStackTrace();
            }
        }
        el.a(6, a, "", throwable);
    }

}
