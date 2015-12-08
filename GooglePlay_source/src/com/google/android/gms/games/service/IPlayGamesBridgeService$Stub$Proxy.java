// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.service:
//            IPlayGamesBridgeService

private static final class mRemote
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
