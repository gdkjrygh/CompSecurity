// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.os.Process;

// Referenced classes of package com.tinder.utils:
//            e

final class t>
    implements Runnable
{

    final e a;

    public final void run()
    {
        Process.setThreadPriority(10);
        e.c(a).a();
    }

    (e e1)
    {
        a = e1;
        super();
    }
}
