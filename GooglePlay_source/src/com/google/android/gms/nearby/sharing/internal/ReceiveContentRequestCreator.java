// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            ReceiveContentRequest, INearbySharingCallback, IAppContentReceiver

public final class ReceiveContentRequestCreator
    implements android.os.Parcelable.Creator
{

    public ReceiveContentRequestCreator()
    {
    }

    static void writeToParcel$3585cd86(ReceiveContentRequest receivecontentrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, receivecontentrequest.versionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, receivecontentrequest.clientBinder);
        android.os.IBinder ibinder;
        if (receivecontentrequest.contentReceiver == null)
        {
            ibinder = null;
        } else
        {
            ibinder = receivecontentrequest.contentReceiver.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, ibinder);
        SafeParcelWriter.writeString(parcel, 4, receivecontentrequest.packageName, false);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 5, receivecontentrequest.callback.asBinder());
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        android.os.IBinder ibinder = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s = null;
        android.os.IBinder ibinder1 = null;
        android.os.IBinder ibinder2 = null;
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
                    ibinder2 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 4: // '\004'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ReceiveContentRequest(i, ibinder2, ibinder1, s, ibinder);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ReceiveContentRequest[i];
    }
}
