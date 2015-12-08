// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.auth.api:
//            GoogleAuthApiResponseCreator

public class GoogleAuthApiResponse
    implements SafeParcelable
{

    public static final GoogleAuthApiResponseCreator CREATOR = new GoogleAuthApiResponseCreator();
    final byte DA[];
    final Bundle Dz;
    final int responseCode;
    final int versionCode;

    public GoogleAuthApiResponse(int i, int j, Bundle bundle, byte abyte0[])
    {
        versionCode = i;
        responseCode = j;
        Dz = bundle;
        DA = abyte0;
    }

    public GoogleAuthApiResponse(int i, Bundle bundle, byte abyte0[])
    {
        versionCode = 1;
        responseCode = i;
        Dz = bundle;
        DA = abyte0;
    }

    public GoogleAuthApiResponse(int i, Map map, byte abyte0[])
    {
        this(i, B(map), abyte0);
    }

    private static Bundle B(Map map)
    {
        Bundle bundle = new Bundle();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); bundle.putString((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public byte[] getBody()
    {
        return DA;
    }

    public Bundle getHeaders()
    {
        return Dz;
    }

    public Map getHeadersAsMap()
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = Dz.keySet().iterator(); iterator.hasNext(); hashmap.put(s, Dz.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public int getResponseCode()
    {
        return responseCode;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        GoogleAuthApiResponseCreator.a(this, parcel, i);
    }

}
