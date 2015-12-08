// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.DataHolderCreator;

public interface IPeopleCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IPeopleCallbacks
    {

        public static IPeopleCallbacks asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
            if (iinterface != null && (iinterface instanceof IPeopleCallbacks))
            {
                return (IPeopleCallbacks)iinterface;
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
                parcel1.writeString("com.google.android.gms.people.internal.IPeopleCallbacks");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onBundleLoaded(i, parcel1, parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    DataHolderCreator dataholdercreator = DataHolder.CREATOR;
                    parcel = DataHolderCreator.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onDataHolderLoaded(i, parcel1, parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onParcelFileDescriptorLoaded_old(i, parcel1, parcel);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                i = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel1 = null;
                }
                onDataHoldersLoaded(i, parcel1, (DataHolder[])parcel.createTypedArray(DataHolder.CREATOR));
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.people.internal.IPeopleCallbacks");
                i = parcel.readInt();
                break;
            }
            ParcelFileDescriptor parcelfiledescriptor;
            if (parcel.readInt() != 0)
            {
                parcel1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel1 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            } else
            {
                parcelfiledescriptor = null;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            onParcelFileDescriptorLoaded(i, parcel1, parcelfiledescriptor, parcel);
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.people.internal.IPeopleCallbacks");
        }
    }

    private static final class Stub.Proxy
        implements IPeopleCallbacks
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void onBundleLoaded(int i, Bundle bundle, Bundle bundle1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            parcel.writeInt(i);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if (bundle1 == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            parcel.writeInt(1);
            bundle1.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        public final void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            parcel.writeInt(i);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(2, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        public final void onDataHoldersLoaded(int i, Bundle bundle, DataHolder adataholder[])
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            parcel.writeInt(i);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_63;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            parcel.writeTypedArray(adataholder, 0);
            mRemote.transact(4, parcel, null, 1);
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel.recycle();
            throw bundle;
        }

        public final void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            parcel.writeInt(i);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L5:
            if (parcelfiledescriptor == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L6:
            if (bundle1 == null)
            {
                break MISSING_BLOCK_LABEL_118;
            }
            parcel.writeInt(1);
            bundle1.writeToParcel(parcel, 0);
_L7:
            mRemote.transact(5, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            bundle;
            parcel.recycle();
            throw bundle;
_L4:
            parcel.writeInt(0);
              goto _L6
            parcel.writeInt(0);
              goto _L7
        }

        public final void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor)
            throws RemoteException
        {
            Parcel parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.people.internal.IPeopleCallbacks");
            parcel.writeInt(i);
            if (bundle == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L3:
            if (parcelfiledescriptor == null)
            {
                break MISSING_BLOCK_LABEL_90;
            }
            parcel.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel, 0);
_L4:
            mRemote.transact(3, parcel, null, 1);
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bundle;
            parcel.recycle();
            throw bundle;
            parcel.writeInt(0);
              goto _L4
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void onBundleLoaded(int i, Bundle bundle, Bundle bundle1)
        throws RemoteException;

    public abstract void onDataHolderLoaded(int i, Bundle bundle, DataHolder dataholder)
        throws RemoteException;

    public abstract void onDataHoldersLoaded(int i, Bundle bundle, DataHolder adataholder[])
        throws RemoteException;

    public abstract void onParcelFileDescriptorLoaded(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor, Bundle bundle1)
        throws RemoteException;

    public abstract void onParcelFileDescriptorLoaded_old(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor)
        throws RemoteException;
}
