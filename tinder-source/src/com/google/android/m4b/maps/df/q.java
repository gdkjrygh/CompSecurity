// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.model.CameraPosition;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.LatLngBounds;
import com.google.android.m4b.maps.model.c;
import com.google.android.m4b.maps.model.f;
import com.google.android.m4b.maps.model.g;

public interface q
    extends IInterface
{
    public static abstract class a extends Binder
        implements q
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj = null;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                obj = a();
                parcel1.writeNoException();
                parcel = obj5;
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                obj = b();
                parcel1.writeNoException();
                parcel = obj6;
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                obj = a(parcel.readFloat(), parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj7;
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                obj = a(parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj8;
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                obj = b(parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj9;
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                obj = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
                parcel1.writeNoException();
                parcel = obj10;
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0)
                {
                    obj1 = CameraPosition.CREATOR;
                    parcel = c.a(parcel);
                } else
                {
                    parcel = null;
                }
                obj1 = a(parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (obj1 != null)
                {
                    parcel = ((b) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR;
                    parcel = g.a(parcel);
                } else
                {
                    parcel = null;
                }
                obj = a(parcel);
                parcel1.writeNoException();
                parcel = ((Parcel) (obj1));
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR;
                    obj = g.a(parcel);
                } else
                {
                    obj = null;
                }
                obj = a(((LatLng) (obj)), parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj2;
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = LatLngBounds.CREATOR;
                    obj = f.a(parcel);
                } else
                {
                    obj = null;
                }
                obj = a(((LatLngBounds) (obj)), parcel.readInt());
                parcel1.writeNoException();
                parcel = obj3;
                if (obj != null)
                {
                    parcel = ((b) (obj)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = LatLngBounds.CREATOR;
                obj = f.a(parcel);
            } else
            {
                obj = null;
            }
            obj = a(((LatLngBounds) (obj)), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            parcel = obj4;
            if (obj != null)
            {
                parcel = ((b) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.internal.ICameraUpdateFactoryDelegate");
        }
    }


    public abstract b a();

    public abstract b a(float f);

    public abstract b a(float f, float f1);

    public abstract b a(float f, int i, int j);

    public abstract b a(CameraPosition cameraposition);

    public abstract b a(LatLng latlng);

    public abstract b a(LatLng latlng, float f);

    public abstract b a(LatLngBounds latlngbounds, int i);

    public abstract b a(LatLngBounds latlngbounds, int i, int j, int k);

    public abstract b b();

    public abstract b b(float f);
}
