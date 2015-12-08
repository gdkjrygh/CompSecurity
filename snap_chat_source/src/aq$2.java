// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

final class > extends >
{

    private aq a;

    public final Object call()
    {
        aq.a(a).set(true);
        Process.setThreadPriority(10);
        return aq.a(a, a.b());
    }

    >(aq aq1)
    {
        a = aq1;
        super((byte)0);
    }
}
