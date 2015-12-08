// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.proximity.data;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.auth.firstparty.proximity.data:
//            PermitAccessCreator

public class PermitAccess
    implements SafeParcelable
{

    public static final PermitAccessCreator CREATOR = new PermitAccessCreator();
    final byte mData[];
    final String mId;
    final String mType;
    final int mVersion;

    PermitAccess(int i, String s, String s1, byte abyte0[])
    {
        mVersion = i;
        mId = Preconditions.checkNotEmpty(s);
        mType = Preconditions.checkNotEmpty(s1);
        mData = (byte[])Preconditions.checkNotNull(abyte0);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null)
        {
            if (obj == this)
            {
                return true;
            }
            if (obj instanceof PermitAccess)
            {
                obj = (PermitAccess)obj;
                if (TextUtils.equals(mId, ((PermitAccess) (obj)).mId) && TextUtils.equals(mType, ((PermitAccess) (obj)).mType) && Arrays.equals(mData, ((PermitAccess) (obj)).mData))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode()
    {
        return ((mId.hashCode() + 527) * 31 + mType.hashCode()) * 31 + Arrays.hashCode(mData);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PermitAccessCreator.writeToParcel$100fd9a2(this, parcel);
    }

}
