// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.d;

// Referenced classes of package com.google.android.gms.internal:
//            aj, bw, am, an, 
//            ak

public interface bv
    extends IInterface
{
    public static abstract class a extends Binder
        implements bv
    {

        public static bv j(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (iinterface != null && (iinterface instanceof bv))
            {
                return (bv)iinterface;
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
            am am1 = null;
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, k);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                d d2 = com.google.android.gms.dynamic.d.a.ag(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    am1 = am.CREATOR.c(parcel);
                } else
                {
                    am1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    obj1 = aj.CREATOR.b(parcel);
                } else
                {
                    obj1 = null;
                }
                a(d2, am1, ((aj) (obj1)), parcel.readString(), bw.a.k(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                obj1 = getView();
                parcel1.writeNoException();
                parcel = am1;
                if (obj1 != null)
                {
                    parcel = ((d) (obj1)).asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                d d3 = com.google.android.gms.dynamic.d.a.ag(parcel.readStrongBinder());
                Object obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = aj.CREATOR.b(parcel);
                }
                a(d3, ((aj) (obj)), parcel.readString(), bw.a.k(parcel.readStrongBinder()));
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

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                d d4 = com.google.android.gms.dynamic.d.a.ag(parcel.readStrongBinder());
                am am2;
                aj aj2;
                if (parcel.readInt() != 0)
                {
                    am2 = am.CREATOR.c(parcel);
                } else
                {
                    am2 = null;
                }
                if (parcel.readInt() != 0)
                {
                    aj2 = aj.CREATOR.b(parcel);
                } else
                {
                    aj2 = null;
                }
                a(d4, am2, aj2, parcel.readString(), parcel.readString(), bw.a.k(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                d d1 = com.google.android.gms.dynamic.d.a.ag(parcel.readStrongBinder());
                aj aj1;
                if (parcel.readInt() != 0)
                {
                    aj1 = aj.CREATOR.b(parcel);
                } else
                {
                    aj1 = null;
                }
                a(d1, aj1, parcel.readString(), parcel.readString(), bw.a.k(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                pause();
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
                resume();
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
        implements bv
    {

        private IBinder ko;

        public void a(d d1, aj aj1, String s, bw bw1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L5:
            parcel.writeStrongBinder(d1);
            if (aj1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            aj1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            d1 = obj;
            if (bw1 == null)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            d1 = bw1.asBinder();
            parcel.writeStrongBinder(d1);
            ko.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            d1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
              goto _L5
        }

        public void a(d d1, aj aj1, String s, String s1, bw bw1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L5:
            parcel.writeStrongBinder(d1);
            if (aj1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            aj1.writeToParcel(parcel, 0);
_L6:
            parcel.writeString(s);
            parcel.writeString(s1);
            d1 = obj;
            if (bw1 == null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            d1 = bw1.asBinder();
            parcel.writeStrongBinder(d1);
            ko.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            d1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
              goto _L5
        }

        public void a(d d1, am am1, aj aj1, String s, bw bw1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L5:
            parcel.writeStrongBinder(d1);
            if (am1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            am1.writeToParcel(parcel, 0);
_L6:
            if (aj1 == null)
            {
                break MISSING_BLOCK_LABEL_159;
            }
            parcel.writeInt(1);
            aj1.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            d1 = obj;
            if (bw1 == null)
            {
                break MISSING_BLOCK_LABEL_94;
            }
            d1 = bw1.asBinder();
            parcel.writeStrongBinder(d1);
            ko.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            d1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
            parcel.writeInt(0);
              goto _L7
        }

        public void a(d d1, am am1, aj aj1, String s, String s1, bw bw1)
            throws RemoteException
        {
            Object obj;
            Parcel parcel;
            Parcel parcel1;
            obj = null;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            d1 = d1.asBinder();
_L5:
            parcel.writeStrongBinder(d1);
            if (am1 == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            am1.writeToParcel(parcel, 0);
_L6:
            if (aj1 == null)
            {
                break MISSING_BLOCK_LABEL_167;
            }
            parcel.writeInt(1);
            aj1.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s);
            parcel.writeString(s1);
            d1 = obj;
            if (bw1 == null)
            {
                break MISSING_BLOCK_LABEL_101;
            }
            d1 = bw1.asBinder();
            parcel.writeStrongBinder(d1);
            ko.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            d1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
            parcel.writeInt(0);
              goto _L7
        }

        public IBinder asBinder()
        {
            return ko;
        }

        public void destroy()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ko.transact(5, parcel, parcel1, 0);
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

        public d getView()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            d d1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ko.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            d1 = com.google.android.gms.dynamic.d.a.ag(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return d1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public void pause()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ko.transact(8, parcel, parcel1, 0);
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

        public void resume()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ko.transact(9, parcel, parcel1, 0);
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

        public void showInterstitial()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
            ko.transact(4, parcel, parcel1, 0);
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
            ko = ibinder;
        }
    }


    public abstract void a(d d, aj aj, String s, bw bw)
        throws RemoteException;

    public abstract void a(d d, aj aj, String s, String s1, bw bw)
        throws RemoteException;

    public abstract void a(d d, am am, aj aj, String s, bw bw)
        throws RemoteException;

    public abstract void a(d d, am am, aj aj, String s, String s1, bw bw)
        throws RemoteException;

    public abstract void destroy()
        throws RemoteException;

    public abstract d getView()
        throws RemoteException;

    public abstract void pause()
        throws RemoteException;

    public abstract void resume()
        throws RemoteException;

    public abstract void showInterstitial()
        throws RemoteException;
}
