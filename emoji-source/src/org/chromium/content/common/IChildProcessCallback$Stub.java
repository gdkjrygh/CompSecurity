// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;

// Referenced classes of package org.chromium.content.common:
//            IChildProcessCallback, SurfaceWrapper

public static abstract class attachInterface extends Binder
    implements IChildProcessCallback
{
    private static class Proxy
        implements IChildProcessCallback
    {

        private IBinder mRemote;

        public IBinder asBinder()
        {
            return mRemote;
        }

        public void establishSurfacePeer(int i, Surface surface, int j, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.content.common.IChildProcessCallback");
            parcel.writeInt(i);
            if (surface == null)
            {
                break MISSING_BLOCK_LABEL_85;
            }
            parcel.writeInt(1);
            surface.writeToParcel(parcel, 0);
_L1:
            parcel.writeInt(j);
            parcel.writeInt(k);
            mRemote.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            surface;
            parcel1.recycle();
            parcel.recycle();
            throw surface;
        }

        public String getInterfaceDescriptor()
        {
            return "org.chromium.content.common.IChildProcessCallback";
        }

        public SurfaceWrapper getSurfaceTextureSurface(int i, int j)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.content.common.IChildProcessCallback");
            parcel.writeInt(i);
            parcel.writeInt(j);
            mRemote.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            SurfaceWrapper surfacewrapper = (SurfaceWrapper)SurfaceWrapper.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return surfacewrapper;
_L2:
            surfacewrapper = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public SurfaceWrapper getViewSurface(int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("org.chromium.content.common.IChildProcessCallback");
            parcel.writeInt(i);
            mRemote.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            SurfaceWrapper surfacewrapper = (SurfaceWrapper)SurfaceWrapper.CREATOR.createFromParcel(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return surfacewrapper;
_L2:
            surfacewrapper = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        Proxy(IBinder ibinder)
        {
            mRemote = ibinder;
        }
    }


    private static final String DESCRIPTOR = "org.chromium.content.common.IChildProcessCallback";
    static final int TRANSACTION_establishSurfacePeer = 1;
    static final int TRANSACTION_getSurfaceTextureSurface = 3;
    static final int TRANSACTION_getViewSurface = 2;

    public static IChildProcessCallback asInterface(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("org.chromium.content.common.IChildProcessCallback");
        if (iinterface != null && (iinterface instanceof IChildProcessCallback))
        {
            return (IChildProcessCallback)iinterface;
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
            parcel1.writeString("org.chromium.content.common.IChildProcessCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("org.chromium.content.common.IChildProcessCallback");
            i = parcel.readInt();
            Surface surface;
            if (parcel.readInt() != 0)
            {
                surface = (Surface)Surface.CREATOR.omParcel(parcel);
            } else
            {
                surface = null;
            }
            establishSurfacePeer(i, surface, parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("org.chromium.content.common.IChildProcessCallback");
            parcel = getViewSurface(parcel.readInt());
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 3: // '\003'
            parcel.enforceInterface("org.chromium.content.common.IChildProcessCallback");
            parcel = getSurfaceTextureSurface(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            break;
        }
        if (parcel != null)
        {
            parcel1.writeInt(1);
            parcel.writeToParcel(parcel1, 1);
            return true;
        } else
        {
            parcel1.writeInt(0);
            return true;
        }
    }

    public Proxy.mRemote()
    {
        attachInterface(this, "org.chromium.content.common.IChildProcessCallback");
    }
}
