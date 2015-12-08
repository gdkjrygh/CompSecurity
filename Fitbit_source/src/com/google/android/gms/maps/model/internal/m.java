// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.u;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//            a, d

public interface m
    extends IInterface
{
    public static abstract class a extends Binder
        implements m
    {

        public static m a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        /* block-local class not found */
        class a {}

            if (iinterface != null && (iinterface instanceof m))
            {
                return (m)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj = null;
            boolean flag1 = false;
            boolean flag5 = false;
            boolean flag2 = false;
            boolean flag3 = false;
            boolean flag10 = false;
            boolean flag4 = false;
            boolean flag = false;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a();
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                parcel = b();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0)
                {
                    obj = LatLng.CREATOR.a(parcel);
                }
                a(((LatLng) (obj)));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                parcel = d();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                parcel = e();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                a(flag5);
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                flag5 = f();
                parcel1.writeNoException();
                i1 = ((flag) ? 1 : 0);
                if (flag5)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                g();
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                h();
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                flag5 = i();
                parcel1.writeNoException();
                i1 = ((flag1) ? 1 : 0);
                if (flag5)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                if (parcel.readInt() != 0)
                {
                    flag5 = true;
                }
                b(flag5);
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean flag6 = j();
                parcel1.writeNoException();
                i1 = ((flag2) ? 1 : 0);
                if (flag6)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean flag7 = a(a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                i1 = ((flag3) ? 1 : 0);
                if (flag7)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                i1 = k();
                parcel1.writeNoException();
                parcel1.writeInt(i1);
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(com.google.android.gms.dynamic.e.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readFloat(), parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean flag8 = flag10;
                if (parcel.readInt() != 0)
                {
                    flag8 = true;
                }
                c(flag8);
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                boolean flag9 = l();
                parcel1.writeNoException();
                i1 = ((flag4) ? 1 : 0);
                if (flag9)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                a(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                float f1 = m();
                parcel1.writeNoException();
                parcel1.writeFloat(f1);
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b(parcel.readFloat(), parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                b(parcel.readFloat());
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                float f2 = n();
                parcel1.writeNoException();
                parcel1.writeFloat(f2);
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                obj = obj1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = com.google.android.gms.maps.model.internal.a.CREATOR.a(parcel);
            }
            a(((com.google.android.gms.maps.model.internal.a) (obj)));
            parcel1.writeNoException();
            return true;
        }
    }


    public abstract void a()
        throws RemoteException;

    public abstract void a(float f1)
        throws RemoteException;

    public abstract void a(float f1, float f2)
        throws RemoteException;

    public abstract void a(e e1)
        throws RemoteException;

    public abstract void a(LatLng latlng)
        throws RemoteException;

    public abstract void a(com.google.android.gms.maps.model.internal.a a1)
        throws RemoteException;

    public abstract void a(String s)
        throws RemoteException;

    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract boolean a(m m1)
        throws RemoteException;

    public abstract String b()
        throws RemoteException;

    public abstract void b(float f1)
        throws RemoteException;

    public abstract void b(float f1, float f2)
        throws RemoteException;

    public abstract void b(String s)
        throws RemoteException;

    public abstract void b(boolean flag)
        throws RemoteException;

    public abstract LatLng c()
        throws RemoteException;

    public abstract void c(boolean flag)
        throws RemoteException;

    public abstract String d()
        throws RemoteException;

    public abstract String e()
        throws RemoteException;

    public abstract boolean f()
        throws RemoteException;

    public abstract void g()
        throws RemoteException;

    public abstract void h()
        throws RemoteException;

    public abstract boolean i()
        throws RemoteException;

    public abstract boolean j()
        throws RemoteException;

    public abstract int k()
        throws RemoteException;

    public abstract boolean l()
        throws RemoteException;

    public abstract float m()
        throws RemoteException;

    public abstract float n()
        throws RemoteException;
}
