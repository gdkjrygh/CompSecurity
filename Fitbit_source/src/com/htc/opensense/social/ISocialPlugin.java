// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.opensense.social;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.htc.opensense.social:
//            ISocialPluginResponse

public interface ISocialPlugin
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements ISocialPlugin
    {

        private static final String DESCRIPTOR = "com.htc.opensense.social.ISocialPlugin";
        static final int TRANSACTION_getDataSources = 4;
        static final int TRANSACTION_getSyncTypes = 5;
        static final int TRANSACTION_publishActivityStream = 2;
        static final int TRANSACTION_syncActivityStreams = 1;
        static final int TRANSACTION_syncContacts = 3;
        static final int TRANSACTION_syncSyncTypes = 6;

        public static ISocialPlugin asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.htc.opensense.social.ISocialPlugin");
            if (iinterface != null && (iinterface instanceof ISocialPlugin))
            {
                return (ISocialPlugin)iinterface;
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
            ISocialPluginResponse isocialpluginresponse1 = null;
            Account aaccount3[] = null;
            Object obj = null;
            Object obj1 = null;
            ISocialPluginResponse isocialpluginresponse = null;
            Account aaccount2[];
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.htc.opensense.social.ISocialPlugin");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.htc.opensense.social.ISocialPlugin");
                isocialpluginresponse1 = ISocialPluginResponse.Stub.asInterface(parcel.readStrongBinder());
                aaccount3 = (Account[])parcel.createTypedArray(Account.CREATOR);
                parcel1 = isocialpluginresponse;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                syncActivityStreams(isocialpluginresponse1, aaccount3, parcel1);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.htc.opensense.social.ISocialPlugin");
                isocialpluginresponse = ISocialPluginResponse.Stub.asInterface(parcel.readStrongBinder());
                aaccount3 = (Account[])parcel.createTypedArray(Account.CREATOR);
                parcel1 = isocialpluginresponse1;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                publishActivityStream(isocialpluginresponse, aaccount3, parcel1);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.htc.opensense.social.ISocialPlugin");
                isocialpluginresponse = ISocialPluginResponse.Stub.asInterface(parcel.readStrongBinder());
                Account aaccount[] = (Account[])parcel.createTypedArray(Account.CREATOR);
                parcel1 = aaccount3;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                syncContacts(isocialpluginresponse, aaccount, parcel1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.htc.opensense.social.ISocialPlugin");
                getDataSources(ISocialPluginResponse.Stub.asInterface(parcel.readStrongBinder()), parcel.createStringArray());
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.htc.opensense.social.ISocialPlugin");
                isocialpluginresponse = ISocialPluginResponse.Stub.asInterface(parcel.readStrongBinder());
                Account aaccount1[] = (Account[])parcel.createTypedArray(Account.CREATOR);
                parcel1 = obj;
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                getSyncTypes(isocialpluginresponse, aaccount1, parcel1);
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.htc.opensense.social.ISocialPlugin");
                isocialpluginresponse = ISocialPluginResponse.Stub.asInterface(parcel.readStrongBinder());
                aaccount2 = (Account[])parcel.createTypedArray(Account.CREATOR);
                parcel1 = obj1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            syncSyncTypes(isocialpluginresponse, aaccount2, parcel1);
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.htc.opensense.social.ISocialPlugin");
        }
    }

    private static class Stub.Proxy
        implements ISocialPlugin
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public void getDataSources(ISocialPluginResponse isocialpluginresponse, String as[])
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.htc.opensense.social.ISocialPlugin");
            if (isocialpluginresponse == null)
            {
                break MISSING_BLOCK_LABEL_25;
            }
            ibinder = isocialpluginresponse.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeStringArray(as);
            mRemote.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            isocialpluginresponse;
            parcel.recycle();
            throw isocialpluginresponse;
        }

        public String getInterfaceDescriptor()
        {
            return "com.htc.opensense.social.ISocialPlugin";
        }

        public void getSyncTypes(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.htc.opensense.social.ISocialPlugin");
            if (isocialpluginresponse == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ibinder = isocialpluginresponse.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeTypedArray(aaccount, 0);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            isocialpluginresponse;
            parcel.recycle();
            throw isocialpluginresponse;
        }

        public void publishActivityStream(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.htc.opensense.social.ISocialPlugin");
            if (isocialpluginresponse == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ibinder = isocialpluginresponse.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeTypedArray(aaccount, 0);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            isocialpluginresponse;
            parcel.recycle();
            throw isocialpluginresponse;
        }

        public void syncActivityStreams(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.htc.opensense.social.ISocialPlugin");
            if (isocialpluginresponse == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ibinder = isocialpluginresponse.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeTypedArray(aaccount, 0);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            isocialpluginresponse;
            parcel.recycle();
            throw isocialpluginresponse;
        }

        public void syncContacts(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.htc.opensense.social.ISocialPlugin");
            if (isocialpluginresponse == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ibinder = isocialpluginresponse.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeTypedArray(aaccount, 0);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            isocialpluginresponse;
            parcel.recycle();
            throw isocialpluginresponse;
        }

        public void syncSyncTypes(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.htc.opensense.social.ISocialPlugin");
            if (isocialpluginresponse == null)
            {
                break MISSING_BLOCK_LABEL_27;
            }
            ibinder = isocialpluginresponse.asBinder();
            parcel.writeStrongBinder(ibinder);
            parcel.writeTypedArray(aaccount, 0);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_80;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            mRemote.transact(6, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            isocialpluginresponse;
            parcel.recycle();
            throw isocialpluginresponse;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void getDataSources(ISocialPluginResponse isocialpluginresponse, String as[])
        throws RemoteException;

    public abstract void getSyncTypes(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
        throws RemoteException;

    public abstract void publishActivityStream(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
        throws RemoteException;

    public abstract void syncActivityStreams(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
        throws RemoteException;

    public abstract void syncContacts(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
        throws RemoteException;

    public abstract void syncSyncTypes(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
        throws RemoteException;
}
