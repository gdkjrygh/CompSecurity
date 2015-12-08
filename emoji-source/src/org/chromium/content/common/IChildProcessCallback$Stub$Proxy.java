// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;

// Referenced classes of package org.chromium.content.common:
//            IChildProcessCallback, SurfaceWrapper

private static class mRemote
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
        SurfaceWrapper surfacewrapper = (SurfaceWrapper)SurfaceWrapper.CREATOR.el(parcel1);
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
        SurfaceWrapper surfacewrapper = (SurfaceWrapper)SurfaceWrapper.CREATOR.el(parcel1);
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
