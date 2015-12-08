// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

// Referenced classes of package com.google.android.gms.drive.internal:
//            IDriveService, AddEventListenerRequest, IEventCallback, IDriveServiceCallbacks, 
//            AddPermissionRequest, AuthorizeAccessRequest, CancelPendingActionsRequest, ChangeResourceParentsRequest, 
//            CheckResourceIdsExistRequest, CloseContentsRequest, CloseContentsAndUpdateMetadataRequest, ControlProgressRequest, 
//            CreateContentsRequest, CreateFileRequest, CreateFileIntentSenderRequest, CreateFolderRequest, 
//            DeleteResourceRequest, DisconnectRequest, FetchThumbnailRequest, GetChangesRequest, 
//            GetDriveIdFromUniqueIdentifierRequest, GetMetadataRequest, GetPermissionsRequest, ListParentsRequest, 
//            LoadRealtimeRequest, OpenContentsRequest, DriveServiceResponse, OpenFileIntentSenderRequest, 
//            QueryRequest, RemoveEventListenerRequest, RemovePermissionRequest, SetDrivePreferencesRequest, 
//            SetFileUploadPreferencesRequest, SetResourceParentsRequest, StreamContentsRequest, TrashResourceRequest, 
//            UnsubscribeResourceRequest, UntrashResourceRequest, UpdateMetadataRequest, UpdatePermissionRequest

private static final class mRemote
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
        createfileintentsenderrequest = (IntentSender)IntentSender.CREATOR.FromParcel(parcel1);
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
        opencontentsrequest = (DriveServiceResponse)DriveServiceResponse.CREATOR.FromParcel(parcel1);
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
        openfileintentsenderrequest = (IntentSender)IntentSender.CREATOR.FromParcel(parcel1);
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
        streamcontentsrequest = (DriveServiceResponse)DriveServiceResponse.CREATOR.FromParcel(parcel1);
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

    t(IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
