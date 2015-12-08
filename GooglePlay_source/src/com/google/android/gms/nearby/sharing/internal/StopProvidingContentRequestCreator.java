// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            StopProvidingContentRequest, INearbySharingCallback

public final class StopProvidingContentRequestCreator
    implements android.os.Parcelable.Creator
{

    public StopProvidingContentRequestCreator()
    {
    }

    static void writeToParcel$5cfa03ff(StopProvidingContentRequest stopprovidingcontentrequest, Parcel parcel)
    {
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeInt(parcel, 1, stopprovidingcontentrequest.versionCode);
        SafeParcelWriter.writeLong(parcel, 2, stopprovidingcontentrequest.activityId);
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, stopprovidingcontentrequest.callback.asBinder());
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        long l = 0L;
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
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StopProvidingContentRequest(i, l, ibinder);
            }
        } while (true);
    }

    public final volatile Object[] newArray(int i)
    {
        return new StopProvidingContentRequest[i];
    }
}
