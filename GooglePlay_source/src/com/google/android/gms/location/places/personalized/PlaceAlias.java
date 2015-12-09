// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceAliasCreator

public class PlaceAlias
    implements SafeParcelable
{

    public static final PlaceAliasCreator CREATOR = new PlaceAliasCreator();
    public static final PlaceAlias HOME = new PlaceAlias(0, "Home");
    public static final PlaceAlias WORK = new PlaceAlias(0, "Work");
    final String mAlias;
    final int mVersionCode;

    PlaceAlias(int i, String s)
    {
        mVersionCode = i;
        mAlias = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof PlaceAlias))
        {
            return false;
        } else
        {
            obj = (PlaceAlias)obj;
            return Objects.equal(mAlias, ((PlaceAlias) (obj)).mAlias);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mAlias
        });
    }

    public String toString()
    {
        return Objects.toStringHelper(this).add("alias", mAlias).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PlaceAliasCreator.writeToParcel$4f7349fb(this, parcel);
    }

}
