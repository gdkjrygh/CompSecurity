// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import java.lang.reflect.Method;

// Referenced classes of package com.google.inject.spi:
//            InjectionPoint

static class hash
{

    final int hash;
    final String name;
    final Class parameterTypes[];

    public boolean equals(Object obj)
    {
        if (obj instanceof hash) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (name.equals(((name) (obj = (name)obj)).name) && parameterTypes.length == ((parameterTypes) (obj)).parameterTypes.length)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= parameterTypes.length)
                    {
                        break label1;
                    }
                    if (parameterTypes[i] != ((parameterTypes) (obj)).parameterTypes[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public int hashCode()
    {
        return hash;
    }

    (Method method)
    {
        name = method.getName();
        parameterTypes = method.getParameterTypes();
        int j = name.hashCode() * 31 + parameterTypes.length;
        method = parameterTypes;
        int k = method.length;
        for (int i = 0; i < k; i++)
        {
            j = j * 31 + method[i].hashCode();
        }

        hash = j;
    }
}
