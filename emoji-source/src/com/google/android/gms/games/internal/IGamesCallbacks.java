// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.f;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

public interface IGamesCallbacks
    extends IInterface
{
    public static abstract class Stub extends Binder
        implements IGamesCallbacks
    {

        public static IGamesCallbacks ai(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            if (iinterface != null && (iinterface instanceof IGamesCallbacks))
            {
                return (IGamesCallbacks)iinterface;
            } else
            {
                return new Proxy(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
            throws RemoteException
        {
            DataHolder dataholder48 = null;
            Object obj = null;
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
            Object obj28 = null;
            Object obj29 = null;
            Object obj30 = null;
            Object obj31 = null;
            Object obj32 = null;
            Object obj33 = null;
            Object obj34 = null;
            Object obj35 = null;
            Contents contents2 = null;
            Object obj36 = null;
            Object obj37 = null;
            Object obj38 = null;
            Object obj39 = null;
            Object obj40 = null;
            Object obj41 = null;
            Object obj42 = null;
            Object obj43 = null;
            DataHolder dataholder = null;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
                return true;

            case 5001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                d(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = DataHolder.CREATOR.x(parcel);
                } else
                {
                    parcel = null;
                }
                c(parcel);
                parcel1.writeNoException();
                return true;

            case 5003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                e(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0)
                {
                    dataholder = DataHolder.CREATOR.x(parcel);
                }
                e(dataholder);
                parcel1.writeNoException();
                return true;

            case 5005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder1;
                if (parcel.readInt() != 0)
                {
                    dataholder1 = DataHolder.CREATOR.x(parcel);
                } else
                {
                    dataholder1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    dataholder48 = DataHolder.CREATOR.x(parcel);
                }
                a(dataholder1, dataholder48);
                parcel1.writeNoException();
                return true;

            case 5006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder2 = obj;
                if (parcel.readInt() != 0)
                {
                    dataholder2 = DataHolder.CREATOR.x(parcel);
                }
                f(dataholder2);
                parcel1.writeNoException();
                return true;

            case 5007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder3 = obj1;
                if (parcel.readInt() != 0)
                {
                    dataholder3 = DataHolder.CREATOR.x(parcel);
                }
                g(dataholder3);
                parcel1.writeNoException();
                return true;

            case 5008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder4 = obj2;
                if (parcel.readInt() != 0)
                {
                    dataholder4 = DataHolder.CREATOR.x(parcel);
                }
                h(dataholder4);
                parcel1.writeNoException();
                return true;

            case 5009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder5 = obj3;
                if (parcel.readInt() != 0)
                {
                    dataholder5 = DataHolder.CREATOR.x(parcel);
                }
                i(dataholder5);
                parcel1.writeNoException();
                return true;

            case 5010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder6 = obj4;
                if (parcel.readInt() != 0)
                {
                    dataholder6 = DataHolder.CREATOR.x(parcel);
                }
                j(dataholder6);
                parcel1.writeNoException();
                return true;

            case 5011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder7 = obj5;
                if (parcel.readInt() != 0)
                {
                    dataholder7 = DataHolder.CREATOR.x(parcel);
                }
                k(dataholder7);
                parcel1.writeNoException();
                return true;

            case 5016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                dT();
                parcel1.writeNoException();
                return true;

            case 5017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder8 = obj6;
                if (parcel.readInt() != 0)
                {
                    dataholder8 = DataHolder.CREATOR.x(parcel);
                }
                m(dataholder8);
                parcel1.writeNoException();
                return true;

            case 5037: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder9 = obj7;
                if (parcel.readInt() != 0)
                {
                    dataholder9 = DataHolder.CREATOR.x(parcel);
                }
                n(dataholder9);
                parcel1.writeNoException();
                return true;

            case 5018: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder10 = obj8;
                if (parcel.readInt() != 0)
                {
                    dataholder10 = DataHolder.CREATOR.x(parcel);
                }
                u(dataholder10);
                parcel1.writeNoException();
                return true;

            case 5019: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder11 = obj9;
                if (parcel.readInt() != 0)
                {
                    dataholder11 = DataHolder.CREATOR.x(parcel);
                }
                v(dataholder11);
                parcel1.writeNoException();
                return true;

            case 5020: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onLeftRoom(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 5021: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder12 = obj10;
                if (parcel.readInt() != 0)
                {
                    dataholder12 = DataHolder.CREATOR.x(parcel);
                }
                w(dataholder12);
                parcel1.writeNoException();
                return true;

            case 5022: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder13 = obj11;
                if (parcel.readInt() != 0)
                {
                    dataholder13 = DataHolder.CREATOR.x(parcel);
                }
                x(dataholder13);
                parcel1.writeNoException();
                return true;

            case 5023: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder14 = obj12;
                if (parcel.readInt() != 0)
                {
                    dataholder14 = DataHolder.CREATOR.x(parcel);
                }
                y(dataholder14);
                parcel1.writeNoException();
                return true;

            case 5024: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder15 = obj13;
                if (parcel.readInt() != 0)
                {
                    dataholder15 = DataHolder.CREATOR.x(parcel);
                }
                z(dataholder15);
                parcel1.writeNoException();
                return true;

            case 5025: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder16 = obj14;
                if (parcel.readInt() != 0)
                {
                    dataholder16 = DataHolder.CREATOR.x(parcel);
                }
                A(dataholder16);
                parcel1.writeNoException();
                return true;

            case 5026: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder17 = obj15;
                if (parcel.readInt() != 0)
                {
                    dataholder17 = DataHolder.CREATOR.x(parcel);
                }
                a(dataholder17, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5027: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder18 = obj16;
                if (parcel.readInt() != 0)
                {
                    dataholder18 = DataHolder.CREATOR.x(parcel);
                }
                b(dataholder18, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5028: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder19 = obj17;
                if (parcel.readInt() != 0)
                {
                    dataholder19 = DataHolder.CREATOR.x(parcel);
                }
                c(dataholder19, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5029: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder20 = obj18;
                if (parcel.readInt() != 0)
                {
                    dataholder20 = DataHolder.CREATOR.x(parcel);
                }
                d(dataholder20, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5030: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder21 = obj19;
                if (parcel.readInt() != 0)
                {
                    dataholder21 = DataHolder.CREATOR.x(parcel);
                }
                e(dataholder21, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5031: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder22 = obj20;
                if (parcel.readInt() != 0)
                {
                    dataholder22 = DataHolder.CREATOR.x(parcel);
                }
                f(dataholder22, parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 5032: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                if (parcel.readInt() != 0)
                {
                    parcel = (RealTimeMessage)RealTimeMessage.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                onRealTimeMessageReceived(parcel);
                parcel1.writeNoException();
                return true;

            case 5033: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                b(parcel.readInt(), parcel.readInt(), parcel.readString());
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
                DataHolder dataholder23 = obj21;
                if (parcel.readInt() != 0)
                {
                    dataholder23 = DataHolder.CREATOR.x(parcel);
                }
                B(dataholder23);
                parcel1.writeNoException();
                return true;

            case 5035: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder24 = obj22;
                if (parcel.readInt() != 0)
                {
                    dataholder24 = DataHolder.CREATOR.x(parcel);
                }
                C(dataholder24);
                parcel1.writeNoException();
                return true;

            case 5036: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                cd(parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5039: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder25 = obj23;
                if (parcel.readInt() != 0)
                {
                    dataholder25 = DataHolder.CREATOR.x(parcel);
                }
                D(dataholder25);
                parcel1.writeNoException();
                return true;

            case 5040: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                ce(parcel.readInt());
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

            case 8001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder26 = obj24;
                if (parcel.readInt() != 0)
                {
                    dataholder26 = DataHolder.CREATOR.x(parcel);
                }
                E(dataholder26);
                parcel1.writeNoException();
                return true;

            case 8002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                i1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                b(i1, parcel);
                parcel1.writeNoException();
                return true;

            case 8003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder27 = obj25;
                if (parcel.readInt() != 0)
                {
                    dataholder27 = DataHolder.CREATOR.x(parcel);
                }
                p(dataholder27);
                parcel1.writeNoException();
                return true;

            case 8004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder28 = obj26;
                if (parcel.readInt() != 0)
                {
                    dataholder28 = DataHolder.CREATOR.x(parcel);
                }
                q(dataholder28);
                parcel1.writeNoException();
                return true;

            case 8005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder29 = obj27;
                if (parcel.readInt() != 0)
                {
                    dataholder29 = DataHolder.CREATOR.x(parcel);
                }
                r(dataholder29);
                parcel1.writeNoException();
                return true;

            case 8006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder30 = obj28;
                if (parcel.readInt() != 0)
                {
                    dataholder30 = DataHolder.CREATOR.x(parcel);
                }
                s(dataholder30);
                parcel1.writeNoException();
                return true;

            case 8007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                f(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder31 = obj29;
                if (parcel.readInt() != 0)
                {
                    dataholder31 = DataHolder.CREATOR.x(parcel);
                }
                t(dataholder31);
                parcel1.writeNoException();
                return true;

            case 8009: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onTurnBasedMatchRemoved(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 8010: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onInvitationRemoved(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 9001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder32 = obj30;
                if (parcel.readInt() != 0)
                {
                    dataholder32 = DataHolder.CREATOR.x(parcel);
                }
                l(dataholder32);
                parcel1.writeNoException();
                return true;

            case 10001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder33 = obj31;
                if (parcel.readInt() != 0)
                {
                    dataholder33 = DataHolder.CREATOR.x(parcel);
                }
                o(dataholder33);
                parcel1.writeNoException();
                return true;

            case 10002: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                onRequestRemoved(parcel.readString());
                parcel1.writeNoException();
                return true;

            case 10003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder34 = obj32;
                if (parcel.readInt() != 0)
                {
                    dataholder34 = DataHolder.CREATOR.x(parcel);
                }
                F(dataholder34);
                parcel1.writeNoException();
                return true;

            case 10004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder35 = obj33;
                if (parcel.readInt() != 0)
                {
                    dataholder35 = DataHolder.CREATOR.x(parcel);
                }
                G(dataholder35);
                parcel1.writeNoException();
                return true;

            case 10005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                i1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                c(i1, parcel);
                parcel1.writeNoException();
                return true;

            case 10006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder36 = obj34;
                if (parcel.readInt() != 0)
                {
                    dataholder36 = DataHolder.CREATOR.x(parcel);
                }
                H(dataholder36);
                parcel1.writeNoException();
                return true;

            case 11001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                i1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                d(i1, parcel);
                parcel1.writeNoException();
                return true;

            case 12001: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder37 = obj35;
                if (parcel.readInt() != 0)
                {
                    dataholder37 = DataHolder.CREATOR.x(parcel);
                }
                I(dataholder37);
                parcel1.writeNoException();
                return true;

            case 12004: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder38;
                if (parcel.readInt() != 0)
                {
                    dataholder38 = DataHolder.CREATOR.x(parcel);
                } else
                {
                    dataholder38 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(dataholder38, parcel);
                parcel1.writeNoException();
                return true;

            case 12017: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder39;
                Contents contents;
                Contents contents1;
                String s2;
                if (parcel.readInt() != 0)
                {
                    dataholder39 = DataHolder.CREATOR.x(parcel);
                } else
                {
                    dataholder39 = null;
                }
                s2 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    contents = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    contents = null;
                }
                if (parcel.readInt() != 0)
                {
                    contents1 = (Contents)Contents.CREATOR.createFromParcel(parcel);
                } else
                {
                    contents1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    contents2 = (Contents)Contents.CREATOR.createFromParcel(parcel);
                }
                a(dataholder39, s2, contents, contents1, contents2);
                parcel1.writeNoException();
                return true;

            case 12005: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder40 = obj36;
                if (parcel.readInt() != 0)
                {
                    dataholder40 = DataHolder.CREATOR.x(parcel);
                }
                J(dataholder40);
                parcel1.writeNoException();
                return true;

            case 12012: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                g(parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 12003: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                i1 = parcel.readInt();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                e(i1, parcel);
                parcel1.writeNoException();
                return true;

            case 12013: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder41 = obj37;
                if (parcel.readInt() != 0)
                {
                    dataholder41 = DataHolder.CREATOR.x(parcel);
                }
                P(dataholder41);
                parcel1.writeNoException();
                return true;

            case 12011: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder42 = obj38;
                if (parcel.readInt() != 0)
                {
                    dataholder42 = DataHolder.CREATOR.x(parcel);
                }
                d(dataholder42);
                parcel1.writeNoException();
                return true;

            case 12006: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder43 = obj39;
                if (parcel.readInt() != 0)
                {
                    dataholder43 = DataHolder.CREATOR.x(parcel);
                }
                K(dataholder43);
                parcel1.writeNoException();
                return true;

            case 12007: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder44 = obj40;
                if (parcel.readInt() != 0)
                {
                    dataholder44 = DataHolder.CREATOR.x(parcel);
                }
                L(dataholder44);
                parcel1.writeNoException();
                return true;

            case 12014: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder45 = obj41;
                if (parcel.readInt() != 0)
                {
                    dataholder45 = DataHolder.CREATOR.x(parcel);
                }
                M(dataholder45);
                parcel1.writeNoException();
                return true;

            case 12016: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder46 = obj42;
                if (parcel.readInt() != 0)
                {
                    dataholder46 = DataHolder.CREATOR.x(parcel);
                }
                N(dataholder46);
                parcel1.writeNoException();
                return true;

            case 12008: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                DataHolder dataholder47 = obj43;
                if (parcel.readInt() != 0)
                {
                    dataholder47 = DataHolder.CREATOR.x(parcel);
                }
                O(dataholder47);
                parcel1.writeNoException();
                return true;

            case 12015: 
                parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
                i1 = parcel.readInt();
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            f(i1, parcel);
            parcel1.writeNoException();
            return true;
        }

        public Stub()
        {
            attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
        }
    }

    private static class Stub.Proxy
        implements IGamesCallbacks
    {

        private IBinder kq;

        public void A(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5025, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void B(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5038, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void C(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5035, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void D(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5039, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void E(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(8001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void F(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(10003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void G(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(10004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void H(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(10006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void I(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void J(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void K(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void L(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void M(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12014, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void N(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12016, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void O(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void P(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12013, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
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
            kq.transact(5034, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void a(DataHolder dataholder, DataHolder dataholder1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (dataholder1 == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            parcel.writeInt(1);
            dataholder1.writeToParcel(parcel, 0);
_L4:
            kq.transact(5005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(DataHolder dataholder, Contents contents)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L3:
            if (contents == null)
            {
                break MISSING_BLOCK_LABEL_97;
            }
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L4:
            kq.transact(12004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
            parcel.writeInt(0);
              goto _L4
        }

        public void a(DataHolder dataholder, String s1, Contents contents, Contents contents1, Contents contents2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L7:
            parcel.writeString(s1);
            if (contents == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            contents.writeToParcel(parcel, 0);
_L8:
            if (contents1 == null) goto _L6; else goto _L5
_L5:
            parcel.writeInt(1);
            contents1.writeToParcel(parcel, 0);
_L9:
            if (contents2 == null)
            {
                break MISSING_BLOCK_LABEL_169;
            }
            parcel.writeInt(1);
            contents2.writeToParcel(parcel, 0);
_L10:
            kq.transact(12017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L7
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
_L4:
            parcel.writeInt(0);
              goto _L8
_L6:
            parcel.writeInt(0);
              goto _L9
            parcel.writeInt(0);
              goto _L10
        }

        public void a(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            kq.transact(5026, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public IBinder asBinder()
        {
            return kq;
        }

        public void b(int i1, int j1, String s1)
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
            kq.transact(5033, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void b(int i1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            kq.transact(8002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public void b(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            kq.transact(5027, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void c(int i1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            kq.transact(10005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public void c(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void c(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            kq.transact(5028, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void cd(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            kq.transact(5036, parcel, parcel1, 0);
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

        public void ce(int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            kq.transact(5040, parcel, parcel1, 0);
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

        public void d(int i1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            kq.transact(11001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public void d(int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeString(s1);
            kq.transact(5001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void d(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(12011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void d(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            kq.transact(5029, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void dT()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            kq.transact(5016, parcel, parcel1, 0);
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

        public void e(int i1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            kq.transact(12003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public void e(int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeString(s1);
            kq.transact(5003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void e(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void e(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            kq.transact(5030, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void f(int i1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            if (bundle == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L1:
            kq.transact(12015, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            bundle;
            parcel1.recycle();
            parcel.recycle();
            throw bundle;
        }

        public void f(int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeString(s1);
            kq.transact(8007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void f(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void f(DataHolder dataholder, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            parcel.writeStringArray(as);
            kq.transact(5031, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void g(int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeInt(i1);
            parcel.writeString(s1);
            kq.transact(12012, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void g(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5007, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void h(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void i(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void j(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5010, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void k(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5011, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void l(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(9001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void m(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5017, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void n(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5037, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void o(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(10001, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void onInvitationRemoved(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s1);
            kq.transact(8010, parcel, parcel1, 0);
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
            kq.transact(5020, parcel, parcel1, 0);
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
            kq.transact(6001, parcel, parcel1, 0);
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
            kq.transact(6002, parcel, parcel1, 0);
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
            kq.transact(5032, parcel, parcel1, 0);
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

        public void onRequestRemoved(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s1);
            kq.transact(10002, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void onTurnBasedMatchRemoved(String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            parcel.writeString(s1);
            kq.transact(8009, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            s1;
            parcel1.recycle();
            parcel.recycle();
            throw s1;
        }

        public void p(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(8003, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void q(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(8004, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void r(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(8005, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void s(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(8006, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void t(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(8008, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void u(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5018, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void v(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5019, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void w(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5021, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void x(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5022, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void y(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5023, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        public void z(DataHolder dataholder)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesCallbacks");
            if (dataholder == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            parcel.writeInt(1);
            dataholder.writeToParcel(parcel, 0);
_L1:
            kq.transact(5024, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            dataholder;
            parcel1.recycle();
            parcel.recycle();
            throw dataholder;
        }

        Stub.Proxy(IBinder ibinder)
        {
            kq = ibinder;
        }
    }


    public abstract void A(DataHolder dataholder)
        throws RemoteException;

    public abstract void B(DataHolder dataholder)
        throws RemoteException;

    public abstract void C(DataHolder dataholder)
        throws RemoteException;

    public abstract void D(DataHolder dataholder)
        throws RemoteException;

    public abstract void E(DataHolder dataholder)
        throws RemoteException;

    public abstract void F(DataHolder dataholder)
        throws RemoteException;

    public abstract void G(DataHolder dataholder)
        throws RemoteException;

    public abstract void H(DataHolder dataholder)
        throws RemoteException;

    public abstract void I(DataHolder dataholder)
        throws RemoteException;

    public abstract void J(DataHolder dataholder)
        throws RemoteException;

    public abstract void K(DataHolder dataholder)
        throws RemoteException;

    public abstract void L(DataHolder dataholder)
        throws RemoteException;

    public abstract void M(DataHolder dataholder)
        throws RemoteException;

    public abstract void N(DataHolder dataholder)
        throws RemoteException;

    public abstract void O(DataHolder dataholder)
        throws RemoteException;

    public abstract void P(DataHolder dataholder)
        throws RemoteException;

    public abstract void a(int i1, String s1, boolean flag)
        throws RemoteException;

    public abstract void a(DataHolder dataholder, DataHolder dataholder1)
        throws RemoteException;

    public abstract void a(DataHolder dataholder, Contents contents)
        throws RemoteException;

    public abstract void a(DataHolder dataholder, String s1, Contents contents, Contents contents1, Contents contents2)
        throws RemoteException;

    public abstract void a(DataHolder dataholder, String as[])
        throws RemoteException;

    public abstract void b(int i1, int j1, String s1)
        throws RemoteException;

    public abstract void b(int i1, Bundle bundle)
        throws RemoteException;

    public abstract void b(DataHolder dataholder, String as[])
        throws RemoteException;

    public abstract void c(int i1, Bundle bundle)
        throws RemoteException;

    public abstract void c(DataHolder dataholder)
        throws RemoteException;

    public abstract void c(DataHolder dataholder, String as[])
        throws RemoteException;

    public abstract void cd(int i1)
        throws RemoteException;

    public abstract void ce(int i1)
        throws RemoteException;

    public abstract void d(int i1, Bundle bundle)
        throws RemoteException;

    public abstract void d(int i1, String s1)
        throws RemoteException;

    public abstract void d(DataHolder dataholder)
        throws RemoteException;

    public abstract void d(DataHolder dataholder, String as[])
        throws RemoteException;

    public abstract void dT()
        throws RemoteException;

    public abstract void e(int i1, Bundle bundle)
        throws RemoteException;

    public abstract void e(int i1, String s1)
        throws RemoteException;

    public abstract void e(DataHolder dataholder)
        throws RemoteException;

    public abstract void e(DataHolder dataholder, String as[])
        throws RemoteException;

    public abstract void f(int i1, Bundle bundle)
        throws RemoteException;

    public abstract void f(int i1, String s1)
        throws RemoteException;

    public abstract void f(DataHolder dataholder)
        throws RemoteException;

    public abstract void f(DataHolder dataholder, String as[])
        throws RemoteException;

    public abstract void g(int i1, String s1)
        throws RemoteException;

    public abstract void g(DataHolder dataholder)
        throws RemoteException;

    public abstract void h(DataHolder dataholder)
        throws RemoteException;

    public abstract void i(DataHolder dataholder)
        throws RemoteException;

    public abstract void j(DataHolder dataholder)
        throws RemoteException;

    public abstract void k(DataHolder dataholder)
        throws RemoteException;

    public abstract void l(DataHolder dataholder)
        throws RemoteException;

    public abstract void m(DataHolder dataholder)
        throws RemoteException;

    public abstract void n(DataHolder dataholder)
        throws RemoteException;

    public abstract void o(DataHolder dataholder)
        throws RemoteException;

    public abstract void onInvitationRemoved(String s1)
        throws RemoteException;

    public abstract void onLeftRoom(int i1, String s1)
        throws RemoteException;

    public abstract void onP2PConnected(String s1)
        throws RemoteException;

    public abstract void onP2PDisconnected(String s1)
        throws RemoteException;

    public abstract void onRealTimeMessageReceived(RealTimeMessage realtimemessage)
        throws RemoteException;

    public abstract void onRequestRemoved(String s1)
        throws RemoteException;

    public abstract void onTurnBasedMatchRemoved(String s1)
        throws RemoteException;

    public abstract void p(DataHolder dataholder)
        throws RemoteException;

    public abstract void q(DataHolder dataholder)
        throws RemoteException;

    public abstract void r(DataHolder dataholder)
        throws RemoteException;

    public abstract void s(DataHolder dataholder)
        throws RemoteException;

    public abstract void t(DataHolder dataholder)
        throws RemoteException;

    public abstract void u(DataHolder dataholder)
        throws RemoteException;

    public abstract void v(DataHolder dataholder)
        throws RemoteException;

    public abstract void w(DataHolder dataholder)
        throws RemoteException;

    public abstract void x(DataHolder dataholder)
        throws RemoteException;

    public abstract void y(DataHolder dataholder)
        throws RemoteException;

    public abstract void z(DataHolder dataholder)
        throws RemoteException;
}
