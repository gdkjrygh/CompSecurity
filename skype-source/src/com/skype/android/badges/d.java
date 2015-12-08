// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.badges;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.lang.reflect.Field;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.badges:
//            a, BadgeNotification

final class d extends a
    implements BadgeNotification
{

    private String d;
    private Field e;
    private Object f;

    public d(Application application)
    {
        super(application);
        d = (new ComponentName(application.getPackageName(), c)).flattenToShortString();
        try
        {
            f = Class.forName("android.app.MiuiNotification").newInstance();
            e = f.getClass().getDeclaredField("messageCount");
            e.setAccessible(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            a.info((new StringBuilder("XiaomiBadgeNotification() XXX Exception: ")).append(application).toString());
        }
        e = null;
    }

    private boolean b(int i)
    {
        e.set(f, c(i));
        return true;
        Object obj;
        obj;
_L2:
        a.info((new StringBuilder("setBadgeCountByField() XXX Exception: ")).append(obj).toString());
        return false;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static String c(int i)
    {
        Object obj;
        if (i == 0)
        {
            obj = "";
        } else
        {
            obj = Integer.valueOf(i);
        }
        return String.valueOf(obj);
    }

    public final void a(int i)
    {
        boolean flag;
        if (e != null)
        {
            flag = b(i);
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", (new StringBuilder()).append(b.getPackageName()).append("/").append(b.getPackageManager().getLaunchIntentForPackage(b.getPackageName()).getComponent().getClassName()).toString());
            intent.putExtra("android.intent.extra.update_application_message_text", c(i));
            b.sendBroadcast(intent);
        }
    }
}
