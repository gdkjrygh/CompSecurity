// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.graphics.Bitmap;
import com.tinder.model.Match;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.managers:
//            ManagerNotifications

final class b
    implements b
{

    final String a;
    final tificationType b;
    final ManagerNotifications c;

    public final void a()
    {
        v.b("Failed loading match, not adding to cache but still firing notification.");
        c.a(a);
    }

    public final void a(Match match)
    {
        ManagerNotifications.a(c, a, b, match, null);
    }

    public final void a(Match match, Bitmap bitmap)
    {
        ManagerNotifications.a(c, a, b, match, bitmap);
    }

    tificationType(ManagerNotifications managernotifications, String s, tificationType tificationtype)
    {
        c = managernotifications;
        a = s;
        b = tificationtype;
        super();
    }
}
