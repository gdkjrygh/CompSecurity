// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import cqu;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            DataItemAssetParcelable

public class DataItemParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new cqu();
    public final int a;
    public final Uri b;
    public final Map c;
    public byte d[];

    public DataItemParcelable(int i, Uri uri, Bundle bundle, byte abyte0[])
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

    public int describeContents()
    {
        return 0;
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
        cqu.a(this, parcel, i);
    }

}
