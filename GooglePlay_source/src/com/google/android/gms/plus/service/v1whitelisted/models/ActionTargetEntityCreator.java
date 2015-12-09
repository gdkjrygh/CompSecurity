// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.service.v1whitelisted.models;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.plus.service.v1whitelisted.models:
//            ActionTargetEntity, AclDetailsEntity, LoggedProfileEntity

public final class ActionTargetEntityCreator
    implements android.os.Parcelable.Creator
{

    public ActionTargetEntityCreator()
    {
    }

    static void writeToParcel(ActionTargetEntity actiontargetentity, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        Set set = actiontargetentity.mIndicatorSet;
        if (set.contains(Integer.valueOf(1)))
        {
            SafeParcelWriter.writeInt(parcel, 1, actiontargetentity.mVersionCode);
        }
        if (set.contains(Integer.valueOf(2)))
        {
            SafeParcelWriter.writeParcelable(parcel, 2, actiontargetentity.mAclDetails, i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            SafeParcelWriter.writeString(parcel, 5, actiontargetentity.mActivityId, true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            SafeParcelWriter.writeInt(parcel, 6, actiontargetentity.mAlphabeticalAclListCount);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            SafeParcelWriter.writeStringList(parcel, 25, actiontargetentity.mGaiaId, true);
        }
        if (set.contains(Integer.valueOf(89)))
        {
            SafeParcelWriter.writeStringList(parcel, 89, actiontargetentity.mTargetType, true);
        }
        if (set.contains(Integer.valueOf(62)))
        {
            SafeParcelWriter.writeString(parcel, 62, actiontargetentity.mProfileData, true);
        }
        if (set.contains(Integer.valueOf(61)))
        {
            SafeParcelWriter.writeParcelable(parcel, 61, actiontargetentity.mProfile, i, true);
        }
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int k = SafeParcelReader.validateObjectHeader(parcel);
        HashSet hashset = new HashSet();
        String s = null;
        LoggedProfileEntity loggedprofileentity = null;
        java.util.ArrayList arraylist1 = null;
        String s1 = null;
        AclDetailsEntity acldetailsentity = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < k)
            {
                int l = parcel.readInt();
                switch (0xffff & l)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, l);
                    break;

                case 1: // '\001'
                    j = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    acldetailsentity = (AclDetailsEntity)SafeParcelReader.createParcelable(parcel, l, AclDetailsEntity.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 5: // '\005'
                    s1 = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    i = SafeParcelReader.readInt(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 25: // '\031'
                    arraylist1 = SafeParcelReader.createStringList(parcel, l);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 89: // 'Y'
                    arraylist = SafeParcelReader.createStringList(parcel, l);
                    hashset.add(Integer.valueOf(89));
                    break;

                case 62: // '>'
                    s = SafeParcelReader.createString(parcel, l);
                    hashset.add(Integer.valueOf(62));
                    break;

                case 61: // '='
                    loggedprofileentity = (LoggedProfileEntity)SafeParcelReader.createParcelable(parcel, l, LoggedProfileEntity.CREATOR);
                    hashset.add(Integer.valueOf(61));
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new ActionTargetEntity(hashset, j, acldetailsentity, s1, i, arraylist1, loggedprofileentity, s, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ActionTargetEntity[i];
    }
}
