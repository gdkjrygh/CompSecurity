// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AmsEntityUpdateParcelableCreator

public class AmsEntityUpdateParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new AmsEntityUpdateParcelableCreator();
    final byte mAttributeId;
    byte mEntityId;
    final String mValue;
    final int mVersionCode;

    AmsEntityUpdateParcelable(int i, byte byte0, byte byte1, String s)
    {
        mEntityId = byte0;
        mVersionCode = i;
        mAttributeId = byte1;
        mValue = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AmsEntityUpdateParcelable)obj;
            if (mEntityId != ((AmsEntityUpdateParcelable) (obj)).mEntityId)
            {
                return false;
            }
            if (mVersionCode != ((AmsEntityUpdateParcelable) (obj)).mVersionCode)
            {
                return false;
            }
            if (mAttributeId != ((AmsEntityUpdateParcelable) (obj)).mAttributeId)
            {
                return false;
            }
            if (!mValue.equals(((AmsEntityUpdateParcelable) (obj)).mValue))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return ((mVersionCode * 31 + mEntityId) * 31 + mAttributeId) * 31 + mValue.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("AmsEntityUpdateParcelable{mVersionCode=")).append(mVersionCode).append(", mEntityId=").append(mEntityId).append(", mAttributeId=").append(mAttributeId).append(", mValue='").append(mValue).append('\'').append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AmsEntityUpdateParcelableCreator.writeToParcel$60aac80a(this, parcel);
    }

}
