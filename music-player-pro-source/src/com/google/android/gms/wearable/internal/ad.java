// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ab, ap, at, aw, 
//            p, r, t, v, 
//            x, z

public interface ad
    extends IInterface
{
    public static abstract class a extends Binder
        implements ad
    {

        public static ad bX(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (iinterface != null && (iinterface instanceof ad))
            {
                return (ad)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableCallbacks");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                if (parcel.readInt() != 0)
                {
                    obj = (r)r.CREATOR.createFromParcel(parcel);
                }
                a(((r) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (t)t.CREATOR.createFromParcel(parcel);
                }
                a(((t) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (ap)ap.CREATOR.createFromParcel(parcel);
                }
                a(((ap) (obj)));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (x)x.CREATOR.createFromParcel(parcel);
                }
                a(((x) (obj)));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR.B(parcel);
                }
                ab(((DataHolder) (obj)));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (p)p.CREATOR.createFromParcel(parcel);
                }
                a(((p) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (at)at.CREATOR.createFromParcel(parcel);
                }
                a(((at) (obj)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = (z)z.CREATOR.createFromParcel(parcel);
                }
                a(((z) (obj)));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (ab)ab.CREATOR.createFromParcel(parcel);
                }
                a(((ab) (obj)));
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (v)v.CREATOR.createFromParcel(parcel);
                }
                a(((v) (obj)));
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = Status.CREATOR.createFromParcel(parcel);
                }
                a(((Status) (obj)));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableCallbacks");
                obj = obj11;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (aw)aw.CREATOR.createFromParcel(parcel);
            }
            a(((aw) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableCallbacks");
        }
    }

    private static class a.a
        implements ad
    {

        private IBinder le;

        public void a(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            le.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        public void a(ab ab1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (ab1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            ab1.writeToParcel(parcel, 0);
_L1:
            le.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ab1;
            parcel1.recycle();
            parcel.recycle();
            throw ab1;
        }

        public void a(ap ap1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (ap1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            ap1.writeToParcel(parcel, 0);
_L1:
            le.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ap1;
            parcel1.recycle();
            parcel.recycle();
            throw ap1;
        }

        public void a(at at1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (at1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            at1.writeToParcel(parcel, 0);
_L1:
            le.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            at1;
            parcel1.recycle();
            parcel.recycle();
            throw at1;
        }

        public void a(aw aw1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (aw1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            aw1.writeToParcel(parcel, 0);
_L1:
            le.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            aw1;
            parcel1.recycle();
            parcel.recycle();
            throw aw1;
        }

        public void a(p p1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (p1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            p1.writeToParcel(parcel, 0);
_L1:
            le.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            p1;
            parcel1.recycle();
            parcel.recycle();
            throw p1;
        }

        public void a(r r1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (r1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            r1.writeToParcel(parcel, 0);
_L1:
            le.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            r1;
            parcel1.recycle();
            parcel.recycle();
            throw r1;
        }

        public void a(t t1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (t1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            t1.writeToParcel(parcel, 0);
_L1:
            le.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            t1;
            parcel1.recycle();
            parcel.recycle();
            throw t1;
        }

        public void a(v v1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            v1.writeToParcel(parcel, 0);
_L1:
            le.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            v1;
            parcel1.recycle();
            parcel.recycle();
            throw v1;
        }

        public void a(x x1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (x1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            x1.writeToParcel(parcel, 0);
_L1:
            le.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            x1;
            parcel1.recycle();
            parcel.recycle();
            throw x1;
        }

        public void a(z z1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (z1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            z1.writeToParcel(parcel, 0);
_L1:
            le.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            z1;
            parcel1.recycle();
            parcel.recycle();
            throw z1;
        }

        public void ab(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            le.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public IBinder asBinder()
        {
            return le;
        }

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract void a(Status status)
        throws RemoteException;

    public abstract void a(ab ab1)
        throws RemoteException;

    public abstract void a(ap ap)
        throws RemoteException;

    public abstract void a(at at)
        throws RemoteException;

    public abstract void a(aw aw)
        throws RemoteException;

    public abstract void a(p p)
        throws RemoteException;

    public abstract void a(r r)
        throws RemoteException;

    public abstract void a(t t)
        throws RemoteException;

    public abstract void a(v v)
        throws RemoteException;

    public abstract void a(x x)
        throws RemoteException;

    public abstract void a(z z)
        throws RemoteException;

    public abstract void ab(DataHolder dataholder)
        throws RemoteException;
}
