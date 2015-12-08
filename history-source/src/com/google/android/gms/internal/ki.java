// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            kh

public interface ki
    extends IInterface
{
    public static abstract class a extends Binder
        implements ki
    {

        public static ki V(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            if (iinterface != null && (iinterface instanceof ki))
            {
                return (ki)iinterface;
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
                a(kh.a.U(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    private static class a.a
        implements ki
    {

        private IBinder le;

        public void a(kh kh1)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
            if (kh1 == null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            ibinder = kh1.asBinder();
            parcel.writeStrongBinder(ibinder);
            le.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            kh1;
            parcel.recycle();
            throw kh1;
        }

        public IBinder asBinder()
        {
            return le;
        }

        a.a(IBinder ibinder)
        {
            le = ibinder;
        }
    }


    public abstract void a(kh kh)
        throws RemoteException;
}
