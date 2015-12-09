// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.firstparty.proximity.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.firstparty.proximity.data:
//            Permit, PermitAccess

public final class PermitCreator
    implements android.os.Parcelable.Creator
{

    public PermitCreator()
    {
    }

    static void writeToParcel(Permit permit, Parcel parcel, int i)
    {
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, permit.mVersion);
        SafeParcelWriter.writeString(parcel, 2, permit.mId, false);
        SafeParcelWriter.writeString(parcel, 3, permit.mAccountId, false);
        SafeParcelWriter.writeString(parcel, 5, permit.mType, false);
        SafeParcelWriter.writeParcelable(parcel, 6, permit.mLicense, i, false);
        SafeParcelWriter.writeTypedList(parcel, 7, permit.mRequesterAccessesCache, false);
        SafeParcelWriter.writeStringList(parcel, 8, permit.mAllowedChannelsCache, false);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        java.util.ArrayList arraylist = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        java.util.ArrayList arraylist1 = null;
        PermitAccess permitaccess = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                case 4: // '\004'
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 6: // '\006'
                    permitaccess = (PermitAccess)SafeParcelReader.createParcelable(parcel, k, PermitAccess.CREATOR);
                    break;

                case 7: // '\007'
                    arraylist1 = SafeParcelReader.createTypedList(parcel, k, PermitAccess.CREATOR);
                    break;

                case 8: // '\b'
                    arraylist = SafeParcelReader.createStringList(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new Permit(i, s2, s1, s, permitaccess, arraylist1, arraylist);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new Permit[i];
    }
}
