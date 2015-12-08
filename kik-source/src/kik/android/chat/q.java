// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import com.kik.android.a;

// Referenced classes of package kik.android.chat:
//            p, KikApplication

final class q
    implements Runnable
{

    final p a;

    q(p p1)
    {
        a = p1;
        super();
    }

    public final void run()
    {
        a.a.b.a("App Session Started");
        long l = a.a.b.b("App Opened", "App Session Started");
        a.a.b.a("50% Launch Time", (float)l / 1000F, 0.5F);
        a.a.b.a("95% Launch Time", (float)l / 1000F, 0.95F);
    }
}
