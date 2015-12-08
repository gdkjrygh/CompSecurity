// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ParcelableIndexReference

public final class ParcelableIndexReferenceCreator
    implements android.os.Parcelable.Creator
{

    public ParcelableIndexReferenceCreator()
    {
    }

    static void writeToParcel$e4d1b7(ParcelableIndexReference parcelableindexreference, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, parcelableindexreference.mVersionCode);
        SafeParcelWriter.writeString(parcel, 2, parcelableindexreference.mObjectId, false);
        SafeParcelWriter.writeInt(parcel, 3, parcelableindexreference.mIndex);
        SafeParcelWriter.writeBoolean(parcel, 4, parcelableindexreference.mLegacyCanBeDeleted);
        SafeParcelWriter.writeInt(parcel, 5, parcelableindexreference.mDeleteMode);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        int l = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = -1;
        int j = 0;
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
                    s = SafeParcelReader.createString(parcel, i1);
                    break;

                case 3: // '\003'
                    j = SafeParcelReader.readInt(parcel, i1);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, i1);
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
                return new ParcelableIndexReference(k, s, j, flag, i);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ParcelableIndexReference[i];
    }
}
