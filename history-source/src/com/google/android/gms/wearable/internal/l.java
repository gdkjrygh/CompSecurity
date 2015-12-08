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

public class l
    implements DataItem
{

    private byte aeA[];
    private Map axH;
    private Uri mUri;

    public l(DataItem dataitem)
    {
        mUri = dataitem.getUri();
        aeA = dataitem.getData();
        HashMap hashmap = new HashMap();
        dataitem = dataitem.getAssets().entrySet().iterator();
        do
        {
            if (!dataitem.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)dataitem.next();
            if (entry.getKey() != null)
            {
                hashmap.put(entry.getKey(), ((DataItemAsset)entry.getValue()).freeze());
            }
        } while (true);
        axH = Collections.unmodifiableMap(hashmap);
    }

    public Object freeze()
    {
        return rp();
    }

    public Map getAssets()
    {
        return axH;
    }

    public byte[] getData()
    {
        return aeA;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public DataItem rp()
    {
        return this;
    }

    public DataItem setData(byte abyte0[])
    {
        throw new UnsupportedOperationException();
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
        if (aeA == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(aeA.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(axH.size()).toString());
        stringbuilder.append((new StringBuilder()).append(", uri=").append(mUri).toString());
        if (!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for (Iterator iterator = axH.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\n    ").append(s).append(": ").append(axH.get(s)).toString()))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }
}
