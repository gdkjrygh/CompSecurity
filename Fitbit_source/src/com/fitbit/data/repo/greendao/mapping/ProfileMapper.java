// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import android.text.TextUtils;
import com.fitbit.data.bl.ft;
import com.fitbit.data.domain.DietPlan;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.repo.greendao.DaoSession;
import com.fitbit.data.repo.greendao.Device;
import com.fitbit.data.repo.greendao.DietPlanDao;
import com.fitbit.data.repo.greendao.social.Badge;
import com.fitbit.data.repo.greendao.social.BadgeDao;
import com.fitbit.util.w;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, DietPlanMapper, DeviceMapper, BadgeMapper, 
//            MappingUtils

public class ProfileMapper
    implements EntityMapper
{

    private final BadgeDao badgeDao;
    private final BadgeMapper badgeMapper = new BadgeMapper();
    private final DeviceMapper deviceMapper;
    private final DietPlanDao dietPlanDao;
    private final DietPlanMapper dietPlanMapper = new DietPlanMapper();

    public ProfileMapper(DaoSession daosession, BadgeDao badgedao)
    {
        dietPlanDao = daosession.getDietPlanDao();
        badgeDao = badgedao;
        deviceMapper = new DeviceMapper(daosession);
    }

    private boolean isNullOrEmpty(String s)
    {
        return s == null || s.length() == 0;
    }

    public Profile fromDbEntity(com.fitbit.data.repo.greendao.Profile profile)
    {
        if (profile == null)
        {
            return null;
        }
        Profile profile1 = new Profile();
        profile1.f(profile.getEncodedId());
        profile1.a(profile.getDateOfBirth());
        profile1.a(dietPlanMapper.fromDbEntity(profile.getDietPlan()));
        profile1.setEntityId(profile.getId());
        profile1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(profile.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
        profile1.e(profile.getFullName());
        profile1.a((Gender)w.a(profile.getGender(), com/fitbit/data/domain/Gender));
        profile1.c(new Length(profile.getHeight().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.MM));
        profile1.h(profile.getNickname());
        profile1.a(profile.getOauthToken(), profile.getOauthSecret());
        profile1.g(profile.getProfilePhotoLink());
        profile1.setServerId(profile.getServerId().longValue());
        profile1.a(new Length(profile.getStrideLengthRunning().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.CM));
        profile1.b(new Length(profile.getStrideLengthWalking().doubleValue(), com.fitbit.data.domain.Length.LengthUnits.CM));
        profile1.setTimeCreated(profile.getTimeCreated());
        profile1.setTimeUpdated(profile.getTimeUpdated());
        if (!TextUtils.isEmpty(profile.getTimeZone()) && !TextUtils.isEmpty(profile.getTimeZoneOffset()))
        {
            profile1.a(ft.a().a(profile.getTimeZone()));
        }
        Object obj;
        if (profile.getUuid() != null)
        {
            obj = MappingUtils.uuidFromString(profile.getUuid());
        } else
        {
            obj = null;
        }
        profile1.setUuid(((java.util.UUID) (obj)));
        profile1.b(profile.getTrainerEnabled().booleanValue());
        profile1.a((com.fitbit.data.domain.Length.LengthUnits)w.a(profile.getDistanceUnit(), com/fitbit/data/domain/Length$LengthUnits));
        if (!isNullOrEmpty(profile.getHeightUnit()))
        {
            obj = (com.fitbit.data.domain.Length.LengthUnits)w.a(profile.getHeightUnit(), com/fitbit/data/domain/Length$LengthUnits);
        } else
        {
            obj = null;
        }
        profile1.b(((com.fitbit.data.domain.Length.LengthUnits) (obj)));
        if (!isNullOrEmpty(profile.getWeightUnit()))
        {
            obj = (com.fitbit.data.domain.WeightLogEntry.WeightUnits)w.a(profile.getWeightUnit(), com/fitbit/data/domain/WeightLogEntry$WeightUnits);
        } else
        {
            obj = null;
        }
        profile1.a(((com.fitbit.data.domain.WeightLogEntry.WeightUnits) (obj)));
        if (!isNullOrEmpty(profile.getWaterUnit()))
        {
            obj = (com.fitbit.data.domain.WaterLogEntry.WaterUnits)w.a(profile.getWaterUnit(), com/fitbit/data/domain/WaterLogEntry$WaterUnits);
        } else
        {
            obj = null;
        }
        profile1.a(((com.fitbit.data.domain.WaterLogEntry.WaterUnits) (obj)));
        profile1.b(profile.getFoodLocale());
        profile1.a(profile.getHideMeFromLeaderboard().booleanValue());
        profile1.j(profile.getCountry());
        profile1.a(profile.getLanguageLocale());
        profile1.c(profile.getState());
        profile1.d(profile.getCity());
        profile1.d(profile.getChallengesBeta().booleanValue());
        profile1.e(profile.getCustomHeartRateZoneEnabled().booleanValue());
        profile1.a(profile.getCustomHeartRateZoneMin().intValue());
        profile1.b(profile.getCustomHeartRateZoneMax().intValue());
        profile.resetDeviceList();
        obj = new ArrayList();
        Device device;
        for (profile = profile.getDeviceList().iterator(); profile.hasNext(); ((List) (obj)).add(deviceMapper.fromDbEntityWithProfile(device, profile1)))
        {
            device = (Device)profile.next();
        }

        profile1.a(((List) (obj)));
        profile = new ArrayList();
        Badge badge;
        for (Iterator iterator = badgeDao.queryBuilder().where(com.fitbit.data.repo.greendao.social.BadgeDao.Properties.UserId.eq(Long.valueOf(profile1.I())), new WhereCondition[0]).list().iterator(); iterator.hasNext(); profile.add(badgeMapper.fromDbEntity(badge)))
        {
            badge = (Badge)iterator.next();
        }

        profile1.b(profile);
        return profile1;
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((com.fitbit.data.repo.greendao.Profile)obj);
    }

    public com.fitbit.data.repo.greendao.Profile toDbEntity(Profile profile)
    {
        return toDbEntity(profile, new com.fitbit.data.repo.greendao.Profile());
    }

    public com.fitbit.data.repo.greendao.Profile toDbEntity(Profile profile, com.fitbit.data.repo.greendao.Profile profile1)
    {
        double d1 = 0.0D;
        if (profile == null)
        {
            return null;
        }
        com.fitbit.data.repo.greendao.Profile profile2 = profile1;
        if (profile1 == null)
        {
            profile2 = new com.fitbit.data.repo.greendao.Profile();
        }
        if (profile2.getId() == null)
        {
            profile2.setId(profile.getEntityId());
        }
        profile2.setEncodedId(profile.F());
        profile2.setDateOfBirth(profile.j());
        double d;
        com.fitbit.data.domain.TimeZone timezone;
        if (profile.a() != null)
        {
            MappingUtils.assertEntityHasId(profile.a());
            profile2.setDietPlan((com.fitbit.data.repo.greendao.DietPlan)dietPlanDao.load(profile.a().getEntityId()));
        } else
        {
            profile2.setDietPlan(null);
            profile2.setDietPlanId(null);
        }
        profile2.setEntityStatus(Integer.valueOf(profile.getEntityStatus().getCode()));
        profile2.setFullName(profile.E());
        if (profile.J() != null)
        {
            profile1 = profile.J();
        } else
        {
            profile1 = Gender.NA;
        }
        profile2.setGender(profile1.getSerializableName());
        if (profile.Q() != null)
        {
            d = profile.Q().a(com.fitbit.data.domain.Length.LengthUnits.MM).b();
        } else
        {
            d = 0.0D;
        }
        profile2.setHeight(Double.valueOf(d));
        profile2.setNickname(profile.K());
        profile2.setOauthSecret(profile.r());
        profile2.setOauthToken(profile.l());
        profile2.setProfilePhotoLink(profile.G());
        profile2.setServerId(Long.valueOf(profile.getServerId()));
        if (profile.e() != null)
        {
            d = profile.e().a(com.fitbit.data.domain.Length.LengthUnits.CM).b();
        } else
        {
            d = 0.0D;
        }
        profile2.setStrideLengthRunning(Double.valueOf(d));
        d = d1;
        if (profile.f() != null)
        {
            d = profile.f().a(com.fitbit.data.domain.Length.LengthUnits.CM).b();
        }
        profile2.setStrideLengthWalking(Double.valueOf(d));
        if (profile.getTimeCreated() != null)
        {
            profile1 = profile.getTimeCreated();
        } else
        {
            profile1 = new Date(0L);
        }
        profile2.setTimeCreated(profile1);
        if (profile.getTimeUpdated() != null)
        {
            profile1 = profile.getTimeUpdated();
        } else
        {
            profile1 = new Date(0L);
        }
        profile2.setTimeUpdated(profile1);
        profile2.setFoodLocale(profile.m());
        profile2.setLanguageLocale(profile.d());
        timezone = profile.L();
        profile1 = timezone;
        if (timezone == null)
        {
            profile1 = TimeZone.getDefault();
            profile1 = ft.a().a(profile1.getID());
        }
        if (profile1 != null)
        {
            profile2.setTimeZone(profile1.c());
            profile2.setTimeZoneOffset(Long.toString(profile1.b()));
        }
        if (profile.getUuid() != null)
        {
            profile1 = MappingUtils.uuidToString(profile.getUuid());
        } else
        {
            profile1 = null;
        }
        profile2.setUuid(profile1);
        profile2.setFoodBudgetEnabled(Boolean.valueOf(profile.p()));
        profile2.setLastTrackerUpdateTime(profile.q());
        profile2.setTrainerEnabled(Boolean.valueOf(profile.g()));
        if (profile.t() != null)
        {
            profile1 = profile.t();
        } else
        {
            profile1 = com.fitbit.data.domain.Length.LengthUnits.KM;
        }
        profile2.setDistanceUnit(profile1.getSerializableName());
        if (profile.v() != null)
        {
            profile1 = profile.v();
        } else
        {
            profile1 = com.fitbit.data.domain.Length.LengthUnits.CM;
        }
        profile2.setHeightUnit(profile1.getSerializableName());
        if (profile.w() != null)
        {
            profile1 = profile.w();
        } else
        {
            profile1 = com.fitbit.data.domain.WeightLogEntry.WeightUnits.KG;
        }
        profile2.setWeightUnit(profile1.getSerializableName());
        if (profile.x() != null)
        {
            profile1 = profile.x();
        } else
        {
            profile1 = com.fitbit.data.domain.WaterLogEntry.WaterUnits.ML;
        }
        profile2.setWaterUnit(profile1.getSerializableName());
        profile2.setHideMeFromLeaderboard(Boolean.valueOf(profile.c()));
        profile2.setCountry(profile.O());
        profile2.setState(profile.n());
        profile2.setCity(profile.o());
        profile2.setChallengesBeta(Boolean.valueOf(profile.y()));
        profile2.setCustomHeartRateZoneEnabled(Boolean.valueOf(profile.C()));
        profile2.setCustomHeartRateZoneMin(Integer.valueOf(profile.z()));
        profile2.setCustomHeartRateZoneMax(Integer.valueOf(profile.B()));
        return profile2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((Profile)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((Profile)obj, (com.fitbit.data.repo.greendao.Profile)obj1);
    }
}
