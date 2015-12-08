// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.api;

import com.google.android.apps.wallet.location.api.LocationSettings;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.rpc.RpcException;
import com.google.android.apps.wallet.settings.UserSettingsPublisher;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.geofencing.api:
//            GeofencingServiceDebugInfo, GeofencingNotificationHandler

public class GeofencingNotificationHandlerManager
{

    private static final String TAG = com/google/android/apps/wallet/geofencing/api/GeofencingNotificationHandlerManager.getSimpleName();
    private final GeofencingServiceDebugInfo geofencingServiceDebugInfo;
    private final LocationSettings locationSettings;
    private final ImmutableMap mHandlers;
    private final UserSettingsPublisher userSettingsPublisher;

    public GeofencingNotificationHandlerManager(UserSettingsPublisher usersettingspublisher, GeofencingNotificationHandler geofencingnotificationhandler, LocationSettings locationsettings, GeofencingServiceDebugInfo geofencingservicedebuginfo)
    {
        userSettingsPublisher = usersettingspublisher;
        mHandlers = ImmutableMap.of(Integer.valueOf(1), geofencingnotificationhandler);
        locationSettings = locationsettings;
        geofencingServiceDebugInfo = geofencingservicedebuginfo;
    }

    private com.google.wallet.proto.api.NanoWalletSettings.Settings fetchNotificationSettings()
    {
        com.google.wallet.proto.api.NanoWalletSettings.Settings settings;
        try
        {
            settings = userSettingsPublisher.getCachedSettings();
        }
        catch (RpcException rpcexception)
        {
            WLog.e(TAG, "Error loading notification settings", rpcexception);
            geofencingServiceDebugInfo.logMessage("Error loading notification settings", rpcexception);
            return null;
        }
        if (settings == null)
        {
            WLog.e(TAG, "No notification settings");
            geofencingServiceDebugInfo.logMessage("No notification settings");
        }
        return settings;
    }

    public final GeofencingNotificationHandler getNotificationHandler(int i)
    {
        return (GeofencingNotificationHandler)mHandlers.get(Integer.valueOf(i));
    }

    public final boolean isEnabled()
    {
        if (!locationSettings.isSystemPreferencesLocationEnabled())
        {
            geofencingServiceDebugInfo.logMessage("Location setting is not enabled.");
        } else
        {
            com.google.wallet.proto.api.NanoWalletSettings.Settings settings = fetchNotificationSettings();
            if (settings != null)
            {
                for (com.google.common.collect.UnmodifiableIterator unmodifiableiterator = mHandlers.values().iterator(); unmodifiableiterator.hasNext();)
                {
                    if (((GeofencingNotificationHandler)unmodifiableiterator.next()).isEnabled(settings))
                    {
                        return true;
                    }
                }

                geofencingServiceDebugInfo.logMessage("None of the notification handler is enabled.");
                return false;
            }
        }
        return false;
    }

    public final void process(List list)
    {
        com.google.wallet.proto.api.NanoWalletSettings.Settings settings = fetchNotificationSettings();
        if (settings != null)
        {
            java.util.HashSet hashset = Sets.newHashSet();
            for (list = list.iterator(); list.hasNext();)
            {
                Object obj = (com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage)list.next();
                GeofencingNotificationHandler geofencingnotificationhandler = (GeofencingNotificationHandler)mHandlers.get(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage) (obj)).type);
                if (geofencingnotificationhandler != null)
                {
                    hashset.add(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage) (obj)).type);
                    if (geofencingnotificationhandler.isEnabled(settings))
                    {
                        geofencingnotificationhandler.process(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage) (obj)));
                    } else
                    {
                        obj = String.format("Notification of type: %s is disabled.", new Object[] {
                            ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage) (obj)).type
                        });
                        WLog.e(TAG, ((String) (obj)));
                        geofencingServiceDebugInfo.logMessage(((String) (obj)));
                    }
                } else
                {
                    obj = String.format("No handler for notification type: %s.", new Object[] {
                        ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage) (obj)).type
                    });
                    WLog.e(TAG, ((String) (obj)));
                    geofencingServiceDebugInfo.logMessage(((String) (obj)));
                }
            }

            list = mHandlers.entrySet().iterator();
            while (list.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)list.next();
                if (!hashset.contains(entry.getKey()))
                {
                    ((GeofencingNotificationHandler)entry.getValue()).cancelNotification();
                }
            }
        }
    }

}
