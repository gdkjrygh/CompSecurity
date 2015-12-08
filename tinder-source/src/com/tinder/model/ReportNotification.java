// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.text.TextUtils;
import java.util.List;

public class ReportNotification
{
    public static final class NotificationType extends Enum
    {

        private static final NotificationType $VALUES[];
        public static final NotificationType BANNED;
        public static final NotificationType WARNING;

        public static NotificationType valueOf(String s)
        {
            return (NotificationType)Enum.valueOf(com/tinder/model/ReportNotification$NotificationType, s);
        }

        public static NotificationType[] values()
        {
            return (NotificationType[])$VALUES.clone();
        }

        static 
        {
            WARNING = new NotificationType("WARNING", 0);
            BANNED = new NotificationType("BANNED", 1);
            $VALUES = (new NotificationType[] {
                WARNING, BANNED
            });
        }

        private NotificationType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String VALUE_NOTIFICATION_BANNED = "banned";
    private static final String VALUE_NOTIFICATION_WARNING = "warning";
    public List reasons;
    public int tier;
    public String type;

    public ReportNotification()
    {
    }

    public NotificationType getNotificationtype()
    {
        if (!TextUtils.isEmpty(type))
        {
            if (type.toLowerCase().equals("warning"))
            {
                return NotificationType.WARNING;
            }
            if (type.toLowerCase().equals("banned"))
            {
                return NotificationType.BANNED;
            }
        }
        return NotificationType.WARNING;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder("type:[")).append(type).append("]").toString());
        stringbuilder.append((new StringBuilder("tier:[")).append(tier).append("]").toString());
        stringbuilder.append((new StringBuilder("reasons[")).append(reasons).append("]").toString());
        return stringbuilder.toString();
    }
}
