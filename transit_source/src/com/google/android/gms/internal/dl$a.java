// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            dl, dm

public static final class <init>
{

    private final List lj;
    private final Object lk;

    public <init> a(String s, Object obj)
    {
        lj.add((new StringBuilder()).append((String)dm.e(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(lk.getClass().getSimpleName()).append('{');
        int j = lj.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)lj.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    private (Object obj)
    {
        lk = dm.e(obj);
        lj = new ArrayList();
    }

    lj(Object obj, lj lj1)
    {
        this(obj);
    }
}
