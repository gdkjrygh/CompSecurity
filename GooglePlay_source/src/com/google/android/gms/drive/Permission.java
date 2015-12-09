// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.drive:
//            PermissionCreator

public class Permission
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new PermissionCreator();
    String mAccountDisplayName;
    String mAccountIdentifier;
    int mAccountType;
    boolean mIsLinkRequired;
    String mPhotoLink;
    int mRole;
    final int mVersionCode;

    Permission(int i, String s, int j, String s1, String s2, int k, boolean flag)
    {
        mVersionCode = i;
        mAccountIdentifier = s;
        mAccountType = j;
        mAccountDisplayName = s1;
        mPhotoLink = s2;
        mRole = k;
        mIsLinkRequired = flag;
    }

    public static boolean isValidExposedAccountType(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 256: 
        case 257: 
        case 258: 
            return true;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = true;
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == this) goto _L4; else goto _L3
_L3:
        obj = (Permission)obj;
        if (!Objects.equal(mAccountIdentifier, ((Permission) (obj)).mAccountIdentifier) || mAccountType != ((Permission) (obj)).mAccountType || mRole != ((Permission) (obj)).mRole)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (mIsLinkRequired == ((Permission) (obj)).mIsLinkRequired) goto _L4; else goto _L5
_L5:
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            mAccountIdentifier, Integer.valueOf(mAccountType), Integer.valueOf(mRole), Boolean.valueOf(mIsLinkRequired)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        PermissionCreator.writeToParcel$7e5b0ca4(this, parcel);
    }

}
