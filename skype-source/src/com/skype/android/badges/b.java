// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.badges;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package com.skype.android.badges:
//            a, BadgeNotification

final class b extends a
    implements BadgeNotification
{

    private String d;

    public b(Application application)
    {
        super(application);
        d = (new ComponentName(application.getPackageName(), c)).flattenToShortString();
    }

    public final void a(int i)
    {
        Intent intent = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent.putExtra("packagename", b.getPackageName());
        intent.putExtra("count", i);
        b.sendBroadcast(intent);
        intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", d);
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        b.sendBroadcast(intent);
    }
}
