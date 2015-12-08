// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive:
//            Permission

public final class PermissionCreator
    implements android.os.Parcelable.Creator
{

    public PermissionCreator()
    {
    }

    static void writeToParcel$7e5b0ca4(Permission permission, Parcel parcel)
    {
        int i;
        byte byte0 = -1;
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, permission.mVersionCode);
        String s;
        if (!Permission.isValidExposedAccountType(permission.mAccountType))
        {
            s = null;
        } else
        {
            s = permission.mAccountIdentifier;
        }
        SafeParcelWriter.writeString(parcel, 2, s, false);
        if (!Permission.isValidExposedAccountType(permission.mAccountType))
        {
            i = -1;
        } else
        {
            i = permission.mAccountType;
        }
        SafeParcelWriter.writeInt(parcel, 3, i);
        SafeParcelWriter.writeString(parcel, 4, permission.mAccountDisplayName, false);
        SafeParcelWriter.writeString(parcel, 5, permission.mPhotoLink, false);
        switch (permission.mRole)
        {
        default:
            i = 0;
            break;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            break MISSING_BLOCK_LABEL_161;
        }
_L1:
        if (i == 0)
        {
            i = byte0;
        } else
        {
            i = permission.mRole;
        }
        SafeParcelWriter.writeInt(parcel, 6, i);
        SafeParcelWriter.writeBoolean(parcel, 7, permission.mIsLinkRequired);
        SafeParcelWriter.finishVariableData(parcel, j);
        return;
        i = 1;
          goto _L1
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s1 = null;
        int j = 0;
        String s2 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < l)
            {
                int i1 = parcel.readInt();
                switch (0xffff & i1)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, i1);
                    break;

                case 1: // '\001'
                    k = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 2: // '\002'
                    s2 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new Permission(k, s2, j, s1, s, i, flag);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Permission[i];
    }
}
