// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, ImagesImplCreator, ImageReferenceImpl

public static class mDefault
    implements SafeParcelable, com.google.android.gms.people.identity.models.agesImpl
{

    public static final ImagesImplCreator CREATOR = new ImagesImplCreator();
    boolean mDefault;
    ImageReferenceImpl mImageReference;
    final Set mIndicatorSet;
    l mMetadata;
    final int mVersionCode;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ImagesImplCreator.writeToParcel(this, parcel, i);
    }


    public l()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    l(Set set, int i, l l, ImageReferenceImpl imagereferenceimpl, boolean flag)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mMetadata = l;
        mImageReference = imagereferenceimpl;
        mDefault = flag;
    }
}
