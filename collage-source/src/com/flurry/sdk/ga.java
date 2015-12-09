// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Comparator;

// Referenced classes of package com.flurry.sdk:
//            gb, hr, gd

public class ga
    implements Comparator
{

    private static final String a = com/flurry/sdk/ga.getSimpleName();

    public ga()
    {
    }

    private int a(Runnable runnable)
    {
label0:
        {
            int i = 0x7fffffff;
            if (runnable != null)
            {
                if (!(runnable instanceof gb))
                {
                    break label0;
                }
                runnable = (hr)((gb)runnable).a();
                if (runnable != null)
                {
                    i = runnable.i();
                } else
                {
                    i = 0x7fffffff;
                }
            }
            return i;
        }
        if (runnable instanceof hr)
        {
            return ((hr)runnable).i();
        } else
        {
            gd.a(6, a, (new StringBuilder()).append("Unknown runnable class: ").append(runnable.getClass().getName()).toString());
            return 0x7fffffff;
        }
    }

    public int a(Runnable runnable, Runnable runnable1)
    {
        int i = a(runnable);
        int j = a(runnable1);
        if (i < j)
        {
            return -1;
        }
        return i <= j ? 0 : 1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Runnable)obj, (Runnable)obj1);
    }

}
