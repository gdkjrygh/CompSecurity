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
//            bs

public interface bv
    extends IInterface
{
    public static abstract class a extends Binder
        implements bv
    {

        public static bv a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
            if (iinterface != null && (iinterface instanceof bv))
            {
                return (bv)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
                a(bs.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static final class a.a
        implements bv
    {

        private IBinder a;

        public final void a(bs bs1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
            if (bs1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            bs1 = bs1.asBinder();
_L1:
            parcel.writeStrongBinder(bs1);
            parcel.writeString(s);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            bs1 = null;
              goto _L1
            bs1;
            parcel1.recycle();
            parcel.recycle();
            throw bs1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(bs bs, String s)
        throws RemoteException;
}
