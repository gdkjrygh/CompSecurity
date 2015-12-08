// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, EventsImplCreator

public static class mDate
    implements SafeParcelable, com.google.android.gms.people.identity.models.entsImpl
{

    public static final EventsImplCreator CREATOR = new EventsImplCreator();
    String mDate;
    String mFormattedType;
    final Set mIndicatorSet;
    l mMetadata;
    String mType;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        EventsImplCreator.writeToParcel(this, parcel, i);
    }


    public l()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    l(Set set, int i, l l, String s, String s1, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = l;
        mFormattedType = s;
        mType = s1;
        mDate = s2;
    }
}
