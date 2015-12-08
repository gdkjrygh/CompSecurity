// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fd

public interface fe
    extends IInterface
{
    public static abstract class a extends Binder
        implements fe
    {

        public static fe z(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            if (iinterface != null && (iinterface instanceof fe))
            {
                return (fe)iinterface;
            } else
            {
                return new a(ibinder);
            }
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
                a(parcel.readHashMap(getClass().getClassLoader()), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList(fd.CREATOR));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                cl();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                parcel = getVersion();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;
            }
        }
    }

    private static class a.a
        implements fe
    {

        private IBinder kq;

        public void a(Map map, long l, String s, List list)
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
            kq.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            map;
            parcel1.recycle();
            parcel.recycle();
            throw map;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void cl()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
            kq.transact(2, parcel, parcel1, 0);
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

        public String getVersion()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
            kq.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void a(Map map, long l, String s, List list)
        throws RemoteException;

    public abstract void cl()
        throws RemoteException;

    public abstract String getVersion()
        throws RemoteException;
}
