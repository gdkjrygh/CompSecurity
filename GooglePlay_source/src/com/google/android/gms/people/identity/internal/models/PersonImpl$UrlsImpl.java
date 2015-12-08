// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, UrlsImplCreator

public static class mValue
    implements SafeParcelable, com.google.android.gms.people.identity.models.UrlsImpl
{

    public static final UrlsImplCreator CREATOR = new UrlsImplCreator();
    String mFormattedType;
    final Set mIndicatorSet;
    mpl mMetadata;
    String mType;
    String mValue;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        UrlsImplCreator.writeToParcel(this, parcel, i);
    }


    public mpl()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mpl(Set set, int i, mpl mpl, String s, String s1, String s2)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = mpl;
        mFormattedType = s;
        mType = s1;
        mValue = s2;
    }
}
