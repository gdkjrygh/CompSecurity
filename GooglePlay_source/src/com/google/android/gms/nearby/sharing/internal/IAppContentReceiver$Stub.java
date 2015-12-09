// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.nearby.sharing.AppContentReceivedResult;

// Referenced classes of package com.google.android.gms.nearby.sharing.internal:
//            IAppContentReceiver

public static abstract class Proxy.mRemote extends Binder
    implements IAppContentReceiver
{
    private static final class Proxy
        implements IAppContentReceiver
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final String getWritableUri(String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            parcel.writeString(s);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void onContentReceived(AppContentReceivedResult appcontentreceivedresult)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            if (appcontentreceivedresult == null)
            {
                break MISSING_BLOCK_LABEL_44;
            }
            parcel.writeInt(1);
            appcontentreceivedresult.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            appcontentreceivedresult;
            parcel.recycle();
            throw appcontentreceivedresult;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IAppContentReceiver asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
        if (iinterface != null && (iinterface instanceof IAppContentReceiver))
        {
            return (IAppContentReceiver)iinterface;
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
            parcel1.writeString("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            parcel = getWritableUri(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeString(parcel);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.nearby.sharing.internal.IAppContentReceiver");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (AppContentReceivedResult)AppContentReceivedResult.CREATOR.FromParcel(parcel);
        } else
        {
            parcel = null;
        }
        onContentReceived(parcel);
        return true;
    }
}
