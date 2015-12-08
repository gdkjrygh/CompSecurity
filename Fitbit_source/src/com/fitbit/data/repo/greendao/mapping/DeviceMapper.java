// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao.mapping;

import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.AutoLap;
import com.fitbit.data.domain.device.BatteryLevel;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.data.domain.device.ExerciseOption;
import com.fitbit.data.domain.device.FirmwareUpdate;
import com.fitbit.data.domain.device.FirmwareVersion;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.device.TrackerSettings;
import com.fitbit.data.domain.device.a;
import com.fitbit.data.domain.device.c;
import com.fitbit.data.domain.device.d;
import com.fitbit.data.domain.device.f;
import com.fitbit.data.repo.greendao.Alarm;
import com.fitbit.data.repo.greendao.DaoSession;
import com.fitbit.data.repo.greendao.Device;
import com.fitbit.data.repo.greendao.TrackerSettingsDao;
import com.fitbit.util.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao.mapping:
//            EntityMapper, AlarmMapper, TrackerSettingsMapper, MappingUtils

public class DeviceMapper
    implements EntityMapper
{

    private static final String TAG = "DeviceMapper";
    private final AlarmMapper alarmMapper = new AlarmMapper();
    private final TrackerSettingsDao trackerSettingsDao;
    private final TrackerSettingsMapper trackerSettingsMapper = new TrackerSettingsMapper();

    public DeviceMapper(DaoSession daosession)
    {
        trackerSettingsDao = daosession.getTrackerSettingsDao();
    }

    private BatteryLevel getBatteryLevelById(Integer integer)
    {
        BatteryLevel abatterylevel[] = BatteryLevel.values();
        int j = abatterylevel.length;
        for (int i = 0; i < j; i++)
        {
            BatteryLevel batterylevel = abatterylevel[i];
            if (batterylevel.ordinal() == integer.intValue())
            {
                return batterylevel;
            }
        }

        return BatteryLevel.UNKNOWN;
    }

    private DeviceType getDeviceTypeById(Integer integer)
    {
        DeviceType adevicetype[] = DeviceType.values();
        int j = adevicetype.length;
        for (int i = 0; i < j; i++)
        {
            DeviceType devicetype = adevicetype[i];
            if (devicetype.ordinal() == integer.intValue())
            {
                return devicetype;
            }
        }

        return DeviceType.UNKNOWN;
    }

    private boolean sameLongs(Long long1, Long long2)
    {
        return long1 != null && long1.equals(long2);
    }

    public com.fitbit.data.domain.device.Device fromDbEntity(Device device)
    {
        return fromDbEntityWithProfile(device, an.a().b());
    }

    public volatile Object fromDbEntity(Object obj)
    {
        return fromDbEntity((Device)obj);
    }

    public com.fitbit.data.domain.device.Device fromDbEntityWithProfile(Device device, Profile profile)
    {
        boolean flag1 = false;
        if (device == null)
        {
            return null;
        }
        com.fitbit.data.domain.device.Device device1 = new com.fitbit.data.domain.device.Device();
        device1.a(getBatteryLevelById(device.getBatteryLevel()));
        device1.a(getDeviceTypeById(device.getType()));
        device1.c(device.getEncodedId());
        device1.d(device.getMac());
        device1.setEntityId(device.getId());
        device1.a(device.getLastSyncTime());
        device1.setServerId(device.getServerId().longValue());
        device1.a(DeviceVersion.parse(device.getVersion()));
        device1.e(device.getName());
        device1.setUuid(MappingUtils.uuidFromString(device.getUuid()));
        device1.setEntityStatus((com.fitbit.data.domain.Entity.EntityStatus)w.a(device.getEntityStatus().intValue(), com/fitbit/data/domain/Entity$EntityStatus));
        device1.setTimeUpdated(device.getTimeUpdated());
        device1.setTimeCreated(device.getTimeCreated());
        device1.b(device.getWireId());
        device1.a(device.getImageUrl());
        Object obj;
        Object obj1;
        if (device.getCurrentFirmwareAppVersion() != null && device.getCurrentFirmwareBslVersion() != null)
        {
            obj = new c(FirmwareVersion.a(device.getCurrentFirmwareAppVersion()), FirmwareVersion.a(device.getCurrentFirmwareBslVersion()));
        } else
        {
            obj = null;
        }
        if (device.getLatestFirmwareAppVersion() != null && device.getLatestFirmwareBslVersion() != null)
        {
            obj1 = new c(FirmwareVersion.a(device.getLatestFirmwareAppVersion()), FirmwareVersion.a(device.getLatestFirmwareBslVersion()));
        } else
        {
            obj1 = null;
        }
        device1.a(((c) (obj)));
        device1.b(((c) (obj1)));
        if (device.getPrimaryGoalsSupported() != null)
        {
            obj = device.getPrimaryGoalsSupported().split(",");
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            obj1 = new ArrayList(obj.length);
            int l1 = obj.length;
            for (int i = 0; i < l1; i++)
            {
                TrackerGoalType trackergoaltype = TrackerGoalType.safeRestoreFromString(obj[i]);
                if (trackergoaltype != TrackerGoalType.UNKNOWN)
                {
                    ((List) (obj1)).add(trackergoaltype);
                }
            }

            device1.b(((List) (obj1)));
        }
        String as[];
        String as1[];
        String as2[];
        if (device.getClockFacesUrlSupported() != null)
        {
            as1 = device.getClockFacesUrlSupported().split(",");
        } else
        {
            as1 = null;
        }
        if (device.getClockFacesNameSupported() != null)
        {
            as2 = device.getClockFacesNameSupported().split(",");
        } else
        {
            as2 = null;
        }
        if (device.getClockFacesDisplayNameSupported() != null)
        {
            as = device.getClockFacesDisplayNameSupported().split(",");
        } else
        {
            as = null;
        }
        if (as1 != null && as2 != null && as != null)
        {
            String as3[] = as;
            if (as.length == 0)
            {
                as3 = new String[as1.length];
                for (int j = 0; j < as1.length; j++)
                {
                    as3[j] = "";
                }

            }
            if (as1.length == as2.length && as2.length == as3.length)
            {
                as = new ArrayList(as1.length);
                for (int k = 0; k < as1.length; k++)
                {
                    as.add(new a(as1[k], as2[k], as3[k]));
                }

                device1.d(as);
            }
        }
        if (device.getExerciseOptionsIdSupported() != null)
        {
            as = device.getExerciseOptionsIdSupported().split(";");
        } else
        {
            as = null;
        }
        if (device.getExerciseOptionsNameSupported() != null)
        {
            as1 = device.getExerciseOptionsNameSupported().split(";");
        } else
        {
            as1 = null;
        }
        if (as != null && as1 != null && as.length == as1.length)
        {
            ArrayList arraylist = new ArrayList(as.length);
            for (int l = 0; l < as.length; l++)
            {
                arraylist.add(new ExerciseOption(as[l], as1[l]));
            }

            device1.c(arraylist);
        }
        if (device.getTapGestureOptionsNameSupported() != null)
        {
            as = device.getTapGestureOptionsNameSupported().split(",");
        } else
        {
            as = null;
        }
        if (device.getTapGestureOptionsDisplayNameSupported() != null)
        {
            as1 = device.getTapGestureOptionsDisplayNameSupported().split(",");
        } else
        {
            as1 = null;
        }
        if (as != null && as1 != null && as.length == as1.length)
        {
            ArrayList arraylist1 = new ArrayList(as.length);
            for (int i1 = 0; i1 < as.length; i1++)
            {
                arraylist1.add(new d(as[i1], as1[i1]));
            }

            device1.e(arraylist1);
        }
        if (device.getWatchCheckOptionsNameSupported() != null)
        {
            as = device.getWatchCheckOptionsNameSupported().split(",");
        } else
        {
            as = null;
        }
        if (device.getWatchCheckOptionsDisplayNameSupported() != null)
        {
            as1 = device.getWatchCheckOptionsDisplayNameSupported().split(",");
        } else
        {
            as1 = null;
        }
        if (as != null && as1 != null && as.length == as1.length)
        {
            ArrayList arraylist2 = new ArrayList(as.length);
            for (int j1 = 0; j1 < as.length; j1++)
            {
                arraylist2.add(new f(as[j1], as1[j1]));
            }

            device1.f(arraylist2);
        }
        if (device.getAutoLapNameOptions() != null)
        {
            as = device.getAutoLapNameOptions().split(",");
        } else
        {
            as = null;
        }
        if (device.getAutoLapValueOptions() != null)
        {
            as1 = device.getAutoLapValueOptions().split(",");
        } else
        {
            as1 = null;
        }
        if (device.getAutoLapTypeOptions() != null)
        {
            arraylist2 = device.getAutoLapTypeOptions().split(",");
        } else
        {
            arraylist2 = null;
        }
        if (as != null && as1 != null && arraylist2 != null && as.length == as1.length && as.length == arraylist2.length)
        {
            ArrayList arraylist3 = new ArrayList(as.length);
            for (int k1 = 0; k1 < as.length; k1++)
            {
                arraylist3.add(new AutoLap(as[k1], as1[k1], com.fitbit.data.domain.device.AutoLap.AutoLapType.valueOf(arraylist2[k1])));
            }

            device1.g(arraylist3);
        }
        as = trackerSettingsMapper.fromDbEntity(device.getTrackerSettings());
        if (as != null)
        {
            as.a();
        }
        device1.a(as);
        boolean flag;
        if (device.getEncrypted() != null)
        {
            flag = device.getEncrypted().booleanValue();
        } else
        {
            flag = true;
        }
        device1.a(flag);
        as = new ArrayList();
        if (device.getAlarmList() != null)
        {
            Alarm alarm;
            for (Iterator iterator = device.getAlarmList().iterator(); iterator.hasNext(); as.add(alarmMapper.fromDbEntity(alarm)))
            {
                alarm = (Alarm)iterator.next();
            }

        }
        if (profile != null && sameLongs(profile.getEntityId(), device.getProfileId()))
        {
            device1.a(profile);
        }
        device1.a(as);
        profile = new FirmwareUpdate();
        profile.a(device.getFwUpdateStatus());
        profile.c(device.getFwUpdateLang());
        profile.a(FirmwareVersion.a(device.getFwUpdateVersion()));
        profile.b(device.getFwUpdateVersionFull());
        if (device.getFwUpdateIsRequired() == null)
        {
            flag = false;
        } else
        {
            flag = device.getFwUpdateIsRequired().booleanValue();
        }
        profile.a(flag);
        if (device.getFwUpdateIsLang() == null)
        {
            flag = false;
        } else
        {
            flag = device.getFwUpdateIsLang().booleanValue();
        }
        profile.c(flag);
        if (device.getFwUpdateIsVersion() == null)
        {
            flag = flag1;
        } else
        {
            flag = device.getFwUpdateIsVersion().booleanValue();
        }
        profile.b(flag);
        device1.a(profile);
        return device1;
    }

    public Device toDbEntity(com.fitbit.data.domain.device.Device device)
    {
        return toDbEntity(device, new Device());
    }

    public Device toDbEntity(com.fitbit.data.domain.device.Device device, Device device1)
    {
        Object obj = null;
        if (device == null)
        {
            return null;
        }
        Device device2 = device1;
        if (device1 == null)
        {
            device2 = new Device();
        }
        if (device2.getId() == null)
        {
            device2.setId(device.getEntityId());
        }
        device2.setServerId(Long.valueOf(device.getServerId()));
        device2.setBatteryLevel(Integer.valueOf(device.f().ordinal()));
        device2.setLastSyncTime(device.e());
        device2.setType(Integer.valueOf(device.g().ordinal()));
        device2.setEncodedId(device.c());
        device2.setEntityStatus(Integer.valueOf(device.getEntityStatus().getCode()));
        device2.setMac(device.d());
        device2.setVersion(device.h().name());
        device2.setName(device.j());
        if (device.k() == null)
        {
            device1 = null;
        } else
        {
            device1 = device.k().getEntityId();
        }
        device2.setProfileId(device1);
        device2.setEncrypted(Boolean.valueOf(device.p()));
        device2.setWireId(device.b());
        device2.setImageUrl(device.a());
        if (device.m() != null)
        {
            device2.setCurrentFirmwareAppVersion(device.m().a().toString());
            device2.setCurrentFirmwareBslVersion(device.m().b().toString());
        }
        if (device.n() != null)
        {
            device2.setLatestFirmwareAppVersion(device.n().a().toString());
            device2.setLatestFirmwareBslVersion(device.n().b().toString());
        }
        device1 = device.q();
        if (device1 != null && !device1.isEmpty())
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(device1.get(0));
            for (int i = 1; i < device1.size(); i++)
            {
                stringbuilder.append(",");
                stringbuilder.append(device1.get(i));
            }

            device2.setPrimaryGoalsSupported(stringbuilder.toString());
        }
        device1 = device.s();
        if (device1 != null && !device1.isEmpty())
        {
            StringBuilder stringbuilder1 = new StringBuilder();
            StringBuilder stringbuilder6 = new StringBuilder();
            StringBuilder stringbuilder11 = new StringBuilder();
            a a1 = (a)device1.get(0);
            stringbuilder1.append(a1.a());
            stringbuilder6.append(a1.b());
            stringbuilder11.append(a1.c());
            for (int j = 1; j < device1.size(); j++)
            {
                a a2 = (a)device1.get(j);
                stringbuilder1.append(",");
                stringbuilder1.append(a2.a());
                stringbuilder6.append(",");
                stringbuilder6.append(a2.b());
                stringbuilder11.append(",");
                stringbuilder11.append(a2.c());
            }

            device2.setClockFacesUrlSupported(stringbuilder1.toString());
            device2.setClockFacesNameSupported(stringbuilder6.toString());
            device2.setClockFacesDisplayNameSupported(stringbuilder11.toString());
        }
        device1 = device.r();
        if (device1 != null && !device1.isEmpty())
        {
            StringBuilder stringbuilder2 = new StringBuilder();
            StringBuilder stringbuilder7 = new StringBuilder();
            ExerciseOption exerciseoption = (ExerciseOption)device1.get(0);
            stringbuilder2.append(exerciseoption.a());
            stringbuilder7.append(exerciseoption.b());
            for (int k = 1; k < device1.size(); k++)
            {
                ExerciseOption exerciseoption1 = (ExerciseOption)device1.get(k);
                stringbuilder2.append(";");
                stringbuilder2.append(exerciseoption1.a());
                stringbuilder7.append(";");
                stringbuilder7.append(exerciseoption1.b());
            }

            device2.setExerciseOptionsIdSupported(stringbuilder2.toString());
            device2.setExerciseOptionsNameSupported(stringbuilder7.toString());
        }
        device1 = device.t();
        if (device1 != null && !device1.isEmpty())
        {
            StringBuilder stringbuilder3 = new StringBuilder();
            StringBuilder stringbuilder8 = new StringBuilder();
            d d1 = (d)device1.get(0);
            stringbuilder3.append(d1.a());
            stringbuilder8.append(d1.b());
            for (int l = 1; l < device1.size(); l++)
            {
                d d2 = (d)device1.get(l);
                stringbuilder3.append(",");
                stringbuilder3.append(d2.a());
                stringbuilder8.append(",");
                stringbuilder8.append(d2.b());
            }

            device2.setTapGestureOptionsNameSupported(stringbuilder3.toString());
            device2.setTapGestureOptionsDisplayNameSupported(stringbuilder8.toString());
        }
        device1 = device.B();
        if (device1 != null && !device1.isEmpty())
        {
            StringBuilder stringbuilder4 = new StringBuilder();
            StringBuilder stringbuilder9 = new StringBuilder();
            f f1 = (f)device1.get(0);
            stringbuilder4.append(f1.a());
            stringbuilder9.append(f1.b());
            for (int i1 = 1; i1 < device1.size(); i1++)
            {
                f f2 = (f)device1.get(i1);
                stringbuilder4.append(",");
                stringbuilder4.append(f2.a());
                stringbuilder9.append(",");
                stringbuilder9.append(f2.b());
            }

            device2.setWatchCheckOptionsNameSupported(stringbuilder4.toString());
            device2.setWatchCheckOptionsDisplayNameSupported(stringbuilder9.toString());
        }
        device1 = device.C();
        if (device1 != null && !device1.isEmpty())
        {
            StringBuilder stringbuilder5 = new StringBuilder();
            StringBuilder stringbuilder10 = new StringBuilder();
            StringBuilder stringbuilder12 = new StringBuilder();
            AutoLap autolap = (AutoLap)device1.get(0);
            stringbuilder5.append(autolap.a());
            stringbuilder10.append(autolap.b());
            stringbuilder12.append(autolap.c().name());
            for (int j1 = 1; j1 < device1.size(); j1++)
            {
                AutoLap autolap1 = (AutoLap)device1.get(j1);
                stringbuilder5.append(",");
                stringbuilder5.append(autolap1.a());
                stringbuilder10.append(",");
                stringbuilder10.append(autolap1.b());
                stringbuilder12.append(",");
                stringbuilder12.append(autolap1.c().name());
            }

            device2.setAutoLapNameOptions(stringbuilder5.toString());
            device2.setAutoLapValueOptions(stringbuilder10.toString());
            device2.setAutoLapTypeOptions(stringbuilder12.toString());
        }
        device1 = device.o();
        if (device1 != null)
        {
            com.fitbit.data.repo.greendao.TrackerSettings trackersettings = (com.fitbit.data.repo.greendao.TrackerSettings)trackerSettingsDao.load(device1.getEntityId());
            trackerSettingsMapper.toDbEntity(device1, trackersettings);
            if (trackersettings != null)
            {
                device2.setTrackerSettings(trackersettings);
            } else
            {
                com.fitbit.e.a.a("DeviceMapper", "There is no TrackerSettingsDbEntity for device with id[%s]", new Object[] {
                    device.getEntityId()
                });
            }
        }
        device1 = device.v();
        if (device1 != null)
        {
            if (device1.a() == null)
            {
                device = null;
            } else
            {
                device = device1.a().name();
            }
            device2.setFwUpdateStatus(device);
            device2.setFwUpdateIsRequired(Boolean.valueOf(device1.b()));
            device2.setFwUpdateIsVersion(Boolean.valueOf(device1.c()));
            device2.setFwUpdateIsLang(Boolean.valueOf(device1.d()));
            device2.setFwUpdateLang(device1.f());
            if (device1.g() == null)
            {
                device = obj;
            } else
            {
                device = device1.g().toString();
            }
            device2.setFwUpdateVersion(device);
            device2.setFwUpdateVersionFull(device1.e());
        }
        return device2;
    }

    public volatile Object toDbEntity(Object obj)
    {
        return toDbEntity((com.fitbit.data.domain.device.Device)obj);
    }

    public volatile Object toDbEntity(Object obj, Object obj1)
    {
        return toDbEntity((com.fitbit.data.domain.device.Device)obj, (Device)obj1);
    }
}
