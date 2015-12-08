// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.fitness.result.SessionStopResult;

public interface mc
    extends IInterface
{
    public static abstract class a extends Binder
        implements mc
    {

        public static mc ay(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
            if (iinterface != null && (iinterface instanceof mc))
            {
                return (mc)iinterface;
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
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.fitness.internal.ISessionStopCallback");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.fitness.internal.ISessionStopCallback");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (SessionStopResult)SessionStopResult.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.fitness.internal.ISessionStopCallback");
        }
    }

    private static class a.a
        implements mc
    {

        private IBinder le;

        public void a(SessionStopResult sessionstopresult)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.ISessionStopCallback");
            if (sessionstopresult == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            sessionstopresult.writeToParcel(parcel, 0);
_L1:
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            sessionstopresult;
            parcel1.recycle();
            parcel.recycle();
            throw sessionstopresult;
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


    public abstract void a(SessionStopResult sessionstopresult)
        throws RemoteException;
}
