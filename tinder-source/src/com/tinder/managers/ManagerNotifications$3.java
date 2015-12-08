// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.model.Match;

// Referenced classes of package com.tinder.managers:
//            ManagerNotifications

final class c
    implements Runnable
{

    final String a;
    final tificationType b;
    final Match c;
    final ManagerNotifications d;

    public final void run()
    {
        d.b(a, b, c.getName());
    }

    tificationType(ManagerNotifications managernotifications, String s, tificationType tificationtype, Match match)
    {
        d = managernotifications;
        a = s;
        b = tificationtype;
        c = match;
        super();
    }
}
