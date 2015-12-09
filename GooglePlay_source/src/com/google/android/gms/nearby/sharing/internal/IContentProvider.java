// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.SharedContent;
import java.util.List;

public interface IContentProvider
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IContentProvider
    {

        public static IContentProvider asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IContentProvider");
            if (iinterface != null && (iinterface instanceof IContentProvider))
            {
                return (IContentProvider)iinterface;
            } else
            {
                return new Proxy(ibinder);
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
                parcel1.writeString("com.google.android.gms.nearby.sharing.internal.IContentProvider");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.IContentProvider");
                parcel = provideContent();
                parcel1.writeNoException();
                parcel1.writeTypedList(parcel);
                return true;
            }
        }
    }

    private static final class Stub.Proxy
        implements IContentProvider
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final List provideContent()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            java.util.ArrayList arraylist;
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IContentProvider");
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            arraylist = parcel1.createTypedArrayList(SharedContent.CREATOR);
            parcel1.recycle();
            parcel.recycle();
            return arraylist;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract List provideContent()
        throws RemoteException;
}
