// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.common.internal:
//            az, bb, ax, GetServiceRequest, 
//            ValidateAccountRequest

public abstract class ba extends Binder
    implements az
{

    public static az a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iinterface != null && (iinterface instanceof az))
        {
            return (az)iinterface;
        } else
        {
            return new bb(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        Object obj1 = null;
        Object obj2 = null;
        String as1[] = null;
        String s20 = null;
        IBinder ibinder1 = null;
        String s22 = null;
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
        Object obj = null;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            obj2 = parcel.readString();
            as1 = parcel.createStringArray();
            s20 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((aw) (obj)), i, ((String) (obj1)), ((String) (obj2)), as1, s20, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(((aw) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(ax.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj2 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            as1 = parcel.readString();
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(((aw) (obj2)), i, as1, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            as1 = parcel.readString();
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            c(((aw) (obj1)), i, as1, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s = parcel.readString();
            obj = as1;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            d(((aw) (obj1)), i, s, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s1 = parcel.readString();
            obj = s20;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            e(((aw) (obj1)), i, s1, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            String s2 = parcel.readString();
            String as2[] = parcel.createStringArray();
            String s21 = parcel.readString();
            ibinder1 = parcel.readStrongBinder();
            s22 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((aw) (obj)), i, ((String) (obj1)), s2, as2, s21, ibinder1, s22, parcel);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s3 = parcel.readString();
            obj = ibinder1;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            f(((aw) (obj1)), i, s3, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s4 = parcel.readString();
            obj = s22;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            g(((aw) (obj1)), i, s4, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s5 = parcel.readString();
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            h(((aw) (obj1)), i, s5, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s6 = parcel.readString();
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            i(((aw) (obj1)), i, s6, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s7 = parcel.readString();
            obj = obj5;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            j(((aw) (obj1)), i, s7, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s8 = parcel.readString();
            obj = obj6;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            k(((aw) (obj1)), i, s8, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s9 = parcel.readString();
            obj = obj7;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            l(((aw) (obj1)), i, s9, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s10 = parcel.readString();
            obj = obj8;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            m(((aw) (obj1)), i, s10, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            IBinder ibinder = parcel.readStrongBinder();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((aw) (obj)), i, ((String) (obj1)), ibinder, parcel);
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            String as[] = parcel.createStringArray();
            String s19 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((aw) (obj)), i, ((String) (obj1)), as, s19, parcel);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            b(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            c(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s11 = parcel.readString();
            obj = obj9;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            n(((aw) (obj1)), i, s11, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            d(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s12 = parcel.readString();
            obj = obj10;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            o(((aw) (obj1)), i, s12, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            e(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s13 = parcel.readString();
            obj = obj11;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            p(((aw) (obj1)), i, s13, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a();
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            String s14 = parcel.readString();
            String as3[] = parcel.createStringArray();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((aw) (obj)), i, ((String) (obj1)), s14, as3, parcel);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            f(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            g(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            h(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            i(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s15 = parcel.readString();
            obj = obj12;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            q(((aw) (obj1)), i, s15, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s16 = parcel.readString();
            obj = obj13;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            r(((aw) (obj1)), i, s16, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 40: // '('
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            j(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 41: // ')'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s17 = parcel.readString();
            obj = obj14;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            s(((aw) (obj1)), i, s17, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 42: // '*'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            k(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 43: // '+'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            i = parcel.readInt();
            String s18 = parcel.readString();
            obj = obj15;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            t(((aw) (obj1)), i, s18, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 44: // ','
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            l(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 45: // '-'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            m(ax.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 46: // '.'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            obj = obj16;
            if (parcel.readInt() != 0)
            {
                obj = (GetServiceRequest)GetServiceRequest.CREATOR.createFromParcel(parcel);
            }
            a(((aw) (obj1)), ((GetServiceRequest) (obj)));
            parcel1.writeNoException();
            return true;

        case 47: // '/'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = ax.a(parcel.readStrongBinder());
            obj = obj17;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (ValidateAccountRequest)ValidateAccountRequest.CREATOR.createFromParcel(parcel);
        }
        a(((aw) (obj1)), ((ValidateAccountRequest) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
