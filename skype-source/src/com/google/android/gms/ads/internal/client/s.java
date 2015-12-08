// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.i;
import com.google.android.gms.internal.bt;
import com.google.android.gms.internal.bu;
import com.google.android.gms.internal.bv;
import com.google.android.gms.internal.bw;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            r, q

public interface s
    extends IInterface
{
    public static abstract class a extends Binder
        implements s
    {

        public static s a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (iinterface != null && (iinterface instanceof s))
            {
                return (s)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            r r1 = null;
            Object obj = null;
            switch (j)
            {
            default:
                return super.onTransact(j, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                r1 = a();
                parcel1.writeNoException();
                parcel = ((Parcel) (obj));
                if (r1 != null)
                {
                    parcel = r1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                a(q.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                a(com.google.android.gms.internal.bt.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                a(com.google.android.gms.internal.bu.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                a(parcel.readString(), com.google.android.gms.internal.bw.a.a(parcel.readStrongBinder()), com.google.android.gms.internal.bv.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                obj = r1;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = NativeAdOptionsParcel.CREATOR;
                obj = i.a(parcel);
            }
            a(((NativeAdOptionsParcel) (obj)));
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
        }
    }

    private static final class a.a
        implements s
    {

        private IBinder a;

        public final r a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            r r;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            r = com.google.android.gms.ads.internal.client.r.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return r;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void a(q q1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (q1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            q1 = q1.asBinder();
_L1:
            parcel.writeStrongBinder(q1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            q1 = null;
              goto _L1
            q1;
            parcel1.recycle();
            parcel.recycle();
            throw q1;
        }

        public final void a(NativeAdOptionsParcel nativeadoptionsparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (nativeadoptionsparcel == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            nativeadoptionsparcel.writeToParcel(parcel, 0);
_L1:
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            nativeadoptionsparcel;
            parcel1.recycle();
            parcel.recycle();
            throw nativeadoptionsparcel;
        }

        public final void a(bt bt1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (bt1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            bt1 = bt1.asBinder();
_L1:
            parcel.writeStrongBinder(bt1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            bt1 = null;
              goto _L1
            bt1;
            parcel1.recycle();
            parcel.recycle();
            throw bt1;
        }

        public final void a(bu bu1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            if (bu1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            bu1 = bu1.asBinder();
_L1:
            parcel.writeStrongBinder(bu1);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            bu1 = null;
              goto _L1
            bu1;
            parcel1.recycle();
            parcel.recycle();
            throw bu1;
        }

        public final void a(String s1, bw bw1, bv bv1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            parcel.writeString(s1);
            if (bw1 == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            s1 = bw1.asBinder();
_L1:
            parcel.writeStrongBinder(s1);
            s1 = obj;
            if (bv1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            s1 = bv1.asBinder();
            parcel.writeStrongBinder(s1);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1 = null;
              goto _L1
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
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


    public abstract r a()
        throws RemoteException;

    public abstract void a(q q)
        throws RemoteException;

    public abstract void a(NativeAdOptionsParcel nativeadoptionsparcel)
        throws RemoteException;

    public abstract void a(bt bt)
        throws RemoteException;

    public abstract void a(bu bu)
        throws RemoteException;

    public abstract void a(String s1, bw bw, bv bv)
        throws RemoteException;
}
