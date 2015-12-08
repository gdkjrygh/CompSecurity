// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            PersonImpl, CoverPhotosImplCreator, ImageReferenceImpl

public static class mDefault
    implements SafeParcelable, com.google.android.gms.people.identity.models.otosImpl
{

    public static final CoverPhotosImplCreator CREATOR = new CoverPhotosImplCreator();
    boolean mDefault;
    int mHeight;
    String mId;
    ImageReferenceImpl mImageReference;
    final Set mIndicatorSet;
    final int mVersionCode;
    int mWidth;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CoverPhotosImplCreator.writeToParcel(this, parcel, i);
    }


    public ()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    mVersionCode(Set set, int i, int j, String s, ImageReferenceImpl imagereferenceimpl, int k, boolean flag)
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mHeight = j;
        mId = s;
        mImageReference = imagereferenceimpl;
        mWidth = k;
        mDefault = flag;
    }
}
