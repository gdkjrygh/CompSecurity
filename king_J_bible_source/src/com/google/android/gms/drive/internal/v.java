// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.StatusCreator;

// Referenced classes of package com.google.android.gms.drive.internal:
//            OnContentsResponse, OnDownloadProgressResponse, OnDriveIdResponse, OnListEntriesResponse, 
//            OnListParentsResponse, OnMetadataResponse, OnSyncMoreResponse

public interface v
    extends IInterface
{
    public static abstract class a extends Binder
        implements v
    {

        public static v H(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            if (iinterface != null && (iinterface instanceof v))
            {
                return (v)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
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
            Object obj = null;
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
                    obj = (OnDownloadProgressResponse)OnDownloadProgressResponse.CREATOR.createFromParcel(parcel);
                }
                a(((OnDownloadProgressResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (OnListEntriesResponse)OnListEntriesResponse.CREATOR.createFromParcel(parcel);
                }
                a(((OnListEntriesResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (OnDriveIdResponse)OnDriveIdResponse.CREATOR.createFromParcel(parcel);
                }
                a(((OnDriveIdResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (OnMetadataResponse)OnMetadataResponse.CREATOR.createFromParcel(parcel);
                }
                a(((OnMetadataResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (OnContentsResponse)OnContentsResponse.CREATOR.createFromParcel(parcel);
                }
                a(((OnContentsResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = Status.CREATOR.createFromParcel(parcel);
                }
                m(((Status) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                onSuccess();
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (OnListParentsResponse)OnListParentsResponse.CREATOR.createFromParcel(parcel);
                }
                a(((OnListParentsResponse) (obj)));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                obj = obj7;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (OnSyncMoreResponse)OnSyncMoreResponse.CREATOR.createFromParcel(parcel);
            }
            a(((OnSyncMoreResponse) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.drive.internal.IDriveServiceCallbacks");
        }
    }

    private static class a.a
        implements v
    {

        private IBinder kn;

        public void a(OnContentsResponse oncontentsresponse)
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
            kn.transact(5, parcel, parcel1, 0);
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

        public void a(OnDownloadProgressResponse ondownloadprogressresponse)
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
            kn.transact(1, parcel, parcel1, 0);
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

        public void a(OnDriveIdResponse ondriveidresponse)
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
            kn.transact(3, parcel, parcel1, 0);
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

        public void a(OnListEntriesResponse onlistentriesresponse)
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
            kn.transact(2, parcel, parcel1, 0);
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

        public void a(OnListParentsResponse onlistparentsresponse)
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
            kn.transact(8, parcel, parcel1, 0);
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

        public void a(OnMetadataResponse onmetadataresponse)
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
            kn.transact(4, parcel, parcel1, 0);
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

        public void a(OnSyncMoreResponse onsyncmoreresponse)
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
            kn.transact(9, parcel, parcel1, 0);
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

        public IBinder asBinder()
        {
            return kn;
        }

        public void m(Status status)
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
            kn.transact(6, parcel, parcel1, 0);
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

        public void onSuccess()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
            kn.transact(7, parcel, parcel1, 0);
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

        a.a(IBinder ibinder)
        {
            kn = ibinder;
        }
    }


    public abstract void a(OnContentsResponse oncontentsresponse)
        throws RemoteException;

    public abstract void a(OnDownloadProgressResponse ondownloadprogressresponse)
        throws RemoteException;

    public abstract void a(OnDriveIdResponse ondriveidresponse)
        throws RemoteException;

    public abstract void a(OnListEntriesResponse onlistentriesresponse)
        throws RemoteException;

    public abstract void a(OnListParentsResponse onlistparentsresponse)
        throws RemoteException;

    public abstract void a(OnMetadataResponse onmetadataresponse)
        throws RemoteException;

    public abstract void a(OnSyncMoreResponse onsyncmoreresponse)
        throws RemoteException;

    public abstract void m(Status status)
        throws RemoteException;

    public abstract void onSuccess()
        throws RemoteException;
}
