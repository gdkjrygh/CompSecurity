// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ej;
import java.util.Collections;
import java.util.Map;

public final class al
{

    private final Map a;
    private final ej b;

    public final Map a()
    {
        return Collections.unmodifiableMap(a);
    }

    public final void a(String s, ej ej)
    {
        a.put(s, ej);
    }

    public final ej b()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("Properties: ")).append(Collections.unmodifiableMap(a)).append(" pushAfterEvaluate: ").append(b).toString();
    }
}
