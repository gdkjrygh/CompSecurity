// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.badges;

import android.app.Application;
import android.content.Intent;

// Referenced classes of package com.skype.android.badges:
//            a, BadgeNotification

final class c extends a
    implements BadgeNotification
{

    public c(Application application)
    {
        super(application);
    }

    public final void a(int i)
    {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", b.getPackageName());
        intent.putExtra("badge_count_class_name", c);
        b.sendBroadcast(intent);
    }
}
