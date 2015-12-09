// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentTuple, AppContentTupleEntity

public final class AppContentTupleRef extends DataBufferRef
    implements AppContentTuple
{

    AppContentTupleRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private AppContentTuple freeze()
    {
        return new AppContentTupleEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return AppContentTupleEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final String getName()
    {
        return getString("tuple_name");
    }

    public final String getValue()
    {
        return getString("tuple_value");
    }

    public final int hashCode()
    {
        return AppContentTupleEntity.hashCode(this);
    }

    public final String toString()
    {
        return AppContentTupleEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentTupleEntity)freeze()).writeToParcel(parcel, i);
    }
}
