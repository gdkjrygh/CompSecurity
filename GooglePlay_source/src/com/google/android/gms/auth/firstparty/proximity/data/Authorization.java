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
//            AuthorizationCreator

public class Authorization
    implements SafeParcelable
{

    public static final AuthorizationCreator CREATOR = new AuthorizationCreator();
    public final byte mData[];
    public final String mPermitAccessId;
    public final String mPermitId;
    final int mVersion;

    Authorization(int i, String s, String s1, byte abyte0[])
    {
        mVersion = i;
        mPermitId = Preconditions.checkNotEmpty(s);
        mPermitAccessId = Preconditions.checkNotEmpty(s1);
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
            if (obj instanceof Authorization)
            {
                obj = (Authorization)obj;
                if (TextUtils.equals(mPermitId, ((Authorization) (obj)).mPermitId) && TextUtils.equals(mPermitAccessId, ((Authorization) (obj)).mPermitAccessId) && Arrays.equals(mData, ((Authorization) (obj)).mData))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode()
    {
        return ((mPermitId.hashCode() + 527) * 31 + mPermitAccessId.hashCode()) * 31 + Arrays.hashCode(mData);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        AuthorizationCreator.writeToParcel$66b24f1e(this, parcel);
    }

}
