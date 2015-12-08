// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

final class lsx
    implements lsy
{

    lsx(lpr lpr)
    {
    }

    public final ScheduledExecutorService a()
    {
        return Executors.newSingleThreadScheduledExecutor();
    }
}
