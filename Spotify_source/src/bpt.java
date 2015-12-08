// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.JoinOptions;
import com.google.android.gms.cast.LaunchOptions;

public abstract class bpt extends Binder
    implements bps
{

    public static bps a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        if (iinterface != null && (iinterface instanceof bps))
        {
            return (bps)iinterface;
        } else
        {
            return new bpu(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag3 = false;
        boolean flag = false;
        String s;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.cast.internal.ICastDeviceController");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            a();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(parcel1, flag);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            a(parcel.readString(), parcel.readString());
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            b();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            a(parcel.readString());
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            c();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            double d = parcel.readDouble();
            double d2 = parcel.readDouble();
            boolean flag1;
            if (parcel.readInt() != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a(d, d2, flag1);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            double d1;
            boolean flag2;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            d1 = parcel.readDouble();
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            }
            a(flag2, d1, flag3);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            a(parcel.readString(), parcel.readString(), parcel.readLong());
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            a(parcel.readString(), parcel.createByteArray(), parcel.readLong());
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            b(parcel.readString());
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            c(parcel.readString());
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (LaunchOptions)LaunchOptions.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel1, parcel);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.cast.internal.ICastDeviceController");
            parcel1 = parcel.readString();
            s = parcel.readString();
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (JoinOptions)JoinOptions.CREATOR.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        a(parcel1, s, parcel);
        return true;
    }
}
