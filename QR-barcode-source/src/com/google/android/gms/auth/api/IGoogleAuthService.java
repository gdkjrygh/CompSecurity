// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.auth.api:
//            IGoogleAuthApiCallbacks, GoogleAuthApiRequest, GoogleAuthApiRequestCreator

public interface IGoogleAuthService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGoogleAuthService
    {

        public static IGoogleAuthService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.auth.api.IGoogleAuthService");
            if (iinterface != null && (iinterface instanceof IGoogleAuthService))
            {
                return (IGoogleAuthService)iinterface;
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
            IGoogleAuthApiCallbacks igoogleauthapicallbacks;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.auth.api.IGoogleAuthService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.auth.api.IGoogleAuthService");
                igoogleauthapicallbacks = IGoogleAuthApiCallbacks.Stub.asInterface(parcel.readStrongBinder());
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = GoogleAuthApiRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            sendConnection(igoogleauthapicallbacks, parcel);
            parcel1.writeNoException();
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.auth.api.IGoogleAuthService");
        }
    }

    private static class Stub.a
        implements IGoogleAuthService
    {

        private IBinder lb;

        public IBinder asBinder()
        {
            return lb;
        }

        public void sendConnection(IGoogleAuthApiCallbacks igoogleauthapicallbacks, GoogleAuthApiRequest googleauthapirequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.auth.api.IGoogleAuthService");
            if (igoogleauthapicallbacks == null) goto _L2; else goto _L1
_L1:
            igoogleauthapicallbacks = igoogleauthapicallbacks.asBinder();
_L5:
            parcel.writeStrongBinder(igoogleauthapicallbacks);
            if (googleauthapirequest == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            googleauthapirequest.writeToParcel(parcel, 0);
_L6:
            lb.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            igoogleauthapicallbacks = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            igoogleauthapicallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igoogleauthapicallbacks;
              goto _L5
        }

        Stub.a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public abstract void sendConnection(IGoogleAuthApiCallbacks igoogleauthapicallbacks, GoogleAuthApiRequest googleauthapirequest)
        throws RemoteException;
}
