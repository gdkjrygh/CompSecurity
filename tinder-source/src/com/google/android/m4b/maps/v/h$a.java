// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.m4b.maps.j.b;
import com.google.android.m4b.maps.j.q;
import com.google.android.m4b.maps.j.u;
import com.google.android.m4b.maps.j.w;

// Referenced classes of package com.google.android.m4b.maps.v:
//            h, d, g

public static abstract class a.a extends Binder
    implements h
{
    static final class a
        implements h
    {

        private IBinder a;

        public final void a(int i)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            parcel.writeInt(i);
            a.transact(7, parcel, parcel1, 0);
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

        public final void a(int i, Account account, g g1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            parcel.writeInt(i);
            if (account == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            account.writeToParcel(parcel, 0);
_L3:
            if (g1 == null)
            {
                break MISSING_BLOCK_LABEL_112;
            }
            account = g1.asBinder();
_L4:
            parcel.writeStrongBinder(account);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            account;
            parcel1.recycle();
            parcel.recycle();
            throw account;
            account = null;
              goto _L4
        }

        public final void a(b b1, g g1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (b1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            b1.writeToParcel(parcel, 0);
_L3:
            if (g1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            b1 = g1.asBinder();
_L4:
            parcel.writeStrongBinder(b1);
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            b1;
            parcel1.recycle();
            parcel.recycle();
            throw b1;
            b1 = null;
              goto _L4
        }

        public final void a(q q1, int i, boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag1;
            flag1 = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (q1 == null)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            q1 = q1.asBinder();
_L1:
            parcel.writeStrongBinder(q1);
            parcel.writeInt(i);
            i = ((flag1) ? 1 : 0);
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            a.transact(9, parcel, parcel1, 0);
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

        public final void a(w w1, u u1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (w1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            w1.writeToParcel(parcel, 0);
_L3:
            if (u1 == null)
            {
                break MISSING_BLOCK_LABEL_96;
            }
            w1 = u1.asBinder();
_L4:
            parcel.writeStrongBinder(w1);
            a.transact(5, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
            w1 = null;
              goto _L4
        }

        public final void a(d d1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (d1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            d1.writeToParcel(parcel, 0);
_L1:
            a.transact(3, parcel, parcel1, 0);
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

        public final void a(boolean flag)
        {
            Parcel parcel;
            Parcel parcel1;
            int i;
            i = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInService");
            if (flag)
            {
                i = 1;
            }
            parcel.writeInt(i);
            a.transact(4, parcel, parcel1, 0);
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

        public final IBinder asBinder()
        {
            return a;
        }

        a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public static h a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (iinterface != null && (iinterface instanceof h))
        {
            return (h)iinterface;
        } else
        {
            return new a(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag1 = false;
        boolean flag = false;
        Object obj = null;
        q q;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.signin.internal.ISignInService");
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            b b1;
            if (parcel.readInt() != 0)
            {
                b1 = (b)b.CREATOR.createFromParcel(parcel);
            } else
            {
                b1 = null;
            }
            a(b1, a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            if (parcel.readInt() != 0)
            {
                parcel = (d)d.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            if (parcel.readInt() != 0)
            {
                flag = true;
            }
            a(flag);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            w w1;
            if (parcel.readInt() != 0)
            {
                w1 = (w)w.CREATOR.createFromParcel(parcel);
            } else
            {
                w1 = null;
            }
            parcel = parcel.readStrongBinder();
            if (parcel == null)
            {
                parcel = obj;
            } else
            {
                android.os.IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                if (iinterface != null && (iinterface instanceof u))
                {
                    parcel = (u)iinterface;
                } else
                {
                    parcel = new com.google.android.m4b.maps.j.a(parcel);
                }
            }
            a(w1, parcel);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            i = parcel.readInt();
            Account account;
            if (parcel.readInt() != 0)
            {
                account = (Account)Account.CREATOR.createFromParcel(parcel);
            } else
            {
                account = null;
            }
            a(i, account, a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInService");
            q = com.google.android.m4b.maps.j.a(parcel.readStrongBinder());
            i = parcel.readInt();
            flag = flag1;
            break;
        }
        if (parcel.readInt() != 0)
        {
            flag = true;
        }
        a(q, i, flag);
        parcel1.writeNoException();
        return true;
    }
}
