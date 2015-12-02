// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public abstract class aza extends Binder
    implements ayz
{

    public static ayz a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (iinterface != null && (iinterface instanceof ayz))
        {
            return (ayz)iinterface;
        } else
        {
            return new azb(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag = false;
        boolean flag8 = false;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel = b();
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a(parcel.createTypedArrayList(LatLng.CREATOR));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel = c();
            parcel1.writeNoException();
            parcel1.writeTypedList(parcel);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            b(parcel.readArrayList(getClass().getClassLoader()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            parcel = d();
            parcel1.writeNoException();
            parcel1.writeList(parcel);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            float f = e();
            parcel1.writeNoException();
            parcel1.writeFloat(f);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            i = f();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            i = g();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            b(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            float f1 = h();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            }
            a(flag3);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            boolean flag4 = i();
            parcel1.writeNoException();
            i = ((flag) ? 1 : 0);
            if (flag4)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            boolean flag5 = flag8;
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            }
            b(flag5);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            boolean flag6 = j();
            parcel1.writeNoException();
            i = ((flag1) ? 1 : 0);
            if (flag6)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            boolean flag7 = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            i = ((flag2) ? 1 : 0);
            if (flag7)
            {
                i = 1;
            }
            parcel1.writeInt(i);
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolygonDelegate");
            i = k();
            parcel1.writeNoException();
            parcel1.writeInt(i);
            return true;
        }
    }
}
