// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adjust.sdk;

import adf;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adjust.sdk:
//            ActivityKind

public class ActivityPackage
    implements Serializable
{

    private static final ObjectStreamField serialPersistentFields[] = {
        new ObjectStreamField("path", java/lang/String), new ObjectStreamField("clientSdk", java/lang/String), new ObjectStreamField("parameters", java/util/Map), new ObjectStreamField("activityKind", com/adjust/sdk/ActivityKind), new ObjectStreamField("suffix", java/lang/String)
    };
    private static final long serialVersionUID = 0xff8054cd3f4b79dfL;
    private transient int a;
    public ActivityKind activityKind;
    public String clientSdk;
    public Map parameters;
    public String path;
    public String suffix;

    public ActivityPackage(ActivityKind activitykind)
    {
        activityKind = ActivityKind.a;
        activityKind = activitykind;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream = objectinputstream.readFields();
        path = adf.a(objectinputstream, "path");
        clientSdk = adf.a(objectinputstream, "clientSdk");
        parameters = (Map)adf.a(objectinputstream, "parameters", null);
        activityKind = (ActivityKind)adf.a(objectinputstream, "activityKind", ActivityKind.a);
        suffix = adf.a(objectinputstream, "suffix");
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
    }

    public final String a()
    {
        return String.format(Locale.US, "Failed to track %s%s", new Object[] {
            activityKind.toString(), suffix
        });
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
            if (!adf.a(path, ((ActivityPackage) (obj)).path))
            {
                return false;
            }
            if (!adf.a(clientSdk, ((ActivityPackage) (obj)).clientSdk))
            {
                return false;
            }
            Map map = parameters;
            Map map1 = ((ActivityPackage) (obj)).parameters;
            boolean flag;
            if (map == null || map1 == null)
            {
                if (map == null && map1 == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = map.entrySet().equals(map1.entrySet());
            }
            if (!flag)
            {
                return false;
            }
            if (!adf.a(activityKind, ((ActivityPackage) (obj)).activityKind))
            {
                return false;
            }
            if (!adf.a(suffix, ((ActivityPackage) (obj)).suffix))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        boolean flag = false;
        if (a == 0)
        {
            a = 17;
            a = a * 37 + adf.a(path);
            a = a * 37 + adf.a(clientSdk);
            int j = a;
            Object obj = parameters;
            int i;
            if (obj == null)
            {
                i = 0;
            } else
            {
                i = ((Map) (obj)).entrySet().hashCode();
            }
            a = i + j * 37;
            j = a;
            obj = activityKind;
            if (obj == null)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = ((Enum) (obj)).hashCode();
            }
            a = j * 37 + i;
            a = a * 37 + adf.a(suffix);
        }
        return a;
    }

    public String toString()
    {
        return String.format(Locale.US, "%s%s", new Object[] {
            activityKind.toString(), suffix
        });
    }

}
