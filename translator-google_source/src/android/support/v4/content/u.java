// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v4.content:
//            z, ModernAsyncTask

final class u extends z
{

    final ModernAsyncTask a;

    u(ModernAsyncTask modernasynctask)
    {
        a = modernasynctask;
        super();
    }

    public final Object call()
    {
        ModernAsyncTask.a(a).set(true);
        Process.setThreadPriority(10);
        return ModernAsyncTask.a(a, a.a());
    }
}
