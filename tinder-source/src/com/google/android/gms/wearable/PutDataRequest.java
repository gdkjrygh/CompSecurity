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
import com.google.android.gms.common.internal.u;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable:
//            w, Asset

public class PutDataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new w();
    private static final Random e = new SecureRandom();
    final int a;
    public final Uri b;
    final Bundle c;
    public byte d[];

    PutDataRequest(int i, Uri uri, Bundle bundle, byte abyte0[])
    {
        a = i;
        b = uri;
        c = bundle;
        c.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        d = abyte0;
    }

    private PutDataRequest(Uri uri)
    {
        this(1, uri, new Bundle(), null);
    }

    public static PutDataRequest a(Uri uri)
    {
        return new PutDataRequest(uri);
    }

    public static PutDataRequest a(String s)
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
            return a((new android.net.Uri.Builder()).scheme("wear").path(s).build());
        }
    }

    public final PutDataRequest a(String s, Asset asset)
    {
        u.a(s);
        u.a(asset);
        c.putParcelable(s, asset);
        return this;
    }

    public final Map a()
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); hashmap.put(s, (Asset)c.getParcelable(s)))
        {
            s = (String)iterator.next();
        }

        return Collections.unmodifiableMap(hashmap);
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        boolean flag = Log.isLoggable("DataMap", 3);
        StringBuilder stringbuilder = new StringBuilder("PutDataRequest[");
        StringBuilder stringbuilder1 = new StringBuilder("dataSz=");
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
        for (Iterator iterator = c.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder("\n    ")).append(s).append(": ").append(c.getParcelable(s)).toString()))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        w.a(this, parcel, i);
    }

}
