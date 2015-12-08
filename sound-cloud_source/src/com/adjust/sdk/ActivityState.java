// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;

// Referenced classes of package com.adjust.sdk:
//            AdjustFactory, Util, ILogger

public class ActivityState
    implements Serializable, Cloneable
{

    private static final ObjectStreamField serialPersistentFields[];
    private static final long serialVersionUID = 0x7d728a246d4bab64L;
    protected boolean askingAttribution;
    protected boolean enabled;
    protected int eventCount;
    protected long lastActivity;
    protected long lastInterval;
    private transient ILogger logger;
    protected int sessionCount;
    protected long sessionLength;
    protected int subsessionCount;
    protected long timeSpent;
    protected String uuid;

    protected ActivityState()
    {
        logger = AdjustFactory.getLogger();
        uuid = Util.createUuid();
        enabled = true;
        askingAttribution = false;
        eventCount = 0;
        sessionCount = 0;
        subsessionCount = -1;
        sessionLength = -1L;
        timeSpent = -1L;
        lastActivity = -1L;
        lastInterval = -1L;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream = objectinputstream.readFields();
        eventCount = Util.readIntField(objectinputstream, "eventCount", 0);
        sessionCount = Util.readIntField(objectinputstream, "sessionCount", 0);
        subsessionCount = Util.readIntField(objectinputstream, "subsessionCount", -1);
        sessionLength = Util.readLongField(objectinputstream, "sessionLength", -1L);
        timeSpent = Util.readLongField(objectinputstream, "timeSpent", -1L);
        lastActivity = Util.readLongField(objectinputstream, "lastActivity", -1L);
        lastInterval = Util.readLongField(objectinputstream, "lastInterval", -1L);
        uuid = Util.readStringField(objectinputstream, "uuid", null);
        enabled = Util.readBooleanField(objectinputstream, "enabled", true);
        askingAttribution = Util.readBooleanField(objectinputstream, "askingAttribution", false);
        if (uuid == null)
        {
            uuid = Util.createUuid();
        }
    }

    private static String stamp(long l)
    {
        Calendar.getInstance().setTimeInMillis(l);
        return String.format(Locale.US, "%02d:%02d:%02d", new Object[] {
            Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13)
        });
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ActivityState)obj;
            if (!Util.equalString(uuid, ((ActivityState) (obj)).uuid))
            {
                return false;
            }
            if (!Util.equalBoolean(Boolean.valueOf(enabled), Boolean.valueOf(((ActivityState) (obj)).enabled)))
            {
                return false;
            }
            if (!Util.equalBoolean(Boolean.valueOf(askingAttribution), Boolean.valueOf(((ActivityState) (obj)).askingAttribution)))
            {
                return false;
            }
            if (!Util.equalInt(Integer.valueOf(eventCount), Integer.valueOf(((ActivityState) (obj)).eventCount)))
            {
                return false;
            }
            if (!Util.equalInt(Integer.valueOf(sessionCount), Integer.valueOf(((ActivityState) (obj)).sessionCount)))
            {
                return false;
            }
            if (!Util.equalInt(Integer.valueOf(subsessionCount), Integer.valueOf(((ActivityState) (obj)).subsessionCount)))
            {
                return false;
            }
            if (!Util.equalLong(Long.valueOf(sessionLength), Long.valueOf(((ActivityState) (obj)).sessionLength)))
            {
                return false;
            }
            if (!Util.equalLong(Long.valueOf(timeSpent), Long.valueOf(((ActivityState) (obj)).timeSpent)))
            {
                return false;
            }
            if (!Util.equalLong(Long.valueOf(lastInterval), Long.valueOf(((ActivityState) (obj)).lastInterval)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((((((((Util.hashString(uuid) + 629) * 37 + Util.hashBoolean(Boolean.valueOf(enabled))) * 37 + Util.hashBoolean(Boolean.valueOf(askingAttribution))) * 37 + eventCount) * 37 + sessionCount) * 37 + subsessionCount) * 37 + Util.hashLong(Long.valueOf(sessionLength))) * 37 + Util.hashLong(Long.valueOf(timeSpent))) * 37 + Util.hashLong(Long.valueOf(lastInterval));
    }

    protected void resetSessionAttributes(long l)
    {
        subsessionCount = 1;
        sessionLength = 0L;
        timeSpent = 0L;
        lastActivity = l;
        lastInterval = -1L;
    }

    public ActivityState shallowCopy()
    {
        ActivityState activitystate;
        try
        {
            activitystate = (ActivityState)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return activitystate;
    }

    public String toString()
    {
        return String.format(Locale.US, "ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", new Object[] {
            Integer.valueOf(eventCount), Integer.valueOf(sessionCount), Integer.valueOf(subsessionCount), Double.valueOf((double)sessionLength / 1000D), Double.valueOf((double)timeSpent / 1000D), stamp(lastActivity), uuid
        });
    }

    static 
    {
        serialPersistentFields = (new ObjectStreamField[] {
            new ObjectStreamField("uuid", java/lang/String), new ObjectStreamField("enabled", Boolean.TYPE), new ObjectStreamField("askingAttribution", Boolean.TYPE), new ObjectStreamField("eventCount", Integer.TYPE), new ObjectStreamField("sessionCount", Integer.TYPE), new ObjectStreamField("subsessionCount", Integer.TYPE), new ObjectStreamField("sessionLength", Long.TYPE), new ObjectStreamField("timeSpent", Long.TYPE), new ObjectStreamField("lastActivity", Long.TYPE), new ObjectStreamField("lastInterval", Long.TYPE)
        });
    }
}
