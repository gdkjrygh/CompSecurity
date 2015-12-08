// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ke

public static final class <init>
{

    private final Map a;
    private final b b;

    public final Map a()
    {
        return Collections.unmodifiableMap(a);
    }

    public final void a(String s, a a1)
    {
        a.put(s, a1);
    }

    public final a b()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("Properties: ")).append(Collections.unmodifiableMap(a)).append(" pushAfterEvaluate: ").append(b).toString();
    }

    private (Map map,  )
    {
        a = map;
        b = ;
    }

    b(Map map, b b1, byte byte0)
    {
        this(map, b1);
    }
}
