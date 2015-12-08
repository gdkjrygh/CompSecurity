// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ae, ai, al

public static abstract class attachInterface extends Binder
    implements ae
{
    private static class a
        implements ae
    {

        private IBinder le;

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
            le.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ai1;
            parcel.recycle();
            throw ai1;
        }

        public void a(al al1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (al1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            al1.writeToParcel(parcel, 0);
_L1:
            le.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            al1;
            parcel.recycle();
            throw al1;
        }

        public void aa(DataHolder dataholder)
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
            le.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel.recycle();
            throw dataholder;
        }

        public IBinder asBinder()
        {
            return le;
        }

        public void b(al al1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wearable.internal.IWearableListener");
            if (al1 == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            al1.writeToParcel(parcel, 0);
_L1:
            le.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            al1;
            parcel.recycle();
            throw al1;
        }

        a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public static ae bY(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
        if (iinterface != null && (iinterface instanceof ae))
        {
            return (ae)iinterface;
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
                parcel1 = DataHolder.CREATOR.B(parcel);
            }
            aa(parcel1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj1;
            if (parcel.readInt() != 0)
            {
                parcel1 = (ai)ai.CREATOR.createFromParcel(parcel);
            }
            a(parcel1);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
            parcel1 = obj2;
            if (parcel.readInt() != 0)
            {
                parcel1 = (al)al.CREATOR.createFromParcel(parcel);
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
            parcel1 = (al)al.CREATOR.createFromParcel(parcel);
        }
        b(parcel1);
        return true;
    }

    public a.le()
    {
        attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
    }
}
