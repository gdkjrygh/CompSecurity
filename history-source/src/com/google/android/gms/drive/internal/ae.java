// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.content.IntentSender;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.drive.RealtimeDocumentSyncRequest;

// Referenced classes of package com.google.android.gms.drive.internal:
//            CreateFileIntentSenderRequest, OpenFileIntentSenderRequest, af, AddEventListenerRequest, 
//            ag, AuthorizeAccessRequest, CancelPendingActionsRequest, CheckResourceIdsExistRequest, 
//            CloseContentsAndUpdateMetadataRequest, CloseContentsRequest, CreateContentsRequest, CreateFileRequest, 
//            CreateFolderRequest, DeleteResourceRequest, DisconnectRequest, GetDriveIdFromUniqueIdentifierRequest, 
//            GetMetadataRequest, ListParentsRequest, LoadRealtimeRequest, OpenContentsRequest, 
//            QueryRequest, RemoveEventListenerRequest, SetDrivePreferencesRequest, SetFileUploadPreferencesRequest, 
//            SetResourceParentsRequest, TrashResourceRequest, UpdateMetadataRequest

public interface ae
    extends IInterface
{
    public static abstract class a extends Binder
        implements ae
    {

        public static ae X(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveService");
            if (iinterface != null && (iinterface instanceof ae))
            {
                return (ae)iinterface;
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
            Object obj25 = null;
            Object obj26 = null;
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
                a(((GetMetadataRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
                }
                a(((QueryRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (UpdateMetadataRequest)UpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                }
                a(((UpdateMetadataRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (CreateContentsRequest)CreateContentsRequest.CREATOR.createFromParcel(parcel);
                }
                a(((CreateContentsRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (CreateFileRequest)CreateFileRequest.CREATOR.createFromParcel(parcel);
                }
                a(((CreateFileRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (CreateFolderRequest)CreateFolderRequest.CREATOR.createFromParcel(parcel);
                }
                a(((CreateFolderRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (OpenContentsRequest)OpenContentsRequest.CREATOR.createFromParcel(parcel);
                }
                a(((OpenContentsRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = (CloseContentsRequest)CloseContentsRequest.CREATOR.createFromParcel(parcel);
                }
                a(((CloseContentsRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                a(af.a.Y(parcel.readStrongBinder()));
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
                a(((AuthorizeAccessRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj11;
                if (parcel.readInt() != 0)
                {
                    obj = (ListParentsRequest)ListParentsRequest.CREATOR.createFromParcel(parcel);
                }
                a(((ListParentsRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj12;
                if (parcel.readInt() != 0)
                {
                    obj = (AddEventListenerRequest)AddEventListenerRequest.CREATOR.createFromParcel(parcel);
                }
                a(((AddEventListenerRequest) (obj)), ag.a.Z(parcel.readStrongBinder()), parcel.readString(), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj13;
                if (parcel.readInt() != 0)
                {
                    obj = (RemoveEventListenerRequest)RemoveEventListenerRequest.CREATOR.createFromParcel(parcel);
                }
                a(((RemoveEventListenerRequest) (obj)), ag.a.Z(parcel.readStrongBinder()), parcel.readString(), af.a.Y(parcel.readStrongBinder()));
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
                a(((TrashResourceRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj16;
                if (parcel.readInt() != 0)
                {
                    obj = (CloseContentsAndUpdateMetadataRequest)CloseContentsAndUpdateMetadataRequest.CREATOR.createFromParcel(parcel);
                }
                a(((CloseContentsAndUpdateMetadataRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj17;
                if (parcel.readInt() != 0)
                {
                    obj = (QueryRequest)QueryRequest.CREATOR.createFromParcel(parcel);
                }
                b(((QueryRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                b(af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                c(af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                d(af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                e(af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj18;
                if (parcel.readInt() != 0)
                {
                    obj = (DeleteResourceRequest)DeleteResourceRequest.CREATOR.createFromParcel(parcel);
                }
                a(((DeleteResourceRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj19;
                if (parcel.readInt() != 0)
                {
                    obj = (LoadRealtimeRequest)LoadRealtimeRequest.CREATOR.createFromParcel(parcel);
                }
                a(((LoadRealtimeRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj20;
                if (parcel.readInt() != 0)
                {
                    obj = (SetResourceParentsRequest)SetResourceParentsRequest.CREATOR.createFromParcel(parcel);
                }
                a(((SetResourceParentsRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj21;
                if (parcel.readInt() != 0)
                {
                    obj = (GetDriveIdFromUniqueIdentifierRequest)GetDriveIdFromUniqueIdentifierRequest.CREATOR.createFromParcel(parcel);
                }
                a(((GetDriveIdFromUniqueIdentifierRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj22;
                if (parcel.readInt() != 0)
                {
                    obj = (CheckResourceIdsExistRequest)CheckResourceIdsExistRequest.CREATOR.createFromParcel(parcel);
                }
                a(((CheckResourceIdsExistRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                f(af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                g(af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj23;
                if (parcel.readInt() != 0)
                {
                    obj = (SetDrivePreferencesRequest)SetDrivePreferencesRequest.CREATOR.createFromParcel(parcel);
                }
                a(((SetDrivePreferencesRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj24;
                if (parcel.readInt() != 0)
                {
                    obj = (RealtimeDocumentSyncRequest)RealtimeDocumentSyncRequest.CREATOR.createFromParcel(parcel);
                }
                a(((RealtimeDocumentSyncRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                h(af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 36: // '$'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj25;
                if (parcel.readInt() != 0)
                {
                    obj = (SetFileUploadPreferencesRequest)SetFileUploadPreferencesRequest.CREATOR.createFromParcel(parcel);
                }
                a(((SetFileUploadPreferencesRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveService");
                obj = obj26;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (CancelPendingActionsRequest)CancelPendingActionsRequest.CREATOR.createFromParcel(parcel);
            }
            a(((CancelPendingActionsRequest) (obj)), af.a.Y(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }

    private static class a.a
        implements ae
    {

        private IBinder le;

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
            le.transact(11, parcel, parcel1, 0);
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
            le.transact(10, parcel, parcel1, 0);
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

        public void a(RealtimeDocumentSyncRequest realtimedocumentsyncrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            realtimedocumentsyncrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(realtimedocumentsyncrequest);
            le.transact(34, parcel, parcel1, 0);
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

        public void a(AddEventListenerRequest addeventlistenerrequest, ag ag1, String s, af af1)
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
            if (ag1 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            addeventlistenerrequest = ag1.asBinder();
_L4:
            parcel.writeStrongBinder(addeventlistenerrequest);
            parcel.writeString(s);
            addeventlistenerrequest = obj;
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            addeventlistenerrequest = af1.asBinder();
            parcel.writeStrongBinder(addeventlistenerrequest);
            le.transact(14, parcel, parcel1, 0);
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

        public void a(AuthorizeAccessRequest authorizeaccessrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            authorizeaccessrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(authorizeaccessrequest);
            le.transact(12, parcel, parcel1, 0);
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

        public void a(CancelPendingActionsRequest cancelpendingactionsrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            cancelpendingactionsrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(cancelpendingactionsrequest);
            le.transact(37, parcel, parcel1, 0);
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

        public void a(CheckResourceIdsExistRequest checkresourceidsexistrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            checkresourceidsexistrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(checkresourceidsexistrequest);
            le.transact(30, parcel, parcel1, 0);
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

        public void a(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            closecontentsandupdatemetadatarequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(closecontentsandupdatemetadatarequest);
            le.transact(18, parcel, parcel1, 0);
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

        public void a(CloseContentsRequest closecontentsrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            closecontentsrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(closecontentsrequest);
            le.transact(8, parcel, parcel1, 0);
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

        public void a(CreateContentsRequest createcontentsrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            createcontentsrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(createcontentsrequest);
            le.transact(4, parcel, parcel1, 0);
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

        public void a(CreateFileRequest createfilerequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            createfilerequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(createfilerequest);
            le.transact(5, parcel, parcel1, 0);
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

        public void a(CreateFolderRequest createfolderrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            createfolderrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(createfolderrequest);
            le.transact(6, parcel, parcel1, 0);
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

        public void a(DeleteResourceRequest deleteresourcerequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            deleteresourcerequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(deleteresourcerequest);
            le.transact(24, parcel, parcel1, 0);
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
            le.transact(16, parcel, parcel1, 0);
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

        public void a(GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            getdriveidfromuniqueidentifierrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(getdriveidfromuniqueidentifierrequest);
            le.transact(29, parcel, parcel1, 0);
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

        public void a(GetMetadataRequest getmetadatarequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            getmetadatarequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(getmetadatarequest);
            le.transact(1, parcel, parcel1, 0);
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

        public void a(ListParentsRequest listparentsrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            listparentsrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(listparentsrequest);
            le.transact(13, parcel, parcel1, 0);
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

        public void a(LoadRealtimeRequest loadrealtimerequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            loadrealtimerequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(loadrealtimerequest);
            le.transact(27, parcel, parcel1, 0);
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

        public void a(OpenContentsRequest opencontentsrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            opencontentsrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(opencontentsrequest);
            le.transact(7, parcel, parcel1, 0);
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

        public void a(QueryRequest queryrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            queryrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            le.transact(2, parcel, parcel1, 0);
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

        public void a(RemoveEventListenerRequest removeeventlistenerrequest, ag ag1, String s, af af1)
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
            if (ag1 == null)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            removeeventlistenerrequest = ag1.asBinder();
_L4:
            parcel.writeStrongBinder(removeeventlistenerrequest);
            parcel.writeString(s);
            removeeventlistenerrequest = obj;
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            removeeventlistenerrequest = af1.asBinder();
            parcel.writeStrongBinder(removeeventlistenerrequest);
            le.transact(15, parcel, parcel1, 0);
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

        public void a(SetDrivePreferencesRequest setdrivepreferencesrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setdrivepreferencesrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(setdrivepreferencesrequest);
            le.transact(33, parcel, parcel1, 0);
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

        public void a(SetFileUploadPreferencesRequest setfileuploadpreferencesrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setfileuploadpreferencesrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(setfileuploadpreferencesrequest);
            le.transact(36, parcel, parcel1, 0);
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

        public void a(SetResourceParentsRequest setresourceparentsrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            setresourceparentsrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(setresourceparentsrequest);
            le.transact(28, parcel, parcel1, 0);
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

        public void a(TrashResourceRequest trashresourcerequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            trashresourcerequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(trashresourcerequest);
            le.transact(17, parcel, parcel1, 0);
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

        public void a(UpdateMetadataRequest updatemetadatarequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            updatemetadatarequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(updatemetadatarequest);
            le.transact(3, parcel, parcel1, 0);
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

        public void a(af af1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            le.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        public IBinder asBinder()
        {
            return le;
        }

        public void b(QueryRequest queryrequest, af af1)
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
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            queryrequest = af1.asBinder();
_L4:
            parcel.writeStrongBinder(queryrequest);
            le.transact(19, parcel, parcel1, 0);
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

        public void b(af af1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            le.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        public void c(af af1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            le.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        public void d(af af1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            le.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        public void e(af af1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            le.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        public void f(af af1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            le.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        public void g(af af1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            le.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        public void h(af af1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveService");
            if (af1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            af1 = af1.asBinder();
_L1:
            parcel.writeStrongBinder(af1);
            le.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            af1 = null;
              goto _L1
            af1;
            parcel1.recycle();
            parcel.recycle();
            throw af1;
        }

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract IntentSender a(CreateFileIntentSenderRequest createfileintentsenderrequest)
        throws RemoteException;

    public abstract IntentSender a(OpenFileIntentSenderRequest openfileintentsenderrequest)
        throws RemoteException;

    public abstract void a(RealtimeDocumentSyncRequest realtimedocumentsyncrequest, af af)
        throws RemoteException;

    public abstract void a(AddEventListenerRequest addeventlistenerrequest, ag ag, String s, af af)
        throws RemoteException;

    public abstract void a(AuthorizeAccessRequest authorizeaccessrequest, af af)
        throws RemoteException;

    public abstract void a(CancelPendingActionsRequest cancelpendingactionsrequest, af af)
        throws RemoteException;

    public abstract void a(CheckResourceIdsExistRequest checkresourceidsexistrequest, af af)
        throws RemoteException;

    public abstract void a(CloseContentsAndUpdateMetadataRequest closecontentsandupdatemetadatarequest, af af)
        throws RemoteException;

    public abstract void a(CloseContentsRequest closecontentsrequest, af af)
        throws RemoteException;

    public abstract void a(CreateContentsRequest createcontentsrequest, af af)
        throws RemoteException;

    public abstract void a(CreateFileRequest createfilerequest, af af)
        throws RemoteException;

    public abstract void a(CreateFolderRequest createfolderrequest, af af)
        throws RemoteException;

    public abstract void a(DeleteResourceRequest deleteresourcerequest, af af)
        throws RemoteException;

    public abstract void a(DisconnectRequest disconnectrequest)
        throws RemoteException;

    public abstract void a(GetDriveIdFromUniqueIdentifierRequest getdriveidfromuniqueidentifierrequest, af af)
        throws RemoteException;

    public abstract void a(GetMetadataRequest getmetadatarequest, af af)
        throws RemoteException;

    public abstract void a(ListParentsRequest listparentsrequest, af af)
        throws RemoteException;

    public abstract void a(LoadRealtimeRequest loadrealtimerequest, af af)
        throws RemoteException;

    public abstract void a(OpenContentsRequest opencontentsrequest, af af)
        throws RemoteException;

    public abstract void a(QueryRequest queryrequest, af af)
        throws RemoteException;

    public abstract void a(RemoveEventListenerRequest removeeventlistenerrequest, ag ag, String s, af af)
        throws RemoteException;

    public abstract void a(SetDrivePreferencesRequest setdrivepreferencesrequest, af af)
        throws RemoteException;

    public abstract void a(SetFileUploadPreferencesRequest setfileuploadpreferencesrequest, af af)
        throws RemoteException;

    public abstract void a(SetResourceParentsRequest setresourceparentsrequest, af af)
        throws RemoteException;

    public abstract void a(TrashResourceRequest trashresourcerequest, af af)
        throws RemoteException;

    public abstract void a(UpdateMetadataRequest updatemetadatarequest, af af)
        throws RemoteException;

    public abstract void a(af af)
        throws RemoteException;

    public abstract void b(QueryRequest queryrequest, af af)
        throws RemoteException;

    public abstract void b(af af)
        throws RemoteException;

    public abstract void c(af af)
        throws RemoteException;

    public abstract void d(af af)
        throws RemoteException;

    public abstract void e(af af)
        throws RemoteException;

    public abstract void f(af af)
        throws RemoteException;

    public abstract void g(af af)
        throws RemoteException;

    public abstract void h(af af)
        throws RemoteException;
}
