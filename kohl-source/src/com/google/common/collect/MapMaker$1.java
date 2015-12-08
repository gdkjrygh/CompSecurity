// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.concurrent.Executor;

// Referenced classes of package com.google.common.collect:
//            MapMaker

static final class 
    implements Executor
{

    public void execute(Runnable runnable)
    {
        runnable.run();
    }

    ()
    {
    }
}
