// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import acl;
import adf;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Locale;
import java.util.UUID;

public class ActivityState
    implements Serializable, Cloneable
{

    private static final ObjectStreamField serialPersistentFields[];
    private static final long serialVersionUID = 0x7d728a246d4bab64L;
    public boolean askingAttribution;
    public boolean enabled;
    public int eventCount;
    public long lastActivity;
    public long lastInterval;
    public int sessionCount;
    public long sessionLength;
    public int subsessionCount;
    public long timeSpent;
    public String uuid;

    public ActivityState()
    {
        acl.a();
        uuid = UUID.randomUUID().toString();
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
    {
        objectinputstream = objectinputstream.readFields();
        eventCount = adf.a(objectinputstream, "eventCount", 0);
        sessionCount = adf.a(objectinputstream, "sessionCount", 0);
        subsessionCount = adf.a(objectinputstream, "subsessionCount", -1);
        sessionLength = adf.b(objectinputstream, "sessionLength");
        timeSpent = adf.b(objectinputstream, "timeSpent");
        lastActivity = adf.b(objectinputstream, "lastActivity");
        lastInterval = adf.b(objectinputstream, "lastInterval");
        uuid = adf.a(objectinputstream, "uuid");
        enabled = adf.a(objectinputstream, "enabled", true);
        askingAttribution = adf.a(objectinputstream, "askingAttribution", false);
        if (uuid == null)
        {
            uuid = UUID.randomUUID().toString();
        }
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
    }

    public final ActivityState a()
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

    public final void a(long l)
    {
        subsessionCount = 1;
        sessionLength = 0L;
        timeSpent = 0L;
        lastActivity = l;
        lastInterval = -1L;
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
            if (!adf.a(uuid, ((ActivityState) (obj)).uuid))
            {
                return false;
            }
            if (!adf.a(Boolean.valueOf(enabled), Boolean.valueOf(((ActivityState) (obj)).enabled)))
            {
                return false;
            }
            if (!adf.a(Boolean.valueOf(askingAttribution), Boolean.valueOf(((ActivityState) (obj)).askingAttribution)))
            {
                return false;
            }
            if (!adf.a(Integer.valueOf(eventCount), Integer.valueOf(((ActivityState) (obj)).eventCount)))
            {
                return false;
            }
            if (!adf.a(Integer.valueOf(sessionCount), Integer.valueOf(((ActivityState) (obj)).sessionCount)))
            {
                return false;
            }
            if (!adf.a(Integer.valueOf(subsessionCount), Integer.valueOf(((ActivityState) (obj)).subsessionCount)))
            {
                return false;
            }
            if (!adf.a(Long.valueOf(sessionLength), Long.valueOf(((ActivityState) (obj)).sessionLength)))
            {
                return false;
            }
            if (!adf.a(Long.valueOf(timeSpent), Long.valueOf(((ActivityState) (obj)).timeSpent)))
            {
                return false;
            }
            if (!adf.a(Long.valueOf(lastInterval), Long.valueOf(((ActivityState) (obj)).lastInterval)))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((((((((adf.a(uuid) + 629) * 37 + adf.a(Boolean.valueOf(enabled))) * 37 + adf.a(Boolean.valueOf(askingAttribution))) * 37 + eventCount) * 37 + sessionCount) * 37 + subsessionCount) * 37 + adf.a(Long.valueOf(sessionLength))) * 37 + adf.a(Long.valueOf(timeSpent))) * 37 + adf.a(Long.valueOf(lastInterval));
    }

    public String toString()
    {
        Locale locale = Locale.US;
        int i = eventCount;
        int j = sessionCount;
        int k = subsessionCount;
        double d = (double)sessionLength / 1000D;
        double d1 = (double)timeSpent / 1000D;
        long l = lastActivity;
        Calendar.getInstance().setTimeInMillis(l);
        return String.format(locale, "ec:%d sc:%d ssc:%d sl:%.1f ts:%.1f la:%s uuid:%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Double.valueOf(d), Double.valueOf(d1), String.format(Locale.US, "%02d:%02d:%02d", new Object[] {
                Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13)
            }), uuid
        });
    }

    static 
    {
        serialPersistentFields = (new ObjectStreamField[] {
            new ObjectStreamField("uuid", java/lang/String), new ObjectStreamField("enabled", Boolean.TYPE), new ObjectStreamField("askingAttribution", Boolean.TYPE), new ObjectStreamField("eventCount", Integer.TYPE), new ObjectStreamField("sessionCount", Integer.TYPE), new ObjectStreamField("subsessionCount", Integer.TYPE), new ObjectStreamField("sessionLength", Long.TYPE), new ObjectStreamField("timeSpent", Long.TYPE), new ObjectStreamField("lastActivity", Long.TYPE), new ObjectStreamField("lastInterval", Long.TYPE)
        });
    }
}
