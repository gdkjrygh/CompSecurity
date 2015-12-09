// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.api;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.wallet.api:
//            InternalIntents

public final class Sound
{

    public static void playPaymentFailureSound(Context context)
    {
        sendNotificationPlaybackRequest(context, "paymentFailure");
    }

    public static void playPaymentSuccessSound(Context context)
    {
        sendNotificationPlaybackRequest(context, "paymentSuccess");
    }

    private static void sendNotificationPlaybackRequest(Context context, String s)
    {
        context.startService(InternalIntents.forAction(context, "com.google.android.apps.wallet.services.misc.SoundService.PLAY").putExtra("soundName", s));
    }
}
