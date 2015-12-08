// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.b;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class Notification extends Entity
    implements b
{
    public static final class NotificationType extends Enum
    {

        private static final NotificationType $VALUES[];
        public static final NotificationType BADGE;
        public static final NotificationType CHALLENGE_INVITE;
        public static final NotificationType CHALLENGE_MESSAGE;
        public static final NotificationType CHEER;
        public static final NotificationType CORPORATE;
        public static final NotificationType INVITE;
        public static final NotificationType MESSAGE;
        public static final NotificationType TAUNT;
        public static final NotificationType UNKNOWN;

        public static NotificationType valueOf(String s)
        {
            return (NotificationType)Enum.valueOf(com/fitbit/data/domain/Notification$NotificationType, s);
        }

        public static NotificationType[] values()
        {
            return (NotificationType[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new NotificationType("UNKNOWN", 0);
            MESSAGE = new NotificationType("MESSAGE", 1);
            CHEER = new NotificationType("CHEER", 2);
            TAUNT = new NotificationType("TAUNT", 3);
            INVITE = new NotificationType("INVITE", 4);
            CORPORATE = new NotificationType("CORPORATE", 5);
            CHALLENGE_INVITE = new NotificationType("CHALLENGE_INVITE", 6);
            CHALLENGE_MESSAGE = new NotificationType("CHALLENGE_MESSAGE", 7);
            BADGE = new NotificationType("BADGE", 8);
            $VALUES = (new NotificationType[] {
                UNKNOWN, MESSAGE, CHEER, TAUNT, INVITE, CORPORATE, CHALLENGE_INVITE, CHALLENGE_MESSAGE, BADGE
            });
        }

        private NotificationType(String s, int j)
        {
            super(s, j);
        }
    }

    private static final class a
    {

        private static final String a = "type";
        private static final String b = "id";
        private static final String c = "timestamp";
        private static final String d = "isRead";
        private static final String e = "message";
        private static final String f = "user";
        private static final String g = "avatar";
        private static final String h = "displayName";
        private static final String i = "encodedId";
        private static final String j = "programName";

        private a()
        {
        }
    }


    private boolean isRead;
    private String message;
    private NotificationType notificationType;
    private String programName;
    private long timestamp;
    private String userAvatar;
    private String userDisplayName;
    private String userEncodedId;

    public Notification()
    {
        notificationType = NotificationType.UNKNOWN;
    }

    public String a()
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[NotificationType.values().length];
                try
                {
                    a[NotificationType.MESSAGE.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[NotificationType.CORPORATE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[notificationType.ordinal()])
        {
        default:
            return d();

        case 1: // '\001'
        case 2: // '\002'
            return (new StringBuilder()).append(f()).append(": ").append(d()).toString();
        }
    }

    public void a(long l)
    {
        timestamp = l;
        setTimeCreated(new Date(timestamp * 1000L));
    }

    public void a(NotificationType notificationtype)
    {
        if (notificationtype == null)
        {
            notificationtype = NotificationType.UNKNOWN;
        }
        notificationType = notificationtype;
    }

    public void a(String s)
    {
        message = s;
    }

    public void a(boolean flag)
    {
        isRead = flag;
    }

    public NotificationType b()
    {
        return notificationType;
    }

    public void b(String s)
    {
        userAvatar = s;
    }

    public void c(String s)
    {
        userDisplayName = s;
    }

    public boolean c()
    {
        return isRead;
    }

    public String d()
    {
        return message;
    }

    public void d(String s)
    {
        userEncodedId = s;
    }

    public String e()
    {
        return userAvatar;
    }

    public void e(String s)
    {
        programName = s;
    }

    public String f()
    {
        return userDisplayName;
    }

    public String g()
    {
        return userEncodedId;
    }

    public long h()
    {
        return timestamp;
    }

    public String i()
    {
        return programName;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        try
        {
            a(NotificationType.valueOf(jsonobject.getString("type").toUpperCase()));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            a(NotificationType.UNKNOWN);
        }
        setServerId(jsonobject.getLong("id"));
        timestamp = jsonobject.getLong("timestamp");
        setTimeCreated(new Date(timestamp * 1000L));
        a(jsonobject.getBoolean("isRead"));
        a(jsonobject.optString("message", ""));
        e(jsonobject.optString("programName", ""));
        jsonobject = jsonobject.optJSONObject("user");
        if (jsonobject != null)
        {
            b(jsonobject.getString("avatar"));
            c(jsonobject.getString("displayName"));
            d(jsonobject.getString("encodedId"));
        }
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
