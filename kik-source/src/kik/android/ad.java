// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import com.kik.g.i;
import com.kik.g.p;

// Referenced classes of package kik.android:
//            KikNotificationHandler

final class ad extends i
{

    final KikNotificationHandler a;

    ad(KikNotificationHandler kiknotificationhandler)
    {
        a = kiknotificationhandler;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        if (KikNotificationHandler.d(a) != null)
        {
            KikNotificationHandler.d(a).a(Boolean.valueOf(true));
        }
    }
}
