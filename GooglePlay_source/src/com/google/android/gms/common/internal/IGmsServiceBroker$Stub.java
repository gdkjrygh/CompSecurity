// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.common.internal:
//            IGmsServiceBroker, GetServiceRequest, ValidateAccountRequest, IGmsCallbacks

public static abstract class attachInterface extends Binder
    implements IGmsServiceBroker
{
    private static final class Proxy
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

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IGmsServiceBroker asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iinterface != null && (iinterface instanceof IGmsServiceBroker))
        {
            return (IGmsServiceBroker)iinterface;
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
        IGmsCallbacks igmscallbacks26;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s = parcel.readString();
            String s25 = parcel.readString();
            String as1[] = parcel.createStringArray();
            String s29 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getPlusService(igmscallbacks, i, s, s25, as1, s29, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks1 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s1 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getPanoramaService(igmscallbacks1, i, s1, parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getAppDataSearchService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getWalletService(terface(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks2 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s2 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getPeopleService(igmscallbacks2, i, s2, parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks3 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s3 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getReportingService(igmscallbacks3, i, s3, parcel);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks4 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s4 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getLocationService(igmscallbacks4, i, s4, parcel);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks5 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s5 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getGoogleLocationManagerService(igmscallbacks5, i, s5, parcel);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks6 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s6 = parcel.readString();
            String s26 = parcel.readString();
            String as2[] = parcel.createStringArray();
            String s30 = parcel.readString();
            IBinder ibinder1 = parcel.readStrongBinder();
            String s31 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getGamesService(igmscallbacks6, i, s6, s26, as2, s30, ibinder1, s31, parcel);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getAppStateService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks7 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s7 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getPlayLogService(igmscallbacks7, i, s7, parcel);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks8 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s8 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getAdMobService(igmscallbacks8, i, s8, parcel);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks9 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s9 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getDroidGuardService(igmscallbacks9, i, s9, parcel);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks10 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s10 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getLockboxService(igmscallbacks10, i, s10, parcel);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks11 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s11 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getCastMirroringService(igmscallbacks11, i, s11, parcel);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks12 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s12 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getNetworkQualityService(igmscallbacks12, i, s12, parcel);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks13 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s13 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getAccountDataService(igmscallbacks13, i, s13, parcel);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks14 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s14 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getFeedbackService(igmscallbacks14, i, s14, parcel);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks15 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s15 = parcel.readString();
            IBinder ibinder = parcel.readStrongBinder();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getCastService(igmscallbacks15, i, s15, ibinder, parcel);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks16 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s16 = parcel.readString();
            String as[] = parcel.createStringArray();
            String s28 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getDriveService(igmscallbacks16, i, s16, as, s28, parcel);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getLightweightAppDataSearchService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getSearchAdministrationService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks17 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s17 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getAutoBackupService(igmscallbacks17, i, s17, parcel);
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getAddressService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks18 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s18 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getCarService(igmscallbacks18, i, s18, parcel);
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getWearableService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks19 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s19 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getIdentityService(igmscallbacks19, i, s19, parcel);
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getAuthService_DEPRECATED();
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks20 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s20 = parcel.readString();
            String s27 = parcel.readString();
            String as3[] = parcel.createStringArray();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getFitnessService(igmscallbacks20, i, s20, s27, as3, parcel);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getSearchQueriesService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getGlobalSearchAdminService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getCloudSaveService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getUdcService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getSearchCorporaService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getDeviceManagerService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks21 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s21 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getPseudonymousIdService(igmscallbacks21, i, s21, parcel);
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks22 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s22 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getRemindersService(igmscallbacks22, i, s22, parcel);
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getCommonService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks23 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s23 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getClearcutLoggerService(igmscallbacks23, i, s23, parcel);
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getWalletServiceWithPackage(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks24 = terface(parcel.readStrongBinder());
            i = parcel.readInt();
            String s24 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getUsageReportingService(igmscallbacks24, i, s24, parcel);
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getDeviceConnectionService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 45: // '-'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            getKidsService(terface(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 46: // '.'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks igmscallbacks25 = terface(parcel.readStrongBinder());
            if (parcel.readInt() != 0)
            {
                parcel = (GetServiceRequest)GetServiceRequest.CREATOR.teFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            getService(igmscallbacks25, parcel);
            parcel1.writeNoException();
            return true;

        case 47: // '/'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            igmscallbacks26 = terface(parcel.readStrongBinder());
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (ValidateAccountRequest)ValidateAccountRequest.CREATOR.teFromParcel(parcel);
        } else
        {
            parcel = null;
        }
        validateAccount(igmscallbacks26, parcel);
        parcel1.writeNoException();
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
    }
}
