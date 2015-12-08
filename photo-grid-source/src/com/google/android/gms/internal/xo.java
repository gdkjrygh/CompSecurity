// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            g

public final class xo
{

    private final Map a;
    private final g b;

    public final Map a()
    {
        return Collections.unmodifiableMap(a);
    }

    public final void a(String s, g g)
    {
        a.put(s, g);
    }

    public final g b()
    {
        return b;
    }

    public final String toString()
    {
        return (new StringBuilder("Properties: ")).append(Collections.unmodifiableMap(a)).append(" pushAfterEvaluate: ").append(b).toString();
    }
}
