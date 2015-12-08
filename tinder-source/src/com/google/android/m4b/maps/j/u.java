// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

// Referenced classes of package com.google.android.m4b.maps.j:
//            y

public interface u
    extends IInterface
{
    public static abstract class a extends Binder
        implements u
    {

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
                parcel1.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
                break;
            }
            if (parcel.readInt() != 0)
            {
                parcel = (y)y.CREATOR.createFromParcel(parcel);
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
            attachInterface(this, "com.google.android.gms.common.internal.IResolveAccountCallbacks");
        }
    }

    public static final class a.a
        implements u
    {

        private IBinder a;

        public final void a(y y1)
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
            if (y1 == null)
            {
                break MISSING_BLOCK_LABEL_56;
            }
            parcel.writeInt(1);
            y1.writeToParcel(parcel, 0);
_L1:
            a.transact(2, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            y1;
            parcel1.recycle();
            parcel.recycle();
            throw y1;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract void a(y y);
}
