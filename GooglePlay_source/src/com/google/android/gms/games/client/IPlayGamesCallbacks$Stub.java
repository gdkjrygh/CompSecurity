// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;

// Referenced classes of package com.google.android.gms.games.client:
//            IPlayGamesCallbacks

public static abstract class attachInterface extends Binder
    implements IPlayGamesCallbacks
{
    private static final class Proxy
        implements IPlayGamesCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onExperimentsLoaded(int i, long al[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesCallbacks");
            parcel.writeInt(i);
            parcel.writeLongArray(al);
            mRemote.transact(1002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            al;
            parcel1.recycle();
            parcel.recycle();
            throw al;
        }

        public final void onGamesLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public final void onLaunchGameForRecording(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesCallbacks");
            parcel.writeInt(i);
            mRemote.transact(2001, parcel, parcel1, 0);
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

        public final void onVideosLoaded(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.client.IPlayGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IPlayGamesCallbacks asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.client.IPlayGamesCallbacks");
        if (iinterface != null && (iinterface instanceof IPlayGamesCallbacks))
        {
            return (IPlayGamesCallbacks)iinterface;
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
            parcel1.writeString("com.google.android.gms.games.client.IPlayGamesCallbacks");
            return true;

        case 1001: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesCallbacks");
            if (parcel.readInt() != 0)
            {
                DataHolderCreator dataholdercreator = DataHolder.CREATOR;
                parcel = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onGamesLoaded(parcel);
            parcel1.writeNoException();
            return true;

        case 1002: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesCallbacks");
            onExperimentsLoaded(parcel.readInt(), parcel.createLongArray());
            parcel1.writeNoException();
            return true;

        case 2001: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesCallbacks");
            onLaunchGameForRecording(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 2002: 
            parcel.enforceInterface("com.google.android.gms.games.client.IPlayGamesCallbacks");
            break;
        }
        if (parcel.readInt() != 0)
        {
            DataHolderCreator dataholdercreator1 = DataHolder.CREATOR;
            parcel = DataHolderCreator.createFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        onVideosLoaded(parcel);
        parcel1.writeNoException();
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.games.client.IPlayGamesCallbacks");
    }
}
