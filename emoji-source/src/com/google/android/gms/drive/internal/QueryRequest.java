// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.query.Query;

// Referenced classes of package com.google.android.gms.drive.internal:
//            at

public class QueryRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new at();
    final Query JE;
    final int xM;

    QueryRequest(int i, Query query)
    {
        xM = i;
        JE = query;
    }

    public QueryRequest(Query query)
    {
        this(1, query);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        at.a(this, parcel, i);
    }

}
