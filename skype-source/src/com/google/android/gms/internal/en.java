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
//            em

public interface en
    extends IInterface
{
    public static abstract class a extends Binder
        implements en
    {

        public static en a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
            if (iinterface != null && (iinterface instanceof en))
            {
                return (en)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                parcel = parcel.readStrongBinder();
                break;
            }
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchase");
                if (iinterface != null && (iinterface instanceof em))
                {
                    parcel = (em)iinterface;
                } else
                {
                    parcel = new em.a.a(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        }
    }

    private static final class a.a
        implements en
    {

        private IBinder a;

        public final void a(em em1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
            if (em1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            em1 = em1.asBinder();
_L1:
            parcel.writeStrongBinder(em1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            em1 = null;
              goto _L1
            em1;
            parcel1.recycle();
            parcel.recycle();
            throw em1;
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


    public abstract void a(em em)
        throws RemoteException;
}
