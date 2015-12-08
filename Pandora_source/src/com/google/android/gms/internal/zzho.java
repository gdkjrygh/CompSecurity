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
//            zzhn

public interface zzho
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzho
    {

        public static zzho zzZ(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
            if (iinterface != null && (iinterface instanceof zzho))
            {
                return (zzho)iinterface;
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
                zza(zzhn.zza.zzY(parcel.readStrongBinder()));
                return true;
            }
        }
    }

    private static class zza.a
        implements zzho
    {

        private IBinder a;

        public IBinder asBinder()
        {
            return a;
        }

        public void zza(zzhn zzhn1)
            throws RemoteException
        {
            IBinder ibinder;
            Parcel parcel;
            ibinder = null;
            parcel = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
            if (zzhn1 == null)
            {
                break MISSING_BLOCK_LABEL_23;
            }
            ibinder = zzhn1.asBinder();
            parcel.writeStrongBinder(ibinder);
            a.transact(1, parcel, null, 1);
            parcel.recycle();
            return;
            zzhn1;
            parcel.recycle();
            throw zzhn1;
        }

        zza.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void zza(zzhn zzhn)
        throws RemoteException;
}
