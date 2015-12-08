// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.c;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.roidapp.baselib.c:
//            m, c

final class e extends m
{

    final c a;

    e(c c1)
    {
        a = c1;
        super((byte)0);
    }

    public final Object call()
    {
        c.access$300(a).set(true);
        Process.setThreadPriority(10);
        return c.access$400(a, a.doInBackground(b));
    }
}
