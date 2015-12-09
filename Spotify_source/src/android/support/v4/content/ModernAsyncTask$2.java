// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.os.Process;
import dj;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package android.support.v4.content:
//            ModernAsyncTask

final class a extends dj
{

    private ModernAsyncTask a;

    public final Object call()
    {
        ModernAsyncTask.a(a).set(true);
        Process.setThreadPriority(10);
        return ModernAsyncTask.a(a, a.a());
    }

    (ModernAsyncTask modernasynctask)
    {
        a = modernasynctask;
        super((byte)0);
    }
}
