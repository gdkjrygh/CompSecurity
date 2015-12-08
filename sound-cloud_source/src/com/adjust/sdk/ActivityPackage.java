// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// Referenced classes of package com.adjust.sdk:
//            ActivityKind, Util

public class ActivityPackage
    implements Serializable
{

    private static final ObjectStreamField serialPersistentFields[] = {
        new ObjectStreamField("path", java/lang/String), new ObjectStreamField("clientSdk", java/lang/String), new ObjectStreamField("parameters", java/util/Map), new ObjectStreamField("activityKind", com/adjust/sdk/ActivityKind), new ObjectStreamField("suffix", java/lang/String)
    };
    private static final long serialVersionUID = 0xff8054cd3f4b79dfL;
    private ActivityKind activityKind;
    private String clientSdk;
    private transient int hashCode;
    private Map parameters;
    private String path;
    private String suffix;

    public ActivityPackage(ActivityKind activitykind)
    {
        activityKind = ActivityKind.UNKNOWN;
        activityKind = activitykind;
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws ClassNotFoundException, IOException
    {
        objectinputstream = objectinputstream.readFields();
        path = Util.readStringField(objectinputstream, "path", null);
        clientSdk = Util.readStringField(objectinputstream, "clientSdk", null);
        parameters = (Map)Util.readObjectField(objectinputstream, "parameters", null);
        activityKind = (ActivityKind)Util.readObjectField(objectinputstream, "activityKind", ActivityKind.UNKNOWN);
        suffix = Util.readStringField(objectinputstream, "suffix", null);
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
            obj = (ActivityPackage)obj;
            if (!Util.equalString(path, ((ActivityPackage) (obj)).path))
            {
                return false;
            }
            if (!Util.equalString(clientSdk, ((ActivityPackage) (obj)).clientSdk))
            {
                return false;
            }
            if (!Util.equalsMap(parameters, ((ActivityPackage) (obj)).parameters))
            {
                return false;
            }
            if (!Util.equalEnum(activityKind, ((ActivityPackage) (obj)).activityKind))
            {
                return false;
            }
            if (!Util.equalString(suffix, ((ActivityPackage) (obj)).suffix))
            {
                return false;
            }
        }
        return true;
    }

    public ActivityKind getActivityKind()
    {
        return activityKind;
    }

    public String getClientSdk()
    {
        return clientSdk;
    }

    public String getExtendedString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(String.format(Locale.US, "Path:      %s\n", new Object[] {
            path
        }));
        stringbuilder.append(String.format(Locale.US, "ClientSdk: %s\n", new Object[] {
            clientSdk
        }));
        if (parameters != null)
        {
            stringbuilder.append("Parameters:");
            java.util.Map.Entry entry;
            for (Iterator iterator = (new TreeMap(parameters)).entrySet().iterator(); iterator.hasNext(); stringbuilder.append(String.format(Locale.US, "\n\t%-16s %s", new Object[] {
    entry.getKey(), entry.getValue()
})))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
        return stringbuilder.toString();
    }

    protected String getFailureMessage()
    {
        return String.format(Locale.US, "Failed to track %s%s", new Object[] {
            activityKind.toString(), suffix
        });
    }

    public Map getParameters()
    {
        return parameters;
    }

    public String getPath()
    {
        return path;
    }

    public String getSuffix()
    {
        return suffix;
    }

    public int hashCode()
    {
        if (hashCode == 0)
        {
            hashCode = 17;
            hashCode = hashCode * 37 + Util.hashString(path);
            hashCode = hashCode * 37 + Util.hashString(clientSdk);
            hashCode = hashCode * 37 + Util.hashMap(parameters);
            hashCode = hashCode * 37 + Util.hashEnum(activityKind);
            hashCode = hashCode * 37 + Util.hashString(suffix);
        }
        return hashCode;
    }

    public void setClientSdk(String s)
    {
        clientSdk = s;
    }

    public void setParameters(Map map)
    {
        parameters = map;
    }

    public void setPath(String s)
    {
        path = s;
    }

    public void setSuffix(String s)
    {
        suffix = s;
    }

    public String toString()
    {
        return String.format(Locale.US, "%s%s", new Object[] {
            activityKind.toString(), suffix
        });
    }

}
