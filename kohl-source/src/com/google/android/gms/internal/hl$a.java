// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            hl, hn

public static final class <init>
{

    private final List GG;
    private final Object GH;

    public <init> a(String s, Object obj)
    {
        GG.add((new StringBuilder()).append((String)hn.f(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(GH.getClass().getSimpleName()).append('{');
        int j = GG.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)GG.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    private (Object obj)
    {
        GH = hn.f(obj);
        GG = new ArrayList();
    }

    GG(Object obj, GG gg)
    {
        this(obj);
    }
}
