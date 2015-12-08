// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.v;

import android.os.Process;

// Referenced classes of package p.v:
//            a

class Runnable extends Thread
{

    final Thread.run a;

    public void run()
    {
        Process.setThreadPriority(10);
        super.run();
    }

    String(String s, Runnable runnable, String s1)
    {
        a = s;
        super(runnable, s1);
    }
}
