// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;

// Referenced classes of package com.google.android.gms.internal:
//            ki, kk

public interface kh
    extends IInterface
{
    public static abstract class a extends Binder
        implements kh
    {

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
                    parcel1 = DataHolder.CREATOR.createFromParcel(parcel);
                }
                M(parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (ki)ki.CREATOR.createFromParcel(parcel);
                }
                a(parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.wearable.internal.IWearableListener");
                parcel1 = obj2;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (kk)kk.CREATOR.createFromParcel(parcel);
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
                parcel1 = (kk)kk.CREATOR.createFromParcel(parcel);
            }
            b(parcel1);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.wearable.internal.IWearableListener");
        }
    }


    public abstract void M(DataHolder dataholder)
        throws RemoteException;

    public abstract void a(ki ki)
        throws RemoteException;

    public abstract void a(kk kk)
        throws RemoteException;

    public abstract void b(kk kk)
        throws RemoteException;
}
