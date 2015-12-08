// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, SortKeysImplCreator

public static class mName
    implements SafeParcelable, com.google.android.gms.people.identity.models.KeysImpl
{

    public static final SortKeysImplCreator CREATOR = new SortKeysImplCreator();
    final Set mIndicatorSet;
    String mInteractionRank;
    String mName;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        SortKeysImplCreator.writeToParcel$6b3464d9(this, parcel);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, String s, String s1)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mInteractionRank = s;
        mName = s1;
    }
}
