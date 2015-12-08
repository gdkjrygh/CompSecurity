// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzgo, zzgq, zzgp, zzgr

public interface zzgs
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzgs
    {

        public static zzgs zzG(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (iinterface != null && (iinterface instanceof zzgs))
            {
                return (zzgs)iinterface;
            } else
            {
                return new zza(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = zzgo.CREATOR.zzh(parcel);
            } else
            {
                parcel = null;
            }
            parcel = zzd(parcel);
            parcel1.writeNoException();
            if (parcel != null)
            {
                parcel1.writeInt(1);
                parcel.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }
    }

    static class zza.zza
        implements zzgs
    {

        private IBinder zzle;

        public IBinder asBinder()
        {
            return zzle;
        }

        public zzgq zzd(zzgo zzgo1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (zzgo1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            zzgo1.writeToParcel(parcel, 0);
_L3:
            zzle.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            zzgo1 = zzgq.CREATOR.zzi(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return zzgo1;
_L2:
            parcel.writeInt(0);
              goto _L3
            zzgo1;
            parcel1.recycle();
            parcel.recycle();
            throw zzgo1;
            zzgo1 = null;
              goto _L4
        }

        zza.zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public abstract zzgq zzd(zzgo zzgo);
}
