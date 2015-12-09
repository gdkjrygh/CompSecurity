// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

public abstract class cru extends Binder
    implements crt
{

    public static crt a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (iinterface != null && (iinterface instanceof crt))
        {
            return (crt)iinterface;
        } else
        {
            return new crv(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag = false;
        crn crn15 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj = null;
        Object obj11 = null;
        Object obj1 = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.wearable.internal.IWearableService");
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn15 = cro.a(parcel.readStrongBinder());
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
            }
            a(crn15, ((ConnectionConfiguration) (obj)));
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(cro.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(cro.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(cro.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn2 = cro.a(parcel.readStrongBinder());
            obj = crn15;
            if (parcel.readInt() != 0)
            {
                obj = (PutDataRequest)PutDataRequest.CREATOR.createFromParcel(parcel);
            }
            a(crn2, ((PutDataRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn3 = cro.a(parcel.readStrongBinder());
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(crn3, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn4 = cro.a(parcel.readStrongBinder());
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            b(crn4, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn5 = cro.a(parcel.readStrongBinder());
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(crn5, ((Uri) (obj)), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn6 = cro.a(parcel.readStrongBinder());
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            c(crn6, ((Uri) (obj)));
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn7 = cro.a(parcel.readStrongBinder());
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            b(crn7, ((Uri) (obj)), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(cro.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn8 = cro.a(parcel.readStrongBinder());
            obj = obj7;
            if (parcel.readInt() != 0)
            {
                obj = (Asset)Asset.CREATOR.createFromParcel(parcel);
            }
            a(crn8, ((Asset) (obj)));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            d(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(cro.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(cro.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 46: // '.'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            d(cro.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 47: // '/'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e(cro.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn9 = cro.a(parcel.readStrongBinder());
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = (AddListenerRequest)AddListenerRequest.CREATOR.createFromParcel(parcel);
            }
            a(crn9, ((AddListenerRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn10 = cro.a(parcel.readStrongBinder());
            obj = obj9;
            if (parcel.readInt() != 0)
            {
                obj = (RemoveListenerRequest)RemoveListenerRequest.CREATOR.createFromParcel(parcel);
            }
            a(crn10, ((RemoveListenerRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            e(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            f(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            g(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            h(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn11 = cro.a(parcel.readStrongBinder());
            obj = obj10;
            if (parcel.readInt() != 0)
            {
                obj = (AncsNotificationParcelable)AncsNotificationParcelable.CREATOR.createFromParcel(parcel);
            }
            a(crn11, ((AncsNotificationParcelable) (obj)));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(cro.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            c(cro.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            i(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(cro.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            f(cro.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(cro.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(cro.a(parcel.readStrongBinder()), crl.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            b(cro.a(parcel.readStrongBinder()), crl.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn12 = cro.a(parcel.readStrongBinder());
            String s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            }
            a(crn12, s, ((ParcelFileDescriptor) (obj)));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn13 = cro.a(parcel.readStrongBinder());
            String s1 = parcel.readString();
            ParcelFileDescriptor parcelfiledescriptor;
            if (parcel.readInt() != 0)
            {
                parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            } else
            {
                parcelfiledescriptor = null;
            }
            a(crn13, s1, parcelfiledescriptor, parcel.readLong(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            j(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 48: // '0'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn = cro.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(crn, flag);
            parcel1.writeNoException();
            return true;

        case 49: // '1'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            k(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 50: // '2'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn1 = cro.a(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            b(crn1, flag);
            parcel1.writeNoException();
            return true;

        case 51: // '3'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            l(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 52: // '4'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            m(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            a(cro.a(parcel.readStrongBinder()), parcel.readByte());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            crn crn14 = cro.a(parcel.readStrongBinder());
            ConnectionConfiguration connectionconfiguration = obj11;
            if (parcel.readInt() != 0)
            {
                connectionconfiguration = (ConnectionConfiguration)ConnectionConfiguration.CREATOR.createFromParcel(parcel);
            }
            b(crn14, connectionconfiguration);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            n(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            o(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableService");
            p(cro.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
