// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            n, DataItemAssetParcelable

public class m
    implements SafeParcelable, DataItem
{

    public static final android.os.Parcelable.Creator CREATOR = new n();
    private byte TF[];
    private final Map alK;
    private final Uri mUri;
    final int xM;

    m(int i, Uri uri, Bundle bundle, byte abyte0[])
    {
        xM = i;
        mUri = uri;
        uri = new HashMap();
        bundle.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); uri.put(s, (DataItemAssetParcelable)bundle.getParcelable(s)))
        {
            s = (String)iterator.next();
        }

        alK = uri;
        TF = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public Object freeze()
    {
        return ns();
    }

    public Map getAssets()
    {
        return alK;
    }

    public byte[] getData()
    {
        return TF;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public m m(byte abyte0[])
    {
        TF = abyte0;
        return this;
    }

    public Bundle nm()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        java.util.Map.Entry entry;
        for (Iterator iterator = alK.entrySet().iterator(); iterator.hasNext(); bundle.putParcelable((String)entry.getKey(), new DataItemAssetParcelable((DataItemAsset)entry.getValue())))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return bundle;
    }

    public m ns()
    {
        return this;
    }

    public DataItem setData(byte abyte0[])
    {
        return m(abyte0);
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataItem", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("DataItemParcelable[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        StringBuilder stringbuilder1 = (new StringBuilder()).append(",dataSz=");
        Object obj;
        if (TF == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(TF.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(alK.size()).toString());
        stringbuilder.append((new StringBuilder()).append(", uri=").append(mUri).toString());
        if (!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for (Iterator iterator = alK.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\n    ").append(s).append(": ").append(alK.get(s)).toString()))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        n.a(this, parcel, i);
    }

}
