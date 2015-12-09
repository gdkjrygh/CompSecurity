// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.realtime.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;
import com.google.android.gms.drive.DriveId;

// Referenced classes of package com.google.android.gms.drive.realtime.internal:
//            ISuccessCallback, IEventCallback, BeginCompoundOperationRequest, IBooleanCallback, 
//            ParcelableIndexReference, IStringCallback, IDataHolderCallback, EndCompoundOperationRequest, 
//            IIntCallback, ICollaboratorsCallback, IIndexReferenceCallback, IDataHolderEventCallback, 
//            ICollaboratorEventCallback, IDocumentSaveStateEventCallback, IErrorCallback

public interface IRealtimeService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IRealtimeService
    {

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                createObject(parcel.readString(), IStringCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                isInitialized(IBooleanCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                createRoot(ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                isReadonly(IBooleanCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                close(ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                getBytesUsed(IIntCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 45: // '-'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                isInGoogleDrive(IBooleanCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 46: // '.'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                toJson(parcel.readString(), parcel.readInt(), IStringCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                mapGet(parcel.readString(), parcel.readString(), IDataHolderCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                mapGetSize(parcel.readString(), IIntCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                String s = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR;
                    obj = DataHolderCreator.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                mapPutAll(s, ((DataHolder) (obj)), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                mapClear(parcel.readString(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                mapGetAll(parcel.readString(), IDataHolderCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                mapRemove(parcel.readString(), parcel.readString(), IDataHolderEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                stringGetLength(parcel.readString(), IIntCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                stringGetFullContents(parcel.readString(), IStringCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                stringInsertString(parcel.readString(), parcel.readInt(), parcel.readString(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                stringRemoveRange(parcel.readString(), parcel.readInt(), parcel.readInt(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                stringSetText(parcel.readString(), parcel.readString(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                listGetValues(parcel.readString(), IDataHolderCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                listGetSize(parcel.readString(), IIntCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                String s1 = parcel.readString();
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR;
                    obj = DataHolderCreator.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                listInsertRange(s1, i, ((DataHolder) (obj)), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                String s2 = parcel.readString();
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR;
                    obj = DataHolderCreator.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                listReplaceRange(s2, i, ((DataHolder) (obj)), IDataHolderEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                listRemoveRange(parcel.readString(), parcel.readInt(), parcel.readInt(), IDataHolderEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                listMove(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                if (parcel.readInt() != 0)
                {
                    obj = (BeginCompoundOperationRequest)BeginCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                beginCompoundOperation(((BeginCompoundOperationRequest) (obj)), ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                if (parcel.readInt() != 0)
                {
                    obj = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                endCompoundOperation(((EndCompoundOperationRequest) (obj)), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                undo(IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                redo(IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                canUndo(IBooleanCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                canRedo(IBooleanCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 47: // '/'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                boolean flag;
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                addUndoCheckpoint(flag, ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 50: // '2'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                setUndoMode(parcel.readInt(), ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                if (parcel.readInt() != 0)
                {
                    obj = (ParcelableIndexReference)ParcelableIndexReference.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                createIndexReference(((ParcelableIndexReference) (obj)), IStringCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                String s3 = parcel.readString();
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = ((Parcel) (obj));
                } else
                {
                    obj = parcel.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IIndexReferenceCallback");
                    if (obj != null && (obj instanceof IIndexReferenceCallback))
                    {
                        parcel = (IIndexReferenceCallback)obj;
                    } else
                    {
                        parcel = new IIndexReferenceCallback.Stub.Proxy(parcel);
                    }
                }
                indexReferenceGet(s3, parcel);
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                indexReferenceSet(parcel.readString(), parcel.readInt(), ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 29: // '\035'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                setChangeReadyCallback(IIntCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                applyChanges(parcel.readInt(), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = null;
                } else
                {
                    obj = parcel.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorsCallback");
                    if (obj != null && (obj instanceof ICollaboratorsCallback))
                    {
                        parcel = (ICollaboratorsCallback)obj;
                    } else
                    {
                        parcel = new ICollaboratorsCallback.Stub.Proxy(parcel);
                    }
                }
                getCollaborators(parcel);
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = null;
                } else
                {
                    obj = parcel.queryLocalInterface("com.google.android.gms.drive.realtime.internal.ICollaboratorEventCallback");
                    if (obj != null && (obj instanceof ICollaboratorEventCallback))
                    {
                        parcel = (ICollaboratorEventCallback)obj;
                    } else
                    {
                        parcel = new ICollaboratorEventCallback.Stub.Proxy(parcel);
                    }
                }
                setCollaboratorListener(parcel);
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = null;
                } else
                {
                    obj = parcel.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IErrorCallback");
                    if (obj != null && (obj instanceof IErrorCallback))
                    {
                        parcel = (IErrorCallback)obj;
                    } else
                    {
                        parcel = new IErrorCallback.Stub.Proxy(parcel);
                    }
                }
                setErrorCallback(parcel);
                parcel1.writeNoException();
                return true;

            case 36: // '$'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = null;
                } else
                {
                    obj = parcel.queryLocalInterface("com.google.android.gms.drive.realtime.internal.IDocumentSaveStateEventCallback");
                    if (obj != null && (obj instanceof IDocumentSaveStateEventCallback))
                    {
                        parcel = (IDocumentSaveStateEventCallback)obj;
                    } else
                    {
                        parcel = new IDocumentSaveStateEventCallback.Stub.Proxy(parcel);
                    }
                }
                setDocumentSaveStateListener(parcel);
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                objectChangedListenerAdded(parcel.readString(), ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 39: // '\''
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                objectChangedListenerRemoved(parcel.readString(), ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                customObjectGet(parcel.readString(), parcel.readString(), IDataHolderCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 43: // '+'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                String s4 = parcel.readString();
                String s5 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = DataHolder.CREATOR;
                    obj = DataHolderCreator.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                customObjectSet(s4, s5, ((DataHolder) (obj)), IEventCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 44: // ','
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                legacyNoOp();
                parcel1.writeNoException();
                return true;

            case 48: // '0'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                if (parcel.readInt() != 0)
                {
                    obj = (DriveId)DriveId.CREATOR.createFromParcel(parcel);
                } else
                {
                    obj = null;
                }
                connect(((DriveId) (obj)), ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 49: // '1'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                closeAndDeleteLocalContent(ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.drive.realtime.internal.IRealtimeService");
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (EndCompoundOperationRequest)EndCompoundOperationRequest.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            legacyEndCompoundOperation(((EndCompoundOperationRequest) (obj)), ISuccessCallback.Stub.asInterface(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }

    private static final class Stub.Proxy
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

        public Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void addUndoCheckpoint(boolean flag, ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void applyChanges(int i, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void beginCompoundOperation(BeginCompoundOperationRequest begincompoundoperationrequest, ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void canRedo(IBooleanCallback ibooleancallback)
        throws RemoteException;

    public abstract void canUndo(IBooleanCallback ibooleancallback)
        throws RemoteException;

    public abstract void close(ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void closeAndDeleteLocalContent(ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void connect(DriveId driveid, ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void createIndexReference(ParcelableIndexReference parcelableindexreference, IStringCallback istringcallback)
        throws RemoteException;

    public abstract void createObject(String s, IStringCallback istringcallback)
        throws RemoteException;

    public abstract void createRoot(ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void customObjectGet(String s, String s1, IDataHolderCallback idataholdercallback)
        throws RemoteException;

    public abstract void customObjectSet(String s, String s1, DataHolder dataholder, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void endCompoundOperation(EndCompoundOperationRequest endcompoundoperationrequest, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void getBytesUsed(IIntCallback iintcallback)
        throws RemoteException;

    public abstract void getCollaborators(ICollaboratorsCallback icollaboratorscallback)
        throws RemoteException;

    public abstract void indexReferenceGet(String s, IIndexReferenceCallback iindexreferencecallback)
        throws RemoteException;

    public abstract void indexReferenceSet(String s, int i, ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void isInGoogleDrive(IBooleanCallback ibooleancallback)
        throws RemoteException;

    public abstract void isInitialized(IBooleanCallback ibooleancallback)
        throws RemoteException;

    public abstract void isReadonly(IBooleanCallback ibooleancallback)
        throws RemoteException;

    public abstract void legacyEndCompoundOperation(EndCompoundOperationRequest endcompoundoperationrequest, ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void legacyNoOp()
        throws RemoteException;

    public abstract void listGetSize(String s, IIntCallback iintcallback)
        throws RemoteException;

    public abstract void listGetValues(String s, IDataHolderCallback idataholdercallback)
        throws RemoteException;

    public abstract void listInsertRange(String s, int i, DataHolder dataholder, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void listMove(String s, int i, String s1, int j, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void listRemoveRange(String s, int i, int j, IDataHolderEventCallback idataholdereventcallback)
        throws RemoteException;

    public abstract void listReplaceRange(String s, int i, DataHolder dataholder, IDataHolderEventCallback idataholdereventcallback)
        throws RemoteException;

    public abstract void mapClear(String s, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void mapGet(String s, String s1, IDataHolderCallback idataholdercallback)
        throws RemoteException;

    public abstract void mapGetAll(String s, IDataHolderCallback idataholdercallback)
        throws RemoteException;

    public abstract void mapGetSize(String s, IIntCallback iintcallback)
        throws RemoteException;

    public abstract void mapPutAll(String s, DataHolder dataholder, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void mapRemove(String s, String s1, IDataHolderEventCallback idataholdereventcallback)
        throws RemoteException;

    public abstract void objectChangedListenerAdded(String s, ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void objectChangedListenerRemoved(String s, ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void redo(IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void setChangeReadyCallback(IIntCallback iintcallback)
        throws RemoteException;

    public abstract void setCollaboratorListener(ICollaboratorEventCallback icollaboratoreventcallback)
        throws RemoteException;

    public abstract void setDocumentSaveStateListener(IDocumentSaveStateEventCallback idocumentsavestateeventcallback)
        throws RemoteException;

    public abstract void setErrorCallback(IErrorCallback ierrorcallback)
        throws RemoteException;

    public abstract void setUndoMode(int i, ISuccessCallback isuccesscallback)
        throws RemoteException;

    public abstract void stringGetFullContents(String s, IStringCallback istringcallback)
        throws RemoteException;

    public abstract void stringGetLength(String s, IIntCallback iintcallback)
        throws RemoteException;

    public abstract void stringInsertString(String s, int i, String s1, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void stringRemoveRange(String s, int i, int j, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void stringSetText(String s, String s1, IEventCallback ieventcallback)
        throws RemoteException;

    public abstract void toJson(String s, int i, IStringCallback istringcallback)
        throws RemoteException;

    public abstract void undo(IEventCallback ieventcallback)
        throws RemoteException;
}
