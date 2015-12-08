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
//            zzlx

public interface zzly
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzly
    {

        public static zzly zzcE(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.search.internal.ISearchAuthService");
            if (iinterface != null && (iinterface instanceof zzly))
            {
                return (zzly)iinterface;
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
                parcel1.writeString("com.google.android.gms.search.internal.ISearchAuthService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.search.internal.ISearchAuthService");
                zza(zzlx.zza.zzcD(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static class zza.a
        implements zzly
    {

        private IBinder a;

        public IBinder asBinder()
        {
            return a;
        }

        public void zza(zzlx zzlx1, String s, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.search.internal.ISearchAuthService");
            if (zzlx1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            zzlx1 = zzlx1.asBinder();
_L1:
            parcel.writeStrongBinder(zzlx1);
            parcel.writeString(s);
            parcel.writeString(s1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzlx1 = null;
              goto _L1
            zzlx1;
            parcel1.recycle();
            parcel.recycle();
            throw zzlx1;
        }

        zza.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void zza(zzlx zzlx, String s, String s1)
        throws RemoteException;
}
