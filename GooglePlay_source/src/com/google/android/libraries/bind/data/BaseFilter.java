// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.bind.data;

import java.util.List;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.libraries.bind.data:
//            Filter

public abstract class BaseFilter
    implements Filter
{

    private final Executor executor;

    public BaseFilter(Executor executor1)
    {
        executor = executor1;
    }

    public final Executor executor()
    {
        return executor;
    }

    public List transform$7ddb133f(List list)
    {
        return list;
    }
}
