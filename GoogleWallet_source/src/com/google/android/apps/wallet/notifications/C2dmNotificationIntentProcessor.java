// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.notifications;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.config.appcontrol.AppControl;
import com.google.android.apps.wallet.config.appcontrol.AppControlKey;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.notifications:
//            NotificationClient, NotificationPersistenceManager, NotificationProcessor

public class C2dmNotificationIntentProcessor
{

    private static final String TAG = com/google/android/apps/wallet/notifications/C2dmNotificationIntentProcessor.getSimpleName();
    private final AppControl appControl;
    private final NotificationClient notificationClient;
    private final NotificationPersistenceManager notificationPersistenceManager;
    private final NotificationProcessor notificationProcessor;
    private final UserEventLogger userEventLogger;

    C2dmNotificationIntentProcessor(NotificationClient notificationclient, NotificationProcessor notificationprocessor, AppControl appcontrol, UserEventLogger usereventlogger, NotificationPersistenceManager notificationpersistencemanager)
    {
        notificationClient = notificationclient;
        notificationProcessor = notificationprocessor;
        appControl = appcontrol;
        userEventLogger = usereventlogger;
        notificationPersistenceManager = notificationpersistencemanager;
    }

    private com.google.wallet.proto.api.NanoWalletNotification.ClientNotification[] fetchNotificationProto(String s, String as[])
    {
        int i = 0;
        long l = appControl.getLong(AppControlKey.NOTIFICATION_FETCH_RETRIES);
        i = (int)l;
_L4:
        int j = 0;
_L2:
        if (j >= i + 1)
        {
            break; /* Loop/switch isn't completed */
        }
        com.google.wallet.proto.api.NanoWalletNotification.ClientNotification aclientnotification[];
        aclientnotification = notificationClient.fetchNotification(s, as);
        if (aclientnotification.length == 0)
        {
            WLog.efmt(TAG, "missing notification proto for id = %s.", new Object[] {
                s
            });
            userEventLogger.log(50, 300);
        }
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        userEventLogger.log(50, 301);
        return aclientnotification;
        Object obj;
        obj;
        WLog.efmt(TAG, "failed to fetch notification proto for id = %s. Errors are: %s", new Object[] {
            s, obj
        });
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        userEventLogger.log(50, 302);
        return null;
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void process(Intent intent)
    {
        WLog.d(TAG, "C2dmNotificationIntentProcessor process()");
        intent = intent.getExtras().getString("data.msg");
        userEventLogger.log(50, 298);
        if (intent == null || intent.isEmpty())
        {
            WLog.e(TAG, "Missing notification id in c2dm message.");
            userEventLogger.log(50, 299);
        } else
        {
            Set set = notificationPersistenceManager.getNotificationIds();
            intent = fetchNotificationProto(intent, (String[])set.toArray(new String[set.size()]));
            if (intent != null)
            {
                ArrayList arraylist = new ArrayList();
                int j = intent.length;
                for (int i = 0; i < j; i++)
                {
                    com.google.wallet.proto.api.NanoWalletNotification.ClientNotification clientnotification = intent[i];
                    notificationProcessor.process(clientnotification);
                    arraylist.addAll(Arrays.asList(clientnotification.notificationId));
                }

                notificationPersistenceManager.addNotificationIds(arraylist);
                return;
            }
        }
    }

}
