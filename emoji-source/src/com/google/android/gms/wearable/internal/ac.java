// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            af, ai

public interface ac
    extends IInterface
{
    public static abstract class a extends Binder
        implements ac
    {

        public static ac bx(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            if (iinterface != null && (iinterface instanceof ac))
            {
                return (ac)iinterface;
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
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wearable.internal.IWearableListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj;
                if (parcel.readInt() != 0)
                {
                    parcel1 = DataHolder.CREATOR.x(parcel);
                }
                Y(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (af)af.CREATOR.createFromParcel(parcel);
                }
                a(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj2;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ai)ai.CREATOR.createFromParcel(parcel);
                }
                a(parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj3;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = (ai)ai.CREATOR.createFromParcel(parcel);
            }
            b(parcel1);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }
    }

    private static class a.a
        implements ac
    {

        private IBinder kq;

        public void Y(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public void a(af af1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            af1.writeToParcel(parcel, 0);
_L1:
            kq.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            af1;
            parcel.recycle();
            throw af1;
        }

        public void a(ai ai1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (ai1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            ai1.writeToParcel(parcel, 0);
_L1:
            kq.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ai1;
            parcel.recycle();
            throw ai1;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void b(ai ai1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (ai1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            ai1.writeToParcel(parcel, 0);
_L1:
            kq.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ai1;
            parcel.recycle();
            throw ai1;
        }

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void Y(DataHolder dataholder)
        throws RemoteException;

    public abstract void a(af af)
        throws RemoteException;

    public abstract void a(ai ai)
        throws RemoteException;

    public abstract void b(ai ai)
        throws RemoteException;
}
