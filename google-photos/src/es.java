// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

final class es extends ey
{

    private eq b;

    es(eq eq1)
    {
        b = eq1;
        super();
    }

    public final Object call()
    {
        eq.a(b).set(true);
        Process.setThreadPriority(10);
        return eq.a(b, b.a(a));
    }
}
