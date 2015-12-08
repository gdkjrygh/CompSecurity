// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.common.internal:
//            IGmsServiceBroker, IGmsCallbacks, GetServiceRequest, ValidateAccountRequest

private static final class mRemote
    implements IGmsServiceBroker
{

    private IBinder mRemote;

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void getAccountDataService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getAdMobService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getAddressService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getAppDataSearchService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getAppStateService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        mRemote.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getAuthService_DEPRECATED()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        mRemote.transact(28, parcel, parcel1, 0);
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

    public final void getAutoBackupService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getCarService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getCastMirroringService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getCastService(IGmsCallbacks igmscallbacks, int i, String s, IBinder ibinder, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getClearcutLoggerService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getCloudSaveService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String s2, String as[])
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeString(s2);
        parcel.writeStringArray(as);
        mRemote.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getCommonService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getDeviceConnectionService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(44, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getDeviceManagerService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getDriveService(IGmsCallbacks igmscallbacks, int i, String s, String as[], String s1, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        parcel.writeString(s1);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getDroidGuardService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getFeedbackService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getFitnessService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String as[], Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(30, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getGamesService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String as[], String s2, IBinder ibinder, 
            String s3, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s3);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getGlobalSearchAdminService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getGoogleLocationManagerService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getIdentityService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getKidsService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(45, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getLightweightAppDataSearchService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getLocationService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getLockboxService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getNetworkQualityService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getPanoramaService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getPeopleService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getPlayLogService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getPlusService(IGmsCallbacks igmscallbacks, int i, String s, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeStringArray(as);
        parcel.writeString(s2);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getPseudonymousIdService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getRemindersService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getReportingService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getSearchAdministrationService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(22, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getSearchCorporaService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getSearchQueriesService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getService(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        if (getservicerequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        getservicerequest.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getUdcService(IGmsCallbacks igmscallbacks, int i, String s, String s1)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeString(s1);
        mRemote.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getUsageReportingService(IGmsCallbacks igmscallbacks, int i, String s, Bundle bundle)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(43, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    public final void getWalletService(IGmsCallbacks igmscallbacks, int i)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        mRemote.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getWalletServiceWithPackage(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void getWearableService(IGmsCallbacks igmscallbacks, int i, String s)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        igmscallbacks = igmscallbacks.asBinder();
_L1:
        parcel.writeStrongBinder(igmscallbacks);
        parcel.writeInt(i);
        parcel.writeString(s);
        mRemote.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        igmscallbacks = null;
          goto _L1
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
    }

    public final void validateAccount(IGmsCallbacks igmscallbacks, ValidateAccountRequest validateaccountrequest)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (igmscallbacks == null) goto _L2; else goto _L1
_L1:
        igmscallbacks = igmscallbacks.asBinder();
_L5:
        parcel.writeStrongBinder(igmscallbacks);
        if (validateaccountrequest == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        validateaccountrequest.writeToParcel(parcel, 0);
_L6:
        mRemote.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        igmscallbacks = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        igmscallbacks;
        parcel1.recycle();
        parcel.recycle();
        throw igmscallbacks;
          goto _L5
    }

    I(IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
