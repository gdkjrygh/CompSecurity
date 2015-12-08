// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzz, zzaa

public final class zzac extends zzc
    implements DataItem
{

    private final int c;

    public zzac(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        c = j;
    }

    public Object a()
    {
        return e();
    }

    public String a(boolean flag)
    {
        Object obj = c();
        Object obj1 = d();
        StringBuilder stringbuilder = new StringBuilder("DataItemInternal{ ");
        stringbuilder.append((new StringBuilder()).append("uri=").append(b()).toString());
        StringBuilder stringbuilder1 = (new StringBuilder()).append(", dataSz=");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(obj.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(((Map) (obj1)).size()).toString());
        if (flag && !((Map) (obj1)).isEmpty())
        {
            stringbuilder.append(", assets=[");
            obj1 = ((Map) (obj1)).entrySet().iterator();
            for (obj = ""; ((Iterator) (obj1)).hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((DataItemAsset)entry.getValue()).b()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }

    public Uri b()
    {
        return Uri.parse(d("path"));
    }

    public byte[] c()
    {
        return f("data");
    }

    public Map d()
    {
        HashMap hashmap = new HashMap(c);
        int i = 0;
        while (i < c) 
        {
            zzz zzz1 = new zzz(a, b + i);
            if (zzz1.c() != null)
            {
                hashmap.put(zzz1.c(), zzz1);
            }
            i++;
        }
        return hashmap;
    }

    public DataItem e()
    {
        return new zzaa(this);
    }

    public String toString()
    {
        return a(Log.isLoggable("DataItem", 3));
    }
}
