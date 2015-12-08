// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import java.util.TimerTask;

// Referenced classes of package kik.android:
//            s

final class u extends TimerTask
{

    final s.a a;

    u(s.a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        a.cancel(false);
        s.a(a.b, a);
    }
}
