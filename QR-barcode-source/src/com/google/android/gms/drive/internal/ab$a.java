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
//            ab, GetMetadataRequest, QueryRequest, UpdateMetadataRequest, 
//            CreateContentsRequest, CreateFileRequest, CreateFolderRequest, OpenContentsRequest, 
//            CloseContentsRequest, OpenFileIntentSenderRequest, CreateFileIntentSenderRequest, AuthorizeAccessRequest, 
//            ListParentsRequest, AddEventListenerRequest, RemoveEventListenerRequest, DisconnectRequest, 
//            TrashResourceRequest, CloseContentsAndUpdateMetadataRequest, DeleteResourceRequest, LoadRealtimeRequest, 
//            SetResourceParentsRequest, GetDriveIdFromUniqueIdentifierRequest, CheckResourceIdsExistRequest, SetDrivePreferencesRequest, 
//            ac, ad

public static abstract class a.lb extends Binder
    implements ab
{
    private static class a
        implements ab
    {

        private IBinder lb;

        public IntentSender a(CreateFileIntentSenderRequest createfileintentsenderrequest)
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
            lb.transact(11, parcel, parcel1, 0);
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

        public IntentSender a(OpenFileIntentSenderRequest openfileintentsenderrequest)
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
            lb.transact(10, parcel, parcel1, 0);
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

        public void a(RealtimeDocumentSyncRequest realtimedocumentsyncrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            realtimedocumentsyncrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(realtimedocumentsyncrequest);
            lb.transact(34, parcel, parcel1, 0);
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

        public void a(AddEventListenerRequest addeventlistenerrequest, ad ad1, String s, ac ac1)
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
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            addeventlistenerrequest = ad1.asBinder();
_L4:
            parcel.writeStrongBinder(addeventlistenerrequest);
            parcel.writeString(s);
            addeventlistenerrequest = obj;
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            addeventlistenerrequest = ac1.asBinder();
            parcel.writeStrongBinder(addeventlistenerrequest);
            lb.transact(14, parcel, parcel1, 0);
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

        public void a(AuthorizeAccessRequest authorizeaccessrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            authorizeaccessrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(authorizeaccessrequest);
            lb.transact(12, parcel, parcel1, 0);
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

        public void a(CheckResourceIdsExistRequest checkresourceidsexistrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            checkresourceidsexistrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(checkresourceidsexistrequest);
            lb.transact(30, parcel, parcel1, 0);
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

        public void a(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            closecontentsandupdatemetadatarequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(closecontentsandupdatemetadatarequest);
            lb.transact(18, parcel, parcel1, 0);
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

        public void a(CloseContentsRequest closecontentsrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            closecontentsrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(closecontentsrequest);
            lb.transact(8, parcel, parcel1, 0);
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

        public void a(CreateContentsRequest createcontentsrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            createcontentsrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(createcontentsrequest);
            lb.transact(4, parcel, parcel1, 0);
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

        public void a(CreateFileRequest createfilerequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            createfilerequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(createfilerequest);
            lb.transact(5, parcel, parcel1, 0);
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

        public void a(CreateFolderRequest createfolderrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            createfolderrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(createfolderrequest);
            lb.transact(6, parcel, parcel1, 0);
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

        public void a(DeleteResourceRequest deleteresourcerequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            deleteresourcerequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(deleteresourcerequest);
            lb.transact(24, parcel, parcel1, 0);
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

        public void a(DisconnectRequest disconnectrequest)
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
            lb.transact(16, parcel, parcel1, 0);
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

        public void a(GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            getdriveidfromuniqueidentifierrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(getdriveidfromuniqueidentifierrequest);
            lb.transact(29, parcel, parcel1, 0);
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

        public void a(GetMetadataRequest getmetadatarequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            getmetadatarequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(getmetadatarequest);
            lb.transact(1, parcel, parcel1, 0);
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

        public void a(ListParentsRequest listparentsrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            listparentsrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(listparentsrequest);
            lb.transact(13, parcel, parcel1, 0);
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

        public void a(LoadRealtimeRequest loadrealtimerequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            loadrealtimerequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(loadrealtimerequest);
            lb.transact(27, parcel, parcel1, 0);
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

        public void a(OpenContentsRequest opencontentsrequest, ac ac1)
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
_L3:
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            opencontentsrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(opencontentsrequest);
            lb.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            opencontentsrequest;
            parcel1.recycle();
            parcel.recycle();
            throw opencontentsrequest;
            opencontentsrequest = null;
              goto _L4
        }

        public void a(QueryRequest queryrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            queryrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            lb.transact(2, parcel, parcel1, 0);
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

        public void a(RemoveEventListenerRequest removeeventlistenerrequest, ad ad1, String s, ac ac1)
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
            if (ad1 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            removeeventlistenerrequest = ad1.asBinder();
_L4:
            parcel.writeStrongBinder(removeeventlistenerrequest);
            parcel.writeString(s);
            removeeventlistenerrequest = obj;
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            removeeventlistenerrequest = ac1.asBinder();
            parcel.writeStrongBinder(removeeventlistenerrequest);
            lb.transact(15, parcel, parcel1, 0);
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

        public void a(SetDrivePreferencesRequest setdrivepreferencesrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setdrivepreferencesrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(setdrivepreferencesrequest);
            lb.transact(33, parcel, parcel1, 0);
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

        public void a(SetResourceParentsRequest setresourceparentsrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setresourceparentsrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(setresourceparentsrequest);
            lb.transact(28, parcel, parcel1, 0);
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

        public void a(TrashResourceRequest trashresourcerequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            trashresourcerequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(trashresourcerequest);
            lb.transact(17, parcel, parcel1, 0);
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

        public void a(UpdateMetadataRequest updatemetadatarequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            updatemetadatarequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(updatemetadatarequest);
            lb.transact(3, parcel, parcel1, 0);
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

        public void a(ac ac1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            lb.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ac1 = null;
              goto _L1
            ac1;
            parcel1.recycle();
            parcel.recycle();
            throw ac1;
        }

        public IBinder asBinder()
        {
            return lb;
        }

        public void b(QueryRequest queryrequest, ac ac1)
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
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            queryrequest = ac1.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            lb.transact(19, parcel, parcel1, 0);
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

        public void b(ac ac1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            lb.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ac1 = null;
              goto _L1
            ac1;
            parcel1.recycle();
            parcel.recycle();
            throw ac1;
        }

        public void c(ac ac1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            lb.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ac1 = null;
              goto _L1
            ac1;
            parcel1.recycle();
            parcel.recycle();
            throw ac1;
        }

        public void d(ac ac1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            lb.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ac1 = null;
              goto _L1
            ac1;
            parcel1.recycle();
            parcel.recycle();
            throw ac1;
        }

        public void e(ac ac1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            lb.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ac1 = null;
              goto _L1
            ac1;
            parcel1.recycle();
            parcel.recycle();
            throw ac1;
        }

        public void f(ac ac1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            lb.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ac1 = null;
              goto _L1
            ac1;
            parcel1.recycle();
            parcel.recycle();
            throw ac1;
        }

        public void g(ac ac1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (ac1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            ac1 = ac1.asBinder();
_L1:
            parcel.writeStrongBinder(ac1);
            lb.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            ac1 = null;
              goto _L1
            ac1;
            parcel1.recycle();
            parcel.recycle();
            throw ac1;
        }

        a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public static ab U(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
        if (iinterface != null && (iinterface instanceof ab))
        {
            return (ab)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj1 = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.drive.internal.IDriveService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            if (parcel.readInt() != 0)
            {
                obj = (GetMetadataRequest)GetMetadataRequest.CREATOR.createFromParcel(parcel);
            }
            a(((GetMetadataRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
            }
            a(((QueryRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (UpdateMetadataRequest)UpdateMetadataRequest.CREATOR.createFromParcel(parcel);
            }
            a(((UpdateMetadataRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (CreateContentsRequest)CreateContentsRequest.CREATOR.createFromParcel(parcel);
            }
            a(((CreateContentsRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = (CreateFileRequest)CreateFileRequest.CREATOR.createFromParcel(parcel);
            }
            a(((CreateFileRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = (CreateFolderRequest)CreateFolderRequest.CREATOR.createFromParcel(parcel);
            }
            a(((CreateFolderRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = (OpenContentsRequest)OpenContentsRequest.CREATOR.createFromParcel(parcel);
            }
            a(((OpenContentsRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj7;
            if (parcel.readInt() != 0)
            {
                obj = (CloseContentsRequest)CloseContentsRequest.CREATOR.createFromParcel(parcel);
            }
            a(((CloseContentsRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            a(V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = (OpenFileIntentSenderRequest)OpenFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
            }
            parcel = a(((OpenFileIntentSenderRequest) (obj)));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj9;
            if (parcel.readInt() != 0)
            {
                obj = (CreateFileIntentSenderRequest)CreateFileIntentSenderRequest.CREATOR.createFromParcel(parcel);
            }
            parcel = a(((CreateFileIntentSenderRequest) (obj)));
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj10;
            if (parcel.readInt() != 0)
            {
                obj = (AuthorizeAccessRequest)AuthorizeAccessRequest.CREATOR.createFromParcel(parcel);
            }
            a(((AuthorizeAccessRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj11;
            if (parcel.readInt() != 0)
            {
                obj = (ListParentsRequest)ListParentsRequest.CREATOR.createFromParcel(parcel);
            }
            a(((ListParentsRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj12;
            if (parcel.readInt() != 0)
            {
                obj = (AddEventListenerRequest)AddEventListenerRequest.CREATOR.createFromParcel(parcel);
            }
            a(((AddEventListenerRequest) (obj)), W(parcel.readStrongBinder()), parcel.readString(), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj13;
            if (parcel.readInt() != 0)
            {
                obj = (RemoveEventListenerRequest)RemoveEventListenerRequest.CREATOR.createFromParcel(parcel);
            }
            a(((RemoveEventListenerRequest) (obj)), W(parcel.readStrongBinder()), parcel.readString(), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj14;
            if (parcel.readInt() != 0)
            {
                obj = (DisconnectRequest)DisconnectRequest.CREATOR.createFromParcel(parcel);
            }
            a(((DisconnectRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj15;
            if (parcel.readInt() != 0)
            {
                obj = (TrashResourceRequest)TrashResourceRequest.CREATOR.createFromParcel(parcel);
            }
            a(((TrashResourceRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj16;
            if (parcel.readInt() != 0)
            {
                obj = (CloseContentsAndUpdateMetadataRequest)CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(parcel);
            }
            a(((CloseContentsAndUpdateMetadataRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj17;
            if (parcel.readInt() != 0)
            {
                obj = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
            }
            b(((QueryRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            b(V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            c(V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            d(V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            e(V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj18;
            if (parcel.readInt() != 0)
            {
                obj = (DeleteResourceRequest)DeleteResourceRequest.CREATOR.createFromParcel(parcel);
            }
            a(((DeleteResourceRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj19;
            if (parcel.readInt() != 0)
            {
                obj = (LoadRealtimeRequest)LoadRealtimeRequest.CREATOR.createFromParcel(parcel);
            }
            a(((LoadRealtimeRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj20;
            if (parcel.readInt() != 0)
            {
                obj = (SetResourceParentsRequest)SetResourceParentsRequest.CREATOR.createFromParcel(parcel);
            }
            a(((SetResourceParentsRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj21;
            if (parcel.readInt() != 0)
            {
                obj = (GetDriveIdFromUniqueIdentifierRequest)GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(parcel);
            }
            a(((GetDriveIdFromUniqueIdentifierRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj22;
            if (parcel.readInt() != 0)
            {
                obj = (CheckResourceIdsExistRequest)CheckResourceIdsExistRequest.CREATOR.createFromParcel(parcel);
            }
            a(((CheckResourceIdsExistRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            f(V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            g(V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj23;
            if (parcel.readInt() != 0)
            {
                obj = (SetDrivePreferencesRequest)SetDrivePreferencesRequest.CREATOR.createFromParcel(parcel);
            }
            a(((SetDrivePreferencesRequest) (obj)), V(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
            obj = obj24;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (RealtimeDocumentSyncRequest)RealtimeDocumentSyncRequest.CREATOR.createFromParcel(parcel);
        }
        a(((RealtimeDocumentSyncRequest) (obj)), V(parcel.readStrongBinder()));
        parcel1.writeNoException();
        return true;
    }
}
