// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import com.kik.g.i;
import com.kik.g.p;

// Referenced classes of package kik.android:
//            KikNotificationHandler, ab

final class aa extends i
{

    final KikNotificationHandler a;

    aa(KikNotificationHandler kiknotificationhandler)
    {
        a = kiknotificationhandler;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        synchronized (KikNotificationHandler.c(a))
        {
            if (KikNotificationHandler.d(a) == null)
            {
                obj1 = new p();
                ((p) (obj1)).a(new ab(this));
                KikNotificationHandler.a(a, ((p) (obj1)));
            }
        }
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }
}
