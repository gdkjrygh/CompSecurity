// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.api;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.protobuf.nano.MessageNano;

public class GeofencingNotificationServiceClient
{

    public GeofencingNotificationServiceClient()
    {
    }

    private static Intent createIntent(Context context, String s, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage, int i, boolean flag, boolean flag1, Uri uri, int j)
    {
        return InternalIntents.forAction(context, s).putExtra("geofenced_message", MessageNano.toByteArray(geofencedmessage)).putExtra("wob_instance_number", i).putExtra("can_buzz", flag).putExtra("should_vibrate", flag1).putExtra("ringtone_uri", uri.toString()).putExtra("notification_id", j);
    }

    public static Intent createShowFirstWobIntent(Context context, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage, boolean flag, boolean flag1, Uri uri, int i)
    {
        return createIntent(context, "com.google.android.apps.wallet.geofencing.notification.SHOW_FIRST", geofencedmessage, 0, flag, flag1, uri, i);
    }

    public static Intent createShowNextWobIntent(Context context, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage, int i, boolean flag, boolean flag1, Uri uri, int j)
    {
        return createIntent(context, "com.google.android.apps.wallet.geofencing.notification.SHOW_NEXT", geofencedmessage, Math.min(i + 1, geofencedmessage.wobInstanceData.length - 1), flag, flag1, uri, j);
    }

    public static Intent createShowPreviousWobIntent(Context context, com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage, int i, boolean flag, boolean flag1, Uri uri, int j)
    {
        return createIntent(context, "com.google.android.apps.wallet.geofencing.notification.SHOW_PREVIOUS", geofencedmessage, Math.max(i - 1, 0), flag, flag1, uri, j);
    }

    public static void startService(Context context, Intent intent)
    {
        context.startService(intent);
    }
}
