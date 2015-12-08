// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class nri
    implements nto
{

    private static final String a = ntn.a("ActorsSelectedIntentHandler");

    public nri()
    {
    }

    public final Object a()
    {
        return "com.google.android.libraries.social.notifications.impl.ACTOR_SELECTED";
    }

    public final void a(Intent intent, Context context)
    {
        String as[] = intent.getStringArrayExtra("notification_keys");
        if (as.length == 1)
        {
            int i = intent.getIntExtra("account_id", -1);
            ntf.b(context, i, as);
            ntf.a(context, i, as[0]);
            olm.b(context, nrf);
            return;
        } else
        {
            ntn.b(a, "EXTRA_NOTIFICATION_KEYS array must have length = 1.", new Exception());
            return;
        }
    }

}
