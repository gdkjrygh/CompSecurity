// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hn;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable:
//            e, DataItem, DataItemAsset, Asset

public class PutDataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new e();
    public static final String WEAR_URI_SCHEME = "wear";
    private static final Random alk = new SecureRandom();
    private byte TC[];
    private final Bundle all;
    private final Uri mUri;
    final int xJ;

    private PutDataRequest(int i, Uri uri)
    {
        this(i, uri, new Bundle(), null);
    }

    PutDataRequest(int i, Uri uri, Bundle bundle, byte abyte0[])
    {
        xJ = i;
        mUri = uri;
        all = bundle;
        all.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        TC = abyte0;
    }

    public static PutDataRequest create(String s)
    {
        return j(cx(s));
    }

    public static PutDataRequest createFromDataItem(DataItem dataitem)
    {
        PutDataRequest putdatarequest = j(dataitem.getUri());
        java.util.Map.Entry entry;
        for (Iterator iterator = dataitem.getAssets().entrySet().iterator(); iterator.hasNext(); putdatarequest.putAsset((String)entry.getKey(), Asset.createFromRef(((DataItemAsset)entry.getValue()).getId())))
        {
            entry = (java.util.Map.Entry)iterator.next();
            if (((DataItemAsset)entry.getValue()).getId() == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("Cannot create an asset for a put request without a digest: ").append((String)entry.getKey()).toString());
            }
        }

        putdatarequest.setData(dataitem.getData());
        return putdatarequest;
    }

    public static PutDataRequest createWithAutoAppendedId(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(s);
        if (!s.endsWith("/"))
        {
            stringbuilder.append("/");
        }
        stringbuilder.append("PN").append(alk.nextLong());
        return new PutDataRequest(1, cx(stringbuilder.toString()));
    }

    private static Uri cx(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("An empty path was supplied.");
        }
        if (!s.startsWith("/"))
        {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
        if (s.startsWith("//"))
        {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else
        {
            return (new android.net.Uri.Builder()).scheme("wear").path(s).build();
        }
    }

    public static PutDataRequest j(Uri uri)
    {
        return new PutDataRequest(1, uri);
    }

    public int describeContents()
    {
        return 0;
    }

    public Asset getAsset(String s)
    {
        return (Asset)all.getParcelable(s);
    }

    public Map getAssets()
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = all.keySet().iterator(); iterator.hasNext(); hashmap.put(s, (Asset)all.getParcelable(s)))
        {
            s = (String)iterator.next();
        }

        return Collections.unmodifiableMap(hashmap);
    }

    public byte[] getData()
    {
        return TC;
    }

    public Uri getUri()
    {
        return mUri;
    }

    public boolean hasAsset(String s)
    {
        return all.containsKey(s);
    }

    public Bundle nh()
    {
        return all;
    }

    public PutDataRequest putAsset(String s, Asset asset)
    {
        hn.f(s);
        hn.f(asset);
        all.putParcelable(s, asset);
        return this;
    }

    public PutDataRequest removeAsset(String s)
    {
        all.remove(s);
        return this;
    }

    public PutDataRequest setData(byte abyte0[])
    {
        TC = abyte0;
        return this;
    }

    public String toString()
    {
        return toString(Log.isLoggable("DataMap", 3));
    }

    public String toString(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder("PutDataRequest[");
        StringBuilder stringbuilder1 = (new StringBuilder()).append("dataSz=");
        Object obj;
        if (TC == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(TC.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder()).append(", numAssets=").append(all.size()).toString());
        stringbuilder.append((new StringBuilder()).append(", uri=").append(mUri).toString());
        if (!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for (Iterator iterator = all.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("\n    ").append(s).append(": ").append(all.getParcelable(s)).toString()))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        e.a(this, parcel, i);
    }

}
