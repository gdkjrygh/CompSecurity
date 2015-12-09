// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.base.Function;
import java.util.concurrent.ExecutionException;

// Referenced classes of package com.google.common.cache:
//            Cache

public interface LoadingCache
    extends Function, Cache
{

    public abstract Object get(Object obj)
        throws ExecutionException;
}
