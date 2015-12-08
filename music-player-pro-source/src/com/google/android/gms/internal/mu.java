// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

// Referenced classes of package com.google.android.gms.internal:
//            md, mq, lx, ms

public interface mu
    extends IInterface
{
    public static abstract class a extends Binder
        implements mu
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
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                parcel1 = obj;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (mq)mq.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, lx.a.at(parcel.readStrongBinder()));
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                parcel1 = obj1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (FitnessSensorServiceRequest)FitnessSensorServiceRequest.CREATOR.createFromParcel(parcel);
                }
                a(parcel1, md.a.az(parcel.readStrongBinder()));
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                parcel1 = obj2;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = (ms)ms.CREATOR.createFromParcel(parcel);
            }
            a(parcel1, md.a.az(parcel.readStrongBinder()));
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        }
    }


    public abstract void a(FitnessSensorServiceRequest fitnesssensorservicerequest, md md)
        throws RemoteException;

    public abstract void a(mq mq, lx lx)
        throws RemoteException;

    public abstract void a(ms ms, md md)
        throws RemoteException;
}
