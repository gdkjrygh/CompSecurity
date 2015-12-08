// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.c;

import android.os.Process;

// Referenced classes of package com.bumptech.glide.load.b.c:
//            b

final class c extends Thread
{

    final b a;

    c(b b, Runnable runnable, String s)
    {
        a = b;
        super(runnable, s);
    }

    public final void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }
}
