// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;

import com.kik.g.i;
import kik.a.d.f;

// Referenced classes of package kik.android:
//            KikNotificationHandler

final class x extends i
{

    final KikNotificationHandler a;

    x(KikNotificationHandler kiknotificationhandler)
    {
        a = kiknotificationhandler;
        super();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (String)obj1;
        obj = KikNotificationHandler.a(a).a(((String) (obj)));
        if (obj != null)
        {
            a.a(((f) (obj)).n());
        }
    }
}
