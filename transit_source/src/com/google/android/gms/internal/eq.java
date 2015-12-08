// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public interface eq
    extends IInterface
{
    public static abstract class a extends Binder
        implements eq
    {

        public static eq B(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (iinterface != null && (iinterface instanceof eq))
            {
                return (eq)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
            throws RemoteException
        {
            Object obj = null;
            d d30 = null;
            Object obj1 = null;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            Object obj9 = null;
            Object obj10 = null;
            Object obj11 = null;
            Object obj12 = null;
            Object obj13 = null;
            Object obj14 = null;
            Object obj15 = null;
            Object obj16 = null;
            Object obj17 = null;
            Object obj18 = null;
            Object obj19 = null;
            Object obj20 = null;
            Object obj21 = null;
            Object obj22 = null;
            Object obj23 = null;
            Object obj24 = null;
            Object obj25 = null;
            Object obj26 = null;
            Object obj27 = null;
            d d1 = null;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                c(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0)
                {
                    d1 = d.CREATOR.h(parcel);
                }
                b(d1);
                parcel1.writeNoException();
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onAchievementUpdated(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d2 = obj;
                if (parcel.readInt() != 0)
                {
                    d2 = d.CREATOR.h(parcel);
                }
                c(d2);
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d3;
                if (parcel.readInt() != 0)
                {
                    d3 = d.CREATOR.h(parcel);
                } else
                {
                    d3 = null;
                }
                if (parcel.readInt() != 0)
                {
                    d30 = d.CREATOR.h(parcel);
                }
                a(d3, d30);
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d4 = obj1;
                if (parcel.readInt() != 0)
                {
                    d4 = d.CREATOR.h(parcel);
                }
                d(d4);
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d5 = obj2;
                if (parcel.readInt() != 0)
                {
                    d5 = d.CREATOR.h(parcel);
                }
                e(d5);
                parcel1.writeNoException();
                return true;

            case 5008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d6 = obj3;
                if (parcel.readInt() != 0)
                {
                    d6 = d.CREATOR.h(parcel);
                }
                f(d6);
                parcel1.writeNoException();
                return true;

            case 5009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d7 = obj4;
                if (parcel.readInt() != 0)
                {
                    d7 = d.CREATOR.h(parcel);
                }
                g(d7);
                parcel1.writeNoException();
                return true;

            case 5010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d8 = obj5;
                if (parcel.readInt() != 0)
                {
                    d8 = d.CREATOR.h(parcel);
                }
                h(d8);
                parcel1.writeNoException();
                return true;

            case 5011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d9 = obj6;
                if (parcel.readInt() != 0)
                {
                    d9 = d.CREATOR.h(parcel);
                }
                i(d9);
                parcel1.writeNoException();
                return true;

            case 5012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d10 = obj7;
                if (parcel.readInt() != 0)
                {
                    d10 = d.CREATOR.h(parcel);
                }
                l(d10);
                parcel1.writeNoException();
                return true;

            case 5013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                M(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d11 = obj8;
                if (parcel.readInt() != 0)
                {
                    d11 = d.CREATOR.h(parcel);
                }
                m(d11);
                parcel1.writeNoException();
                return true;

            case 5015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                N(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onSignOutComplete();
                parcel1.writeNoException();
                return true;

            case 5017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d12 = obj9;
                if (parcel.readInt() != 0)
                {
                    d12 = d.CREATOR.h(parcel);
                }
                j(d12);
                parcel1.writeNoException();
                return true;

            case 5037: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d13 = obj10;
                if (parcel.readInt() != 0)
                {
                    d13 = d.CREATOR.h(parcel);
                }
                k(d13);
                parcel1.writeNoException();
                return true;

            case 5018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d14 = obj11;
                if (parcel.readInt() != 0)
                {
                    d14 = d.CREATOR.h(parcel);
                }
                n(d14);
                parcel1.writeNoException();
                return true;

            case 5019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d15 = obj12;
                if (parcel.readInt() != 0)
                {
                    d15 = d.CREATOR.h(parcel);
                }
                o(d15);
                parcel1.writeNoException();
                return true;

            case 5020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onLeftRoom(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d16 = obj13;
                if (parcel.readInt() != 0)
                {
                    d16 = d.CREATOR.h(parcel);
                }
                p(d16);
                parcel1.writeNoException();
                return true;

            case 5022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d17 = obj14;
                if (parcel.readInt() != 0)
                {
                    d17 = d.CREATOR.h(parcel);
                }
                q(d17);
                parcel1.writeNoException();
                return true;

            case 5023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d18 = obj15;
                if (parcel.readInt() != 0)
                {
                    d18 = d.CREATOR.h(parcel);
                }
                r(d18);
                parcel1.writeNoException();
                return true;

            case 5024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d19 = obj16;
                if (parcel.readInt() != 0)
                {
                    d19 = d.CREATOR.h(parcel);
                }
                s(d19);
                parcel1.writeNoException();
                return true;

            case 5025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d20 = obj17;
                if (parcel.readInt() != 0)
                {
                    d20 = d.CREATOR.h(parcel);
                }
                t(d20);
                parcel1.writeNoException();
                return true;

            case 5026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d21 = obj18;
                if (parcel.readInt() != 0)
                {
                    d21 = d.CREATOR.h(parcel);
                }
                a(d21, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d22 = obj19;
                if (parcel.readInt() != 0)
                {
                    d22 = d.CREATOR.h(parcel);
                }
                b(d22, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d23 = obj20;
                if (parcel.readInt() != 0)
                {
                    d23 = d.CREATOR.h(parcel);
                }
                c(d23, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d24 = obj21;
                if (parcel.readInt() != 0)
                {
                    d24 = d.CREATOR.h(parcel);
                }
                d(d24, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d25 = obj22;
                if (parcel.readInt() != 0)
                {
                    d25 = d.CREATOR.h(parcel);
                }
                e(d25, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d26 = obj23;
                if (parcel.readInt() != 0)
                {
                    d26 = d.CREATOR.h(parcel);
                }
                f(d26, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5032: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                RealTimeMessage realtimemessage = obj24;
                if (parcel.readInt() != 0)
                {
                    realtimemessage = (RealTimeMessage)RealTimeMessage.CREATOR.createFromParcel(parcel);
                }
                onRealTimeMessageReceived(realtimemessage);
                parcel1.writeNoException();
                return true;

            case 5033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                a(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5034: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                i1 = parcel.readInt();
                String s1 = parcel.readString();
                boolean flag;
                if (parcel.readInt() != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(i1, s1, flag);
                parcel1.writeNoException();
                return true;

            case 5038: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d27 = obj25;
                if (parcel.readInt() != 0)
                {
                    d27 = d.CREATOR.h(parcel);
                }
                u(d27);
                parcel1.writeNoException();
                return true;

            case 5035: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d28 = obj26;
                if (parcel.readInt() != 0)
                {
                    d28 = d.CREATOR.h(parcel);
                }
                v(d28);
                parcel1.writeNoException();
                return true;

            case 5036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                O(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5039: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d d29 = obj27;
                if (parcel.readInt() != 0)
                {
                    d29 = d.CREATOR.h(parcel);
                }
                w(d29);
                parcel1.writeNoException();
                return true;

            case 5040: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                P(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 6001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onP2PConnected(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 6002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onP2PDisconnected(parcel.readString());
                parcel1.writeNoException();
                return true;
            }
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
        }
    }

    private static class a.a
        implements eq
    {

        private IBinder dG;

        public void M(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            dG.transact(5013, parcel, parcel1, 0);
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

        public void N(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            dG.transact(5015, parcel, parcel1, 0);
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

        public void O(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            dG.transact(5036, parcel, parcel1, 0);
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

        public void P(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            dG.transact(5040, parcel, parcel1, 0);
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

        public void a(int i1, int j1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeInt(j1);
            parcel.writeString(s1);
            dG.transact(5033, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void a(int i1, String s1, boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeString(s1);
            i1 = ((flag1) ? 1 : 0);
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            dG.transact(5034, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void a(d d1, d d2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L3:
            if (d2 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            parcel.writeInt(1);
            d2.writeToParcel(parcel, 0);
_L4:
            dG.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(d d1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            dG.transact(5026, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public IBinder asBinder()
        {
            return dG;
        }

        public void b(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void b(d d1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            dG.transact(5027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void c(int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeString(s1);
            dG.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void c(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void c(d d1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            dG.transact(5028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void d(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void d(d d1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            dG.transact(5029, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void e(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void e(d d1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            dG.transact(5030, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void f(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void f(d d1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            dG.transact(5031, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void g(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void h(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void i(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void j(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void k(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5037, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void l(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5012, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void m(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void n(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void o(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void onAchievementUpdated(int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeString(s1);
            dG.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void onLeftRoom(int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeString(s1);
            dG.transact(5020, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void onP2PConnected(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s1);
            dG.transact(6001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void onP2PDisconnected(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s1);
            dG.transact(6002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (realtimemessage == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            realtimemessage.writeToParcel(parcel, 0);
_L1:
            dG.transact(5032, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            realtimemessage;
            parcel1.recycle();
            parcel.recycle();
            throw realtimemessage;
        }

        public void onSignOutComplete()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            dG.transact(5016, parcel, parcel1, 0);
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

        public void p(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void q(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5022, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void r(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void s(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5024, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void t(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5025, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void u(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5038, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void v(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5035, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        public void w(d d1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            dG.transact(5039, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            d1;
            parcel1.recycle();
            parcel.recycle();
            throw d1;
        }

        a.a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public abstract void M(int i1)
        throws RemoteException;

    public abstract void N(int i1)
        throws RemoteException;

    public abstract void O(int i1)
        throws RemoteException;

    public abstract void P(int i1)
        throws RemoteException;

    public abstract void a(int i1, int j1, String s1)
        throws RemoteException;

    public abstract void a(int i1, String s1, boolean flag)
        throws RemoteException;

    public abstract void a(d d1, d d2)
        throws RemoteException;

    public abstract void a(d d1, String as[])
        throws RemoteException;

    public abstract void b(d d1)
        throws RemoteException;

    public abstract void b(d d1, String as[])
        throws RemoteException;

    public abstract void c(int i1, String s1)
        throws RemoteException;

    public abstract void c(d d1)
        throws RemoteException;

    public abstract void c(d d1, String as[])
        throws RemoteException;

    public abstract void d(d d1)
        throws RemoteException;

    public abstract void d(d d1, String as[])
        throws RemoteException;

    public abstract void e(d d1)
        throws RemoteException;

    public abstract void e(d d1, String as[])
        throws RemoteException;

    public abstract void f(d d1)
        throws RemoteException;

    public abstract void f(d d1, String as[])
        throws RemoteException;

    public abstract void g(d d1)
        throws RemoteException;

    public abstract void h(d d1)
        throws RemoteException;

    public abstract void i(d d1)
        throws RemoteException;

    public abstract void j(d d1)
        throws RemoteException;

    public abstract void k(d d1)
        throws RemoteException;

    public abstract void l(d d1)
        throws RemoteException;

    public abstract void m(d d1)
        throws RemoteException;

    public abstract void n(d d1)
        throws RemoteException;

    public abstract void o(d d1)
        throws RemoteException;

    public abstract void onAchievementUpdated(int i1, String s1)
        throws RemoteException;

    public abstract void onLeftRoom(int i1, String s1)
        throws RemoteException;

    public abstract void onP2PConnected(String s1)
        throws RemoteException;

    public abstract void onP2PDisconnected(String s1)
        throws RemoteException;

    public abstract void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        throws RemoteException;

    public abstract void onSignOutComplete()
        throws RemoteException;

    public abstract void p(d d1)
        throws RemoteException;

    public abstract void q(d d1)
        throws RemoteException;

    public abstract void r(d d1)
        throws RemoteException;

    public abstract void s(d d1)
        throws RemoteException;

    public abstract void t(d d1)
        throws RemoteException;

    public abstract void u(d d1)
        throws RemoteException;

    public abstract void v(d d1)
        throws RemoteException;

    public abstract void w(d d1)
        throws RemoteException;
}
