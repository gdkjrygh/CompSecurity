// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import com.kik.g.r;

// Referenced classes of package kik.android:
//            aa, KikNotificationHandler

final class ab extends r
{

    final aa a;

    ab(aa aa1)
    {
        a = aa1;
        super();
    }

    public final void a()
    {
        synchronized (KikNotificationHandler.c(a.a))
        {
            KikNotificationHandler.a(a.a, null);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
