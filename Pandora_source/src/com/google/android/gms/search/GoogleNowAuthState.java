// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.search;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.search:
//            zza

public class GoogleNowAuthState
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    String zzaBr;
    String zzaBs;
    long zzaBt;
    final int zzzH;

    GoogleNowAuthState(int i, String s, String s1, long l)
    {
        zzzH = i;
        zzaBr = s;
        zzaBs = s1;
        zzaBt = l;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAccessToken()
    {
        return zzaBs;
    }

    public String getAuthCode()
    {
        return zzaBr;
    }

    public long getNextAllowedTimeMillis()
    {
        return zzaBt;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
