// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.HandlerThread;
import android.os.Process;

public final class bed extends HandlerThread
{

    public bed(String s)
    {
        super(s);
    }

    public final void run()
    {
        Process.setThreadPriority(-16);
        super.run();
    }
}
