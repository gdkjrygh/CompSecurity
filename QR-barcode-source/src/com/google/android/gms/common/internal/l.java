// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.common.internal:
//            k

public interface l
    extends IInterface
{
    public static abstract class a extends Binder
        implements l
    {

        public static l Q(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (iinterface != null && (iinterface instanceof l))
            {
                return (l)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
            throws RemoteException
        {
            Object obj1 = null;
            Object obj2 = null;
            String as1[] = null;
            String s2 = null;
            IBinder ibinder = null;
            String s4 = null;
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
            Object obj = null;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                as1 = parcel.createStringArray();
                s2 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((k) (obj)), i1, ((String) (obj1)), ((String) (obj2)), as1, s2, parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                a(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj2 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as1 = parcel.readString();
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                b(((k) (obj2)), i1, as1, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as1 = parcel.readString();
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                c(((k) (obj1)), i1, as1, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = as1;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                d(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = s2;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                e(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                String as2[] = parcel.createStringArray();
                String s3 = parcel.readString();
                ibinder = parcel.readStrongBinder();
                s4 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((k) (obj)), i1, ((String) (obj1)), ((String) (obj2)), as2, s3, ibinder, s4, parcel);
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = ibinder;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                f(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = s4;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                g(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                h(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                i(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                j(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                k(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                l(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                m(((k) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                obj2 = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((k) (obj)), i1, ((String) (obj1)), ((IBinder) (obj2)), parcel);
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                String as[] = parcel.createStringArray();
                String s1 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((k) (obj)), i1, ((String) (obj1)), as, s1, parcel);
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                b(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                c(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as = parcel.readString();
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                n(((k) (obj1)), i1, as, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                d(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as = parcel.readString();
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                o(((k) (obj1)), i1, as, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                e(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as = parcel.readString();
                obj = obj11;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                p(((k) (obj1)), i1, as, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                b(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                as = parcel.readString();
                String as3[] = parcel.createStringArray();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((k) (obj)), i1, ((String) (obj1)), as, as3, parcel);
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                f(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                g(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                h(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 36: // '$'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                i(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as = parcel.readString();
                obj = obj12;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                q(((k) (obj1)), i1, as, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as = parcel.readString();
                obj = obj13;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                r(((k) (obj1)), i1, as, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                j(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as = parcel.readString();
                obj = obj14;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                s(((k) (obj1)), i1, as, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                k(com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 43: // '+'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = com.google.android.gms.common.internal.k.a.P(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as = parcel.readString();
                obj = obj15;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            t(((k) (obj1)), i1, as, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;
        }
    }

    private static class a.a
        implements l
    {

        private IBinder lb;

        public void a(k k1, int i1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            lb.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void a(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void a(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void a(k k1, int i1, String s1, IBinder ibinder, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeStrongBinder(ibinder);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void a(k k1, int i1, String s1, String s2)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_86;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            lb.transact(34, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void a(k k1, int i1, String s1, String s2, String s3, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_100;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeString(s3);
            parcel.writeStringArray(as);
            lb.transact(33, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void a(k k1, int i1, String s1, String s2, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            lb.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void a(k k1, int i1, String s1, String s2, String as[], Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(30, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void a(k k1, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            parcel.writeString(s3);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void a(k k1, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
                String s4, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            parcel.writeString(s3);
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s4);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void a(k k1, int i1, String s1, String as[], String s2, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            parcel.writeString(s2);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public IBinder asBinder()
        {
            return lb;
        }

        public void b(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void b(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void b(k k1, int i1, String s1, String s2, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            parcel.writeString(s2);
            parcel.writeStringArray(as);
            lb.transact(28, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void c(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(22, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void c(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void d(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(24, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void d(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void e(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(26, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void e(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void f(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(31, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void f(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void g(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(32, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void g(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void h(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(35, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void h(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void i(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(36, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void i(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void j(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(40, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void j(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void k(k k1, int i1, String s1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            k1 = k1.asBinder();
_L1:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            lb.transact(42, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            k1 = null;
              goto _L1
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
        }

        public void k(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(16, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void l(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(17, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void m(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void n(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void o(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(25, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void p(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(27, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void q(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(37, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void r(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(38, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void s(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(41, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        public void t(k k1, int i1, String s1, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (k1 == null) goto _L2; else goto _L1
_L1:
            k1 = k1.asBinder();
_L5:
            parcel.writeStrongBinder(k1);
            parcel.writeInt(i1);
            parcel.writeString(s1);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            lb.transact(43, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            k1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            k1;
            parcel1.recycle();
            parcel.recycle();
            throw k1;
              goto _L5
        }

        a.a(IBinder ibinder)
        {
            lb = ibinder;
        }
    }


    public abstract void a(k k1, int i1)
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, String s2)
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, String s2, String s3, String as[])
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, String s2, String as[])
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, String s2, String as[], Bundle bundle)
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
            String s4, Bundle bundle)
        throws RemoteException;

    public abstract void a(k k1, int i1, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException;

    public abstract void b(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void b(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void b(k k1, int i1, String s1, String s2, String as[])
        throws RemoteException;

    public abstract void c(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void c(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void d(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void d(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void e(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void e(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void f(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void f(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void g(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void g(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void h(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void h(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void i(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void i(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void j(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void j(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void k(k k1, int i1, String s1)
        throws RemoteException;

    public abstract void k(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void l(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void m(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void n(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void o(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void p(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void q(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void r(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void s(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void t(k k1, int i1, String s1, Bundle bundle)
        throws RemoteException;
}
