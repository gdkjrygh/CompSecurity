// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            GetPermissionStatusRequest, INearbyMessagesCallback

public final class GetPermissionStatusRequestCreator
    implements android.os.Parcelable.Creator
{

    public GetPermissionStatusRequestCreator()
    {
    }

    static void writeToParcel$37f406ad(GetPermissionStatusRequest getpermissionstatusrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, getpermissionstatusrequest.mVersionCode);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 2, getpermissionstatusrequest.callback.asBinder());
        SafeParcelWriter.writeString(parcel, 3, getpermissionstatusrequest.zeroPartyPackageName, false);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        android.os.IBinder ibinder = null;
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
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 3: // '\003'
                    s = SafeParcelReader.createString(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new GetPermissionStatusRequest(i, ibinder, s);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new GetPermissionStatusRequest[i];
    }
}
