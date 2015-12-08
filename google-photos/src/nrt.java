// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;

public final class nrt
    implements nto
{

    private static final String a = ntn.a("SelectedIntentHandler");

    public nrt()
    {
    }

    public final Object a()
    {
        return "com.google.android.libraries.social.notifications.impl.NOTIFICATION_SELECTED";
    }

    public final void a(Intent intent, Context context)
    {
        int i = GunsService.a(intent);
        if (i == -1)
        {
            ntn.b(a, "Invalid account ID", new IllegalArgumentException());
            return;
        }
        String as[] = intent.getStringArrayExtra("notification_keys");
        nqq nqq1 = (nqq)intent.getSerializableExtra("notification_event_type");
        if (!intent.hasExtra("from_system_tray"))
        {
            ntn.b(a, "Extra not set: EXTRA_FROM_SYSTEM_TRAY", new IllegalArgumentException());
        }
        boolean flag = intent.getBooleanExtra("from_system_tray", true);
        intent = ntf.b(context, i, as);
        nrf nrf1;
        byte byte0;
        if (as.length == 1)
        {
            byte0 = 2;
        } else
        {
            byte0 = 4;
        }
        nrf1 = (nrf)olm.b(context, nrf);
        if (nrf1 != null)
        {
            nrg nrg1;
            if (flag)
            {
                nrg1 = nrg.a;
            } else
            {
                nrg1 = nrg.b;
            }
            nrf1.a(i, intent);
        }
        nry.a(context, i, as, byte0);
        nry.a(context, i, intent, nqq1);
    }

}
