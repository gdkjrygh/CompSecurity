// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.f;
import com.google.android.gms.wearable.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            e, DataItemAssetParcelable

public class DataItemParcelable
    implements SafeParcelable, f
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    final int a;
    private final Uri b;
    private final Map c;
    private byte d[];

    DataItemParcelable(int i, Uri uri, Bundle bundle, byte abyte0[])
    {
        a = i;
        b = uri;
        uri = new HashMap();
        bundle.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); uri.put(s, (DataItemAssetParcelable)bundle.getParcelable(s)))
        {
            s = (String)iterator.next();
        }

        c = uri;
        d = abyte0;
    }

    public final Object a()
    {
        return this;
    }

    public final Uri b()
    {
        return b;
    }

    public final byte[] c()
    {
        return d;
    }

    public final Map d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public final Bundle e()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        java.util.Map.Entry entry;
        for (Iterator iterator = c.entrySet().iterator(); iterator.hasNext(); bundle.putParcelable((String)entry.getKey(), new DataItemAssetParcelable((g)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return bundle;
    }

    public String toString()
    {
        boolean flag = Log.isLoggable("DataItem", 3);
        StringBuilder stringbuilder = new StringBuilder("DataItemParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        StringBuilder stringbuilder1 = new StringBuilder(",dataSz=");
        Object obj;
        if (d == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(d.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder(", numAssets=")).append(c.size()).toString());
        stringbuilder.append((new StringBuilder(", uri=")).append(b).toString());
        if (!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder("\n    ")).append(s).append(": ").append(c.get(s)).toString()))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.wearable.internal.e.a(this, parcel, i);
    }

}
