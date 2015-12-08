// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableCollaboratorCreator

public class ParcelableCollaborator
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ParcelableCollaboratorCreator();
    final String mColor;
    final String mDisplayName;
    final boolean mIsAnonymous;
    final boolean mIsMe;
    final String mPhotoUrl;
    final String mSessionId;
    final String mUserId;
    final int mVersionCode;

    ParcelableCollaborator(int i, boolean flag, boolean flag1, String s, String s1, String s2, String s3, 
            String s4)
    {
        mVersionCode = i;
        mIsMe = flag;
        mIsAnonymous = flag1;
        mSessionId = s;
        mUserId = s1;
        mDisplayName = s2;
        mColor = s3;
        mPhotoUrl = s4;
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
        if (!(obj instanceof ParcelableCollaborator))
        {
            return false;
        } else
        {
            obj = (ParcelableCollaborator)obj;
            return mSessionId.equals(((ParcelableCollaborator) (obj)).mSessionId);
        }
    }

    public int hashCode()
    {
        return mSessionId.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("Collaborator [isMe=")).append(mIsMe).append(", isAnonymous=").append(mIsAnonymous).append(", sessionId=").append(mSessionId).append(", userId=").append(mUserId).append(", displayName=").append(mDisplayName).append(", color=").append(mColor).append(", photoUrl=").append(mPhotoUrl).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ParcelableCollaboratorCreator.writeToParcel$65d9073c(this, parcel);
    }

}
