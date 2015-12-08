// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            zzj

public class LocationSettingsRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private final int zzFG;
    private final List zzabu;
    private final boolean zzamm;
    private final boolean zzamn;

    LocationSettingsRequest(int i, List list, boolean flag, boolean flag1)
    {
        zzFG = i;
        zzabu = list;
        zzamm = flag;
        zzamn = flag1;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzFG;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public List zzme()
    {
        return Collections.unmodifiableList(zzabu);
    }

    public boolean zzps()
    {
        return zzamm;
    }

    public boolean zzpt()
    {
        return zzamn;
    }

}
