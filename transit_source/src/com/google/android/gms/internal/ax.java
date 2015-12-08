// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.b;

// Referenced classes of package com.google.android.gms.internal:
//            v, ay, x, y, 
//            w

public interface ax
    extends IInterface
{
    public static abstract class a extends Binder
        implements ax
    {

        public static ax j(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iinterface != null && (iinterface instanceof ax))
            {
                return (ax)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
            throws RemoteException
        {
            Object obj1 = null;
            x x1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                b b1 = com.google.android.gms.dynamic.b.a.z(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    x1 = x.CREATOR.b(parcel);
                } else
                {
                    x1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = v.CREATOR.a(parcel);
                } else
                {
                    obj1 = null;
                }
                a(b1, x1, ((v) (obj1)), parcel.readString(), ay.a.k(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj1 = getView();
                parcel1.writeNoException();
                parcel = x1;
                if (obj1 != null)
                {
                    parcel = ((b) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                b b2 = com.google.android.gms.dynamic.b.a.z(parcel.readStrongBinder());
                Object obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = v.CREATOR.a(parcel);
                }
                a(b2, ((v) (obj)), parcel.readString(), ay.a.k(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                showInterstitial();
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                destroy();
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
        }
    }

    private static class a.a
        implements ax
    {

        private IBinder dG;

        public void a(b b1, v v1, String s, ay ay1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (b1 == null) goto _L2; else goto _L1
_L1:
            b1 = b1.asBinder();
_L5:
            parcel.writeStrongBinder(b1);
            if (v1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            v1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            b1 = obj;
            if (ay1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            b1 = ay1.asBinder();
            parcel.writeStrongBinder(b1);
            dG.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            b1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
              goto _L5
        }

        public void a(b b1, x x1, v v1, String s, ay ay1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (b1 == null) goto _L2; else goto _L1
_L1:
            b1 = b1.asBinder();
_L5:
            parcel.writeStrongBinder(b1);
            if (x1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            x1.writeToParcel(parcel, 0);
_L6:
            if (v1 == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            parcel.writeInt(1);
            v1.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            b1 = obj;
            if (ay1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            b1 = ay1.asBinder();
            parcel.writeStrongBinder(b1);
            dG.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            b1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
            parcel.writeInt(0);
              goto _L7
        }

        public IBinder asBinder()
        {
            return dG;
        }

        public void destroy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            dG.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public b getView()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            b b1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            dG.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            b1 = com.google.android.gms.dynamic.b.a.z(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return b1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void showInterstitial()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            dG.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        a.a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public abstract void a(b b, v v, String s, ay ay)
        throws RemoteException;

    public abstract void a(b b, x x, v v, String s, ay ay)
        throws RemoteException;

    public abstract void destroy()
        throws RemoteException;

    public abstract b getView()
        throws RemoteException;

    public abstract void showInterstitial()
        throws RemoteException;
}
