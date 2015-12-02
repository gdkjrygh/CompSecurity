// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.d.a;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.common.d.a:
//            s

public interface u
    extends ExecutorService
{

    public abstract s b(Runnable runnable);

    public abstract s c(Callable callable);
}
