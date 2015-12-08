// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            TrustedDevicesRequest, INearbySharingCallback

public final class TrustedDevicesRequestCreator
    implements android.os.Parcelable.Creator
{

    public TrustedDevicesRequestCreator()
    {
    }

    static void writeToParcel$73b9be4a(TrustedDevicesRequest trusteddevicesrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, trusteddevicesrequest.versionCode);
        SafeParcelWriter.writeString(parcel, 2, trusteddevicesrequest.deviceIdentifier, false);
        SafeParcelWriter.writeByteArray(parcel, 3, trusteddevicesrequest.message, false);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 4, trusteddevicesrequest.callback.asBinder());
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        String s = null;
        int i = 0;
        byte abyte0[] = null;
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
                    abyte0 = SafeParcelReader.createByteArray(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TrustedDevicesRequest(i, s, abyte0, ibinder);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new TrustedDevicesRequest[i];
    }
}
