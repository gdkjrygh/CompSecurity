// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.domain.Notification;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper

public class NotificationMapper
    implements EntityMapper
{

    public NotificationMapper()
    {
    }

    public Notification fromDbEntity(com.fitbit.data.repo.greendao.Notification notification)
    {
        if (notification == null)
        {
            return null;
        }
        Notification notification1 = new Notification();
        notification1.setEntityId(notification.getId());
        notification1.setServerId(notification.getServerId().longValue());
        notification1.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.valueOf(notification.getEntityStatus().intValue()));
        try
        {
            notification1.a(com.fitbit.data.domain.Notification.NotificationType.valueOf(notification.getType().toUpperCase()));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            notification1.a(com.fitbit.data.domain.Notification.NotificationType.UNKNOWN);
        }
        notification1.a(notification.getIsRead().booleanValue());
        notification1.a(notification.getTimestamp().longValue());
        notification1.a(notification.getMessage());
        notification1.b(notification.getUserAvatar());
        notification1.c(notification.getUserDisplayName());
        notification1.d(notification.getUserEncodedId());
        notification1.e(notification.getProgramName());
        return notification1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.Notification)obj);
    }

    public com.fitbit.data.repo.greendao.Notification toDbEntity(Notification notification)
    {
        return toDbEntity(notification, ((com.fitbit.data.repo.greendao.Notification) (null)));
    }

    public com.fitbit.data.repo.greendao.Notification toDbEntity(Notification notification, com.fitbit.data.repo.greendao.Notification notification1)
    {
        if (notification == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.Notification notification2 = notification1;
        if (notification1 == null)
        {
            notification2 = new com.fitbit.data.repo.greendao.Notification();
        }
        if (notification2.getId() == null)
        {
            notification2.setId(notification.getEntityId());
        }
        notification2.setServerId(Long.valueOf(notification.getServerId()));
        notification2.setEntityStatus(Integer.valueOf(notification.getEntityStatus().getCode()));
        notification2.setType(notification.b().name().toLowerCase());
        notification2.setIsRead(Boolean.valueOf(notification.c()));
        notification2.setTimestamp(Long.valueOf(notification.h()));
        notification2.setMessage(notification.d());
        notification2.setUserAvatar(notification.e());
        notification2.setUserDisplayName(notification.f());
        notification2.setUserEncodedId(notification.g());
        notification2.setProgramName(notification.i());
        return notification2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((Notification)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((Notification)obj, (com.fitbit.data.repo.greendao.Notification)obj1);
    }
}
