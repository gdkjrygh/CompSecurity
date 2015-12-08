// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d
    implements f
{

    private Uri a;
    private byte b[];
    private Map c;

    public d(f f1)
    {
        a = f1.b();
        b = f1.c();
        HashMap hashmap = new HashMap();
        f1 = f1.d().entrySet().iterator();
        do
        {
            if (!f1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)f1.next();
            if (entry.getKey() != null)
            {
                hashmap.put(entry.getKey(), ((g)entry.getValue()).a());
            }
        } while (true);
        c = Collections.unmodifiableMap(hashmap);
    }

    public final Object a()
    {
        return this;
    }

    public final Uri b()
    {
        return a;
    }

    public final byte[] c()
    {
        return b;
    }

    public final Map d()
    {
        return c;
    }

    public final String toString()
    {
        boolean flag = Log.isLoggable("DataItem", 3);
        StringBuilder stringbuilder = new StringBuilder("DataItemEntity{ ");
        stringbuilder.append((new StringBuilder("uri=")).append(a).toString());
        StringBuilder stringbuilder1 = new StringBuilder(", dataSz=");
        Object obj;
        if (b == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(b.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder(", numAssets=")).append(c.size()).toString());
        if (flag && !c.isEmpty())
        {
            stringbuilder.append(", assets=[");
            Iterator iterator = c.entrySet().iterator();
            for (obj = ""; iterator.hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((g)entry.getValue()).b()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
