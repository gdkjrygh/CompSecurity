// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.api:
//            i, j, Scope

public final class c
{

    private final i a;
    private final j b;
    private final ArrayList c;

    public transient c(i i, j j, Scope ascope[])
    {
        a = i;
        b = j;
        c = new ArrayList(Arrays.asList(ascope));
    }

    public final i a()
    {
        return a;
    }

    public final List b()
    {
        return c;
    }

    public final j c()
    {
        return b;
    }
}
