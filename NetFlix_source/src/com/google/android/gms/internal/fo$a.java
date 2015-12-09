// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            fo, fq

public static final class <init>
{

    private final List DI;
    private final Object DJ;

    public <init> a(String s, Object obj)
    {
        DI.add((new StringBuilder()).append((String)fq.f(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(DJ.getClass().getSimpleName()).append('{');
        int j = DI.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)DI.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    private (Object obj)
    {
        DJ = fq.f(obj);
        DI = new ArrayList();
    }

    DI(Object obj, DI di)
    {
        this(obj);
    }
}
