// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.b:
//            K, J

public static abstract class a.a extends Binder
    implements K
{
    private static final class a
        implements K
    {

        private IBinder a;

        public final void a(J j)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
            if (j == null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            ibinder = j.asBinder();
            parcel.writeStrongBinder(ibinder);
            a.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            j;
            parcel.recycle();
            throw j;
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


    public static K a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
        if (iinterface != null && (iinterface instanceof K))
        {
            return (K)iinterface;
        } else
        {
            return new a(ibinder);
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
            parcel1.writeString("com.google.android.gms.common.internal.service.ICommonService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
            parcel = parcel.readStrongBinder();
            break;
        }
        if (parcel == null)
        {
            parcel = null;
        } else
        {
            parcel1 = parcel.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
            if (parcel1 != null && (parcel1 instanceof J))
            {
                parcel = (J)parcel1;
            } else
            {
                parcel = new a(parcel);
            }
        }
        a(parcel);
        return true;
    }
}
