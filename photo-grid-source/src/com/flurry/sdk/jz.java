// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.Comparator;

// Referenced classes of package com.flurry.sdk:
//            ka, ls, kc

public class jz
    implements Comparator
{

    private static final String a = com/flurry/sdk/jz.getSimpleName();

    public jz()
    {
    }

    private int a(Runnable runnable)
    {
label0:
        {
            int i = 0x7fffffff;
            if (runnable != null)
            {
                if (!(runnable instanceof ka))
                {
                    break label0;
                }
                runnable = (ls)((ka)runnable).a();
                if (runnable != null)
                {
                    i = runnable.n();
                } else
                {
                    i = 0x7fffffff;
                }
            }
            return i;
        }
        if (runnable instanceof ls)
        {
            return ((ls)runnable).n();
        } else
        {
            kc.a(6, a, (new StringBuilder("Unknown runnable class: ")).append(runnable.getClass().getName()).toString());
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
