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

    private AppContentCondition freeze()
    {
        return new AppContentConditionEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return AppContentConditionEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final String getDefaultValue()
    {
        return getString("condition_default_value");
    }

    public final String getExpectedValue()
    {
        return getString("condition_expected_value");
    }

    public final String getPredicate()
    {
        return getString("condition_predicate");
    }

    public final Bundle getPredicateParameters()
    {
        return AppContentUtils.getDataTuples(mDataHolder, mDataHolderCollection, "condition_predicate_parameters", mDataRow);
    }

    public final int hashCode()
    {
        return AppContentConditionEntity.hashCode(this);
    }

    public final String toString()
    {
        return AppContentConditionEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((AppContentConditionEntity)freeze()).writeToParcel(parcel, i);
    }
}
