// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.social;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.htc.lib2.opensense.social:
//            ISocialPlugin, ISocialPluginResponse

private static class mRemote
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
        parcel.writeInterfaceToken("com.htc.lib2.opensense.social.ISocialPlugin");
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
        return "com.htc.lib2.opensense.social.ISocialPlugin";
    }

    public void getSyncTypes(ISocialPluginResponse isocialpluginresponse, Account aaccount[], Bundle bundle)
        throws RemoteException
    {
        IBinder ibinder;
        Parcel parcel;
        ibinder = null;
        parcel = Parcel.obtain();
        parcel.writeInterfaceToken("com.htc.lib2.opensense.social.ISocialPlugin");
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
        parcel.writeInterfaceToken("com.htc.lib2.opensense.social.ISocialPlugin");
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
        parcel.writeInterfaceToken("com.htc.lib2.opensense.social.ISocialPlugin");
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
        parcel.writeInterfaceToken("com.htc.lib2.opensense.social.ISocialPlugin");
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
        parcel.writeInterfaceToken("com.htc.lib2.opensense.social.ISocialPlugin");
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
