// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.android.apps.wallet.sound.SoundRegistry;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.common.base.Strings;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            LegacyNotificationProtoManager

public class LegacyNotificationProcessor
{

    private static final String TAG = com/google/android/apps/wallet/notifications/LegacyNotificationProcessor.getSimpleName();
    protected final AnalyticsUtil analyticsUtil;
    protected final Context context;
    private final Provider notificationBuilderProvider;
    protected final NotificationManager notificationManager;
    private int notificationMessageId;
    private final LegacyNotificationProtoManager notificationProtoManager;
    private boolean showSecondaryCallsToActionForDigest;
    private Integer soundType;
    private final UserSettingsPublisher userSettingsPublisher;

    public LegacyNotificationProcessor(Application application, NotificationManager notificationmanager, LegacyNotificationProtoManager legacynotificationprotomanager, UserSettingsPublisher usersettingspublisher, AnalyticsUtil analyticsutil, Provider provider)
    {
        showSecondaryCallsToActionForDigest = true;
        context = application;
        notificationManager = notificationmanager;
        userSettingsPublisher = usersettingspublisher;
        notificationProtoManager = legacynotificationprotomanager;
        analyticsUtil = analyticsutil;
        notificationBuilderProvider = provider;
    }

    private int getRingerMode()
    {
        return ((AudioManager)context.getSystemService("audio")).getRingerMode();
    }

    public final boolean canBuzzUser()
    {
        int i = getRingerMode();
        return i == 2 || i == 1 && shouldVibrate();
    }

    public void cancelNotification()
    {
        notificationManager.cancel(getNotificationMessageId());
    }

    protected int getNotificationMessageId()
    {
        return notificationMessageId;
    }

    protected final Uri getRingtoneUri()
    {
        Object obj;
        obj = Protos.valueWithDefault(userSettingsPublisher.getCachedSettings().ringtoneLocation, "content://settings/wallet/notification_sound");
        if (Strings.isNullOrEmpty(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if ("content://settings/wallet/notification_sound".equals(obj))
        {
            return getWalletSoundUri();
        }
        obj = Uri.parse(((String) (obj)));
        return ((Uri) (obj));
        RpcException rpcexception;
        rpcexception;
        return null;
    }

    protected Uri getWalletSoundUri()
    {
        return SoundRegistry.getSoundWithDefault(context, soundType, 1);
    }

    protected final boolean shouldVibrate()
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = flag1;
        Protos.valueWithDefault(userSettingsPublisher.getCachedSettings().vibrationCondition, 1);
        JVM INSTR tableswitch 1 3: default 67
    //                   1 69
    //                   2 48
    //                   3 71;
           goto _L1 _L2 _L3 _L4
_L3:
        int i = getRingerMode();
        flag = flag1;
        if (i != 1)
        {
            return false;
        }
          goto _L2
        RpcException rpcexception;
        rpcexception;
_L1:
        flag = false;
_L2:
        return flag;
_L4:
        return false;
    }

}
