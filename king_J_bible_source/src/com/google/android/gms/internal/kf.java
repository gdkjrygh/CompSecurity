// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.wearable.c;
import com.google.android.gms.wearable.d;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class kf
    implements c
{

    private byte Nf[];
    private Map adD;
    private Set adE;
    private Uri mUri;

    public kf(c c1)
    {
        mUri = c1.getUri();
        Nf = c1.getData();
        HashMap hashmap = new HashMap();
        Iterator iterator = c1.ma().entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (entry.getKey() != null)
            {
                hashmap.put(entry.getKey(), ((d)entry.getValue()).freeze());
            }
        } while (true);
        adD = Collections.unmodifiableMap(hashmap);
        adE = Collections.unmodifiableSet(c1.mb());
    }

    public Object freeze()
    {
        return mg();
    }

    public byte[] getData()
    {
        return Nf;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public Map ma()
    {
        return adD;
    }

    public Set mb()
    {
        return adE;
    }

    public c mg()
    {
        return this;
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DataItemEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        StringBuilder stringbuilder1 = (new StringBuilder()).append(",dataSz=");
        Object obj;
        if (Nf == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(Nf.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(adD.size()).toString());
        stringbuilder.append((new StringBuilder()).append(", uri=").append(mUri).toString());
        if (!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("\n  tags=[");
        obj = adE.iterator();
        boolean flag1 = false;
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            if (flag1)
            {
                stringbuilder.append(", ");
            } else
            {
                flag1 = true;
            }
            stringbuilder.append(s);
        }
        stringbuilder.append("]\n  assets: ");
        String s1;
        for (Iterator iterator = adD.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\n    ").append(s1).append(": ").append(adD.get(s1)).toString()))
        {
            s1 = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }
}
