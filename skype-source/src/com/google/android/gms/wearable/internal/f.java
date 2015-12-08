// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, c

public final class f extends com.google.android.gms.common.data.f
    implements com.google.android.gms.wearable.f
{

    private final int c;

    public f(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        c = j;
    }

    public final Object a()
    {
        return new d(this);
    }

    public final Uri b()
    {
        return Uri.parse(c("path"));
    }

    public final byte[] c()
    {
        return d("data");
    }

    public final Map d()
    {
        HashMap hashmap = new HashMap(c);
        for (int i = 0; i < c; i++)
        {
            c c1 = new c(a, b + i);
            if (c1.c() != null)
            {
                hashmap.put(c1.c(), c1);
            }
        }

        return hashmap;
    }

    public final String toString()
    {
        boolean flag = Log.isLoggable("DataItem", 3);
        Object obj = d("data");
        Object obj1 = d();
        StringBuilder stringbuilder = new StringBuilder("DataItemInternal{ ");
        stringbuilder.append((new StringBuilder("uri=")).append(b()).toString());
        StringBuilder stringbuilder1 = new StringBuilder(", dataSz=");
        if (obj == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(obj.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder(", numAssets=")).append(((Map) (obj1)).size()).toString());
        if (flag && !((Map) (obj1)).isEmpty())
        {
            stringbuilder.append(", assets=[");
            obj1 = ((Map) (obj1)).entrySet().iterator();
            for (obj = ""; ((Iterator) (obj1)).hasNext(); obj = ", ")
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                stringbuilder.append((new StringBuilder()).append(((String) (obj))).append((String)entry.getKey()).append(": ").append(((g)entry.getValue()).b()).toString());
            }

            stringbuilder.append("]");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
