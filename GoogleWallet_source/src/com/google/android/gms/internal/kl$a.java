// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            kl, kn

public static final class <init>
{

    private final List Wu;
    private final Object Wv;

    public final <init> a(String s, Object obj)
    {
        Wu.add((new StringBuilder()).append((String)kn.k(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(Wv.getClass().getSimpleName()).append('{');
        int j = Wu.size();
        for (int i = 0; i < j; i++)
        {
            stringbuilder.append((String)Wu.get(i));
            if (i < j - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }

    private (Object obj)
    {
        Wv = kn.k(obj);
        Wu = new ArrayList();
    }

    Wu(Object obj, Wu wu)
    {
        this(obj);
    }
}
