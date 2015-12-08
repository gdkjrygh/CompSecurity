// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzph

public class zzpg
    implements SafeParcelable
{

    public static final zzph CREATOR = new zzph();
    static final List zzang = Collections.emptyList();
    final String mTag;
    private final int zzFG;
    LocationRequest zzabx;
    boolean zzanh;
    boolean zzani;
    boolean zzanj;
    List zzank;

    zzpg(int i, LocationRequest locationrequest, boolean flag, boolean flag1, boolean flag2, List list, String s)
    {
        zzFG = i;
        zzabx = locationrequest;
        zzanh = flag;
        zzani = flag1;
        zzanj = flag2;
        zzank = list;
        mTag = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zzpg)
        {
            if (zzw.equal(zzabx, ((zzpg) (obj = (zzpg)obj)).zzabx) && zzanh == ((zzpg) (obj)).zzanh && zzani == ((zzpg) (obj)).zzani && zzanj == ((zzpg) (obj)).zzanj && zzw.equal(zzank, ((zzpg) (obj)).zzank))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return zzFG;
    }

    public int hashCode()
    {
        return zzabx.hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(zzabx.toString());
        stringbuilder.append(" requestNlpDebugInfo=");
        stringbuilder.append(zzanh);
        stringbuilder.append(" restorePendingIntentListeners=");
        stringbuilder.append(zzani);
        stringbuilder.append(" triggerUpdate=");
        stringbuilder.append(zzanj);
        stringbuilder.append(" clients=");
        stringbuilder.append(zzank);
        if (mTag != null)
        {
            stringbuilder.append(" tag=");
            stringbuilder.append(mTag);
        }
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzph.zza(this, parcel, i);
    }

}
