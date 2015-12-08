// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.HandlerThread;
import android.os.Process;

public final class jnn extends HandlerThread
{

    private final int a = -16;

    public jnn(String s, int i)
    {
        super(s);
    }

    public final void run()
    {
        Process.setThreadPriority(a);
        super.run();
    }
}
