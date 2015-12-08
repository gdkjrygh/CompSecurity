// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            CapabilityInfoParcelableCreator

public class CapabilityInfoParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new CapabilityInfoParcelableCreator();
    private final Object mLock = new Object();
    final String mName;
    final List mNodeList;
    private Set mNodes;
    final int mVersionCode;

    CapabilityInfoParcelable(int i, String s, List list)
    {
        mVersionCode = i;
        mName = s;
        mNodeList = list;
        mNodes = null;
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
            obj = (CapabilityInfoParcelable)obj;
            if (mVersionCode != ((CapabilityInfoParcelable) (obj)).mVersionCode)
            {
                return false;
            }
            if (mName == null ? ((CapabilityInfoParcelable) (obj)).mName != null : !mName.equals(((CapabilityInfoParcelable) (obj)).mName))
            {
                return false;
            }
            if (mNodeList == null ? ((CapabilityInfoParcelable) (obj)).mNodeList != null : !mNodeList.equals(((CapabilityInfoParcelable) (obj)).mNodeList))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int k = mVersionCode;
        int i;
        if (mName != null)
        {
            i = mName.hashCode();
        } else
        {
            i = 0;
        }
        if (mNodeList != null)
        {
            j = mNodeList.hashCode();
        }
        return (k * 31 + i) * 31 + j;
    }

    public String toString()
    {
        return (new StringBuilder("CapabilityInfo{")).append(mName).append(", ").append(mNodeList).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        CapabilityInfoParcelableCreator.writeToParcel$c097acd(this, parcel);
    }

}
