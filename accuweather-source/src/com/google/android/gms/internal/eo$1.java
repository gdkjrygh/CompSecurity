// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Process;

// Referenced classes of package com.google.android.gms.internal:
//            eo

static final class sg
    implements Runnable
{

    final Runnable sg;

    public void run()
    {
        Process.setThreadPriority(10);
        sg.run();
    }

    (Runnable runnable)
    {
        sg = runnable;
        super();
    }
}
