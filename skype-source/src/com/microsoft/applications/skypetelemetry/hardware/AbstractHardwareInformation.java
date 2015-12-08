// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry.hardware;

import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class AbstractHardwareInformation
{

    private static final String b = com/microsoft/applications/skypetelemetry/hardware/AbstractHardwareInformation.getSimpleName();
    protected final Set a = Collections.synchronizedSet(new HashSet());
    private final Map c = new HashMap();

    protected AbstractHardwareInformation()
    {
    }

    private native void propertyChangedBoolean(long l, String s, boolean flag);

    private native void propertyChangedDouble(long l, String s, double d);

    private native void propertyChangedInt(long l, String s, int i);

    private native void propertyChangedLong(long l, String s, long l1);

    private native void propertyChangedString(long l, String s, String s1);

    protected final boolean a(String s, Object obj)
    {
        (new StringBuilder("Setting props {'")).append(s).append("' : '").append(obj).append("'}");
        boolean flag;
        if ((obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            Log.w(b, (new StringBuilder("Value type ")).append(obj.getClass()).append(" not supported. Property is ignored").toString());
            return false;
        }
        if (!c.containsKey(s))
        {
            c.put(s, obj);
        } else
        {
            Object obj1 = c.get(s);
            if (obj1.getClass() != obj.getClass())
            {
                Log.w(b, (new StringBuilder("Cannot re-assign value type: ")).append(obj.getClass().getSimpleName()).append(" after already assigning value type: ").append(obj1.getClass().getSimpleName()).toString());
                return false;
            }
            if (obj1.equals(obj))
            {
                return true;
            }
            (new StringBuilder("Property changed {'")).append(s).append("' : '").append(obj).append("'}");
            c.put(s, obj);
            obj1 = a.iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                Long long1 = (Long)((Iterator) (obj1)).next();
                if (obj instanceof Boolean)
                {
                    boolean flag1 = ((Boolean)obj).booleanValue();
                    propertyChangedBoolean(long1.longValue(), s, flag1);
                } else
                if (obj instanceof String)
                {
                    String s1 = (String)obj;
                    propertyChangedString(long1.longValue(), s, s1);
                } else
                if (obj instanceof Integer)
                {
                    int i = ((Integer)obj).intValue();
                    propertyChangedInt(long1.longValue(), s, i);
                } else
                if (obj instanceof Long)
                {
                    long l = ((Long)obj).longValue();
                    propertyChangedLong(long1.longValue(), s, l);
                } else
                if (obj instanceof Double)
                {
                    double d = ((Double)obj).doubleValue();
                    propertyChangedDouble(long1.longValue(), s, d);
                }
            }
        }
        return true;
    }

}
