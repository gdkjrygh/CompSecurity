// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal.event;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.realtime.internal.event:
//            ReferenceShiftedDetails

public final class ReferenceShiftedDetailsCreator
    implements android.os.Parcelable.Creator
{

    public ReferenceShiftedDetailsCreator()
    {
    }

    static void writeToParcel$3006c340(ReferenceShiftedDetails referenceshifteddetails, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, referenceshifteddetails.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, referenceshifteddetails.mOldObjectId, false);
        SafeParcelWriter.writeString(parcel, 3, referenceshifteddetails.mNewObjectId, false);
        SafeParcelWriter.writeInt(parcel, 4, referenceshifteddetails.mOldIndex);
        SafeParcelWriter.writeInt(parcel, 5, referenceshifteddetails.mNewIndex);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int i = 0;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s1 = null;
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
                    s1 = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 4: // '\004'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 5: // '\005'
                    i = SafeParcelReader.readInt(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != l)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(l).toString(), parcel);
            } else
            {
                return new ReferenceShiftedDetails(k, s1, s, j, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ReferenceShiftedDetails[i];
    }
}
