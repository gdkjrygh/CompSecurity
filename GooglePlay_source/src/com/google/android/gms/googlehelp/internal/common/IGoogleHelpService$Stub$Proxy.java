// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.googlehelp.internal.common;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.googlehelp.GoogleHelp;

// Referenced classes of package com.google.android.gms.googlehelp.internal.common:
//            IGoogleHelpService, IGoogleHelpCallbacks

private static final class mRemote
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

    (IBinder ibinder)
    {
        mRemote = ibinder;
    }
}
