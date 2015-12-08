// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            MultiDataBufferRef, AppContentCondition, AppContentConditionEntity, AppContentUtils

public final class AppContentConditionRef extends MultiDataBufferRef
    implements AppContentCondition
{

    AppContentConditionRef(ArrayList arraylist, int i)
    {
        super(arraylist, 4, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return AppContentConditionEntity.a(this, obj);
    }

    public Object freeze()
    {
        return kX();
    }

    public int hashCode()
    {
        return AppContentConditionEntity.a(this);
    }

    public String kT()
    {
        return getString("condition_default_value");
    }

    public String kU()
    {
        return getString("condition_expected_value");
    }

    public String kV()
    {
        return getString("condition_predicate");
    }

    public Bundle kW()
    {
        return AppContentUtils.d(JG, XX, "condition_predicate_parameters", KZ);
    }

    public AppContentCondition kX()
    {
        return new AppContentConditionEntity(this);
    }

    public String toString()
    {
        return AppContentConditionEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentConditionEntity)kX()).writeToParcel(parcel, i);
    }
}
