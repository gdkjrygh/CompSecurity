// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IObjectWrapper
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IObjectWrapper
    {

        public static IObjectWrapper asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (iinterface != null && (iinterface instanceof IObjectWrapper))
            {
                return (IObjectWrapper)iinterface;
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
                parcel1.writeString("com.google.android.gms.dynamic.IObjectWrapper");
                break;
            }
            return true;
        }
    }

    private static final class Stub.Proxy
        implements IObjectWrapper
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }

}
