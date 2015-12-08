// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            IRealtimeService, ISuccessCallback, IEventCallback, BeginCompoundOperationRequest, 
//            IBooleanCallback, ParcelableIndexReference, IStringCallback, IDataHolderCallback, 
//            EndCompoundOperationRequest, IIntCallback, ICollaboratorsCallback, IIndexReferenceCallback, 
//            IDataHolderEventCallback, ICollaboratorEventCallback, IDocumentSaveStateEventCallback, IErrorCallback

private static final class mRemote
    implements IRealtimeService
{

    private IBinder mRemote;

    public final void addUndoCheckpoint(boolean flag, ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        int i;
        i = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (flag)
        {
            i = 1;
        }
        parcel.writeInt(i);
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        isuccesscallback = isuccesscallback.asBinder();
_L1:
        parcel.writeStrongBinder(isuccesscallback);
        mRemote.transact(47, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        isuccesscallback = null;
          goto _L1
        isuccesscallback;
        parcel1.recycle();
        parcel.recycle();
        throw isuccesscallback;
    }

    public final void applyChanges(int i, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeInt(i);
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ieventcallback = ieventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(ieventcallback);
        mRemote.transact(30, parcel, parcel1, 0);
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

    public final IBinder asBinder()
    {
        return mRemote;
    }

    public final void beginCompoundOperation(BeginCompoundOperationRequest begincompoundoperationrequest, ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (begincompoundoperationrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        begincompoundoperationrequest.writeToParcel(parcel, 0);
_L3:
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        begincompoundoperationrequest = isuccesscallback.asBinder();
_L4:
        parcel.writeStrongBinder(begincompoundoperationrequest);
        mRemote.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        begincompoundoperationrequest;
        parcel1.recycle();
        parcel.recycle();
        throw begincompoundoperationrequest;
        begincompoundoperationrequest = null;
          goto _L4
    }

    public final void canRedo(IBooleanCallback ibooleancallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (ibooleancallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ibooleancallback = ibooleancallback.asBinder();
_L1:
        parcel.writeStrongBinder(ibooleancallback);
        mRemote.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibooleancallback = null;
          goto _L1
        ibooleancallback;
        parcel1.recycle();
        parcel.recycle();
        throw ibooleancallback;
    }

    public final void canUndo(IBooleanCallback ibooleancallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (ibooleancallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ibooleancallback = ibooleancallback.asBinder();
_L1:
        parcel.writeStrongBinder(ibooleancallback);
        mRemote.transact(24, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibooleancallback = null;
          goto _L1
        ibooleancallback;
        parcel1.recycle();
        parcel.recycle();
        throw ibooleancallback;
    }

    public final void close(ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        isuccesscallback = isuccesscallback.asBinder();
_L1:
        parcel.writeStrongBinder(isuccesscallback);
        mRemote.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        isuccesscallback = null;
          goto _L1
        isuccesscallback;
        parcel1.recycle();
        parcel.recycle();
        throw isuccesscallback;
    }

    public final void closeAndDeleteLocalContent(ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        isuccesscallback = isuccesscallback.asBinder();
_L1:
        parcel.writeStrongBinder(isuccesscallback);
        mRemote.transact(49, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        isuccesscallback = null;
          goto _L1
        isuccesscallback;
        parcel1.recycle();
        parcel.recycle();
        throw isuccesscallback;
    }

    public final void connect(DriveId driveid, ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (driveid == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        driveid.writeToParcel(parcel, 0);
_L3:
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        driveid = isuccesscallback.asBinder();
_L4:
        parcel.writeStrongBinder(driveid);
        mRemote.transact(48, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        driveid;
        parcel1.recycle();
        parcel.recycle();
        throw driveid;
        driveid = null;
          goto _L4
    }

    public final void createIndexReference(ParcelableIndexReference parcelableindexreference, IStringCallback istringcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (parcelableindexreference == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        parcelableindexreference.writeToParcel(parcel, 0);
_L3:
        if (istringcallback == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        parcelableindexreference = istringcallback.asBinder();
_L4:
        parcel.writeStrongBinder(parcelableindexreference);
        mRemote.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        parcelableindexreference;
        parcel1.recycle();
        parcel.recycle();
        throw parcelableindexreference;
        parcelableindexreference = null;
          goto _L4
    }

    public final void createObject(String s, IStringCallback istringcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (istringcallback == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = istringcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void createRoot(ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        isuccesscallback = isuccesscallback.asBinder();
_L1:
        parcel.writeStrongBinder(isuccesscallback);
        mRemote.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        isuccesscallback = null;
          goto _L1
        isuccesscallback;
        parcel1.recycle();
        parcel.recycle();
        throw isuccesscallback;
    }

    public final void customObjectGet(String s, String s1, IDataHolderCallback idataholdercallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeString(s1);
        if (idataholdercallback == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = idataholdercallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(42, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void customObjectSet(String s, String s1, DataHolder dataholder, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeString(s1);
        if (dataholder == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L3:
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s = ieventcallback.asBinder();
_L4:
        parcel.writeStrongBinder(s);
        mRemote.transact(43, parcel, parcel1, 0);
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
        s = null;
          goto _L4
    }

    public final void endCompoundOperation(EndCompoundOperationRequest endcompoundoperationrequest, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (endcompoundoperationrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        endcompoundoperationrequest.writeToParcel(parcel, 0);
_L3:
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        endcompoundoperationrequest = ieventcallback.asBinder();
_L4:
        parcel.writeStrongBinder(endcompoundoperationrequest);
        mRemote.transact(41, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        endcompoundoperationrequest;
        parcel1.recycle();
        parcel.recycle();
        throw endcompoundoperationrequest;
        endcompoundoperationrequest = null;
          goto _L4
    }

    public final void getBytesUsed(IIntCallback iintcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (iintcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        iintcallback = iintcallback.asBinder();
_L1:
        parcel.writeStrongBinder(iintcallback);
        mRemote.transact(40, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iintcallback = null;
          goto _L1
        iintcallback;
        parcel1.recycle();
        parcel.recycle();
        throw iintcallback;
    }

    public final void getCollaborators(ICollaboratorsCallback icollaboratorscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (icollaboratorscallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        icollaboratorscallback = icollaboratorscallback.asBinder();
_L1:
        parcel.writeStrongBinder(icollaboratorscallback);
        mRemote.transact(31, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        icollaboratorscallback = null;
          goto _L1
        icollaboratorscallback;
        parcel1.recycle();
        parcel.recycle();
        throw icollaboratorscallback;
    }

    public final void indexReferenceGet(String s, IIndexReferenceCallback iindexreferencecallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (iindexreferencecallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = iindexreferencecallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(27, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void indexReferenceSet(String s, int i, ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeInt(i);
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = isuccesscallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(28, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void isInGoogleDrive(IBooleanCallback ibooleancallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (ibooleancallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ibooleancallback = ibooleancallback.asBinder();
_L1:
        parcel.writeStrongBinder(ibooleancallback);
        mRemote.transact(45, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibooleancallback = null;
          goto _L1
        ibooleancallback;
        parcel1.recycle();
        parcel.recycle();
        throw ibooleancallback;
    }

    public final void isInitialized(IBooleanCallback ibooleancallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (ibooleancallback == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ibooleancallback = ibooleancallback.asBinder();
_L1:
        parcel.writeStrongBinder(ibooleancallback);
        mRemote.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibooleancallback = null;
          goto _L1
        ibooleancallback;
        parcel1.recycle();
        parcel.recycle();
        throw ibooleancallback;
    }

    public final void isReadonly(IBooleanCallback ibooleancallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (ibooleancallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ibooleancallback = ibooleancallback.asBinder();
_L1:
        parcel.writeStrongBinder(ibooleancallback);
        mRemote.transact(33, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibooleancallback = null;
          goto _L1
        ibooleancallback;
        parcel1.recycle();
        parcel.recycle();
        throw ibooleancallback;
    }

    public final void legacyEndCompoundOperation(EndCompoundOperationRequest endcompoundoperationrequest, ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (endcompoundoperationrequest == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        endcompoundoperationrequest.writeToParcel(parcel, 0);
_L3:
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        endcompoundoperationrequest = isuccesscallback.asBinder();
_L4:
        parcel.writeStrongBinder(endcompoundoperationrequest);
        mRemote.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        parcel.writeInt(0);
          goto _L3
        endcompoundoperationrequest;
        parcel1.recycle();
        parcel.recycle();
        throw endcompoundoperationrequest;
        endcompoundoperationrequest = null;
          goto _L4
    }

    public final void legacyNoOp()
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        mRemote.transact(44, parcel, parcel1, 0);
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

    public final void listGetSize(String s, IIntCallback iintcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (iintcallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = iintcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void listGetValues(String s, IDataHolderCallback idataholdercallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (idataholdercallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = idataholdercallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void listInsertRange(String s, int i, DataHolder dataholder, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeInt(i);
        if (dataholder == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L3:
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s = ieventcallback.asBinder();
_L4:
        parcel.writeStrongBinder(s);
        mRemote.transact(15, parcel, parcel1, 0);
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
        s = null;
          goto _L4
    }

    public final void listMove(String s, int i, String s1, int j, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeString(s1);
        parcel.writeInt(j);
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s = ieventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(37, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void listRemoveRange(String s, int i, int j, IDataHolderEventCallback idataholdereventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        if (idataholdereventcallback == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s = idataholdereventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void listReplaceRange(String s, int i, DataHolder dataholder, IDataHolderEventCallback idataholdereventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeInt(i);
        if (dataholder == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L3:
        if (idataholdereventcallback == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        s = idataholdereventcallback.asBinder();
_L4:
        parcel.writeStrongBinder(s);
        mRemote.transact(16, parcel, parcel1, 0);
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
        s = null;
          goto _L4
    }

    public final void mapClear(String s, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = ieventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void mapGet(String s, String s1, IDataHolderCallback idataholdercallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeString(s1);
        if (idataholdercallback == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        s = idataholdercallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void mapGetAll(String s, IDataHolderCallback idataholdercallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (idataholdercallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = idataholdercallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void mapGetSize(String s, IIntCallback iintcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (iintcallback == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        s = iintcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void mapPutAll(String s, DataHolder dataholder, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (dataholder == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        dataholder.writeToParcel(parcel, 0);
_L3:
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        s = ieventcallback.asBinder();
_L4:
        parcel.writeStrongBinder(s);
        mRemote.transact(6, parcel, parcel1, 0);
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
        s = null;
          goto _L4
    }

    public final void mapRemove(String s, String s1, IDataHolderEventCallback idataholdereventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeString(s1);
        if (idataholdereventcallback == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = idataholdereventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(21, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void objectChangedListenerAdded(String s, ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = isuccesscallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(38, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void objectChangedListenerRemoved(String s, ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = isuccesscallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(39, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void redo(IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ieventcallback = ieventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(ieventcallback);
        mRemote.transact(23, parcel, parcel1, 0);
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

    public final void setChangeReadyCallback(IIntCallback iintcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (iintcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        iintcallback = iintcallback.asBinder();
_L1:
        parcel.writeStrongBinder(iintcallback);
        mRemote.transact(29, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        iintcallback = null;
          goto _L1
        iintcallback;
        parcel1.recycle();
        parcel.recycle();
        throw iintcallback;
    }

    public final void setCollaboratorListener(ICollaboratorEventCallback icollaboratoreventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (icollaboratoreventcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        icollaboratoreventcallback = icollaboratoreventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(icollaboratoreventcallback);
        mRemote.transact(32, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        icollaboratoreventcallback = null;
          goto _L1
        icollaboratoreventcallback;
        parcel1.recycle();
        parcel.recycle();
        throw icollaboratoreventcallback;
    }

    public final void setDocumentSaveStateListener(IDocumentSaveStateEventCallback idocumentsavestateeventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (idocumentsavestateeventcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        idocumentsavestateeventcallback = idocumentsavestateeventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(idocumentsavestateeventcallback);
        mRemote.transact(36, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        idocumentsavestateeventcallback = null;
          goto _L1
        idocumentsavestateeventcallback;
        parcel1.recycle();
        parcel.recycle();
        throw idocumentsavestateeventcallback;
    }

    public final void setErrorCallback(IErrorCallback ierrorcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (ierrorcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ierrorcallback = ierrorcallback.asBinder();
_L1:
        parcel.writeStrongBinder(ierrorcallback);
        mRemote.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ierrorcallback = null;
          goto _L1
        ierrorcallback;
        parcel1.recycle();
        parcel.recycle();
        throw ierrorcallback;
    }

    public final void setUndoMode(int i, ISuccessCallback isuccesscallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeInt(i);
        if (isuccesscallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        isuccesscallback = isuccesscallback.asBinder();
_L1:
        parcel.writeStrongBinder(isuccesscallback);
        mRemote.transact(50, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        isuccesscallback = null;
          goto _L1
        isuccesscallback;
        parcel1.recycle();
        parcel.recycle();
        throw isuccesscallback;
    }

    public final void stringGetFullContents(String s, IStringCallback istringcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (istringcallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = istringcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void stringGetLength(String s, IIntCallback iintcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        if (iintcallback == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = iintcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void stringInsertString(String s, int i, String s1, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeString(s1);
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s = ieventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void stringRemoveRange(String s, int i, int j, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeInt(i);
        parcel.writeInt(j);
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        s = ieventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void stringSetText(String s, String s1, IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeString(s1);
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = ieventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void toJson(String s, int i, IStringCallback istringcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        parcel.writeString(s);
        parcel.writeInt(i);
        if (istringcallback == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        s = istringcallback.asBinder();
_L1:
        parcel.writeStrongBinder(s);
        mRemote.transact(46, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        s = null;
          goto _L1
        s;
        parcel1.recycle();
        parcel.recycle();
        throw s;
    }

    public final void undo(IEventCallback ieventcallback)
        throws RemoteException
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.drive.realtime.internal.IRealtimeService");
        if (ieventcallback == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ieventcallback = ieventcallback.asBinder();
_L1:
        parcel.writeStrongBinder(ieventcallback);
        mRemote.transact(22, parcel, parcel1, 0);
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

    public ack(IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
