// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

// Referenced classes of package com.google.android.gms.drive.internal:
//            IDriveService, GetMetadataRequest, QueryRequest, UpdateMetadataRequest, 
//            CreateContentsRequest, CreateFileRequest, CreateFolderRequest, OpenContentsRequest, 
//            DriveServiceResponse, CloseContentsRequest, OpenFileIntentSenderRequest, CreateFileIntentSenderRequest, 
//            AuthorizeAccessRequest, ListParentsRequest, AddEventListenerRequest, RemoveEventListenerRequest, 
//            DisconnectRequest, TrashResourceRequest, CloseContentsAndUpdateMetadataRequest, DeleteResourceRequest, 
//            LoadRealtimeRequest, SetResourceParentsRequest, GetDriveIdFromUniqueIdentifierRequest, CheckResourceIdsExistRequest, 
//            SetDrivePreferencesRequest, SetFileUploadPreferencesRequest, CancelPendingActionsRequest, UntrashResourceRequest, 
//            FetchThumbnailRequest, GetChangesRequest, UnsubscribeResourceRequest, GetPermissionsRequest, 
//            AddPermissionRequest, UpdatePermissionRequest, RemovePermissionRequest, ControlProgressRequest, 
//            ChangeResourceParentsRequest, StreamContentsRequest, IEventCallback, IDriveServiceCallbacks

public static abstract class Proxy.mRemote extends Binder
    implements IDriveService
{
    private static final class Proxy
        implements IDriveService
    {

        private IBinder mRemote;

        public final void addEventListener(AddEventListenerRequest addeventlistenerrequest, IEventCallback ieventcallback, String s, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (addeventlistenerrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            addeventlistenerrequest.writeToParcel(parcel, 0);
_L3:
            if (ieventcallback == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            addeventlistenerrequest = ieventcallback.asBinder();
_L4:
            parcel.writeStrongBinder(addeventlistenerrequest);
            parcel.writeString(s);
            addeventlistenerrequest = obj;
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            addeventlistenerrequest = idriveservicecallbacks.asBinder();
            parcel.writeStrongBinder(addeventlistenerrequest);
            mRemote.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            addeventlistenerrequest;
            parcel1.recycle();
            parcel.recycle();
            throw addeventlistenerrequest;
            addeventlistenerrequest = null;
              goto _L4
        }

        public final void addPermission(AddPermissionRequest addpermissionrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (addpermissionrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            addpermissionrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            addpermissionrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(addpermissionrequest);
            mRemote.transact(48, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            addpermissionrequest;
            parcel1.recycle();
            parcel.recycle();
            throw addpermissionrequest;
            addpermissionrequest = null;
              goto _L4
        }

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void authorizeAccess(AuthorizeAccessRequest authorizeaccessrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (authorizeaccessrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            authorizeaccessrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            authorizeaccessrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(authorizeaccessrequest);
            mRemote.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            authorizeaccessrequest;
            parcel1.recycle();
            parcel.recycle();
            throw authorizeaccessrequest;
            authorizeaccessrequest = null;
              goto _L4
        }

        public final void cancelPendingActions(CancelPendingActionsRequest cancelpendingactionsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (cancelpendingactionsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            cancelpendingactionsrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            cancelpendingactionsrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(cancelpendingactionsrequest);
            mRemote.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            cancelpendingactionsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw cancelpendingactionsrequest;
            cancelpendingactionsrequest = null;
              goto _L4
        }

        public final void changeResourceParents(ChangeResourceParentsRequest changeresourceparentsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (changeresourceparentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            changeresourceparentsrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            changeresourceparentsrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(changeresourceparentsrequest);
            mRemote.transact(55, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            changeresourceparentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw changeresourceparentsrequest;
            changeresourceparentsrequest = null;
              goto _L4
        }

        public final void checkResourceIdsExist(CheckResourceIdsExistRequest checkresourceidsexistrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (checkresourceidsexistrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            checkresourceidsexistrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            checkresourceidsexistrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(checkresourceidsexistrequest);
            mRemote.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            checkresourceidsexistrequest;
            parcel1.recycle();
            parcel.recycle();
            throw checkresourceidsexistrequest;
            checkresourceidsexistrequest = null;
              goto _L4
        }

        public final void closeContents(CloseContentsRequest closecontentsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (closecontentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            closecontentsrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            closecontentsrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(closecontentsrequest);
            mRemote.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            closecontentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw closecontentsrequest;
            closecontentsrequest = null;
              goto _L4
        }

        public final void closeContentsAndUpdateMetadata(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (closecontentsandupdatemetadatarequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            closecontentsandupdatemetadatarequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            closecontentsandupdatemetadatarequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(closecontentsandupdatemetadatarequest);
            mRemote.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            closecontentsandupdatemetadatarequest;
            parcel1.recycle();
            parcel.recycle();
            throw closecontentsandupdatemetadatarequest;
            closecontentsandupdatemetadatarequest = null;
              goto _L4
        }

        public final void completePendingActivity(IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            idriveservicecallbacks = idriveservicecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(idriveservicecallbacks);
            mRemote.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            idriveservicecallbacks = null;
              goto _L1
            idriveservicecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw idriveservicecallbacks;
        }

        public final void controlProgress(ControlProgressRequest controlprogressrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (controlprogressrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            controlprogressrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            controlprogressrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(controlprogressrequest);
            mRemote.transact(53, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            controlprogressrequest;
            parcel1.recycle();
            parcel.recycle();
            throw controlprogressrequest;
            controlprogressrequest = null;
              goto _L4
        }

        public final void createContents(CreateContentsRequest createcontentsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (createcontentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createcontentsrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            createcontentsrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(createcontentsrequest);
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            createcontentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw createcontentsrequest;
            createcontentsrequest = null;
              goto _L4
        }

        public final void createFile(CreateFileRequest createfilerequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (createfilerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createfilerequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            createfilerequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(createfilerequest);
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            createfilerequest;
            parcel1.recycle();
            parcel.recycle();
            throw createfilerequest;
            createfilerequest = null;
              goto _L4
        }

        public final IntentSender createFileIntentSender(CreateFileIntentSenderRequest createfileintentsenderrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (createfileintentsenderrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createfileintentsenderrequest.writeToParcel(parcel, 0);
_L3:
            mRemote.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            createfileintentsenderrequest = (IntentSender)IntentSender.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return createfileintentsenderrequest;
_L2:
            parcel.writeInt(0);
              goto _L3
            createfileintentsenderrequest;
            parcel1.recycle();
            parcel.recycle();
            throw createfileintentsenderrequest;
            createfileintentsenderrequest = null;
              goto _L4
        }

        public final void createFolder(CreateFolderRequest createfolderrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (createfolderrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            createfolderrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            createfolderrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(createfolderrequest);
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            createfolderrequest;
            parcel1.recycle();
            parcel.recycle();
            throw createfolderrequest;
            createfolderrequest = null;
              goto _L4
        }

        public final void deleteResource(DeleteResourceRequest deleteresourcerequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (deleteresourcerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            deleteresourcerequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            deleteresourcerequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(deleteresourcerequest);
            mRemote.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            deleteresourcerequest;
            parcel1.recycle();
            parcel.recycle();
            throw deleteresourcerequest;
            deleteresourcerequest = null;
              goto _L4
        }

        public final void disconnect(DisconnectRequest disconnectrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (disconnectrequest == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            disconnectrequest.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            disconnectrequest;
            parcel1.recycle();
            parcel.recycle();
            throw disconnectrequest;
        }

        public final void fetchThumbnail(FetchThumbnailRequest fetchthumbnailrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (fetchthumbnailrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            fetchthumbnailrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            fetchthumbnailrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(fetchthumbnailrequest);
            mRemote.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            fetchthumbnailrequest;
            parcel1.recycle();
            parcel.recycle();
            throw fetchthumbnailrequest;
            fetchthumbnailrequest = null;
              goto _L4
        }

        public final void getChanges(GetChangesRequest getchangesrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (getchangesrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getchangesrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            getchangesrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(getchangesrequest);
            mRemote.transact(44, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getchangesrequest;
            parcel1.recycle();
            parcel.recycle();
            throw getchangesrequest;
            getchangesrequest = null;
              goto _L4
        }

        public final void getCurrentChangeSequenceNumber(IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            idriveservicecallbacks = idriveservicecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(idriveservicecallbacks);
            mRemote.transact(43, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            idriveservicecallbacks = null;
              goto _L1
            idriveservicecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw idriveservicecallbacks;
        }

        public final void getDebugContents(IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            idriveservicecallbacks = idriveservicecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(idriveservicecallbacks);
            mRemote.transact(57, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            idriveservicecallbacks = null;
              goto _L1
            idriveservicecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw idriveservicecallbacks;
        }

        public final void getDriveIdFromUniqueIdentifier(GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (getdriveidfromuniqueidentifierrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getdriveidfromuniqueidentifierrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            getdriveidfromuniqueidentifierrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(getdriveidfromuniqueidentifierrequest);
            mRemote.transact(29, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getdriveidfromuniqueidentifierrequest;
            parcel1.recycle();
            parcel.recycle();
            throw getdriveidfromuniqueidentifierrequest;
            getdriveidfromuniqueidentifierrequest = null;
              goto _L4
        }

        public final void getDrivePreferences(IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            idriveservicecallbacks = idriveservicecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(idriveservicecallbacks);
            mRemote.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            idriveservicecallbacks = null;
              goto _L1
            idriveservicecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw idriveservicecallbacks;
        }

        public final void getFileUploadPreferences(IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            idriveservicecallbacks = idriveservicecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(idriveservicecallbacks);
            mRemote.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            idriveservicecallbacks = null;
              goto _L1
            idriveservicecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw idriveservicecallbacks;
        }

        public final void getFolderColorPalette(IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            idriveservicecallbacks = idriveservicecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(idriveservicecallbacks);
            mRemote.transact(54, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            idriveservicecallbacks = null;
              goto _L1
            idriveservicecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw idriveservicecallbacks;
        }

        public final void getMetadata(GetMetadataRequest getmetadatarequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (getmetadatarequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getmetadatarequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            getmetadatarequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(getmetadatarequest);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getmetadatarequest;
            parcel1.recycle();
            parcel.recycle();
            throw getmetadatarequest;
            getmetadatarequest = null;
              goto _L4
        }

        public final void getPermissions(GetPermissionsRequest getpermissionsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (getpermissionsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            getpermissionsrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            getpermissionsrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(getpermissionsrequest);
            mRemote.transact(47, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            getpermissionsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw getpermissionsrequest;
            getpermissionsrequest = null;
              goto _L4
        }

        public final void isAutobackupEnabled(IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            idriveservicecallbacks = idriveservicecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(idriveservicecallbacks);
            mRemote.transact(41, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            idriveservicecallbacks = null;
              goto _L1
            idriveservicecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw idriveservicecallbacks;
        }

        public final void listParents(ListParentsRequest listparentsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (listparentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            listparentsrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            listparentsrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(listparentsrequest);
            mRemote.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            listparentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw listparentsrequest;
            listparentsrequest = null;
              goto _L4
        }

        public final void loadRealtime(LoadRealtimeRequest loadrealtimerequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (loadrealtimerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            loadrealtimerequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            loadrealtimerequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(loadrealtimerequest);
            mRemote.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            loadrealtimerequest;
            parcel1.recycle();
            parcel.recycle();
            throw loadrealtimerequest;
            loadrealtimerequest = null;
              goto _L4
        }

        public final DriveServiceResponse openContents(OpenContentsRequest opencontentsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (opencontentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            opencontentsrequest.writeToParcel(parcel, 0);
_L5:
            if (idriveservicecallbacks == null) goto _L4; else goto _L3
_L3:
            opencontentsrequest = idriveservicecallbacks.asBinder();
_L6:
            parcel.writeStrongBinder(opencontentsrequest);
            mRemote.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_125;
            }
            opencontentsrequest = (DriveServiceResponse)DriveServiceResponse.CREATOR.createFromParcel(parcel1);
_L7:
            parcel1.recycle();
            parcel.recycle();
            return opencontentsrequest;
_L2:
            parcel.writeInt(0);
              goto _L5
            opencontentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw opencontentsrequest;
_L4:
            opencontentsrequest = null;
              goto _L6
            opencontentsrequest = null;
              goto _L7
        }

        public final IntentSender openFileIntentSender(OpenFileIntentSenderRequest openfileintentsenderrequest)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (openfileintentsenderrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            openfileintentsenderrequest.writeToParcel(parcel, 0);
_L3:
            mRemote.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            openfileintentsenderrequest = (IntentSender)IntentSender.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return openfileintentsenderrequest;
_L2:
            parcel.writeInt(0);
              goto _L3
            openfileintentsenderrequest;
            parcel1.recycle();
            parcel.recycle();
            throw openfileintentsenderrequest;
            openfileintentsenderrequest = null;
              goto _L4
        }

        public final void query(QueryRequest queryrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (queryrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            queryrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            queryrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            queryrequest;
            parcel1.recycle();
            parcel.recycle();
            throw queryrequest;
            queryrequest = null;
              goto _L4
        }

        public final void removeEventListener(RemoveEventListenerRequest removeeventlistenerrequest, IEventCallback ieventcallback, String s, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (removeeventlistenerrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            removeeventlistenerrequest.writeToParcel(parcel, 0);
_L3:
            if (ieventcallback == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            removeeventlistenerrequest = ieventcallback.asBinder();
_L4:
            parcel.writeStrongBinder(removeeventlistenerrequest);
            parcel.writeString(s);
            removeeventlistenerrequest = obj;
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            removeeventlistenerrequest = idriveservicecallbacks.asBinder();
            parcel.writeStrongBinder(removeeventlistenerrequest);
            mRemote.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            removeeventlistenerrequest;
            parcel1.recycle();
            parcel.recycle();
            throw removeeventlistenerrequest;
            removeeventlistenerrequest = null;
              goto _L4
        }

        public final void removePermission(RemovePermissionRequest removepermissionrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (removepermissionrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            removepermissionrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            removepermissionrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(removepermissionrequest);
            mRemote.transact(50, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            removepermissionrequest;
            parcel1.recycle();
            parcel.recycle();
            throw removepermissionrequest;
            removepermissionrequest = null;
              goto _L4
        }

        public final void requestSync(IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            idriveservicecallbacks = idriveservicecallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(idriveservicecallbacks);
            mRemote.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            idriveservicecallbacks = null;
              goto _L1
            idriveservicecallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw idriveservicecallbacks;
        }

        public final void setDrivePreferences(SetDrivePreferencesRequest setdrivepreferencesrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (setdrivepreferencesrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            setdrivepreferencesrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setdrivepreferencesrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(setdrivepreferencesrequest);
            mRemote.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            setdrivepreferencesrequest;
            parcel1.recycle();
            parcel.recycle();
            throw setdrivepreferencesrequest;
            setdrivepreferencesrequest = null;
              goto _L4
        }

        public final void setFileUploadPreferences(SetFileUploadPreferencesRequest setfileuploadpreferencesrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (setfileuploadpreferencesrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            setfileuploadpreferencesrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setfileuploadpreferencesrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(setfileuploadpreferencesrequest);
            mRemote.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            setfileuploadpreferencesrequest;
            parcel1.recycle();
            parcel.recycle();
            throw setfileuploadpreferencesrequest;
            setfileuploadpreferencesrequest = null;
              goto _L4
        }

        public final void setResourceParents(SetResourceParentsRequest setresourceparentsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (setresourceparentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            setresourceparentsrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setresourceparentsrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(setresourceparentsrequest);
            mRemote.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            setresourceparentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw setresourceparentsrequest;
            setresourceparentsrequest = null;
              goto _L4
        }

        public final void startLiveQuery(QueryRequest queryrequest, IEventCallback ieventcallback, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (queryrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            queryrequest.writeToParcel(parcel, 0);
_L3:
            if (ieventcallback == null)
            {
                break MISSING_BLOCK_LABEL_129;
            }
            queryrequest = ieventcallback.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            queryrequest = obj;
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_68;
            }
            queryrequest = idriveservicecallbacks.asBinder();
            parcel.writeStrongBinder(queryrequest);
            mRemote.transact(51, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            queryrequest;
            parcel1.recycle();
            parcel.recycle();
            throw queryrequest;
            queryrequest = null;
              goto _L4
        }

        public final void stopLiveQuery(IEventCallback ieventcallback, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (ieventcallback == null)
            {
                break MISSING_BLOCK_LABEL_88;
            }
            ieventcallback = ieventcallback.asBinder();
_L1:
            parcel.writeStrongBinder(ieventcallback);
            ieventcallback = obj;
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_49;
            }
            ieventcallback = idriveservicecallbacks.asBinder();
            parcel.writeStrongBinder(ieventcallback);
            mRemote.transact(52, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ieventcallback = null;
              goto _L1
            ieventcallback;
            parcel1.recycle();
            parcel.recycle();
            throw ieventcallback;
        }

        public final DriveServiceResponse streamContents(StreamContentsRequest streamcontentsrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (streamcontentsrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            streamcontentsrequest.writeToParcel(parcel, 0);
_L5:
            if (idriveservicecallbacks == null) goto _L4; else goto _L3
_L3:
            streamcontentsrequest = idriveservicecallbacks.asBinder();
_L6:
            parcel.writeStrongBinder(streamcontentsrequest);
            mRemote.transact(56, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_125;
            }
            streamcontentsrequest = (DriveServiceResponse)DriveServiceResponse.CREATOR.createFromParcel(parcel1);
_L7:
            parcel1.recycle();
            parcel.recycle();
            return streamcontentsrequest;
_L2:
            parcel.writeInt(0);
              goto _L5
            streamcontentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw streamcontentsrequest;
_L4:
            streamcontentsrequest = null;
              goto _L6
            streamcontentsrequest = null;
              goto _L7
        }

        public final void syncMore(QueryRequest queryrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (queryrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            queryrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            queryrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            mRemote.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            queryrequest;
            parcel1.recycle();
            parcel.recycle();
            throw queryrequest;
            queryrequest = null;
              goto _L4
        }

        public final void syncRealtimeDocuments(RealtimeDocumentSyncRequest realtimedocumentsyncrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (realtimedocumentsyncrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            realtimedocumentsyncrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            realtimedocumentsyncrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(realtimedocumentsyncrequest);
            mRemote.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            realtimedocumentsyncrequest;
            parcel1.recycle();
            parcel.recycle();
            throw realtimedocumentsyncrequest;
            realtimedocumentsyncrequest = null;
              goto _L4
        }

        public final void trashResource(TrashResourceRequest trashresourcerequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (trashresourcerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            trashresourcerequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            trashresourcerequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(trashresourcerequest);
            mRemote.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            trashresourcerequest;
            parcel1.recycle();
            parcel.recycle();
            throw trashresourcerequest;
            trashresourcerequest = null;
              goto _L4
        }

        public final void unsubscribeResource(UnsubscribeResourceRequest unsubscriberesourcerequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (unsubscriberesourcerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            unsubscriberesourcerequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            unsubscriberesourcerequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(unsubscriberesourcerequest);
            mRemote.transact(46, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            unsubscriberesourcerequest;
            parcel1.recycle();
            parcel.recycle();
            throw unsubscriberesourcerequest;
            unsubscriberesourcerequest = null;
              goto _L4
        }

        public final void untrashResource(UntrashResourceRequest untrashresourcerequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (untrashresourcerequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            untrashresourcerequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            untrashresourcerequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(untrashresourcerequest);
            mRemote.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            untrashresourcerequest;
            parcel1.recycle();
            parcel.recycle();
            throw untrashresourcerequest;
            untrashresourcerequest = null;
              goto _L4
        }

        public final void updateMetadata(UpdateMetadataRequest updatemetadatarequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (updatemetadatarequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            updatemetadatarequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            updatemetadatarequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(updatemetadatarequest);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            updatemetadatarequest;
            parcel1.recycle();
            parcel.recycle();
            throw updatemetadatarequest;
            updatemetadatarequest = null;
              goto _L4
        }

        public final void updatePermission(UpdatePermissionRequest updatepermissionrequest, IDriveServiceCallbacks idriveservicecallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (updatepermissionrequest == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            updatepermissionrequest.writeToParcel(parcel, 0);
_L3:
            if (idriveservicecallbacks == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            updatepermissionrequest = idriveservicecallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(updatepermissionrequest);
            mRemote.transact(49, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            updatepermissionrequest;
            parcel1.recycle();
            parcel.recycle();
            throw updatepermissionrequest;
            updatepermissionrequest = null;
              goto _L4
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public static IDriveService asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
        if (iinterface != null && (iinterface instanceof IDriveService))
        {
            return (IDriveService)iinterface;
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
            parcel1.writeString("com.google.android.gms.drive.internal.IDriveService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            GetMetadataRequest getmetadatarequest;
            if (parcel.readInt() != 0)
            {
                getmetadatarequest = (GetMetadataRequest)GetMetadataRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                getmetadatarequest = null;
            }
            getMetadata(getmetadatarequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            QueryRequest queryrequest;
            if (parcel.readInt() != 0)
            {
                queryrequest = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                queryrequest = null;
            }
            query(queryrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            UpdateMetadataRequest updatemetadatarequest;
            if (parcel.readInt() != 0)
            {
                updatemetadatarequest = (UpdateMetadataRequest)UpdateMetadataRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                updatemetadatarequest = null;
            }
            updateMetadata(updatemetadatarequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CreateContentsRequest createcontentsrequest;
            if (parcel.readInt() != 0)
            {
                createcontentsrequest = (CreateContentsRequest)CreateContentsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                createcontentsrequest = null;
            }
            createContents(createcontentsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CreateFileRequest createfilerequest;
            if (parcel.readInt() != 0)
            {
                createfilerequest = (CreateFileRequest)CreateFileRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                createfilerequest = null;
            }
            createFile(createfilerequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CreateFolderRequest createfolderrequest;
            if (parcel.readInt() != 0)
            {
                createfolderrequest = (CreateFolderRequest)CreateFolderRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                createfolderrequest = null;
            }
            createFolder(createfolderrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            OpenContentsRequest opencontentsrequest;
            if (parcel.readInt() != 0)
            {
                opencontentsrequest = (OpenContentsRequest)OpenContentsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                opencontentsrequest = null;
            }
            parcel = openContents(opencontentsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CloseContentsRequest closecontentsrequest;
            if (parcel.readInt() != 0)
            {
                closecontentsrequest = (CloseContentsRequest)CloseContentsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                closecontentsrequest = null;
            }
            closeContents(closecontentsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            requestSync(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            if (parcel.readInt() != 0)
            {
                parcel = (OpenFileIntentSenderRequest)OpenFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = openFileIntentSender(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            if (parcel.readInt() != 0)
            {
                parcel = (CreateFileIntentSenderRequest)CreateFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            parcel = createFileIntentSender(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            AuthorizeAccessRequest authorizeaccessrequest;
            if (parcel.readInt() != 0)
            {
                authorizeaccessrequest = (AuthorizeAccessRequest)AuthorizeAccessRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                authorizeaccessrequest = null;
            }
            authorizeAccess(authorizeaccessrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            ListParentsRequest listparentsrequest;
            if (parcel.readInt() != 0)
            {
                listparentsrequest = (ListParentsRequest)ListParentsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                listparentsrequest = null;
            }
            listParents(listparentsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            AddEventListenerRequest addeventlistenerrequest;
            if (parcel.readInt() != 0)
            {
                addeventlistenerrequest = (AddEventListenerRequest)AddEventListenerRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                addeventlistenerrequest = null;
            }
            addEventListener(addeventlistenerrequest, .asInterface(parcel.readStrongBinder()), parcel.readString(), cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            RemoveEventListenerRequest removeeventlistenerrequest;
            if (parcel.readInt() != 0)
            {
                removeeventlistenerrequest = (RemoveEventListenerRequest)RemoveEventListenerRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                removeeventlistenerrequest = null;
            }
            removeEventListener(removeeventlistenerrequest, .asInterface(parcel.readStrongBinder()), parcel.readString(), cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            if (parcel.readInt() != 0)
            {
                parcel = (DisconnectRequest)DisconnectRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            disconnect(parcel);
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            TrashResourceRequest trashresourcerequest;
            if (parcel.readInt() != 0)
            {
                trashresourcerequest = (TrashResourceRequest)TrashResourceRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                trashresourcerequest = null;
            }
            trashResource(trashresourcerequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest;
            if (parcel.readInt() != 0)
            {
                closecontentsandupdatemetadatarequest = (CloseContentsAndUpdateMetadataRequest)CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                closecontentsandupdatemetadatarequest = null;
            }
            closeContentsAndUpdateMetadata(closecontentsandupdatemetadatarequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            QueryRequest queryrequest1;
            if (parcel.readInt() != 0)
            {
                queryrequest1 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                queryrequest1 = null;
            }
            syncMore(queryrequest1, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            DeleteResourceRequest deleteresourcerequest;
            if (parcel.readInt() != 0)
            {
                deleteresourcerequest = (DeleteResourceRequest)DeleteResourceRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                deleteresourcerequest = null;
            }
            deleteResource(deleteresourcerequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            LoadRealtimeRequest loadrealtimerequest;
            if (parcel.readInt() != 0)
            {
                loadrealtimerequest = (LoadRealtimeRequest)LoadRealtimeRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                loadrealtimerequest = null;
            }
            loadRealtime(loadrealtimerequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            SetResourceParentsRequest setresourceparentsrequest;
            if (parcel.readInt() != 0)
            {
                setresourceparentsrequest = (SetResourceParentsRequest)SetResourceParentsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                setresourceparentsrequest = null;
            }
            setResourceParents(setresourceparentsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest;
            if (parcel.readInt() != 0)
            {
                getdriveidfromuniqueidentifierrequest = (GetDriveIdFromUniqueIdentifierRequest)GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                getdriveidfromuniqueidentifierrequest = null;
            }
            getDriveIdFromUniqueIdentifier(getdriveidfromuniqueidentifierrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CheckResourceIdsExistRequest checkresourceidsexistrequest;
            if (parcel.readInt() != 0)
            {
                checkresourceidsexistrequest = (CheckResourceIdsExistRequest)CheckResourceIdsExistRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                checkresourceidsexistrequest = null;
            }
            checkResourceIdsExist(checkresourceidsexistrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            completePendingActivity(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            getDrivePreferences(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            SetDrivePreferencesRequest setdrivepreferencesrequest;
            if (parcel.readInt() != 0)
            {
                setdrivepreferencesrequest = (SetDrivePreferencesRequest)SetDrivePreferencesRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                setdrivepreferencesrequest = null;
            }
            setDrivePreferences(setdrivepreferencesrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            RealtimeDocumentSyncRequest realtimedocumentsyncrequest;
            if (parcel.readInt() != 0)
            {
                realtimedocumentsyncrequest = (RealtimeDocumentSyncRequest)RealtimeDocumentSyncRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                realtimedocumentsyncrequest = null;
            }
            syncRealtimeDocuments(realtimedocumentsyncrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            getFileUploadPreferences(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            SetFileUploadPreferencesRequest setfileuploadpreferencesrequest;
            if (parcel.readInt() != 0)
            {
                setfileuploadpreferencesrequest = (SetFileUploadPreferencesRequest)SetFileUploadPreferencesRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                setfileuploadpreferencesrequest = null;
            }
            setFileUploadPreferences(setfileuploadpreferencesrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            CancelPendingActionsRequest cancelpendingactionsrequest;
            if (parcel.readInt() != 0)
            {
                cancelpendingactionsrequest = (CancelPendingActionsRequest)CancelPendingActionsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                cancelpendingactionsrequest = null;
            }
            cancelPendingActions(cancelpendingactionsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            UntrashResourceRequest untrashresourcerequest;
            if (parcel.readInt() != 0)
            {
                untrashresourcerequest = (UntrashResourceRequest)UntrashResourceRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                untrashresourcerequest = null;
            }
            untrashResource(untrashresourcerequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            isAutobackupEnabled(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            FetchThumbnailRequest fetchthumbnailrequest;
            if (parcel.readInt() != 0)
            {
                fetchthumbnailrequest = (FetchThumbnailRequest)FetchThumbnailRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                fetchthumbnailrequest = null;
            }
            fetchThumbnail(fetchthumbnailrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            getCurrentChangeSequenceNumber(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            GetChangesRequest getchangesrequest;
            if (parcel.readInt() != 0)
            {
                getchangesrequest = (GetChangesRequest)GetChangesRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                getchangesrequest = null;
            }
            getChanges(getchangesrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 46: // '.'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            UnsubscribeResourceRequest unsubscriberesourcerequest;
            if (parcel.readInt() != 0)
            {
                unsubscriberesourcerequest = (UnsubscribeResourceRequest)UnsubscribeResourceRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                unsubscriberesourcerequest = null;
            }
            unsubscribeResource(unsubscriberesourcerequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 47: // '/'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            GetPermissionsRequest getpermissionsrequest;
            if (parcel.readInt() != 0)
            {
                getpermissionsrequest = (GetPermissionsRequest)GetPermissionsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                getpermissionsrequest = null;
            }
            getPermissions(getpermissionsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 48: // '0'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            AddPermissionRequest addpermissionrequest;
            if (parcel.readInt() != 0)
            {
                addpermissionrequest = (AddPermissionRequest)AddPermissionRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                addpermissionrequest = null;
            }
            addPermission(addpermissionrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 49: // '1'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            UpdatePermissionRequest updatepermissionrequest;
            if (parcel.readInt() != 0)
            {
                updatepermissionrequest = (UpdatePermissionRequest)UpdatePermissionRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                updatepermissionrequest = null;
            }
            updatePermission(updatepermissionrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 50: // '2'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            RemovePermissionRequest removepermissionrequest;
            if (parcel.readInt() != 0)
            {
                removepermissionrequest = (RemovePermissionRequest)RemovePermissionRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                removepermissionrequest = null;
            }
            removePermission(removepermissionrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 51: // '3'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            QueryRequest queryrequest2;
            if (parcel.readInt() != 0)
            {
                queryrequest2 = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                queryrequest2 = null;
            }
            startLiveQuery(queryrequest2, .asInterface(parcel.readStrongBinder()), cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 52: // '4'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            stopLiveQuery(.asInterface(parcel.readStrongBinder()), cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 53: // '5'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            ControlProgressRequest controlprogressrequest;
            if (parcel.readInt() != 0)
            {
                controlprogressrequest = (ControlProgressRequest)ControlProgressRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                controlprogressrequest = null;
            }
            controlProgress(controlprogressrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 54: // '6'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            getFolderColorPalette(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 55: // '7'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            ChangeResourceParentsRequest changeresourceparentsrequest;
            if (parcel.readInt() != 0)
            {
                changeresourceparentsrequest = (ChangeResourceParentsRequest)ChangeResourceParentsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                changeresourceparentsrequest = null;
            }
            changeResourceParents(changeresourceparentsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 56: // '8'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            StreamContentsRequest streamcontentsrequest;
            if (parcel.readInt() != 0)
            {
                streamcontentsrequest = (StreamContentsRequest)StreamContentsRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                streamcontentsrequest = null;
            }
            parcel = streamContents(streamcontentsrequest, cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 57: // '9'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            getDebugContents(cks.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
