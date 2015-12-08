// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.identity.internal.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.people.identity.internal.models:
//            ParcelableExternalContactCreator

public class ParcelableExternalContact
    implements SafeParcelable
{

    public static final ParcelableExternalContactCreator CREATOR = new ParcelableExternalContactCreator();
    protected final String mAccountType;
    protected final String mDataUri;
    protected final String mDetail;
    protected final String mHeader;
    protected final int mIconRes;
    protected final String mMimeType;
    protected final String mResourcePackageName;
    protected final int mTitleRes;
    final int mVersionCode;

    public ParcelableExternalContact(int i, String s, String s1, int j, String s2, String s3, String s4, 
            int k, String s5)
    {
        mVersionCode = i;
        mDataUri = s;
        mHeader = s1;
        mIconRes = j;
        mDetail = s2;
        mResourcePackageName = s3;
        mMimeType = s4;
        mTitleRes = k;
        mAccountType = s5;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String getAccountType()
    {
        return mAccountType;
    }

    public final String getDataUriString()
    {
        return mDataUri;
    }

    public final String getDetail()
    {
        return mDetail;
    }

    public final String getHeader()
    {
        return mHeader;
    }

    public final int getIconRes()
    {
        return mIconRes;
    }

    public final String getMimeType()
    {
        return mMimeType;
    }

    public final String getResourcePackageName()
    {
        return mResourcePackageName;
    }

    public final int getTitleRes()
    {
        return mTitleRes;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(com/google/android/gms/people/identity/internal/models/ParcelableExternalContact.getSimpleName());
        stringbuffer.append("<dataUri=").append(mDataUri);
        stringbuffer.append(" header=").append(mHeader);
        stringbuffer.append(" detail=").append(mDetail);
        stringbuffer.append(" resourcePackageName=").append(mResourcePackageName);
        stringbuffer.append(" mimeType=").append(mMimeType);
        stringbuffer.append(" titleRes=").append(mTitleRes);
        stringbuffer.append(" iconRes=").append(mIconRes);
        stringbuffer.append(" accountType=").append(mAccountType);
        stringbuffer.append(">");
        return stringbuffer.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelableExternalContactCreator.writeToParcel$efa4e56(this, parcel);
    }

}
