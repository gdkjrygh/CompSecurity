// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.people.identity.models.ImageReference;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            ImageReferenceImplCreator

public class ImageReferenceImpl
    implements SafeParcelable, ImageReference
{

    public static final ImageReferenceImplCreator CREATOR = new ImageReferenceImplCreator();
    byte mData[];
    final Set mIndicatorSet;
    String mLocation;
    int mType;
    final int mVersionCode;

    public ImageReferenceImpl()
    {
        mIndicatorSet = new HashSet();
        mVersionCode = 1;
    }

    ImageReferenceImpl(Set set, int i, int j, String s, byte abyte0[])
    {
        mIndicatorSet = set;
        mVersionCode = i;
        mType = j;
        mLocation = s;
        mData = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ImageReferenceImplCreator.writeToParcel$56cbb33c(this, parcel);
    }

}
