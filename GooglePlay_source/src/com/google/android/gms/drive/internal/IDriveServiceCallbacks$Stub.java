// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.realtime.internal.IRealtimeService;

// Referenced classes of package com.google.android.gms.drive.internal:
//            IDriveServiceCallbacks, OnDownloadProgressResponse, OnListEntriesResponse, OnDriveIdResponse, 
//            OnMetadataResponse, OnContentsResponse, OnListParentsResponse, OnSyncMoreResponse, 
//            OnLoadRealtimeResponse, OnResourceIdSetResponse, OnDrivePreferencesResponse, OnDeviceUsagePreferenceResponse, 
//            OnFetchThumbnailResponse, OnChangesResponse, GetPermissionsResponse, StringListResponse, 
//            OnStartStreamSession

public static abstract class attachInterface extends Binder
    implements IDriveServiceCallbacks
{
    private static final class Proxy
        implements IDriveServiceCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onAutobackupEnabledResponse(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            mRemote.transact(15, parcel, parcel1, 0);
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

        public final void onChangeSequenceNumberResponse(ChangeSequenceNumber changesequencenumber)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (changesequencenumber == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            changesequencenumber.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            changesequencenumber;
            parcel1.recycle();
            parcel.recycle();
            throw changesequencenumber;
        }

        public final void onChangesResponse(OnChangesResponse onchangesresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onchangesresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onchangesresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onchangesresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onchangesresponse;
        }

        public final void onContentsResponse(OnContentsResponse oncontentsresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (oncontentsresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            oncontentsresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            oncontentsresponse;
            parcel1.recycle();
            parcel.recycle();
            throw oncontentsresponse;
        }

        public final void onDeviceUsagePreferenceResponse(OnDeviceUsagePreferenceResponse ondeviceusagepreferenceresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (ondeviceusagepreferenceresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            ondeviceusagepreferenceresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ondeviceusagepreferenceresponse;
            parcel1.recycle();
            parcel.recycle();
            throw ondeviceusagepreferenceresponse;
        }

        public final void onDownloadProgress(OnDownloadProgressResponse ondownloadprogressresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (ondownloadprogressresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            ondownloadprogressresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ondownloadprogressresponse;
            parcel1.recycle();
            parcel.recycle();
            throw ondownloadprogressresponse;
        }

        public final void onDriveIdResponse(OnDriveIdResponse ondriveidresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (ondriveidresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            ondriveidresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ondriveidresponse;
            parcel1.recycle();
            parcel.recycle();
            throw ondriveidresponse;
        }

        public final void onDrivePreferencesResponse(OnDrivePreferencesResponse ondrivepreferencesresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (ondrivepreferencesresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            ondrivepreferencesresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            ondrivepreferencesresponse;
            parcel1.recycle();
            parcel.recycle();
            throw ondrivepreferencesresponse;
        }

        public final void onError(Status status)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (status == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            status.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            status;
            parcel1.recycle();
            parcel.recycle();
            throw status;
        }

        public final void onFetchThumbnailResponse(OnFetchThumbnailResponse onfetchthumbnailresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onfetchthumbnailresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onfetchthumbnailresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onfetchthumbnailresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onfetchthumbnailresponse;
        }

        public final void onGetPermissionsResponse(GetPermissionsResponse getpermissionsresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (getpermissionsresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            getpermissionsresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            getpermissionsresponse;
            parcel1.recycle();
            parcel.recycle();
            throw getpermissionsresponse;
        }

        public final void onListEntriesResponse(OnListEntriesResponse onlistentriesresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onlistentriesresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            onlistentriesresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onlistentriesresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onlistentriesresponse;
        }

        public final void onListParentsResponse(OnListParentsResponse onlistparentsresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onlistparentsresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onlistparentsresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onlistparentsresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onlistparentsresponse;
        }

        public final void onLoadRealtimeResponse(OnLoadRealtimeResponse onloadrealtimeresponse, IRealtimeService irealtimeservice)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onloadrealtimeresponse == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            onloadrealtimeresponse.writeToParcel(parcel, 0);
_L3:
            if (irealtimeservice == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            onloadrealtimeresponse = irealtimeservice.asBinder();
_L4:
            parcel.writeStrongBinder(onloadrealtimeresponse);
            mRemote.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            onloadrealtimeresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onloadrealtimeresponse;
            onloadrealtimeresponse = null;
              goto _L4
        }

        public final void onMetadataResponse(OnMetadataResponse onmetadataresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onmetadataresponse == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            onmetadataresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onmetadataresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onmetadataresponse;
        }

        public final void onResourceIdSetResponse(OnResourceIdSetResponse onresourceidsetresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onresourceidsetresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onresourceidsetresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onresourceidsetresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onresourceidsetresponse;
        }

        public final void onStartStreamSession(OnStartStreamSession onstartstreamsession)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onstartstreamsession == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onstartstreamsession.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onstartstreamsession;
            parcel1.recycle();
            parcel.recycle();
            throw onstartstreamsession;
        }

        public final void onStringListResponse(StringListResponse stringlistresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (stringlistresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            stringlistresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            stringlistresponse;
            parcel1.recycle();
            parcel.recycle();
            throw stringlistresponse;
        }

        public final void onSuccess()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            mRemote.transact(7, parcel, parcel1, 0);
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

        public final void onSyncMoreResponse(OnSyncMoreResponse onsyncmoreresponse)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (onsyncmoreresponse == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            onsyncmoreresponse.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            onsyncmoreresponse;
            parcel1.recycle();
            parcel.recycle();
            throw onsyncmoreresponse;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IDriveServiceCallbacks asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        if (iinterface != null && (iinterface instanceof IDriveServiceCallbacks))
        {
            return (IDriveServiceCallbacks)iinterface;
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
            parcel1.writeString("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnDownloadProgressResponse)OnDownloadProgressResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onDownloadProgress(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnListEntriesResponse)OnListEntriesResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onListEntriesResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnDriveIdResponse)OnDriveIdResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onDriveIdResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnMetadataResponse)OnMetadataResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onMetadataResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnContentsResponse)OnContentsResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onContentsResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (Status)Status.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onError(parcel);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            onSuccess();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnListParentsResponse)OnListParentsResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onListParentsResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnSyncMoreResponse)OnSyncMoreResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onSyncMoreResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            OnLoadRealtimeResponse onloadrealtimeresponse;
            if (parcel.readInt() != 0)
            {
                onloadrealtimeresponse = (OnLoadRealtimeResponse)OnLoadRealtimeResponse.CREATOR.mParcel(parcel);
            } else
            {
                onloadrealtimeresponse = null;
            }
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                if (iinterface != null && (iinterface instanceof IRealtimeService))
                {
                    parcel = (IRealtimeService)iinterface;
                } else
                {
                    parcel = new com.google.android.gms.drive.realtime.internal.<init>(parcel);
                }
            }
            onLoadRealtimeResponse(onloadrealtimeresponse, parcel);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnResourceIdSetResponse)OnResourceIdSetResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onResourceIdSetResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnDrivePreferencesResponse)OnDrivePreferencesResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onDrivePreferencesResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnDeviceUsagePreferenceResponse)OnDeviceUsagePreferenceResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onDeviceUsagePreferenceResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            onAutobackupEnabledResponse(flag);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnFetchThumbnailResponse)OnFetchThumbnailResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onFetchThumbnailResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (ChangeSequenceNumber)ChangeSequenceNumber.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onChangeSequenceNumberResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (OnChangesResponse)OnChangesResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onChangesResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (GetPermissionsResponse)GetPermissionsResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onGetPermissionsResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (parcel.readInt() != 0)
            {
                parcel = (StringListResponse)StringListResponse.CREATOR.mParcel(parcel);
            } else
            {
                parcel = null;
            }
            onStringListResponse(parcel);
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            break;
        }
        if (parcel.readInt() != 0)
        {
            parcel = (OnStartStreamSession)OnStartStreamSession.CREATOR.mParcel(parcel);
        } else
        {
            parcel = null;
        }
        onStartStreamSession(parcel);
        parcel1.writeNoException();
        return true;
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
    }
}
