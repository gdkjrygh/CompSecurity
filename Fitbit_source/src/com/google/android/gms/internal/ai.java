// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ah, jj

public interface ai
    extends IInterface
{
    public static abstract class a extends Binder
        implements ai
    {

        public static ai a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        /* block-local class not found */
        class a {}

            if (iinterface != null && (iinterface instanceof ai))
            {
                return (ai)iinterface;
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
            String s21 = null;
            IBinder ibinder1 = null;
            String s23 = null;
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
                obj = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                obj2 = parcel.readString();
                as1 = parcel.createStringArray();
                s21 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((ah) (obj)), i1, ((String) (obj1)), ((String) (obj2)), as1, s21, parcel);
                parcel1.writeNoException();
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj2 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                a(((ah) (obj1)), i1, ((String) (obj2)), ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(ah.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel1.writeNoException();
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj2 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as1 = parcel.readString();
                obj = obj1;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                b(((ah) (obj2)), i1, as1, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                as1 = parcel.readString();
                obj = obj2;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                c(((ah) (obj1)), i1, as1, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s1 = parcel.readString();
                obj = as1;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                d(((ah) (obj1)), i1, s1, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s2 = parcel.readString();
                obj = s21;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                e(((ah) (obj1)), i1, s2, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                String s3 = parcel.readString();
                String as2[] = parcel.createStringArray();
                String s22 = parcel.readString();
                ibinder1 = parcel.readStrongBinder();
                s23 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((ah) (obj)), i1, ((String) (obj1)), s3, as2, s22, ibinder1, s23, parcel);
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s4 = parcel.readString();
                obj = ibinder1;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                f(((ah) (obj1)), i1, s4, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s5 = parcel.readString();
                obj = s23;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                g(((ah) (obj1)), i1, s5, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s6 = parcel.readString();
                obj = obj3;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                h(((ah) (obj1)), i1, s6, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s7 = parcel.readString();
                obj = obj4;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                i(((ah) (obj1)), i1, s7, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s8 = parcel.readString();
                obj = obj5;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                j(((ah) (obj1)), i1, s8, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 16: // '\020'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s9 = parcel.readString();
                obj = obj6;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                k(((ah) (obj1)), i1, s9, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 17: // '\021'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s10 = parcel.readString();
                obj = obj7;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                l(((ah) (obj1)), i1, s10, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s11 = parcel.readString();
                obj = obj8;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                m(((ah) (obj1)), i1, s11, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                IBinder ibinder = parcel.readStrongBinder();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((ah) (obj)), i1, ((String) (obj1)), ibinder, parcel);
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                String as[] = parcel.createStringArray();
                String s20 = parcel.readString();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((ah) (obj)), i1, ((String) (obj1)), as, s20, parcel);
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                b(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                c(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s12 = parcel.readString();
                obj = obj9;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                n(((ah) (obj1)), i1, s12, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 24: // '\030'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                d(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 25: // '\031'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s13 = parcel.readString();
                obj = obj10;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                o(((ah) (obj1)), i1, s13, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 26: // '\032'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                e(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 27: // '\033'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s14 = parcel.readString();
                obj = obj11;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                p(((ah) (obj1)), i1, s14, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 28: // '\034'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                b(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 30: // '\036'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                obj1 = parcel.readString();
                String s15 = parcel.readString();
                String as3[] = parcel.createStringArray();
                if (parcel.readInt() != 0)
                {
                    parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(((ah) (obj)), i1, ((String) (obj1)), s15, as3, parcel);
                parcel1.writeNoException();
                return true;

            case 31: // '\037'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                f(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 32: // ' '
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                g(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 33: // '!'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
                parcel1.writeNoException();
                return true;

            case 34: // '"'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                a(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 35: // '#'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                h(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 36: // '$'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                i(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 37: // '%'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s16 = parcel.readString();
                obj = obj12;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                q(((ah) (obj1)), i1, s16, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 38: // '&'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s17 = parcel.readString();
                obj = obj13;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                r(((ah) (obj1)), i1, s17, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 40: // '('
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                j(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 41: // ')'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s18 = parcel.readString();
                obj = obj14;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                s(((ah) (obj1)), i1, s18, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 42: // '*'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                k(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 43: // '+'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                i1 = parcel.readInt();
                String s19 = parcel.readString();
                obj = obj15;
                if (parcel.readInt() != 0)
                {
                    obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                }
                t(((ah) (obj1)), i1, s19, ((Bundle) (obj)));
                parcel1.writeNoException();
                return true;

            case 44: // ','
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                l(ah.a.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 46: // '.'
                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                obj1 = ah.a.a(parcel.readStrongBinder());
                obj = obj16;
                break;
            }
            if (parcel.readInt() != 0)
            {
                obj = (jj)jj.CREATOR.createFromParcel(parcel);
            }
            a(((ah) (obj1)), ((jj) (obj)));
            parcel1.writeNoException();
            return true;
        }
    }


    public abstract void a(ah ah, int i1)
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, IBinder ibinder, Bundle bundle)
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, String s2)
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, String s2, String s3, String as[])
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, String s2, String as[])
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, String s2, String as[], Bundle bundle)
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, String s2, String as[], String s3, Bundle bundle)
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, String s2, String as[], String s3, IBinder ibinder, 
            String s4, Bundle bundle)
        throws RemoteException;

    public abstract void a(ah ah, int i1, String s1, String as[], String s2, Bundle bundle)
        throws RemoteException;

    public abstract void a(ah ah, jj jj)
        throws RemoteException;

    public abstract void b(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void b(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void b(ah ah, int i1, String s1, String s2, String as[])
        throws RemoteException;

    public abstract void c(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void c(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void d(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void d(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void e(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void e(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void f(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void f(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void g(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void g(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void h(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void h(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void i(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void i(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void j(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void j(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void k(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void k(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void l(ah ah, int i1, String s1)
        throws RemoteException;

    public abstract void l(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void m(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void n(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void o(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void p(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void q(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void r(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void s(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;

    public abstract void t(ah ah, int i1, String s1, Bundle bundle)
        throws RemoteException;
}
