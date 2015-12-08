// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.concurrency;

import java.util.concurrent.Callable;

// Referenced classes of package io.fabric.sdk.android.services.concurrency:
//            PriorityTask

public abstract class PriorityCallable extends PriorityTask
    implements Callable
{

    public PriorityCallable()
    {
    }
}
