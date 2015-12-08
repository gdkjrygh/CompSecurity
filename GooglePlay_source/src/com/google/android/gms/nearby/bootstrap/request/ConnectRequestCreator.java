// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.bootstrap.request;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.nearby.bootstrap.Device;
import com.google.android.gms.nearby.bootstrap.internal.IConnectionListener;
import com.google.android.gms.nearby.bootstrap.internal.IDataListener;
import com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapCallback;

// Referenced classes of package com.google.android.gms.nearby.bootstrap.request:
//            ConnectRequest

public final class ConnectRequestCreator
    implements android.os.Parcelable.Creator
{

    public ConnectRequestCreator()
    {
    }

    public static ConnectRequest createFromParcel(Parcel parcel)
    {
        int j = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        Device device = null;
        String s2 = null;
        String s1 = null;
        byte byte1 = 0;
        long l = 0L;
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
                    device = (Device)SafeParcelReader.createParcelable(parcel, k, Device.CREATOR);
                    break;

                case 1000: 
                    i = SafeParcelReader.readInt(parcel, k);
                    break;

                case 2: // '\002'
                    s2 = SafeParcelReader.createString(parcel, k);
                    break;

                case 3: // '\003'
                    s1 = SafeParcelReader.createString(parcel, k);
                    break;

                case 4: // '\004'
                    ibinder2 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 5: // '\005'
                    ibinder1 = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 6: // '\006'
                    ibinder = SafeParcelReader.readIBinder(parcel, k);
                    break;

                case 7: // '\007'
                    byte1 = SafeParcelReader.readByte(parcel, k);
                    break;

                case 8: // '\b'
                    l = SafeParcelReader.readLong(parcel, k);
                    break;

                case 9: // '\t'
                    s = SafeParcelReader.createString(parcel, k);
                    break;

                case 10: // '\n'
                    byte0 = SafeParcelReader.readByte(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new ConnectRequest(i, device, s2, s1, byte1, l, s, byte0, ibinder2, ibinder1, ibinder);
            }
        } while (true);
    }

    static void writeToParcel(ConnectRequest connectrequest, Parcel parcel, int i)
    {
        Object obj = null;
        int j = SafeParcelWriter.beginVariableData(parcel, 20293);
        SafeParcelWriter.writeParcelable(parcel, 1, connectrequest.device, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, connectrequest.versionCode);
        SafeParcelWriter.writeString(parcel, 2, connectrequest.name, false);
        SafeParcelWriter.writeString(parcel, 3, connectrequest.description, false);
        android.os.IBinder ibinder;
        if (connectrequest.connectionListener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = connectrequest.connectionListener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 4, ibinder);
        if (connectrequest.dataListener == null)
        {
            ibinder = null;
        } else
        {
            ibinder = connectrequest.dataListener.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 5, ibinder);
        if (connectrequest.callback == null)
        {
            ibinder = obj;
        } else
        {
            ibinder = connectrequest.callback.asBinder();
        }
        SafeParcelWriter.writeIBinder$cdac282(parcel, 6, ibinder);
        SafeParcelWriter.writeByte(parcel, 7, connectrequest.deviceType);
        SafeParcelWriter.writeLong(parcel, 8, connectrequest.timeoutMillis);
        SafeParcelWriter.writeString(parcel, 9, connectrequest.token, false);
        SafeParcelWriter.writeByte(parcel, 10, connectrequest.connectType);
        SafeParcelWriter.finishVariableData(parcel, j);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ConnectRequest[i];
    }
}
