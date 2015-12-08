// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.support.v4.e.a;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.google.android.gms.internal:
//            kv

public final class kz extends kv
{

    private String a;
    private String b;
    private String c;
    private String d;

    public kz()
    {
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        a = s;
    }

    public final String b()
    {
        return b;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final String c()
    {
        return c;
    }

    public final void c(String s)
    {
        c = s;
    }

    public final String d()
    {
        return d;
    }

    public final void d(String s)
    {
        d = s;
    }

    public final String toString()
    {
        Object obj = new a();
        ((Map) (obj)).put("appName", a);
        ((Map) (obj)).put("appVersion", b);
        ((Map) (obj)).put("appId", c);
        ((Map) (obj)).put("appInstallerId", d);
        StringBuffer stringbuffer = new StringBuffer();
        obj = (new TreeMap(((Map) (obj)))).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            Object obj1 = entry.getValue();
            if (obj1 != null && (!(obj1 instanceof String) || !TextUtils.isEmpty((String)obj1)) && (!(obj1 instanceof Integer) || ((Integer)obj1).intValue() != 0) && (!(obj1 instanceof Long) || ((Long)obj1).longValue() != 0L) && (!(obj1 instanceof Double) || ((Double)obj1).doubleValue() != 0.0D) && (!(obj1 instanceof Boolean) || ((Boolean)obj1).booleanValue()))
            {
                if (stringbuffer.length() > 0)
                {
                    stringbuffer.append(", ");
                }
                stringbuffer.append((String)entry.getKey());
                stringbuffer.append('=');
                stringbuffer.append(obj1);
            }
        } while (true);
        return stringbuffer.toString();
    }
}
