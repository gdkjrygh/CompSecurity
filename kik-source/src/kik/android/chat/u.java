// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat;

import kik.a.e.r;

// Referenced classes of package kik.android.chat:
//            t, KikApplication

final class u
    implements Runnable
{

    final t a;

    u(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        KikApplication.b(a.b).a(true, false);
    }
}
