// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class zzaa
    implements DataItem
{

    private Uri a;
    private byte b[];
    private Map c;

    public zzaa(DataItem dataitem)
    {
        a = dataitem.b();
        b = dataitem.c();
        HashMap hashmap = new HashMap();
        dataitem = dataitem.d().entrySet().iterator();
        do
        {
            if (!dataitem.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)dataitem.next();
            if (entry.getKey() != null)
            {
                hashmap.put(entry.getKey(), ((DataItemAsset)entry.getValue()).a());
            }
        } while (true);
        c = Collections.unmodifiableMap(hashmap);
    }

    public Object a()
    {
        return e();
    }

    public String a(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DataItemEntity{ ");
        stringbuilder.append((new StringBuilder()).append("uri=").append(a).toString());
        StringBuilder stringbuilder1 = (new StringBuilder()).append(", dataSz=");
        Object obj;
        if (b == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(b.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(c.size()).toString());
        if (flag && !c.isEmpty())
        {
            stringbuilder.append(", assets=[");
            Iterator iterator = c.entrySet().iterator();
            for (obj = ""; iterator.hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((DataItemAsset)entry.getValue()).b()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

    public Uri b()
    {
        return a;
    }

    public byte[] c()
    {
        return b;
    }

    public Map d()
    {
        return c;
    }

    public DataItem e()
    {
        return this;
    }

    public String toString()
    {
        return a(Log.isLoggable("DataItem", 3));
    }
}
