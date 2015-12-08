// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.wearable:
//            PutDataRequestCreator

public class PutDataRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PutDataRequestCreator();
    private static final long DEADLINE_OPPORTUNISTIC_MS;
    private static final Random sRandom = new SecureRandom();
    final Bundle mAssets;
    byte mData[];
    long mSyncDeadline;
    final Uri mUri;
    final int mVersionCode;

    PutDataRequest(int i, Uri uri, Bundle bundle, byte abyte0[], long l)
    {
        mVersionCode = i;
        mUri = uri;
        mAssets = bundle;
        mAssets.setClassLoader(com/google/android/gms/wearable/internal/DataItemAssetParcelable.getClassLoader());
        mData = abyte0;
        mSyncDeadline = l;
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
        if (mData == null)
        {
            obj = "null";
        } else
        {
            obj = Integer.valueOf(mData.length);
        }
        stringbuilder.append(stringbuilder1.append(obj).toString());
        stringbuilder.append((new StringBuilder(", numAssets=")).append(mAssets.size()).toString());
        stringbuilder.append((new StringBuilder(", uri=")).append(mUri).toString());
        stringbuilder.append((new StringBuilder(", syncDeadline=")).append(mSyncDeadline).toString());
        if (!flag)
        {
            stringbuilder.append("]");
            return stringbuilder.toString();
        }
        stringbuilder.append("]\n  assets: ");
        String s;
        for (Iterator iterator = mAssets.keySet().iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder("\n    ")).append(s).append(": ").append(mAssets.getParcelable(s)).toString()))
        {
            s = (String)iterator.next();
        }

        stringbuilder.append("\n  ]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PutDataRequestCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        DEADLINE_OPPORTUNISTIC_MS = TimeUnit.MINUTES.toMillis(30L);
    }
}
