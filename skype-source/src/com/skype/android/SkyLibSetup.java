// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.content.Context;
import android.content.res.Resources;
import com.skype.Setup;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.skylib.GISetup;
import com.skype.android.util.CpuFeatures;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class SkyLibSetup
    implements GISetup
{

    public static final int a;
    public static final int b;
    public static final int c;
    private static final Logger d = Logger.getLogger("SkyLibSetup");
    private boolean e;
    private EcsConfiguration f;

    public SkyLibSetup()
    {
        e = "qb-market".contains("beta");
    }

    public SkyLibSetup(EcsConfiguration ecsconfiguration)
    {
        e = "qb-market".contains("beta");
        f = ecsconfiguration;
    }

    private static String a(String s)
    {
        String as[] = s.split("/");
        StringBuilder stringbuilder = new StringBuilder();
        if (s.startsWith("*"))
        {
            stringbuilder.append("*");
        }
        stringbuilder.append("UI/Android/");
        stringbuilder.append(as[as.length - 1]);
        return stringbuilder.toString();
    }

    private static void a(Setup setup, String s, int i)
    {
        String s1 = a(s);
        if (setup.getInt(s1, 0) != 1)
        {
            b(setup, s, i);
            setup.setInt(s1, 1);
        }
    }

    private static void a(Setup setup, String s, String s1)
    {
        String s2 = a(s);
        if (setup.getInt(s2, 0) != 1)
        {
            setup.setStr(s, s1);
            setup.setInt(s2, 1);
        }
    }

    private static void b(Setup setup, String s, int i)
    {
        setup.setInt(s, i);
    }

    public final void a(Context context, Setup setup, com.skype.android.skylib.GISetup.Scope scope)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.skype.android.skylib.GISetup.Scope.values().length];
                try
                {
                    a[com.skype.android.skylib.GISetup.Scope.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.skype.android.skylib.GISetup.Scope.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[scope.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            d.info("apply account keys");
            if (f != null)
            {
                if (f.isLocalNodeOfflineEnabled())
                {
                    int i = f.getLocalNodeTempDisconnectTimeout();
                    int k = f.getLocalNodeReconnectBeforeTimeout();
                    int l = f.getLocalNodeReconnectTimeSlice();
                    d.info((new StringBuilder("TempDisconnectTimout: ")).append(i).append(" reconnectBeforeTimeout: ").append(k).append(" reconnectTimeSlice: ").append(l).toString());
                    b(setup, "Lib/SessionManager/TempDisconnectTimeout", i);
                    b(setup, "*Lib/Localnode/ReconnectBeforeTimeout", k);
                    b(setup, "*Lib/Localnode/ReconnectTimeslice", l);
                } else
                {
                    d.info("LocalNode is turned of by ECS");
                    setup.delete("Lib/SessionManager/TempDisconnectTimeout");
                    setup.delete("*Lib/Localnode/ReconnectBeforeTimeout");
                    setup.delete("*Lib/Localnode/ReconnectTimeslice");
                }
            } else
            {
                d.warning("No ecs configuration, normally shouldn't happen, localnode settings set to default");
            }
            if (setup.isDefined("Lib/MSNPCore/ProtocolToUse") && setup.getInt("Lib/MSNPCore/ProtocolToUse") == 23)
            {
                setup.delete("Lib/MSNPCore/ProtocolToUse");
            }
            a(setup, "Lib/Conversation/RecentlyLiveTimeout", 0);
            a(setup, "Lib/Chat/DisableActivityIndication", 0);
            a(setup, "Lib/Reachback/Enable", 1);
            a(setup, "Lib/Chat/ChatDBLimitKb", 16384);
            a(setup, "Lib/Conversation/InboxUpdateTimeout", 0);
            a(setup, "Lib/Conversation/IncomingAuthRequestInConv", 1);
            a(setup, "Lib/Call/SendToVM", 1);
            a(setup, "Lib/Chat/HistoryDays", 90);
            return;

        case 2: // '\002'
            d.info("apply global keys");
            a(setup, "*Lib/QualityMonitor/DisableAudioDeviceProbing", 1);
            a(setup, "*Lib/Logging/Rotation/RotateSize", 0x400000);
            a(setup, "*Lib/Logging/Rotation/DeleteOldLogs", 1);
            a(setup, "*Lib/Connection/StatsUpdatePeriod", 0x15180);
            a(setup, "Lib/SessionFilteringMode", 2);
            setup.setInt("*Lib/Call/MaxConfParticipants", 4);
            setup.setInt("*Lib/Call/MaxNrOfVideosVisibleInUI", 4);
            break;
        }
        if (e)
        {
            a(setup, "*Lib/MSNP/BetaTestGroup", 1);
        }
        a(setup, "*Lib/Contacts/ShowBots", 1);
        int j;
        if (CpuFeatures.a(com.skype.android.util.CpuFeatures.Feature.a))
        {
            j = 0;
        } else
        {
            j = 1;
        }
        a(setup, "*Lib/Video/Disable", j);
        a(setup, "*Lib/Contacts/ShowSCD", 1);
        a(setup, "*Lib/Contacts/EnableRoamFavourites", 1);
        a(setup, "*Lib/MSNP/ConnectEarly", 1);
        setup.delete("*Lib/Audio/DisableCodecs");
        setup.delete("*Lib/Call/SeamlessUpgradeCapable");
        a(setup, "*Lib/DbManager/StorageQuotaKb", 32768);
        a(setup, "*Lib/Conversation/EnableWiki", 1);
        a(setup, "*Lib/MSNP/PushTemplate", "AndroidSkypeChat2");
        a(setup, "*Lib/OperationModeSwitch/Timeout", 1);
        a(setup, "*Lib/MSNP/RampUpAllowed", 1);
        scope = a("*Lib/MSNP/UseMSNP24");
        if (setup.getInt(scope, 0) != 1)
        {
            setup.delete("*Lib/MSNP/UseMSNP24");
            setup.setInt(scope, 1);
        }
        a(setup, "*Lib/MediaMessaging/StorageTransformEnabled", 1);
        a(setup, "*Lib/MediaMessaging/DistributionTransformEnabled", 0);
        a(setup, "*Lib/PushNotifications/AutoUnsubscribeOnShutdown", 0);
        if (context.getResources().getBoolean(0x7f0d0003))
        {
            a(setup, "*Lib/MSNP/IsMobile", 0);
        } else
        {
            a(setup, "*Lib/MSNP/IsMobile", 1);
        }
        a(setup, "*Lib/EAS/NotificationType", "Ping");
    }

    static 
    {
        a = (int)TimeUnit.HOURS.toSeconds(8L);
        b = (int)TimeUnit.MINUTES.toSeconds(1L);
        c = (int)TimeUnit.MINUTES.toSeconds(3L);
    }
}
