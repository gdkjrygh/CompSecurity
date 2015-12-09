// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.internal.model:
//            User

public final class UserCreator
    implements android.os.Parcelable.Creator
{

    public UserCreator()
    {
    }

    static void writeToParcel(User user, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = user.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, user.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeString(parcel, 2, user.mDisplayName, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, user.mEmailAddress, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            SafeParcelWriter.writeBoolean(parcel, 7, user.mIsAuthenticatedUser);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            SafeParcelWriter.writeString(parcel, 9, user.mPermissionId, true);
        }
        if (set.contains(Integer.valueOf(10)))
        {
            SafeParcelWriter.writeParcelable(parcel, 10, user.mPicture, i, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        User.Picture picture = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        String s1 = null;
        String s2 = null;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 3: // '\003'
                case 4: // '\004'
                case 6: // '\006'
                case 8: // '\b'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 7: // '\007'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, k);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    picture = (User.Picture)SafeParcelReader.createParcelable(parcel, k, User.Picture.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != j)
                {
                    throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
                }
                return new User(hashset, i, s2, s1, flag, s, picture);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new User[i];
    }
}
