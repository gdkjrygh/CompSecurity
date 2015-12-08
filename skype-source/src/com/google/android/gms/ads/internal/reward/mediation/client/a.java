// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.reward.mediation.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;

// Referenced classes of package com.google.android.gms.ads.internal.reward.mediation.client:
//            RewardItemParcel, c

public interface com.google.android.gms.ads.internal.reward.mediation.client.a
    extends IInterface
{
    public static abstract class a extends Binder
        implements com.google.android.gms.ads.internal.reward.mediation.client.a
    {

        public static com.google.android.gms.ads.internal.reward.mediation.client.a a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (iinterface != null && (iinterface instanceof com.google.android.gms.ads.internal.reward.mediation.client.a))
            {
                return (com.google.android.gms.ads.internal.reward.mediation.client.a)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
            throws RemoteException
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                a(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                a(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                b(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                c(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                d(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                e(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                c c1 = com.google.android.gms.b.c.a.a(parcel.readStrongBinder());
                if (parcel.readInt() != 0)
                {
                    com.google.android.gms.ads.internal.reward.mediation.client.c c2 = RewardItemParcel.CREATOR;
                    parcel = com.google.android.gms.ads.internal.reward.mediation.client.c.a(parcel);
                } else
                {
                    parcel = null;
                }
                a(c1, parcel);
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                f(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                b(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
                g(com.google.android.gms.b.c.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;
            }
        }
    }

    private static final class a.a
        implements com.google.android.gms.ads.internal.reward.mediation.client.a
    {

        private IBinder a;

        public final void a(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void a(c c1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            parcel.writeInt(i);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void a(c c1, RewardItemParcel rewarditemparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null) goto _L2; else goto _L1
_L1:
            c1 = c1.asBinder();
_L5:
            parcel.writeStrongBinder(c1);
            if (rewarditemparcel == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            rewarditemparcel.writeToParcel(parcel, 0);
_L6:
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            c1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
              goto _L5
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void b(c c1, int i)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            parcel.writeInt(i);
            a.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void c(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void d(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void e(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void f(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        public final void g(c c1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
            if (c1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            c1 = c1.asBinder();
_L1:
            parcel.writeStrongBinder(c1);
            a.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            c1 = null;
              goto _L1
            c1;
            parcel1.recycle();
            parcel.recycle();
            throw c1;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(c c1)
        throws RemoteException;

    public abstract void a(c c1, int i)
        throws RemoteException;

    public abstract void a(c c1, RewardItemParcel rewarditemparcel)
        throws RemoteException;

    public abstract void b(c c1)
        throws RemoteException;

    public abstract void b(c c1, int i)
        throws RemoteException;

    public abstract void c(c c1)
        throws RemoteException;

    public abstract void d(c c1)
        throws RemoteException;

    public abstract void e(c c1)
        throws RemoteException;

    public abstract void f(c c1)
        throws RemoteException;

    public abstract void g(c c1)
        throws RemoteException;
}
