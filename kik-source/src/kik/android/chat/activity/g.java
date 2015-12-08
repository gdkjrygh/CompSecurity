// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import java.util.TimerTask;

// Referenced classes of package kik.android.chat.activity:
//            IntroActivity

final class g extends TimerTask
{

    final IntroActivity a;

    g(IntroActivity introactivity)
    {
        a = introactivity;
        super();
    }

    public final void run()
    {
        throw new RuntimeException("Core teardown took more than five seconds.");
    }
}
