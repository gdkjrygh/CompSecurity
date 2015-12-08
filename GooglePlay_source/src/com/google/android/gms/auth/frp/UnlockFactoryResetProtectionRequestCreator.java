// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.frp;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.auth.frp:
//            UnlockFactoryResetProtectionRequest

public final class UnlockFactoryResetProtectionRequestCreator
    implements android.os.Parcelable.Creator
{

    public UnlockFactoryResetProtectionRequestCreator()
    {
    }

    static void writeToParcel$2e3e959d(UnlockFactoryResetProtectionRequest unlockfactoryresetprotectionrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, unlockfactoryresetprotectionrequest.version);
        SafeParcelWriter.writeString(parcel, 2, unlockfactoryresetprotectionrequest.accountName, false);
        SafeParcelWriter.writeString(parcel, 3, unlockfactoryresetprotectionrequest.password, false);
        SafeParcelWriter.writeString(parcel, 4, unlockfactoryresetprotectionrequest.accountType, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s2 = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = 0;
        String s1 = null;
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
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new UnlockFactoryResetProtectionRequest(i, s, s1, s2);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new UnlockFactoryResetProtectionRequest[i];
    }
}
