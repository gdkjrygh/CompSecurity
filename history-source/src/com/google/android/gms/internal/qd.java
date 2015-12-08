// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.c;
import com.google.android.gms.dynamic.d;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

// Referenced classes of package com.google.android.gms.internal:
//            qb, qa

public interface qd
    extends IInterface
{
    public static abstract class a extends Binder
        implements qd
    {

        public static qd bS(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            if (iinterface != null && (iinterface instanceof qd))
            {
                return (qd)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            Object obj1 = null;
            d d;
            c c;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
                d = com.google.android.gms.dynamic.d.a.ap(parcel.readStrongBinder());
                c = com.google.android.gms.dynamic.c.a.ao(parcel.readStrongBinder());
                break;
            }
            Object obj;
            if (parcel.readInt() != 0)
            {
                obj = (WalletFragmentOptions)WalletFragmentOptions.CREATOR.createFromParcel(parcel);
            } else
            {
                obj = null;
            }
            obj = a(d, c, ((WalletFragmentOptions) (obj)), qb.a.bQ(parcel.readStrongBinder()));
            parcel1.writeNoException();
            parcel = obj1;
            if (obj != null)
            {
                parcel = ((qa) (obj)).asBinder();
            }
            parcel1.writeStrongBinder(parcel);
            return true;
        }
    }

    private static class a.a
        implements qd
    {

        private IBinder le;

        public qa a(d d1, c c1, WalletFragmentOptions walletfragmentoptions, qb qb1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.wallet.internal.IWalletDynamiteCreator");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L7:
            parcel.writeStrongBinder(d1);
            if (c1 == null) goto _L4; else goto _L3
_L3:
            d1 = c1.asBinder();
_L8:
            parcel.writeStrongBinder(d1);
            if (walletfragmentoptions == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            walletfragmentoptions.writeToParcel(parcel, 0);
_L9:
            d1 = obj;
            if (qb1 == null)
            {
                break MISSING_BLOCK_LABEL_87;
            }
            d1 = qb1.asBinder();
            parcel.writeStrongBinder(d1);
            le.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            d1 = qa.a.bP(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
_L2:
            d1 = null;
              goto _L7
_L4:
            d1 = null;
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
              goto _L7
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


    public abstract qa a(d d, c c, WalletFragmentOptions walletfragmentoptions, qb qb)
        throws RemoteException;
}
