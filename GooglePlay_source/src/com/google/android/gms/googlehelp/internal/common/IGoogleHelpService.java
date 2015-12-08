// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.googlehelp.GoogleHelp;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            IGoogleHelpCallbacks

public interface IGoogleHelpService
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGoogleHelpService
    {

        public static IGoogleHelpService asInterface(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (iinterface != null && (iinterface instanceof IGoogleHelpService))
            {
                return (IGoogleHelpService)iinterface;
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
                parcel1.writeString("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                GoogleHelp googlehelp;
                if (parcel.readInt() != 0)
                {
                    googlehelp = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(parcel);
                } else
                {
                    googlehelp = null;
                }
                processGoogleHelp(googlehelp, IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                GoogleHelp googlehelp1;
                Bitmap bitmap1;
                if (parcel.readInt() != 0)
                {
                    googlehelp1 = (GoogleHelp)GoogleHelp.CREATOR.createFromParcel(parcel);
                } else
                {
                    googlehelp1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    bitmap1 = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
                } else
                {
                    bitmap1 = null;
                }
                processGoogleHelpAndPip(googlehelp1, bitmap1, IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                Bitmap bitmap;
                if (parcel.readInt() != 0)
                {
                    bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
                } else
                {
                    bitmap = null;
                }
                processTogglingPip(bitmap, IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                showPipInCallingApp(IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                hidePipInCallingApp(IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
                disablePipInCallingApp(IGoogleHelpCallbacks.Stub.asInterface(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static final class Stub.Proxy
        implements IGoogleHelpService
    {

        private IBinder mRemote;

        public final IBinder asBinder()
        {
            return mRemote;
        }

        public final void disablePipInCallingApp(IGoogleHelpCallbacks igooglehelpcallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (igooglehelpcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            igooglehelpcallbacks = igooglehelpcallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igooglehelpcallbacks);
            mRemote.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igooglehelpcallbacks = null;
              goto _L1
            igooglehelpcallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igooglehelpcallbacks;
        }

        public final void hidePipInCallingApp(IGoogleHelpCallbacks igooglehelpcallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (igooglehelpcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            igooglehelpcallbacks = igooglehelpcallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igooglehelpcallbacks);
            mRemote.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igooglehelpcallbacks = null;
              goto _L1
            igooglehelpcallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igooglehelpcallbacks;
        }

        public final void processGoogleHelp(GoogleHelp googlehelp, IGoogleHelpCallbacks igooglehelpcallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (googlehelp == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            googlehelp.writeToParcel(parcel, 0);
_L3:
            if (igooglehelpcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            googlehelp = igooglehelpcallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(googlehelp);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            googlehelp;
            parcel1.recycle();
            parcel.recycle();
            throw googlehelp;
            googlehelp = null;
              goto _L4
        }

        public final void processGoogleHelpAndPip(GoogleHelp googlehelp, Bitmap bitmap, IGoogleHelpCallbacks igooglehelpcallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (googlehelp == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            googlehelp.writeToParcel(parcel, 0);
_L5:
            if (bitmap == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bitmap.writeToParcel(parcel, 0);
_L6:
            if (igooglehelpcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_131;
            }
            googlehelp = igooglehelpcallbacks.asBinder();
_L7:
            parcel.writeStrongBinder(googlehelp);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L5
            googlehelp;
            parcel1.recycle();
            parcel.recycle();
            throw googlehelp;
_L4:
            parcel.writeInt(0);
              goto _L6
            googlehelp = null;
              goto _L7
        }

        public final void processTogglingPip(Bitmap bitmap, IGoogleHelpCallbacks igooglehelpcallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (bitmap == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            bitmap.writeToParcel(parcel, 0);
_L3:
            if (igooglehelpcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            bitmap = igooglehelpcallbacks.asBinder();
_L4:
            parcel.writeStrongBinder(bitmap);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            bitmap;
            parcel1.recycle();
            parcel.recycle();
            throw bitmap;
            bitmap = null;
              goto _L4
        }

        public final void showPipInCallingApp(IGoogleHelpCallbacks igooglehelpcallbacks)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
            if (igooglehelpcallbacks == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            igooglehelpcallbacks = igooglehelpcallbacks.asBinder();
_L1:
            parcel.writeStrongBinder(igooglehelpcallbacks);
            mRemote.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            igooglehelpcallbacks = null;
              goto _L1
            igooglehelpcallbacks;
            parcel1.recycle();
            parcel.recycle();
            throw igooglehelpcallbacks;
        }

        Stub.Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    public abstract void disablePipInCallingApp(IGoogleHelpCallbacks igooglehelpcallbacks)
        throws RemoteException;

    public abstract void hidePipInCallingApp(IGoogleHelpCallbacks igooglehelpcallbacks)
        throws RemoteException;

    public abstract void processGoogleHelp(GoogleHelp googlehelp, IGoogleHelpCallbacks igooglehelpcallbacks)
        throws RemoteException;

    public abstract void processGoogleHelpAndPip(GoogleHelp googlehelp, Bitmap bitmap, IGoogleHelpCallbacks igooglehelpcallbacks)
        throws RemoteException;

    public abstract void processTogglingPip(Bitmap bitmap, IGoogleHelpCallbacks igooglehelpcallbacks)
        throws RemoteException;

    public abstract void showPipInCallingApp(IGoogleHelpCallbacks igooglehelpcallbacks)
        throws RemoteException;
}
