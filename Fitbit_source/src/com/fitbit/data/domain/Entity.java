// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.os.Parcel;
import android.os.ParcelUuid;
import com.fitbit.serverinteraction.u;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.domain:
//            a

public abstract class Entity
    implements Serializable, Cloneable
{
    public static final class EntityStatus extends Enum
        implements a
    {

        private static final EntityStatus $VALUES[];
        public static final EntityStatus PENDING_DELETE;
        public static final EntityStatus PENDING_OPERATION;
        public static final EntityStatus SYNCED;
        private final int code;

        public static EntityStatus valueOf(int i)
        {
            EntityStatus aentitystatus[] = values();
            int k = aentitystatus.length;
            for (int j = 0; j < k; j++)
            {
                EntityStatus entitystatus = aentitystatus[j];
                if (entitystatus.getCode() == i)
                {
                    return entitystatus;
                }
            }

            throw new IllegalArgumentException();
        }

        public static EntityStatus valueOf(String s)
        {
            return (EntityStatus)Enum.valueOf(com/fitbit/data/domain/Entity$EntityStatus, s);
        }

        public static EntityStatus[] values()
        {
            return (EntityStatus[])$VALUES.clone();
        }

        public int getCode()
        {
            return code;
        }

        static 
        {
            SYNCED = new EntityStatus("SYNCED", 0, 0);
            PENDING_OPERATION = new EntityStatus("PENDING_OPERATION", 1, 1);
            PENDING_DELETE = new EntityStatus("PENDING_DELETE", 2, 2);
            $VALUES = (new EntityStatus[] {
                SYNCED, PENDING_OPERATION, PENDING_DELETE
            });
        }


        private EntityStatus(String s, int i, int j)
        {
            super(s, i);
            code = j;
        }
    }


    public static final int ID_UNKNOWN = -1;
    private Long id;
    private long serverId;
    private EntityStatus status;
    private u syncListener;
    private Date timeCreated;
    private Date timeUpdated;
    private UUID uuid;

    public Entity()
    {
        serverId = -1L;
        status = EntityStatus.PENDING_OPERATION;
    }

    protected static Date a(String s, Date date, Date date1)
    {
label0:
        {
            s = date1;
            if (date == null)
            {
                break label0;
            }
            s = date1;
            if (date1 == null)
            {
                break label0;
            }
            if (!date1.before(date))
            {
                s = date1;
                if (!date1.equals(date))
                {
                    break label0;
                }
            }
            s = o.a(date, 10, 14);
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("hackTimeUpdated, current: ");
            stringbuilder.append(e.c(date));
            stringbuilder.append("; got ");
            stringbuilder.append(e.c(date1));
            stringbuilder.append("; setting ");
            stringbuilder.append(e.c(s));
        }
        return s;
    }

    protected void A()
    {
        if (syncListener != null)
        {
            syncListener.g();
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return super.clone();
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj instanceof Entity)
                {
                    obj = (Entity)obj;
                    flag = flag1;
                    if (uuid != null)
                    {
                        return uuid.equals(((Entity) (obj)).uuid);
                    }
                }
            }
        }
        return flag;
    }

    public Long getEntityId()
    {
        return id;
    }

    public EntityStatus getEntityStatus()
    {
        return status;
    }

    public long getServerId()
    {
        return serverId;
    }

    public Date getTimeCreated()
    {
        return timeCreated;
    }

    public Date getTimeUpdated()
    {
        return timeUpdated;
    }

    public UUID getUuid()
    {
        return uuid;
    }

    public boolean isNew()
    {
        return id == null;
    }

    public void readEntityFromParcel(Parcel parcel)
    {
        long l = parcel.readLong();
        if (l != 0L)
        {
            setEntityId(Long.valueOf(l));
        }
        Object obj = (ParcelUuid)parcel.readParcelable(android/os/ParcelUuid.getClassLoader());
        long l1;
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = ((ParcelUuid) (obj)).getUuid();
        }
        setUuid(((UUID) (obj)));
        setServerId(parcel.readLong());
        l = parcel.readLong();
        l1 = parcel.readLong();
        if (l != 0L)
        {
            setTimeCreated(new Date(l));
        }
        if (l1 != 0L)
        {
            setTimeUpdated(new Date(l1));
        }
        setEntityStatus(EntityStatus.valueOf(parcel.readInt()));
    }

    public void setEntityId(Long long1)
    {
        id = long1;
    }

    public void setEntityStatus(EntityStatus entitystatus)
    {
        status = entitystatus;
    }

    public void setServerId(long l)
    {
        serverId = l;
    }

    public void setSyncListener(u u1)
    {
        syncListener = u1;
    }

    public void setTimeCreated(Date date)
    {
        timeCreated = date;
    }

    public void setTimeUpdated(Date date)
    {
        timeUpdated = a(getClass().getSimpleName(), timeUpdated, date);
    }

    public void setUuid(UUID uuid1)
    {
        uuid = uuid1;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("class: ");
        stringbuilder.append(getClass().getSimpleName());
        stringbuilder.append(" id: ");
        stringbuilder.append(getEntityId());
        stringbuilder.append("/");
        stringbuilder.append(getServerId());
        stringbuilder.append(" status: ");
        stringbuilder.append(getEntityStatus());
        return stringbuilder.toString();
    }

    public void writeEntityToParcel(Parcel parcel, int i)
    {
        long l1 = 0L;
        Object obj;
        long l;
        if (id == null)
        {
            l = 0L;
        } else
        {
            l = id.longValue();
        }
        parcel.writeLong(l);
        if (uuid == null)
        {
            obj = null;
        } else
        {
            obj = new ParcelUuid(uuid);
        }
        parcel.writeParcelable(((android.os.Parcelable) (obj)), 0);
        parcel.writeLong(serverId);
        if (timeCreated == null)
        {
            l = 0L;
        } else
        {
            l = timeCreated.getTime();
        }
        parcel.writeLong(l);
        if (timeUpdated == null)
        {
            l = l1;
        } else
        {
            l = timeUpdated.getTime();
        }
        parcel.writeLong(l);
        parcel.writeInt(status.code);
    }
}
