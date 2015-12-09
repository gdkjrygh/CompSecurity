// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;

public interface IPlayGamesBridgeService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IPlayGamesBridgeService
    {

        public static IPlayGamesBridgeService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.service.IPlayGamesBridgeService");
            if (iinterface != null && (iinterface instanceof IPlayGamesBridgeService))
            {
                return (IPlayGamesBridgeService)iinterface;
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
            String s1;
            String s3;
            String s5;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.games.service.IPlayGamesBridgeService");
                return true;

            case 1001: 
                parcel.enforceInterface("com.google.android.gms.games.service.IPlayGamesBridgeService");
                logDisplayedNotificationAction(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 1002: 
                parcel.enforceInterface("com.google.android.gms.games.service.IPlayGamesBridgeService");
                String s = parcel.readString();
                String s2 = parcel.readString();
                String s4 = parcel.readString();
                Object obj;
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR;
                    obj = DataHolderCreator.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (BitmapTeleporter)BitmapTeleporter.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                showLevelUpNotification(s, s2, s4, ((DataHolder) (obj)), parcel);
                parcel1.writeNoException();
                return true;

            case 1003: 
                parcel.enforceInterface("com.google.android.gms.games.service.IPlayGamesBridgeService");
                s1 = parcel.readString();
                s3 = parcel.readString();
                s5 = parcel.readString();
                break;
            }
            Object obj1;
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (parcel.readInt() != 0)
            {
                obj1 = DataHolder.CREATOR;
                obj1 = DataHolderCreator.createFromParcel(parcel);
            } else
            {
                obj1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (BitmapTeleporter)BitmapTeleporter.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            updateNotifications(s1, s3, s5, flag, ((DataHolder) (obj1)), parcel);
            parcel1.writeNoException();
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.games.service.IPlayGamesBridgeService");
        }
    }

    private static final class Stub.Proxy
        implements IPlayGamesBridgeService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void logDisplayedNotificationAction(String s, String s1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.service.IPlayGamesBridgeService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeInt(i);
            mRemote.transact(1001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public final void showLevelUpNotification(String s, String s1, String s2, DataHolder dataholder, BitmapTeleporter bitmapteleporter)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.service.IPlayGamesBridgeService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (bitmapteleporter == null)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            parcel.writeInt(1);
            bitmapteleporter.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(1002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            parcel.writeInt(0);
              goto _L4
        }

        public final void updateNotifications(String s, String s1, String s2, boolean flag, DataHolder dataholder, BitmapTeleporter bitmapteleporter)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.service.IPlayGamesBridgeService");
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeString(s2);
            if (!flag)
            {
                i = 0;
            }
            parcel.writeInt(i);
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (bitmapteleporter == null)
            {
                break MISSING_BLOCK_LABEL_150;
            }
            parcel.writeInt(1);
            bitmapteleporter.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(1003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
            parcel.writeInt(0);
              goto _L4
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void logDisplayedNotificationAction(String s, String s1, int i)
        throws RemoteException;

    public abstract void showLevelUpNotification(String s, String s1, String s2, DataHolder dataholder, BitmapTeleporter bitmapteleporter)
        throws RemoteException;

    public abstract void updateNotifications(String s, String s1, String s2, boolean flag, DataHolder dataholder, BitmapTeleporter bitmapteleporter)
        throws RemoteException;
}
