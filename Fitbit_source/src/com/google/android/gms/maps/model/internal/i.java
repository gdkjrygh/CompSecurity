// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.u;

public interface i
    extends IInterface
{
    public static abstract class a extends Binder
        implements i
    {

        public static i a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        /* block-local class not found */
        class a {}

            if (iinterface != null && (iinterface instanceof i))
            {
                return (i)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
            throws RemoteException
        {
            boolean flag = false;
            boolean flag1 = false;
            boolean flag2 = false;
            switch (k)
            {
            default:
                return super.onTransact(k, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0)
                {
                    parcel = LatLng.CREATOR.a(parcel);
                } else
                {
                    parcel = null;
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                parcel = c();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readDouble());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                double d1 = d();
                parcel1.writeNoException();
                parcel1.writeDouble(d1);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                float f1 = e();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                a(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                k = f();
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                b(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                k = g();
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                b(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                float f2 = h();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                }
                a(flag2);
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                boolean flag3 = i();
                parcel1.writeNoException();
                k = ((flag) ? 1 : 0);
                if (flag3)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                boolean flag4 = a(a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                k = ((flag1) ? 1 : 0);
                if (flag4)
                {
                    k = 1;
                }
                parcel1.writeInt(k);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
                k = j();
                parcel1.writeNoException();
                parcel1.writeInt(k);
                return true;
            }
        }
    }


    public abstract void a()
        throws RemoteException;

    public abstract void a(double d1)
        throws RemoteException;

    public abstract void a(float f1)
        throws RemoteException;

    public abstract void a(int k)
        throws RemoteException;

    public abstract void a(LatLng latlng)
        throws RemoteException;

    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract boolean a(i k)
        throws RemoteException;

    public abstract String b()
        throws RemoteException;

    public abstract void b(float f1)
        throws RemoteException;

    public abstract void b(int k)
        throws RemoteException;

    public abstract LatLng c()
        throws RemoteException;

    public abstract double d()
        throws RemoteException;

    public abstract float e()
        throws RemoteException;

    public abstract int f()
        throws RemoteException;

    public abstract int g()
        throws RemoteException;

    public abstract float h()
        throws RemoteException;

    public abstract boolean i()
        throws RemoteException;

    public abstract int j()
        throws RemoteException;
}
