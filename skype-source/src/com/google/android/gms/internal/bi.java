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
//            bh

public interface bi
    extends IInterface
{
    public static abstract class a extends Binder
        implements bi
    {

        public static bi a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
            if (iinterface != null && (iinterface instanceof bi))
            {
                return (bi)iinterface;
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
                parcel1.writeString("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                parcel = parcel.readStrongBinder();
                break;
            }
            if (parcel == null)
            {
                parcel = null;
            } else
            {
                IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
                if (iinterface != null && (iinterface instanceof bh))
                {
                    parcel = (bh)iinterface;
                } else
                {
                    parcel = new bh.a.a(parcel);
                }
            }
            a(parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
        }
    }

    private static final class a.a
        implements bi
    {

        private IBinder a;

        public final void a(bh bh1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
            if (bh1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            bh1 = bh1.asBinder();
_L1:
            parcel.writeStrongBinder(bh1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            bh1 = null;
              goto _L1
            bh1;
            parcel1.recycle();
            parcel.recycle();
            throw bh1;
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


    public abstract void a(bh bh)
        throws RemoteException;
}
