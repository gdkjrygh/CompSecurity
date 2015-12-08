// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            AdRequestInfoParcel, AdResponseParcel, k, f, 
//            h

public interface j
    extends IInterface
{
    public static abstract class a extends Binder
        implements j
    {

        public static j a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (iinterface != null && (iinterface instanceof j))
            {
                return (j)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int l)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, l);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.request.IAdRequestService");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                if (parcel.readInt() != 0)
                {
                    obj = AdRequestInfoParcel.CREATOR;
                    obj = f.a(parcel);
                }
                parcel = a(((AdRequestInfoParcel) (obj)));
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

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = AdRequestInfoParcel.CREATOR;
                obj = f.a(parcel);
            } else
            {
                obj = null;
            }
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj1;
            } else
            {
                IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iinterface != null && (iinterface instanceof k))
                {
                    parcel = (k)iinterface;
                } else
                {
                    parcel = new k.a.a(parcel);
                }
            }
            a(((AdRequestInfoParcel) (obj)), parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.request.IAdRequestService");
        }
    }

    private static final class a.a
        implements j
    {

        private IBinder a;

        public final AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            adrequestinfoparcel.writeToParcel(parcel, 0);
_L3:
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            adrequestinfoparcel = AdResponseParcel.CREATOR;
            adrequestinfoparcel = h.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return adrequestinfoparcel;
_L2:
            parcel.writeInt(0);
              goto _L3
            adrequestinfoparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestinfoparcel;
            adrequestinfoparcel = null;
              goto _L4
        }

        public final void a(AdRequestInfoParcel adrequestinfoparcel, k k1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.request.IAdRequestService");
            if (adrequestinfoparcel == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            adrequestinfoparcel.writeToParcel(parcel, 0);
_L3:
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            adrequestinfoparcel = k1.asBinder();
_L4:
            parcel.writeStrongBinder(adrequestinfoparcel);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            adrequestinfoparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestinfoparcel;
            adrequestinfoparcel = null;
              goto _L4
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


    public abstract AdResponseParcel a(AdRequestInfoParcel adrequestinfoparcel)
        throws RemoteException;

    public abstract void a(AdRequestInfoParcel adrequestinfoparcel, k k)
        throws RemoteException;
}
