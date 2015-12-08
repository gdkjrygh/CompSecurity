// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

// Referenced classes of package com.google.android.gms.internal:
//            mt

public class ms
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new mt();
    private final int CK;
    private final DataSource TN;

    ms(int i, DataSource datasource)
    {
        CK = i;
        TN = datasource;
    }

    public int describeContents()
    {
        return 0;
    }

    public DataSource getDataSource()
    {
        return TN;
    }

    int getVersionCode()
    {
        return CK;
    }

    public String toString()
    {
        return String.format("ApplicationUnregistrationRequest{%s}", new Object[] {
            TN
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        mt.a(this, parcel, i);
    }

}
