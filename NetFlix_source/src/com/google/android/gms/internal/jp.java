// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            jq

public final class jp
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new jq();
    int adh;
    String adi;
    double adj;
    String adk;
    long adl;
    int adm;
    private final int xH;

    jp()
    {
        xH = 1;
        adm = -1;
        adh = -1;
        adj = -1D;
    }

    jp(int i, int j, String s, double d, String s1, long l, int k)
    {
        xH = i;
        adh = j;
        adi = s;
        adj = d;
        adk = s1;
        adl = l;
        adm = k;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        jq.a(this, parcel, i);
    }

}
