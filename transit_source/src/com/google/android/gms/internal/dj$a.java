// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            dj, di

public static abstract class a.dG extends Binder
    implements dj
{
    private static class a
        implements dj
    {

        private IBinder dG;

        public void a(di di1, int k)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null)
            {
                break MISSING_BLOCK_LABEL_66;
            }
            di1 = di1.asBinder();
_L1:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            dG.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            di1 = null;
              goto _L1
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
        }

        public void a(di di1, int k, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            di1 = di1.asBinder();
_L1:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            dG.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            di1 = null;
              goto _L1
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
        }

        public void a(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void a(di di1, int k, String s, String s1, String as[])
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            di1 = di1.asBinder();
_L1:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            dG.transact(10, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            di1 = null;
              goto _L1
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
        }

        public void a(di di1, int k, String s, String s1, String as[], String s2, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            parcel.writeString(s2);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void a(di di1, int k, String s, String s1, String as[], String s2, IBinder ibinder, 
                String s3, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            parcel.writeString(s1);
            parcel.writeStringArray(as);
            parcel.writeString(s2);
            parcel.writeStrongBinder(ibinder);
            parcel.writeString(s3);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(9, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public IBinder asBinder()
        {
            return dG;
        }

        public void b(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void c(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(6, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void d(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void e(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void f(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(11, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void g(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void h(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void i(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        public void j(di di1, int k, String s, Bundle bundle)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (di1 == null) goto _L2; else goto _L1
_L1:
            di1 = di1.asBinder();
_L5:
            parcel.writeStrongBinder(di1);
            parcel.writeInt(k);
            parcel.writeString(s);
            if (bundle == null) goto _L4; else goto _L3
_L3:
            parcel.writeInt(1);
            bundle.writeToParcel(parcel, 0);
_L6:
            dG.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            di1 = null;
              goto _L5
_L4:
            parcel.writeInt(0);
              goto _L6
            di1;
            parcel1.recycle();
            parcel.recycle();
            throw di1;
              goto _L5
        }

        a(IBinder ibinder)
        {
            dG = ibinder;
        }
    }


    public static dj w(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iinterface != null && (iinterface instanceof dj))
        {
            return (dj)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        throws RemoteException
    {
        Object obj1 = null;
        Object obj2 = null;
        String as[] = null;
        String s = null;
        IBinder ibinder = null;
        String s2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
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
            obj = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            obj2 = parcel.readString();
            as = parcel.createStringArray();
            s = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((di) (obj)), i, ((String) (obj1)), ((String) (obj2)), as, s, parcel);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(((di) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(v(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(v(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj2 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            as = parcel.readString();
            obj = obj1;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(((di) (obj2)), i, as, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            as = parcel.readString();
            obj = obj2;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            c(((di) (obj1)), i, as, ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            obj = as;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            d(((di) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            obj = s;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            e(((di) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj1 = parcel.readString();
            obj2 = parcel.readString();
            String as1[] = parcel.createStringArray();
            String s1 = parcel.readString();
            ibinder = parcel.readStrongBinder();
            s2 = parcel.readString();
            if (parcel.readInt() != 0)
            {
                parcel = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(((di) (obj)), i, ((String) (obj1)), ((String) (obj2)), as1, s1, ibinder, s2, parcel);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(v(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            obj = ibinder;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            f(((di) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            obj = s2;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            g(((di) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            obj = obj3;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            h(((di) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            obj = obj4;
            if (parcel.readInt() != 0)
            {
                obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            i(((di) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            obj1 = v(parcel.readStrongBinder());
            i = parcel.readInt();
            obj2 = parcel.readString();
            obj = obj5;
            break;
        }
        if (parcel.readInt() != 0)
        {
            obj = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        }
        j(((di) (obj1)), i, ((String) (obj2)), ((Bundle) (obj)));
        parcel1.writeNoException();
        return true;
    }
}
