// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            jv, jx

public static final class <init>
{

    private final List Nr;
    private final Object Ns;

    public <init> a(String s, Object obj)
    {
        Nr.add((new StringBuilder()).append((String)jx.i(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(Ns.getClass().getSimpleName()).append('{');
        int j = Nr.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)Nr.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    private (Object obj)
    {
        Ns = jx.i(obj);
        Nr = new ArrayList();
    }

    Nr(Object obj, Nr nr)
    {
        this(obj);
    }
}
