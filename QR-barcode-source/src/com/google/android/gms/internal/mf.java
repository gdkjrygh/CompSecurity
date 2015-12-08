// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            mg

public class mf
    implements SafeParcelable
{

    public static final mg CREATOR = new mg();
    final int BR;
    private final boolean afn;
    private final List afo;

    mf(int i, boolean flag, List list)
    {
        BR = i;
        afn = flag;
        afo = list;
    }

    public int describeContents()
    {
        mg mg1 = CREATOR;
        return 0;
    }

    public boolean me()
    {
        return afn;
    }

    public List mf()
    {
        return afo;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mg mg1 = CREATOR;
        mg.a(this, parcel, i);
    }

}
