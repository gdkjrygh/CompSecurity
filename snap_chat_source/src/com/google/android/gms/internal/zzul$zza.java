// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzul, zzuk

public static abstract class zza.zzle extends Binder
    implements zzul
{
    static class zza
        implements zzul
    {

        private IBinder zzle;

        public IBinder asBinder()
        {
            return zzle;
        }

        public void zza(zzuk zzuk1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            if (zzuk1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzuk1 = zzuk1.asBinder();
_L1:
            parcel.writeStrongBinder(zzuk1);
            zzle.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzuk1 = null;
              goto _L1
            zzuk1;
            parcel1.recycle();
            parcel.recycle();
            throw zzuk1;
        }

        public void zza(zzuk zzuk1, byte abyte0[])
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.safetynet.internal.ISafetyNetService");
            if (zzuk1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            zzuk1 = zzuk1.asBinder();
_L1:
            parcel.writeStrongBinder(zzuk1);
            parcel.writeByteArray(abyte0);
            zzle.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzuk1 = null;
              goto _L1
            zzuk1;
            parcel1.recycle();
            parcel.recycle();
            throw zzuk1;
        }

        zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public static zzul zzcC(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        if (iinterface != null && (iinterface instanceof zzul))
        {
            return (zzul)iinterface;
        } else
        {
            return new zza(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.safetynet.internal.ISafetyNetService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
            zza(zzcB(parcel.readStrongBinder()), parcel.createByteArray());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
            zza(zzcB(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;
        }
    }
}
