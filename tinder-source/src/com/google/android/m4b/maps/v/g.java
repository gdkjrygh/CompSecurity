// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.v;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.m4b.maps.g.a;
import com.google.android.m4b.maps.h.q;

// Referenced classes of package com.google.android.m4b.maps.v:
//            a

public interface g
    extends IInterface
{
    public static abstract class a extends Binder
        implements g
    {

        public static g a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (iinterface != null && (iinterface instanceof g))
            {
                return (g)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
        {
            switch (i)
            {
            default:
                return super.onTransact(i, parcel, parcel1, j);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.signin.internal.ISignInCallbacks");
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                com.google.android.m4b.maps.g.a a1;
                if (parcel.readInt() != 0)
                {
                    a1 = (com.google.android.m4b.maps.g.a)com.google.android.m4b.maps.g.a.CREATOR.createFromParcel(parcel);
                } else
                {
                    a1 = null;
                }
                if (parcel.readInt() != 0)
                {
                    parcel = (com.google.android.m4b.maps.v.a)com.google.android.m4b.maps.v.a.CREATOR.createFromParcel(parcel);
                } else
                {
                    parcel = null;
                }
                a(a1, parcel);
                parcel1.writeNoException();
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.signin.internal.ISignInCallbacks");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (q)q.CREATOR.createFromParcel(parcel);
            } else
            {
                parcel = null;
            }
            a(parcel);
            parcel1.writeNoException();
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        }
    }

    static final class a.a
        implements g
    {

        private IBinder a;

        public final void a(com.google.android.m4b.maps.g.a a1, com.google.android.m4b.maps.v.a a2)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (a1 == null) goto _L2; else goto _L1
_L1:
            parcel.writeInt(1);
            a1.writeToParcel(parcel, 0);
_L3:
            if (a2 == null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            parcel.writeInt(1);
            a2.writeToParcel(parcel, 0);
_L4:
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
_L2:
            parcel.writeInt(0);
              goto _L3
            a1;
            parcel1.recycle();
            parcel.recycle();
            throw a1;
            parcel.writeInt(0);
              goto _L4
        }

        public final void a(q q1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.signin.internal.ISignInCallbacks");
            if (q1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            q1.writeToParcel(parcel, 0);
_L1:
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            q1;
            parcel1.recycle();
            parcel.recycle();
            throw q1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(com.google.android.m4b.maps.g.a a1, com.google.android.m4b.maps.v.a a2);

    public abstract void a(q q);
}
