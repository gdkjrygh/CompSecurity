// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public abstract class zzqy
{

    public zzqy()
    {
    }

    protected static String zzG(Map map)
    {
        StringBuffer stringbuffer = new StringBuffer();
        map = (new TreeMap(map)).entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            Object obj = entry.getValue();
            if (obj != null && (!(obj instanceof String) || !TextUtils.isEmpty((String)obj)) && (!(obj instanceof Integer) || ((Integer)obj).intValue() != 0) && (!(obj instanceof Long) || ((Long)obj).longValue() != 0L) && (!(obj instanceof Double) || ((Double)obj).doubleValue() != 0.0D) && (!(obj instanceof Boolean) || ((Boolean)obj).booleanValue()))
            {
                if (stringbuffer.length() > 0)
                {
                    stringbuffer.append(", ");
                }
                stringbuffer.append((String)entry.getKey());
                stringbuffer.append('=');
                stringbuffer.append(obj);
            }
        } while (true);
        return stringbuffer.toString();
    }
}
