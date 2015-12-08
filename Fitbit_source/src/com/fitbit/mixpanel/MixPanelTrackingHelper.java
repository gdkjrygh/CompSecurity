// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.mixpanel;

import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.Notification;
import com.fitbit.e.a;
import com.fitbit.savedstate.d;
import com.fitbit.synclair.ui.controller.SynclairType;
import com.fitbit.synclair.ui.states.c.b;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.mixpanel:
//            f

public class MixPanelTrackingHelper
{
    public static final class FriendRequestProperties extends Enum
    {

        public static final FriendRequestProperties a;
        public static final FriendRequestProperties b;
        public static final FriendRequestProperties c;
        public static final FriendRequestProperties d;
        private static final FriendRequestProperties e[];
        public final String property;

        public static FriendRequestProperties valueOf(String s1)
        {
            return (FriendRequestProperties)Enum.valueOf(com/fitbit/mixpanel/MixPanelTrackingHelper$FriendRequestProperties, s1);
        }

        public static FriendRequestProperties[] values()
        {
            return (FriendRequestProperties[])e.clone();
        }

        static 
        {
            a = new FriendRequestProperties("PROFILE", 0, "Profile");
            b = new FriendRequestProperties("FACEBOOK", 1, "Facebook");
            c = new FriendRequestProperties("CONTACT_BOOK", 2, "ContactBook");
            d = new FriendRequestProperties("INVITE_BY_EMAIL", 3, "InviteByEmail");
            e = (new FriendRequestProperties[] {
                a, b, c, d
            });
        }

        private FriendRequestProperties(String s1, int i1, String s2)
        {
            super(s1, i1);
            property = s2;
        }
    }

    public static final class MixpanelPageGroup extends Enum
    {

        public static final MixpanelPageGroup a;
        public static final MixpanelPageGroup b;
        public static final MixpanelPageGroup c;
        private static final MixpanelPageGroup d[];

        public static MixpanelPageGroup valueOf(String s1)
        {
            return (MixpanelPageGroup)Enum.valueOf(com/fitbit/mixpanel/MixPanelTrackingHelper$MixpanelPageGroup, s1);
        }

        public static MixpanelPageGroup[] values()
        {
            return (MixpanelPageGroup[])d.clone();
        }

        static 
        {
            a = new MixpanelPageGroup("PAIR", 0);
            b = new MixpanelPageGroup("FIRMWARE", 1);
            c = new MixpanelPageGroup("FORCE_SYNC", 2);
            d = (new MixpanelPageGroup[] {
                a, b, c
            });
        }

        private MixpanelPageGroup(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class PairingStatus extends Enum
    {

        public static final PairingStatus a;
        public static final PairingStatus b;
        public static final PairingStatus c;
        private static final PairingStatus d[];
        private String description;

        public static PairingStatus valueOf(String s1)
        {
            return (PairingStatus)Enum.valueOf(com/fitbit/mixpanel/MixPanelTrackingHelper$PairingStatus, s1);
        }

        public static PairingStatus[] values()
        {
            return (PairingStatus[])d.clone();
        }

        public String a()
        {
            return description;
        }

        static 
        {
            a = new PairingStatus("CANCEL", 0, "CANCEL");
            b = new PairingStatus("SUCCESS", 1, "SUCCESS");
            c = new PairingStatus("INCOMPLETE", 2, "INCOMPLETE");
            d = (new PairingStatus[] {
                a, b, c
            });
        }

        private PairingStatus(String s1, int i1, String s2)
        {
            super(s1, i1);
            description = s2;
        }
    }


    public static final String a = "user_action";
    public static final String b = "show";
    public static final String c = "longPress";
    public static final String d = "!NOTIFICATION_TYPE";
    public static final String e = "friendReq";
    public static final String f = "cheer";
    public static final String g = "taunt";
    public static final String h = "messageSingle";
    public static final String i = "!TYPE";
    public static final String j = "sendCheer";
    public static final String k = "sendTaunt";
    public static final String l = "sendCustom";
    public static final String m = "!PAGEGROUP";
    public static final String n = "!DEVICE";
    public static final String o = "Paired Devices";
    public static final String p = "!CLIENTVERSION";
    public static final String q = "Profile";
    public static final String r = "RESPONSE";
    public static final String s = "Accepted";
    public static final String t = "Ignored";
    public static final String u = "Mobile Track";
    public static final String v = "Pairing: Last Result";
    private static final String w = "MixPanelTrackingHelper";

    public MixPanelTrackingHelper()
    {
    }

    public static String a(MixpanelPageGroup mixpanelpagegroup)
    {
        return mixpanelpagegroup.toString();
    }

    public static void a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("user_action", "show");
            jsonobject.put("!NOTIFICATION_TYPE", "friendReq");
            com.fitbit.mixpanel.f.a("Social: View Notifications", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.fitbit.e.a.f("MixPanelTrackingHelper", com.fitbit.e.a.a(jsonexception), new Object[0]);
        }
    }

    public static void a(com.fitbit.data.domain.Message.MessageType messagetype, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.Message.MessageType.values().length];
                try
                {
                    a[com.fitbit.data.domain.Message.MessageType.MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.Message.MessageType.CHEER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.Message.MessageType.TAUNT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.mixpanel._cls1.a[messagetype.ordinal()];
        JVM INSTR tableswitch 1 3: default 110
    //                   1 59
    //                   2 86
    //                   3 98;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_98;
_L5:
        jsonobject.put("!PAGEGROUP", s1);
        com.fitbit.mixpanel.f.a("Social: Friend Message - Sent", jsonobject);
        return;
_L2:
        try
        {
            jsonobject.put("!TYPE", "sendCustom");
        }
        // Misplaced declaration of an exception variable
        catch (com.fitbit.data.domain.Message.MessageType messagetype)
        {
            com.fitbit.e.a.f("MixPanelTrackingHelper", com.fitbit.e.a.a(messagetype), new Object[0]);
            return;
        }
          goto _L5
_L3:
        jsonobject.put("!TYPE", "sendCheer");
          goto _L5
        jsonobject.put("!TYPE", "sendTaunt");
          goto _L5
    }

    public static void a(FriendRequestProperties friendrequestproperties)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("!PAGEGROUP", friendrequestproperties.property);
        }
        // Misplaced declaration of an exception variable
        catch (FriendRequestProperties friendrequestproperties)
        {
            com.fitbit.e.a.f("MixPanelTrackingHelper", com.fitbit.e.a.a(friendrequestproperties), new Object[0]);
        }
        com.fitbit.mixpanel.f.a("Social: Friend Request - Sent", jsonobject);
    }

    public static void a(PairingStatus pairingstatus)
    {
        com.fitbit.mixpanel.f.a("Pairing: Last Result", pairingstatus.a());
    }

    public static void a(String s1)
    {
        if (s1 != null)
        {
            String s2 = s1.toUpperCase();
            JSONObject jsonobject = new JSONObject();
            try
            {
                jsonobject.put("!PAGEGROUP", a(com.fitbit.mixpanel.MixpanelPageGroup.a));
                jsonobject.put("!CLIENTVERSION", FitBitApplication.a().f().a());
                jsonobject.put("!DEVICE", s2);
            }
            catch (JSONException jsonexception)
            {
                com.fitbit.e.a.e("MixPanelTrackingHelper", jsonexception.getLocalizedMessage(), new Object[0]);
            }
            com.fitbit.mixpanel.f.a(String.format("FConnect: Choose %s", new Object[] {
                s1
            }), jsonobject);
        }
    }

    public static void a(String s1, Notification notification)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("user_action", s1);
        if (notification.b() != com.fitbit.data.domain.Notification.NotificationType.CHEER) goto _L2; else goto _L1
_L1:
        jsonobject.put("!NOTIFICATION_TYPE", "cheer");
_L5:
        com.fitbit.mixpanel.f.a("Social: View Notifications", jsonobject);
        return;
_L2:
        if (notification.b() != com.fitbit.data.domain.Notification.NotificationType.TAUNT) goto _L4; else goto _L3
_L3:
        jsonobject.put("!NOTIFICATION_TYPE", "taunt");
          goto _L5
        s1;
        com.fitbit.e.a.f("MixPanelTrackingHelper", com.fitbit.e.a.a(s1), new Object[0]);
        return;
_L4:
        if (notification.b() != com.fitbit.data.domain.Notification.NotificationType.MESSAGE) goto _L5; else goto _L6
_L6:
        jsonobject.put("!NOTIFICATION_TYPE", "messageSingle");
          goto _L5
    }

    public static void a(String s1, b b1, String s2, String s3)
    {
        com.fitbit.config.a a1;
        if (s1 == null)
        {
            return;
        }
        a1 = FitBitApplication.a().f();
        b1 = new JSONObject();
        b1.put("!CLIENTVERSION", a1.a());
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        b1.put("!DEVICE", s3.toUpperCase());
        if (!SynclairType.a.name().equalsIgnoreCase(s2)) goto _L2; else goto _L1
_L1:
        b1.put("!PAGEGROUP", a(com.fitbit.mixpanel.MixpanelPageGroup.a));
_L4:
        com.fitbit.mixpanel.f.a(s1, b1);
        return;
_L2:
        try
        {
            if (SynclairType.b.name().equalsIgnoreCase(s2))
            {
                b1.put("!PAGEGROUP", a(com.fitbit.mixpanel.MixpanelPageGroup.b));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s2) { }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(String s1, String s2)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("!PAGEGROUP", s1);
            jsonobject.put("RESPONSE", s2);
            com.fitbit.mixpanel.f.a("Social: Friend Request - Responded", jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.fitbit.e.a.f("MixPanelTrackingHelper", com.fitbit.e.a.a(s1), new Object[0]);
        }
    }

    public static void a(List list, int i1, long l1)
    {
        a(list, i1, l1, "General App Back Off");
    }

    private static void a(List list, int i1, long l1, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.accumulate("Back Off Type", s1);
        jsonobject.accumulate("Backed off user", com.fitbit.savedstate.d.h());
        jsonobject.accumulate(String.format("Galileo requests for last %d minute(s)", new Object[] {
            Long.valueOf(l1 / 60000L)
        }), Integer.valueOf(i1));
        i1 = list.size() - 1;
_L2:
        if (i1 <= -1)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject.accumulate(String.format("%d RBBO", new Object[] {
            Integer.valueOf(list.size() - i1)
        }), list.get(i1));
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            com.fitbit.mixpanel.f.a("App: Back Off", jsonobject);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            com.fitbit.e.a.e("MixPanelTrackingHelper", "Unable to accumulate event properties", list, new Object[0]);
        }
        return;
    }

    public static void b()
    {
        com.fitbit.mixpanel.f.c("App: App Open");
        com.fitbit.mixpanel.f.d("App: Lifetime Application Launches");
        com.fitbit.mixpanel.f.e("Launches");
    }

    public static void b(List list, int i1, long l1)
    {
        a(list, i1, l1, "Galileo App Back Off");
    }

    public static void c()
    {
        a("Mobile Track");
    }
}
