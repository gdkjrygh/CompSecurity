// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.bootstrap.internal.IConnectionListener;
import com.google.android.gms.nearby.bootstrap.internal.IDataListener;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            EnableTargetRequest

public final class EnableTargetRequestCreator
    implements android.os.Parcelable.Creator
{

    public EnableTargetRequestCreator()
    {
    }

    public static EnableTargetRequest createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        String s1 = null;
        String s = null;
        byte byte0 = 0;
        android.os.IBinder ibinder2 = null;
        android.os.IBinder ibinder1 = null;
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
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    ibinder2 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 6: // '\006'
                    byte0 = SafeParcelReader.readByte(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new EnableTargetRequest(i, s1, s, byte0, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    static void writeToParcel$4d0f6732(EnableTargetRequest enabletargetrequest, Parcel parcel)
    {
        Object obj = null;
        int i = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeString(parcel, 1, enabletargetrequest.name, false);
        SafeParcelWriter.writeInt(parcel, 1000, enabletargetrequest.versionCode);
        SafeParcelWriter.writeString(parcel, 2, enabletargetrequest.description, false);
        android.os.IBinder ibinder;
        if (enabletargetrequest.connectionListener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = enabletargetrequest.connectionListener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 3, ibinder);
        if (enabletargetrequest.dataListener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = enabletargetrequest.dataListener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 4, ibinder);
        if (enabletargetrequest.callback == null)
        {
            ibinder = obj;
        } else
        {
            ibinder = enabletargetrequest.callback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 5, ibinder);
        SafeParcelWriter.writeByte(parcel, 6, enabletargetrequest.deviceType);
        SafeParcelWriter.finishVariableData(parcel, i);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new EnableTargetRequest[i];
    }
}
