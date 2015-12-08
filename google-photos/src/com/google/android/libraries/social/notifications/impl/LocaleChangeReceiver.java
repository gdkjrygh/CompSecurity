// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.notifications.impl;

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;
import ez;
import nqu;
import nsr;
import ntn;
import olm;

public final class LocaleChangeReceiver extends ez
{

    private static final String a = ntn.a(com/google/android/libraries/social/notifications/impl/LocaleChangeReceiver);

    public LocaleChangeReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.LOCALE_CHANGED".equals(intent.getAction()))
        {
            ntn.a(a, "Device locale changed");
            intent = (nsr)olm.b(context, nsr);
            if (intent != null)
            {
                intent.a(nqu.f, nqu.d);
                intent = new Intent(context, com/google/android/libraries/social/notifications/service/GunsService);
                intent.setAction("com.google.android.libraries.social.notifications.impl.SYNC_REGISTRATION_STATUS");
                intent.putExtra("force_gcm_registration", false);
                intent.putExtra("force_clean_slate", true);
                a(context, intent);
            }
        }
    }

}
