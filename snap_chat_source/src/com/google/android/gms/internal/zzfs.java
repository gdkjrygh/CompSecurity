// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            zzfr

public interface zzfs
    extends IInterface
{
    public static abstract class zza extends Binder
        implements zzfs
    {

        public static zzfs zzD(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            if (iinterface != null && (iinterface instanceof zzfs))
            {
                return (zzfs)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                boolean flag = isValidPurchase(parcel.readString());
                parcel1.writeNoException();
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                parcel1.writeInt(i);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                zza(zzfr.zza.zzC(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }

        public zza()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
        }
    }

    static class zza.zza
        implements zzfs
    {

        private IBinder zzle;

        public IBinder asBinder()
        {
            return zzle;
        }

        public boolean isValidPurchase(String s)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            parcel.writeString(s);
            zzle.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            i = parcel1.readInt();
            if (i == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            s;
            parcel1.recycle();
            parcel.recycle();
            throw s;
        }

        public void zza(zzfr zzfr1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
            if (zzfr1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            zzfr1 = zzfr1.asBinder();
_L1:
            parcel.writeStrongBinder(zzfr1);
            zzle.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            zzfr1 = null;
              goto _L1
            zzfr1;
            parcel1.recycle();
            parcel.recycle();
            throw zzfr1;
        }

        zza.zza(IBinder ibinder)
        {
            zzle = ibinder;
        }
    }


    public abstract boolean isValidPurchase(String s);

    public abstract void zza(zzfr zzfr);
}
