// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market.loader;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cleanmaster.ui.app.market.loader:
//            h, AsyncTaskEx

final class c extends h
{

    final AsyncTaskEx a;

    c(AsyncTaskEx asynctaskex)
    {
        a = asynctaskex;
        super((byte)0);
    }

    public final Object call()
    {
        AsyncTaskEx.a(a).set(true);
        Process.setThreadPriority(10);
        return AsyncTaskEx.a(a, a.a(b));
    }
}
