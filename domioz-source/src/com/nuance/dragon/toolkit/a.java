// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit;

import java.lang.reflect.Method;

public final class a
{

    public static final boolean a;

    public a()
    {
    }

    static 
    {
        boolean flag1 = false;
        Method amethod[] = com/nuance/dragon/toolkit/a.getDeclaredMethods();
        int j = amethod.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!amethod[i].getName().endsWith("debug"))
                    {
                        break label0;
                    }
                    flag = true;
                }
                a = flag;
                return;
            }
            i++;
        } while (true);
    }
}
