// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            RegisterStatusCallbackRequest, INearbyMessagesCallback, IStatusCallback

public final class RegisterStatusCallbackRequestCreator
    implements android.os.Parcelable.Creator
{

    public RegisterStatusCallbackRequestCreator()
    {
    }

    static void writeToParcel$55f0b97e(RegisterStatusCallbackRequest registerstatuscallbackrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, registerstatuscallbackrequest.versionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, registerstatuscallbackrequest.callback.asBinder());
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, registerstatuscallbackrequest.statusCallback.asBinder());
        SafeParcelWriter.writeBoolean(parcel, 4, registerstatuscallbackrequest.isRegister);
        SafeParcelWriter.writeString(parcel, 5, registerstatuscallbackrequest.zeroPartyPackageName, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        boolean flag = false;
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        android.os.IBinder ibinder = null;
        android.os.IBinder ibinder1 = null;
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
                    ibinder1 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 4: // '\004'
                    flag = SafeParcelReader.readBoolean(parcel, k);
                    break;

                case 5: // '\005'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new RegisterStatusCallbackRequest(i, ibinder1, ibinder, flag, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new RegisterStatusCallbackRequest[i];
    }
}
