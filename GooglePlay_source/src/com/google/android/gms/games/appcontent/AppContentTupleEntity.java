// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.appcontent:
//            AppContentTuple, AppContentTupleEntityCreator

public final class AppContentTupleEntity
    implements SafeParcelable, AppContentTuple
{

    public static final AppContentTupleEntityCreator CREATOR = new AppContentTupleEntityCreator();
    final String mName;
    final String mValue;
    final int mVersionCode;

    AppContentTupleEntity(int i, String s, String s1)
    {
        mVersionCode = i;
        mName = s;
        mValue = s1;
    }

    public AppContentTupleEntity(AppContentTuple appcontenttuple)
    {
        mVersionCode = 1;
        mName = appcontenttuple.getName();
        mValue = appcontenttuple.getValue();
    }

    static boolean equals(AppContentTuple appcontenttuple, Object obj)
    {
        if (obj instanceof AppContentTuple)
        {
            if (appcontenttuple == obj)
            {
                return true;
            }
            obj = (AppContentTuple)obj;
            if (Objects.equal(((AppContentTuple) (obj)).getName(), appcontenttuple.getName()) && Objects.equal(((AppContentTuple) (obj)).getValue(), appcontenttuple.getValue()))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(AppContentTuple appcontenttuple)
    {
        return Arrays.hashCode(new Object[] {
            appcontenttuple.getName(), appcontenttuple.getValue()
        });
    }

    static String toString(AppContentTuple appcontenttuple)
    {
        return Objects.toStringHelper(appcontenttuple).add("Name", appcontenttuple.getName()).add("Value", appcontenttuple.getValue()).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((AppContentTuple) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getName()
    {
        return mName;
    }

    public final String getValue()
    {
        return mValue;
    }

    public final int hashCode()
    {
        return hashCode(((AppContentTuple) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final String toString()
    {
        return toString(((AppContentTuple) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        AppContentTupleEntityCreator.writeToParcel$37052572(this, parcel);
    }

}
