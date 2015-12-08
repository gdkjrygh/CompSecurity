// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzay, zzbs

public final class zzax
    implements SafeParcelable
{

    public static final zzay CREATOR = new zzay();
    public final Bundle extras;
    public final int versionCode;
    public final long zzoL;
    public final int zzoM;
    public final List zzoN;
    public final boolean zzoO;
    public final int zzoP;
    public final boolean zzoQ;
    public final String zzoR;
    public final zzbs zzoS;
    public final Location zzoT;
    public final String zzoU;
    public final Bundle zzoV;
    public final Bundle zzoW;
    public final List zzoX;
    public final String zzoY;

    public zzax(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, zzbs zzbs, Location location, String s1, Bundle bundle1, 
            Bundle bundle2, List list1, String s2)
    {
        versionCode = i;
        zzoL = l;
        extras = bundle;
        zzoM = j;
        zzoN = list;
        zzoO = flag;
        zzoP = k;
        zzoQ = flag1;
        zzoR = s;
        zzoS = zzbs;
        zzoT = location;
        zzoU = s1;
        zzoV = bundle1;
        zzoW = bundle2;
        zzoX = list1;
        zzoY = s2;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzay.zza(this, parcel, i);
    }

}
