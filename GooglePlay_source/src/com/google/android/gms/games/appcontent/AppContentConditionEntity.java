// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentCondition, AppContentConditionEntityCreator

public final class AppContentConditionEntity
    implements SafeParcelable, AppContentCondition
{

    public static final AppContentConditionEntityCreator CREATOR = new AppContentConditionEntityCreator();
    final String mDefaultValue;
    final String mExpectedValue;
    final String mPredicate;
    private final Bundle mPredicateParameters;
    final int mVersionCode;

    AppContentConditionEntity(int i, String s, String s1, String s2, Bundle bundle)
    {
        mVersionCode = i;
        mDefaultValue = s;
        mExpectedValue = s1;
        mPredicate = s2;
        mPredicateParameters = bundle;
    }

    public AppContentConditionEntity(AppContentCondition appcontentcondition)
    {
        mVersionCode = 1;
        mDefaultValue = appcontentcondition.getDefaultValue();
        mExpectedValue = appcontentcondition.getExpectedValue();
        mPredicate = appcontentcondition.getPredicate();
        mPredicateParameters = appcontentcondition.getPredicateParameters();
    }

    static boolean equals(AppContentCondition appcontentcondition, Object obj)
    {
        if (obj instanceof AppContentCondition)
        {
            if (appcontentcondition == obj)
            {
                return true;
            }
            obj = (AppContentCondition)obj;
            if (Objects.equal(((AppContentCondition) (obj)).getDefaultValue(), appcontentcondition.getDefaultValue()) && Objects.equal(((AppContentCondition) (obj)).getExpectedValue(), appcontentcondition.getExpectedValue()) && Objects.equal(((AppContentCondition) (obj)).getPredicate(), appcontentcondition.getPredicate()) && Objects.equal(((AppContentCondition) (obj)).getPredicateParameters(), appcontentcondition.getPredicateParameters()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(AppContentCondition appcontentcondition)
    {
        return Arrays.hashCode(new Object[] {
            appcontentcondition.getDefaultValue(), appcontentcondition.getExpectedValue(), appcontentcondition.getPredicate(), appcontentcondition.getPredicateParameters()
        });
    }

    static String toString(AppContentCondition appcontentcondition)
    {
        return Objects.toStringHelper(appcontentcondition).add("DefaultValue", appcontentcondition.getDefaultValue()).add("ExpectedValue", appcontentcondition.getExpectedValue()).add("Predicate", appcontentcondition.getPredicate()).add("PredicateParameters", appcontentcondition.getPredicateParameters()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((AppContentCondition) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDefaultValue()
    {
        return mDefaultValue;
    }

    public final String getExpectedValue()
    {
        return mExpectedValue;
    }

    public final String getPredicate()
    {
        return mPredicate;
    }

    public final Bundle getPredicateParameters()
    {
        return mPredicateParameters;
    }

    public final int hashCode()
    {
        return hashCode(((AppContentCondition) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((AppContentCondition) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppContentConditionEntityCreator.writeToParcel$601a49b(this, parcel);
    }

}
