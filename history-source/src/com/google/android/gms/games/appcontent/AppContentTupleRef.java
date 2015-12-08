// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentTuple, AppContentTupleEntity

public final class AppContentTupleRef extends d
    implements AppContentTuple
{

    AppContentTupleRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentTupleEntity.a(this, obj);
    }

    public Object freeze()
    {
        return ld();
    }

    public String getName()
    {
        return getString("tuple_name");
    }

    public String getValue()
    {
        return getString("tuple_value");
    }

    public int hashCode()
    {
        return AppContentTupleEntity.a(this);
    }

    public AppContentTuple ld()
    {
        return new AppContentTupleEntity(this);
    }

    public String toString()
    {
        return AppContentTupleEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentTupleEntity)ld()).writeToParcel(parcel, i);
    }
}
