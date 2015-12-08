// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            UserAttributeParcel

public final class UserAttributeParcelCreator
    implements android.os.Parcelable.Creator
{

    public UserAttributeParcelCreator()
    {
    }

    static void writeToParcel$2732f0dd(UserAttributeParcel userattributeparcel, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, userattributeparcel.versionCode);
        SafeParcelWriter.writeString(parcel, 2, userattributeparcel.name, false);
        SafeParcelWriter.writeLong(parcel, 3, userattributeparcel.setTimestamp);
        SafeParcelWriter.writeLongObject$53422a(parcel, 4, userattributeparcel.longValue);
        Float float1 = userattributeparcel.floatValue;
        if (float1 != null)
        {
            SafeParcelWriter.writeHeader(parcel, 5, 4);
            parcel.writeFloat(float1.floatValue());
        }
        SafeParcelWriter.writeString(parcel, 6, userattributeparcel.stringValue, false);
        SafeParcelWriter.writeString(parcel, 7, userattributeparcel.origin, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
        String s = null;
        String s1 = null;
        Float float1 = null;
        Long long1 = null;
        String s2 = null;
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
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 4: // '\004'
                    long1 = SafeParcelReader.readLongObject(parcel, k);
                    break;

                case 5: // '\005'
                    k = SafeParcelReader.readSize(parcel, k);
                    if (k == 0)
                    {
                        float1 = null;
                    } else
                    {
                        SafeParcelReader.enforceSize$ae3cd4b(parcel, k, 4);
                        float1 = Float.valueOf(parcel.readFloat());
                    }
                    break;

                case 6: // '\006'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 7: // '\007'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UserAttributeParcel(i, s2, l, long1, float1, s1, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UserAttributeParcel[i];
    }
}
