// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzux

public class zzuw
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzux();
    final int zzFG;
    final boolean zzawX;
    final List zzawY;

    zzuw(int i, boolean flag, List list)
    {
        zzFG = i;
        zzawX = flag;
        zzawY = list;
    }

    public zzuw(boolean flag, Set set)
    {
        this(1, flag, zza(set));
    }

    private static List zza(Set set)
    {
        if (set == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(new ArrayList(set));
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzux.zza(this, parcel, i);
    }

}
