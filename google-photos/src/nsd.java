// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.notifications.service.GunsService;

public final class nsd
    implements nto
{

    public nsd()
    {
    }

    public final Object a()
    {
        return "com.google.android.libraries.social.notifications.impl.SYSTEM_NOTIFICATION_DISMISSED";
    }

    public final void a(Intent intent, Context context)
    {
        int i = GunsService.a(intent);
        if (i == -1)
        {
            return;
        } else
        {
            String as[] = intent.getStringArrayExtra("notification_keys");
            nqs anqs[] = ntf.b(context, i, as);
            nqq nqq1 = (nqq)intent.getSerializableExtra("notification_event_type");
            nry.a(context, i, as, intent.getStringExtra("view_id"));
            nry.a(context, i, anqs, nqq1);
            return;
        }
    }
}
