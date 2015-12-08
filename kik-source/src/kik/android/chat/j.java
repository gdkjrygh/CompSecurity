// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import android.os.Process;
import java.util.TimerTask;

// Referenced classes of package kik.android.chat:
//            KikApplication

final class j extends TimerTask
{

    final KikApplication a;

    j(KikApplication kikapplication)
    {
        a = kikapplication;
        super();
    }

    public final void run()
    {
        Process.killProcess(Process.myPid());
    }
}
