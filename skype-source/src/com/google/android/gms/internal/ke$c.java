// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ke

public static final class <init>
{

    private final List a;
    private final Map b;
    private final String c;
    private final int d;

    public final List a()
    {
        return a;
    }

    public final String b()
    {
        return c;
    }

    public final Map c()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("Rules: ")).append(a).append("  Macros: ").append(b).toString();
    }

    private (List list, Map map, String s, int i)
    {
        a = Collections.unmodifiableList(list);
        b = Collections.unmodifiableMap(map);
        c = s;
        d = i;
    }

    d(List list, Map map, String s, int i, byte byte0)
    {
        this(list, map, s, i);
    }
}
