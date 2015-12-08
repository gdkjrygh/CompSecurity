// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class oga
    implements oqy, oqz
{

    private final ScheduledExecutorService a = Executors.newSingleThreadScheduledExecutor();

    public oga()
    {
    }

    public final String a()
    {
        return oga.getCanonicalName();
    }

    public final boolean a(Context context)
    {
        context = context.getApplicationContext();
        (new ocf(5)).b(context);
        a.schedule(new ogb(this, context), 10L, TimeUnit.SECONDS);
        return true;
    }

    public final boolean b(Context context)
    {
        context = context.getApplicationContext();
        (new ocf(6)).b(context);
        a.schedule(new ogc(this, context), 10L, TimeUnit.SECONDS);
        return true;
    }
}
