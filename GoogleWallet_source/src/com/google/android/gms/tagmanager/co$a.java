// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            co

public static final class 
{

    private final Map aPa;
    private final com.google.android.gms.internal.a.aPb aPb;

    public final void a(String s, com.google.android.gms.internal.a a1)
    {
        aPa.put(s, a1);
    }

    public final String toString()
    {
        return (new StringBuilder("Properties: ")).append(tw()).append(" pushAfterEvaluate: ").append(aPb).toString();
    }

    public final Map tw()
    {
        return Collections.unmodifiableMap(aPa);
    }

    public final com.google.android.gms.internal.a tx()
    {
        return aPb;
    }
}
