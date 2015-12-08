// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.model.internal;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.da.b;

public interface d
    extends IInterface
{
    public static abstract class a extends Binder
        implements d
    {

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            b b1 = null;
            Object obj4 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                parcel = a(parcel.readInt());
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel = parcel.asBinder();
                } else
                {
                    parcel = null;
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                b1 = a(parcel.readString());
                parcel1.writeNoException();
                parcel = obj;
                if (b1 != null)
                {
                    parcel = b1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                b1 = b(parcel.readString());
                parcel1.writeNoException();
                parcel = obj1;
                if (b1 != null)
                {
                    parcel = b1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                b1 = a();
                parcel1.writeNoException();
                parcel = obj2;
                if (b1 != null)
                {
                    parcel = b1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                b1 = a(parcel.readFloat());
                parcel1.writeNoException();
                parcel = obj3;
                if (b1 != null)
                {
                    parcel = b1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                b b2;
                if (parcel.readInt() != 0)
                {
                    parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                b2 = a(parcel);
                parcel1.writeNoException();
                parcel = b1;
                if (b2 != null)
                {
                    parcel = b2.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
                b1 = c(parcel.readString());
                parcel1.writeNoException();
                parcel = obj4;
                break;
            }
            if (b1 != null)
            {
                parcel = b1.asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.m4b.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        }
    }


    public abstract b a();

    public abstract b a(float f);

    public abstract b a(int i);

    public abstract b a(Bitmap bitmap);

    public abstract b a(String s);

    public abstract b b(String s);

    public abstract b c(String s);
}
