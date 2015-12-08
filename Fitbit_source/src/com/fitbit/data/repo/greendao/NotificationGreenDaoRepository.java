// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Notification;
import com.fitbit.data.repo.ai;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.greendao.mapping.NotificationMapper;
import com.fitbit.util.o;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AbstractEntityGreenDaoRepository, DaoSession, Notification

public class NotificationGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements ai
{

    private static final List messageTypes;

    public NotificationGreenDaoRepository()
    {
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new NotificationMapper();
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getNotificationDao();
    }

    public Notification getLastMessageByUser(String s)
    {
        QueryBuilder querybuilder = getEntityDao().queryBuilder();
        return (Notification)getMapper().fromDbEntity(querybuilder.where(NotificationDao.Properties.UserEncodedId.eq(s), new WhereCondition[] {
            NotificationDao.Properties.Type.in(messageTypes)
        }).orderDesc(new Property[] {
            NotificationDao.Properties.Timestamp
        }).limit(1).unique());
    }

    public List getMessages()
    {
        Calendar calendar = o.d();
        calendar.add(6, -30);
        long l = calendar.getTimeInMillis() / 1000L;
        return fromDbEntities(getEntityDao().queryBuilder().where(NotificationDao.Properties.Type.in(messageTypes), new WhereCondition[] {
            NotificationDao.Properties.Timestamp.ge(Long.valueOf(l))
        }).orderDesc(new Property[] {
            NotificationDao.Properties.Timestamp
        }).list());
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.Notification notification)
    {
        return notification.getId();
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.Notification)obj);
    }

    public List getUnread()
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(NotificationDao.Properties.IsRead.eq(Boolean.valueOf(false)), new WhereCondition[0]).list());
    }

    public boolean hasNew()
    {
        return getEntityDao().queryBuilder().where(NotificationDao.Properties.IsRead.eq(Boolean.valueOf(false)), new WhereCondition[0]).limit(1).list().size() > 0;
    }

    static 
    {
        messageTypes = Arrays.asList(new String[] {
            com.fitbit.data.domain.Notification.NotificationType.MESSAGE.name().toLowerCase(), com.fitbit.data.domain.Notification.NotificationType.CHEER.name().toLowerCase(), com.fitbit.data.domain.Notification.NotificationType.TAUNT.name().toLowerCase(), com.fitbit.data.domain.Notification.NotificationType.CORPORATE.name().toLowerCase()
        });
    }
}
