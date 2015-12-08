// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal:
//            n, o

public static final class <init>
{

    private final List Mg;
    private final Object Mh;

    public <init> a(String s, Object obj)
    {
        Mg.add((new StringBuilder()).append((String)o.i(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(Mh.getClass().getSimpleName()).append('{');
        int j = Mg.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)Mg.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    private (Object obj)
    {
        Mh = o.i(obj);
        Mg = new ArrayList();
    }

    Mg(Object obj, Mg mg)
    {
        this(obj);
    }
}
