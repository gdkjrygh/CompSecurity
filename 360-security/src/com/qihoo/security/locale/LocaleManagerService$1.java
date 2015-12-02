// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.locale;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.locale:
//            LocaleManagerService

class a extends BroadcastReceiver
{

    final LocaleManagerService a;

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.LOCALE_CHANGED") && LocaleManagerService.a(a) != null)
        {
            LocaleManagerService.a(a).sendEmptyMessage(8);
        }
    }

    (LocaleManagerService localemanagerservice)
    {
        a = localemanagerservice;
        super();
    }
}
