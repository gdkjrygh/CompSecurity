// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import java.util.TimerTask;

// Referenced classes of package kik.a.h:
//            m

public final class b extends TimerTask
{

    final m a;
    private TimerTask b;

    public final void run()
    {
        b.run();
    }

    public merTask(m m1, TimerTask timertask)
    {
        a = m1;
        super();
        b = timertask;
    }
}
