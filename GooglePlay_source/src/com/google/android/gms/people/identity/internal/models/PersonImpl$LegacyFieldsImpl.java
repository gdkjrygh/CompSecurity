// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, LegacyFieldsImplCreator

public static class mMobileOwnerId
    implements SafeParcelable, com.google.android.gms.people.identity.models.eldsImpl
{

    public static final LegacyFieldsImplCreator CREATOR = new LegacyFieldsImplCreator();
    final Set mIndicatorSet;
    String mMobileOwnerId;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        LegacyFieldsImplCreator.writeToParcel$484c5389(this, parcel);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, String s)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMobileOwnerId = s;
    }
}
