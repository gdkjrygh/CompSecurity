// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;

public abstract class jwv extends Binder
    implements jwu
{

    public jwv()
    {
        attachInterface(this, "com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        String s1 = null;
        Object obj = null;
        String s = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            a(parcel.readInt());
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            parcel1 = s;
            if (parcel.readInt() != 0)
            {
                parcel1 = (ApplicationMetadata)ApplicationMetadata.CREATOR.createFromParcel(parcel);
            }
            s = parcel.readString();
            s1 = parcel.readString();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(parcel1, s, s1, flag);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            b(parcel.readInt());
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            parcel.readString();
            parcel.readDouble();
            parcel.readInt();
            b();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            a(parcel.readString(), parcel.readString());
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            a(parcel.readString(), parcel.createByteArray());
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            d(parcel.readInt());
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            c(parcel.readInt());
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            e(parcel.readInt());
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            parcel.readString();
            a(parcel.readLong(), parcel.readInt());
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            parcel.readString();
            a(parcel.readLong());
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            parcel1 = s1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (ApplicationStatus)ApplicationStatus.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
            parcel1 = obj;
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel1 = (DeviceStatus)DeviceStatus.CREATOR.createFromParcel(parcel);
        }
        a(parcel1);
        return true;
    }
}
