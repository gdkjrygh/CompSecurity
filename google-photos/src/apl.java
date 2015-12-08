// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;
import java.util.Map;

final class apl
    implements android.os.MessageQueue.IdleHandler
{

    private final Map a;
    private final ReferenceQueue b;

    public apl(Map map, ReferenceQueue referencequeue)
    {
        a = map;
        b = referencequeue;
    }

    public final boolean queueIdle()
    {
        apm apm1 = (apm)b.poll();
        if (apm1 != null)
        {
            a.remove(apm.a(apm1));
        }
        return true;
    }
}
