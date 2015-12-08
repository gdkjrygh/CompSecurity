// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.internal:
//            lj

public class li
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new lj();
    private final int BR;
    private final DataSource Sq;

    li(int i, DataSource datasource)
    {
        BR = i;
        Sq = datasource;
    }

    public int describeContents()
    {
        return 0;
    }

    public DataSource getDataSource()
    {
        return Sq;
    }

    int getVersionCode()
    {
        return BR;
    }

    public String toString()
    {
        return String.format("ApplicationUnregistrationRequest{%s}", new Object[] {
            Sq
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        lj.a(this, parcel, i);
    }

}
