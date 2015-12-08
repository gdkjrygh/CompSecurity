// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;

// Referenced classes of package com.google.android.gms.maps.a:
//            ai

public static abstract class a.a extends Binder
    implements ai
{
    private static final class a
        implements ai
    {

        private IBinder a;

        public final void a(Bitmap bitmap)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (bitmap == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            bitmap.writeToParcel(parcel, 0);
_L1:
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bitmap;
            parcel1.recycle();
            parcel.recycle();
            throw bitmap;
        }

        public final void a(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
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
            parcel1.writeString("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            if (parcel.readInt() != 0)
            {
                parcel = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            a(com.google.android.gms.b.(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
