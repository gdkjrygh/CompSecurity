// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.libraries.social.notifications.impl.gcm.receiver.GcmReceiveMessageService;
import com.google.android.libraries.social.notifications.impl.gcm.receiver.GcmReceiver;

public final class nso
    implements nsn
{

    public nso()
    {
    }

    public final boolean a(Context context, Intent intent)
    {
        if (!TextUtils.isEmpty(intent.getStringExtra("ht")))
        {
            GcmReceiver.a(context, (new Intent(context, com/google/android/libraries/social/notifications/impl/gcm/receiver/GcmReceiveMessageService)).putExtras(intent.getExtras()));
            return true;
        } else
        {
            return false;
        }
    }
}
