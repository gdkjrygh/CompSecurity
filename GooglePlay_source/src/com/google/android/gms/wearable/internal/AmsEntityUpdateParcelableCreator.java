// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            AmsEntityUpdateParcelable

public final class AmsEntityUpdateParcelableCreator
    implements android.os.Parcelable.Creator
{

    public AmsEntityUpdateParcelableCreator()
    {
    }

    static void writeToParcel$60aac80a(AmsEntityUpdateParcelable amsentityupdateparcelable, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, amsentityupdateparcelable.mVersionCode);
        SafeParcelWriter.writeByte(parcel, 2, amsentityupdateparcelable.mEntityId);
        SafeParcelWriter.writeByte(parcel, 3, amsentityupdateparcelable.mAttributeId);
        SafeParcelWriter.writeString(parcel, 4, amsentityupdateparcelable.mValue, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        byte byte1 = 0;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        byte byte0 = 0;
        int i = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    SafeParcelReader.skipUnknownField(parcel, k);
                    break;

                case 1: // '\001'
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    byte0 = SafeParcelReader.readByte(parcel, k);
                    break;

                case 3: // '\003'
                    byte1 = SafeParcelReader.readByte(parcel, k);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new AmsEntityUpdateParcelable(i, byte0, byte1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new AmsEntityUpdateParcelable[i];
    }
}
