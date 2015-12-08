// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            Command

public interface IAnalyticsService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IAnalyticsService
    {

        private static final String DESCRIPTOR = "com.google.android.gms.analytics.internal.IAnalyticsService";
        static final int TRANSACTION_clearHits = 2;
        static final int TRANSACTION_sendHit = 1;

        public static IAnalyticsService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            if (iinterface != null && (iinterface instanceof IAnalyticsService))
            {
                return (IAnalyticsService)iinterface;
            } else
            {
                return new Proxy(ibinder);
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
                parcel1.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                sendHit(parcel.readHashMap(getClass().getClassLoader()), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(Command.CREATOR));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                clearHits();
                parcel1.writeNoException();
                return true;
            }
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.analytics.internal.IAnalyticsService");
        }
    }

    private static class Stub.Proxy
        implements IAnalyticsService
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public void clearHits()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public String getInterfaceDescriptor()
        {
            return "com.google.android.gms.analytics.internal.IAnalyticsService";
        }

        public void sendHit(Map map, long l, String s, List list)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
            parcel.writeMap(map);
            parcel.writeLong(l);
            parcel.writeString(s);
            parcel.writeTypedList(list);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            map;
            parcel1.recycle();
            parcel.recycle();
            throw map;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void clearHits()
        throws RemoteException;

    public abstract void sendHit(Map map, long l, String s, List list)
        throws RemoteException;
}
