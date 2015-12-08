// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.badges;

import android.app.Application;
import android.content.Intent;

// Referenced classes of package com.skype.android.badges:
//            a, BadgeNotification

final class e extends a
    implements BadgeNotification
{

    public e(Application application)
    {
        super(application);
    }

    public final void a(int i)
    {
        Intent intent = new Intent();
        intent.setAction("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", c);
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", true);
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.format("%s", new Object[] {
            Integer.valueOf(i)
        }));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", b.getPackageName());
        b.sendBroadcast(intent);
    }
}
