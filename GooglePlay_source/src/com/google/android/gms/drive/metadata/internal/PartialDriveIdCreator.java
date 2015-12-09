// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            PartialDriveId

public final class PartialDriveIdCreator
    implements android.os.Parcelable.Creator
{

    public PartialDriveIdCreator()
    {
    }

    static void writeToParcel$5a64729d(PartialDriveId partialdriveid, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, partialdriveid.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, partialdriveid.mResourceId, false);
        SafeParcelWriter.writeLong(parcel, 3, partialdriveid.mSqlId);
        SafeParcelWriter.writeInt(parcel, 4, partialdriveid.mResourceType);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int k = SafeParcelReader.validateObjectHeader(parcel);
        int j = 0;
        String s = null;
        long l1 = 0L;
        int i = -1;
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
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, l);
                    break;

                case 3: // '\003'
                    l1 = SafeParcelReader.readLong(parcel, l);
                    break;

                case 4: // '\004'
                    i = SafeParcelReader.readInt(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != k)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(k).toString(), parcel);
            } else
            {
                return new PartialDriveId(j, s, l1, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new PartialDriveId[i];
    }
}
