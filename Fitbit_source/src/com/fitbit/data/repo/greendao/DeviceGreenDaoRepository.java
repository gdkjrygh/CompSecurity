// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.repo.greendao.mapping.DeviceMapper;
import com.fitbit.data.repo.greendao.mapping.EntityMapper;
import com.fitbit.data.repo.n;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.Query;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            AbstractEntityGreenDaoRepository, TrackerSettingsGreenDaoRepository, DaoSession, DeviceDao, 
//            Device

public class DeviceGreenDaoRepository extends AbstractEntityGreenDaoRepository
    implements n
{

    private TrackerSettingsGreenDaoRepository settingsRepo;

    public DeviceGreenDaoRepository()
    {
        settingsRepo = new TrackerSettingsGreenDaoRepository();
    }

    public volatile void add(Entity entity)
    {
        add((Device)entity);
    }

    public void add(Device device)
    {
        if (device.o() != null)
        {
            settingsRepo.add(device.o());
        }
        super.add(device);
    }

    public void addAll(List list)
    {
        if (list != null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = list.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Device device = (Device)iterator.next();
                if (device.o() != null)
                {
                    arraylist.add(device.o());
                }
            } while (true);
            settingsRepo.addAll(arraylist);
        }
        super.addAll(list);
    }

    protected EntityMapper createMapper(AbstractDaoSession abstractdaosession)
    {
        return new DeviceMapper((DaoSession)abstractdaosession);
    }

    public volatile void delete(Entity entity)
    {
        delete((Device)entity);
    }

    public void delete(Device device)
    {
        if (device.o() != null)
        {
            settingsRepo.delete(device.o());
        }
        super.delete(device);
    }

    public void deleteAll(Iterable iterable)
    {
        if (iterable != null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = iterable.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Device device = (Device)iterator.next();
                if (device.o() != null)
                {
                    arraylist.add(device.o());
                }
            } while (true);
            settingsRepo.deleteAll(arraylist);
        }
        super.deleteAll(iterable);
    }

    public Device getByEncodedId(String s)
    {
        s = getEntityDao().queryBuilder().where(DeviceDao.Properties.EncodedId.eq(s), new WhereCondition[0]).build();
        return (Device)getMapper().fromDbEntity(s.unique());
    }

    public List getByProfile(Profile profile)
    {
        return fromDbEntities(getEntityDao().queryBuilder().where(DeviceDao.Properties.ProfileId.eq(profile.getEntityId()), new WhereCondition[0]).build().list());
    }

    protected AbstractDao getDaoFrom(AbstractDaoSession abstractdaosession)
    {
        return ((DaoSession)abstractdaosession).getDeviceDao();
    }

    protected Long getPkFrom(com.fitbit.data.repo.greendao.Device device)
    {
        return ((DeviceDao)getEntityDao()).getKey(device);
    }

    protected volatile Long getPkFrom(Object obj)
    {
        return getPkFrom((com.fitbit.data.repo.greendao.Device)obj);
    }

    public volatile void save(Entity entity)
    {
        save((Device)entity);
    }

    public void save(Device device)
    {
        if (device.o() != null)
        {
            settingsRepo.save(device.o());
        }
        super.save(device);
    }

    public void saveAll(Iterable iterable)
    {
        if (iterable != null)
        {
            ArrayList arraylist = new ArrayList();
            Iterator iterator = iterable.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Device device = (Device)iterator.next();
                if (device.o() != null)
                {
                    arraylist.add(device.o());
                }
            } while (true);
            settingsRepo.saveAll(arraylist);
        }
        super.saveAll(iterable);
    }
}
