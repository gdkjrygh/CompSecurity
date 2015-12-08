// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location:
//            zzc

public final class zzb
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    private static final List zzama = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6), Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9), Integer.valueOf(10), 
        Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(14), Integer.valueOf(15), Integer.valueOf(16), Integer.valueOf(17), Integer.valueOf(18)
    }));
    private static final List zzamb = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(1), Integer.valueOf(18)
    }));
    private static final List zzamc = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(2), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8), Integer.valueOf(10), Integer.valueOf(12), Integer.valueOf(14), Integer.valueOf(16)
    }));
    private static final List zzamd = Collections.unmodifiableList(Arrays.asList(new Integer[] {
        Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(7), Integer.valueOf(9), Integer.valueOf(11), Integer.valueOf(13), Integer.valueOf(15), Integer.valueOf(17)
    }));
    private final int zzFG;
    private final List zzame;

    zzb(int i, List list)
    {
        zzFG = i;
        zzame = list;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int getVersionCode()
    {
        return zzFG;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

    public final List zzpq()
    {
        return zzame;
    }

}
